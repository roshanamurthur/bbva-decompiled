package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryPredicate<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f75322q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75323r0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75324p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f75325q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f75326r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Predicate<? super Throwable> f75327s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f75328t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f75329u0;

        public a(Subscriber subscriber, long j10, Predicate predicate, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f75324p0 = subscriber;
            this.f75325q0 = subscriptionArbiter;
            this.f75326r0 = flowable;
            this.f75327s0 = predicate;
            this.f75328t0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f75325q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f75329u0;
                    if (j10 != 0) {
                        this.f75329u0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f75326r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75324p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            long j10 = this.f75328t0;
            if (j10 != Long.MAX_VALUE) {
                this.f75328t0 = j10 - 1;
            }
            Subscriber<? super T> subscriber = this.f75324p0;
            if (j10 == 0) {
                subscriber.onError(th2);
                return;
            }
            try {
                if (this.f75327s0.test(th2)) {
                    a();
                } else {
                    subscriber.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                subscriber.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75329u0++;
            this.f75324p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f75325q0.setSubscription(subscription);
        }
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j10, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.f75322q0 = predicate;
        this.f75323r0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        new a(subscriber, this.f75323r0, this.f75322q0, subscriptionArbiter, this.source).a();
    }
}
