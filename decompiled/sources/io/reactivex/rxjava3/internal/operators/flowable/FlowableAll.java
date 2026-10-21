package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAll<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f74446q0;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f74447p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f74448q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f74449r0;

        public a(Subscriber<? super Boolean> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f74447p0 = predicate;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f74448q0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74449r0) {
                return;
            }
            this.f74449r0 = true;
            complete(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74449r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74449r0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74449r0) {
                return;
            }
            try {
                if (this.f74447p0.test(t10)) {
                    return;
                }
                this.f74449r0 = true;
                this.f74448q0.cancel();
                complete(Boolean.FALSE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74448q0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74448q0, subscription)) {
                this.f74448q0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAll(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f74446q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74446q0));
    }
}
