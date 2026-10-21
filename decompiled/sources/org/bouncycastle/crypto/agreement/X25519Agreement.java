package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class X25519Agreement implements RawAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X25519PrivateKeyParameters f87901a;

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i10) {
        this.f87901a.generateSecret((X25519PublicKeyParameters) cipherParameters, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87901a = (X25519PrivateKeyParameters) cipherParameters;
    }
}
