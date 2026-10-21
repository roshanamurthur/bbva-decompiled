package com.facetec.sdk;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
public class kl implements Cloneable {
    private kh A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<km> f42060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kf.a f42061b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<km> f42062d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f42063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jq f42064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    final lh f42065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    final ju f42066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f42067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f42068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private kg f42069l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f42070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Proxy f42071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SocketFactory f42072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ka f42073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<ko> f42074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ProxySelector f42075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<kb> f42076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private jv f42077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HostnameVerifier f42078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private jq f42079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private mz f42080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SSLSocketFactory f42081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private kd f42082z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final List<ko> f42059e = kz.b(ko.HTTP_2, ko.HTTP_1_1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final List<kb> f42058c = kz.b(kb.f41982e, kb.f41981d);

    public static final class d {
        int B;
        public int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        Proxy f42086d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ka f42088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        ju f42089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ProxySelector f42090h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public mz f42093k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        lh f42094l;
        HostnameVerifier m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SocketFactory f42095n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public SSLSocketFactory f42096o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public jv f42097p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        jq f42098q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        kh f42099r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        jq f42100s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        kd f42101t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f42102u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f42103v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f42104w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f42105x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f42106y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f42107z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<km> f42087e = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List<km> f42092j = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        kg f42084b = new kg();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<ko> f42083a = kl.f42059e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<kb> f42085c = kl.f42058c;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        kf.a f42091i = kf.e(kf.f42021b);

        public d() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f42090h = proxySelector;
            if (proxySelector == null) {
                this.f42090h = new na();
            }
            this.f42088f = ka.f41980d;
            this.f42095n = SocketFactory.getDefault();
            this.m = nf.f42683a;
            this.f42097p = jv.f41912a;
            jq jqVar = jq.f41898c;
            this.f42098q = jqVar;
            this.f42100s = jqVar;
            this.f42101t = new kd();
            this.f42099r = kh.f42031e;
            this.f42103v = true;
            this.f42102u = true;
            this.f42106y = true;
            this.f42104w = 0;
            this.f42105x = 10000;
            this.f42107z = 10000;
            this.C = 10000;
            this.B = 0;
        }

        public final kl d() {
            return new kl(this);
        }
    }

