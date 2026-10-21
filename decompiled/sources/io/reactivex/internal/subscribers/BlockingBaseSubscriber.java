package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f73737p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f73738q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Subscription f73739r0;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                Subscription subscription = this.f73739r0;
                this.f73739r0 = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f73738q0;
        if (th2 == null) {
            return this.f73737p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f73739r0, subscription)) {
            this.f73739r0 = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }
}
