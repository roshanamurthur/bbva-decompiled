package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f73691a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f73692b = new ConcurrentHashMap();

    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(SchedulerPoolFactory.f73692b.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.f73692b.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        boolean zEquals;
        int i10 = 1;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        PURGE_ENABLED = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                if (property2 != null) {
                    i10 = Integer.parseInt(property2);
                }
            } catch (Throwable unused2) {
            }
        }
        PURGE_PERIOD_SECONDS = i10;
        start();
    }

    public SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (PURGE_ENABLED && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f73692b.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = f73691a.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f73692b.clear();
    }

    public static void start() {
        if (!PURGE_ENABLED) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f73691a;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    a aVar = new a();
                    long j10 = PURGE_PERIOD_SECONDS;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, j10, j10, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
