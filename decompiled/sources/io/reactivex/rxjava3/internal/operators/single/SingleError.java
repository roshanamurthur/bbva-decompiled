package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleError<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends Throwable> f77739p0;

    public SingleError(Supplier<? extends Throwable> supplier) {
        this.f77739p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        try {
            th = (Throwable) ExceptionHelper.nullCheck(this.f77739p0.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        EmptyDisposable.error(th, singleObserver);
    }
}
