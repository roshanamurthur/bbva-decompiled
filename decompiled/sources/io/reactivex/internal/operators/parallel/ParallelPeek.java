package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f73310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer<? super T> f73311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer<? super T> f73312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer<? super Throwable> f73313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Action f73314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Action f73315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Consumer<? super Subscription> f73316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LongConsumer f73317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Action f73318i;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73319p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ParallelPeek<T> f73320q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f73321r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73322s0;

        public a(Subscriber<? super T> subscriber, ParallelPeek<T> parallelPeek) {
            this.f73319p0 = subscriber;
            this.f73320q0 = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                this.f73320q0.f73318i.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f73321r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscriber<? super T> subscriber = this.f73319p0;
            ParallelPeek<T> parallelPeek = this.f73320q0;
            if (this.f73322s0) {
                return;
            }
            this.f73322s0 = true;
            try {
                parallelPeek.f73314e.run();
                subscriber.onComplete();
                try {
                    parallelPeek.f73315f.run();
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
            ParallelPeek<T> parallelPeek = this.f73320q0;
            if (this.f73322s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73322s0 = true;
            try {
                parallelPeek.f73313d.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f73319p0.onError(th2);
            try {
                parallelPeek.f73315f.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            ParallelPeek<T> parallelPeek = this.f73320q0;
            if (this.f73322s0) {
                return;
            }
            try {
                parallelPeek.f73311b.accept(t10);
                this.f73319p0.onNext(t10);
                try {
                    parallelPeek.f73312c.accept(t10);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Subscriber<? super T> subscriber = this.f73319p0;
            if (SubscriptionHelper.validate(this.f73321r0, subscription)) {
                this.f73321r0 = subscription;
                try {
                    this.f73320q0.f73316g.accept(subscription);
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
                this.f73320q0.f73317h.accept(j10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f73321r0.request(j10);
        }
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super Subscription> consumer4, LongConsumer longConsumer, Action action3) {
        this.f73310a = parallelFlowable;
        this.f73311b = (Consumer) ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.f73312c = (Consumer) ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.f73313d = (Consumer) ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.f73314e = (Action) ObjectHelper.requireNonNull(action, "onComplete is null");
        this.f73315f = (Action) ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.f73316g = (Consumer) ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.f73317h = (LongConsumer) ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.f73318i = (Action) ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73310a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                subscriberArr2[i10] = new a(subscriberArr[i10], this);
            }
            this.f73310a.subscribe(subscriberArr2);
        }
    }
}
