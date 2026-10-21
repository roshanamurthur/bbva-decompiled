package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f76850p0;

    public ObservableJust(T t10) {
        this.f76850p0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.ScalarSupplier, io.reactivex.rxjava3.functions.Supplier
    public T get() {
        return this.f76850p0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.f76850p0);
        observer.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
