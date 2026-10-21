package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f69964p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f69965q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f69966r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super Disposable> f69967s0;

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.f69964p0 = consumer;
        this.f69965q0 = consumer2;
        this.f69966r0 = action;
        this.f69967s0 = consumer3;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.f69965q0 != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f69966r0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (isDisposed()) {
            RxJavaPlugins.onError(th2);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f69965q0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f69964p0.accept(t10);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.f69967s0.accept(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                onError(th2);
            }
        }
    }
}
