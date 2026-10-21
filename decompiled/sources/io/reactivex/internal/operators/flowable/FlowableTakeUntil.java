package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakeUntil<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends U> f71255q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f71257q0 = new AtomicLong();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71258r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final a<T>.C0314a f71260t0 = new C0314a();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71259s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntil$a$a, reason: collision with other inner class name */
        public final class C0314a extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public C0314a() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a aVar = a.this;
                SubscriptionHelper.cancel(aVar.f71258r0);
                HalfSerializer.onComplete(aVar.f71256p0, aVar, aVar.f71259s0);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                a aVar = a.this;
                SubscriptionHelper.cancel(aVar.f71258r0);
                HalfSerializer.onError(aVar.f71256p0, th2, aVar, aVar.f71259s0);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public a(Subscriber<? super T> subscriber) {
            this.f71256p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71258r0);
            SubscriptionHelper.cancel(this.f71260t0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f71260t0);
            HalfSerializer.onComplete(this.f71256p0, this, this.f71259s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f71260t0);
            HalfSerializer.onError(this.f71256p0, th2, this, this.f71259s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f71256p0, t10, this, this.f71259s0);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71258r0, this.f71257q0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71258r0, this.f71257q0, j10);
        }
    }

    public FlowableTakeUntil(Flowable<T> flowable, Publisher<? extends U> publisher) {
        super(flowable);
        this.f71255q0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        this.f71255q0.subscribe(aVar.f71260t0);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
