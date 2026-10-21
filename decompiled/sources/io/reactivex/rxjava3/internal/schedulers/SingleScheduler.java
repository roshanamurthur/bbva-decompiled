package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleScheduler extends Scheduler {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final RxThreadFactory f78000s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final ScheduledExecutorService f78001t0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ThreadFactory f78002q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f78003r0;

    public static final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ScheduledExecutorService f78004p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f78005q0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f78006r0;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f78004p0 = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f78006r0) {
                return;
            }
            this.f78006r0 = true;
            this.f78005q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f78006r0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (this.f78006r0) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.f78005q0);
            this.f78005q0.add(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j10 <= 0 ? this.f78004p0.submit((Callable) scheduledRunnable) : this.f78004p0.schedule((Callable) scheduledRunnable, j10, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e5) {
                dispose();
                RxJavaPlugins.onError(e5);
                return EmptyDisposable.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f78001t0 = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f78000s0 = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        this(f78000s0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a(this.f78003r0.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        AtomicReference<ScheduledExecutorService> atomicReference = this.f78003r0;
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? atomicReference.get().submit(scheduledDirectTask) : atomicReference.get().schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e5) {
            RxJavaPlugins.onError(e5);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.f78003r0;
        if (j11 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableOnSchedule);
            try {
                scheduledDirectPeriodicTask.setFuture(atomicReference.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e5) {
                RxJavaPlugins.onError(e5);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        c cVar = new c(runnableOnSchedule, scheduledExecutorService);
        try {
            cVar.a(j10 <= 0 ? scheduledExecutorService.submit(cVar) : scheduledExecutorService.schedule(cVar, j10, timeUnit));
            return cVar;
        } catch (RejectedExecutionException e7) {
            RxJavaPlugins.onError(e7);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void shutdown() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f78003r0;
        ScheduledExecutorService scheduledExecutorService = f78001t0;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void start() {
        ScheduledExecutorService scheduledExecutorServiceCreate = null;
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = this.f78003r0;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != f78001t0) {
                if (scheduledExecutorServiceCreate != null) {
                    scheduledExecutorServiceCreate.shutdown();
                    return;
                }
                return;
            } else {
                if (scheduledExecutorServiceCreate == null) {
                    scheduledExecutorServiceCreate = SchedulerPoolFactory.create(this.f78002q0);
                }
                while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceCreate)) {
                    if (atomicReference.get() != scheduledExecutorService) {
                    }
                }
                return;
            }
        }
    }

    public SingleScheduler(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f78003r0 = atomicReference;
        this.f78002q0 = threadFactory;
        atomicReference.lazySet(SchedulerPoolFactory.create(threadFactory));
    }
}
