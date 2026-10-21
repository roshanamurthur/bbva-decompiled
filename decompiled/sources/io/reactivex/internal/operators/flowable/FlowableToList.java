package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<U> f71337q0;

    public static final class a<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Subscription f71338p0;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Subscriber<? super U> subscriber, U u2) {
            super(subscriber);
            this.value = u2;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f71338p0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(this.value);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.value = null;
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t10);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71338p0, subscription)) {
                this.f71338p0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToList(Flowable<T> flowable, Callable<U> callable) {
        super(flowable);
        this.f71337q0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, (Collection) ObjectHelper.requireNonNull(this.f71337q0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
