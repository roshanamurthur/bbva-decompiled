package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import tc.k;

/* JADX INFO: loaded from: classes9.dex */
public class Engine implements tc.e, MemoryCache.ResourceRemovedListener, f.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f38178i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc.h f38179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc.g f38180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MemoryCache f38181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f38182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f38183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f38184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f38185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.a f38186h;

    public class LoadStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e<?> f38187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceCallback f38188b;

        public LoadStatus(ResourceCallback resourceCallback, e<?> eVar) {
            this.f38188b = resourceCallback;
            this.f38187a = eVar;
        }

        public void cancel() {
            synchronized (Engine.this) {
                this.f38187a.h(this.f38188b);
            }
        }
    }

    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d.e f38190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pools.Pool<d<?>> f38191b = FactoryPools.threadSafe(150, new C0169a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38192c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.Engine$a$a, reason: collision with other inner class name */
        public class C0169a implements FactoryPools.Factory<d<?>> {
            public C0169a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final d<?> create() {
                a aVar = a.this;
                return new d<>(aVar.f38190a, aVar.f38191b);
            }
        }

        public a(c cVar) {
            this.f38190a = cVar;
        }
    }

    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GlideExecutor f38194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GlideExecutor f38195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlideExecutor f38196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GlideExecutor f38197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final tc.e f38198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f.a f38199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Pools.Pool<e<?>> f38200g = FactoryPools.threadSafe(150, new a());

        public class a implements FactoryPools.Factory<e<?>> {
            public a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final e<?> create() {
                b bVar = b.this;
                return new e<>(bVar.f38194a, bVar.f38195b, bVar.f38196c, bVar.f38197d, bVar.f38198e, bVar.f38199f, bVar.f38200g);
            }
        }

        public b(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, tc.e eVar, f.a aVar) {
            this.f38194a = glideExecutor;
            this.f38195b = glideExecutor2;
            this.f38196c = glideExecutor3;
            this.f38197d = glideExecutor4;
            this.f38198e = eVar;
            this.f38199f = aVar;
        }
    }

    public static class c implements d.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DiskCache.Factory f38202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile DiskCache f38203b;

        public c(DiskCache.Factory factory) {
            this.f38202a = factory;
        }

        public final DiskCache a() {
            if (this.f38203b == null) {
                synchronized (this) {
                    try {
                        if (this.f38203b == null) {
                            this.f38203b = this.f38202a.build();
                        }
                        if (this.f38203b == null) {
                            this.f38203b = new DiskCacheAdapter();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f38203b;
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z10) {
        this.f38181c = memoryCache;
        c cVar = new c(factory);
        this.f38184f = cVar;
        com.bumptech.glide.load.engine.a aVar = new com.bumptech.glide.load.engine.a(z10);
        this.f38186h = aVar;
        synchronized (this) {
            synchronized (aVar) {
                aVar.f38220e = this;
            }
        }
        this.f38180b = new tc.g();
        this.f38179a = new tc.h();
        this.f38182d = new b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this);
        this.f38185g = new a(cVar);
        this.f38183e = new k();
        memoryCache.setResourceRemovedListener(this);
    }

    @Nullable
    public final f<?> a(tc.f fVar, boolean z10, long j10) {
        f<?> fVar2;
        f<?> fVar3;
        if (!z10) {
            return null;
        }
        com.bumptech.glide.load.engine.a aVar = this.f38186h;
        synchronized (aVar) {
            com.bumptech.glide.load.engine.a.b bVar = (com.bumptech.glide.load.engine.a.b) aVar.f38218c.get(fVar);
            if (bVar == null) {
                fVar2 = null;
            } else {
                fVar2 = bVar.get();
                if (fVar2 == null) {
                    aVar.b(bVar);
                }
            }
        }
        if (fVar2 != null) {
            fVar2.a();
        }
        if (fVar2 != null) {
            if (f38178i) {
                LogTime.getElapsedMillis(j10);
                Objects.toString(fVar);
            }
            return fVar2;
        }
        Resource<?> resourceRemove = this.f38181c.remove(fVar);
        if (resourceRemove == null) {
            fVar3 = null;
        } else {
            fVar3 = resourceRemove instanceof f ? (f) resourceRemove : new f<>(resourceRemove, true, true, fVar, this);
        }
        if (fVar3 != null) {
            fVar3.a();
            this.f38186h.a(fVar, fVar3);
        }
        if (fVar3 == null) {
            return null;
        }
        if (f38178i) {
            LogTime.getElapsedMillis(j10);
            Objects.toString(fVar);
        }
        return fVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> LoadStatus b(GlideContext glideContext, Object obj, Key key, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z10, boolean z11, Options options, boolean z12, boolean z13, boolean z14, boolean z15, ResourceCallback resourceCallback, Executor executor, tc.f fVar, long j10) {
        tc.h hVar = this.f38179a;
        e eVar = (e) (z15 ? hVar.f93518b : hVar.f93517a).get(fVar);
        if (eVar != null) {
            eVar.a(resourceCallback, executor);
            if (f38178i) {
                LogTime.getElapsedMillis(j10);
                Objects.toString(fVar);
            }
            return new LoadStatus(resourceCallback, eVar);
        }
        e eVar2 = (e) Preconditions.checkNotNull(this.f38182d.f38200g.acquire());
        synchronized (eVar2) {
            eVar2.F0 = fVar;
            eVar2.G0 = z12;
            eVar2.H0 = z13;
            eVar2.I0 = z14;
            eVar2.J0 = z15;
        }
        a aVar = this.f38185g;
        d<R> dVar = (d) Preconditions.checkNotNull(aVar.f38191b.acquire());
        int i12 = aVar.f38192c;
        aVar.f38192c = i12 + 1;
        com.bumptech.glide.load.engine.c<R> cVar = dVar.f38318p0;
        cVar.f38267c = glideContext;
        cVar.f38268d = obj;
        cVar.f38277n = key;
        cVar.f38269e = i10;
        cVar.f38270f = i11;
        cVar.f38279p = diskCacheStrategy;
        cVar.f38271g = cls;
        cVar.f38272h = dVar.f38321s0;
        cVar.f38275k = cls2;
        cVar.f38278o = priority;
        cVar.f38273i = options;
        cVar.f38274j = map;
        cVar.f38280q = z10;
        cVar.f38281r = z11;
        dVar.f38324w0 = glideContext;
        dVar.f38325x0 = key;
        dVar.f38326y0 = priority;
        dVar.E0 = fVar;
        dVar.F0 = i10;
        dVar.G0 = i11;
        dVar.H0 = diskCacheStrategy;
        dVar.O0 = z15;
        dVar.I0 = options;
        dVar.J0 = eVar2;
        dVar.K0 = i12;
        dVar.M0 = d.g.INITIALIZE;
        dVar.P0 = obj;
        tc.h hVar2 = this.f38179a;
        hVar2.getClass();
        (eVar2.J0 ? hVar2.f93518b : hVar2.f93517a).put(fVar, eVar2);
        eVar2.a(resourceCallback, executor);
        eVar2.i(dVar);
        if (f38178i) {
            LogTime.getElapsedMillis(j10);
            Objects.toString(fVar);
        }
        return new LoadStatus(resourceCallback, eVar2);
    }

    public void clearDiskCache() {
        this.f38184f.a().clear();
    }

    public <R> LoadStatus load(GlideContext glideContext, Object obj, Key key, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z10, boolean z11, Options options, boolean z12, boolean z13, boolean z14, boolean z15, ResourceCallback resourceCallback, Executor executor) {
        long logTime = f38178i ? LogTime.getLogTime() : 0L;
        this.f38180b.getClass();
        tc.f fVar = new tc.f(obj, key, i10, i11, map, cls, cls2, options);
        synchronized (this) {
            try {
                f<?> fVarA = a(fVar, z12, logTime);
                if (fVarA == null) {
                    return b(glideContext, obj, key, i10, i11, cls, cls2, priority, diskCacheStrategy, map, z10, z11, options, z12, z13, z14, z15, resourceCallback, executor, fVar, logTime);
                }
                resourceCallback.onResourceReady(fVarA, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tc.e
    public synchronized void onEngineJobCancelled(e<?> eVar, Key key) {
        tc.h hVar = this.f38179a;
        hVar.getClass();
        HashMap map = eVar.J0 ? hVar.f93518b : hVar.f93517a;
        if (eVar.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // tc.e
    public synchronized void onEngineJobComplete(e<?> eVar, Key key, f<?> fVar) {
        if (fVar != null) {
            try {
                if (fVar.f38371p0) {
                    this.f38186h.a(key, fVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        tc.h hVar = this.f38179a;
        hVar.getClass();
        HashMap map = eVar.J0 ? hVar.f93518b : hVar.f93517a;
        if (eVar.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void onResourceReleased(Key key, f<?> fVar) {
        com.bumptech.glide.load.engine.a aVar = this.f38186h;
        synchronized (aVar) {
            com.bumptech.glide.load.engine.a.b bVar = (com.bumptech.glide.load.engine.a.b) aVar.f38218c.remove(key);
            if (bVar != null) {
                bVar.f38225c = null;
                bVar.clear();
            }
        }
        if (fVar.f38371p0) {
            this.f38181c.put(key, fVar);
        } else {
            this.f38183e.a(fVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public void onResourceRemoved(@NonNull Resource<?> resource) {
        this.f38183e.a(resource, true);
    }

    public void release(Resource<?> resource) {
        if (!(resource instanceof f)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((f) resource).b();
    }

    @VisibleForTesting
    public void shutdown() {
        b bVar = this.f38182d;
        Executors.shutdownAndAwaitTermination(bVar.f38194a);
        Executors.shutdownAndAwaitTermination(bVar.f38195b);
        Executors.shutdownAndAwaitTermination(bVar.f38196c);
        Executors.shutdownAndAwaitTermination(bVar.f38197d);
        c cVar = this.f38184f;
        synchronized (cVar) {
            if (cVar.f38203b != null) {
                cVar.f38203b.clear();
            }
        }
        com.bumptech.glide.load.engine.a aVar = this.f38186h;
        aVar.f38221f = true;
        Executor executor = aVar.f38217b;
        if (executor instanceof ExecutorService) {
            Executors.shutdownAndAwaitTermination((ExecutorService) executor);
        }
    }
}
