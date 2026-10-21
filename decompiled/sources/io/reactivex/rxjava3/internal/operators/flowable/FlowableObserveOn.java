package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableObserveOn<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f75111q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f75112r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f75113s0;

    public static abstract class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        public int E0;
        public long F0;
        public boolean G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Scheduler.Worker f75114p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f75115q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f75116r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f75117s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f75118t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f75119u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75120w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f75121x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f75122y0;

        public a(Scheduler.Worker worker, boolean z10, int i10) {
            this.f75114p0 = worker;
            this.f75115q0 = z10;
            this.f75116r0 = i10;
            this.f75117s0 = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75120w0) {
                return;
            }
            this.f75120w0 = true;
            this.f75119u0.cancel();
            this.f75114p0.dispose();
            if (this.G0 || getAndIncrement() != 0) {
                return;
            }
            this.v0.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.v0.clear();
        }

        public final boolean e(Subscriber subscriber, boolean z10, boolean z11) {
            if (this.f75120w0) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f75115q0) {
                if (!z11) {
                    return false;
                }
                this.f75120w0 = true;
                Throwable th2 = this.f75122y0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                this.f75114p0.dispose();
                return true;
            }
            Throwable th3 = this.f75122y0;
            if (th3 != null) {
                this.f75120w0 = true;
                clear();
                subscriber.onError(th3);
                this.f75114p0.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f75120w0 = true;
            subscriber.onComplete();
            this.f75114p0.dispose();
            return true;
        }

        public abstract void f();

        public abstract void g();

        public abstract void h();

        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f75114p0.schedule(this);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.v0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75121x0) {
                return;
            }
            this.f75121x0 = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75121x0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75122y0 = th2;
            this.f75121x0 = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75121x0) {
                return;
            }
            if (this.E0 == 2) {
                i();
                return;
            }
            if (!this.v0.offer(t10)) {
                this.f75119u0.cancel();
                this.f75122y0 = new MissingBackpressureException("Queue is full?!");
                this.f75121x0 = true;
            }
            i();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75118t0, j10);
                i();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.G0 = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.G0) {
                g();
            } else if (this.E0 == 1) {
                h();
            } else {
                f();
            }
        }
    }

    public static final class b<T> extends a<T> {
        public final ConditionalSubscriber<? super T> H0;
        public long I0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z10, int i10) {
            super(worker, z10, i10);
            this.H0 = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void f() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.H0;
            SimpleQueue<T> simpleQueue = this.v0;
            long j10 = this.F0;
            long j11 = this.I0;
            int iAddAndGet = 1;
            do {
                long j12 = this.f75118t0.get();
                while (j10 != j12) {
                    boolean z10 = this.f75121x0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z11 = tPoll == null;
                        if (e(conditionalSubscriber, z10, z11)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f75117s0) {
                            this.f75119u0.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f75120w0 = true;
                        this.f75119u0.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th2);
                        this.f75114p0.dispose();
                        return;
                    }
                }
                if (j10 == j12 && e(conditionalSubscriber, this.f75121x0, simpleQueue.isEmpty())) {
                    return;
                }
                this.F0 = j10;
                this.I0 = j11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void g() {
            int iAddAndGet = 1;
            while (!this.f75120w0) {
                boolean z10 = this.f75121x0;
                this.H0.onNext(null);
                if (z10) {
                    this.f75120w0 = true;
                    Throwable th2 = this.f75122y0;
                    if (th2 != null) {
                        this.H0.onError(th2);
                    } else {
                        this.H0.onComplete();
                    }
                    this.f75114p0.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void h() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.H0;
            SimpleQueue<T> simpleQueue = this.v0;
            long j10 = this.F0;
            int iAddAndGet = 1;
            do {
                long j11 = this.f75118t0.get();
                while (j10 != j11) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.f75120w0) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f75120w0 = true;
                            conditionalSubscriber.onComplete();
                            this.f75114p0.dispose();
                            return;
                        } else if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j10++;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f75120w0 = true;
                        this.f75119u0.cancel();
                        conditionalSubscriber.onError(th2);
                        this.f75114p0.dispose();
                        return;
                    }
                }
                if (this.f75120w0) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f75120w0 = true;
                    conditionalSubscriber.onComplete();
                    this.f75114p0.dispose();
                    return;
                }
                this.F0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75119u0, subscription)) {
                this.f75119u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.E0 = 1;
                        this.v0 = queueSubscription;
                        this.f75121x0 = true;
                        this.H0.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.E0 = 2;
                        this.v0 = queueSubscription;
                        this.H0.onSubscribe(this);
                        subscription.request(this.f75116r0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f75116r0);
                this.H0.onSubscribe(this);
                subscription.request(this.f75116r0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.v0.poll();
            if (tPoll != null && this.E0 != 1) {
                long j10 = this.I0 + 1;
                if (j10 == this.f75117s0) {
                    this.I0 = 0L;
                    this.f75119u0.request(j10);
                } else {
                    this.I0 = j10;
                }
            }
            return tPoll;
        }
    }

    public static final class c<T> extends a<T> {
        public final Subscriber<? super T> H0;

        public c(Subscriber<? super T> subscriber, Scheduler.Worker worker, boolean z10, int i10) {
            super(worker, z10, i10);
            this.H0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void f() {
            Subscriber<? super T> subscriber = this.H0;
            SimpleQueue<T> simpleQueue = this.v0;
            long j10 = this.F0;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f75118t0.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f75121x0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z11 = tPoll == null;
                        if (e(subscriber, z10, z11)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j10++;
                        if (j10 == this.f75117s0) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f75118t0.addAndGet(-j10);
                            }
                            this.f75119u0.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f75120w0 = true;
                        this.f75119u0.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th2);
                        this.f75114p0.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && e(subscriber, this.f75121x0, simpleQueue.isEmpty())) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.F0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void g() {
            int iAddAndGet = 1;
            while (!this.f75120w0) {
                boolean z10 = this.f75121x0;
                this.H0.onNext(null);
                if (z10) {
                    this.f75120w0 = true;
                    Throwable th2 = this.f75122y0;
                    if (th2 != null) {
                        this.H0.onError(th2);
                    } else {
                        this.H0.onComplete();
                    }
                    this.f75114p0.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.a
        public final void h() {
            Subscriber<? super T> subscriber = this.H0;
            SimpleQueue<T> simpleQueue = this.v0;
            long j10 = this.F0;
            int iAddAndGet = 1;
            do {
                long j11 = this.f75118t0.get();
                while (j10 != j11) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.f75120w0) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f75120w0 = true;
                            subscriber.onComplete();
                            this.f75114p0.dispose();
                            return;
                        }
                        subscriber.onNext(tPoll);
                        j10++;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f75120w0 = true;
                        this.f75119u0.cancel();
                        subscriber.onError(th2);
                        this.f75114p0.dispose();
                        return;
                    }
                }
                if (this.f75120w0) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f75120w0 = true;
                    subscriber.onComplete();
                    this.f75114p0.dispose();
                    return;
                }
                this.F0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75119u0, subscription)) {
                this.f75119u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.E0 = 1;
                        this.v0 = queueSubscription;
                        this.f75121x0 = true;
                        this.H0.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.E0 = 2;
                        this.v0 = queueSubscription;
                        this.H0.onSubscribe(this);
                        subscription.request(this.f75116r0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f75116r0);
                this.H0.onSubscribe(this);
                subscription.request(this.f75116r0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.v0.poll();
            if (tPoll != null && this.E0 != 1) {
                long j10 = this.F0 + 1;
                if (j10 == this.f75117s0) {
                    this.F0 = 0L;
                    this.f75119u0.request(j10);
                } else {
                    this.F0 = j10;
                }
            }
            return tPoll;
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z10, int i10) {
        super(flowable);
        this.f75111q0 = scheduler;
        this.f75112r0 = z10;
        this.f75113s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.f75111q0.createWorker();
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        int i10 = this.f75113s0;
        boolean z11 = this.f75112r0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new b((ConditionalSubscriber) subscriber, workerCreateWorker, z11, i10));
        } else {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, workerCreateWorker, z11, i10));
        }
    }
}
