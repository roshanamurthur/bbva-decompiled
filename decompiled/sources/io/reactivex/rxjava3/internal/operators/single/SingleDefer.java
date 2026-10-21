package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDefer<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends SingleSource<? extends T>> f77645p0;

    public SingleDefer(Supplier<? extends SingleSource<? extends T>> supplier) {
        this.f77645p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        try {
            SingleSource<? extends T> singleSource = this.f77645p0.get();
            Objects.requireNonNull(singleSource, "The singleSupplier returned a null SingleSource");
            singleSource.subscribe(singleObserver);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
