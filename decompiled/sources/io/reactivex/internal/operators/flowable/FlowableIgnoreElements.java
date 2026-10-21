package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableIgnoreElements<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    public static final class a<T> implements FlowableSubscriber<T>, QueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70722p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70723q0;

        public a(Subscriber<? super T> subscriber) {
            this.f70722p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70723q0.cancel();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70722p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70722p0.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70723q0, subscription)) {
                this.f70723q0 = subscription;
                this.f70722p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
        }
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
