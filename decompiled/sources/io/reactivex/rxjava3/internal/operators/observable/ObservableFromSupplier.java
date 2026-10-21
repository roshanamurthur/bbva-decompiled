package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromSupplier<T> extends Observable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends T> f76739p0;

    public ObservableFromSupplier(Supplier<? extends T> supplier) {
        this.f76739p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        return (T) ExceptionHelper.nullCheck(this.f76739p0.get(), "The supplier returned a null value.");
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
            deferredScalarDisposable.complete(ExceptionHelper.nullCheck(this.f76739p0.get(), "Supplier returned a null value."));
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
