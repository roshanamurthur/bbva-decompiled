package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76855p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f76856q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f76857p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f76858q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76859r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f76860s0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f76857p0 = singleObserver;
            this.f76858q0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76859r0.dispose();
            this.f76859r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76859r0 == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76859r0 = DisposableHelper.DISPOSED;
            T t10 = this.f76860s0;
            SingleObserver<? super T> singleObserver = this.f76857p0;
            if (t10 != null) {
                this.f76860s0 = null;
                singleObserver.onSuccess(t10);
                return;
            }
            T t11 = this.f76858q0;
            if (t11 != null) {
                singleObserver.onSuccess(t11);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76859r0 = DisposableHelper.DISPOSED;
            this.f76860s0 = null;
            this.f76857p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76860s0 = t10;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76859r0, disposable)) {
                this.f76859r0 = disposable;
                this.f76857p0.onSubscribe(this);
            }
        }
    }

    public ObservableLastSingle(ObservableSource<T> observableSource, T t10) {
        this.f76855p0 = observableSource;
        this.f76856q0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f76855p0.subscribe(new a(singleObserver, this.f76856q0));
    }
}
