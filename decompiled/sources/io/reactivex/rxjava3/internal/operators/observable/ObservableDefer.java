package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDefer<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends ObservableSource<? extends T>> f76564p0;

    public ObservableDefer(Supplier<? extends ObservableSource<? extends T>> supplier) {
        this.f76564p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            ObservableSource<? extends T> observableSource = this.f76564p0.get();
            Objects.requireNonNull(observableSource, "The supplier returned a null ObservableSource");
            observableSource.subscribe(observer);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
