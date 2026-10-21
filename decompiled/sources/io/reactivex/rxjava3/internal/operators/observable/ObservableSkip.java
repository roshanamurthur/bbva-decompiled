package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkip<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77145p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77146p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f77147q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77148r0;

        public a(Observer<? super T> observer, long j10) {
            this.f77146p0 = observer;
            this.f77147q0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77148r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77148r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77146p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77146p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long j10 = this.f77147q0;
            if (j10 != 0) {
                this.f77147q0 = j10 - 1;
            } else {
                this.f77146p0.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77148r0, disposable)) {
                this.f77148r0 = disposable;
                this.f77146p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j10) {
        super(observableSource);
        this.f77145p0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77145p0));
    }
}
