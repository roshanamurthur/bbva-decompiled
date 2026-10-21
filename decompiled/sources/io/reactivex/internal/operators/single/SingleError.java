package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleError<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends Throwable> f73478p0;

    public SingleError(Callable<? extends Throwable> callable) {
        this.f73478p0 = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        try {
            th = (Throwable) ObjectHelper.requireNonNull(this.f73478p0.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        EmptyDisposable.error(th, singleObserver);
    }
}
