package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromFuture<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Future<? extends T> f76725p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76726q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f76727r0;

    public ObservableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f76725p0 = future;
        this.f76726q0 = j10;
        this.f76727r0 = timeUnit;
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
            TimeUnit timeUnit = this.f76727r0;
            Future<? extends T> future = this.f76725p0;
            deferredScalarDisposable.complete(ExceptionHelper.nullCheck(timeUnit != null ? future.get(this.f76726q0, timeUnit) : future.get(), "Future returned a null value."));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            observer.onError(th2);
        }
    }
}