    static {
        kv.f42195e = new kv() { // from class: com.facetec.sdk.kl.2
            @Override // com.facetec.sdk.kv
            public final void a(kb kbVar, SSLSocket sSLSocket, boolean z10) throws Throwable {
                String[] strArrE = kbVar.f41986b != null ? kz.e(jz.f41940a, sSLSocket.getEnabledCipherSuites(), kbVar.f41986b) : sSLSocket.getEnabledCipherSuites();
                String[] strArrE2 = kbVar.f41988f != null ? kz.e(kz.f42215j, sSLSocket.getEnabledProtocols(), kbVar.f41988f) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int iA = kz.a(jz.f41940a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z10 && iA != -1) {
                    strArrE = kz.a(strArrE, supportedCipherSuites[iA]);
                }
                kb kbVarE = new kb.e(kbVar).b(strArrE).d(strArrE2).e();
                String[] strArr = kbVarE.f41988f;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = kbVarE.f41986b;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
            }

            @Override // com.facetec.sdk.kv
            public final void b(kj.d dVar, String str, String str2) {
                dVar.c(str, str2);
            }

            @Override // com.facetec.sdk.kv
            public final boolean c(kd kdVar, lm lmVar) {
                return kdVar.b(lmVar);
            }

            @Override // com.facetec.sdk.kv
            public final void d(kj.d dVar, String str) {
                int iIndexOf = str.indexOf(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, 1);
                if (iIndexOf != -1) {
                    dVar.c(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
                } else if (str.startsWith(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                    dVar.c("", str.substring(1));
                } else {
                    dVar.c("", str);
                }
            }

            @Override // com.facetec.sdk.kv
            public final boolean e(jr jrVar, jr jrVar2) {
                return jrVar.a(jrVar2);
            }

            @Override // com.facetec.sdk.kv
            public final ll b(kd kdVar) {
                return kdVar.f42010b;
            }

            @Override // com.facetec.sdk.kv
            public final lm e(kd kdVar, jr jrVar, lj ljVar, kx kxVar) {
                if (!kd.f42008i && !Thread.holdsLock(kdVar)) {
                    throw new AssertionError();
                }
                for (lm lmVar : kdVar.f42012d) {
                    if (lmVar.d(jrVar, kxVar)) {
                        ljVar.a(lmVar, true);
                        return lmVar;
                    }
                }
                return null;
            }

            @Override // com.facetec.sdk.kv
            public final int b(kq.d dVar) {
                return dVar.f42140c;
            }

            @Override // com.facetec.sdk.kv
            @Nullable
            public final IOException b(jw jwVar, @Nullable IOException iOException) {
                return ((ks) jwVar).b(iOException);
            }

            @Override // com.facetec.sdk.kv
            public final void b(kd kdVar, lm lmVar) {
                if (!kd.f42008i && !Thread.holdsLock(kdVar)) {
                    throw new AssertionError();
                }
                if (!kdVar.f42009a) {
                    kdVar.f42009a = true;
                    kd.f42007e.execute(kdVar.f42011c);
                }
                kdVar.f42012d.add(lmVar);
            }

            @Override // com.facetec.sdk.kv
            public final Socket e(kd kdVar, jr jrVar, lj ljVar) {
                if (!kd.f42008i && !Thread.holdsLock(kdVar)) {
                    throw new AssertionError();
                }
                for (lm lmVar : kdVar.f42012d) {
                    if (lmVar.d(jrVar, (kx) null) && lmVar.e() && lmVar != ljVar.e()) {
                        if (!lj.f42298g && !Thread.holdsLock(ljVar.f42300a)) {
                            throw new AssertionError();
                        }
                        if (ljVar.f42306h == null && ljVar.f42301b.m.size() == 1) {
                            Reference<lj> reference = ljVar.f42301b.m.get(0);
                            Socket socketA = ljVar.a(true, false, false);
                            ljVar.f42301b = lmVar;
                            lmVar.m.add(reference);
                            return socketA;
                        }
                        throw new IllegalStateException();
                    }
                }
                return null;
            }
        };
    }

    public kl() {
        this(new d());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextC = mu.i().c();
            sSLContextC.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextC.getSocketFactory();
        } catch (GeneralSecurityException e5) {
            throw kz.b("No System TLS", e5);
        }
    }

    public final ProxySelector b() {
        return this.f42075s;
    }

    @Nullable
    public final Proxy c() {
        return this.f42071o;
    }

    public final SocketFactory d() {
        return this.f42072p;
    }

    public final kh e() {
        return this.A;
    }

    public final jq f() {
        return this.f42079w;
    }

    public final kd g() {
        return this.f42082z;
    }

    public final jv h() {
        return this.f42077u;
    }

    public final SSLSocketFactory i() {
        return this.f42081y;
    }

    public final HostnameVerifier j() {
        return this.f42078v;
    }

    public final boolean k() {
        return this.C;
    }

    public final boolean l() {
        return this.B;
    }

    public final kg m() {
        return this.f42069l;
    }

    public final boolean n() {
        return this.D;
    }

    public final List<ko> o() {
        return this.f42074r;
    }

    public final List<kb> p() {
        return this.f42076t;
    }

    public kl(d dVar) {
        boolean z10;
        this.f42069l = dVar.f42084b;
        this.f42071o = dVar.f42086d;
        this.f42074r = dVar.f42083a;
        this.f42076t = dVar.f42085c;
        this.f42062d = kz.d(dVar.f42087e);
        this.f42060a = kz.d(dVar.f42092j);
        this.f42061b = dVar.f42091i;
        this.f42075s = dVar.f42090h;
        this.f42073q = dVar.f42088f;
        this.f42066i = dVar.f42089g;
        this.f42065h = dVar.f42094l;
        this.f42072p = dVar.f42095n;
        Iterator<kb> it = this.f42076t.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z10 = (z10 || it.next().a()) ? true : z10;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = dVar.f42096o;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = kz.a();
            this.f42081y = a(x509TrustManagerA);
            this.f42080x = mu.i().b(x509TrustManagerA);
        } else {
            this.f42081y = sSLSocketFactory;
            this.f42080x = dVar.f42093k;
        }
        if (this.f42081y != null) {
            mu.i().e(this.f42081y);
        }
        this.f42078v = dVar.m;
        jv jvVar = dVar.f42097p;
        mz mzVar = this.f42080x;
        this.f42077u = kz.d(jvVar.f41914d, mzVar) ? jvVar : new jv(jvVar.f41913b, mzVar);
        this.f42079w = dVar.f42098q;
        this.f42064g = dVar.f42100s;
        this.f42082z = dVar.f42101t;
        this.A = dVar.f42099r;
        this.D = dVar.f42103v;
        this.B = dVar.f42102u;
        this.C = dVar.f42106y;
        this.f42067j = dVar.f42104w;
        this.f42063f = dVar.f42105x;
        this.f42070n = dVar.f42107z;
        this.f42068k = dVar.C;
        this.m = dVar.B;
        if (this.f42062d.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null interceptor: ");
            sb2.append(this.f42062d);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f42060a.contains(null)) {
            StringBuilder sb3 = new StringBuilder("Null network interceptor: ");
            sb3.append(this.f42060a);
            throw new IllegalStateException(sb3.toString());
        }
    }

    public final jw c(kr krVar) {
        return ks.c(this, krVar, false);
    }

    public final ka a() {
        return this.f42073q;
    }
}
