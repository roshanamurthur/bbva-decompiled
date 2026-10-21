package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapScheduler<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f74645q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74646r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f74647s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f74648t0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74649a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f74649a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74649a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, FlowableConcatMap.f<R>, Subscription, Runnable {
        public volatile boolean F0;
        public int G0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f74651q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74652r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74653s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler.Worker f74654t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f74655u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<T> f74656w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f74657x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74658y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final FlowableConcatMap.e<R> f74650p0 = new FlowableConcatMap.e<>(this);
        public final AtomicThrowable E0 = new AtomicThrowable();

        public b(Function<? super T, ? extends Publisher<? extends R>> function, int i10, Scheduler.Worker worker) {
            this.f74651q0 = function;
            this.f74652r0 = i10;
            this.f74653s0 = i10 - (i10 >> 2);
            this.f74654t0 = worker;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void c() {
            this.F0 = false;
            d();
        }

        public abstract void d();

        public abstract void e();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74657x0 = true;
            d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.G0 == 2 || this.f74656w0.offer(t10)) {
                d();
            } else {
                this.f74655u0.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74655u0, subscription)) {
                this.f74655u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.G0 = iRequestFusion;
                        this.f74656w0 = queueSubscription;
                        this.f74657x0 = true;
                        e();
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.G0 = iRequestFusion;
                        this.f74656w0 = queueSubscription;
                        e();
                        subscription.request(this.f74652r0);
                        return;
                    }
                }
                this.f74656w0 = new SpscArrayQueue(this.f74652r0);
                e();
                subscription.request(this.f74652r0);
            }
        }
    }

    public static final class c<T, R> extends b<T, R> {
        public final Subscriber<? super R> H0;
        public final boolean I0;

        public c(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10, boolean z10, Scheduler.Worker worker) {
            super(function, i10, worker);
            this.H0 = subscriber;
            this.I0 = z10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            if (this.E0.tryAddThrowableOrReport(th2)) {
                if (!this.I0) {
                    this.f74655u0.cancel();
                    this.f74657x0 = true;
                }
                this.F0 = false;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            this.H0.onNext(r3);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74658y0) {
                return;
            }
            this.f74658y0 = true;
            this.f74650p0.cancel();
            this.f74655u0.cancel();
            this.f74654t0.dispose();
            this.E0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.b
        public final void d() {
            if (getAndIncrement() == 0) {
                this.f74654t0.schedule(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.b
        public final void e() {
            this.H0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.E0.tryAddThrowableOrReport(th2)) {
                this.f74657x0 = true;
                d();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74650p0.request(j10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            while (!this.f74658y0) {
                if (!this.F0) {
                    boolean z10 = this.f74657x0;
                    if (z10 && !this.I0 && this.E0.get() != null) {
                        this.E0.tryTerminateConsumer(this.H0);
                        this.f74654t0.dispose();
                        return;
                    }
                    try {
                        T tPoll = this.f74656w0.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.E0.tryTerminateConsumer(this.H0);
                            this.f74654t0.dispose();
                            return;
                        }
                        if (!z11) {
                            try {
                                Publisher<? extends R> publisherApply = this.f74651q0.apply(tPoll);
                                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                Publisher<? extends R> publisher = publisherApply;
                                if (this.G0 != 1) {
                                    int i10 = this.v0 + 1;
                                    if (i10 == this.f74653s0) {
                                        this.v0 = 0;
                                        this.f74655u0.request(i10);
                                    } else {
                                        this.v0 = i10;
                                    }
                                }
                                if (publisher instanceof Supplier) {
                                    try {
                                        obj = ((Supplier) publisher).get();
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        this.E0.tryAddThrowableOrReport(th2);
                                        if (!this.I0) {
                                            this.f74655u0.cancel();
                                            this.E0.tryTerminateConsumer(this.H0);
                                            this.f74654t0.dispose();
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj != null && !this.f74658y0) {
                                        if (this.f74650p0.isUnbounded()) {
                                            this.H0.onNext(obj);
                                        } else {
                                            this.F0 = true;
                                            FlowableConcatMap.e<R> eVar = this.f74650p0;
                                            eVar.setSubscription(new FlowableConcatMap.g(obj, eVar));
                                        }
                                    }
                                } else {
                                    this.F0 = true;
                                    publisher.subscribe(this.f74650p0);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.f74655u0.cancel();
                                this.E0.tryAddThrowableOrReport(th3);
                                this.E0.tryTerminateConsumer(this.H0);
                                this.f74654t0.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.f74655u0.cancel();
                        this.E0.tryAddThrowableOrReport(th4);
                        this.E0.tryTerminateConsumer(this.H0);
                        this.f74654t0.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public static final class d<T, R> extends b<T, R> {
        public final Subscriber<? super R> H0;
        public final AtomicInteger I0;

        public d(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10, Scheduler.Worker worker) {
            super(function, i10, worker);
            this.H0 = subscriber;
            this.I0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            AtomicThrowable atomicThrowable = this.E0;
            if (atomicThrowable.tryAddThrowableOrReport(th2)) {
                this.f74655u0.cancel();
                if (getAndIncrement() == 0) {
                    atomicThrowable.tryTerminateConsumer(this.H0);
                    this.f74654t0.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            if (get() == 0 && compareAndSet(0, 1)) {
                Subscriber<? super R> subscriber = this.H0;
                subscriber.onNext(r3);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.E0.tryTerminateConsumer(subscriber);
                this.f74654t0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74658y0) {
                return;
            }
            this.f74658y0 = true;
            this.f74650p0.cancel();
            this.f74655u0.cancel();
            this.f74654t0.dispose();
            this.E0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.b
        public final void d() {
            if (this.I0.getAndIncrement() == 0) {
                this.f74654t0.schedule(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.b
        public final void e() {
            this.H0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.E0;
            if (atomicThrowable.tryAddThrowableOrReport(th2)) {
                this.f74650p0.cancel();
                if (getAndIncrement() == 0) {
                    atomicThrowable.tryTerminateConsumer(this.H0);
                    this.f74654t0.dispose();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74650p0.request(j10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f74658y0) {
                if (!this.F0) {
                    boolean z10 = this.f74657x0;
                    try {
                        T tPoll = this.f74656w0.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.H0.onComplete();
                            this.f74654t0.dispose();
                            return;
                        }
                        if (!z11) {
                            try {
                                Publisher<? extends R> publisherApply = this.f74651q0.apply(tPoll);
                                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                Publisher<? extends R> publisher = publisherApply;
                                if (this.G0 != 1) {
                                    int i10 = this.v0 + 1;
                                    if (i10 == this.f74653s0) {
                                        this.v0 = 0;
                                        this.f74655u0.request(i10);
                                    } else {
                                        this.v0 = i10;
                                    }
                                }
                                if (publisher instanceof Supplier) {
                                    try {
                                        Object obj = ((Supplier) publisher).get();
                                        if (obj != null && !this.f74658y0) {
                                            if (!this.f74650p0.isUnbounded()) {
                                                this.F0 = true;
                                                FlowableConcatMap.e<R> eVar = this.f74650p0;
                                                eVar.setSubscription(new FlowableConcatMap.g(obj, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.H0.onNext(obj);
                                                if (!compareAndSet(1, 0)) {
                                                    this.E0.tryTerminateConsumer(this.H0);
                                                    this.f74654t0.dispose();
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        this.f74655u0.cancel();
                                        this.E0.tryAddThrowableOrReport(th2);
                                        this.E0.tryTerminateConsumer(this.H0);
                                        this.f74654t0.dispose();
                                        return;
                                    }
                                } else {
                                    this.F0 = true;
                                    publisher.subscribe(this.f74650p0);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.f74655u0.cancel();
                                this.E0.tryAddThrowableOrReport(th3);
                                this.E0.tryTerminateConsumer(this.H0);
                                this.f74654t0.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.f74655u0.cancel();
                        this.E0.tryAddThrowableOrReport(th4);
                        this.E0.tryTerminateConsumer(this.H0);
                        this.f74654t0.dispose();
                        return;
                    }
                }
                if (this.I0.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public FlowableConcatMapScheduler(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode, Scheduler scheduler) {
        super(flowable);
        this.f74645q0 = function;
        this.f74646r0 = i10;
        this.f74647s0 = errorMode;
        this.f74648t0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int i10 = a.f74649a[this.f74647s0.ordinal()];
        Scheduler scheduler = this.f74648t0;
        if (i10 == 1) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, this.f74645q0, this.f74646r0, false, scheduler.createWorker()));
            return;
        }
        if (i10 == 2) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, this.f74645q0, this.f74646r0, true, scheduler.createWorker()));
            return;
        }
        this.source.subscribe((FlowableSubscriber) new d(subscriber, this.f74645q0, this.f74646r0, scheduler.createWorker()));
    }
}
