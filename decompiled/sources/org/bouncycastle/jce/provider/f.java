package org.bouncycastle.jce.provider;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static HashSet a(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) throws AnnotatedException {
        X509Certificate certificateChecking;
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(b(pKIXCRLStoreSelector, list2));
            hashSet.addAll(b(pKIXCRLStoreSelector, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date) && ((certificateChecking = pKIXCRLStoreSelector.getCertificateChecking()) == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter()))) {
                    hashSet2.add(x509crl);
                }
            }
            return hashSet2;
        } catch (AnnotatedException e5) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e5);
        }
    }

    public static HashSet b(PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z10 = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                    z10 = true;
                } catch (StoreException e5) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e5);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
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
}
