package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkip<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75415q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75416p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f75417q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75418r0;

        public a(Subscriber<? super T> subscriber, long j10) {
            this.f75416p0 = subscriber;
            this.f75417q0 = j10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75418r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75416p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75416p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = this.f75417q0;
            if (j10 != 0) {
                this.f75417q0 = j10 - 1;
            } else {
                this.f75416p0.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75418r0, subscription)) {
                long j10 = this.f75417q0;
                this.f75418r0 = subscription;
                this.f75416p0.onSubscribe(this);
                subscription.request(j10);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75418r0.request(j10);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f75415q0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75415q0));
    }
}
