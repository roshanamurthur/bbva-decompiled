package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableAny<T> extends io.reactivex.internal.operators.flowable.a<T, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f70204q0;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f70205p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70206q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70207r0;

        public a(Subscriber<? super Boolean> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f70205p0 = predicate;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f70206q0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70207r0) {
                return;
            }
            this.f70207r0 = true;
            complete(Boolean.FALSE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70207r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70207r0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70207r0) {
                return;
            }
            try {
                if (this.f70205p0.test(t10)) {
                    this.f70207r0 = true;
                    this.f70206q0.cancel();
                    complete(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70206q0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70206q0, subscription)) {
                this.f70206q0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAny(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f70204q0 = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70204q0));
    }
}
