package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchIfEmpty<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f75460q0;

    public static final class a<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75461p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<? extends T> f75462q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75464s0 = true;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SubscriptionArbiter f75463r0 = new SubscriptionArbiter(false);

        public a(Publisher publisher, Subscriber subscriber) {
            this.f75461p0 = subscriber;
            this.f75462q0 = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.f75464s0) {
                this.f75461p0.onComplete();
            } else {
                this.f75464s0 = false;
                this.f75462q0.subscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75461p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75464s0) {
                this.f75464s0 = false;
            }
            this.f75461p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f75463r0.setSubscription(subscription);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, Publisher<? extends T> publisher) {
        super(flowable);
        this.f75460q0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(this.f75460q0, subscriber);
        subscriber.onSubscribe(aVar.f75463r0);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
