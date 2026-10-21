package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f72542p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72543q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f72544r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f72545s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f72546t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final TimeUnit f72547u0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f72548p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72549q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72550r0;

        public a(Observer<? super Long> observer, long j10, long j11) {
            this.f72548p0 = observer;
            this.f72550r0 = j10;
            this.f72549q0 = j11;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            long j10 = this.f72550r0;
            Long lValueOf = Long.valueOf(j10);
            Observer<? super Long> observer = this.f72548p0;
            observer.onNext(lValueOf);
            if (j10 != this.f72549q0) {
                this.f72550r0 = j10 + 1;
            } else {
                DisposableHelper.dispose(this);
                observer.onComplete();
            }
        }
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        this.f72545s0 = j12;
        this.f72546t0 = j13;
        this.f72547u0 = timeUnit;
        this.f72542p0 = scheduler;
        this.f72543q0 = j10;
        this.f72544r0 = j11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer, this.f72543q0, this.f72544r0);
        observer.onSubscribe(aVar);
        Scheduler scheduler = this.f72542p0;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.setOnce(aVar, scheduler.schedulePeriodicallyDirect(aVar, this.f72545s0, this.f72546t0, this.f72547u0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(aVar, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f72545s0, this.f72546t0, this.f72547u0);
    }
}
