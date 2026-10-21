package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f75691q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends U> f75692r0;

    public static final class b<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75694p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f75695q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75696r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f75697s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75698t0 = new AtomicReference<>();

        public b(SerializedSubscriber serializedSubscriber, BiFunction biFunction) {
            this.f75694p0 = serializedSubscriber;
            this.f75695q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f75696r0);
            SubscriptionHelper.cancel(this.f75698t0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f75698t0);
            this.f75694p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f75698t0);
            this.f75694p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f75696r0.get().request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f75696r0, this.f75697s0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f75696r0, this.f75697s0, j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            Subscriber<? super R> subscriber = this.f75694p0;
            U u2 = get();
            if (u2 != null) {
                try {
                    R rApply = this.f75695q0.apply(t10, u2);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    subscriber.onNext(rApply);
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    subscriber.onError(th2);
                }
            }
            return false;
        }
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, Publisher<? extends U> publisher) {
        super(flowable);
        this.f75691q0 = biFunction;
        this.f75692r0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        b bVar = new b(serializedSubscriber, this.f75691q0);
        serializedSubscriber.onSubscribe(bVar);
        this.f75692r0.subscribe(new a(bVar));
        this.source.subscribe((FlowableSubscriber) bVar);
    }

    public final class a implements FlowableSubscriber<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U, R> f75693p0;

        public a(b bVar) {
            this.f75693p0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T, U, R> bVar = this.f75693p0;
            SubscriptionHelper.cancel(bVar.f75696r0);
            bVar.f75694p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            this.f75693p0.lazySet(u2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f75693p0.f75698t0, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
