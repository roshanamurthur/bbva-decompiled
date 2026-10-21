package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIgnoreElements<T> extends io.reactivex.internal.operators.observable.a<T, T> {
    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer));
    }

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72505p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72506q0;

        public a(Observer<? super T> observer) {
            this.f72505p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72506q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72506q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72505p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72505p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72506q0 = disposable;
            this.f72505p0.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
        }
    }
}
