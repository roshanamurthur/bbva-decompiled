package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimer extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f73041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f73042q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f73043r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f73044p0;

        public a(Observer<? super Long> observer) {
            this.f73044p0 = observer;
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
            Observer<? super Long> observer = this.f73044p0;
            observer.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            observer.onComplete();
        }
    }

    public ObservableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f73042q0 = j10;
        this.f73043r0 = timeUnit;
        this.f73041p0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        DisposableHelper.trySet(aVar, this.f73041p0.scheduleDirect(aVar, this.f73042q0, this.f73043r0));
    }
}
