package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCollect<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends U> f70316q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f70317r0;

    public static final class a<T, U> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f70318p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final U f70319q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70320r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70321s0;

        public a(Subscriber<? super U> subscriber, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            super(subscriber);
            this.f70318p0 = biConsumer;
            this.f70319q0 = u2;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f70320r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70321s0) {
                return;
            }
            this.f70321s0 = true;
            complete(this.f70319q0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70321s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70321s0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70321s0) {
                return;
            }
            try {
                this.f70318p0.accept(this.f70319q0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70320r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70320r0, subscription)) {
                this.f70320r0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollect(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(flowable);
        this.f70316q0 = callable;
        this.f70317r0 = biConsumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, ObjectHelper.requireNonNull(this.f70316q0.call(), "The initial value supplied is null"), this.f70317r0));
        } catch (Throwable th2) {
            EmptySubscription.error(th2, subscriber);
        }
    }
}
