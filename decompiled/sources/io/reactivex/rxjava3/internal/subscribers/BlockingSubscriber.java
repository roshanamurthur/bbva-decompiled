package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
    public static final Object TERMINATED = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Queue<Object> f78031p0;

    public BlockingSubscriber(Queue<Object> queue) {
        this.f78031p0 = queue;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.f78031p0.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f78031p0.offer(NotificationLite.complete());
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        this.f78031p0.offer(NotificationLite.error(th2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f78031p0.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            this.f78031p0.offer(NotificationLite.subscription(this));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        get().request(j10);
    }
}
