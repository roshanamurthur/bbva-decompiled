package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f47496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enums.HashType f47497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enums.HashType f47498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47499d;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i10) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.f47496a = rSAPublicKey;
        this.f47497b = hashType;
        this.f47498c = hashType2;
        this.f47499d = i10;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f47496a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrInteger2Bytes = SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength2);
        int iBitLength3 = modulus.bitLength() - 1;
        Enums.HashType hashType = this.f47497b;
        Validators.validateSignatureHash(hashType);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(hashType));
        byte[] bArrDigest = engineFactory.digest(bArr2);
        int digestLength = engineFactory.getDigestLength();
        int length = bArrInteger2Bytes.length;
        int i10 = this.f47499d;
        if (length < digestLength + i10 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrInteger2Bytes[bArrInteger2Bytes.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i11 = length - digestLength;
        int i12 = i11 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrInteger2Bytes, i12);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrInteger2Bytes, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i13 = 0;
        while (true) {
            int i14 = i13;
            byte[] bArr3 = bArrDigest;
            int i15 = digestLength;
            long j10 = (((long) length) * 8) - ((long) iBitLength3);
            if (i13 < j10) {
                if (((bArrCopyOf[i14 / 8] >> (7 - (i14 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i13 = i14 + 1;
                bArrDigest = bArr3;
                digestLength = i15;
            } else {
                byte[] bArrMgf1 = SubtleUtil.mgf1(bArrCopyOfRange, i12, this.f47498c);
                int length2 = bArrMgf1.length;
                byte[] bArr4 = new byte[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    bArr4[i16] = (byte) (bArrMgf1[i16] ^ bArrCopyOf[i16]);
                }
                for (int i17 = 0; i17 <= j10; i17++) {
                    int i18 = i17 / 8;
                    bArr4[i18] = (byte) ((~(1 << (7 - (i17 % 8)))) & bArr4[i18]);
                }
                int i19 = 0;
                while (true) {
                    int i20 = (i11 - i10) - 2;
                    if (i19 >= i20) {
                        if (bArr4[i20] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i10, length2);
                        int i21 = i15 + 8;
                        byte[] bArr5 = new byte[i10 + i21];
                        System.arraycopy(bArr3, 0, bArr5, 8, bArr3.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr5, i21, bArrCopyOfRange2.length);
                        if (!Bytes.equal(engineFactory.digest(bArr5), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr4[i19] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i19++;
                }
            }
        }
    }
}
