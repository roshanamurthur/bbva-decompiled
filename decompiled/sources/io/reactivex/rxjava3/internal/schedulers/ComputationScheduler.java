package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.ListCompositeDisposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final b f77915s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final RxThreadFactory f77916t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f77917u0;
    public static final c v0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ThreadFactory f77918q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<b> f77919r0;

    public static final class b implements SchedulerMultiWorkerSupport {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f77925p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c[] f77926q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f77927r0;

        public b(ThreadFactory threadFactory, int i10) {
            this.f77925p0 = i10;
            this.f77926q0 = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f77926q0[i11] = new c(threadFactory);
            }
        }

        public final c a() {
            int i10 = this.f77925p0;
            if (i10 == 0) {
                return ComputationScheduler.v0;
            }
            long j10 = this.f77927r0;
            this.f77927r0 = 1 + j10;
            return this.f77926q0[(int) (j10 % ((long) i10))];
        }

        public final void b() {
            for (c cVar : this.f77926q0) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerMultiWorkerSupport
        public final void createWorkers(int i10, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i11 = this.f77925p0;
            if (i11 == 0) {
                for (int i12 = 0; i12 < i10; i12++) {
                    workerCallback.onWorker(i12, ComputationScheduler.v0);
                }
                return;
            }
            int i13 = ((int) this.f77927r0) % i11;
            for (int i14 = 0; i14 < i10; i14++) {
                workerCallback.onWorker(i14, new a(this.f77926q0[i13]));
                i13++;
                if (i13 == i11) {
                    i13 = 0;
                }
            }
            this.f77927r0 = i13;
        }
    }

    public static final class c extends NewThreadWorker {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f77917u0 = iAvailableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        v0 = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f77916t0 = rxThreadFactory;
        b bVar = new b(rxThreadFactory, 0);
        f77915s0 = bVar;
        bVar.b();
    }

    public ComputationScheduler() {
        this(f77916t0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a(this.f77919r0.get().a());
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i10, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i10, "number > 0 required");
        this.f77919r0.get().createWorkers(i10, workerCallback);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f77919r0.get().a().scheduleDirect(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f77919r0.get().a().schedulePeriodicallyDirect(runnable, j10, j11, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void shutdown() {
        AtomicReference<b> atomicReference = this.f77919r0;
        b bVar = f77915s0;
        b andSet = atomicReference.getAndSet(bVar);
        if (andSet != bVar) {
            andSet.b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public void start() {
        b bVar;
        b bVar2 = new b(this.f77918q0, f77917u0);
        AtomicReference<b> atomicReference = this.f77919r0;
        do {
            bVar = f77915s0;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        bVar2.b();
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.f77918q0 = threadFactory;
        this.f77919r0 = new AtomicReference<>(f77915s0);
        start();
    }

    public static final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ListCompositeDisposable f77920p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f77921q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ListCompositeDisposable f77922r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final c f77923s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f77924t0;

        public a(c cVar) {
            this.f77923s0 = cVar;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f77920p0 = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f77921q0 = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f77922r0 = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77924t0) {
                return;
            }
            this.f77924t0 = true;
            this.f77922r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77924t0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            return this.f77924t0 ? EmptyDisposable.INSTANCE : this.f77923s0.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f77920p0);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (this.f77924t0) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f77923s0.scheduleActual(runnable, j10, timeUnit, this.f77921q0);
        }
    }
}
