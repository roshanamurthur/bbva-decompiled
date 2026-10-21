package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Throwable> f74194p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f74195q0;

    public CallbackCompletableObserver(Action action) {
        this.f74194p0 = this;
        this.f74195q0 = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.f74194p0 != this;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        try {
            this.f74195q0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        try {
            this.f74194p0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(th3);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Throwable th2) {
        RxJavaPlugins.onError(new OnErrorNotImplementedException(th2));
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, Action action) {
        this.f74194p0 = consumer;
        this.f74195q0 = action;
    }
}
