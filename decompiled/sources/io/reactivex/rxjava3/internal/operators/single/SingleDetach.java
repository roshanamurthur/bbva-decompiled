package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDetach<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77682p0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleObserver<? super T> f77683p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f77684q0;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77683p0 = null;
            this.f77684q0.dispose();
            this.f77684q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77684q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77684q0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f77683p0;
            if (singleObserver != null) {
                this.f77683p0 = null;
                singleObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77684q0, disposable)) {
                this.f77684q0 = disposable;
                this.f77683p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77684q0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f77683p0;
            if (singleObserver != null) {
                this.f77683p0 = null;
                singleObserver.onSuccess(t10);
            }
        }
    }

    public SingleDetach(SingleSource<T> singleSource) {
        this.f77682p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a();
        aVar.f77683p0 = singleObserver;
        this.f77682p0.subscribe(aVar);
    }
}
