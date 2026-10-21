package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class EcdsaVerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f47434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EllipticCurves.EcdsaEncoding f47436c;

    public EcdsaVerifyJce(ECPublicKey eCPublicKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f47435b = SubtleUtil.toEcdsaAlgo(hashType);
        this.f47434a = eCPublicKey;
        this.f47436c = ecdsaEncoding;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        EllipticCurves.EcdsaEncoding ecdsaEncoding = this.f47436c;
        EllipticCurves.EcdsaEncoding ecdsaEncoding2 = EllipticCurves.EcdsaEncoding.IEEE_P1363;
        ECPublicKey eCPublicKey = this.f47434a;
        if (ecdsaEncoding == ecdsaEncoding2) {
            if (bArr.length != EllipticCurves.fieldSizeInBytes(eCPublicKey.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = EllipticCurves.ecdsaIeee2Der(bArr);
        }
        if (!EllipticCurves.isValidDerEncoding(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureA = EngineFactory.SIGNATURE.f47464a.a(this.f47435b, EngineFactory.toProviderList(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"));
        signatureA.initVerify(eCPublicKey);
        signatureA.update(bArr2);
        try {
            if (signatureA.verify(bArr)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
