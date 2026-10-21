package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f77873q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77874p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f77875q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77876r0;

        public a(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f77874p0 = singleObserver;
            this.f77875q0 = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f77876r0 = andSet;
                this.f77875q0.scheduleDirect(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77874p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f77874p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77874p0.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77876r0.dispose();
        }
    }

    public SingleUnsubscribeOn(SingleSource<T> singleSource, Scheduler scheduler) {
        this.f77872p0 = singleSource;
        this.f77873q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77872p0.subscribe(new a(singleObserver, this.f77873q0));
    }
}
