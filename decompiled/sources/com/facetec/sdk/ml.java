package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f42577n = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f42578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final mf f42579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Deque<kj> f42580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f42581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f42582e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f42583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final e f42584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final d f42585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f42586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final b f42587j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    lz f42588l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private mg.e f42589o;

    public class b extends nd {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static long f42590b = 406493924483140105L;

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:35:0x014e  */
        /* JADX WARN: Code duplicated, block: B:36:0x014f  */
        private static void l(String str, int i10, Object[] objArr) throws Throwable {
            Object method;
            Throwable cause;
            char[] charArray = str != null ? str.toCharArray() : str;
            gw gwVar = new gw();
            gwVar.f41836e = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            gwVar.f41835a = 0;
            while (true) {
                int i11 = gwVar.f41835a;
                if (i11 >= charArray.length) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(charArray[i11]), gwVar, gwVar};
                    Map map = bp.f40694x;
                    Object method2 = map.get(346539884);
                    if (method2 == null) {
                        method2 = ((Class) bp.a((ViewConfiguration.getEdgeSlop() >> 16) + 24, 245 - Gravity.getAbsoluteGravity(0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                        map.put(346539884, method2);
                    }
                    jArr[i11] = ((Long) ((Method) method2).invoke(null, objArr2)).longValue() ^ (f42590b ^ (-4932774504156859221L));
                    Object[] objArr3 = {gwVar, gwVar};
                    Object method3 = map.get(593077425);
                    if (method3 == null) {
                        method3 = ((Class) bp.a(23 - TextUtils.getOffsetBefore("", 0), 149 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.alpha(0))).getMethod("q", Object.class, Object.class);
                        map.put(593077425, method3);
                    }
                    ((Method) method3).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr = new char[length];
            gwVar.f41835a = 0;
            while (true) {
                int i12 = gwVar.f41835a;
                if (i12 >= charArray.length) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i12] = (char) jArr[i12];
                Object[] objArr4 = {gwVar, gwVar};
                Map map2 = bp.f40694x;
                Object obj = map2.get(593077425);
                if (obj != null) {
                    method = obj;
                } else {
                    method = ((Class) bp.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 24, 150 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0))).getMethod("q", Object.class, Object.class);
                    map2.put(593077425, method);
                }
                ((Method) method).invoke(null, objArr4);
            }
        }

        public final void b() throws IOException {
            if (a()) {
                throw d((IOException) null);
            }
        }

        @Override // com.facetec.sdk.nd
        public final IOException d(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.facetec.sdk.nd
        public final void e() {
            ml.this.d(lz.CANCEL);
            final mf mfVar = ml.this.f42579b;
            synchronized (mfVar) {
                try {
                    long j10 = mfVar.f42481h;
                    long j11 = mfVar.f42480g;
                    if (j10 < j11) {
                        return;
                    }
                    mfVar.f42480g = j11 + 1;
                    try {
                        Object[] objArr = new Object[1];
                        l("终\uda50㟲鍺\uecc0䠑ꖱﻉ婝랧ፏ沊젵□绍\uda52", 42132 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        l("绌艘蟺謜貚里镭雺", 64667 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                        mfVar.f42486n = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() + 1000000000;
                        try {
                            ScheduledExecutorService scheduledExecutorService = mfVar.f42479f;
                            final String str = "OkHttp %s ping";
                            final Object[] objArr3 = {mfVar.f42477d};
                            scheduledExecutorService.execute(new lb(str, objArr3) { // from class: com.facetec.sdk.mf.4
                                public AnonymousClass4(final String str2, final Object... objArr4) {
                                    super(str2, objArr4);
                                }

                                @Override // com.facetec.sdk.lb
                                public final void d() {
                                    mf.this.b(false, 2, 0);
                                }
                            });
                        } catch (RejectedExecutionException unused) {
                        }
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final class d implements ns {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static /* synthetic */ boolean f42592b = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final nb f42593a = new nb();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f42595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f42596e;

        public d() {
        }

        private void e(boolean z10) throws IOException {
            ml mlVar;
            long jMin;
            ml mlVar2;
            synchronized (ml.this) {
                ml.this.f42587j.d();
                while (true) {
                    try {
                        mlVar = ml.this;
                        if (mlVar.f42581d > 0 || this.f42596e || this.f42595d || mlVar.f42588l != null) {
                            break;
                        } else {
                            mlVar.i();
                        }
                    } catch (Throwable th2) {
                        ml.this.f42587j.b();
                        throw th2;
                    }
                }
                mlVar.f42587j.b();
                ml.this.g();
                jMin = Math.min(ml.this.f42581d, this.f42593a.b());
                mlVar2 = ml.this;
                mlVar2.f42581d -= jMin;
            }
            mlVar2.f42587j.d();
            try {
                ml mlVar3 = ml.this;
                mlVar3.f42579b.a(mlVar3.f42578a, z10 && jMin == this.f42593a.b(), this.f42593a, jMin);
            } finally {
                ml.this.f42587j.b();
            }
        }

        @Override // com.facetec.sdk.ns
        public final ny a() {
            return ml.this.f42587j;
        }

        @Override // com.facetec.sdk.ns
        public final void c(nb nbVar, long j10) throws Throwable {
            if (!f42592b && Thread.holdsLock(ml.this)) {
                throw new AssertionError();
            }
            this.f42593a.c(nbVar, j10);
            while (this.f42593a.b() >= 16384) {
                e(false);
            }
        }

        @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (!f42592b && Thread.holdsLock(ml.this)) {
                throw new AssertionError();
            }
            synchronized (ml.this) {
                if (this.f42595d) {
                    return;
                }
                if (!ml.this.f42585h.f42596e) {
                    if (this.f42593a.b() > 0) {
                        while (this.f42593a.b() > 0) {
                            e(true);
                        }
                    } else {
                        ml mlVar = ml.this;
                        mlVar.f42579b.a(mlVar.f42578a, true, null, 0L);
                    }
                }
                synchronized (ml.this) {
                    this.f42595d = true;
                }
                ml.this.f42579b.e();
                ml.this.h();
            }
        }

        @Override // com.facetec.sdk.ns, java.io.Flushable
        public final void flush() throws IOException {
            if (!f42592b && Thread.holdsLock(ml.this)) {
                throw new AssertionError();
            }
            synchronized (ml.this) {
                ml.this.g();
            }
            while (this.f42593a.b() > 0) {
                e(false);
                ml.this.f42579b.e();
            }
        }
    }

    public ml(int i10, mf mfVar, boolean z10, boolean z11, @Nullable kj kjVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f42580c = arrayDeque;
        this.f42583f = new b();
        this.f42587j = new b();
        this.f42588l = null;
        if (mfVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f42578a = i10;
        this.f42579b = mfVar;
        this.f42581d = mfVar.f42484k.d();
        e eVar = new e(mfVar.f42485l.d());
        this.f42584g = eVar;
        d dVar = new d();
        this.f42585h = dVar;
        eVar.f42600c = z11;
        dVar.f42596e = z10;
        if (kjVar != null) {
            arrayDeque.add(kjVar);
        }
        if (b() && kjVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!b() && kjVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final synchronized kj a() throws IOException {
        this.f42583f.d();
        while (this.f42580c.isEmpty() && this.f42588l == null) {
            try {
                i();
            } catch (Throwable th2) {
                this.f42583f.b();
                throw th2;
            }
        }
        this.f42583f.b();
        if (this.f42580c.isEmpty()) {
            throw new mo(this.f42588l);
        }
        return this.f42580c.removeFirst();
    }

    public final boolean b() {
        return this.f42579b.f42474a == ((this.f42578a & 1) == 1);
    }

    public final synchronized boolean c() {
        try {
            if (this.f42588l != null) {
                return false;
            }
            e eVar = this.f42584g;
            if (eVar.f42600c || eVar.f42599b) {
                d dVar = this.f42585h;
                if ((dVar.f42596e || dVar.f42595d) && this.f42586i) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void g() throws IOException {
        d dVar = this.f42585h;
        if (dVar.f42595d) {
            throw new IOException("stream closed");
        }
        if (dVar.f42596e) {
            throw new IOException("stream finished");
        }
        if (this.f42588l != null) {
            throw new mo(this.f42588l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b  */
    public final void h() throws IOException {
        boolean z10;
        boolean zC;
        if (!f42577n && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                e eVar = this.f42584g;
                if (eVar.f42600c || !eVar.f42599b) {
                    z10 = false;
                } else {
                    d dVar = this.f42585h;
                    if (dVar.f42596e || dVar.f42595d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zC = c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            c(lz.CANCEL);
        } else {
            if (zC) {
                return;
            }
            this.f42579b.e(this.f42578a);
        }
    }

    public final void i() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void j() {
        boolean zC;
        if (!f42577n && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f42584g.f42600c = true;
            zC = c();
            notifyAll();
        }
        if (zC) {
            return;
        }
        this.f42579b.e(this.f42578a);
    }

    public final ns d() {
        synchronized (this) {
            try {
                if (!this.f42586i && !b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f42585h;
    }

    public final int e() {
        return this.f42578a;
    }

    public final synchronized void e(lz lzVar) {
        if (this.f42588l == null) {
            this.f42588l = lzVar;
            notifyAll();
        }
    }

    public final void c(lz lzVar) throws IOException {
        if (a(lzVar)) {
            this.f42579b.d(this.f42578a, lzVar);
        }
    }

    public final void d(lz lzVar) {
        if (a(lzVar)) {
            this.f42579b.e(this.f42578a, lzVar);
        }
    }

    private boolean a(lz lzVar) {
        if (!f42577n && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f42588l != null) {
                    return false;
                }
                if (this.f42584g.f42600c && this.f42585h.f42596e) {
                    return false;
                }
                this.f42588l = lzVar;
                notifyAll();
                this.f42579b.e(this.f42578a);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(long j10) {
        this.f42581d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final class e implements nz {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static /* synthetic */ boolean f42597f = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f42599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42600c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f42602e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final nb f42601d = new nb();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nb f42598a = new nb();

        public e(long j10) {
            this.f42602e = j10;
        }

        @Override // com.facetec.sdk.nz
        public final ny a() {
            return ml.this.f42583f;
        }

        @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long jB;
            ArrayList<kj> arrayList;
            mg.e eVar;
            synchronized (ml.this) {
                try {
                    this.f42599b = true;
                    jB = this.f42598a.b();
                    this.f42598a.p();
                    if (ml.this.f42580c.isEmpty() || ml.this.f42589o == null) {
                        arrayList = null;
                        eVar = null;
                    } else {
                        arrayList = new ArrayList(ml.this.f42580c);
                        ml.this.f42580c.clear();
                        eVar = ml.this.f42589o;
                    }
                    ml.this.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (jB > 0) {
                d(jB);
            }
            ml.this.h();
            if (eVar != null) {
                for (kj kjVar : arrayList) {
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
        @Override // com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            long jD;
            kj kjVar;
            mg.e eVar;
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
            }
            while (true) {
                synchronized (ml.this) {
                    try {
                        ml.this.f42583f.d();
                        try {
                            ml mlVar = ml.this;
                            lz lzVar = mlVar.f42588l;
                            if (lzVar == null) {
                                lzVar = null;
                            }
                            if (this.f42599b) {
                                throw new IOException("stream closed");
                            }
                            if (!mlVar.f42580c.isEmpty() && ml.this.f42589o != null) {
                                kjVar = (kj) ml.this.f42580c.removeFirst();
                                eVar = ml.this.f42589o;
                            } else if (this.f42598a.b() > 0) {
                                nb nbVar2 = this.f42598a;
                                jD = nbVar2.d(nbVar, Math.min(j10, nbVar2.b()));
                                ml mlVar2 = ml.this;
                                long j11 = mlVar2.f42582e + jD;
                                mlVar2.f42582e = j11;
                                if (lzVar == null && j11 >= mlVar2.f42579b.f42485l.d() / 2) {
                                    ml mlVar3 = ml.this;
                                    mlVar3.f42579b.e(mlVar3.f42578a, mlVar3.f42582e);
                                    ml.this.f42582e = 0L;
                                }
                                kjVar = null;
                                eVar = null;
                                ml.this.f42583f.b();
                                if (kjVar != null || eVar == null) {
                                    if (jD != -1) {
                                        d(jD);
                                        return jD;
                                    }
                                    if (lzVar == null) {
                                        return -1L;
                                    }
                                    throw new mo(lzVar);
                                }
                            } else if (this.f42600c || lzVar != null) {
                                kjVar = null;
                                eVar = null;
                            } else {
                                ml.this.i();
                                ml.this.f42583f.b();
                            }
                            jD = -1;
                            ml.this.f42583f.b();
                            if (kjVar != null) {
                            }
                            if (jD != -1) {
                                d(jD);
                                return jD;
                            }
                            if (lzVar == null) {
                                return -1L;
                            }
                            throw new mo(lzVar);
                        } catch (Throwable th2) {
                            ml.this.f42583f.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        public final void d(long j10) {
            if (!f42597f && Thread.holdsLock(ml.this)) {
                throw new AssertionError();
            }
            ml.this.f42579b.c(j10);
        }
    }
}
