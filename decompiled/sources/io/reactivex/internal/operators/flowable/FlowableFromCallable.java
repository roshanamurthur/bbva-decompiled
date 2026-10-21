package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends T> f70653q0;

    public FlowableFromCallable(Callable<? extends T> callable) {
        this.f70653q0 = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) ObjectHelper.requireNonNull(this.f70653q0.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(ObjectHelper.requireNonNull(this.f70653q0.call(), "The callable returned a null value"));
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
