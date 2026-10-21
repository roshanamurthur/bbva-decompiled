package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCount<T> extends io.reactivex.internal.operators.flowable.a<T, Long> {

    public static final class a extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Subscription f70406p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f70407q0;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f70406p0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(Long.valueOf(this.f70407q0));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f70407q0++;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70406p0, subscription)) {
                this.f70406p0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCount(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
