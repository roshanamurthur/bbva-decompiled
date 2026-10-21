package org.bouncycastle.x509;

import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes13.dex */
public class X509CertPairStoreSelector implements Selector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public X509CertStoreSelector f91715p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public X509CertStoreSelector f91716q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public X509CertificatePair f91717r0;

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        X509CertPairStoreSelector x509CertPairStoreSelector = new X509CertPairStoreSelector();
        x509CertPairStoreSelector.f91717r0 = this.f91717r0;
        X509CertStoreSelector x509CertStoreSelector = this.f91715p0;
        if (x509CertStoreSelector != null) {
            x509CertPairStoreSelector.setForwardSelector((X509CertStoreSelector) x509CertStoreSelector.clone());
        }
        X509CertStoreSelector x509CertStoreSelector2 = this.f91716q0;
        if (x509CertStoreSelector2 != null) {
            x509CertPairStoreSelector.setReverseSelector((X509CertStoreSelector) x509CertStoreSelector2.clone());
        }
        return x509CertPairStoreSelector;
    }

    public X509CertificatePair getCertPair() {
        return this.f91717r0;
    }

    public X509CertStoreSelector getForwardSelector() {
        return this.f91715p0;
    }

    public X509CertStoreSelector getReverseSelector() {
        return this.f91716q0;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        try {
            if (!(obj instanceof X509CertificatePair)) {
                return false;
            }
            X509CertificatePair x509CertificatePair = (X509CertificatePair) obj;
            X509CertStoreSelector x509CertStoreSelector = this.f91715p0;
            if (x509CertStoreSelector != null && !x509CertStoreSelector.match((Object) x509CertificatePair.getForward())) {
                return false;
            }
            X509CertStoreSelector x509CertStoreSelector2 = this.f91716q0;
            if (x509CertStoreSelector2 != null && !x509CertStoreSelector2.match((Object) x509CertificatePair.getReverse())) {
                return false;
            }
            X509CertificatePair x509CertificatePair2 = this.f91717r0;
            if (x509CertificatePair2 != null) {
                return x509CertificatePair2.equals(obj);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setCertPair(X509CertificatePair x509CertificatePair) {
        this.f91717r0 = x509CertificatePair;
    }

    public void setForwardSelector(X509CertStoreSelector x509CertStoreSelector) {
        this.f91715p0 = x509CertStoreSelector;
    }

    public void setReverseSelector(X509CertStoreSelector x509CertStoreSelector) {
        this.f91716q0 = x509CertStoreSelector;
    }
}
