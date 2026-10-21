package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

/* JADX INFO: loaded from: classes8.dex */
public class X509StoreLDAPCertPairs extends X509StoreSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LDAPStoreHelper f90475a;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        if (!(selector instanceof X509CertPairStoreSelector)) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f90475a.getCrossCertificatePairs((X509CertPairStoreSelector) selector));
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.e.e(X509LDAPCertStoreParameters.class, new StringBuilder("Initialization parameters must be an instance of "), Constant.DOT_STRING));
        }
        this.f90475a = new LDAPStoreHelper((X509LDAPCertStoreParameters) x509StoreParameters);
    }
}
