package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCount<T> extends io.reactivex.internal.operators.observable.a<T, Long> {

    public static final class a implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f72244p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72245q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72246r0;

        public a(Observer<? super Long> observer) {
            this.f72244p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72245q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72245q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Long lValueOf = Long.valueOf(this.f72246r0);
            Observer<? super Long> observer = this.f72244p0;
            observer.onNext(lValueOf);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72244p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f72246r0++;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72245q0, disposable)) {
                this.f72245q0 = disposable;
                this.f72244p0.onSubscribe(this);
            }
        }
    }

    public ObservableCount(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        this.source.subscribe(new a(observer));
    }
}
