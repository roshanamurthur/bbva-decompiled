package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e<R> implements com.bumptech.glide.load.engine.d.b<R>, FactoryPools.Poolable {
    public static final c T0 = new c();
    public final AtomicInteger E0;
    public Key F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public Resource<?> K0;
    public DataSource L0;
    public boolean M0;
    public GlideException N0;
    public boolean O0;
    public f<?> P0;
    public com.bumptech.glide.load.engine.d<R> Q0;
    public volatile boolean R0;
    public boolean S0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final C0173e f38338p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final StateVerifier f38339q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final f.a f38340r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Pools.Pool<e<?>> f38341s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final c f38342t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final tc.e f38343u0;
    public final GlideExecutor v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final GlideExecutor f38344w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final GlideExecutor f38345x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final GlideExecutor f38346y0;

    /* JADX INFO: compiled from: EngineJob.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ResourceCallback f38347p0;

        public a(ResourceCallback resourceCallback) {
            this.f38347p0 = resourceCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f38347p0.getLock()) {
                synchronized (e.this) {
                    try {
                        C0173e c0173e = e.this.f38338p0;
                        ResourceCallback resourceCallback = this.f38347p0;
                        c0173e.getClass();
                        if (c0173e.f38353p0.contains(new d(resourceCallback, Executors.directExecutor()))) {
                            e eVar = e.this;
                            ResourceCallback resourceCallback2 = this.f38347p0;
                            eVar.getClass();
                            try {
                                resourceCallback2.onLoadFailed(eVar.N0);
                            } catch (Throwable th2) {
                                throw new tc.b(th2);
                            }
                        }
                        e.this.b();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ResourceCallback f38349p0;

        public b(ResourceCallback resourceCallback) {
            this.f38349p0 = resourceCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f38349p0.getLock()) {
                synchronized (e.this) {
                    try {
                        C0173e c0173e = e.this.f38338p0;
                        ResourceCallback resourceCallback = this.f38349p0;
                        c0173e.getClass();
                        if (c0173e.f38353p0.contains(new d(resourceCallback, Executors.directExecutor()))) {
                            e.this.P0.a();
                            e eVar = e.this;
                            ResourceCallback resourceCallback2 = this.f38349p0;
                            eVar.getClass();
                            try {
                                resourceCallback2.onResourceReady(eVar.P0, eVar.L0, eVar.S0);
                                e.this.h(this.f38349p0);
                            } catch (Throwable th2) {
                                throw new tc.b(th2);
                            }
                        }
                        e.this.b();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    @VisibleForTesting
    public static class c {
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResourceCallback f38351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f38352b;

        public d(ResourceCallback resourceCallback, Executor executor) {
            this.f38351a = resourceCallback;
            this.f38352b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f38351a.equals(((d) obj).f38351a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f38351a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class C0173e implements Iterable<d> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final List<d> f38353p0;

        public C0173e(ArrayList arrayList) {
            this.f38353p0 = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.f38353p0.iterator();
        }
    }

    @VisibleForTesting
    public e() {
        throw null;
    }

    public e(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, tc.e eVar, f.a aVar, Pools.Pool<e<?>> pool) {
        c cVar = T0;
        this.f38338p0 = new C0173e(new ArrayList(2));
        this.f38339q0 = StateVerifier.newInstance();
        this.E0 = new AtomicInteger();
        this.v0 = glideExecutor;
        this.f38344w0 = glideExecutor2;
        this.f38345x0 = glideExecutor3;
        this.f38346y0 = glideExecutor4;
        this.f38343u0 = eVar;
        this.f38340r0 = aVar;
        this.f38341s0 = pool;
        this.f38342t0 = cVar;
    }

    public final synchronized void a(ResourceCallback resourceCallback, Executor executor) {
        try {
            this.f38339q0.throwIfRecycled();
            C0173e c0173e = this.f38338p0;
            c0173e.getClass();
            c0173e.f38353p0.add(new d(resourceCallback, executor));
            if (this.M0) {
                c(1);
                executor.execute(new b(resourceCallback));
            } else if (this.O0) {
                c(1);
                executor.execute(new a(resourceCallback));
            } else {
                Preconditions.checkArgument(!this.R0, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        f<?> fVar;
        synchronized (this) {
            try {
                this.f38339q0.throwIfRecycled();
                Preconditions.checkArgument(d(), "Not yet complete!");
                int iDecrementAndGet = this.E0.decrementAndGet();
                Preconditions.checkArgument(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    fVar = this.P0;
                    g();
                } else {
                    fVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public final synchronized void c(int i10) {
        f<?> fVar;
        Preconditions.checkArgument(d(), "Not yet complete!");
        if (this.E0.getAndAdd(i10) == 0 && (fVar = this.P0) != null) {
            fVar.a();
        }
    }

    public final boolean d() {
        return this.O0 || this.M0 || this.R0;
    }

    public final void e() {
        synchronized (this) {
            try {
                this.f38339q0.throwIfRecycled();
                if (this.R0) {
                    g();
                    return;
                }
                if (this.f38338p0.f38353p0.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.O0) {
                    throw new IllegalStateException("Already failed once");
                }
                this.O0 = true;
                Key key = this.F0;
                C0173e c0173e = this.f38338p0;
                c0173e.getClass();
                ArrayList<d> arrayList = new ArrayList(c0173e.f38353p0);
                c(arrayList.size() + 1);
                this.f38343u0.onEngineJobComplete(this, key, null);
                for (d dVar : arrayList) {
                    dVar.f38352b.execute(new a(dVar.f38351a));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this) {
            try {
                this.f38339q0.throwIfRecycled();
                if (this.R0) {
                    this.K0.recycle();
                    g();
                    return;
                }
                if (this.f38338p0.f38353p0.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.M0) {
                    throw new IllegalStateException("Already have resource");
                }
                c cVar = this.f38342t0;
                Resource<?> resource = this.K0;
                boolean z10 = this.G0;
                Key key = this.F0;
                f.a aVar = this.f38340r0;
                cVar.getClass();
                this.P0 = new f<>(resource, z10, true, key, aVar);
                this.M0 = true;
                C0173e c0173e = this.f38338p0;
                c0173e.getClass();
                ArrayList<d> arrayList = new ArrayList(c0173e.f38353p0);
                c(arrayList.size() + 1);
                this.f38343u0.onEngineJobComplete(this, this.F0, this.P0);
                for (d dVar : arrayList) {
                    dVar.f38352b.execute(new b(dVar.f38351a));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void g() {
        if (this.F0 == null) {
            throw new IllegalArgumentException();
        }
        this.f38338p0.f38353p0.clear();
        this.F0 = null;
        this.P0 = null;
        this.K0 = null;
        this.O0 = false;
        this.R0 = false;
        this.M0 = false;
        this.S0 = false;
        this.Q0.h();
        this.Q0 = null;
        this.N0 = null;
        this.L0 = null;
        this.f38341s0.release(this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public final StateVerifier getVerifier() {
        return this.f38339q0;
    }

    public final synchronized void h(ResourceCallback resourceCallback) {
        try {
            this.f38339q0.throwIfRecycled();
            C0173e c0173e = this.f38338p0;
            c0173e.getClass();
            c0173e.f38353p0.remove(new d(resourceCallback, Executors.directExecutor()));
            if (this.f38338p0.f38353p0.isEmpty()) {
                if (!d()) {
                    this.R0 = true;
                    com.bumptech.glide.load.engine.d<R> dVar = this.Q0;
                    dVar.Y0 = true;
                    DataFetcherGenerator dataFetcherGenerator = dVar.W0;
                    if (dataFetcherGenerator != null) {
                        dataFetcherGenerator.cancel();
                    }
                    this.f38343u0.onEngineJobCancelled(this, this.F0);
                }
                if (this.M0 || this.O0) {
                    if (this.E0.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(com.bumptech.glide.load.engine.d<R> dVar) {
        GlideExecutor glideExecutor;
        this.Q0 = dVar;
        com.bumptech.glide.load.engine.d.h hVarD = dVar.d(com.bumptech.glide.load.engine.d.h.INITIALIZE);
        if (hVarD == com.bumptech.glide.load.engine.d.h.RESOURCE_CACHE || hVarD == com.bumptech.glide.load.engine.d.h.DATA_CACHE) {
            glideExecutor = this.v0;
        } else if (this.H0) {
            glideExecutor = this.f38345x0;
        } else {
            glideExecutor = this.I0 ? this.f38346y0 : this.f38344w0;
        }
        glideExecutor.execute(dVar);
    }
}
