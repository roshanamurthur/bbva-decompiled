package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f74217p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f74218q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f74219r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super Disposable> f74220s0;

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.f74217p0 = consumer;
        this.f74218q0 = consumer2;
        this.f74219r0 = action;
        this.f74220s0 = consumer3;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.f74218q0 != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f74219r0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        if (isDisposed()) {
            RxJavaPlugins.onError(th2);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f74218q0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f74217p0.accept(t10);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.f74220s0.accept(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                onError(th2);
            }
        }
    }
}
