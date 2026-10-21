package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCount<T> extends Single<Long> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71549p0;

    public static final class a implements MaybeObserver<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f71550p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71551q0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f71550p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71551q0.dispose();
            this.f71551q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71551q0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71551q0 = DisposableHelper.DISPOSED;
            this.f71550p0.onSuccess(0L);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71551q0 = DisposableHelper.DISPOSED;
            this.f71550p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71551q0, disposable)) {
                this.f71551q0 = disposable;
                this.f71550p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f71551q0 = DisposableHelper.DISPOSED;
            this.f71550p0.onSuccess(1L);
        }
    }

    public MaybeCount(MaybeSource<T> maybeSource) {
        this.f71549p0 = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71549p0;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f71549p0.subscribe(new a(singleObserver));
    }
}
