package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceWithSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72691p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<R> f72692q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f72693r0;

    public ObservableReduceWithSingle(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f72691p0 = observableSource;
        this.f72692q0 = callable;
        this.f72693r0 = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f72691p0.subscribe(new ObservableReduceSeedSingle.a(singleObserver, this.f72693r0, ObjectHelper.requireNonNull(this.f72692q0.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
