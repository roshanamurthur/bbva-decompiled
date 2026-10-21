package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f75236p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<R> f75237q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f75238r0;

    public FlowableReduceWithSingle(Publisher<T> publisher, Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        this.f75236p0 = publisher;
        this.f75237q0 = supplier;
        this.f75238r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            R r3 = this.f75237q0.get();
            Objects.requireNonNull(r3, "The seedSupplier returned a null value");
            this.f75236p0.subscribe(new FlowableReduceSeedSingle.a(singleObserver, this.f75238r0, r3));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
