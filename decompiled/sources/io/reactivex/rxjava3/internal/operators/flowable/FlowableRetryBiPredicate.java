package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryBiPredicate<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiPredicate<? super Integer, ? super Throwable> f75315q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f75317q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f75318r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super Integer, ? super Throwable> f75319s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f75320t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f75321u0;

        public a(Subscriber subscriber, BiPredicate biPredicate, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f75316p0 = subscriber;
            this.f75317q0 = subscriptionArbiter;
            this.f75318r0 = flowable;
            this.f75319s0 = biPredicate;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f75317q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f75321u0;
                    if (j10 != 0) {
                        this.f75321u0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f75318r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75316p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Subscriber<? super T> subscriber = this.f75316p0;
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f75319s0;
                int i10 = this.f75320t0 + 1;
                this.f75320t0 = i10;
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
            this.f75321u0++;
            this.f75316p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f75317q0.setSubscription(subscription);
        }
    }

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.f75315q0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        new a(subscriber, this.f75315q0, subscriptionArbiter, this.source).a();
    }
}
