package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchIfEmpty<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72910p0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72911p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72912q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72914s0 = true;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f72913r0 = new SequentialDisposable();

        public a(ObservableSource observableSource, Observer observer) {
            this.f72911p0 = observer;
            this.f72912q0 = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (!this.f72914s0) {
                this.f72911p0.onComplete();
            } else {
                this.f72914s0 = false;
                this.f72912q0.subscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72911p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72914s0) {
                this.f72914s0 = false;
            }
            this.f72911p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72913r0.update(disposable);
        }
    }

    public ObservableSwitchIfEmpty(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f72910p0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(this.f72910p0, observer);
        observer.onSubscribe(aVar.f72913r0);
        this.source.subscribe(aVar);
    }
}
