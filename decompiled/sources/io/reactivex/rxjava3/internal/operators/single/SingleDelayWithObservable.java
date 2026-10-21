package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<U> f77663q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77664p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f77665q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77666r0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f77664p0 = singleObserver;
            this.f77665q0 = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77666r0) {
                return;
            }
            this.f77666r0 = true;
            this.f77665q0.subscribe(new ResumeSingleObserver(this, this.f77664p0));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77666r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77666r0 = true;
                this.f77664p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(U u2) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f77664p0.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithObservable(SingleSource<T> singleSource, ObservableSource<U> observableSource) {
        this.f77662p0 = singleSource;
        this.f77663q0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77663q0.subscribe(new a(singleObserver, this.f77662p0));
    }
}
