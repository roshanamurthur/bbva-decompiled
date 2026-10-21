package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Predicate<? super T> f73235b;

    public static abstract class a<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f73236p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f73237q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73238r0;

        public a(Predicate<? super T> predicate) {
            this.f73236p0 = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73237q0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f73238r0) {
                return;
            }
            this.f73237q0.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f73237q0.request(j10);
        }
    }

    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f73239s0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(predicate);
            this.f73239s0 = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73238r0) {
                return;
            }
            this.f73238r0 = true;
            this.f73239s0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73238r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73238r0 = true;
                this.f73239s0.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73237q0, subscription)) {
                this.f73237q0 = subscription;
                this.f73239s0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (!this.f73238r0) {
                try {
                    if (this.f73236p0.test(t10)) {
                        return this.f73239s0.tryOnNext(t10);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }
    }

    public static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super T> f73240s0;

        public c(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            super(predicate);
            this.f73240s0 = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73238r0) {
                return;
            }
            this.f73238r0 = true;
            this.f73240s0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73238r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73238r0 = true;
                this.f73240s0.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73237q0, subscription)) {
                this.f73237q0 = subscription;
                this.f73240s0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (!this.f73238r0) {
                try {
                    if (this.f73236p0.test(t10)) {
                        this.f73240s0.onNext(t10);
                        return true;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }
    }

    public ParallelFilter(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate) {
        this.f73234a = parallelFlowable;
        this.f73235b = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73234a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super T> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                Predicate<? super T> predicate = this.f73235b;
                if (z10) {
                    subscriberArr2[i10] = new b((ConditionalSubscriber) subscriber, predicate);
                } else {
                    subscriberArr2[i10] = new c(subscriber, predicate);
                }
            }
            this.f73234a.subscribe(subscriberArr2);
        }
    }
}
