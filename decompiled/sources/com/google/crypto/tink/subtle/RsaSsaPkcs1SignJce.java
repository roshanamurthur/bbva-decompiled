package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RsaSsaPkcs1SignJce implements PublicKeySign {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f47485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RSAPublicKey f47486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47487c;

    public RsaSsaPkcs1SignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.f47485a = rSAPrivateCrtKey;
        this.f47487c = SubtleUtil.toRsaSsaPkcs1Algo(hashType);
        this.f47486b = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        EngineFactory<EngineWrapper.TSignature, Signature> engineFactory = EngineFactory.SIGNATURE;
        String str = this.f47487c;
        Signature engineFactory2 = engineFactory.getInstance(str);
        engineFactory2.initSign(this.f47485a);
        engineFactory2.update(bArr);
        byte[] bArrSign = engineFactory2.sign();
        Signature engineFactory3 = engineFactory.getInstance(str);
        engineFactory3.initVerify(this.f47486b);
        engineFactory3.update(bArr);
        if (engineFactory3.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
