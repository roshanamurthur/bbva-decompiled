package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeatUntil<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BooleanSupplier f71002q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71003p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f71004q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f71005r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BooleanSupplier f71006s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71007t0;

        public a(Subscriber subscriber, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f71003p0 = subscriber;
            this.f71004q0 = subscriptionArbiter;
            this.f71005r0 = flowable;
            this.f71006s0 = booleanSupplier;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f71004q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f71007t0;
                    if (j10 != 0) {
                        this.f71007t0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f71005r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscriber<? super T> subscriber = this.f71003p0;
            try {
                if (this.f71006s0.getAsBoolean()) {
                    subscriber.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71003p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71007t0++;
            this.f71003p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f71004q0.setSubscription(subscription);
        }
    }

    public FlowableRepeatUntil(Flowable<T> flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.f71002q0 = booleanSupplier;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        new a(subscriber, this.f71002q0, subscriptionArbiter, this.source).a();
    }
}
