package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchIfEmpty<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77187p0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77188p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77189q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77191s0 = true;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f77190r0 = new SequentialDisposable();

        public a(ObservableSource observableSource, Observer observer) {
            this.f77188p0 = observer;
            this.f77189q0 = observableSource;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (!this.f77191s0) {
                this.f77188p0.onComplete();
            } else {
                this.f77191s0 = false;
                this.f77189q0.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77188p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77191s0) {
                this.f77191s0 = false;
            }
            this.f77188p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f77190r0.update(disposable);
        }
    }

    public ObservableSwitchIfEmpty(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f77187p0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(this.f77187p0, observer);
        observer.onSubscribe(aVar.f77190r0);
        this.source.subscribe(aVar);
    }
}
