package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends T> f74924q0;

    public FlowableFromCallable(Callable<? extends T> callable) {
        this.f74924q0 = callable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Exception {
        T tCall = this.f74924q0.call();
        Objects.requireNonNull(tCall, "The callable returned a null value");
        return tCall;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            T tCall = this.f74924q0.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            deferredScalarSubscription.complete(tCall);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarSubscription.isCancelled()) {
                RxJavaPlugins.onError(th2);
            } else {
                subscriber.onError(th2);
            }
        }
    }
}
