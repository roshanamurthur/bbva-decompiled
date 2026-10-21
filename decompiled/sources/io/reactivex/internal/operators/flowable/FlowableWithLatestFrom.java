package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f71459q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends U> f71460r0;

    public static final class b<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71462p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f71463q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71464r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71465s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71466t0 = new AtomicReference<>();

        public b(SerializedSubscriber serializedSubscriber, BiFunction biFunction) {
            this.f71462p0 = serializedSubscriber;
            this.f71463q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71464r0);
            SubscriptionHelper.cancel(this.f71466t0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.cancel(this.f71466t0);
            this.f71462p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f71466t0);
            this.f71462p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f71464r0.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71464r0, this.f71465s0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71464r0, this.f71465s0, j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            Subscriber<? super R> subscriber = this.f71462p0;
            U u2 = get();
            if (u2 != null) {
                try {
                    subscriber.onNext((Object) ObjectHelper.requireNonNull(this.f71463q0.apply(t10, u2), "The combiner returned a null value"));
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
        this.f71459q0 = biFunction;
        this.f71460r0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        b bVar = new b(serializedSubscriber, this.f71459q0);
        serializedSubscriber.onSubscribe(bVar);
        this.f71460r0.subscribe(new a(bVar));
        this.source.subscribe((FlowableSubscriber) bVar);
    }

    public final class a implements FlowableSubscriber<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U, R> f71461p0;

        public a(b bVar) {
            this.f71461p0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T, U, R> bVar = this.f71461p0;
            SubscriptionHelper.cancel(bVar.f71464r0);
            bVar.f71462p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            this.f71461p0.lazySet(u2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f71461p0.f71466t0, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
