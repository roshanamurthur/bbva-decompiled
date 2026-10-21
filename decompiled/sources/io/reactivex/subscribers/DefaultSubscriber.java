package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Subscription f78696p0;

    public final void cancel() {
        Subscription subscription = this.f78696p0;
        this.f78696p0 = SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (EndConsumerHelper.validate(this.f78696p0, subscription, getClass())) {
            this.f78696p0 = subscription;
            onStart();
        }
    }

    public final void request(long j10) {
        Subscription subscription = this.f78696p0;
        if (subscription != null) {
            subscription.request(j10);
        }
    }
}
