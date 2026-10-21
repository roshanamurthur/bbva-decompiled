package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f73323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<R> f73324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f73325c;

    public static final class a<T, R> extends DeferredScalarSubscriber<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f73326p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public R f73327q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73328r0;

        public a(Subscriber<? super R> subscriber, R r3, BiFunction<R, ? super T, R> biFunction) {
            super(subscriber);
            this.f73327q0 = r3;
            this.f73326p0 = biFunction;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73328r0) {
                return;
            }
            this.f73328r0 = true;
            R r3 = this.f73327q0;
            this.f73327q0 = null;
            complete(r3);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73328r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73328r0 = true;
            this.f73327q0 = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73328r0) {
                return;
            }
            try {
                this.f73327q0 = (R) ObjectHelper.requireNonNull(this.f73326p0.apply(this.f73327q0, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f73323a = parallelFlowable;
        this.f73324b = callable;
        this.f73325c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73323a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super Object>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    subscriberArr2[i10] = new a(subscriberArr[i10], ObjectHelper.requireNonNull(this.f73324b.call(), "The initialSupplier returned a null value"), this.f73325c);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    for (Subscriber<? super R> subscriber : subscriberArr) {
                        EmptySubscription.error(th2, subscriber);
                    }
                    return;
                }
            }
            this.f73323a.subscribe(subscriberArr2);
        }
    }
}
