package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOperator;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleLift<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73531p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleOperator<? extends R, ? super T> f73532q0;

    public SingleLift(SingleSource<T> singleSource, SingleOperator<? extends R, ? super T> singleOperator) {
        this.f73531p0 = singleSource;
        this.f73532q0 = singleOperator;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f73531p0.subscribe((SingleObserver) ObjectHelper.requireNonNull(this.f73532q0.apply(singleObserver), "The onLift returned a null SingleObserver"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
