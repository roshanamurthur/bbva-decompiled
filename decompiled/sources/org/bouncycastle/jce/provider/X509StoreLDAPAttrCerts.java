package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

/* JADX INFO: loaded from: classes8.dex */
public class X509StoreLDAPAttrCerts extends X509StoreSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LDAPStoreHelper f90473a;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        if (!(selector instanceof X509AttributeCertStoreSelector)) {
            return Collections.EMPTY_SET;
        }
        X509AttributeCertStoreSelector x509AttributeCertStoreSelector = (X509AttributeCertStoreSelector) selector;
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f90473a.getAACertificates(x509AttributeCertStoreSelector));
        hashSet.addAll(this.f90473a.getAttributeCertificateAttributes(x509AttributeCertStoreSelector));
        hashSet.addAll(this.f90473a.getAttributeDescriptorCertificates(x509AttributeCertStoreSelector));
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.e.e(X509LDAPCertStoreParameters.class, new StringBuilder("Initialization parameters must be an instance of "), Constant.DOT_STRING));
        }
        this.f90473a = new LDAPStoreHelper((X509LDAPCertStoreParameters) x509StoreParameters);
    }
}
