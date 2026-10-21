package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCount<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Long> {

    public static final class a implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f76525p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76526q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f76527r0;

        public a(Observer<? super Long> observer) {
            this.f76525p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76526q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76526q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Long lValueOf = Long.valueOf(this.f76527r0);
            Observer<? super Long> observer = this.f76525p0;
            observer.onNext(lValueOf);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76525p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f76527r0++;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76526q0, disposable)) {
                this.f76526q0 = disposable;
                this.f76525p0.onSubscribe(this);
            }
        }
    }

    public ObservableCount(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        this.source.subscribe(new a(observer));
    }
}
