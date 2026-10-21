package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends R> f77541b;

    public static final class a<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f77542p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f77543q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f77544r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77545s0;

        public a(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function) {
            this.f77542p0 = conditionalSubscriber;
            this.f77543q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77544r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77545s0) {
                return;
            }
            this.f77545s0 = true;
            this.f77542p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77545s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77545s0 = true;
                this.f77542p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77545s0) {
                return;
            }
            try {
                R rApply = this.f77543q0.apply(t10);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                this.f77542p0.onNext(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77544r0, subscription)) {
                this.f77544r0 = subscription;
                this.f77542p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77544r0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f77545s0) {
                return false;
            }
            try {
                R rApply = this.f77543q0.apply(t10);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                return this.f77542p0.tryOnNext(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }
    }

    public static final class b<T, R> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f77546p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f77547q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f77548r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77549s0;

        public b(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function) {
            this.f77546p0 = subscriber;
            this.f77547q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77548r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77549s0) {
                return;
            }
            this.f77549s0 = true;
            this.f77546p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77549s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77549s0 = true;
                this.f77546p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77549s0) {
                return;
            }
            try {
                R rApply = this.f77547q0.apply(t10);
                Objects.requireNonNull(rApply, "The mapper returned a null value");
                this.f77546p0.onNext(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77548r0, subscription)) {
                this.f77548r0 = subscription;
                this.f77546p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f77548r0.request(j10);
        }
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.f77540a = parallelFlowable;
        this.f77541b = function;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77540a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                Function<? super T, ? extends R> function = this.f77541b;
                if (z10) {
                    subscriberArr2[i10] = new a((ConditionalSubscriber) subscriber, function);
                } else {
                    subscriberArr2[i10] = new b(subscriber, function);
                }
            }
            this.f77540a.subscribe(subscriberArr2);
        }
    }
}
