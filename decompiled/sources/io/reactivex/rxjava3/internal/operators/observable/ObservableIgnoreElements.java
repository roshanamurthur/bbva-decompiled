package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIgnoreElements<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer));
    }

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76791p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76792q0;

        public a(Observer<? super T> observer) {
            this.f76791p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76792q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76792q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76791p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76791p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f76792q0 = disposable;
            this.f76791p0.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
        }
    }
}
