package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f77577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier<R> f77578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f77579c;

    public static final class a<T, R> extends DeferredScalarSubscriber<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f77580p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public R f77581q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77582r0;

        public a(Subscriber<? super R> subscriber, R r3, BiFunction<R, ? super T, R> biFunction) {
            super(subscriber);
            this.f77581q0 = r3;
            this.f77580p0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77582r0) {
                return;
            }
            this.f77582r0 = true;
            R r3 = this.f77581q0;
            this.f77581q0 = null;
            complete(r3);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77582r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77582r0 = true;
            this.f77581q0 = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77582r0) {
                return;
            }
            try {
                R rApply = this.f77580p0.apply(this.f77581q0, t10);
                Objects.requireNonNull(rApply, "The reducer returned a null value");
                this.f77581q0 = rApply;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        this.f77577a = parallelFlowable;
        this.f77578b = supplier;
        this.f77579c = biFunction;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77577a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super Object>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    R r3 = this.f77578b.get();
                    Objects.requireNonNull(r3, "The initialSupplier returned a null value");
                    subscriberArr2[i10] = new a(subscriberArr[i10], r3, this.f77579c);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    for (Subscriber<? super R> subscriber : subscriberArr) {
                        EmptySubscription.error(th2, subscriber);
                    }
                    return;
                }
            }
            this.f77577a.subscribe(subscriberArr2);
        }
    }
}
