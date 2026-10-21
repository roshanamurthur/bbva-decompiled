package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamSingleSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f75921p0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75922p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f75923q0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75922p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75923q0.dispose();
            this.f75923q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75923q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75923q0 = DisposableHelper.DISPOSED;
            this.f75922p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75923q0, disposable)) {
                this.f75923q0 = disposable;
                this.f75922p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75923q0 = DisposableHelper.DISPOSED;
            this.f75922p0.onSuccess(t10);
        }
    }

    public MaybeFromSingle(SingleSource<T> singleSource) {
        this.f75921p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamSingleSource
    public SingleSource<T> source() {
        return this.f75921p0;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75921p0.subscribe(new a(maybeObserver));
    }
}
