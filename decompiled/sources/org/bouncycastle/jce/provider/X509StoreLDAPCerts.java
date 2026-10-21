package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

/* JADX INFO: loaded from: classes8.dex */
public class X509StoreLDAPCerts extends X509StoreSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LDAPStoreHelper f90476a;

    public final HashSet a(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        X509CertPairStoreSelector x509CertPairStoreSelector = new X509CertPairStoreSelector();
        x509CertPairStoreSelector.setForwardSelector(x509CertStoreSelector);
        x509CertPairStoreSelector.setReverseSelector(new X509CertStoreSelector());
        HashSet<X509CertificatePair> hashSet2 = new HashSet(this.f90476a.getCrossCertificatePairs(x509CertPairStoreSelector));
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (X509CertificatePair x509CertificatePair : hashSet2) {
            if (x509CertificatePair.getForward() != null) {
                hashSet3.add(x509CertificatePair.getForward());
            }
            if (x509CertificatePair.getReverse() != null) {
                hashSet4.add(x509CertificatePair.getReverse());
            }
        }
        hashSet.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        Collection userCertificates;
        if (!(selector instanceof X509CertStoreSelector)) {
            return Collections.EMPTY_SET;
        }
        X509CertStoreSelector x509CertStoreSelector = (X509CertStoreSelector) selector;
        HashSet hashSet = new HashSet();
        if (x509CertStoreSelector.getBasicConstraints() > 0) {
            hashSet.addAll(this.f90476a.getCACertificates(x509CertStoreSelector));
            userCertificates = a(x509CertStoreSelector);
        } else if (x509CertStoreSelector.getBasicConstraints() == -2) {
            userCertificates = this.f90476a.getUserCertificates(x509CertStoreSelector);
        } else {
            hashSet.addAll(this.f90476a.getUserCertificates(x509CertStoreSelector));
            hashSet.addAll(this.f90476a.getCACertificates(x509CertStoreSelector));
            userCertificates = a(x509CertStoreSelector);
        }
        hashSet.addAll(userCertificates);
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.e.e(X509LDAPCertStoreParameters.class, new StringBuilder("Initialization parameters must be an instance of "), Constant.DOT_STRING));
        }
        this.f90476a = new LDAPStoreHelper((X509LDAPCertStoreParameters) x509StoreParameters);
    }
}
