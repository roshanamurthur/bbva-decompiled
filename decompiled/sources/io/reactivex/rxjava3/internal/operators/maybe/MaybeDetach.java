package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDetach<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public MaybeObserver<? super T> f75821p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f75822q0;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75821p0 = null;
            this.f75822q0.dispose();
            this.f75822q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75822q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75822q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f75821p0;
            if (maybeObserver != null) {
                this.f75821p0 = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75822q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f75821p0;
            if (maybeObserver != null) {
                this.f75821p0 = null;
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75822q0, disposable)) {
                this.f75822q0 = disposable;
                this.f75821p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75822q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f75821p0;
            if (maybeObserver != null) {
                this.f75821p0 = null;
                maybeObserver.onSuccess(t10);
            }
        }
    }

    public MaybeDetach(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        MaybeSource<T> maybeSource = this.source;
        a aVar = new a();
        aVar.f75821p0 = maybeObserver;
        maybeSource.subscribe(aVar);
    }
}
