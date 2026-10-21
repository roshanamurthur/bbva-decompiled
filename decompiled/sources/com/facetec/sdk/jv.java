package com.facetec.sdk;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes9.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jv f41912a = new b().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<c> f41913b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final mz f41914d;

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f41915c = new ArrayList();

        public final jv a() {
            return new jv(new LinkedHashSet(this.f41915c), null);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nj f41916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f41917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f41918c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f41919e;

        public c(String str, String str2) {
            String strI;
            this.f41919e = str;
            if (str.startsWith("*.")) {
                StringBuilder sb2 = new StringBuilder("http://");
                sb2.append(str.substring(2));
                strI = kk.e(sb2.toString()).i();
            } else {
                strI = kk.e("http://".concat(str)).i();
            }
            this.f41917b = strI;
            if (str2.startsWith("sha1/")) {
                this.f41918c = "sha1/";
                this.f41916a = nj.a(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                }
                this.f41918c = "sha256/";
                this.f41916a = nj.a(str2.substring(7));
            }
            if (this.f41916a == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(str2));
            }
        }

        public final boolean e(String str) {
            if (!this.f41919e.startsWith("*.")) {
                return str.equals(this.f41917b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f41917b.length()) {
                return false;
            }
            String str2 = this.f41917b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f41919e.equals(cVar.f41919e) && this.f41918c.equals(cVar.f41918c) && this.f41916a.equals(cVar.f41916a);
        }

        public final int hashCode() {
            return this.f41916a.hashCode() + ((this.f41918c.hashCode() + ((this.f41919e.hashCode() + 527) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f41918c);
            sb2.append(this.f41916a.a());
            return sb2.toString();
        }
    }

    public jv(Set<c> set, @Nullable mz mzVar) {
        this.f41913b = set;
        this.f41914d = mzVar;
    }

    private static nj d(X509Certificate x509Certificate) {
        return nj.e(x509Certificate.getPublicKey().getEncoded()).c();
    }

    public static String e(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb2 = new StringBuilder("sha256/");
        sb2.append(d((X509Certificate) certificate).a());
        return sb2.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return kz.d(this.f41914d, jvVar.f41914d) && this.f41913b.equals(jvVar.f41913b);
    }

    public final int hashCode() {
        mz mzVar = this.f41914d;
        return this.f41913b.hashCode() + ((mzVar != null ? mzVar.hashCode() : 0) * 31);
    }

    public final void e(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List listEmptyList = Collections.emptyList();
        for (c cVar : this.f41913b) {
            if (cVar.e(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(cVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        mz mzVar = this.f41914d;
        if (mzVar != null) {
            list = mzVar.a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = listEmptyList.size();
            nj njVarD = null;
            nj njVarE = null;
            for (int i11 = 0; i11 < size2; i11++) {
                c cVar2 = (c) listEmptyList.get(i11);
                if (cVar2.f41918c.equals("sha256/")) {
                    if (njVarD == null) {
                        njVarD = d(x509Certificate);
                    }
                    if (cVar2.f41916a.equals(njVarD)) {
                        return;
                    }
                } else if (cVar2.f41918c.equals("sha1/")) {
                    if (njVarE == null) {
                        njVarE = nj.e(x509Certificate.getPublicKey().getEncoded()).e();
                    }
                    if (cVar2.f41916a.equals(njVarE)) {
                        return;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("unsupported hashAlgorithm: ");
                    sb2.append(cVar2.f41918c);
                    throw new AssertionError(sb2.toString());
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb3.append("\n    ");
            sb3.append(e(x509Certificate2));
            sb3.append(": ");
            sb3.append(x509Certificate2.getSubjectDN().getName());
        }
        sb3.append("\n  Pinned certificates for ");
        sb3.append(str);
        sb3.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        int size4 = listEmptyList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            c cVar3 = (c) listEmptyList.get(i13);
            sb3.append("\n    ");
            sb3.append(cVar3);
        }
        throw new SSLPeerUnverifiedException(sb3.toString());
    }
}
