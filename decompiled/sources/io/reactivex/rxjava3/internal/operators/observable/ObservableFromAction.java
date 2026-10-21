package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromAction<T> extends Observable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f76714p0;

    public ObservableFromAction(Action action) {
        this.f76714p0 = action;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        this.f76714p0.run();
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        CancellableQueueFuseable cancellableQueueFuseable = new CancellableQueueFuseable();
        observer.onSubscribe(cancellableQueueFuseable);
        if (cancellableQueueFuseable.isDisposed()) {
            return;
        }
        try {
            this.f76714p0.run();
            if (cancellableQueueFuseable.isDisposed()) {
                return;
            }
            observer.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (cancellableQueueFuseable.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                observer.onError(th2);
            }
        }
    }
}
