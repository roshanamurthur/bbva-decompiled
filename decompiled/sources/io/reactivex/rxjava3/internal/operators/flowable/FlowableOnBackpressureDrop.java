package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureDrop<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> implements Consumer<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f75149q0;

    public static final class a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f75151q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75152r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75153s0;

        public a(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f75150p0 = subscriber;
            this.f75151q0 = consumer;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75152r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75153s0) {
                return;
            }
            this.f75153s0 = true;
            this.f75150p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75153s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75153s0 = true;
                this.f75150p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75153s0) {
                return;
            }
            if (get() != 0) {
                this.f75150p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
                return;
            }
            try {
                this.f75151q0.accept(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75152r0, subscription)) {
                this.f75152r0 = subscription;
                this.f75150p0.onSubscribe(this);
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
        this.f75149q0 = this;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75149q0));
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.f75149q0 = consumer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(T t10) {
    }
}
