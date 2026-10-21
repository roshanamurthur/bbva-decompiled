package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDefer<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends SingleSource<? extends T>> f73391p0;

    public SingleDefer(Callable<? extends SingleSource<? extends T>> callable) {
        this.f73391p0 = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        try {
            ((SingleSource) ObjectHelper.requireNonNull(this.f73391p0.call(), "The singleSupplier returned a null SingleSource")).subscribe(singleObserver);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
