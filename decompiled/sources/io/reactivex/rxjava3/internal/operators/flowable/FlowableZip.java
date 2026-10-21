package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T>[] f75713q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f75714r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f75715s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f75716t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f75717u0;

    public static final class a<T, R> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75718p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, R>[] f75719q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f75720r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f75721s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f75722t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f75723u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Object[] f75724w0;

        public a(Subscriber subscriber, Function function, boolean z10, int i10, int i11) {
            this.f75718p0 = subscriber;
            this.f75720r0 = function;
            this.f75723u0 = z10;
            b<T, R>[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b<>(this, i11);
            }
            this.f75724w0 = new Object[i10];
            this.f75719q0 = bVarArr;
            this.f75721s0 = new AtomicLong();
            this.f75722t0 = new AtomicThrowable();
        }

        public final void a() {
            for (b<T, R> bVar : this.f75719q0) {
                bVar.getClass();
                SubscriptionHelper.cancel(bVar);
            }
        }

        public final void b() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f75718p0;
            b<T, R>[] bVarArr = this.f75719q0;
            int length = bVarArr.length;
            Object[] objArr = this.f75724w0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f75721s0.get();
                long j11 = 0;
                while (j10 != j11) {
                    if (this.v0) {
                        return;
                    }
                    if (!this.f75723u0 && this.f75722t0.get() != null) {
                        a();
                        this.f75722t0.tryTerminateConsumer(subscriber);
                        return;
                    }
                    boolean z10 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        b<T, R> bVar = bVarArr[i10];
                        if (objArr[i10] == null) {
                            boolean z11 = bVar.f75730u0;
                            SimpleQueue<T> simpleQueue = bVar.f75728s0;
                            if (simpleQueue != null) {
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.f75722t0.tryAddThrowableOrReport(th2);
                                    if (!this.f75723u0) {
                                        a();
                                        this.f75722t0.tryTerminateConsumer(subscriber);
                                        return;
                                    } else {
                                        tPoll2 = null;
                                        z11 = true;
                                    }
                                }
                            } else {
                                tPoll2 = null;
                            }
                            boolean z12 = tPoll2 == null;
                            if (z11 && z12) {
                                a();
                                this.f75722t0.tryTerminateConsumer(subscriber);
                                return;
                            } else if (z12) {
                                z10 = true;
                            } else {
                                objArr[i10] = tPoll2;
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        R rApply = this.f75720r0.apply(objArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        subscriber.onNext(rApply);
                        j11++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        a();
                        this.f75722t0.tryAddThrowableOrReport(th3);
                        this.f75722t0.tryTerminateConsumer(subscriber);
                        return;
                    }
                }
                if (j10 == j11) {
                    if (this.v0) {
                        return;
                    }
                    if (!this.f75723u0 && this.f75722t0.get() != null) {
                        a();
                        this.f75722t0.tryTerminateConsumer(subscriber);
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        b<T, R> bVar2 = bVarArr[i11];
                        if (objArr[i11] == null) {
                            boolean z13 = bVar2.f75730u0;
                            SimpleQueue<T> simpleQueue2 = bVar2.f75728s0;
                            if (simpleQueue2 != null) {
                                try {
                                    tPoll = simpleQueue2.poll();
                                } catch (Throwable th4) {
                                    Exceptions.throwIfFatal(th4);
                                    this.f75722t0.tryAddThrowableOrReport(th4);
                                    if (!this.f75723u0) {
                                        a();
                                        this.f75722t0.tryTerminateConsumer(subscriber);
                                        return;
                                    } else {
                                        tPoll = null;
                                        z13 = true;
                                    }
                                }
                            } else {
                                tPoll = null;
                            }
                            boolean z14 = tPoll == null;
                            if (z13 && z14) {
                                a();
                                this.f75722t0.tryTerminateConsumer(subscriber);
                                return;
                            } else if (!z14) {
                                objArr[i11] = tPoll;
                            }
                        }
                    }
                }
                if (j11 != 0) {
                    for (b<T, R> bVar3 : bVarArr) {
                        bVar3.request(j11);
                    }
                    if (j10 != Long.MAX_VALUE) {
                        this.f75721s0.addAndGet(-j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75721s0, j10);
                b();
            }
        }
    }

    public static final class b<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, R> f75725p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75726q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f75727r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SimpleQueue<T> f75728s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f75729t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f75730u0;
        public int v0;

        public b(a<T, R> aVar, int i10) {
            this.f75725p0 = aVar;
            this.f75726q0 = i10;
            this.f75727r0 = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75730u0 = true;
            this.f75725p0.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            a<T, R> aVar = this.f75725p0;
            if (aVar.f75722t0.tryAddThrowableOrReport(th2)) {
                this.f75730u0 = true;
                aVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 2) {
                this.f75728s0.offer(t10);
            }
            this.f75725p0.b();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f75728s0 = queueSubscription;
                        this.f75730u0 = true;
                        this.f75725p0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f75728s0 = queueSubscription;
                        subscription.request(this.f75726q0);
                        return;
                    }
                }
                this.f75728s0 = new SpscArrayQueue(this.f75726q0);
                subscription.request(this.f75726q0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (this.v0 != 1) {
                long j11 = this.f75729t0 + j10;
                if (j11 < this.f75727r0) {
                    this.f75729t0 = j11;
                } else {
                    this.f75729t0 = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public FlowableZip(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f75713q0 = publisherArr;
        this.f75714r0 = iterable;
        this.f75715s0 = function;
        this.f75716t0 = i10;
        this.f75717u0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<? extends T>[] publisherArr = this.f75713q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            length = 0;
            for (Publisher<? extends T> publisher : this.f75714r0) {
                if (length == publisherArr.length) {
                    Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                    System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        a aVar = new a(subscriber, this.f75715s0, this.f75717u0, i10, this.f75716t0);
        subscriber.onSubscribe(aVar);
        b<T, R>[] bVarArr = aVar.f75719q0;
        for (int i11 = 0; i11 < i10 && !aVar.v0; i11++) {
            if (!aVar.f75723u0 && aVar.f75722t0.get() != null) {
                return;
            }
            publisherArr[i11].subscribe(bVarArr[i11]);
        }
    }
}
