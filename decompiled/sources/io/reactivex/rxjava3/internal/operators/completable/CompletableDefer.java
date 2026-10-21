package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDefer extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends CompletableSource> f74273p0;

    public CompletableDefer(Supplier<? extends CompletableSource> supplier) {
        this.f74273p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            CompletableSource completableSource = this.f74273p0.get();
            Objects.requireNonNull(completableSource, "The completableSupplier returned a null CompletableSource");
            completableSource.subscribe(completableObserver);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, completableObserver);
        }
    }
}
