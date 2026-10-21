package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableScan<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f75354q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75355p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f75356q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75357r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f75358s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f75359t0;

        public a(Subscriber<? super T> subscriber, BiFunction<T, T, T> biFunction) {
            this.f75355p0 = subscriber;
            this.f75356q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75357r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75359t0) {
                return;
            }
            this.f75359t0 = true;
            this.f75355p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75359t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75359t0 = true;
                this.f75355p0.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75359t0) {
                return;
            }
            T t11 = this.f75358s0;
            Subscriber<? super T> subscriber = this.f75355p0;
            if (t11 == null) {
                this.f75358s0 = t10;
                subscriber.onNext(t10);
                return;
            }
            try {
                T tApply = this.f75356q0.apply(t11, t10);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f75358s0 = tApply;
                subscriber.onNext(tApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75357r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75357r0, subscription)) {
                this.f75357r0 = subscription;
                this.f75355p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75357r0.request(j10);
        }
    }

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.f75354q0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75354q0));
    }
}
