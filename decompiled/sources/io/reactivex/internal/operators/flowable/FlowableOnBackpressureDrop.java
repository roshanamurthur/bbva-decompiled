package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnBackpressureDrop<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements Consumer<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f70877q0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70878p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f70879q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70880r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70881s0;

        public a(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f70878p0 = subscriber;
            this.f70879q0 = consumer;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70880r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70881s0) {
                return;
            }
            this.f70881s0 = true;
            this.f70878p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70881s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70881s0 = true;
                this.f70878p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70881s0) {
                return;
            }
            if (get() != 0) {
                this.f70878p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
                return;
            }
            try {
                this.f70879q0.accept(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70880r0, subscription)) {
                this.f70880r0 = subscription;
                this.f70878p0.onSubscribe(this);
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

    public FlowableOnBackpressureDrop(Flowable<T> flowable) {
        super(flowable);
        this.f70877q0 = this;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70877q0));
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.f70877q0 = consumer;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(T t10) {
    }
}
