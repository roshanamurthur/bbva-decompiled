package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithSingle<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73419p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<U> f73420q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements SingleObserver<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73421p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f73422q0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f73421p0 = singleObserver;
            this.f73422q0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73421p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73421p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(U u2) {
            this.f73422q0.subscribe(new ResumeSingleObserver(this, this.f73421p0));
        }
    }

    public SingleDelayWithSingle(SingleSource<T> singleSource, SingleSource<U> singleSource2) {
        this.f73419p0 = singleSource;
        this.f73420q0 = singleSource2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73420q0.subscribe(new a(singleObserver, this.f73419p0));
    }
}
