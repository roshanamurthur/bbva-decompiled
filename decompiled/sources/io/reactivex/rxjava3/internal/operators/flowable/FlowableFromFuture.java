package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Future<? extends T> f74928q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f74929r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f74930s0;

    public FlowableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f74928q0 = future;
        this.f74929r0 = j10;
        this.f74930s0 = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f74930s0;
            Future<? extends T> future = this.f74928q0;
            T t10 = timeUnit != null ? future.get(this.f74929r0, timeUnit) : future.get();
            if (t10 == null) {
                subscriber.onError(ExceptionHelper.createNullPointerException("The future returned a null value."));
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
