package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRepeatWhen<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Flowable<Object>, ? extends Publisher<?>> f75265q0;

    public static final class a<T> extends c<T, Object> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            d(0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen.c, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75272y0.cancel();
            this.f75270w0.onError(th2);
        }
    }

    public static final class b<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Publisher<T> f75266p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75267q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f75268r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public c<T, U> f75269s0;

        public b(Flowable flowable) {
            this.f75266p0 = flowable;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f75267q0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75269s0.cancel();
            this.f75269s0.f75270w0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75269s0.cancel();
            this.f75269s0.f75270w0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f75267q0.get() != SubscriptionHelper.CANCELLED) {
                    this.f75266p0.subscribe(this.f75269s0);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f75267q0, this.f75268r0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f75267q0, this.f75268r0, j10);
        }
    }

    public static abstract class c<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public long E0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f75270w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final FlowableProcessor<U> f75271x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final Subscription f75272y0;

        public c(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, b bVar) {
            super(false);
            this.f75270w0 = serializedSubscriber;
            this.f75271x0 = flowableProcessor;
            this.f75272y0 = bVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f75272y0.cancel();
        }

        public final void d(U u2) {
            setSubscription(EmptySubscription.INSTANCE);
            long j10 = this.E0;
            if (j10 != 0) {
                this.E0 = 0L;
                produced(j10);
            }
            this.f75272y0.request(1L);
            this.f75271x0.onNext(u2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onError(Throwable th2) {
            d(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.E0++;
            this.f75270w0.onNext(t10);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends Publisher<?>> function) {
        super(flowable);
        this.f75265q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            Publisher<?> publisherApply = this.f75265q0.apply(serialized);
            Objects.requireNonNull(publisherApply, "handler returned a null Publisher");
            Publisher<?> publisher = publisherApply;
            b bVar = new b(this.source);
            a aVar = new a(serializedSubscriber, serialized, bVar);
            bVar.f75269s0 = aVar;
            subscriber.onSubscribe(aVar);
            publisher.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
