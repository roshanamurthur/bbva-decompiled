package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f76828p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76829q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f76830r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f76831s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f76832t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final TimeUnit f76833u0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f76834p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76835q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f76836r0;

        public a(Observer<? super Long> observer, long j10, long j11) {
            this.f76834p0 = observer;
            this.f76836r0 = j10;
            this.f76835q0 = j11;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            long j10 = this.f76836r0;
            Long lValueOf = Long.valueOf(j10);
            Observer<? super Long> observer = this.f76834p0;
            observer.onNext(lValueOf);
            if (j10 != this.f76835q0) {
                this.f76836r0 = j10 + 1;
                return;
            }
            if (!isDisposed()) {
                observer.onComplete();
            }
            DisposableHelper.dispose(this);
        }
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        this.f76831s0 = j12;
        this.f76832t0 = j13;
        this.f76833u0 = timeUnit;
        this.f76828p0 = scheduler;
        this.f76829q0 = j10;
        this.f76830r0 = j11;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer, this.f76829q0, this.f76830r0);
        observer.onSubscribe(aVar);
        Scheduler scheduler = this.f76828p0;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.setOnce(aVar, scheduler.schedulePeriodicallyDirect(aVar, this.f76831s0, this.f76832t0, this.f76833u0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(aVar, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f76831s0, this.f76832t0, this.f76833u0);
    }
}
