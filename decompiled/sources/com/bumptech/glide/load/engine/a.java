package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f38217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f38218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<f<?>> f38219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.a f38220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f38221f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class ThreadFactoryC0170a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        public class RunnableC0171a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Runnable f38222p0;

            public RunnableC0171a(Runnable runnable) {
                this.f38222p0 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                this.f38222p0.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0171a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    @VisibleForTesting
    public static final class b extends WeakReference<f<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Key f38223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f38224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Resource<?> f38225c;

        public b(@NonNull Key key, @NonNull f<?> fVar, @NonNull ReferenceQueue<? super f<?>> referenceQueue, boolean z10) {
            super(fVar, referenceQueue);
            this.f38223a = (Key) Preconditions.checkNotNull(key);
            this.f38225c = (fVar.f38371p0 && z10) ? (Resource) Preconditions.checkNotNull(fVar.f38373r0) : null;
            this.f38224b = fVar.f38371p0;
        }
    }

    public a(boolean z10) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0170a());
        this.f38218c = new HashMap();
        this.f38219d = new ReferenceQueue<>();
        this.f38216a = z10;
        this.f38217b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new tc.a(this));
    }

    public final synchronized void a(Key key, f<?> fVar) {
        b bVar = (b) this.f38218c.put(key, new b(key, fVar, this.f38219d, this.f38216a));
        if (bVar != null) {
            bVar.f38225c = null;
            bVar.clear();
        }
    }

    public final void b(@NonNull b bVar) {
        Resource<?> resource;
        synchronized (this) {
            this.f38218c.remove(bVar.f38223a);
            if (bVar.f38224b && (resource = bVar.f38225c) != null) {
                this.f38220e.onResourceReleased(bVar.f38223a, new f<>(resource, true, false, bVar.f38223a, this.f38220e));
            }
        }
    }
}
