package org.bouncycastle.x509;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public static HashSet a(List list, X509CRLStoreSelector x509CRLStoreSelector) throws AnnotatedException {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z10 = false;
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                    z10 = true;
                } catch (StoreException e5) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e5);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                    z10 = true;
                } catch (CertStoreException e7) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e7);
                    annotatedException2 = annotatedException;
                }
            }
        }
        if (z10 || annotatedException2 == null) {
            return hashSet;
        }
        throw annotatedException2;
    }

    public static HashSet b(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(a(pKIXParameters.getCertStores(), x509CRLStoreSelector));
            return hashSet;
        } catch (AnnotatedException e5) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e5);
        }
    }
}
