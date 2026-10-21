package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimer extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f77318p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77319q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f77320r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f77321p0;

        public a(Observer<? super Long> observer) {
            this.f77321p0 = observer;
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
            Observer<? super Long> observer = this.f77321p0;
            observer.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            observer.onComplete();
        }
    }

    public ObservableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f77319q0 = j10;
        this.f77320r0 = timeUnit;
        this.f77318p0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        DisposableHelper.trySet(aVar, this.f77318p0.scheduleDirect(aVar, this.f77319q0, this.f77320r0));
    }
}
