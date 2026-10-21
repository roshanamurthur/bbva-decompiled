package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableScan<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f71096q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71097p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f71098q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71099r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f71100s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f71101t0;

        public a(Subscriber<? super T> subscriber, BiFunction<T, T, T> biFunction) {
            this.f71097p0 = subscriber;
            this.f71098q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71099r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71101t0) {
                return;
            }
            this.f71101t0 = true;
            this.f71097p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71101t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71101t0 = true;
                this.f71097p0.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71101t0) {
                return;
            }
            T t11 = this.f71100s0;
            Subscriber<? super T> subscriber = this.f71097p0;
            if (t11 == null) {
                this.f71100s0 = t10;
                subscriber.onNext(t10);
                return;
            }
            try {
                ?? r4 = (T) ObjectHelper.requireNonNull(this.f71098q0.apply(t11, t10), "The value returned by the accumulator is null");
                this.f71100s0 = r4;
                subscriber.onNext(r4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71099r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71099r0, subscription)) {
                this.f71099r0 = subscription;
                this.f71097p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71099r0.request(j10);
        }
    }

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.f71096q0 = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71096q0));
    }
}
