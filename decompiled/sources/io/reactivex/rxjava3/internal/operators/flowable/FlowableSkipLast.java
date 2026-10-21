package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipLast<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f75419q0;

    public static final class a<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75420p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75421q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75422r0;

        public a(Subscriber<? super T> subscriber, int i10) {
            super(i10);
            this.f75420p0 = subscriber;
            this.f75421q0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75422r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75420p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75420p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75421q0 == size()) {
                this.f75420p0.onNext(poll());
            } else {
                this.f75422r0.request(1L);
            }
            offer(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75422r0, subscription)) {
                this.f75422r0 = subscription;
                this.f75420p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75422r0.request(j10);
        }
    }

    public FlowableSkipLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.f75419q0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75419q0));
    }
}
