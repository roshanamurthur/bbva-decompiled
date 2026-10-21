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
public final class ObservableInterval extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f72536p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72537q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f72538r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f72539s0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f72540p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f72541q0;

        public a(Observer<? super Long> observer) {
            this.f72540p0 = observer;
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
            if (get() != DisposableHelper.DISPOSED) {
                long j10 = this.f72541q0;
                this.f72541q0 = 1 + j10;
                this.f72540p0.onNext(Long.valueOf(j10));
            }
        }
    }

    public ObservableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.f72537q0 = j10;
        this.f72538r0 = j11;
        this.f72539s0 = timeUnit;
        this.f72536p0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        Scheduler scheduler = this.f72536p0;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.setOnce(aVar, scheduler.schedulePeriodicallyDirect(aVar, this.f72537q0, this.f72538r0, this.f72539s0));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        DisposableHelper.setOnce(aVar, workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.f72537q0, this.f72538r0, this.f72539s0);
    }
}
