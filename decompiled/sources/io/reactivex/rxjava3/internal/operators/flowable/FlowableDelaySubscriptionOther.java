package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f74736q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<U> f74737r0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<? extends T> f74739q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T>.C0368a f74740r0 = new C0368a();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Subscription> f74741s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableDelaySubscriptionOther$a$a, reason: collision with other inner class name */
        public final class C0368a extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public C0368a() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    a aVar = a.this;
                    aVar.f74739q0.subscribe(aVar);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    a.this.f74738p0.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                Subscription subscription = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (subscription != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    subscription.cancel();
                    a aVar = a.this;
                    aVar.f74739q0.subscribe(aVar);
                }
            }

            @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                if (SubscriptionHelper.setOnce(this, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        public a(Publisher publisher, Subscriber subscriber) {
            this.f74738p0 = subscriber;
            this.f74739q0 = publisher;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f74740r0);
            SubscriptionHelper.cancel(this.f74741s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74738p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74738p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74738p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f74741s0, this, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                SubscriptionHelper.deferredRequest(this.f74741s0, this, j10);
            }
        }
    }

    public FlowableDelaySubscriptionOther(Publisher<? extends T> publisher, Publisher<U> publisher2) {
        this.f74736q0 = publisher;
        this.f74737r0 = publisher2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(this.f74736q0, subscriber);
        subscriber.onSubscribe(aVar);
        this.f74737r0.subscribe(aVar.f74740r0);
    }
}
