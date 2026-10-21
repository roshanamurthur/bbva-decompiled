package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDoFinally<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f70502q0;

    public static final class a<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f70503p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f70504q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70505r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueSubscription<T> f70506s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70507t0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.f70503p0 = conditionalSubscriber;
            this.f70504q0 = action;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70505r0.cancel();
            e();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70506s0.clear();
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f70504q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70506s0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70503p0.onComplete();
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70503p0.onError(th2);
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70503p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70505r0, subscription)) {
                this.f70505r0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f70506s0 = (QueueSubscription) subscription;
                }
                this.f70503p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll = this.f70506s0.poll();
            if (tPoll == null && this.f70507t0) {
                e();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70505r0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueSubscription<T> queueSubscription = this.f70506s0;
            if (queueSubscription == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f70507t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            return this.f70503p0.tryOnNext(t10);
        }
    }

    public static final class b<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f70509q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70510r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueSubscription<T> f70511s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70512t0;

        public b(Subscriber<? super T> subscriber, Action action) {
            this.f70508p0 = subscriber;
            this.f70509q0 = action;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70510r0.cancel();
            e();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70511s0.clear();
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f70509q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70511s0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70508p0.onComplete();
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70508p0.onError(th2);
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70508p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70510r0, subscription)) {
                this.f70510r0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f70511s0 = (QueueSubscription) subscription;
                }
                this.f70508p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll = this.f70511s0.poll();
            if (tPoll == null && this.f70512t0) {
                e();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70510r0.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueSubscription<T> queueSubscription = this.f70511s0;
            if (queueSubscription == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f70512t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.f70502q0 = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Action action = this.f70502q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, action));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, action));
        }
    }
}
