package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCollectWithCollector<T, A, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f74011q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Collector<? super T, A, R> f74012r0;

    public static final class a<T, A, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<A, T> f74013p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<A, R> f74014q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74015r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74016s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public A f74017t0;

        public a(Subscriber<? super R> subscriber, A a10, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            super(subscriber);
            this.f74017t0 = a10;
            this.f74013p0 = biConsumer;
            this.f74014q0 = function;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f74015r0.cancel();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74016s0) {
                return;
            }
            this.f74016s0 = true;
            this.f74015r0 = SubscriptionHelper.CANCELLED;
            A a10 = this.f74017t0;
            this.f74017t0 = null;
            try {
                Object objApply = this.f74014q0.apply(a10);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                complete(objApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74016s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74016s0 = true;
            this.f74015r0 = SubscriptionHelper.CANCELLED;
            this.f74017t0 = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74016s0) {
                return;
            }
            try {
                this.f74013p0.accept(this.f74017t0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74015r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(@NonNull Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74015r0, subscription)) {
                this.f74015r0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectWithCollector(Flowable<T> flowable, Collector<? super T, A, R> collector) {
        this.f74011q0 = flowable;
        this.f74012r0 = collector;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super R> subscriber) {
        Collector<? super T, A, R> collector = this.f74012r0;
        try {
            this.f74011q0.subscribe((FlowableSubscriber) new a(subscriber, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
