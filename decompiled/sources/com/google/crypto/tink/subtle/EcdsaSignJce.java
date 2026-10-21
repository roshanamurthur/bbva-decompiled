package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class EcdsaSignJce implements PublicKeySign {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f47431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EllipticCurves.EcdsaEncoding f47433c;

    public EcdsaSignJce(ECPrivateKey eCPrivateKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f47431a = eCPrivateKey;
        this.f47432b = SubtleUtil.toEcdsaAlgo(hashType);
        this.f47433c = ecdsaEncoding;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        Signature signatureA = EngineFactory.SIGNATURE.f47464a.a(this.f47432b, EngineFactory.toProviderList(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"));
        ECPrivateKey eCPrivateKey = this.f47431a;
        signatureA.initSign(eCPrivateKey);
        signatureA.update(bArr);
        byte[] bArrSign = signatureA.sign();
        return this.f47433c == EllipticCurves.EcdsaEncoding.IEEE_P1363 ? EllipticCurves.ecdsaDer2Ieee(bArrSign, EllipticCurves.fieldSizeInBytes(eCPrivateKey.getParams().getCurve()) * 2) : bArrSign;
    }
}
