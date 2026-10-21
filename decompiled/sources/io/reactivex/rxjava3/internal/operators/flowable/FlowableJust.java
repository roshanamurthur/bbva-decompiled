package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f75058q0;

    public FlowableJust(T t10) {
        this.f75058q0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.ScalarSupplier, io.reactivex.rxjava3.functions.Supplier
    public T get() {
        return this.f75058q0;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new ScalarSubscription(subscriber, this.f75058q0));
    }
}
