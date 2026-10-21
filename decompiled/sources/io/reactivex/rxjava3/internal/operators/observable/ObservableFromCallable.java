package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends T> f76721p0;

    public ObservableFromCallable(Callable<? extends T> callable) {
        this.f76721p0 = callable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        return (T) ExceptionHelper.nullCheck(this.f76721p0.call(), "The Callable returned a null value.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(ExceptionHelper.nullCheck(this.f76721p0.call(), "Callable returned a null value."));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarDisposable.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                observer.onError(th2);
            }
        }
    }
}
