package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoOnLifecycle<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Disposable> f75835p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f75836q0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75837p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Disposable> f75838q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Action f75839r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f75840s0;

        public a(MaybeObserver<? super T> maybeObserver, Consumer<? super Disposable> consumer, Action action) {
            this.f75837p0 = maybeObserver;
            this.f75838q0 = consumer;
            this.f75839r0 = action;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                this.f75839r0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f75840s0.dispose();
            this.f75840s0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75840s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Disposable disposable = this.f75840s0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                this.f75840s0 = disposableHelper;
                this.f75837p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            Disposable disposable = this.f75840s0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75840s0 = disposableHelper;
                this.f75837p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            MaybeObserver<? super T> maybeObserver = this.f75837p0;
            try {
                this.f75838q0.accept(disposable);
                if (DisposableHelper.validate(this.f75840s0, disposable)) {
                    this.f75840s0 = disposable;
                    maybeObserver.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f75840s0 = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, maybeObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            Disposable disposable = this.f75840s0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                this.f75840s0 = disposableHelper;
                this.f75837p0.onSuccess(t10);
            }
        }
    }

    public MaybeDoOnLifecycle(Maybe<T> maybe, Consumer<? super Disposable> consumer, Action action) {
        super(maybe);
        this.f75835p0 = consumer;
        this.f75836q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75835p0, this.f75836q0));
    }
}
