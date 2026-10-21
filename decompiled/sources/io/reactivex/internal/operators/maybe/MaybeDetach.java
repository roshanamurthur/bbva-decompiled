package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDetach<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public MaybeObserver<? super T> f71582p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71583q0;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71582p0 = null;
            this.f71583q0.dispose();
            this.f71583q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71583q0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71583q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f71582p0;
            if (maybeObserver != null) {
                this.f71582p0 = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71583q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f71582p0;
            if (maybeObserver != null) {
                this.f71582p0 = null;
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71583q0, disposable)) {
                this.f71583q0 = disposable;
                this.f71582p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71583q0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f71582p0;
            if (maybeObserver != null) {
                this.f71582p0 = null;
                maybeObserver.onSuccess(t10);
            }
        }
    }

    public MaybeDetach(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        MaybeSource<T> maybeSource = this.source;
        a aVar = new a();
        aVar.f71582p0 = maybeObserver;
        maybeSource.subscribe(aVar);
    }
}
