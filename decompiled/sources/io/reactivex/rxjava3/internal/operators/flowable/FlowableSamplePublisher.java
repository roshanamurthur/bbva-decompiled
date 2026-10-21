package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f75331q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<?> f75332r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f75333s0;

    public static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f75334u0;
        public volatile boolean v0;

        public a(Publisher publisher, SerializedSubscriber serializedSubscriber) {
            super(publisher, serializedSubscriber);
            this.f75334u0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.c
        public final void a() {
            this.v0 = true;
            if (this.f75334u0.getAndIncrement() == 0) {
                b();
                this.f75335p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.c
        public final void c() {
            if (this.f75334u0.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.v0;
                    b();
                    if (z10) {
                        this.f75335p0.onComplete();
                        return;
                    }
                } while (this.f75334u0.decrementAndGet() != 0);
            }
        }
    }

    public static final class b<T> extends c<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.c
        public final void a() {
            this.f75335p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.c
        public final void c() {
            b();
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75335p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<?> f75336q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f75337r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75338s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f75339t0;

        public c(Publisher publisher, SerializedSubscriber serializedSubscriber) {
            this.f75335p0 = serializedSubscriber;
            this.f75336q0 = publisher;
        }

        public abstract void a();

        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f75337r0;
                long j10 = atomicLong.get();
                Subscriber<? super T> subscriber = this.f75335p0;
                if (j10 != 0) {
                    subscriber.onNext(andSet);
                    BackpressureHelper.produced(atomicLong, 1L);
                } else {
                    cancel();
                    subscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public abstract void c();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f75338s0);
            this.f75339t0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f75338s0);
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f75338s0);
            this.f75335p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75339t0, subscription)) {
                this.f75339t0 = subscription;
                this.f75335p0.onSubscribe(this);
                if (this.f75338s0.get() == null) {
                    this.f75336q0.subscribe(new d(this));
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75337r0, j10);
            }
        }
    }

    public static final class d<T> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final c<T> f75340p0;

        public d(c<T> cVar) {
            this.f75340p0 = cVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            c<T> cVar = this.f75340p0;
            cVar.f75339t0.cancel();
            cVar.a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            c<T> cVar = this.f75340p0;
            cVar.f75339t0.cancel();
            cVar.f75335p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f75340p0.c();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this.f75340p0.f75338s0, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableSamplePublisher(Publisher<T> publisher, Publisher<?> publisher2, boolean z10) {
        this.f75331q0 = publisher;
        this.f75332r0 = publisher2;
        this.f75333s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        boolean z10 = this.f75333s0;
        Publisher<?> publisher = this.f75332r0;
        Publisher<T> publisher2 = this.f75331q0;
        if (z10) {
            publisher2.subscribe(new a(publisher, serializedSubscriber));
        } else {
            publisher2.subscribe(new b(publisher, serializedSubscriber));
        }
    }
}
