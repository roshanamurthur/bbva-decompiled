package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
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
public final class ParallelCollect<T, C> extends ParallelFlowable<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f77461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier<? extends C> f77462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiConsumer<? super C, ? super T> f77463c;

    public static final class a<T, C> extends DeferredScalarSubscriber<T, C> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<? super C, ? super T> f77464p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public C f77465q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77466r0;

        public a(Subscriber<? super C> subscriber, C c10, BiConsumer<? super C, ? super T> biConsumer) {
            super(subscriber);
            this.f77465q0 = c10;
            this.f77464p0 = biConsumer;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77466r0) {
                return;
            }
            this.f77466r0 = true;
            C c10 = this.f77465q0;
            this.f77465q0 = null;
            complete(c10);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77466r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77466r0 = true;
            this.f77465q0 = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77466r0) {
                return;
            }
            try {
                this.f77464p0.accept(this.f77465q0, t10);
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

    public ParallelCollect(ParallelFlowable<? extends T> parallelFlowable, Supplier<? extends C> supplier, BiConsumer<? super C, ? super T> biConsumer) {
        this.f77461a = parallelFlowable;
        this.f77462b = supplier;
        this.f77463c = biConsumer;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77461a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super C>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super Object>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    C c10 = this.f77462b.get();
                    Objects.requireNonNull(c10, "The initialSupplier returned a null value");
                    subscriberArr2[i10] = new a(subscriberArr[i10], c10, this.f77463c);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    for (Subscriber<? super C> subscriber : subscriberArr) {
                        EmptySubscription.error(th2, subscriber);
                    }
                    return;
                }
            }
            this.f77461a.subscribe(subscriberArr2);
        }
    }
}
