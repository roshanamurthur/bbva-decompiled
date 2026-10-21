package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeIsEmpty<T> extends io.reactivex.internal.operators.maybe.a<T, Boolean> {

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super Boolean> f71692p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71693q0;

        public a(MaybeObserver<? super Boolean> maybeObserver) {
            this.f71692p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71693q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71693q0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71692p0.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71692p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71693q0, disposable)) {
                this.f71693q0 = disposable;
                this.f71692p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71692p0.onSuccess(Boolean.FALSE);
        }
    }

    public MaybeIsEmpty(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super Boolean> maybeObserver) {
        this.source.subscribe(new a(maybeObserver));
    }
}
