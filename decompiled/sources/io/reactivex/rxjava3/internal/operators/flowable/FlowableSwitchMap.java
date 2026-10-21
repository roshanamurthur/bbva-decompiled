package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f75465q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75466r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f75467s0;

    public static final class a<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, R> f75468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75469q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f75470r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile SimpleQueue<R> f75471s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f75472t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f75473u0;

        public a(b<T, R> bVar, long j10, int i10) {
            this.f75468p0 = bVar;
            this.f75469q0 = j10;
            this.f75470r0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() throws Throwable {
            b<T, R> bVar = this.f75468p0;
            if (this.f75469q0 == bVar.E0) {
                this.f75472t0 = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) throws Throwable {
            b<T, R> bVar = this.f75468p0;
            if (this.f75469q0 != bVar.E0 || !bVar.f75479u0.tryAddThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!bVar.f75477s0) {
                bVar.f75480w0.cancel();
                bVar.f75478t0 = true;
            }
            this.f75472t0 = true;
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) throws Throwable {
            b<T, R> bVar = this.f75468p0;
            if (this.f75469q0 == bVar.E0) {
                if (this.f75473u0 != 0 || this.f75471s0.offer(r3)) {
                    bVar.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) throws Throwable {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f75473u0 = iRequestFusion;
                        this.f75471s0 = queueSubscription;
                        this.f75472t0 = true;
                        this.f75468p0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f75473u0 = iRequestFusion;
                        this.f75471s0 = queueSubscription;
                        subscription.request(this.f75470r0);
                        return;
                    }
                }
                this.f75471s0 = new SpscArrayQueue(this.f75470r0);
                subscription.request(this.f75470r0);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final a<Object, Object> F0;
        public volatile long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75474p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f75475q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f75476r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f75477s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f75478t0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f75480w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f75481x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicLong f75482y0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f75479u0 = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            F0 = aVar;
            SubscriptionHelper.cancel(aVar);
        }

        public b(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f75474p0 = subscriber;
            this.f75475q0 = function;
            this.f75476r0 = i10;
            this.f75477s0 = z10;
        }

        public final void a() {
            AtomicReference<a<T, R>> atomicReference = this.f75481x0;
            a<Object, Object> aVar = F0;
            a<T, R> andSet = atomicReference.getAndSet((a<T, R>) aVar);
            if (andSet == aVar || andSet == null) {
                return;
            }
            SubscriptionHelper.cancel(andSet);
        }

        /* JADX WARN: Code duplicated, block: B:111:0x014d  */
        /* JADX WARN: Code duplicated, block: B:134:0x0153 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x000c A[SYNTHETIC] */
        public final void b() throws Throwable {
            boolean z10;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f75474p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f75478t0) {
                    if (this.f75477s0) {
                        if (this.f75481x0.get() == null) {
                            this.f75479u0.tryTerminateConsumer(subscriber);
                            return;
                        }
                    } else if (this.f75479u0.get() != null) {
                        a();
                        this.f75479u0.tryTerminateConsumer(subscriber);
                        return;
                    } else if (this.f75481x0.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.f75481x0.get();
                SimpleQueue<R> simpleQueue = aVar != null ? aVar.f75471s0 : null;
                if (simpleQueue != null) {
                    long j10 = this.f75482y0.get();
                    long j11 = 0;
                    while (true) {
                        if (j11 != j10) {
                            if (this.v0) {
                                return;
                            }
                            boolean z11 = aVar.f75472t0;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                SubscriptionHelper.cancel(aVar);
                                this.f75479u0.tryAddThrowableOrReport(th2);
                                objPoll = null;
                                z11 = true;
                            }
                            boolean z12 = objPoll == null;
                            if (aVar == this.f75481x0.get()) {
                                if (z11) {
                                    if (this.f75477s0) {
                                        if (z12) {
                                            AtomicReference<a<T, R>> atomicReference = this.f75481x0;
                                            while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                            }
                                        }
                                    } else if (this.f75479u0.get() != null) {
                                        this.f75479u0.tryTerminateConsumer(subscriber);
                                        return;
                                    } else if (z12) {
                                        AtomicReference<a<T, R>> atomicReference2 = this.f75481x0;
                                        while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                                        }
                                    }
                                }
                                if (!z12) {
                                    subscriber.onNext(objPoll);
                                    j11++;
                                }
                            }
                            z10 = true;
                            if (j11 != j10 && aVar.f75472t0) {
                                if (this.f75477s0) {
                                    if (simpleQueue.isEmpty()) {
                                        AtomicReference<a<T, R>> atomicReference3 = this.f75481x0;
                                        while (!atomicReference3.compareAndSet(aVar, null) && atomicReference3.get() == aVar) {
                                        }
                                    }
                                } else if (this.f75479u0.get() != null) {
                                    a();
                                    this.f75479u0.tryTerminateConsumer(subscriber);
                                    return;
                                } else if (simpleQueue.isEmpty()) {
                                    AtomicReference<a<T, R>> atomicReference4 = this.f75481x0;
                                    while (!atomicReference4.compareAndSet(aVar, null) && atomicReference4.get() == aVar) {
                                    }
                                }
                            }
                            if (j11 == 0 && !this.v0) {
                                if (j10 != Long.MAX_VALUE) {
                                    this.f75482y0.addAndGet(-j11);
                                }
                                if (aVar.f75473u0 != 1) {
                                    aVar.get().request(j11);
                                }
                            }
                            if (z10) {
                                continue;
                            }
                        }
                        z10 = false;
                        if (j11 != j10) {
                        }
                        if (j11 == 0) {
                        }
                        if (z10) {
                            continue;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f75480w0.cancel();
            a();
            this.f75479u0.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() throws Throwable {
            if (this.f75478t0) {
                return;
            }
            this.f75478t0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) throws Throwable {
            if (this.f75478t0 || !this.f75479u0.tryAddThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f75477s0) {
                a();
            }
            this.f75478t0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) throws Throwable {
            if (this.f75478t0) {
                return;
            }
            long j10 = this.E0 + 1;
            this.E0 = j10;
            a<T, R> aVar = this.f75481x0.get();
            if (aVar != null) {
                SubscriptionHelper.cancel(aVar);
            }
            try {
                Publisher<? extends R> publisherApply = this.f75475q0.apply(t10);
                Objects.requireNonNull(publisherApply, "The publisher returned is null");
                Publisher<? extends R> publisher = publisherApply;
                a<T, R> aVar2 = new a<>(this, j10, this.f75476r0);
                while (true) {
                    a<T, R> aVar3 = this.f75481x0.get();
                    if (aVar3 == F0) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f75481x0;
                    do {
                        if (atomicReference.compareAndSet(aVar3, aVar2)) {
                            publisher.subscribe(aVar2);
                            return;
                        }
                    } while (atomicReference.get() == aVar3);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75480w0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75480w0, subscription)) {
                this.f75480w0 = subscription;
                this.f75474p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) throws Throwable {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75482y0, j10);
                if (this.E0 == 0) {
                    this.f75480w0.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, boolean z10) {
        super(flowable);
        this.f75465q0 = function;
        this.f75466r0 = i10;
        this.f75467s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends R>> function = this.f75465q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new b(this.f75466r0, function, subscriber, this.f75467s0));
    }
}
