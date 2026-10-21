package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class PrfMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Prf f47478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47479b;

    public PrfMac(Prf prf, int i10) throws GeneralSecurityException {
        this.f47478a = prf;
        this.f47479b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        prf.compute(new byte[0], i10);
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] bArr) throws GeneralSecurityException {
        return this.f47478a.compute(bArr, this.f47479b);
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
