package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.XDHUPrivateParameters;
import org.bouncycastle.crypto.params.XDHUPublicParameters;

/* JADX INFO: loaded from: classes2.dex */
public class XDHUnifiedAgreement implements RawAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RawAgreement f87903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XDHUPrivateParameters f87904b;

    public XDHUnifiedAgreement(RawAgreement rawAgreement) {
        this.f87903a = rawAgreement;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i10) {
        XDHUPublicParameters xDHUPublicParameters = (XDHUPublicParameters) cipherParameters;
        AsymmetricKeyParameter ephemeralPrivateKey = this.f87904b.getEphemeralPrivateKey();
        RawAgreement rawAgreement = this.f87903a;
        rawAgreement.init(ephemeralPrivateKey);
        rawAgreement.calculateAgreement(xDHUPublicParameters.getEphemeralPublicKey(), bArr, i10);
        rawAgreement.init(this.f87904b.getStaticPrivateKey());
        rawAgreement.calculateAgreement(xDHUPublicParameters.getStaticPublicKey(), bArr, rawAgreement.getAgreementSize() + i10);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return this.f87903a.getAgreementSize() * 2;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87904b = (XDHUPrivateParameters) cipherParameters;
    }
}
