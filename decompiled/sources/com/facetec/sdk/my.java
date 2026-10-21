package com.facetec.sdk;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes9.dex */
public final class my implements nc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<X500Principal, Set<X509Certificate>> f42645c = new LinkedHashMap();

    public my(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f42645c.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f42645c.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.facetec.sdk.nc
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f42645c.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof my) && ((my) obj).f42645c.equals(this.f42645c);
    }

    public final int hashCode() {
        return this.f42645c.hashCode();
    }
}
