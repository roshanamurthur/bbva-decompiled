package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeLast<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f75487q0;

    public static final class a<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75488p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75489q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75490r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f75491s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f75492t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f75493u0 = new AtomicLong();
        public final AtomicInteger v0 = new AtomicInteger();

        public a(Subscriber<? super T> subscriber, int i10) {
            this.f75488p0 = subscriber;
            this.f75489q0 = i10;
        }

        public final void a() {
            if (this.v0.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f75488p0;
                long jProduced = this.f75493u0.get();
                while (!this.f75492t0) {
                    if (this.f75491s0) {
                        long j10 = 0;
                        while (j10 != jProduced) {
                            if (this.f75492t0) {
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
                        if (isEmpty()) {
                            subscriber.onComplete();
                            return;
                        } else if (j10 != 0) {
                            jProduced = BackpressureHelper.produced(this.f75493u0, j10);
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
            this.f75492t0 = true;
            this.f75490r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75491s0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75488p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75489q0 == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75490r0, subscription)) {
                this.f75490r0 = subscription;
                this.f75488p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75493u0, j10);
                a();
            }
        }
    }

    public FlowableTakeLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.f75487q0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75487q0));
    }
}
