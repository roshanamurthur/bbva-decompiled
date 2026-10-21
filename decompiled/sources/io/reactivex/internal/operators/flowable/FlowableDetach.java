package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDetach<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Subscriber<? super T> f70483p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70484q0;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f70484q0;
            this.f70484q0 = EmptyComponent.INSTANCE;
            this.f70483p0 = EmptyComponent.asSubscriber();
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscriber<? super T> subscriber = this.f70483p0;
            this.f70484q0 = EmptyComponent.INSTANCE;
            this.f70483p0 = EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Subscriber<? super T> subscriber = this.f70483p0;
            this.f70484q0 = EmptyComponent.INSTANCE;
            this.f70483p0 = EmptyComponent.asSubscriber();
            subscriber.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70483p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70484q0, subscription)) {
                this.f70484q0 = subscription;
                this.f70483p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70484q0.request(j10);
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Flowable<T> flowable = this.source;
        a aVar = new a();
        aVar.f70483p0 = subscriber;
        flowable.subscribe((FlowableSubscriber) aVar);
    }
}
