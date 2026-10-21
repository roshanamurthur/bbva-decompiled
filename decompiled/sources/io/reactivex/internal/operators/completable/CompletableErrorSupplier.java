package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableErrorSupplier extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends Throwable> f70047p0;

    public CompletableErrorSupplier(Callable<? extends Throwable> callable) {
        this.f70047p0 = callable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            th = (Throwable) ObjectHelper.requireNonNull(this.f70047p0.call(), "The error returned is null");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        EmptyDisposable.error(th, completableObserver);
    }
}
