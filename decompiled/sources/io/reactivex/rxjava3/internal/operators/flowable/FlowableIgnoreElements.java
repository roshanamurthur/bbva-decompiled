package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableIgnoreElements<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    public static final class a<T> implements FlowableSubscriber<T>, QueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74998p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f74999q0;

        public a(Subscriber<? super T> subscriber) {
            this.f74998p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74999q0.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74998p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74998p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74999q0, subscription)) {
                this.f74999q0 = subscription;
                this.f74998p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
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

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
