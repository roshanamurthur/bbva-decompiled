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
public final class ObservableInterval extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f76822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76823q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f76824r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f76825s0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f76826p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f76827q0;

        public a(Observer<? super Long> observer) {
            this.f76826p0 = observer;
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
            if (get() != DisposableHelper.DISPOSED) {
                long j10 = this.f76827q0;
                this.f76827q0 = 1 + j10;
                this.f76826p0.onNext(Long.valueOf(j10));
            }
        }
    }

    public ObservableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.f76823q0 = j10;
        this.f76824r0 = j11;
        this.f76825s0 = timeUnit;
        this.f76822p0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        Scheduler scheduler = this.f76822p0;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.setOnce(aVar, scheduler.schedulePeriodicallyDirect(aVar, this.f76823q0, this.f76824r0, this.f76825s0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(aVar, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f76823q0, this.f76824r0, this.f76825s0);
    }
}
