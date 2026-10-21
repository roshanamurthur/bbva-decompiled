package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDoFinally<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f74767q0;

    public static final class a<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f74768p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f74769q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74770r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueSubscription<T> f74771s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74772t0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.f74768p0 = conditionalSubscriber;
            this.f74769q0 = action;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74770r0.cancel();
            e();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74771s0.clear();
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f74769q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f74771s0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74768p0.onComplete();
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74768p0.onError(th2);
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74768p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74770r0, subscription)) {
                this.f74770r0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f74771s0 = (QueueSubscription) subscription;
                }
                this.f74768p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.f74771s0.poll();
            if (tPoll == null && this.f74772t0) {
                e();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74770r0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueSubscription<T> queueSubscription = this.f74771s0;
            if (queueSubscription == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f74772t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            return this.f74768p0.tryOnNext(t10);
        }
    }

    public static final class b<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74773p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f74774q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74775r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueSubscription<T> f74776s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74777t0;

        public b(Subscriber<? super T> subscriber, Action action) {
            this.f74773p0 = subscriber;
            this.f74774q0 = action;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74775r0.cancel();
            e();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74776s0.clear();
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f74774q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f74776s0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74773p0.onComplete();
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74773p0.onError(th2);
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f74773p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74775r0, subscription)) {
                this.f74775r0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f74776s0 = (QueueSubscription) subscription;
                }
                this.f74773p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.f74776s0.poll();
            if (tPoll == null && this.f74777t0) {
                e();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74775r0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueSubscription<T> queueSubscription = this.f74776s0;
            if (queueSubscription == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f74777t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.f74767q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Action action = this.f74767q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, action));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, action));
        }
    }
}
