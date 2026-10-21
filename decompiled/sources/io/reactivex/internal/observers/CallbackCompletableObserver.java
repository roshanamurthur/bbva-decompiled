package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Throwable> f69941p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f69942q0;

    public CallbackCompletableObserver(Action action) {
        this.f69941p0 = this;
        this.f69942q0 = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.f69941p0 != this;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        try {
            this.f69942q0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        try {
            this.f69941p0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(th3);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Throwable th2) {
        RxJavaPlugins.onError(new OnErrorNotImplementedException(th2));
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, Action action) {
        this.f69941p0 = consumer;
        this.f69942q0 = action;
    }
}
