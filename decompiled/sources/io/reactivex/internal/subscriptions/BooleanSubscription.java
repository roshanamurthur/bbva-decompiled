package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
