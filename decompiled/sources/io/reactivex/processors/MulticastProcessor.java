package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
@SchedulerSupport("none")
@BackpressureSupport(BackpressureKind.FULL)
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    public static final a[] H0 = new a[0];
    public static final a[] I0 = new a[0];
    public volatile Throwable E0;
    public int F0;
    public int G0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f73876q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f73877r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f73878s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicBoolean f73879t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f73880u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f73881w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile SimpleQueue<T> f73882x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile boolean f73883y0;

    public static final class a<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73884p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MulticastProcessor<T> f73885q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f73886r0;

        public a(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.f73884p0 = subscriber;
            this.f73885q0 = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f73885q0.f(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j11 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j12 = j11 + j10;
                    }
                } while (!compareAndSet(j11, j12 >= 0 ? j12 : Long.MAX_VALUE));
                this.f73885q0.e();
            }
        }
    }

    public MulticastProcessor(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        this.f73880u0 = i10;
        this.v0 = i10 - (i10 >> 2);
        this.f73876q0 = new AtomicInteger();
        this.f73878s0 = new AtomicReference<>(H0);
        this.f73877r0 = new AtomicReference<>();
        this.f73881w0 = z10;
        this.f73879t0 = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0015 A[SYNTHETIC] */
    public final void e() {
        int i10;
        T tPoll;
        if (this.f73876q0.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<a<T>[]> atomicReference = this.f73878s0;
        int i11 = this.F0;
        int i12 = this.v0;
        int i13 = this.G0;
        boolean z10 = true;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.f73882x0;
            if (simpleQueue != null) {
                a<T>[] aVarArr = atomicReference.get();
                if (aVarArr.length != 0) {
                    int length = aVarArr.length;
                    long j10 = -1;
                    long jMin = -1;
                    int i14 = 0;
                    while (i14 < length) {
                        a<T> aVar = aVarArr[i14];
                        long j11 = aVar.get();
                        if (j11 >= 0) {
                            jMin = jMin == j10 ? j11 - aVar.f73886r0 : Math.min(jMin, j11 - aVar.f73886r0);
                        }
                        i14++;
                        j10 = -1;
                    }
                    int i15 = i11;
                    while (true) {
                        a<T>[] aVarArr2 = I0;
                        if (jMin > 0) {
                            a<T>[] aVarArr3 = atomicReference.get();
                            if (aVarArr3 == aVarArr2) {
                                simpleQueue.clear();
                                return;
                            }
                            if (aVarArr != aVarArr3) {
                                i10 = iAddAndGet;
                            } else {
                                boolean z11 = this.f73883y0;
                                try {
                                    tPoll = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    SubscriptionHelper.cancel(this.f73877r0);
                                    this.E0 = th2;
                                    this.f73883y0 = z10;
                                    tPoll = null;
                                    z11 = z10;
                                }
                                T t10 = tPoll;
                                boolean z12 = t10 == null ? z10 : false;
                                if (z11 && z12) {
                                    Throwable th3 = this.E0;
                                    if (th3 != null) {
                                        for (a<T> aVar2 : atomicReference.getAndSet(aVarArr2)) {
                                            if (aVar2.get() != Long.MIN_VALUE) {
                                                aVar2.f73884p0.onError(th3);
                                            }
                                        }
                                        return;
                                    }
                                    for (a<T> aVar3 : atomicReference.getAndSet(aVarArr2)) {
                                        if (aVar3.get() != Long.MIN_VALUE) {
                                            aVar3.f73884p0.onComplete();
                                        }
                                    }
                                    return;
                                }
                                if (!z12) {
                                    int length2 = aVarArr.length;
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        a<T> aVar4 = aVarArr[i16];
                                        int i17 = iAddAndGet;
                                        if (aVar4.get() != Long.MIN_VALUE) {
                                            aVar4.f73886r0++;
                                            aVar4.f73884p0.onNext(t10);
                                        }
                                        i16++;
                                        iAddAndGet = i17;
                                    }
                                    int i18 = iAddAndGet;
                                    jMin--;
                                    z10 = true;
                                    if (i13 != 1 && (i15 = i15 + 1) == i12) {
                                        this.f73877r0.get().request(i12);
                                        i15 = 0;
                                    }
                                    iAddAndGet = i18;
                                }
                            }
                            i11 = i15;
                            iAddAndGet = i10;
                        }
                        i10 = iAddAndGet;
                        if (jMin == 0) {
                            a<T>[] aVarArr4 = atomicReference.get();
                            if (aVarArr4 == aVarArr2) {
                                simpleQueue.clear();
                                return;
                            }
                            if (aVarArr != aVarArr4) {
                                i11 = i15;
                                iAddAndGet = i10;
                            } else if (this.f73883y0 && simpleQueue.isEmpty()) {
                                Throwable th4 = this.E0;
                                if (th4 != null) {
                                    for (a<T> aVar5 : atomicReference.getAndSet(aVarArr2)) {
                                        if (aVar5.get() != Long.MIN_VALUE) {
                                            aVar5.f73884p0.onError(th4);
                                        }
                                    }
                                    return;
                                }
                                for (a<T> aVar6 : atomicReference.getAndSet(aVarArr2)) {
                                    if (aVar6.get() != Long.MIN_VALUE) {
                                        aVar6.f73884p0.onComplete();
                                    }
                                }
                                return;
                            }
                        }
                        i11 = i15;
                        this.F0 = i11;
                        iAddAndGet = this.f73876q0.addAndGet(-i10);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
            i10 = iAddAndGet;
            this.F0 = i11;
            iAddAndGet = this.f73876q0.addAndGet(-i10);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final void f(a<T> aVar) {
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73878s0;
            a<T>[] aVarArr = atomicReference.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                a<T>[] aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                    }
                }
                return;
            }
            if (!this.f73881w0) {
                a<T>[] aVarArr3 = H0;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr3)) {
                    if (atomicReference.get() != aVarArr) {
                    }
                }
                return;
            } else {
                a<T>[] aVarArr4 = I0;
                do {
                    if (atomicReference.compareAndSet(aVarArr, aVarArr4)) {
                        SubscriptionHelper.cancel(this.f73877r0);
                        this.f73879t0.set(true);
                        return;
                    }
                } while (atomicReference.get() == aVarArr);
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.f73879t0.get()) {
            return this.E0;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.f73879t0.get() && this.E0 == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f73878s0.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.f73879t0.get() && this.E0 != null;
    }

    public boolean offer(T t10) {
        if (this.f73879t0.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t10, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.G0 != 0 || !this.f73882x0.offer(t10)) {
            return false;
        }
        e();
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f73879t0.compareAndSet(false, true)) {
            this.f73883y0 = true;
            e();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f73879t0.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.E0 = th2;
        this.f73883y0 = true;
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f73879t0.get()) {
            return;
        }
        if (this.G0 == 0) {
            ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.f73882x0.offer(t10)) {
                SubscriptionHelper.cancel(this.f73877r0);
                onError(new MissingBackpressureException());
                return;
            }
        }
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f73877r0, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.G0 = iRequestFusion;
                    this.f73882x0 = queueSubscription;
                    this.f73883y0 = true;
                    e();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.G0 = iRequestFusion;
                    this.f73882x0 = queueSubscription;
                    subscription.request(this.f73880u0);
                    return;
                }
            }
            this.f73882x0 = new SpscArrayQueue(this.f73880u0);
            subscription.request(this.f73880u0);
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.f73877r0, EmptySubscription.INSTANCE)) {
            this.f73882x0 = new SpscArrayQueue(this.f73880u0);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.f73877r0, EmptySubscription.INSTANCE)) {
            this.f73882x0 = new SpscLinkedArrayQueue(this.f73880u0);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Throwable th2;
        a<T> aVar = new a<>(subscriber, this);
        subscriber.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73878s0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == I0) {
                if ((this.f73879t0.get() || !this.f73881w0) && (th2 = this.E0) != null) {
                    subscriber.onError(th2);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get() == Long.MIN_VALUE) {
                        f(aVar);
                        return;
                    } else {
                        e();
                        return;
                    }
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z10) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10) {
        return new MulticastProcessor<>(i10, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10, boolean z10) {
        return new MulticastProcessor<>(i10, z10);
    }
}
