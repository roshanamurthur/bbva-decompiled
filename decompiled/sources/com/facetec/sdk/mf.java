package com.facetec.sdk;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class mf implements Closeable {
    private static /* synthetic */ boolean D = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ExecutorService f42473q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), kz.b("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f42474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f42476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f42477d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ScheduledExecutorService f42479f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f42482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final mi f42483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final mn f42484k;
    public final mh m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f42487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ExecutorService f42488p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f42490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Set<Integer> f42491t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Socket f42497z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Integer, ml> f42478e = new LinkedHashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f42494w = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f42496y = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f42480g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f42481h = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f42492u = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f42495x = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42486n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f42493v = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public mn f42485l = new mn();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public nh f42521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ni f42522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Socket f42523d;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f42526i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f42524e = b.f42528o;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mi f42527j = mi.f42558d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f42525g = true;
    }

    public final class c extends lb {
        public c() {
            super("OkHttp %s ping", mf.this.f42477d);
        }

        @Override // com.facetec.sdk.lb
        public final void d() {
            boolean z10;
            synchronized (mf.this) {
                if (mf.this.f42496y < mf.this.f42494w) {
                    z10 = true;
                } else {
                    mf.c(mf.this);
                    z10 = false;
                }
            }
            if (z10) {
                mf.this.a();
            } else {
                mf.this.b(false, 1, 0);
            }
        }
    }

    public final class e extends lb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42540c;

        public e(int i10, int i11) {
            super("OkHttp %s ping %08x%08x", mf.this.f42477d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f42540c = true;
            this.f42539b = i10;
            this.f42538a = i11;
        }

        @Override // com.facetec.sdk.lb
        public final void d() {
            mf.this.b(this.f42540c, this.f42539b, this.f42538a);
        }
    }

    public mf(a aVar) {
        mn mnVar = new mn();
        this.f42484k = mnVar;
        this.f42491t = new LinkedHashSet();
        this.f42483j = aVar.f42527j;
        boolean z10 = aVar.f42525g;
        this.f42474a = z10;
        this.f42476c = aVar.f42524e;
        int i10 = z10 ? 1 : 2;
        this.f42482i = i10;
        if (z10) {
            this.f42482i = i10 + 2;
        }
        if (z10) {
            this.f42485l.c(7, 16777216);
        }
        String str = aVar.f42520a;
        this.f42477d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, kz.b(kz.e("OkHttp %s Writer", str), false));
        this.f42479f = scheduledThreadPoolExecutor;
        if (aVar.f42526i != 0) {
            c cVar = new c();
            int i11 = aVar.f42526i;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(cVar, i11, i11, TimeUnit.MILLISECONDS);
        }
        this.f42488p = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), kz.b(kz.e("OkHttp %s Push Observer", str), true));
        mnVar.c(7, 65535);
        mnVar.c(5, 16384);
        this.f42487o = mnVar.d();
        this.f42497z = aVar.f42523d;
        this.m = new mh(aVar.f42522c, z10);
        this.f42490s = new d(new mk(aVar.f42521b, z10));
    }

    public static boolean c(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public static /* synthetic */ boolean f(mf mfVar) {
        mfVar.f42489r = true;
        return true;
    }

    public static /* synthetic */ long h(mf mfVar) {
        long j10 = mfVar.f42496y;
        mfVar.f42496y = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long i(mf mfVar) {
        long j10 = mfVar.f42495x;
        mfVar.f42495x = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long j(mf mfVar) {
        long j10 = mfVar.f42481h;
        mfVar.f42481h = 1 + j10;
        return j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b(lz.NO_ERROR, lz.CANCEL);
    }

    public static /* synthetic */ long c(mf mfVar) {
        long j10 = mfVar.f42494w;
        mfVar.f42494w = 1 + j10;
        return j10;
    }

    public final void a(int i10, boolean z10, nb nbVar, long j10) throws IOException {
        long j11;
        int iMin;
        long j12;
        if (j10 == 0) {
            this.m.e(z10, i10, nbVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f42487o;
                            if (j11 <= 0) {
                                if (!this.f42478e.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(j10, j11), this.m.f42554d);
                j12 = iMin;
                this.f42487o -= j12;
            }
            j10 -= j12;
            this.m.e(z10 && j10 == 0, i10, nbVar, iMin);
        }
    }

    public final synchronized ml d(int i10) {
        return this.f42478e.get(Integer.valueOf(i10));
    }

    public final synchronized ml e(int i10) {
        ml mlVarRemove;
        mlVarRemove = this.f42478e.remove(Integer.valueOf(i10));
        notifyAll();
        return mlVarRemove;
    }

    public final void b(boolean z10, int i10, int i11) {
        try {
            this.m.c(z10, i10, i11);
        } catch (IOException unused) {
            a();
        }
    }

    public final synchronized int c() {
        mn mnVar = this.f42484k;
        if ((mnVar.f42605c & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return mnVar.f42604b[4];
    }

    public final void d(int i10, lz lzVar) throws IOException {
        this.m.b(i10, lzVar);
    }

    public final void b(lz lzVar, lz lzVar2) throws IOException {
        if (!D && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ml[] mlVarArr = null;
        try {
            e(lzVar);
            e = null;
        } catch (IOException e5) {
            e = e5;
        }
        synchronized (this) {
            try {
                if (!this.f42478e.isEmpty()) {
                    mlVarArr = (ml[]) this.f42478e.values().toArray(new ml[this.f42478e.size()]);
                    this.f42478e.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mlVarArr != null) {
            for (ml mlVar : mlVarArr) {
                try {
                    mlVar.c(lzVar2);
                } catch (IOException e7) {
                    if (e != null) {
                        e = e7;
                    }
                }
            }
        }
        try {
            this.m.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.f42497z.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.f42479f.shutdown();
        this.f42488p.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final ml e(List<mg> list, boolean z10) throws IOException {
        int i10;
        ml mlVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.m) {
            synchronized (this) {
                try {
                    if (this.f42482i > 1073741823) {
                        e(lz.REFUSED_STREAM);
                    }
                    if (!this.f42489r) {
                        i10 = this.f42482i;
                        this.f42482i = i10 + 2;
                        mlVar = new ml(i10, this, z12, false, null);
                        z11 = !z10 || this.f42487o == 0 || mlVar.f42581d == 0;
                        if (mlVar.c()) {
                            this.f42478e.put(Integer.valueOf(i10), mlVar);
                        }
                    } else {
                        throw new lx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.m.c(z12, i10, list);
        }
        if (z11) {
            this.m.e();
        }
        return mlVar;
    }

    public final synchronized void c(long j10) {
        long j11 = this.f42493v + j10;
        this.f42493v = j11;
        if (j11 >= this.f42485l.d() / 2) {
            e(0, this.f42493v);
            this.f42493v = 0L;
        }
    }

    public class d extends lb implements mk.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private mk f42531e;

        public d(mk mkVar) {
            super("OkHttp %s", mf.this.f42477d);
            this.f42531e = mkVar;
        }

        @Override // com.facetec.sdk.mk.b
        public final void a(final int i10, final lz lzVar) {
            if (mf.c(i10)) {
                final mf mfVar = mf.this;
                mfVar.a(new lb("OkHttp %s Push Reset[%s]", new Object[]{mfVar.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.10
                    @Override // com.facetec.sdk.lb
                    public final void d() {
                        mf mfVar2 = mf.this;
                        mi miVar = mfVar2.f42483j;
                        synchronized (mfVar2) {
                            mf.this.f42491t.remove(Integer.valueOf(i10));
                        }
                    }
                });
            } else {
                ml mlVarE = mf.this.e(i10);
                if (mlVarE != null) {
                    mlVarE.e(lzVar);
                }
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void b(final boolean z10, final int i10, nh nhVar, final int i11) throws IOException {
            boolean z11;
            boolean z12;
            long jB;
            if (mf.c(i10)) {
                final mf mfVar = mf.this;
                final nb nbVar = new nb();
                long j10 = i11;
                nhVar.b(j10);
                nhVar.d(nbVar, j10);
                if (nbVar.b() == j10) {
                    mfVar.a(new lb("OkHttp %s Push Data[%s]", new Object[]{mfVar.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.6
                        @Override // com.facetec.sdk.lb
                        public final void d() {
                            try {
                                mf.this.f42483j.d(nbVar, i11);
                                mf.this.m.b(i10, lz.CANCEL);
                                synchronized (mf.this) {
                                    mf.this.f42491t.remove(Integer.valueOf(i10));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(nbVar.b());
                sb2.append(" != ");
                sb2.append(i11);
                throw new IOException(sb2.toString());
            }
            ml mlVarD = mf.this.d(i10);
            if (mlVarD == null) {
                mf.this.e(i10, lz.PROTOCOL_ERROR);
                long j11 = i11;
                mf.this.c(j11);
                nhVar.j(j11);
                return;
            }
            if (!ml.f42577n && Thread.holdsLock(mlVarD)) {
                throw new AssertionError();
            }
            ml.e eVar = mlVarD.f42584g;
            long j12 = i11;
            if (!ml.e.f42597f && Thread.holdsLock(ml.this)) {
                throw new AssertionError();
            }
            while (j12 > 0) {
                synchronized (ml.this) {
                    z11 = eVar.f42600c;
                    z12 = eVar.f42598a.b() + j12 > eVar.f42602e;
                }
                if (z12) {
                    nhVar.j(j12);
                    ml.this.d(lz.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z11) {
                    nhVar.j(j12);
                    break;
                }
                long jD = nhVar.d(eVar.f42601d, j12);
                if (jD == -1) {
                    throw new EOFException();
                }
                j12 -= jD;
                synchronized (ml.this) {
                    try {
                        if (eVar.f42599b) {
                            jB = eVar.f42601d.b();
                            eVar.f42601d.p();
                        } else {
                            boolean z13 = eVar.f42598a.b() == 0;
                            eVar.f42598a.d(eVar.f42601d);
                            if (z13) {
                                ml.this.notifyAll();
                            }
                            jB = 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jB > 0) {
                    eVar.d(jB);
                }
            }
            if (z10) {
                mlVarD.j();
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void c(final boolean z10, final int i10, final List<mg> list) {
            boolean zC;
            if (mf.c(i10)) {
                final mf mfVar = mf.this;
                try {
                    mfVar.a(new lb("OkHttp %s Push Headers[%s]", new Object[]{mfVar.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.3
                        @Override // com.facetec.sdk.lb
                        public final void d() {
                            mf mfVar2 = mf.this;
                            mi miVar = mfVar2.f42483j;
                            try {
                                mfVar2.m.b(i10, lz.CANCEL);
                                synchronized (mf.this) {
                                    mf.this.f42491t.remove(Integer.valueOf(i10));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (mf.this) {
                try {
                    ml mlVarD = mf.this.d(i10);
                    if (mlVarD == null) {
                        if (mf.this.f42489r) {
                            return;
                        }
                        mf mfVar2 = mf.this;
                        if (i10 <= mfVar2.f42475b) {
                            return;
                        }
                        if (i10 % 2 == mfVar2.f42482i % 2) {
                            return;
                        }
                        final ml mlVar = new ml(i10, mf.this, false, z10, kz.e(list));
                        mf mfVar3 = mf.this;
                        mfVar3.f42475b = i10;
                        mfVar3.f42478e.put(Integer.valueOf(i10), mlVar);
                        mf.f42473q.execute(new lb("OkHttp %s stream %d", new Object[]{mf.this.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.d.3
                            @Override // com.facetec.sdk.lb
                            public final void d() {
                                try {
                                    mf.this.f42476c.b(mlVar);
                                } catch (IOException e5) {
                                    mu muVarI = mu.i();
                                    StringBuilder sb2 = new StringBuilder("Http2Connection.Listener failure for ");
                                    sb2.append(mf.this.f42477d);
                                    muVarI.a(4, sb2.toString(), e5);
                                    try {
                                        mlVar.c(lz.PROTOCOL_ERROR);
                                    } catch (IOException unused2) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    if (!ml.f42577n && Thread.holdsLock(mlVarD)) {
                        throw new AssertionError();
                    }
                    synchronized (mlVarD) {
                        mlVarD.f42586i = true;
                        mlVarD.f42580c.add(kz.e(list));
                        zC = mlVarD.c();
                        mlVarD.notifyAll();
                    }
                    if (!zC) {
                        mlVarD.f42579b.e(mlVarD.f42578a);
                    }
                    if (z10) {
                        mlVarD.j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facetec.sdk.lb
        public final void d() throws Throwable {
            lz lzVar;
            lz lzVar2;
            lz lzVar3 = lz.INTERNAL_ERROR;
            try {
                try {
                    mk mkVar = this.f42531e;
                    if (!mkVar.f42569c) {
                        nh nhVar = mkVar.f42568b;
                        nj njVar = md.f42459a;
                        nj njVarA = nhVar.a(njVar.g());
                        Logger logger = mk.f42566e;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(kz.e("<< CONNECTION %s", njVarA.d()));
                        }
                        if (!njVar.equals(njVarA)) {
                            throw md.e("Expected a connection header but was %s", njVarA.b());
                        }
                    } else if (!mkVar.a(true, this)) {
                        throw md.e("Required SETTINGS preface not received", new Object[0]);
                    }
                    while (this.f42531e.a(false, this)) {
                    }
                    lzVar2 = lz.NO_ERROR;
                    try {
                        try {
                            mf.this.b(lzVar2, lz.CANCEL);
                        } catch (IOException unused) {
                            lz lzVar4 = lz.PROTOCOL_ERROR;
                            mf.this.b(lzVar4, lzVar4);
                        }
                    } catch (Throwable th2) {
                        lzVar = lzVar2;
                        th = th2;
                        try {
                            mf.this.b(lzVar, lzVar3);
                        } catch (IOException unused2) {
                        }
                        kz.a(this.f42531e);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                lzVar2 = lzVar3;
            } catch (Throwable th3) {
                th = th3;
                lzVar = lzVar3;
                mf.this.b(lzVar, lzVar3);
                kz.a(this.f42531e);
                throw th;
            }
            kz.a(this.f42531e);
        }

        @Override // com.facetec.sdk.mk.b
        public final void e(int i10, long j10) {
            if (i10 == 0) {
                synchronized (mf.this) {
                    mf mfVar = mf.this;
                    mfVar.f42487o += j10;
                    mfVar.notifyAll();
                }
                return;
            }
            ml mlVarD = mf.this.d(i10);
            if (mlVarD != null) {
                synchronized (mlVarD) {
                    mlVarD.a(j10);
                }
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void d(int i10, nj njVar) {
            ml[] mlVarArr;
            njVar.g();
            synchronized (mf.this) {
                mlVarArr = (ml[]) mf.this.f42478e.values().toArray(new ml[mf.this.f42478e.size()]);
                mf.f(mf.this);
            }
            for (ml mlVar : mlVarArr) {
                if (mlVar.e() > i10 && mlVar.b()) {
                    mlVar.e(lz.REFUSED_STREAM);
                    mf.this.e(mlVar.e());
                }
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void c(final mn mnVar) {
            try {
                mf.this.f42479f.execute(new lb("OkHttp %s ACK Settings", new Object[]{mf.this.f42477d}) { // from class: com.facetec.sdk.mf.d.5

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ boolean f42536c = false;

                    @Override // com.facetec.sdk.lb
                    public final void d() {
                        ml[] mlVarArr;
                        long j10;
                        final d dVar = d.this;
                        boolean z10 = this.f42536c;
                        mn mnVar2 = mnVar;
                        synchronized (mf.this.m) {
                            synchronized (mf.this) {
                                try {
                                    int iD = mf.this.f42484k.d();
                                    if (z10) {
                                        mn mnVar3 = mf.this.f42484k;
                                        mnVar3.f42605c = 0;
                                        Arrays.fill(mnVar3.f42604b, 0);
                                    }
                                    mn mnVar4 = mf.this.f42484k;
                                    for (int i10 = 0; i10 < 10; i10++) {
                                        if (mnVar2.b(i10)) {
                                            mnVar4.c(i10, mnVar2.d(i10));
                                        }
                                    }
                                    int iD2 = mf.this.f42484k.d();
                                    mlVarArr = null;
                                    if (iD2 == -1 || iD2 == iD) {
                                        j10 = 0;
                                    } else {
                                        j10 = iD2 - iD;
                                        if (!mf.this.f42478e.isEmpty()) {
                                            mlVarArr = (ml[]) mf.this.f42478e.values().toArray(new ml[mf.this.f42478e.size()]);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            try {
                                mf mfVar = mf.this;
                                mfVar.m.b(mfVar.f42484k);
                            } catch (IOException unused) {
                                mf.this.a();
                            }
                        }
                        if (mlVarArr != null) {
                            for (ml mlVar : mlVarArr) {
                                synchronized (mlVar) {
                                    mlVar.a(j10);
                                }
                            }
                        }
                        mf.f42473q.execute(new lb("OkHttp %s settings", mf.this.f42477d) { // from class: com.facetec.sdk.mf.d.2
                            @Override // com.facetec.sdk.lb
                            public final void d() {
                                mf mfVar2 = mf.this;
                                mfVar2.f42476c.e(mfVar2);
                            }
                        });
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void c(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    mf.this.f42479f.execute(mf.this.new e(i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (mf.this) {
                try {
                    if (i10 == 1) {
                        mf.h(mf.this);
                    } else if (i10 == 2) {
                        mf.j(mf.this);
                    } else if (i10 == 3) {
                        mf.i(mf.this);
                        mf.this.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facetec.sdk.mk.b
        public final void b(final int i10, final List<mg> list) {
            final mf mfVar = mf.this;
            synchronized (mfVar) {
                try {
                    if (mfVar.f42491t.contains(Integer.valueOf(i10))) {
                        mfVar.e(i10, lz.PROTOCOL_ERROR);
                        return;
                    }
                    mfVar.f42491t.add(Integer.valueOf(i10));
                    try {
                        mfVar.a(new lb("OkHttp %s Push Request[%s]", new Object[]{mfVar.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.2
                            @Override // com.facetec.sdk.lb
                            public final void d() {
                                mf mfVar2 = mf.this;
                                mi miVar = mfVar2.f42483j;
                                try {
                                    mfVar2.m.b(i10, lz.CANCEL);
                                    synchronized (mf.this) {
                                        mf.this.f42491t.remove(Integer.valueOf(i10));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            lz lzVar = lz.PROTOCOL_ERROR;
            b(lzVar, lzVar);
        } catch (IOException unused) {
        }
    }

    public final synchronized void a(lb lbVar) {
        if (!this.f42489r) {
            this.f42488p.execute(lbVar);
        }
    }

    public final synchronized boolean b(long j10) {
        if (this.f42489r) {
            return false;
        }
        return this.f42481h >= this.f42480g || j10 < this.f42486n;
    }

    public final void e(final int i10, final lz lzVar) {
        try {
            this.f42479f.execute(new lb("OkHttp %s stream %d", new Object[]{this.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.1
                @Override // com.facetec.sdk.lb
                public final void d() {
                    try {
                        mf.this.d(i10, lzVar);
                    } catch (IOException unused) {
                        mf.this.a();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e(final int i10, final long j10) {
        try {
            this.f42479f.execute(new lb("OkHttp Window Update %s stream %d", new Object[]{this.f42477d, Integer.valueOf(i10)}) { // from class: com.facetec.sdk.mf.5
                @Override // com.facetec.sdk.lb
                public final void d() {
                    try {
                        mf.this.m.a(i10, j10);
                    } catch (IOException unused) {
                        mf.this.a();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f42528o = new b() { // from class: com.facetec.sdk.mf.b.4
            @Override // com.facetec.sdk.mf.b
            public final void b(ml mlVar) throws IOException {
                mlVar.c(lz.REFUSED_STREAM);
            }
        };

        public abstract void b(ml mlVar) throws IOException;

        public void e(mf mfVar) {
        }
    }

    public final void e() throws IOException {
        this.m.e();
    }

    private void e(lz lzVar) throws IOException {
        synchronized (this.m) {
            synchronized (this) {
                if (this.f42489r) {
                    return;
                }
                this.f42489r = true;
                this.m.b(this.f42475b, lzVar, kz.f42208c);
            }
        }
    }
}
