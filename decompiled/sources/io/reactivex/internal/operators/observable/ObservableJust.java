package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarCallable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f72564p0;

    public ObservableJust(T t10) {
        this.f72564p0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.f72564p0;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.f72564p0);
        observer.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
