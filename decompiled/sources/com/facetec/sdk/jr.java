package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class jr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kk f41899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Proxy f41900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    final SSLSocketFactory f41901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<kb> f41902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SocketFactory f41903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jq f41904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProxySelector f41905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<ko> f41906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private HostnameVerifier f41907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private kh f41908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private jv f41909k;

    public jr(String str, int i10, kh khVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable jv jvVar, jq jqVar, @Nullable Proxy proxy, List<ko> list, List<kb> list2, ProxySelector proxySelector) {
        kk.e eVar = new kk.e();
        String str2 = sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP;
        if (str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
            eVar.f42051b = ProxyConfig.MATCH_HTTP;
        } else {
            if (!str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            eVar.f42051b = ProxyConfig.MATCH_HTTPS;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strB = kk.e.b(str, 0, str.length());
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        eVar.f42050a = strB;
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i10)));
        }
        eVar.f42054e = i10;
        this.f41899a = eVar.c();
        if (khVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f41908j = khVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f41903e = socketFactory;
        if (jqVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f41904f = jqVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f41906h = kz.d(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f41902d = kz.d(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f41905g = proxySelector;
        this.f41900b = proxy;
        this.f41901c = sSLSocketFactory;
        this.f41907i = hostnameVerifier;
        this.f41909k = jvVar;
    }

    public final ProxySelector a() {
        return this.f41905g;
    }

    public final List<ko> b() {
        return this.f41906h;
    }

    public final kh c() {
        return this.f41908j;
    }

    public final jq d() {
        return this.f41904f;
    }

    public final kk e() {
        return this.f41899a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        return this.f41899a.equals(jrVar.f41899a) && a(jrVar);
    }

    @Nullable
    public final HostnameVerifier g() {
        return this.f41907i;
    }

    public final int hashCode() {
        int iHashCode = (this.f41905g.hashCode() + ((this.f41902d.hashCode() + ((this.f41906h.hashCode() + ((this.f41904f.hashCode() + ((this.f41908j.hashCode() + ((this.f41899a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f41900b;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f41901c;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f41907i;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        jv jvVar = this.f41909k;
        return iHashCode4 + (jvVar != null ? jvVar.hashCode() : 0);
    }

    @Nullable
    public final jv i() {
        return this.f41909k;
    }

    @Nullable
    public final SSLSocketFactory j() {
        return this.f41901c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.f41899a.i());
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(this.f41899a.j());
        if (this.f41900b != null) {
            sb2.append(", proxy=");
            sb2.append(this.f41900b);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f41905g);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final boolean a(jr jrVar) {
        return this.f41908j.equals(jrVar.f41908j) && this.f41904f.equals(jrVar.f41904f) && this.f41906h.equals(jrVar.f41906h) && this.f41902d.equals(jrVar.f41902d) && this.f41905g.equals(jrVar.f41905g) && kz.d(this.f41900b, jrVar.f41900b) && kz.d(this.f41901c, jrVar.f41901c) && kz.d(this.f41907i, jrVar.f41907i) && kz.d(this.f41909k, jrVar.f41909k) && e().j() == jrVar.e().j();
    }
}
