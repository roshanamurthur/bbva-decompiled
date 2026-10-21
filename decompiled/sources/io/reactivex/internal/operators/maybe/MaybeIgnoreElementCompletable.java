package io.reactivex.internal.operators.maybe;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeIgnoreElementCompletable<T> extends Completable implements FuseToMaybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71689p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f71690p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71691q0;

        public a(CompletableObserver completableObserver) {
            this.f71690p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71691q0.dispose();
            this.f71691q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71691q0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71691q0 = DisposableHelper.DISPOSED;
            this.f71690p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71691q0 = DisposableHelper.DISPOSED;
            this.f71690p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71691q0, disposable)) {
                this.f71691q0 = disposable;
                this.f71690p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71691q0 = DisposableHelper.DISPOSED;
            this.f71690p0.onComplete();
        }
    }

    public MaybeIgnoreElementCompletable(MaybeSource<T> maybeSource) {
        this.f71689p0 = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public Maybe<T> fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElement(this.f71689p0));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f71689p0.subscribe(new a(completableObserver));
    }
}
