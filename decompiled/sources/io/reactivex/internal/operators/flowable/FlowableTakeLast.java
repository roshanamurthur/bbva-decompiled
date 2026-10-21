package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakeLast<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f71231q0;

    public static final class a<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71232p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71233q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71234r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f71235s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f71236t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f71237u0 = new AtomicLong();
        public final AtomicInteger v0 = new AtomicInteger();

        public a(Subscriber<? super T> subscriber, int i10) {
            this.f71232p0 = subscriber;
            this.f71233q0 = i10;
        }

        public final void a() {
            if (this.v0.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f71232p0;
                long jAddAndGet = this.f71237u0.get();
                while (!this.f71236t0) {
                    if (this.f71235s0) {
                        long j10 = 0;
                        while (j10 != jAddAndGet) {
                            if (this.f71236t0) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onNext(tPoll);
                                j10++;
                            }
                        }
                        if (j10 != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f71237u0.addAndGet(-j10);
                        }
                    }
                    if (this.v0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71236t0 = true;
            this.f71234r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71235s0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71232p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71233q0 == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71234r0, subscription)) {
                this.f71234r0 = subscription;
                this.f71232p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71237u0, j10);
                a();
            }
        }
    }

    public FlowableTakeLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.f71231q0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71231q0));
    }
}
