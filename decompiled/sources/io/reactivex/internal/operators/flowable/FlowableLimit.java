package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableLimit<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70794q0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70795p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f70796q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70797r0;

        public a(Subscriber<? super T> subscriber, long j10) {
            this.f70795p0 = subscriber;
            this.f70796q0 = j10;
            lazySet(j10);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70797r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70796q0 > 0) {
                this.f70796q0 = 0L;
                this.f70795p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70796q0 <= 0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70796q0 = 0L;
                this.f70795p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = this.f70796q0;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.f70796q0 = j11;
                Subscriber<? super T> subscriber = this.f70795p0;
                subscriber.onNext(t10);
                if (j11 == 0) {
                    this.f70797r0.cancel();
                    subscriber.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70797r0, subscription)) {
                long j10 = this.f70796q0;
                Subscriber<? super T> subscriber = this.f70795p0;
                if (j10 == 0) {
                    subscription.cancel();
                    EmptySubscription.complete(subscriber);
                } else {
                    this.f70797r0 = subscription;
                    subscriber.onSubscribe(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    } else {
                        j12 = j11 <= j10 ? j11 : j10;
                    }
                } while (!compareAndSet(j11, j11 - j12));
                this.f70797r0.request(j12);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f70794q0 = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70794q0));
    }
}
