package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCreate<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeOnSubscribe<T> f75786p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75787p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75787p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter, io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onComplete() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f75787p0.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onSuccess(T t10) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            MaybeObserver<? super T> maybeObserver = this.f75787p0;
            try {
                if (t10 == null) {
                    maybeObserver.onError(ExceptionHelper.createNullPointerException("onSuccess called with a null value."));
                } else {
                    maybeObserver.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void setCancellable(Cancellable cancellable) {
            DisposableHelper.set(this, new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final boolean tryOnError(Throwable th2) {
            Disposable andSet;
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f75787p0.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public MaybeCreate(MaybeOnSubscribe<T> maybeOnSubscribe) {
        this.f75786p0 = maybeOnSubscribe;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        try {
            this.f75786p0.subscribe(aVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            aVar.onError(th2);
        }
    }
}
