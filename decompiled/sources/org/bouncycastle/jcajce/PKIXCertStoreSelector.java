package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes6.dex */
public class PKIXCertStoreSelector<T extends Certificate> implements Selector<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CertSelector f89707p0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CertSelector f89708a;

        public Builder(CertSelector certSelector) {
            this.f89708a = (CertSelector) certSelector.clone();
        }

        public PKIXCertStoreSelector<? extends Certificate> build() {
            return new PKIXCertStoreSelector<>(this.f89708a);
        }
    }

    public static class a extends X509CertSelector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final PKIXCertStoreSelector f89709p0;

        public a(PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.f89709p0 = pKIXCertStoreSelector;
            CertSelector certSelector = pKIXCertStoreSelector.f89707p0;
            if (certSelector instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e5) {
                    throw new IllegalStateException(androidx.camera.core.impl.a.d(e5, new StringBuilder("base selector invalid: ")), e5);
                }
            }
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public final boolean match(Certificate certificate) {
            PKIXCertStoreSelector pKIXCertStoreSelector = this.f89709p0;
            if (pKIXCertStoreSelector == null) {
                return certificate != null;
            }
            return pKIXCertStoreSelector.match(certificate);
        }
    }

    public PKIXCertStoreSelector(CertSelector certSelector) {
        this.f89707p0 = certSelector;
    }

    public static Collection<? extends Certificate> getCertificates(PKIXCertStoreSelector pKIXCertStoreSelector, CertStore certStore) throws CertStoreException {
        return certStore.getCertificates(new a(pKIXCertStoreSelector));
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return new PKIXCertStoreSelector(this.f89707p0);
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Certificate certificate) {
        return this.f89707p0.match(certificate);
    }
}
