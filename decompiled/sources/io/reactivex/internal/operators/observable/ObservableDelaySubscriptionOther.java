package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72299p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<U> f72300q0;

    public final class a implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f72301p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Observer<? super T> f72302q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72303r0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$a$a, reason: collision with other inner class name */
        public final class C0342a implements Observer<T> {
            public C0342a() {
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                a.this.f72302q0.onComplete();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                a.this.f72302q0.onError(th2);
            }

            @Override // io.reactivex.Observer
            public final void onNext(T t10) {
                a.this.f72302q0.onNext(t10);
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                a.this.f72301p0.update(disposable);
            }
        }

        public a(SequentialDisposable sequentialDisposable, Observer<? super T> observer) {
            this.f72301p0 = sequentialDisposable;
            this.f72302q0 = observer;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72303r0) {
                return;
            }
            this.f72303r0 = true;
            ObservableDelaySubscriptionOther.this.f72299p0.subscribe(new C0342a());
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72303r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72303r0 = true;
                this.f72302q0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u2) {
            onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72301p0.update(disposable);
        }
    }

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f72299p0 = observableSource;
        this.f72300q0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.f72300q0.subscribe(new a(sequentialDisposable, observer));
    }
}
