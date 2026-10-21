package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableElementAt<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74798q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f74799r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f74800s0;

    public static final class a<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f74801p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f74802q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f74803r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74804s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f74805t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74806u0;

        public a(Subscriber<? super T> subscriber, long j10, T t10, boolean z10) {
            super(subscriber);
            this.f74801p0 = j10;
            this.f74802q0 = t10;
            this.f74803r0 = z10;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f74804s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74806u0) {
                return;
            }
            this.f74806u0 = true;
            T t10 = this.f74802q0;
            if (t10 != null) {
                complete(t10);
            } else if (this.f74803r0) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74806u0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74806u0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74806u0) {
                return;
            }
            long j10 = this.f74805t0;
            if (j10 != this.f74801p0) {
                this.f74805t0 = j10 + 1;
                return;
            }
            this.f74806u0 = true;
            this.f74804s0.cancel();
            complete(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74804s0, subscription)) {
                this.f74804s0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(Flowable<T> flowable, long j10, T t10, boolean z10) {
        super(flowable);
        this.f74798q0 = j10;
        this.f74799r0 = t10;
        this.f74800s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74798q0, this.f74799r0, this.f74800s0));
    }
}
