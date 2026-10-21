package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCollect<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends U> f74570q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f74571r0;

    public static final class a<T, U> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f74572p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final U f74573q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74574r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74575s0;

        public a(Subscriber<? super U> subscriber, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            super(subscriber);
            this.f74572p0 = biConsumer;
            this.f74573q0 = u2;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f74574r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74575s0) {
                return;
            }
            this.f74575s0 = true;
            complete(this.f74573q0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74575s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74575s0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74575s0) {
                return;
            }
            try {
                this.f74572p0.accept(this.f74573q0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74574r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74574r0, subscription)) {
                this.f74574r0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollect(Flowable<T> flowable, Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        super(flowable);
        this.f74570q0 = supplier;
        this.f74571r0 = biConsumer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        try {
            U u2 = this.f74570q0.get();
            Objects.requireNonNull(u2, "The initial value supplied is null");
            this.source.subscribe((FlowableSubscriber) new a(subscriber, u2, this.f74571r0));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
