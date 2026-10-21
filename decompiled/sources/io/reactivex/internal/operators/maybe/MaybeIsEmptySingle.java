package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeIsEmptySingle<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T>, FuseToMaybe<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71694p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f71695p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71696q0;

        public a(SingleObserver<? super Boolean> singleObserver) {
            this.f71695p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71696q0.dispose();
            this.f71696q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71696q0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71696q0 = DisposableHelper.DISPOSED;
            this.f71695p0.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71696q0 = DisposableHelper.DISPOSED;
            this.f71695p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71696q0, disposable)) {
                this.f71696q0 = disposable;
                this.f71695p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71696q0 = DisposableHelper.DISPOSED;
            this.f71695p0.onSuccess(Boolean.FALSE);
        }
    }

    public MaybeIsEmptySingle(MaybeSource<T> maybeSource) {
        this.f71694p0 = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public Maybe<Boolean> fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIsEmpty(this.f71694p0));
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71694p0;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f71694p0.subscribe(new a(singleObserver));
    }
}
