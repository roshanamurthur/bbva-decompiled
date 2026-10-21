package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class GlideExecutor implements ExecutorService {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f38354q0 = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static volatile int f38355r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ExecutorService f38356p0;

    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f38357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public ThreadFactory f38360d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public UncaughtThrowableStrategy f38361e = UncaughtThrowableStrategy.DEFAULT;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f38362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f38363g;

        public Builder(boolean z10) {
            this.f38357a = z10;
        }

        public GlideExecutor build() {
            if (TextUtils.isEmpty(this.f38362f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f38362f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f38358b, this.f38359c, this.f38363g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f38360d, this.f38362f, this.f38361e, this.f38357a));
            if (this.f38363g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new GlideExecutor(threadPoolExecutor);
        }

        public Builder setName(String str) {
            this.f38362f = str;
            return this;
        }

        public Builder setThreadCount(@IntRange(from = 1) int i10) {
            this.f38358b = i10;
            this.f38359c = i10;
            return this;
        }

        @Deprecated
        public Builder setThreadFactory(@NonNull ThreadFactory threadFactory) {
            this.f38360d = threadFactory;
            return this;
        }

        public Builder setThreadTimeoutMillis(long j10) {
            this.f38363g = j10;
            return this;
        }

        public Builder setUncaughtThrowableStrategy(@NonNull UncaughtThrowableStrategy uncaughtThrowableStrategy) {
            this.f38361e = uncaughtThrowableStrategy;
            return this;
        }
    }

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$a$a, reason: collision with other inner class name */
        public class C0174a extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new C0174a(runnable);
        }
    }

    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ThreadFactory f38364p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f38365q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final UncaughtThrowableStrategy f38366r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f38367s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f38368t0 = new AtomicInteger();

        public class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Runnable f38369p0;

            public a(Runnable runnable) {
                this.f38369p0 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f38367s0) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f38369p0.run();
                } catch (Throwable th2) {
                    bVar.f38366r0.handle(th2);
                }
            }
        }

        public b(ThreadFactory threadFactory, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z10) {
            this.f38364p0 = threadFactory;
            this.f38365q0 = str;
            this.f38366r0 = uncaughtThrowableStrategy;
            this.f38367s0 = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f38364p0.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f38365q0 + "-thread-" + this.f38368t0.getAndIncrement());
            return threadNewThread;
        }
    }

    @VisibleForTesting
    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.f38356p0 = threadPoolExecutor;
    }

    public static int calculateBestThreadCount() {
        if (f38355r0 == 0) {
            f38355r0 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f38355r0;
    }

    public static Builder newAnimationBuilder() {
        return new Builder(true).setThreadCount(calculateBestThreadCount() >= 4 ? 2 : 1).setName("animation");
    }

    public static GlideExecutor newAnimationExecutor() {
        return newAnimationBuilder().build();
    }

    public static Builder newDiskCacheBuilder() {
        return new Builder(true).setThreadCount(1).setName("disk-cache");
    }

    public static GlideExecutor newDiskCacheExecutor() {
        return newDiskCacheBuilder().build();
    }

    public static Builder newSourceBuilder() {
        return new Builder(false).setThreadCount(calculateBestThreadCount()).setName("source");
    }

    public static GlideExecutor newSourceExecutor() {
        return newSourceBuilder().build();
    }

    public static GlideExecutor newUnlimitedSourceExecutor() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f38354q0, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(new a(), "source-unlimited", UncaughtThrowableStrategy.DEFAULT, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f38356p0.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f38356p0.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f38356p0.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f38356p0.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f38356p0.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f38356p0.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f38356p0.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f38356p0.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f38356p0.submit(runnable);
    }

    public String toString() {
        return this.f38356p0.toString();
    }

    @Deprecated
    public static GlideExecutor newAnimationExecutor(int i10, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newAnimationBuilder().setThreadCount(i10).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f38356p0.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f38356p0.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t10) {
        return this.f38356p0.submit(runnable, t10);
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(int i10, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(int i10, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f38356p0.submit(callable);
    }

    public interface UncaughtThrowableStrategy {
        public static final UncaughtThrowableStrategy DEFAULT;
        public static final UncaughtThrowableStrategy IGNORE = new a();
        public static final UncaughtThrowableStrategy LOG;
        public static final UncaughtThrowableStrategy THROW;

        public class c implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public final void handle(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            LOG = bVar;
            THROW = new c();
            DEFAULT = bVar;
        }

        void handle(Throwable th2);

        public class a implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public final void handle(Throwable th2) {
            }
        }

        public class b implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public final void handle(Throwable th2) {
            }
        }
    }
}
