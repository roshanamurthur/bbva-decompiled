package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f73343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f73344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73345c;

    public static abstract class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f73346p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73347q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscArrayQueue<T> f73348r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f73349s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f73350t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f73351u0;
        public Throwable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicLong f73352w0 = new AtomicLong();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f73353x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f73354y0;

        public a(int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.f73346p0 = i10;
            this.f73348r0 = spscArrayQueue;
            this.f73347q0 = i10 - (i10 >> 2);
            this.f73349s0 = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f73353x0) {
                return;
            }
            this.f73353x0 = true;
            this.f73350t0.cancel();
            this.f73349s0.dispose();
            if (getAndIncrement() == 0) {
                this.f73348r0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73351u0) {
                return;
            }
            this.f73351u0 = true;
            if (getAndIncrement() == 0) {
                this.f73349s0.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73351u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = th2;
            this.f73351u0 = true;
            if (getAndIncrement() == 0) {
                this.f73349s0.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73351u0) {
                return;
            }
            if (!this.f73348r0.offer(t10)) {
                this.f73350t0.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            } else if (getAndIncrement() == 0) {
                this.f73349s0.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f73352w0, j10);
                if (getAndIncrement() == 0) {
                    this.f73349s0.schedule(this);
                }
            }
        }
    }

    public final class b implements SchedulerMultiWorkerSupport.WorkerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T>[] f73355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Subscriber<T>[] f73356b;

        public b(Subscriber<? super T>[] subscriberArr, Subscriber<T>[] subscriberArr2) {
            this.f73355a = subscriberArr;
            this.f73356b = subscriberArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public final void onWorker(int i10, Scheduler.Worker worker) {
            ParallelRunOn.this.a(i10, this.f73355a, this.f73356b, worker);
        }
    }

    public static final class c<T> extends a<T> {
        public final ConditionalSubscriber<? super T> E0;

        public c(ConditionalSubscriber<? super T> conditionalSubscriber, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.E0 = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73350t0, subscription)) {
                this.f73350t0 = subscription;
                this.E0.onSubscribe(this);
                subscription.request(this.f73346p0);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2;
            int i10 = this.f73354y0;
            SpscArrayQueue<T> spscArrayQueue = this.f73348r0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.E0;
            int i11 = this.f73347q0;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f73352w0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f73353x0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f73351u0;
                    if (z10 && (th2 = this.v0) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th2);
                        this.f73349s0.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        conditionalSubscriber.onComplete();
                        this.f73349s0.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j11++;
                        }
                        i10++;
                        if (i10 == i11) {
                            this.f73350t0.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f73353x0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f73351u0) {
                        Throwable th3 = this.v0;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th3);
                            this.f73349s0.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.f73349s0.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f73352w0.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f73354y0 = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    public static final class d<T> extends a<T> {
        public final Subscriber<? super T> E0;

        public d(Subscriber<? super T> subscriber, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.E0 = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f73350t0, subscription)) {
                this.f73350t0 = subscription;
                this.E0.onSubscribe(this);
                subscription.request(this.f73346p0);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2;
            int i10 = this.f73354y0;
            SpscArrayQueue<T> spscArrayQueue = this.f73348r0;
            Subscriber<? super T> subscriber = this.E0;
            int i11 = this.f73347q0;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f73352w0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f73353x0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f73351u0;
                    if (z10 && (th2 = this.v0) != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th2);
                        this.f73349s0.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        subscriber.onComplete();
                        this.f73349s0.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j11++;
                        i10++;
                        if (i10 == i11) {
                            this.f73350t0.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f73353x0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f73351u0) {
                        Throwable th3 = this.v0;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            subscriber.onError(th3);
                            this.f73349s0.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            this.f73349s0.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f73352w0.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f73354y0 = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i10) {
        this.f73343a = parallelFlowable;
        this.f73344b = scheduler;
        this.f73345c = i10;
    }

    public final void a(int i10, Subscriber<? super T>[] subscriberArr, Subscriber<T>[] subscriberArr2, Scheduler.Worker worker) {
        Subscriber<? super T> subscriber = subscriberArr[i10];
        int i11 = this.f73345c;
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i11);
        if (subscriber instanceof ConditionalSubscriber) {
            subscriberArr2[i10] = new c((ConditionalSubscriber) subscriber, i11, spscArrayQueue, worker);
        } else {
            subscriberArr2[i10] = new d(subscriber, i11, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f73343a.parallelism();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<T>[] subscriberArr2 = new Subscriber[length];
            Scheduler scheduler = this.f73344b;
            if (scheduler instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) scheduler).createWorkers(length, new b(subscriberArr, subscriberArr2));
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    a(i10, subscriberArr, subscriberArr2, scheduler.createWorker());
                }
            }
            this.f73343a.subscribe(subscriberArr2);
        }
    }
}
