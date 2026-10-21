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
public final class FlowableElementAt<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70533q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f70534r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70535s0;

    public static final class a<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f70536p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f70537q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f70538r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70539s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f70540t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f70541u0;

        public a(Subscriber<? super T> subscriber, long j10, T t10, boolean z10) {
            super(subscriber);
            this.f70536p0 = j10;
            this.f70537q0 = t10;
            this.f70538r0 = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f70539s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70541u0) {
                return;
            }
            this.f70541u0 = true;
            T t10 = this.f70537q0;
            if (t10 != null) {
                complete(t10);
            } else if (this.f70538r0) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70541u0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70541u0 = true;
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70541u0) {
                return;
            }
            long j10 = this.f70540t0;
            if (j10 != this.f70536p0) {
                this.f70540t0 = j10 + 1;
                return;
            }
            this.f70541u0 = true;
            this.f70539s0.cancel();
            complete(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70539s0, subscription)) {
                this.f70539s0 = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(Flowable<T> flowable, long j10, T t10, boolean z10) {
        super(flowable);
        this.f70533q0 = j10;
        this.f70534r0 = t10;
        this.f70535s0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70533q0, this.f70534r0, this.f70535s0));
    }
}
