package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InnerQueuedSubscriberSupport<T> f73754p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f73755q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f73756r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile SimpleQueue<T> f73757s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile boolean f73758t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f73759u0;
    public int v0;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i10) {
        this.f73754p0 = innerQueuedSubscriberSupport;
        this.f73755q0 = i10;
        this.f73756r0 = i10 - (i10 >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.f73758t0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f73754p0.innerComplete(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        this.f73754p0.innerError(this, th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        int i10 = this.v0;
        InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport = this.f73754p0;
        if (i10 == 0) {
            innerQueuedSubscriberSupport.innerNext(this, t10);
        } else {
            innerQueuedSubscriberSupport.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.v0 = iRequestFusion;
                    this.f73757s0 = queueSubscription;
                    this.f73758t0 = true;
                    this.f73754p0.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.v0 = iRequestFusion;
                    this.f73757s0 = queueSubscription;
                    QueueDrainHelper.request(subscription, this.f73755q0);
                    return;
                }
            }
            this.f73757s0 = QueueDrainHelper.createQueue(this.f73755q0);
            QueueDrainHelper.request(subscription, this.f73755q0);
        }
    }

    public SimpleQueue<T> queue() {
        return this.f73757s0;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (this.v0 != 1) {
            long j11 = this.f73759u0 + j10;
            if (j11 < this.f73756r0) {
                this.f73759u0 = j11;
            } else {
                this.f73759u0 = 0L;
                get().request(j11);
            }
        }
    }

    public void requestOne() {
        if (this.v0 != 1) {
            long j10 = this.f73759u0 + 1;
            if (j10 != this.f73756r0) {
                this.f73759u0 = j10;
            } else {
                this.f73759u0 = 0L;
                get().request(j10);
            }
        }
    }

    public void setDone() {
        this.f73758t0 = true;
    }
}
