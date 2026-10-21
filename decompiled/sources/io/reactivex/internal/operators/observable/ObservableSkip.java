package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkip<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72868p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72869p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f72870q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72871r0;

        public a(Observer<? super T> observer, long j10) {
            this.f72869p0 = observer;
            this.f72870q0 = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72871r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72871r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72869p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72869p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long j10 = this.f72870q0;
            if (j10 != 0) {
                this.f72870q0 = j10 - 1;
            } else {
                this.f72869p0.onNext(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72871r0, disposable)) {
                this.f72871r0 = disposable;
                this.f72869p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j10) {
        super(observableSource);
        this.f72868p0 = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72868p0));
    }
}
