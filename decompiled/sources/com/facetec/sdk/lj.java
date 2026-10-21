package com.facetec.sdk;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.InputDeviceCompat;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class lj {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ boolean f42298g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int[] f42299r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd f42300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lm f42301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw f42302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf f42303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kx f42304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private lk.c f42305f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lr f42306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jr f42307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42310l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f42311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final lk f42312o;

    public static final class c extends WeakReference<lj> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f42313c;

        public c(lj ljVar, Object obj) {
            super(ljVar);
            this.f42313c = obj;
        }
    }

    static {
        init$0();
        h();
        f42298g = true;
    }

    public lj(kd kdVar, jr jrVar, jw jwVar, kf kfVar, Object obj) {
        this.f42300a = kdVar;
        this.f42307i = jrVar;
        this.f42302c = jwVar;
        this.f42303d = kfVar;
        this.f42312o = new lk(jrVar, f(), jwVar, kfVar);
        this.f42311n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:298:0x06cd A[Catch: all -> 0x06b3, TryCatch #12 {all -> 0x06b3, blocks: (B:296:0x06c7, B:298:0x06cd, B:299:0x06d2, B:300:0x06d3, B:280:0x0683, B:281:0x06b2), top: B:342:0x0683 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x06d3 A[Catch: all -> 0x06b3, TRY_LEAVE, TryCatch #12 {all -> 0x06b3, blocks: (B:296:0x06c7, B:298:0x06cd, B:299:0x06d2, B:300:0x06d3, B:280:0x0683, B:281:0x06b2), top: B:342:0x0683 }] */
    /* JADX WARN: Code duplicated, block: B:309:0x0709  */
    /* JADX WARN: Code duplicated, block: B:310:0x070f  */
    /* JADX WARN: Code duplicated, block: B:312:0x0718  */
    /* JADX WARN: Code duplicated, block: B:348:0x06d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0720 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0720 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:? A[LOOP:3: B:333:0x02f5->B:383:?, LOOP_END, SYNTHETIC] */
    private lm e(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        int i14;
        Socket socketA;
        lm lmVar;
        boolean z11;
        kx kxVar;
        boolean z12;
        Socket socketE;
        SSLSocket sSLSocket;
        kb kbVar;
        lk.c cVar;
        String strI;
        int iJ;
        synchronized (this.f42300a) {
            try {
                if (this.f42309k) {
                    throw new IllegalStateException("released");
                }
                if (this.f42306h != null) {
                    throw new IllegalStateException("codec != null");
                }
                if (this.f42308j) {
                    throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                }
                if (!f42298g && !Thread.holdsLock(this.f42300a)) {
                    throw new AssertionError();
                }
                lm lmVar2 = this.f42301b;
                i14 = 0;
                socketA = (lmVar2 == null || !lmVar2.f42336i) ? null : a(false, false, true);
                lmVar = this.f42301b;
                if (lmVar == null) {
                    lmVar = null;
                }
                if (lmVar == null) {
                    kv.f42195e.e(this.f42300a, this.f42307i, this, null);
                    lm lmVar3 = this.f42301b;
                    if (lmVar3 != null) {
                        z11 = true;
                        lmVar = lmVar3;
                    } else {
                        kxVar = this.f42304e;
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                kxVar = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kz.d(socketA);
        if (lmVar != null) {
            this.f42304e = this.f42301b.b();
            return lmVar;
        }
        if (kxVar != null || ((cVar = this.f42305f) != null && cVar.e())) {
            z12 = false;
        } else {
            lk lkVar = this.f42312o;
            if (!lkVar.b()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList = new ArrayList();
            while (lkVar.c()) {
                if (!lkVar.c()) {
                    StringBuilder sb2 = new StringBuilder("No route to ");
                    sb2.append(lkVar.f42314a.e().i());
                    sb2.append("; exhausted proxy configurations: ");
                    sb2.append(lkVar.f42318e);
                    throw new SocketException(sb2.toString());
                }
                List<Proxy> list = lkVar.f42318e;
                int i15 = lkVar.f42320g;
                lkVar.f42320g = i15 + 1;
                Proxy proxy = list.get(i15);
                lkVar.f42321j = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    strI = lkVar.f42314a.e().i();
                    iJ = lkVar.f42314a.e().j();
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        StringBuilder sb3 = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                        sb3.append(socketAddressAddress.getClass());
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    strI = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    iJ = inetSocketAddress.getPort();
                }
                if (iJ <= 0 || iJ > 65535) {
                    StringBuilder sb4 = new StringBuilder("No route to ");
                    sb4.append(strI);
                    sb4.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    sb4.append(iJ);
                    sb4.append("; port is out of range");
                    throw new SocketException(sb4.toString());
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    lkVar.f42321j.add(InetSocketAddress.createUnresolved(strI, iJ));
                } else {
                    List<InetAddress> listE = lkVar.f42314a.c().e(strI);
                    if (listE.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(lkVar.f42314a.c());
                        sb5.append(" returned no addresses for ");
                        sb5.append(strI);
                        throw new UnknownHostException(sb5.toString());
                    }
                    int size = listE.size();
                    int i16 = i14;
                    while (i16 < size) {
                        lkVar.f42321j.add(new InetSocketAddress(listE.get(i16), iJ));
                        i16++;
                        listE = listE;
                    }
                }
                int size2 = lkVar.f42321j.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    kx kxVar2 = new kx(lkVar.f42314a, proxy, lkVar.f42321j.get(i17));
                    if (lkVar.f42317d.a(kxVar2)) {
                        lkVar.f42319f.add(kxVar2);
                    } else {
                        arrayList.add(kxVar2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
                i14 = 0;
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(lkVar.f42319f);
                lkVar.f42319f.clear();
            }
            this.f42305f = new lk.c(arrayList);
            z12 = true;
        }
        synchronized (this.f42300a) {
            try {
                if (this.f42308j) {
                    throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                }
                if (z12) {
                    ArrayList arrayList2 = new ArrayList(this.f42305f.f42323d);
                    int size3 = arrayList2.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        kx kxVar3 = (kx) arrayList2.get(i18);
                        kv.f42195e.e(this.f42300a, this.f42307i, this, kxVar3);
                        lm lmVar4 = this.f42301b;
                        if (lmVar4 != null) {
                            this.f42304e = kxVar3;
                            lmVar = lmVar4;
                            z11 = true;
                            break;
                        }
                    }
                }
                if (!z11) {
                    if (kxVar == null) {
                        lk.c cVar2 = this.f42305f;
                        if (!cVar2.e()) {
                            throw new NoSuchElementException();
                        }
                        List<kx> list2 = cVar2.f42323d;
                        int i19 = cVar2.f42322c;
                        cVar2.f42322c = i19 + 1;
                        kxVar = list2.get(i19);
                    }
                    this.f42304e = kxVar;
                    this.m = 0;
                    lmVar = new lm(this.f42300a, kxVar);
                    a(lmVar, false);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z11) {
            return lmVar;
        }
        if (lmVar.f42333f != null) {
            throw new IllegalStateException("already connected");
        }
        List<kb> list3 = lmVar.f42331d.a().f41902d;
        lg lgVar = new lg(list3);
        if (lmVar.f42331d.a().j() == null) {
            if (!list3.contains(kb.f41981d)) {
                throw new li(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strI2 = lmVar.f42331d.a().e().i();
            if (!mu.i().d(strI2)) {
                StringBuilder sb6 = new StringBuilder("CLEARTEXT communication to ");
                sb6.append(strI2);
                sb6.append(" not permitted by network security policy");
                throw new li(new UnknownServiceException(sb6.toString()));
            }
        } else if (lmVar.f42331d.a().b().contains(ko.H2_PRIOR_KNOWLEDGE)) {
            throw new li(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        li liVar = null;
        while (true) {
            try {
                try {
                    if (lmVar.f42331d.c()) {
                        try {
                            kr krVarE = new kr.a().e(lmVar.f42331d.a().e()).b(CommandConstants.CONNECT, (kp) null).c("Host", kz.a(lmVar.f42331d.a().e(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", la.c()).e();
                            kq.d dVarD = new kq.d().a(krVarE).e(ko.HTTP_1_1).d(407).d("Preemptive Authenticate").c(kz.f42209d).b(-1L).d(-1L);
                            dVarD.f42147j.d("Proxy-Authenticate", "OkHttp-Preemptive");
                            dVarD.c();
                            lmVar.f42331d.a().d();
                            kk kkVarA = krVarE.a();
                            lmVar.d(i10, i11);
                            StringBuilder sb7 = new StringBuilder("CONNECT ");
                            try {
                                sb7.append(kz.a(kkVarA, true));
                                sb7.append(" HTTP/1.1");
                                String string = sb7.toString();
                                ma maVar = new ma(null, null, lmVar.f42335h, lmVar.f42334g);
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                lmVar.f42335h.a().c(i11, timeUnit);
                                lmVar.f42334g.a().c(i12, timeUnit);
                                maVar.e(krVarE.d(), string);
                                maVar.a();
                                try {
                                    kq kqVarC = maVar.c(false).a(krVarE).c();
                                    long jC = lp.c(kqVarC);
                                    if (jC == -1) {
                                        jC = 0;
                                    }
                                    nz nzVarD = maVar.d(jC);
                                    kz.b(nzVarD, Integer.MAX_VALUE, timeUnit);
                                    nzVarD.close();
                                    int iE = kqVarC.e();
                                    if (iE == 200) {
                                        if (!lmVar.f42335h.d().c() || !lmVar.f42334g.d().c()) {
                                            throw new IOException("TLS tunnel buffered too many bytes!");
                                        }
                                        if (lmVar.f42330c != null) {
                                            break;
                                        }
                                        break;
                                    }
                                    if (iE == 407) {
                                        lmVar.f42331d.a().d();
                                        throw new IOException("Failed to authenticate with proxy");
                                    }
                                    StringBuilder sb8 = new StringBuilder("Unexpected response code for CONNECT: ");
                                    sb8.append(kqVarC.e());
                                    throw new IOException(sb8.toString());
                                } catch (IOException e5) {
                                    e = e5;
                                    kz.d(lmVar.f42328a);
                                    kz.d(lmVar.f42330c);
                                    lmVar.f42328a = null;
                                    lmVar.f42330c = null;
                                    lmVar.f42335h = null;
                                    lmVar.f42334g = null;
                                    lmVar.f42329b = null;
                                    lmVar.f42333f = null;
                                    lmVar.f42337j = null;
                                    lmVar.f42331d.b();
                                    lmVar.f42331d.e();
                                    if (liVar == null) {
                                        liVar = new li(e);
                                    } else {
                                        kz.e(liVar.f42296b, e);
                                        liVar.f42297e = e;
                                    }
                                    if (z10) {
                                        throw liVar;
                                    }
                                    if (lgVar.d(e)) {
                                        throw liVar;
                                    }
                                }
                            } catch (IOException e7) {
                                e = e7;
                            }
                        } catch (IOException e10) {
                            e = e10;
                        }
                    } else {
                        lmVar.d(i10, i11);
                    }
                    if (lmVar.f42331d.a().j() == null) {
                        List<ko> listB = lmVar.f42331d.a().b();
                        ko koVar = ko.H2_PRIOR_KNOWLEDGE;
                        if (listB.contains(koVar)) {
                            lmVar.f42328a = lmVar.f42330c;
                            lmVar.f42333f = koVar;
                            lmVar.d(i13);
                        } else {
                            lmVar.f42328a = lmVar.f42330c;
                            lmVar.f42333f = ko.HTTP_1_1;
                        }
                    } else {
                        jr jrVarA = lmVar.f42331d.a();
                        try {
                            try {
                                sSLSocket = (SSLSocket) jrVarA.j().createSocket(lmVar.f42330c, jrVarA.e().i(), jrVarA.e().j(), true);
                                try {
                                    int i20 = lgVar.f42293b;
                                    int size4 = lgVar.f42292a.size();
                                    while (true) {
                                        if (i20 >= size4) {
                                            kbVar = null;
                                            break;
                                        }
                                        kbVar = lgVar.f42292a.get(i20);
                                        if (kbVar.c(sSLSocket)) {
                                            lgVar.f42293b = i20 + 1;
                                            break;
                                        }
                                        i20++;
                                    }
                                    if (kbVar == null) {
                                        try {
                                            try {
                                                StringBuilder sb9 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
                                                sb9.append(lgVar.f42295e);
                                                sb9.append(", modes=");
                                                sb9.append(lgVar.f42292a);
                                                sb9.append(", supported protocols=");
                                                sb9.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
                                                throw new UnknownServiceException(sb9.toString());
                                            } catch (AssertionError e11) {
                                                e = e11;
                                                if (kz.e(e)) {
                                                    throw new IOException(e);
                                                }
                                                throw e;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sSLSocket != null) {
                                                mu.i().a(sSLSocket);
                                            }
                                            kz.d(sSLSocket);
                                            throw th;
                                        }
                                    }
                                    lgVar.f42294c = lgVar.a(sSLSocket);
                                    kv.f42195e.a(kbVar, sSLSocket, lgVar.f42295e);
                                    if (kbVar.b()) {
                                        mu.i().b(sSLSocket, jrVarA.e().i(), jrVarA.b());
                                    }
                                    sSLSocket.startHandshake();
                                    SSLSession session = sSLSocket.getSession();
                                    ke keVarE = ke.e(session);
                                    if (jrVarA.g().verify(jrVarA.e().i(), session)) {
                                        try {
                                            jrVarA.i().e(jrVarA.e().i(), keVarE.a());
                                            String strD = kbVar.b() ? mu.i().d(sSLSocket) : null;
                                            lmVar.f42328a = sSLSocket;
                                            lmVar.f42335h = no.c(no.a(sSLSocket));
                                            lmVar.f42334g = no.c(no.e(lmVar.f42328a));
                                            lmVar.f42329b = keVarE;
                                            lmVar.f42333f = strD != null ? ko.e(strD) : ko.HTTP_1_1;
                                            try {
                                                mu.i().a(sSLSocket);
                                                if (lmVar.f42333f == ko.HTTP_2) {
                                                    lmVar.d(i13);
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                                kz.d(lmVar.f42328a);
                                                kz.d(lmVar.f42330c);
                                                lmVar.f42328a = null;
                                                lmVar.f42330c = null;
                                                lmVar.f42335h = null;
                                                lmVar.f42334g = null;
                                                lmVar.f42329b = null;
                                                lmVar.f42333f = null;
                                                lmVar.f42337j = null;
                                                lmVar.f42331d.b();
                                                lmVar.f42331d.e();
                                                if (liVar == null) {
                                                    liVar = new li(e);
                                                } else {
                                                    kz.e(liVar.f42296b, e);
                                                    liVar.f42297e = e;
                                                }
                                                if (z10) {
                                                    throw liVar;
                                                }
                                                if (lgVar.d(e)) {
                                                    throw liVar;
                                                }
                                            }
                                        } catch (AssertionError e13) {
                                            e = e13;
                                            if (kz.e(e)) {
                                                throw new IOException(e);
                                            }
                                            throw e;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (sSLSocket != null) {
                                                mu.i().a(sSLSocket);
                                            }
                                            kz.d(sSLSocket);
                                            throw th;
                                        }
                                    } else {
                                        try {
                                            List<Certificate> listA = keVarE.a();
                                            if (listA.isEmpty()) {
                                                StringBuilder sb10 = new StringBuilder("Hostname ");
                                                sb10.append(jrVarA.e().i());
                                                sb10.append(" not verified (no certificates)");
                                                throw new SSLPeerUnverifiedException(sb10.toString());
                                            }
                                            X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                                            StringBuilder sb11 = new StringBuilder("Hostname ");
                                            sb11.append(jrVarA.e().i());
                                            sb11.append(" not verified:\n    certificate: ");
                                            sb11.append(jv.e(x509Certificate));
                                            sb11.append("\n    DN: ");
                                            sb11.append(x509Certificate.getSubjectDN().getName());
                                            sb11.append("\n    subjectAltNames: ");
                                            sb11.append(nf.e(x509Certificate));
                                            throw new SSLPeerUnverifiedException(sb11.toString());
                                        } catch (AssertionError e14) {
                                            e = e14;
                                            if (kz.e(e)) {
                                                throw new IOException(e);
                                            }
                                            throw e;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            if (sSLSocket != null) {
                                                try {
                                                    mu.i().a(sSLSocket);
                                                } catch (IOException e15) {
                                                    e = e15;
                                                }
                                            }
                                            kz.d(sSLSocket);
                                            throw th;
                                        }
                                    }
                                } catch (AssertionError e16) {
                                    e = e16;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (AssertionError e17) {
                                e = e17;
                                if (kz.e(e)) {
                                    throw new IOException(e);
                                }
                                throw e;
                            } catch (Throwable th8) {
                                th = th8;
                                sSLSocket = null;
                                if (sSLSocket != null) {
                                    mu.i().a(sSLSocket);
                                }
                                kz.d(sSLSocket);
                                throw th;
                            }
                        } catch (AssertionError e18) {
                            e = e18;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                        kz.d(lmVar.f42328a);
                        kz.d(lmVar.f42330c);
                        lmVar.f42328a = null;
                        lmVar.f42330c = null;
                        lmVar.f42335h = null;
                        lmVar.f42334g = null;
                        lmVar.f42329b = null;
                        lmVar.f42333f = null;
                        lmVar.f42337j = null;
                        lmVar.f42331d.b();
                        lmVar.f42331d.e();
                        if (liVar == null) {
                            liVar = new li(e);
                        } else {
                            kz.e(liVar.f42296b, e);
                            liVar.f42297e = e;
                        }
                        if (z10) {
                            throw liVar;
                        }
                        if (lgVar.d(e)) {
                            throw liVar;
                        }
                    }
                    lmVar.f42331d.b();
                    lmVar.f42331d.e();
                    break;
                } catch (IOException e19) {
                    e = e19;
                    kz.d(lmVar.f42328a);
                    kz.d(lmVar.f42330c);
                    lmVar.f42328a = null;
                    lmVar.f42330c = null;
                    lmVar.f42335h = null;
                    lmVar.f42334g = null;
                    lmVar.f42329b = null;
                    lmVar.f42333f = null;
                    lmVar.f42337j = null;
                    lmVar.f42331d.b();
                    lmVar.f42331d.e();
                    if (liVar == null) {
                        liVar = new li(e);
                    } else {
                        kz.e(liVar.f42296b, e);
                        liVar.f42297e = e;
                    }
                    if (z10) {
                        throw liVar;
                    }
                    if (lgVar.d(e)) {
                        throw liVar;
                    }
                }
            } catch (IOException e20) {
                e = e20;
            }
        }
        if (lmVar.f42331d.c() && lmVar.f42330c == null) {
            throw new li(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (lmVar.f42337j != null) {
            synchronized (lmVar.f42332e) {
                lmVar.f42340n = lmVar.f42337j.c();
            }
        }
        f().c(lmVar.b());
        synchronized (this.f42300a) {
            try {
                this.f42310l = true;
                kv.f42195e.b(this.f42300a, lmVar);
                if (lmVar.e()) {
                    socketE = kv.f42195e.e(this.f42300a, this.f42307i, this);
                    lmVar = this.f42301b;
                } else {
                    socketE = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        kz.d(socketE);
        return lmVar;
    }

    private ll f() {
        return kv.f42195e.b(this.f42300a);
    }

    public static void h() {
        f42299r = new int[]{1929679166, 950188317, 1348646181, 650295117, 1762134987, 541646325, 902405758, 664952208, 461391544, 1942180628, 587735899, 1157210548, 1948655913, -1370291999, 1866614288, -2076736018, 1130411646, -1290201226};
    }

    public static void init$0() {
        $$a = new byte[]{114, 0, 67, KSUtils.PLAIN_BUFFER};
        $$b = 166;
    }

    private static void p(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        String str;
        Object method;
        gx gxVar = new gx();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = f42299r;
        String str2 = "";
        long j10 = 0;
        int i11 = 1;
        int i12 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = new Object[i11];
                    objArr2[i12] = Integer.valueOf(iArr2[i13]);
                    Map map = bp.f40694x;
                    Object obj = map.get(835167305);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls = (Class) bp.a(TextUtils.lastIndexOf("", '0', i12, i12) + 25, 766 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)), (char) (36773 - Gravity.getAbsoluteGravity(0, 0)));
                        byte[] bArr = $$a;
                        byte length2 = (byte) bArr.length;
                        byte b10 = bArr[1];
                        Object[] objArr3 = new Object[1];
                        q(length2, b10, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method);
                    }
                    iArr3[i13] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i13++;
                    iArr2 = iArr2;
                    length = length;
                    j10 = 0;
                    i11 = 1;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length3 = iArr2.length;
        int[] iArr4 = new int[length3];
        int[] iArr5 = f42299r;
        if (iArr5 != null) {
            int length4 = iArr5.length;
            int[] iArr6 = new int[length4];
            int i14 = 0;
            while (i14 < length4) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i14])};
                Map map2 = bp.f40694x;
                Object method2 = map2.get(835167305);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 765, (char) (36773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    byte[] bArr2 = $$a;
                    byte length5 = (byte) bArr2.length;
                    byte b11 = bArr2[1];
                    Object[] objArr5 = new Object[1];
                    q(length5, b11, b11, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(835167305, method2);
                }
                iArr6[i14] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i14++;
                iArr5 = iArr5;
                length4 = length4;
                cArr3 = cArr3;
                str2 = str2;
            }
            cArr = cArr3;
            str = str2;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
            str = "";
        }
        char c10 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length3);
        gxVar.f41838c = 0;
        while (true) {
            int i15 = gxVar.f41838c;
            if (i15 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i16 = iArr[i15];
            char c11 = (char) (i16 >> 16);
            cArr2[c10] = c11;
            char c12 = (char) i16;
            cArr2[1] = c12;
            char c13 = (char) (iArr[i15 + 1] >> 16);
            cArr2[2] = c13;
            char c14 = (char) iArr[i15 + 1];
            cArr2[3] = c14;
            gxVar.f41839d = (c11 << 16) + c12;
            gxVar.f41837a = (c13 << 16) + c14;
            gx.b(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = gxVar.f41839d ^ iArr4[i17];
                gxVar.f41839d = i19;
                Object[] objArr6 = {gxVar, Integer.valueOf(gx.e(i19)), gxVar, gxVar};
                Map map3 = bp.f40694x;
                Object method3 = map3.get(147461875);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + InputDeviceCompat.SOURCE_GAMEPAD, (char) (Process.getGidForName(str) + 38454));
                    byte b12 = $$a[1];
                    byte b13 = b12;
                    Object[] objArr7 = new Object[1];
                    q(b12, b13, b13, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(147461875, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                gxVar.f41839d = gxVar.f41837a;
                gxVar.f41837a = iIntValue;
                i17++;
            }
            int i20 = gxVar.f41839d;
            int i21 = gxVar.f41837a;
            int i22 = i20 ^ iArr4[16];
            gxVar.f41837a = i22;
            int i23 = i21 ^ iArr4[17];
            gxVar.f41839d = i23;
            cArr2[0] = (char) (i23 >>> 16);
            cArr2[1] = (char) i23;
            cArr2[2] = (char) (i22 >>> 16);
            cArr2[3] = (char) i22;
            gx.b(iArr4);
            int i24 = gxVar.f41838c;
            cArr[i24 * 2] = cArr2[0];
            cArr[(i24 * 2) + 1] = cArr2[1];
            cArr[(i24 * 2) + 2] = cArr2[2];
            cArr[(i24 * 2) + 3] = cArr2[3];
            Object[] objArr8 = {gxVar, gxVar};
            Map map4 = bp.f40694x;
            Object method4 = map4.get(-1856717708);
            if (method4 == null) {
                Class cls4 = (Class) bp.a((ViewConfiguration.getScrollBarSize() >> 8) + 24, (ViewConfiguration.getWindowTouchSlop() >> 8) + 789, (char) (26625 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                byte b14 = $$a[1];
                byte b15 = (byte) (b14 + 1);
                byte b16 = b14;
                Object[] objArr9 = new Object[1];
                q(b15, b16, b16, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1856717708, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void q(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 117
            byte[] r0 = com.facetec.sdk.lj.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.lj.q(byte, int, short, java.lang.Object[]):void");
    }

    public final void a(boolean z10, lr lrVar, IOException iOException) {
        Socket socketA;
        boolean z11;
        synchronized (this.f42300a) {
            if (lrVar != null) {
                try {
                    if (lrVar == this.f42306h) {
                        if (!z10) {
                            this.f42301b.f42339l++;
                        }
                        socketA = a(z10, false, true);
                        z11 = this.f42309k;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            StringBuilder sb2 = new StringBuilder("expected ");
            sb2.append(this.f42306h);
            sb2.append(" but was ");
            sb2.append(lrVar);
            throw new IllegalStateException(sb2.toString());
        }
        kz.d(socketA);
        jw jwVar = this.f42302c;
        if (iOException != null) {
            kv.f42195e.b(jwVar, iOException);
        } else if (z11) {
            kv.f42195e.b(jwVar, (IOException) null);
        }
    }

    public final lr b(kl klVar, km.e eVar, boolean z10) throws Throwable {
        lr maVar;
        try {
            lm lmVarB = b(eVar.e(), eVar.a(), eVar.b(), klVar.m, klVar.k(), z10);
            if (lmVarB.f42337j != null) {
                maVar = new me(klVar, eVar, this, lmVarB.f42337j);
            } else {
                lmVarB.f42328a.setSoTimeout(eVar.a());
                ny nyVarA = lmVarB.f42335h.a();
                long jA = eVar.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                nyVarA.c(jA, timeUnit);
                lmVarB.f42334g.a().c(eVar.b(), timeUnit);
                maVar = new ma(klVar, this, lmVarB.f42335h, lmVarB.f42334g);
            }
            synchronized (this.f42300a) {
                this.f42306h = maVar;
            }
            return maVar;
        } catch (IOException e5) {
            throw new li(e5);
        }
    }

    public final boolean c() {
        if (this.f42304e != null) {
            return true;
        }
        lk.c cVar = this.f42305f;
        return (cVar != null && cVar.e()) || this.f42312o.b();
    }

    public final void d() {
        Socket socketA;
        synchronized (this.f42300a) {
            socketA = a(true, false, false);
        }
        kz.d(socketA);
    }

    public final String toString() {
        lm lmVarE = e();
        return lmVarE != null ? lmVarE.toString() : this.f42307i.toString();
    }

    public final void a() {
        lm lmVar;
        Socket socketA;
        synchronized (this.f42300a) {
            lmVar = this.f42301b;
            socketA = a(false, true, false);
            if (this.f42301b != null) {
                lmVar = null;
            }
        }
        kz.d(socketA);
        if (lmVar != null) {
            kv.f42195e.b(this.f42302c, (IOException) null);
        }
    }

    private lm b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            lm lmVarE = e(i10, i11, i12, i13, z10);
            synchronized (this.f42300a) {
                if (lmVarE.f42339l == 0 && !lmVarE.e()) {
                    return lmVarE;
                }
                if (lmVarE.e(z11)) {
                    return lmVarE;
                }
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    public final Socket a(boolean z10, boolean z11, boolean z12) {
        Socket socketA;
        if (!f42298g && !Thread.holdsLock(this.f42300a)) {
            throw new AssertionError();
        }
        if (z12) {
            this.f42306h = null;
        }
        if (z11) {
            this.f42309k = true;
        }
        lm lmVar = this.f42301b;
        if (lmVar == null) {
            return null;
        }
        if (z10) {
            lmVar.f42336i = true;
        }
        if (this.f42306h != null) {
            return null;
        }
        if (!this.f42309k && !lmVar.f42336i) {
            return null;
        }
        a(lmVar);
        if (this.f42301b.m.isEmpty()) {
            lm lmVar2 = this.f42301b;
            try {
                Object[] objArr = new Object[1];
                p(new int[]{850909264, 1681773649, 903589302, 1040905428, 1264486784, -1163135742, -173964079, -888264582}, ExpandableListView.getPackedPositionType(0L) + 16, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                p(new int[]{1911454660, -1245765508, 719450694, -1308212803}, 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                lmVar2.f42338k = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue();
                if (kv.f42195e.c(this.f42300a, this.f42301b)) {
                    socketA = this.f42301b.a();
                } else {
                    socketA = null;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } else {
            socketA = null;
        }
        this.f42301b = null;
        return socketA;
    }

    public final lr b() {
        lr lrVar;
        synchronized (this.f42300a) {
            lrVar = this.f42306h;
        }
        return lrVar;
    }

    public final void a(IOException iOException) {
        boolean z10;
        Socket socketA;
        synchronized (this.f42300a) {
            try {
                if (iOException instanceof mo) {
                    lz lzVar = ((mo) iOException).f42606c;
                    if (lzVar == lz.REFUSED_STREAM) {
                        int i10 = this.m + 1;
                        this.m = i10;
                        if (i10 > 1) {
                            this.f42304e = null;
                            z10 = true;
                        }
                    } else if (lzVar != lz.CANCEL) {
                        this.f42304e = null;
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    lm lmVar = this.f42301b;
                    if (lmVar == null || (lmVar.e() && !(iOException instanceof lx))) {
                        z10 = false;
                    } else {
                        if (this.f42301b.f42339l == 0) {
                            kx kxVar = this.f42304e;
                            if (kxVar != null && iOException != null) {
                                lk lkVar = this.f42312o;
                                if (kxVar.e().type() != Proxy.Type.DIRECT && lkVar.f42314a.a() != null) {
                                    lkVar.f42314a.a().connectFailed(lkVar.f42314a.e().d(), kxVar.e().address(), iOException);
                                }
                                lkVar.f42317d.e(kxVar);
                            }
                            this.f42304e = null;
                        }
                        z10 = true;
                    }
                }
                socketA = a(z10, false, true);
                if (this.f42301b == null) {
                    boolean z11 = this.f42310l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kz.d(socketA);
    }

    public final void a(lm lmVar, boolean z10) {
        if (!f42298g && !Thread.holdsLock(this.f42300a)) {
            throw new AssertionError();
        }
        if (this.f42301b == null) {
            this.f42301b = lmVar;
            this.f42310l = z10;
            lmVar.m.add(new c(this, this.f42311n));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(lm lmVar) {
        int size = lmVar.m.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (lmVar.m.get(i10).get() == this) {
                lmVar.m.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized lm e() {
        return this.f42301b;
    }
}
