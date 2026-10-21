package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSkipLast<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f71161q0;

    public static final class a<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71162p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71163q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71164r0;

        public a(Subscriber<? super T> subscriber, int i10) {
            super(i10);
            this.f71162p0 = subscriber;
            this.f71163q0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71164r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71162p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71162p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71163q0 == size()) {
                this.f71162p0.onNext(poll());
            } else {
                this.f71164r0.request(1L);
            }
            offer(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71164r0, subscription)) {
                this.f71164r0 = subscription;
                this.f71162p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71164r0.request(j10);
        }
    }

    public FlowableSkipLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.f71161q0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71161q0));
    }
}
