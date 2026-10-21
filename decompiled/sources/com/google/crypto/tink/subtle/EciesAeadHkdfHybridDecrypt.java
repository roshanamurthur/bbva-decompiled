package com.google.crypto.tink.subtle;

import com.google.crypto.tink.HybridDecrypt;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class EciesAeadHkdfHybridDecrypt implements HybridDecrypt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f47437g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f47438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EciesHkdfRecipientKem f47439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f47441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EllipticCurves.PointFormatType f47442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EciesAeadHkdfDemHelper f47443f;

    public EciesAeadHkdfHybridDecrypt(ECPrivateKey eCPrivateKey, byte[] bArr, String str, EllipticCurves.PointFormatType pointFormatType, EciesAeadHkdfDemHelper eciesAeadHkdfDemHelper) throws GeneralSecurityException {
        this.f47438a = eCPrivateKey;
        this.f47439b = new EciesHkdfRecipientKem(eCPrivateKey);
        this.f47441d = bArr;
        this.f47440c = str;
        this.f47442e = pointFormatType;
        this.f47443f = eciesAeadHkdfDemHelper;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int iEncodingSizeInBytes = EllipticCurves.encodingSizeInBytes(this.f47438a.getParams().getCurve(), this.f47442e);
        if (bArr.length < iEncodingSizeInBytes) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iEncodingSizeInBytes);
        EciesHkdfRecipientKem eciesHkdfRecipientKem = this.f47439b;
        String str = this.f47440c;
        byte[] bArr3 = this.f47441d;
        EciesAeadHkdfDemHelper eciesAeadHkdfDemHelper = this.f47443f;
        return eciesAeadHkdfDemHelper.getAeadOrDaead(eciesHkdfRecipientKem.generateKey(bArrCopyOfRange, str, bArr3, bArr2, eciesAeadHkdfDemHelper.getSymmetricKeySizeInBytes(), this.f47442e)).decrypt(Arrays.copyOfRange(bArr, iEncodingSizeInBytes, bArr.length), f47437g);
    }
}
