package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f78028p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f78029q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Subscription f78030r0;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e5) {
                Subscription subscription = this.f78030r0;
                this.f78030r0 = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e5);
            }
        }
        Throwable th2 = this.f78029q0;
        if (th2 == null) {
            return this.f78028p0;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f78030r0, subscription)) {
            this.f78030r0 = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }
}
