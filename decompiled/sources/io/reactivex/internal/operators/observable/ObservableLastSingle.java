package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72569p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f72570q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f72571p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f72572q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72573r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f72574s0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f72571p0 = singleObserver;
            this.f72572q0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72573r0.dispose();
            this.f72573r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72573r0 == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72573r0 = DisposableHelper.DISPOSED;
            T t10 = this.f72574s0;
            SingleObserver<? super T> singleObserver = this.f72571p0;
            if (t10 != null) {
                this.f72574s0 = null;
                singleObserver.onSuccess(t10);
                return;
            }
            T t11 = this.f72572q0;
            if (t11 != null) {
                singleObserver.onSuccess(t11);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72573r0 = DisposableHelper.DISPOSED;
            this.f72574s0 = null;
            this.f72571p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72574s0 = t10;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72573r0, disposable)) {
                this.f72573r0 = disposable;
                this.f72571p0.onSubscribe(this);
            }
        }
    }

    public ObservableLastSingle(ObservableSource<T> observableSource, T t10) {
        this.f72569p0 = observableSource;
        this.f72570q0 = t10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f72569p0.subscribe(new a(singleObserver, this.f72570q0));
    }
}
