package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73583p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f73584q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73585p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f73586q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73587r0;

        public a(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f73585p0 = singleObserver;
            this.f73586q0 = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f73587r0 = andSet;
                this.f73586q0.scheduleDirect(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73585p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73585p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73585p0.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f73587r0.dispose();
        }
    }

    public SingleUnsubscribeOn(SingleSource<T> singleSource, Scheduler scheduler) {
        this.f73583p0 = singleSource;
        this.f73584q0 = scheduler;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73583p0.subscribe(new a(singleObserver, this.f73584q0));
    }
}
