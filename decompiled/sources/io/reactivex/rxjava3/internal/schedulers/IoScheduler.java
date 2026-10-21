package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
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
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final RxThreadFactory f77951s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final RxThreadFactory f77952t0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final c f77954w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a f77955x0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ThreadFactory f77956q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<a> f77957r0;
    public static final TimeUnit v0 = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final long f77953u0 = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f77958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f77959q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f77960r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ScheduledExecutorService f77961s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ScheduledFuture f77962t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ThreadFactory f77963u0;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f77958p0 = nanos;
            this.f77959q0 = new ConcurrentLinkedQueue<>();
            this.f77960r0 = new CompositeDisposable();
            this.f77963u0 = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.f77952t0);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f77961s0 = scheduledExecutorServiceNewScheduledThreadPool;
            this.f77962t0 = scheduledFutureScheduleWithFixedDelay;
        }

        public final void a() {
            this.f77960r0.dispose();
            ScheduledFuture scheduledFuture = this.f77962t0;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f77961s0;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f77959q0;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.f77968r0 > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    this.f77960r0.remove(cVar);
                }
            }
        }
    }

    public static final class b extends Scheduler.Worker {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a f77965q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c f77966r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f77967s0 = new AtomicBoolean();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f77964p0 = new CompositeDisposable();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f77965q0 = aVar;
            CompositeDisposable compositeDisposable = aVar.f77960r0;
            if (compositeDisposable.isDisposed()) {
                cVar2 = IoScheduler.f77954w0;
            } else {
                do {
                    ConcurrentLinkedQueue<c> concurrentLinkedQueue = aVar.f77959q0;
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar = new c(aVar.f77963u0);
                        compositeDisposable.add(cVar);
                        break;
                    }
                    cVar = concurrentLinkedQueue.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.f77966r0 = cVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77967s0.compareAndSet(false, true)) {
                this.f77964p0.dispose();
                a aVar = this.f77965q0;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.f77958p0;
                c cVar = this.f77966r0;
                cVar.f77968r0 = jNanoTime;
                aVar.f77959q0.offer(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77967s0.get();
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            return this.f77964p0.isDisposed() ? EmptyDisposable.INSTANCE : this.f77966r0.scheduleActual(runnable, j10, timeUnit, this.f77964p0);
        }
    }

    public static final class c extends NewThreadWorker {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f77968r0;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f77968r0 = 0L;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f77954w0 = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f77951s0 = rxThreadFactory;
        f77952t0 = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        f77955x0 = aVar;
        aVar.a();
    }

    public IoScheduler() {
        this(f77951s0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new b(this.f77957r0.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void shutdown() {
        AtomicReference<a> atomicReference = this.f77957r0;
        a aVar = f77955x0;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.a();
        }
    }

    public int size() {
        return this.f77957r0.get().f77960r0.size();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void start() {
        a aVar;
        a aVar2 = new a(f77953u0, v0, this.f77956q0);
        AtomicReference<a> atomicReference = this.f77957r0;
        do {
            aVar = f77955x0;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.a();
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.f77956q0 = threadFactory;
        this.f77957r0 = new AtomicReference<>(f77955x0);
        start();
    }
}
