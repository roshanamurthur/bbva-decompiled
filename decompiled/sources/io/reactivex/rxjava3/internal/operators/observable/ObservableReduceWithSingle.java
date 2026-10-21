package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceWithSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<R> f76969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f76970r0;

    public ObservableReduceWithSingle(ObservableSource<T> observableSource, Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        this.f76968p0 = observableSource;
        this.f76969q0 = supplier;
        this.f76970r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            R r3 = this.f76969q0.get();
            Objects.requireNonNull(r3, "The seedSupplier returned a null value");
            this.f76968p0.subscribe(new ObservableReduceSeedSingle.a(singleObserver, this.f76970r0, r3));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
