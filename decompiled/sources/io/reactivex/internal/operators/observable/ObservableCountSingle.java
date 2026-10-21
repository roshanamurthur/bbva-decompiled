package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72247p0;

    public static final class a implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f72248p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72249q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72250r0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f72248p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72249q0.dispose();
            this.f72249q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72249q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72249q0 = DisposableHelper.DISPOSED;
            this.f72248p0.onSuccess(Long.valueOf(this.f72250r0));
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72249q0 = DisposableHelper.DISPOSED;
            this.f72248p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f72250r0++;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72249q0, disposable)) {
                this.f72249q0 = disposable;
                this.f72248p0.onSubscribe(this);
            }
        }
    }

    public ObservableCountSingle(ObservableSource<T> observableSource) {
        this.f72247p0 = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Long> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.f72247p0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f72247p0.subscribe(new a(singleObserver));
    }
}
