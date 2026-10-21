package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithSingle<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77673p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<U> f77674q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements SingleObserver<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77675p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f77676q0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f77675p0 = singleObserver;
            this.f77676q0 = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77675p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f77675p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(U u2) {
            this.f77676q0.subscribe(new ResumeSingleObserver(this, this.f77675p0));
        }
    }

    public SingleDelayWithSingle(SingleSource<T> singleSource, SingleSource<U> singleSource2) {
        this.f77673p0 = singleSource;
        this.f77674q0 = singleSource2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77674q0.subscribe(new a(singleObserver, this.f77673p0));
    }
}
