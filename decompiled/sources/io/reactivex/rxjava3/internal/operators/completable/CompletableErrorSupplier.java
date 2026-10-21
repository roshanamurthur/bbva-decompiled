package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableErrorSupplier extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends Throwable> f74304p0;

    public CompletableErrorSupplier(Supplier<? extends Throwable> supplier) {
        this.f74304p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            Throwable th2 = this.f74304p0.get();
            Objects.requireNonNull(th2, "The error returned is null");
            th = th2;
        } catch (Throwable th3) {
            th = th3;
            Exceptions.throwIfFatal(th);
        }
        EmptyDisposable.error(th, completableObserver);
    }
}
