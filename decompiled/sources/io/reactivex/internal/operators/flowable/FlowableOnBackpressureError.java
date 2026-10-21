package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnBackpressureError<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70882p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70883q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70884r0;

        public a(Subscriber<? super T> subscriber) {
            this.f70882p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70883q0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70884r0) {
                return;
            }
            this.f70884r0 = true;
            this.f70882p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70884r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70884r0 = true;
                this.f70882p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70884r0) {
                return;
            }
            if (get() != 0) {
                this.f70882p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
            } else {
                this.f70883q0.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70883q0, subscription)) {
                this.f70883q0 = subscription;
                this.f70882p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }
    }

    public FlowableOnBackpressureError(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
