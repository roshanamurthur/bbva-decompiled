package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Objects;
import tc.i;

/* JADX INFO: compiled from: DecodeJob.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d<R> implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable<d<?>>, FactoryPools.Poolable {
    public tc.f E0;
    public int F0;
    public int G0;
    public DiskCacheStrategy H0;
    public Options I0;
    public b<R> J0;
    public int K0;
    public h L0;
    public g M0;
    public long N0;
    public boolean O0;
    public Object P0;
    public Thread Q0;
    public Key R0;
    public Key S0;
    public Object T0;
    public DataSource U0;
    public DataFetcher<?> V0;
    public volatile DataFetcherGenerator W0;
    public volatile boolean X0;
    public volatile boolean Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final e f38321s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Pools.Pool<d<?>> f38322t0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public GlideContext f38324w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Key f38325x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Priority f38326y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c<R> f38318p0 = new com.bumptech.glide.load.engine.c<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f38319q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final StateVerifier f38320r0 = StateVerifier.newInstance();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final C0172d<?> f38323u0 = new C0172d<>();
    public final f v0 = new f();

    /* JADX INFO: compiled from: DecodeJob.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f38329c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f38329c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38329c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f38328b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38328b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38328b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38328b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38328b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f38327a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38327a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38327a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: DecodeJob.java */
    public interface b<R> {
    }

    /* JADX INFO: compiled from: DecodeJob.java */
    public final class c<Z> implements DecodePath.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource f38330a;

        public c(DataSource dataSource) {
            this.f38330a = dataSource;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DecodeJob.java */
    public static class C0172d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Key f38332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ResourceEncoder<Z> f38333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i<Z> f38334c;

        public final void a(e eVar, Options options) {
            GlideTrace.beginSection("DecodeJob.encode");
            try {
                ((Engine.c) eVar).a().put(this.f38332a, new tc.d(this.f38333b, this.f38334c, options));
            } finally {
                this.f38334c.a();
                GlideTrace.endSection();
            }
        }
    }

    /* JADX INFO: compiled from: DecodeJob.java */
    public interface e {
    }

    /* JADX INFO: compiled from: DecodeJob.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38337c;

        public final boolean a() {
            return (this.f38337c || this.f38336b) && this.f38335a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DecodeJob.java */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g DECODE_DATA;
        public static final g INITIALIZE;
        public static final g SWITCH_TO_SOURCE_SERVICE;

        static {
            g gVar = new g("INITIALIZE", 0);
            INITIALIZE = gVar;
            g gVar2 = new g("SWITCH_TO_SOURCE_SERVICE", 1);
            SWITCH_TO_SOURCE_SERVICE = gVar2;
            g gVar3 = new g("DECODE_DATA", 2);
            DECODE_DATA = gVar3;
            $VALUES = new g[]{gVar, gVar2, gVar3};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DecodeJob.java */
    public static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h DATA_CACHE;
        public static final h ENCODE;
        public static final h FINISHED;
        public static final h INITIALIZE;
        public static final h RESOURCE_CACHE;
        public static final h SOURCE;

        static {
            h hVar = new h("INITIALIZE", 0);
            INITIALIZE = hVar;
            h hVar2 = new h("RESOURCE_CACHE", 1);
            RESOURCE_CACHE = hVar2;
            h hVar3 = new h("DATA_CACHE", 2);
            DATA_CACHE = hVar3;
            h hVar4 = new h("SOURCE", 3);
            SOURCE = hVar4;
            h hVar5 = new h("ENCODE", 4);
            ENCODE = hVar5;
            h hVar6 = new h("FINISHED", 5);
            FINISHED = hVar6;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        }

        public h() {
            throw null;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }
    }

    public d(e eVar, Pools.Pool<d<?>> pool) {
        this.f38321s0 = eVar;
        this.f38322t0 = pool;
    }

    public final <Data> Resource<R> a(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        com.bumptech.glide.load.engine.c<R> cVar = this.f38318p0;
        LoadPath loadPath = cVar.f38267c.getRegistry().getLoadPath(cls, cVar.f38271g, cVar.f38275k);
        Options options = this.I0;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z10 = dataSource == DataSource.RESOURCE_DISK_CACHE || cVar.f38281r;
            Option<Boolean> option = Downsampler.ALLOW_HARDWARE_CONFIG;
            Boolean bool = (Boolean) options.get(option);
            if (bool == null || (bool.booleanValue() && !z10)) {
                options = new Options();
                options.putAll(this.I0);
                options.set(option, Boolean.valueOf(z10));
            }
        }
        Options options2 = options;
        DataRewinder<Data> rewinder = this.f38324w0.getRegistry().getRewinder(data);
        try {
            return loadPath.load(rewinder, options2, this.F0, this.G0, new c(dataSource));
        } finally {
            rewinder.cleanup();
        }
    }

    public final void b() {
        Resource<R> resourceA;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.N0;
            String str = "data: " + this.T0 + ", cache key: " + this.R0 + ", fetcher: " + this.V0;
            LogTime.getElapsedMillis(j10);
            Objects.toString(this.E0);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        i iVar = null;
        try {
            DataFetcher<?> dataFetcher = this.V0;
            Object obj = this.T0;
            DataSource dataSource = this.U0;
            if (obj == null) {
                dataFetcher.cleanup();
                resourceA = null;
            } else {
                try {
                    long logTime = LogTime.getLogTime();
                    resourceA = a(obj, dataSource);
                    if (Log.isLoggable("DecodeJob", 2)) {
                        Objects.toString(resourceA);
                        LogTime.getElapsedMillis(logTime);
                        Objects.toString(this.E0);
                        Thread.currentThread().getName();
                    }
                    dataFetcher.cleanup();
                } catch (Throwable th2) {
                    dataFetcher.cleanup();
                    throw th2;
                }
            }
        } catch (GlideException e5) {
            Key key = this.S0;
            DataSource dataSource2 = this.U0;
            e5.f38205q0 = key;
            e5.f38206r0 = dataSource2;
            e5.f38207s0 = null;
            this.f38319q0.add(e5);
        }
        if (resourceA == null) {
            k();
            return;
        }
        DataSource dataSource3 = this.U0;
        boolean z10 = this.Z0;
        GlideTrace.beginSection("DecodeJob.notifyEncodeAndRelease");
        try {
            if (resourceA instanceof Initializable) {
                ((Initializable) resourceA).initialize();
            }
            if (this.f38323u0.f38334c != null) {
                iVar = (i) Preconditions.checkNotNull(i.f93519t0.acquire());
                iVar.f93523s0 = false;
                iVar.f93522r0 = true;
                iVar.f93521q0 = resourceA;
                resourceA = iVar;
            }
            m();
            com.bumptech.glide.load.engine.e eVar = (com.bumptech.glide.load.engine.e) this.J0;
            synchronized (eVar) {
                eVar.K0 = resourceA;
                eVar.L0 = dataSource3;
                eVar.S0 = z10;
            }
            eVar.f();
            this.L0 = h.ENCODE;
            try {
                C0172d<?> c0172d = this.f38323u0;
                if (c0172d.f38334c != null) {
                    c0172d.a(this.f38321s0, this.I0);
                }
                if (iVar != null) {
                    iVar.a();
                }
                f();
                GlideTrace.endSection();
            } catch (Throwable th3) {
                if (iVar != null) {
                    iVar.a();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            GlideTrace.endSection();
            throw th4;
        }
    }

    public final DataFetcherGenerator c() {
        int i10 = a.f38328b[this.L0.ordinal()];
        com.bumptech.glide.load.engine.c<R> cVar = this.f38318p0;
        if (i10 == 1) {
            return new com.bumptech.glide.load.engine.g(cVar, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.b(cVar.a(), cVar, this);
        }
        if (i10 == 3) {
            return new com.bumptech.glide.load.engine.h(cVar, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.L0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull d<?> dVar) {
        d<?> dVar2 = dVar;
        int iOrdinal = this.f38326y0.ordinal() - dVar2.f38326y0.ordinal();
        return iOrdinal == 0 ? this.K0 - dVar2.K0 : iOrdinal;
    }

    public final h d(h hVar) {
        int i10 = a.f38328b[hVar.ordinal()];
        if (i10 == 1) {
            return this.H0.decodeCachedData() ? h.DATA_CACHE : d(h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.O0 ? h.FINISHED : h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return h.FINISHED;
        }
        if (i10 == 5) {
            return this.H0.decodeCachedResource() ? h.RESOURCE_CACHE : d(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    public final void e() {
        m();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f38319q0));
        com.bumptech.glide.load.engine.e eVar = (com.bumptech.glide.load.engine.e) this.J0;
        synchronized (eVar) {
            eVar.N0 = glideException;
        }
        eVar.e();
        g();
    }

    public final void f() {
        boolean zA;
        f fVar = this.v0;
        synchronized (fVar) {
            fVar.f38336b = true;
            zA = fVar.a();
        }
        if (zA) {
            i();
        }
    }

    public final void g() {
        boolean zA;
        f fVar = this.v0;
        synchronized (fVar) {
            fVar.f38337c = true;
            zA = fVar.a();
        }
        if (zA) {
            i();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public final StateVerifier getVerifier() {
        return this.f38320r0;
    }

    public final void h() {
        boolean zA;
        f fVar = this.v0;
        synchronized (fVar) {
            fVar.f38335a = true;
            zA = fVar.a();
        }
        if (zA) {
            i();
        }
    }

    public final void i() {
        f fVar = this.v0;
        synchronized (fVar) {
            fVar.f38336b = false;
            fVar.f38335a = false;
            fVar.f38337c = false;
        }
        C0172d<?> c0172d = this.f38323u0;
        c0172d.f38332a = null;
        c0172d.f38333b = null;
        c0172d.f38334c = null;
        com.bumptech.glide.load.engine.c<R> cVar = this.f38318p0;
        cVar.f38267c = null;
        cVar.f38268d = null;
        cVar.f38277n = null;
        cVar.f38271g = null;
        cVar.f38275k = null;
        cVar.f38273i = null;
        cVar.f38278o = null;
        cVar.f38274j = null;
        cVar.f38279p = null;
        cVar.f38265a.clear();
        cVar.f38276l = false;
        cVar.f38266b.clear();
        cVar.m = false;
        this.X0 = false;
        this.f38324w0 = null;
        this.f38325x0 = null;
        this.I0 = null;
        this.f38326y0 = null;
        this.E0 = null;
        this.J0 = null;
        this.L0 = null;
        this.W0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        this.N0 = 0L;
        this.Y0 = false;
        this.P0 = null;
        this.f38319q0.clear();
        this.f38322t0.release(this);
    }

    public final void j(g gVar) {
        GlideExecutor glideExecutor;
        this.M0 = gVar;
        com.bumptech.glide.load.engine.e eVar = (com.bumptech.glide.load.engine.e) this.J0;
        if (eVar.H0) {
            glideExecutor = eVar.f38345x0;
        } else {
            glideExecutor = eVar.I0 ? eVar.f38346y0 : eVar.f38344w0;
        }
        glideExecutor.execute(this);
    }

    public final void k() {
        this.Q0 = Thread.currentThread();
        this.N0 = LogTime.getLogTime();
        boolean zA = false;
        while (!this.Y0 && this.W0 != null && !(zA = this.W0.a())) {
            this.L0 = d(this.L0);
            this.W0 = c();
            if (this.L0 == h.SOURCE) {
                j(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.L0 == h.FINISHED || this.Y0) && !zA) {
            e();
        }
    }

    public final void l() {
        int i10 = a.f38327a[this.M0.ordinal()];
        if (i10 == 1) {
            this.L0 = d(h.INITIALIZE);
            this.W0 = c();
            k();
        } else if (i10 == 2) {
            k();
        } else if (i10 == 3) {
            b();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.M0);
        }
    }

    public final void m() {
        this.f38320r0.throwIfRecycled();
        if (this.X0) {
            throw new IllegalStateException("Already notified", this.f38319q0.isEmpty() ? null : (Throwable) androidx.appcompat.view.menu.b.b(this.f38319q0, 1));
        }
        this.X0 = true;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> dataClass = dataFetcher.getDataClass();
        glideException.f38205q0 = key;
        glideException.f38206r0 = dataSource;
        glideException.f38207s0 = dataClass;
        this.f38319q0.add(glideException);
        if (Thread.currentThread() != this.Q0) {
            j(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            k();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.R0 = key;
        this.T0 = obj;
        this.V0 = dataFetcher;
        this.U0 = dataSource;
        this.S0 = key2;
        this.Z0 = key != this.f38318p0.a().get(0);
        if (Thread.currentThread() != this.Q0) {
            j(g.DECODE_DATA);
            return;
        }
        GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
        try {
            b();
        } finally {
            GlideTrace.endSection();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void reschedule() {
        j(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GlideTrace.beginSectionFormat("DecodeJob#run(reason=%s, model=%s)", this.M0, this.P0);
        DataFetcher<?> dataFetcher = this.V0;
        try {
            try {
                try {
                    if (this.Y0) {
                        e();
                        if (dataFetcher != null) {
                            dataFetcher.cleanup();
                        }
                        GlideTrace.endSection();
                        return;
                    }
                    l();
                    if (dataFetcher != null) {
                        dataFetcher.cleanup();
                    }
                    GlideTrace.endSection();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.L0);
                    }
                    if (this.L0 != h.ENCODE) {
                        this.f38319q0.add(th2);
                        e();
                    }
                    if (!this.Y0) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (tc.b e5) {
                throw e5;
            }
        } catch (Throwable th3) {
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            GlideTrace.endSection();
            throw th3;
        }
    }
}
