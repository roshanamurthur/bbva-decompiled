package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72861p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f72862q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f72863p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f72864q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72865r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f72866s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72867t0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f72863p0 = singleObserver;
            this.f72864q0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72865r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72865r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72867t0) {
                return;
            }
            this.f72867t0 = true;
            T t10 = this.f72866s0;
            this.f72866s0 = null;
            if (t10 == null) {
                t10 = this.f72864q0;
            }
            SingleObserver<? super T> singleObserver = this.f72863p0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72867t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72867t0 = true;
                this.f72863p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72867t0) {
                return;
            }
            if (this.f72866s0 == null) {
                this.f72866s0 = t10;
                return;
            }
            this.f72867t0 = true;
            this.f72865r0.dispose();
            this.f72863p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72865r0, disposable)) {
                this.f72865r0 = disposable;
                this.f72863p0.onSubscribe(this);
            }
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t10) {
        this.f72861p0 = observableSource;
        this.f72862q0 = t10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f72861p0.subscribe(new a(singleObserver, this.f72862q0));
    }
}
