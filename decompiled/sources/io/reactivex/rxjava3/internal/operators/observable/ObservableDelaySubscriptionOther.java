package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f76580p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<U> f76581q0;

    public final class a implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f76582p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Observer<? super T> f76583q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76584r0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableDelaySubscriptionOther$a$a, reason: collision with other inner class name */
        public final class C0407a implements Observer<T> {
            public C0407a() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a.this.f76583q0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a.this.f76583q0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(T t10) {
                a.this.f76583q0.onNext(t10);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                a.this.f76582p0.update(disposable);
            }
        }

        public a(SequentialDisposable sequentialDisposable, Observer<? super T> observer) {
            this.f76582p0 = sequentialDisposable;
            this.f76583q0 = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76584r0) {
                return;
            }
            this.f76584r0 = true;
            ObservableDelaySubscriptionOther.this.f76580p0.subscribe(new C0407a());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76584r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76584r0 = true;
                this.f76583q0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(U u2) {
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f76582p0.update(disposable);
        }
    }

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f76580p0 = observableSource;
        this.f76581q0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.f76581q0.subscribe(new a(sequentialDisposable, observer));
    }
}
