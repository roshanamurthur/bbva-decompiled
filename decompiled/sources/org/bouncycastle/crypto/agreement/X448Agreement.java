package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class X448Agreement implements RawAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X448PrivateKeyParameters f87902a;

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i10) {
        this.f87902a.generateSecret((X448PublicKeyParameters) cipherParameters, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return 56;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87902a = (X448PrivateKeyParameters) cipherParameters;
    }
}
