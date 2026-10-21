package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromFuture<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Future<? extends T> f72441p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72442q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f72443r0;

    public ObservableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f72441p0 = future;
        this.f72442q0 = j10;
        this.f72443r0 = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f72443r0;
            Future<? extends T> future = this.f72441p0;
            deferredScalarDisposable.complete(ObjectHelper.requireNonNull(timeUnit != null ? future.get(this.f72442q0, timeUnit) : future.get(), "Future returned null"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            observer.onError(th2);
        }
    }
}
