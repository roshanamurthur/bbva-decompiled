package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RsaSsaPkcs1VerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f47488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enums.HashType f47489b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47490a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f47490a = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47490a[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47490a[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public RsaSsaPkcs1VerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.f47488a = rSAPublicKey;
        this.f47489b = hashType;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrDecode;
        RSAPublicKey rSAPublicKey = this.f47488a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrInteger2Bytes = SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength);
        Enums.HashType hashType = this.f47489b;
        Validators.validateSignatureHash(hashType);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(hashType));
        engineFactory.update(bArr2);
        byte[] bArrDigest = engineFactory.digest();
        int i10 = a.f47490a[hashType.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            bArrDecode = Hex.decode("3031300d060960864801650304020105000420");
        } else if (i10 == 2) {
            bArrDecode = Hex.decode("3041300d060960864801650304020205000430");
        } else {
            if (i10 != 3) {
                throw new GeneralSecurityException("Unsupported hash " + hashType);
            }
            bArrDecode = Hex.decode("3051300d060960864801650304020305000440");
        }
        int length = bArrDecode.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr3 = new byte[iBitLength];
        bArr3[0] = 0;
        bArr3[1] = 1;
        int i12 = 0;
        while (i12 < (iBitLength - length) - 3) {
            bArr3[i11] = -1;
            i12++;
            i11++;
        }
        int i13 = i11 + 1;
        bArr3[i11] = 0;
        System.arraycopy(bArrDecode, 0, bArr3, i13, bArrDecode.length);
        System.arraycopy(bArrDigest, 0, bArr3, i13 + bArrDecode.length, bArrDigest.length);
        if (!Bytes.equal(bArrInteger2Bytes, bArr3)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }
}
