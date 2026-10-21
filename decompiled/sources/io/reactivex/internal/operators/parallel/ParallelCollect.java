package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
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
public final class ParallelCollect<T, C> extends ParallelFlowable<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f73210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends C> f73211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiConsumer<? super C, ? super T> f73212c;

    public static final class a<T, C> extends DeferredScalarSubscriber<T, C> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<? super C, ? super T> f73213p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public C f73214q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73215r0;

        public a(Subscriber<? super C> subscriber, C c10, BiConsumer<? super C, ? super T> biConsumer) {
            super(subscriber);
            this.f73214q0 = c10;
            this.f73213p0 = biConsumer;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73215r0) {
                return;
            }
            this.f73215r0 = true;
            C c10 = this.f73214q0;
            this.f73214q0 = null;
            complete(c10);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73215r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73215r0 = true;
            this.f73214q0 = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73215r0) {
                return;
            }
            try {
                this.f73213p0.accept(this.f73214q0, t10);
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

    public ParallelCollect(ParallelFlowable<? extends T> parallelFlowable, Callable<? extends C> callable, BiConsumer<? super C, ? super T> biConsumer) {
        this.f73210a = parallelFlowable;
        this.f73211b = callable;
        this.f73212c = biConsumer;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73210a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super C>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super Object>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    subscriberArr2[i10] = new a(subscriberArr[i10], ObjectHelper.requireNonNull(this.f73211b.call(), "The initialSupplier returned a null value"), this.f73212c);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    for (Subscriber<? super C> subscriber : subscriberArr) {
                        EmptySubscription.error(th2, subscriber);
                    }
                    return;
                }
            }
            this.f73210a.subscribe(subscriberArr2);
        }
    }
}
