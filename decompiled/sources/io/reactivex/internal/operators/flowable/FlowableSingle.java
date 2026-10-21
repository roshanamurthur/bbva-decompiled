package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSingle<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f71139q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71140r0;

    public static final class a<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f71141p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f71142q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71143r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f71144s0;

        public a(Subscriber<? super T> subscriber, T t10, boolean z10) {
            super(subscriber);
            this.f71141p0 = t10;
            this.f71142q0 = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f71143r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71144s0) {
                return;
            }
            this.f71144s0 = true;
            T t10 = this.value;
            this.value = null;
            if (t10 == null) {
                t10 = this.f71141p0;
            }
            if (t10 != null) {
                complete(t10);
            } else if (this.f71142q0) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71144s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71144s0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71144s0) {
                return;
            }
            if (this.value == null) {
                this.value = t10;
                return;
            }
            this.f71144s0 = true;
            this.f71143r0.cancel();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71143r0, subscription)) {
                this.f71143r0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(Flowable<T> flowable, T t10, boolean z10) {
        super(flowable);
        this.f71139q0 = t10;
        this.f71140r0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71139q0, this.f71140r0));
    }
}
