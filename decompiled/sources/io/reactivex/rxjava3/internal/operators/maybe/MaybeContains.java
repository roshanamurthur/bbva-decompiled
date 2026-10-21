package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeContains<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f75778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object f75779q0;

    public static final class a implements MaybeObserver<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f75780p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Object f75781q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75782r0;

        public a(SingleObserver<? super Boolean> singleObserver, Object obj) {
            this.f75780p0 = singleObserver;
            this.f75781q0 = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75782r0.dispose();
            this.f75782r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75782r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75782r0 = DisposableHelper.DISPOSED;
            this.f75780p0.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75782r0 = DisposableHelper.DISPOSED;
            this.f75780p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75782r0, disposable)) {
                this.f75782r0 = disposable;
                this.f75780p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f75782r0 = DisposableHelper.DISPOSED;
            this.f75780p0.onSuccess(Boolean.valueOf(Objects.equals(obj, this.f75781q0)));
        }
    }

    public MaybeContains(MaybeSource<T> maybeSource, Object obj) {
        this.f75778p0 = maybeSource;
        this.f75779q0 = obj;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f75778p0;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f75778p0.subscribe(new a(singleObserver, this.f75779q0));
    }
}
