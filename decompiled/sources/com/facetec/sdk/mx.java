package com.facetec.sdk;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes9.dex */
public final class mx extends mz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nc f42644a;

    public mx(nc ncVar) {
        this.f42644a = ncVar;
    }

    @Override // com.facetec.sdk.mz
    public final List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            X509Certificate x509Certificate2 = (X509Certificate) androidx.appcompat.view.menu.b.b(arrayList, 1);
            X509Certificate x509CertificateA = this.f42644a.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (a(x509CertificateA, x509CertificateA)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (z10) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate2)));
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof mx) && ((mx) obj).f42644a.equals(this.f42644a);
    }

    public final int hashCode() {
        return this.f42644a.hashCode();
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
