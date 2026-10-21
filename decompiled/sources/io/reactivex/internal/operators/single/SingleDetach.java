package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDetach<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73428p0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleObserver<? super T> f73429p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f73430q0;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73429p0 = null;
            this.f73430q0.dispose();
            this.f73430q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73430q0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73430q0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f73429p0;
            if (singleObserver != null) {
                this.f73429p0 = null;
                singleObserver.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73430q0, disposable)) {
                this.f73430q0 = disposable;
                this.f73429p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73430q0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f73429p0;
            if (singleObserver != null) {
                this.f73429p0 = null;
                singleObserver.onSuccess(t10);
            }
        }
    }

    public SingleDetach(SingleSource<T> singleSource) {
        this.f73428p0 = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a();
        aVar.f73429p0 = singleObserver;
        this.f73428p0.subscribe(aVar);
    }
}
