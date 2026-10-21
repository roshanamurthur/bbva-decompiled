package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f70782q0;

    public FlowableJust(T t10) {
        this.f70782q0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.f70782q0;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new ScalarSubscription(subscriber, this.f70782q0));
    }
}
