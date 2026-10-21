package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76528p0;

    public static final class a implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f76529p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76530q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f76531r0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f76529p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76530q0.dispose();
            this.f76530q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76530q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76530q0 = DisposableHelper.DISPOSED;
            this.f76529p0.onSuccess(Long.valueOf(this.f76531r0));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76530q0 = DisposableHelper.DISPOSED;
            this.f76529p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f76531r0++;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76530q0, disposable)) {
                this.f76530q0 = disposable;
                this.f76529p0.onSubscribe(this);
            }
        }
    }

    public ObservableCountSingle(ObservableSource<T> observableSource) {
        this.f76528p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<Long> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.f76528p0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f76528p0.subscribe(new a(singleObserver));
    }
}
