package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f77564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer<? super T> f77565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer<? super T> f77566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer<? super Throwable> f77567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Action f77568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Action f77569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Consumer<? super Subscription> f77570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LongConsumer f77571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Action f77572i;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f77573p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ParallelPeek<T> f77574q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f77575r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77576s0;

        public a(Subscriber<? super T> subscriber, ParallelPeek<T> parallelPeek) {
            this.f77573p0 = subscriber;
            this.f77574q0 = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                this.f77574q0.f77572i.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f77575r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscriber<? super T> subscriber = this.f77573p0;
            ParallelPeek<T> parallelPeek = this.f77574q0;
            if (this.f77576s0) {
                return;
            }
            this.f77576s0 = true;
            try {
                parallelPeek.f77568e.run();
                subscriber.onComplete();
                try {
                    parallelPeek.f77569f.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                subscriber.onError(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            ParallelPeek<T> parallelPeek = this.f77574q0;
            if (this.f77576s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77576s0 = true;
            try {
                parallelPeek.f77567d.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f77573p0.onError(th2);
            try {
                parallelPeek.f77569f.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            ParallelPeek<T> parallelPeek = this.f77574q0;
            if (this.f77576s0) {
                return;
            }
            try {
                parallelPeek.f77565b.accept(t10);
                this.f77573p0.onNext(t10);
                try {
                    parallelPeek.f77566c.accept(t10);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Subscriber<? super T> subscriber = this.f77573p0;
            if (SubscriptionHelper.validate(this.f77575r0, subscription)) {
                this.f77575r0 = subscription;
                try {
                    this.f77574q0.f77570g.accept(subscription);
                    subscriber.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscription.cancel();
                    subscriber.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            try {
                this.f77574q0.f77571h.accept(j10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f77575r0.request(j10);
        }
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super Subscription> consumer4, LongConsumer longConsumer, Action action3) {
        this.f77564a = parallelFlowable;
        Objects.requireNonNull(consumer, "onNext is null");
        this.f77565b = consumer;
        Objects.requireNonNull(consumer2, "onAfterNext is null");
        this.f77566c = consumer2;
        Objects.requireNonNull(consumer3, "onError is null");
        this.f77567d = consumer3;
        Objects.requireNonNull(action, "onComplete is null");
        this.f77568e = action;
        Objects.requireNonNull(action2, "onAfterTerminated is null");
        this.f77569f = action2;
        Objects.requireNonNull(consumer4, "onSubscribe is null");
        this.f77570g = consumer4;
        Objects.requireNonNull(longConsumer, "onRequest is null");
        this.f77571h = longConsumer;
        Objects.requireNonNull(action3, "onCancel is null");
        this.f77572i = action3;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77564a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = new a(subscriberArr[i10], this);
            }
            this.f77564a.subscribe(subscriberArr2);
        }
    }
}
