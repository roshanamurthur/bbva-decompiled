package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDoOnLifecycle<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Subscription> f70525q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LongConsumer f70526r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f70527s0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70528p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Subscription> f70529q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final LongConsumer f70530r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f70531s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70532t0;

        public a(Subscriber<? super T> subscriber, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
            this.f70528p0 = subscriber;
            this.f70529q0 = consumer;
            this.f70531s0 = action;
            this.f70530r0 = longConsumer;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f70532t0;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f70532t0 = subscriptionHelper;
                try {
                    this.f70531s0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70532t0 != SubscriptionHelper.CANCELLED) {
                this.f70528p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70532t0 != SubscriptionHelper.CANCELLED) {
                this.f70528p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70528p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Subscriber<? super T> subscriber = this.f70528p0;
            try {
                this.f70529q0.accept(subscription);
                if (SubscriptionHelper.validate(this.f70532t0, subscription)) {
                    this.f70532t0 = subscription;
                    subscriber.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscription.cancel();
                this.f70532t0 = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            try {
                this.f70530r0.accept(j10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f70532t0.request(j10);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.f70525q0 = consumer;
        this.f70526r0 = longConsumer;
        this.f70527s0 = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70525q0, this.f70526r0, this.f70527s0));
    }
}
