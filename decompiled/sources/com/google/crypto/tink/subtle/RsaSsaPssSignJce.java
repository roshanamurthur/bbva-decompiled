package com.google.crypto.tink.subtle;

import androidx.appcompat.widget.a;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RsaSsaPssSignJce implements PublicKeySign {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f47491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RSAPublicKey f47492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enums.HashType f47493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enums.HashType f47494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47495e;

    public RsaSsaPssSignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType, Enums.HashType hashType2, int i10) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.f47491a = rSAPrivateCrtKey;
        this.f47492b = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f47493c = hashType;
        this.f47494d = hashType2;
        this.f47495e = i10;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f47492b;
        int iBitLength = rSAPublicKey.getModulus().bitLength();
        int i10 = iBitLength - 1;
        Enums.HashType hashType = this.f47493c;
        Validators.validateSignatureHash(hashType);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(hashType));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int iA = a.a(iBitLength, 2, 8, 1);
        int i11 = this.f47495e;
        if (iA < digestLength + i11 + 2) {
            throw new GeneralSecurityException("encoding error");
        }
        byte[] bArrRandBytes = Random.randBytes(i11);
        int i12 = digestLength + 8;
        byte[] bArr2 = new byte[i12 + i11];
        System.arraycopy(bArrDigest, 0, bArr2, 8, digestLength);
        System.arraycopy(bArrRandBytes, 0, bArr2, i12, bArrRandBytes.length);
        byte[] bArrDigest2 = engineFactory.digest(bArr2);
        int i13 = (iA - digestLength) - 1;
        byte[] bArr3 = new byte[i13];
        int i14 = (iA - i11) - digestLength;
        bArr3[i14 - 2] = 1;
        System.arraycopy(bArrRandBytes, 0, bArr3, i14 - 1, bArrRandBytes.length);
        byte[] bArrMgf1 = SubtleUtil.mgf1(bArrDigest2, i13, this.f47494d);
        byte[] bArr4 = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr4[i15] = (byte) (bArr3[i15] ^ bArrMgf1[i15]);
        }
        for (int i16 = 0; i16 < (((long) iA) * 8) - ((long) i10); i16++) {
            int i17 = i16 / 8;
            bArr4[i17] = (byte) ((~(1 << (7 - (i16 % 8)))) & bArr4[i17]);
        }
        int i18 = digestLength + i13;
        byte[] bArr5 = new byte[i18 + 1];
        System.arraycopy(bArr4, 0, bArr5, 0, i13);
        System.arraycopy(bArrDigest2, 0, bArr5, i13, bArrDigest2.length);
        bArr5[i18] = -68;
        EngineFactory<EngineWrapper.TCipher, Cipher> engineFactory2 = EngineFactory.CIPHER;
        Cipher engineFactory3 = engineFactory2.getInstance("RSA/ECB/NOPADDING");
        engineFactory3.init(2, this.f47491a);
        byte[] bArrDoFinal = engineFactory3.doFinal(bArr5);
        Cipher engineFactory4 = engineFactory2.getInstance("RSA/ECB/NOPADDING");
        engineFactory4.init(1, rSAPublicKey);
        if (new BigInteger(1, bArr5).equals(new BigInteger(1, engineFactory4.doFinal(bArrDoFinal)))) {
            return bArrDoFinal;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
