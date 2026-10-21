package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromSupplier<T> extends Flowable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends T> f74942q0;

    public FlowableFromSupplier(Supplier<? extends T> supplier) {
        this.f74942q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        T t10 = this.f74942q0.get();
        Objects.requireNonNull(t10, "The supplier returned a null value");
        return t10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            T t10 = this.f74942q0.get();
            Objects.requireNonNull(t10, "The supplier returned a null value");
            deferredScalarSubscription.complete(t10);
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
