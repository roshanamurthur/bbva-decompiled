package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class EciesHkdfRecipientKem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f47450a;

    public EciesHkdfRecipientKem(ECPrivateKey eCPrivateKey) {
        this.f47450a = eCPrivateKey;
    }

    public byte[] generateKey(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, EllipticCurves.PointFormatType pointFormatType) throws GeneralSecurityException {
        ECPrivateKey eCPrivateKey = this.f47450a;
        return Hkdf.computeEciesHkdfSymmetricKey(bArr, EllipticCurves.computeSharedSecret(eCPrivateKey, EllipticCurves.getEcPublicKey(eCPrivateKey.getParams(), pointFormatType, bArr)), str, bArr2, bArr3, i10);
    }
}
