package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLastOne<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72942p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72943q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f72944r0;

        public a(Observer<? super T> observer) {
            this.f72942p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72944r0 = null;
            this.f72943q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72943q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            T t10 = this.f72944r0;
            Observer<? super T> observer = this.f72942p0;
            if (t10 != null) {
                this.f72944r0 = null;
                observer.onNext(t10);
            }
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72944r0 = null;
            this.f72942p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72944r0 = t10;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72943q0, disposable)) {
                this.f72943q0 = disposable;
                this.f72942p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer));
    }
}
