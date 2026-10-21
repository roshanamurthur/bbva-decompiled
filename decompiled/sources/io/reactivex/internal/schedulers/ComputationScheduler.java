package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final b f73626t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final RxThreadFactory f73627u0;
    public static final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final c f73628w0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ThreadFactory f73629r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<b> f73630s0;

    public static final class b implements SchedulerMultiWorkerSupport {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f73636p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c[] f73637q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f73638r0;

        public b(ThreadFactory threadFactory, int i10) {
            this.f73636p0 = i10;
            this.f73637q0 = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f73637q0[i11] = new c(threadFactory);
            }
        }

        public final c a() {
            int i10 = this.f73636p0;
            if (i10 == 0) {
                return ComputationScheduler.f73628w0;
            }
            long j10 = this.f73638r0;
            this.f73638r0 = 1 + j10;
            return this.f73637q0[(int) (j10 % ((long) i10))];
        }

        public final void b() {
            for (c cVar : this.f73637q0) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public final void createWorkers(int i10, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i11 = this.f73636p0;
            if (i11 == 0) {
                for (int i12 = 0; i12 < i10; i12++) {
                    workerCallback.onWorker(i12, ComputationScheduler.f73628w0);
                }
                return;
            }
            int i13 = ((int) this.f73638r0) % i11;
            for (int i14 = 0; i14 < i10; i14++) {
                workerCallback.onWorker(i14, new a(this.f73637q0[i13]));
                i13++;
                if (i13 == i11) {
                    i13 = 0;
                }
            }
            this.f73638r0 = i13;
        }
    }

    public static final class c extends NewThreadWorker {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        v0 = iAvailableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f73628w0 = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f73627u0 = rxThreadFactory;
        b bVar = new b(rxThreadFactory, 0);
        f73626t0 = bVar;
        bVar.b();
    }

    public ComputationScheduler() {
        this(f73627u0);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a(this.f73630s0.get().a());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i10, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i10, "number > 0 required");
        this.f73630s0.get().createWorkers(i10, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f73630s0.get().a().scheduleDirect(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f73630s0.get().a().schedulePeriodicallyDirect(runnable, j10, j11, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        while (true) {
            AtomicReference<b> atomicReference = this.f73630s0;
            b bVar = atomicReference.get();
            b bVar2 = f73626t0;
            if (bVar == bVar2) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar.b();
                    return;
                }
            } while (atomicReference.get() == bVar);
        }
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        b bVar;
        b bVar2 = new b(this.f73629r0, v0);
        AtomicReference<b> atomicReference = this.f73630s0;
        do {
            bVar = f73626t0;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        bVar2.b();
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.f73629r0 = threadFactory;
        this.f73630s0 = new AtomicReference<>(f73626t0);
        start();
    }

    public static final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ListCompositeDisposable f73631p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f73632q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ListCompositeDisposable f73633r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final c f73634s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f73635t0;

        public a(c cVar) {
            this.f73634s0 = cVar;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f73631p0 = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f73632q0 = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f73633r0 = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f73635t0) {
                return;
            }
            this.f73635t0 = true;
            this.f73633r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73635t0;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            return this.f73635t0 ? EmptyDisposable.INSTANCE : this.f73634s0.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f73631p0);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (this.f73635t0) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f73634s0.scheduleActual(runnable, j10, timeUnit, this.f73632q0);
        }
    }
}
