package com.salesforce.marketingcloud.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f64343c = "~!SdkExecutors";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f64344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f64345b;

    public class a implements RejectedExecutionHandler {
        public a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            com.salesforce.marketingcloud.g.e(l.f64343c, "Fixed Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    public class b implements RejectedExecutionHandler {
        public b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            com.salesforce.marketingcloud.g.e(l.f64343c, "Cached Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    public l() {
        this(Executors.newFixedThreadPool(1), Executors.newCachedThreadPool());
    }

    @NonNull
    public ExecutorService a() {
        return this.f64345b;
    }

    @NonNull
    public ExecutorService b() {
        return this.f64344a;
    }

    public void c() {
        List<Runnable> listShutdownNow;
        List<Runnable> listShutdownNow2;
        if (!this.f64344a.isShutdown()) {
            this.f64344a.shutdown();
        }
        if (!this.f64345b.isShutdown()) {
            this.f64345b.shutdown();
        }
        try {
            ExecutorService executorService = this.f64344a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit) && (listShutdownNow2 = this.f64344a.shutdownNow()) != null && !listShutdownNow2.isEmpty()) {
                com.salesforce.marketingcloud.g.b(f64343c, "Shutdown DiskIO executor with %d tasks pending", Integer.valueOf(listShutdownNow2.size()));
            }
            if (this.f64345b.awaitTermination(5L, timeUnit) || (listShutdownNow = this.f64345b.shutdownNow()) == null || listShutdownNow.isEmpty()) {
                return;
            }
            com.salesforce.marketingcloud.g.b(f64343c, "Shutdown CachedExecutor executor with %d tasks pending", Integer.valueOf(listShutdownNow.size()));
        } catch (InterruptedException e5) {
            com.salesforce.marketingcloud.g.b(f64343c, e5, "Unable to complete executors", new Object[0]);
        }
    }

    @VisibleForTesting
    public l(@NonNull ExecutorService executorService, @NonNull ExecutorService executorService2) {
        if (executorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService).setRejectedExecutionHandler(new a());
        }
        this.f64344a = executorService;
        if (executorService2 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService2).setRejectedExecutionHandler(new b());
        }
        this.f64345b = executorService2;
    }
}
