package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCount<T> extends Single<Long> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f75783p0;

    public static final class a implements MaybeObserver<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f75784p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f75785q0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f75784p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75785q0.dispose();
            this.f75785q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75785q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75785q0 = DisposableHelper.DISPOSED;
            this.f75784p0.onSuccess(0L);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75785q0 = DisposableHelper.DISPOSED;
            this.f75784p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75785q0, disposable)) {
                this.f75785q0 = disposable;
                this.f75784p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f75785q0 = DisposableHelper.DISPOSED;
            this.f75784p0.onSuccess(1L);
        }
    }

    public MaybeCount(MaybeSource<T> maybeSource) {
        this.f75783p0 = maybeSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f75783p0;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f75783p0.subscribe(new a(singleObserver));
    }
}
