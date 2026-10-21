package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Future<? extends T> f70654q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f70655r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f70656s0;

    public FlowableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f70654q0 = future;
        this.f70655r0 = j10;
        this.f70656s0 = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f70656s0;
            Future<? extends T> future = this.f70654q0;
            T t10 = timeUnit != null ? future.get(this.f70655r0, timeUnit) : future.get();
            if (t10 == null) {
                subscriber.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t10);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            subscriber.onError(th2);
        }
    }
}
