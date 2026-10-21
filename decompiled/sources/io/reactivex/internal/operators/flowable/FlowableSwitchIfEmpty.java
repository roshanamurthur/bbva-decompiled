package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSwitchIfEmpty<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f71202q0;

    public static final class a<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71203p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<? extends T> f71204q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f71206s0 = true;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SubscriptionArbiter f71205r0 = new SubscriptionArbiter(false);

        public a(Publisher publisher, Subscriber subscriber) {
            this.f71203p0 = subscriber;
            this.f71204q0 = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.f71206s0) {
                this.f71203p0.onComplete();
            } else {
                this.f71206s0 = false;
                this.f71204q0.subscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71203p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71206s0) {
                this.f71206s0 = false;
            }
            this.f71203p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f71205r0.setSubscription(subscription);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, Publisher<? extends T> publisher) {
        super(flowable);
        this.f71202q0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(this.f71202q0, subscriber);
        subscriber.onSubscribe(aVar.f71205r0);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
