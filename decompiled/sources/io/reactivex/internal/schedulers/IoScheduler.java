package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class IoScheduler extends Scheduler {
    public static final a E0;
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final RxThreadFactory f73661t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final RxThreadFactory f73662u0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final c f73664x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final boolean f73665y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ThreadFactory f73666r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<a> f73667s0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final TimeUnit f73663w0 = TimeUnit.SECONDS;
    public static final long v0 = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f73668p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f73669q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f73670r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ScheduledExecutorService f73671s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ScheduledFuture f73672t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ThreadFactory f73673u0;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f73668p0 = nanos;
            this.f73669q0 = new ConcurrentLinkedQueue<>();
            this.f73670r0 = new CompositeDisposable();
            this.f73673u0 = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.f73662u0);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f73671s0 = scheduledExecutorServiceNewScheduledThreadPool;
            this.f73672t0 = scheduledFutureScheduleWithFixedDelay;
        }

        public final void a() {
            this.f73670r0.dispose();
            ScheduledFuture scheduledFuture = this.f73672t0;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f73671s0;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f73669q0;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.f73678r0 > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    this.f73670r0.remove(cVar);
                }
            }
        }
    }

    public static final class b extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a f73675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c f73676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f73677s0 = new AtomicBoolean();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f73674p0 = new CompositeDisposable();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f73675q0 = aVar;
            CompositeDisposable compositeDisposable = aVar.f73670r0;
            if (compositeDisposable.isDisposed()) {
                cVar2 = IoScheduler.f73664x0;
            } else {
                do {
                    ConcurrentLinkedQueue<c> concurrentLinkedQueue = aVar.f73669q0;
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar = new c(aVar.f73673u0);
                        compositeDisposable.add(cVar);
                        break;
                    }
                    cVar = concurrentLinkedQueue.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.f73676r0 = cVar2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f73677s0.compareAndSet(false, true)) {
                this.f73674p0.dispose();
                if (IoScheduler.f73665y0) {
                    this.f73676r0.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.f73675q0;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.f73668p0;
                c cVar = this.f73676r0;
                cVar.f73678r0 = jNanoTime;
                aVar.f73669q0.offer(cVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73677s0.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f73675q0;
            aVar.getClass();
            long jNanoTime = System.nanoTime() + aVar.f73668p0;
            c cVar = this.f73676r0;
            cVar.f73678r0 = jNanoTime;
            aVar.f73669q0.offer(cVar);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            return this.f73674p0.isDisposed() ? EmptyDisposable.INSTANCE : this.f73676r0.scheduleActual(runnable, j10, timeUnit, this.f73674p0);
        }
    }

    public static final class c extends NewThreadWorker {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f73678r0;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f73678r0 = 0L;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f73664x0 = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f73661t0 = rxThreadFactory;
        f73662u0 = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        f73665y0 = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, rxThreadFactory);
        E0 = aVar;
        aVar.a();
    }

    public IoScheduler() {
        this(f73661t0);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new b(this.f73667s0.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        while (true) {
            AtomicReference<a> atomicReference = this.f73667s0;
            a aVar = atomicReference.get();
            a aVar2 = E0;
            if (aVar == aVar2) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(aVar, aVar2)) {
                    aVar.a();
                    return;
                }
            } while (atomicReference.get() == aVar);
        }
    }

    public int size() {
        return this.f73667s0.get().f73670r0.size();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        a aVar;
        a aVar2 = new a(v0, f73663w0, this.f73666r0);
        AtomicReference<a> atomicReference = this.f73667s0;
        do {
            aVar = E0;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.a();
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.f73666r0 = threadFactory;
        this.f73667s0 = new AtomicReference<>(E0);
        start();
    }
}
