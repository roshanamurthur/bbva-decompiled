package com.facetec.sdk;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes9.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kw f42017a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f42018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f42019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jz f42020e;

    private ke(kw kwVar, jz jzVar, List<Certificate> list, List<Certificate> list2) {
        this.f42017a = kwVar;
        this.f42020e = jzVar;
        this.f42018c = list;
        this.f42019d = list2;
    }

    public static ke e(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        jz jzVarA = jz.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (ExpectedUserActionOnPoiTypes.NONE.equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        kw kwVarB = kw.b(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listB = peerCertificates != null ? kz.b(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new ke(kwVarB, jzVarA, listB, localCertificates != null ? kz.b(localCertificates) : Collections.emptyList());
    }

    public final List<Certificate> a() {
        return this.f42018c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        return this.f42017a.equals(keVar.f42017a) && this.f42020e.equals(keVar.f42020e) && this.f42018c.equals(keVar.f42018c) && this.f42019d.equals(keVar.f42019d);
    }

    public final int hashCode() {
        return this.f42019d.hashCode() + ((this.f42018c.hashCode() + ((this.f42020e.hashCode() + ((this.f42017a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
