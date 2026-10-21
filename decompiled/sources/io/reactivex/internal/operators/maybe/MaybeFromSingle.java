package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f71682p0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71683p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71684q0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71683p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71684q0.dispose();
            this.f71684q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71684q0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f71684q0 = DisposableHelper.DISPOSED;
            this.f71683p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71684q0, disposable)) {
                this.f71684q0 = disposable;
                this.f71683p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f71684q0 = DisposableHelper.DISPOSED;
            this.f71683p0.onSuccess(t10);
        }
    }

    public MaybeFromSingle(SingleSource<T> singleSource) {
        this.f71682p0 = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamSingleSource
    public SingleSource<T> source() {
        return this.f71682p0;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71682p0.subscribe(new a(maybeObserver));
    }
}
