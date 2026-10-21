package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeatWhen<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Flowable<Object>, ? extends Publisher<?>> f71008q0;

    public static final class a<T> extends c<T, Object> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            d(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.c, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71015y0.cancel();
            this.f71013w0.onError(th2);
        }
    }

    public static final class b<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Publisher<T> f71009p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71010q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f71011r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public c<T, U> f71012s0;

        public b(Flowable flowable) {
            this.f71009p0 = flowable;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71010q0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71012s0.cancel();
            this.f71012s0.f71013w0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71012s0.cancel();
            this.f71012s0.f71013w0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f71010q0.get() != SubscriptionHelper.CANCELLED) {
                    this.f71009p0.subscribe(this.f71012s0);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71010q0, this.f71011r0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71010q0, this.f71011r0, j10);
        }
    }

    public static abstract class c<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public long E0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f71013w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final FlowableProcessor<U> f71014x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final Subscription f71015y0;

        public c(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, b bVar) {
            super(false);
            this.f71013w0 = serializedSubscriber;
            this.f71014x0 = flowableProcessor;
            this.f71015y0 = bVar;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f71015y0.cancel();
        }

        public final void d(U u2) {
            setSubscription(EmptySubscription.INSTANCE);
            long j10 = this.E0;
            if (j10 != 0) {
                this.E0 = 0L;
                produced(j10);
            }
            this.f71015y0.request(1L);
            this.f71014x0.onNext(u2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onError(Throwable th2) {
            d(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.E0++;
            this.f71013w0.onNext(t10);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends Publisher<?>> function) {
        super(flowable);
        this.f71008q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71008q0.apply(serialized), "handler returned a null Publisher");
            b bVar = new b(this.source);
            a aVar = new a(serializedSubscriber, serialized, bVar);
            bVar.f71012s0 = aVar;
            subscriber.onSubscribe(aVar);
            publisher.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
