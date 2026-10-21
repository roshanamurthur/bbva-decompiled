package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77138p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f77139q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77140p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f77141q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77142r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f77143s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77144t0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f77140p0 = singleObserver;
            this.f77141q0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77142r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77142r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77144t0) {
                return;
            }
            this.f77144t0 = true;
            T t10 = this.f77143s0;
            this.f77143s0 = null;
            if (t10 == null) {
                t10 = this.f77141q0;
            }
            SingleObserver<? super T> singleObserver = this.f77140p0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77144t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77144t0 = true;
                this.f77140p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77144t0) {
                return;
            }
            if (this.f77143s0 == null) {
                this.f77143s0 = t10;
                return;
            }
            this.f77144t0 = true;
            this.f77142r0.dispose();
            this.f77140p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77142r0, disposable)) {
                this.f77142r0 = disposable;
                this.f77140p0.onSubscribe(this);
            }
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t10) {
        this.f77138p0 = observableSource;
        this.f77139q0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77138p0.subscribe(new a(singleObserver, this.f77139q0));
    }
}
