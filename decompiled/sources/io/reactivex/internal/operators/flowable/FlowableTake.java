package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTake<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71225q0;

    public static final class a<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71226p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71227q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f71228r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f71229s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71230t0;

        public a(Subscriber<? super T> subscriber, long j10) {
            this.f71226p0 = subscriber;
            this.f71227q0 = j10;
            this.f71230t0 = j10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71229s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71228r0) {
                return;
            }
            this.f71228r0 = true;
            this.f71226p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71228r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71228r0 = true;
            this.f71229s0.cancel();
            this.f71226p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71228r0) {
                return;
            }
            long j10 = this.f71230t0;
            long j11 = j10 - 1;
            this.f71230t0 = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f71226p0.onNext(t10);
                if (z10) {
                    this.f71229s0.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71229s0, subscription)) {
                this.f71229s0 = subscription;
                long j10 = this.f71227q0;
                Subscriber<? super T> subscriber = this.f71226p0;
                if (j10 != 0) {
                    subscriber.onSubscribe(this);
                    return;
                }
                subscription.cancel();
                this.f71228r0 = true;
                EmptySubscription.complete(subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (get() || !compareAndSet(false, true) || j10 < this.f71227q0) {
                    this.f71229s0.request(j10);
                } else {
                    this.f71229s0.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f71225q0 = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71225q0));
    }
}
