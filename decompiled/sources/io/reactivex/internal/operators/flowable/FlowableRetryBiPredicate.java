package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRetryBiPredicate<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiPredicate<? super Integer, ? super Throwable> f71057q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71058p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f71059q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f71060r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super Integer, ? super Throwable> f71061s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f71062t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f71063u0;

        public a(Subscriber subscriber, BiPredicate biPredicate, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f71058p0 = subscriber;
            this.f71059q0 = subscriptionArbiter;
            this.f71060r0 = flowable;
            this.f71061s0 = biPredicate;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f71059q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f71063u0;
                    if (j10 != 0) {
                        this.f71063u0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f71060r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71058p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Subscriber<? super T> subscriber = this.f71058p0;
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f71061s0;
                int i10 = this.f71062t0 + 1;
                this.f71062t0 = i10;
                if (biPredicate.test(Integer.valueOf(i10), th2)) {
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
            this.f71063u0++;
            this.f71058p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f71059q0.setSubscription(subscription);
        }
    }

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.f71057q0 = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        new a(subscriber, this.f71057q0, subscriptionArbiter, this.source).a();
    }
}
