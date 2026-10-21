package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDoOnLifecycle<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Subscription> f74790q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LongConsumer f74791r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f74792s0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74793p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Subscription> f74794q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final LongConsumer f74795r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f74796s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f74797t0;

        public a(Subscriber<? super T> subscriber, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
            this.f74793p0 = subscriber;
            this.f74794q0 = consumer;
            this.f74796s0 = action;
            this.f74795r0 = longConsumer;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f74797t0;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f74797t0 = subscriptionHelper;
                try {
                    this.f74796s0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74797t0 != SubscriptionHelper.CANCELLED) {
                this.f74793p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74797t0 != SubscriptionHelper.CANCELLED) {
                this.f74793p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74793p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Subscriber<? super T> subscriber = this.f74793p0;
            try {
                this.f74794q0.accept(subscription);
                if (SubscriptionHelper.validate(this.f74797t0, subscription)) {
                    this.f74797t0 = subscription;
                    subscriber.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscription.cancel();
                this.f74797t0 = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            try {
                this.f74795r0.accept(j10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f74797t0.request(j10);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.f74790q0 = consumer;
        this.f74791r0 = longConsumer;
        this.f74792s0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74790q0, this.f74791r0, this.f74792s0));
    }
}
