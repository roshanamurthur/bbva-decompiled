package io.reactivex.internal.operators.flowable;

import a.e;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f71207q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f71208r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f71209s0;

    public static final class a<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, R> f71210p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71211q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71212r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile SimpleQueue<R> f71213s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f71214t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f71215u0;

        public a(b<T, R> bVar, long j10, int i10) {
            this.f71210p0 = bVar;
            this.f71211q0 = j10;
            this.f71212r0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            b<T, R> bVar = this.f71210p0;
            if (this.f71211q0 == bVar.E0) {
                this.f71214t0 = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f71210p0;
            if (this.f71211q0 != bVar.E0 || !bVar.f71221u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!bVar.f71219s0) {
                bVar.f71222w0.cancel();
                bVar.f71220t0 = true;
            }
            this.f71214t0 = true;
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            b<T, R> bVar = this.f71210p0;
            if (this.f71211q0 == bVar.E0) {
                if (this.f71215u0 != 0 || this.f71213s0.offer(r3)) {
                    bVar.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f71215u0 = iRequestFusion;
                        this.f71213s0 = queueSubscription;
                        this.f71214t0 = true;
                        this.f71210p0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f71215u0 = iRequestFusion;
                        this.f71213s0 = queueSubscription;
                        subscription.request(this.f71212r0);
                        return;
                    }
                }
                this.f71213s0 = new SpscArrayQueue(this.f71212r0);
                subscription.request(this.f71212r0);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final a<Object, Object> F0;
        public volatile long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71216p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f71217q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71218r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f71219s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f71220t0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f71222w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f71223x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicLong f71224y0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f71221u0 = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            F0 = aVar;
            SubscriptionHelper.cancel(aVar);
        }

        public b(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f71216p0 = subscriber;
            this.f71217q0 = function;
            this.f71218r0 = i10;
            this.f71219s0 = z10;
        }

        public final void a() {
            a<T, R> andSet;
            AtomicReference<a<T, R>> atomicReference = this.f71223x0;
            a<T, R> aVar = atomicReference.get();
            a<Object, Object> aVar2 = F0;
            if (aVar == aVar2 || (andSet = atomicReference.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            SubscriptionHelper.cancel(andSet);
        }

        /* JADX WARN: Code duplicated, block: B:109:0x0152  */
        /* JADX WARN: Code duplicated, block: B:112:0x015c  */
        /* JADX WARN: Code duplicated, block: B:133:0x0169 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x000d A[SYNTHETIC] */
        public final void b() {
            boolean z10;
            e eVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71216p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f71220t0) {
                    if (this.f71219s0) {
                        if (this.f71223x0.get() == null) {
                            if (this.f71221u0.get() != null) {
                                subscriber.onError(this.f71221u0.terminate());
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    } else if (this.f71221u0.get() != null) {
                        a();
                        subscriber.onError(this.f71221u0.terminate());
                        return;
                    } else if (this.f71223x0.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.f71223x0.get();
                SimpleQueue<R> simpleQueue = aVar != null ? aVar.f71213s0 : null;
                if (simpleQueue != null) {
                    if (aVar.f71214t0) {
                        if (this.f71219s0) {
                            if (simpleQueue.isEmpty()) {
                                AtomicReference<a<T, R>> atomicReference = this.f71223x0;
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            }
                        } else if (this.f71221u0.get() != null) {
                            a();
                            subscriber.onError(this.f71221u0.terminate());
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            AtomicReference<a<T, R>> atomicReference2 = this.f71223x0;
                            while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                            }
                        }
                    }
                    long j10 = this.f71224y0.get();
                    long j11 = 0;
                    while (true) {
                        if (j11 != j10) {
                            if (this.v0) {
                                return;
                            }
                            boolean z11 = aVar.f71214t0;
                            try {
                                eVarPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                SubscriptionHelper.cancel(aVar);
                                this.f71221u0.addThrowable(th2);
                                z11 = true;
                                eVarPoll = null;
                            }
                            boolean z12 = eVarPoll == null;
                            if (aVar == this.f71223x0.get()) {
                                if (z11) {
                                    if (this.f71219s0) {
                                        if (z12) {
                                            AtomicReference<a<T, R>> atomicReference3 = this.f71223x0;
                                            while (!atomicReference3.compareAndSet(aVar, null) && atomicReference3.get() == aVar) {
                                            }
                                        }
                                    } else if (this.f71221u0.get() != null) {
                                        subscriber.onError(this.f71221u0.terminate());
                                        return;
                                    } else if (z12) {
                                        AtomicReference<a<T, R>> atomicReference4 = this.f71223x0;
                                        while (!atomicReference4.compareAndSet(aVar, null) && atomicReference4.get() == aVar) {
                                        }
                                    }
                                }
                                if (!z12) {
                                    subscriber.onNext(eVarPoll);
                                    j11++;
                                }
                            }
                            z10 = true;
                            if (j11 != 0 && !this.v0) {
                                if (j10 != Long.MAX_VALUE) {
                                    this.f71224y0.addAndGet(-j11);
                                }
                                if (aVar.f71215u0 != 1) {
                                    aVar.get().request(j11);
                                }
                            }
                            if (z10) {
                                continue;
                            }
                        }
                        z10 = false;
                        if (j11 != 0) {
                            if (j10 != Long.MAX_VALUE) {
                                this.f71224y0.addAndGet(-j11);
                            }
                            if (aVar.f71215u0 != 1) {
                                aVar.get().request(j11);
                            }
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
            this.f71222w0.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71220t0) {
                return;
            }
            this.f71220t0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71220t0 || !this.f71221u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f71219s0) {
                a();
            }
            this.f71220t0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71220t0) {
                return;
            }
            long j10 = this.E0 + 1;
            this.E0 = j10;
            a<T, R> aVar = this.f71223x0.get();
            if (aVar != null) {
                SubscriptionHelper.cancel(aVar);
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71217q0.apply(t10), "The publisher returned is null");
                a<T, R> aVar2 = new a<>(this, j10, this.f71218r0);
                while (true) {
                    a<T, R> aVar3 = this.f71223x0.get();
                    if (aVar3 == F0) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f71223x0;
                    do {
                        if (atomicReference.compareAndSet(aVar3, aVar2)) {
                            publisher.subscribe(aVar2);
                            return;
                        }
                    } while (atomicReference.get() == aVar3);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71222w0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71222w0, subscription)) {
                this.f71222w0 = subscription;
                this.f71216p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71224y0, j10);
                if (this.E0 == 0) {
                    this.f71222w0.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, boolean z10) {
        super(flowable);
        this.f71207q0 = function;
        this.f71208r0 = i10;
        this.f71209s0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends R>> function = this.f71207q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new b(this.f71208r0, function, subscriber, this.f71209s0));
    }
}
