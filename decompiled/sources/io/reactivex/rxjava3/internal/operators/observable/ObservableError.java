package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableError<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends Throwable> f76649p0;

    public ObservableError(Supplier<? extends Throwable> supplier) {
        this.f76649p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            th = (Throwable) ExceptionHelper.nullCheck(this.f76649p0.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        EmptyDisposable.error(th, observer);
    }
}
