package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
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
public final class FlowableSkipUntil<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<U> f71179q0;

    public static final class a<T> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71180p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71181q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f71182r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final a<T>.C0312a f71183s0 = new C0312a();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71184t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71185u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableSkipUntil$a$a, reason: collision with other inner class name */
        public final class C0312a extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public C0312a() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a.this.f71185u0 = true;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                a aVar = a.this;
                SubscriptionHelper.cancel(aVar.f71181q0);
                HalfSerializer.onError(aVar.f71180p0, th2, aVar, aVar.f71184t0);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                a.this.f71185u0 = true;
                get().cancel();
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public a(Subscriber<? super T> subscriber) {
            this.f71180p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71181q0);
            SubscriptionHelper.cancel(this.f71183s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f71183s0);
            HalfSerializer.onComplete(this.f71180p0, this, this.f71184t0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f71183s0);
            HalfSerializer.onError(this.f71180p0, th2, this, this.f71184t0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f71181q0.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71181q0, this.f71182r0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71181q0, this.f71182r0, j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (!this.f71185u0) {
                return false;
            }
            HalfSerializer.onNext(this.f71180p0, t10, this, this.f71184t0);
            return true;
        }
    }

    public FlowableSkipUntil(Flowable<T> flowable, Publisher<U> publisher) {
        super(flowable);
        this.f71179q0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        this.f71179q0.subscribe(aVar.f71183s0);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
