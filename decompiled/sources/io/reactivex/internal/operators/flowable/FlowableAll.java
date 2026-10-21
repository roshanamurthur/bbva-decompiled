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
public final class FlowableAll<T> extends io.reactivex.internal.operators.flowable.a<T, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f70184q0;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f70185p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70186q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70187r0;

        public a(Subscriber<? super Boolean> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f70185p0 = predicate;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f70186q0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70187r0) {
                return;
            }
            this.f70187r0 = true;
            complete(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70187r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70187r0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70187r0) {
                return;
            }
            try {
                if (this.f70185p0.test(t10)) {
                    return;
                }
                this.f70187r0 = true;
                this.f70186q0.cancel();
                complete(Boolean.FALSE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70186q0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70186q0, subscription)) {
                this.f70186q0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAll(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f70184q0 = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70184q0));
    }
}
