package com.google.crypto.tink.subtle;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class EciesAeadHkdfHybridEncrypt implements HybridEncrypt {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f47444f = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EciesHkdfSenderKem f47445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f47447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EllipticCurves.PointFormatType f47448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EciesAeadHkdfDemHelper f47449e;

    public EciesAeadHkdfHybridEncrypt(ECPublicKey eCPublicKey, byte[] bArr, String str, EllipticCurves.PointFormatType pointFormatType, EciesAeadHkdfDemHelper eciesAeadHkdfDemHelper) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f47445a = new EciesHkdfSenderKem(eCPublicKey);
        this.f47447c = bArr;
        this.f47446b = str;
        this.f47448d = pointFormatType;
        this.f47449e = eciesAeadHkdfDemHelper;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        EciesHkdfSenderKem eciesHkdfSenderKem = this.f47445a;
        String str = this.f47446b;
        byte[] bArr3 = this.f47447c;
        EciesAeadHkdfDemHelper eciesAeadHkdfDemHelper = this.f47449e;
        EciesHkdfSenderKem.KemKey kemKeyGenerateKey = eciesHkdfSenderKem.generateKey(str, bArr3, bArr2, eciesAeadHkdfDemHelper.getSymmetricKeySizeInBytes(), this.f47448d);
        byte[] bArrEncrypt = eciesAeadHkdfDemHelper.getAeadOrDaead(kemKeyGenerateKey.getSymmetricKey()).encrypt(bArr, f47444f);
        byte[] kemBytes = kemKeyGenerateKey.getKemBytes();
        return ByteBuffer.allocate(kemBytes.length + bArrEncrypt.length).put(kemBytes).put(bArrEncrypt).array();
    }
}
