package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeContains<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71544p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object f71545q0;

    public static final class a implements MaybeObserver<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f71546p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Object f71547q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71548r0;

        public a(SingleObserver<? super Boolean> singleObserver, Object obj) {
            this.f71546p0 = singleObserver;
            this.f71547q0 = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71548r0.dispose();
            this.f71548r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71548r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71548r0 = DisposableHelper.DISPOSED;
            this.f71546p0.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71548r0 = DisposableHelper.DISPOSED;
            this.f71546p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71548r0, disposable)) {
                this.f71548r0 = disposable;
                this.f71546p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f71548r0 = DisposableHelper.DISPOSED;
            this.f71546p0.onSuccess(Boolean.valueOf(ObjectHelper.equals(obj, this.f71547q0)));
        }
    }

    public MaybeContains(MaybeSource<T> maybeSource, Object obj) {
        this.f71544p0 = maybeSource;
        this.f71545q0 = obj;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71544p0;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f71544p0.subscribe(new a(singleObserver, this.f71545q0));
    }
}
