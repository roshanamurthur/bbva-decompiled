package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<T> f70979p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<R> f70980q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f70981r0;

    public FlowableReduceWithSingle(Publisher<T> publisher, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f70979p0 = publisher;
        this.f70980q0 = callable;
        this.f70981r0 = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f70979p0.subscribe(new FlowableReduceSeedSingle.a(singleObserver, this.f70981r0, ObjectHelper.requireNonNull(this.f70980q0.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
