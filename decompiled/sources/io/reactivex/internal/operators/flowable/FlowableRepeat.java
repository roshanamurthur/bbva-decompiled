package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeat<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70996q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70997p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f70998q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends T> f70999r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f71000s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71001t0;

        public a(Subscriber subscriber, long j10, SubscriptionArbiter subscriptionArbiter, Flowable flowable) {
            this.f70997p0 = subscriber;
            this.f70998q0 = subscriptionArbiter;
            this.f70999r0 = flowable;
            this.f71000s0 = j10;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SubscriptionArbiter subscriptionArbiter = this.f70998q0;
                    if (subscriptionArbiter.isCancelled()) {
                        return;
                    }
                    long j10 = this.f71001t0;
                    if (j10 != 0) {
                        this.f71001t0 = 0L;
                        subscriptionArbiter.produced(j10);
                    }
                    this.f70999r0.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j10 = this.f71000s0;
            if (j10 != Long.MAX_VALUE) {
                this.f71000s0 = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f70997p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70997p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71001t0++;
            this.f70997p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f70998q0.setSubscription(subscription);
        }
    }

    public FlowableRepeat(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f70996q0 = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.onSubscribe(subscriptionArbiter);
        long j10 = this.f70996q0;
        new a(subscriber, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).a();
    }
}
