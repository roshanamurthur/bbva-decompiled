package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRetryPredicate<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f71064q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71065r0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71066p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f71067q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f71068r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Predicate<? super Throwable> f71069s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71070t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f71071u0;

        public a(Subscriber subscriber, long j10, Predicate predicate, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f71066p0 = subscriber;
            this.f71067q0 = subscriptionArbiter;
            this.f71068r0 = flowable;
            this.f71069s0 = predicate;
            this.f71070t0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f71067q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f71071u0;
                    if (j10 != 0) {
                        this.f71071u0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f71068r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71066p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            long j10 = this.f71070t0;
            if (j10 != Long.MAX_VALUE) {
                this.f71070t0 = j10 - 1;
            }
            Subscriber<? super T> subscriber = this.f71066p0;
            if (j10 == 0) {
                subscriber.onError(th2);
                return;
            }
            try {
                if (this.f71069s0.test(th2)) {
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
            this.f71071u0++;
            this.f71066p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f71067q0.setSubscription(subscription);
        }
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j10, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.f71064q0 = predicate;
        this.f71065r0 = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        new a(subscriber, this.f71065r0, this.f71064q0, subscriptionArbiter, this.source).a();
    }
}
