package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, ? extends R> f73287b;

    public static final class a<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f73288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f73289q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f73290r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73291s0;

        public a(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function) {
            this.f73288p0 = conditionalSubscriber;
            this.f73289q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73290r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73291s0) {
                return;
            }
            this.f73291s0 = true;
            this.f73288p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73291s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73291s0 = true;
                this.f73288p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73291s0) {
                return;
            }
            try {
                this.f73288p0.onNext(ObjectHelper.requireNonNull(this.f73289q0.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73290r0, subscription)) {
                this.f73290r0 = subscription;
                this.f73288p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73290r0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f73291s0) {
                return false;
            }
            try {
                return this.f73288p0.tryOnNext(ObjectHelper.requireNonNull(this.f73289q0.apply(t10), "The mapper returned a null value"));
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
        public final Subscriber<? super R> f73292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f73293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f73294r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73295s0;

        public b(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function) {
            this.f73292p0 = subscriber;
            this.f73293q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73294r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73295s0) {
                return;
            }
            this.f73295s0 = true;
            this.f73292p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73295s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73295s0 = true;
                this.f73292p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73295s0) {
                return;
            }
            try {
                this.f73292p0.onNext(ObjectHelper.requireNonNull(this.f73293q0.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73294r0, subscription)) {
                this.f73294r0 = subscription;
                this.f73292p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73294r0.request(j10);
        }
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.f73286a = parallelFlowable;
        this.f73287b = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73286a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                Function<? super T, ? extends R> function = this.f73287b;
                if (z10) {
                    subscriberArr2[i10] = new a((ConditionalSubscriber) subscriber, function);
                } else {
                    subscriberArr2[i10] = new b(subscriber, function);
                }
            }
            this.f73286a.subscribe(subscriberArr2);
        }
    }
}
