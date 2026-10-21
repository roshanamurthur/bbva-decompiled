package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
@BackpressureSupport(BackpressureKind.FULL)
@SchedulerSupport("none")
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    public static final a[] G0 = new a[0];
    public static final a[] H0 = new a[0];
    public int E0;
    public int F0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f78288t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f78289u0;
    public final boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile SimpleQueue<T> f78290w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile boolean f78291x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile Throwable f78292y0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f78285q0 = new AtomicInteger();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78287s0 = new AtomicReference<>(G0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78286r0 = new AtomicReference<>();

    public static final class a<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f78293p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MulticastProcessor<T> f78294q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f78295r0;

        public a(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.f78293p0 = subscriber;
            this.f78294q0 = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f78294q0.f(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                long jAddCancel = BackpressureHelper.addCancel(this, j10);
                if (jAddCancel == Long.MIN_VALUE || jAddCancel == Long.MAX_VALUE) {
                    return;
                }
                this.f78294q0.e();
            }
        }
    }

    public MulticastProcessor(int i10, boolean z10) {
        this.f78288t0 = i10;
        this.f78289u0 = i10 - (i10 >> 2);
        this.v0 = z10;
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
        if (this.f78285q0.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<a<T>[]> atomicReference = this.f78287s0;
        int i11 = this.E0;
        int i12 = this.f78289u0;
        int i13 = this.F0;
        boolean z10 = true;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.f78290w0;
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
                            jMin = jMin == j10 ? j11 - aVar.f78295r0 : Math.min(jMin, j11 - aVar.f78295r0);
                        }
                        i14++;
                        j10 = -1;
                    }
                    int i15 = i11;
                    while (true) {
                        a<T>[] aVarArr2 = H0;
                        if (jMin > 0) {
                            a<T>[] aVarArr3 = atomicReference.get();
                            if (aVarArr3 == aVarArr2) {
                                simpleQueue.clear();
                                return;
                            }
                            if (aVarArr != aVarArr3) {
                                i10 = iAddAndGet;
                            } else {
                                boolean z11 = this.f78291x0;
                                try {
                                    tPoll = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    SubscriptionHelper.cancel(this.f78286r0);
                                    this.f78292y0 = th2;
                                    this.f78291x0 = z10;
                                    tPoll = null;
                                    z11 = z10;
                                }
                                T t10 = tPoll;
                                boolean z12 = t10 == null ? z10 : false;
                                if (z11 && z12) {
                                    Throwable th3 = this.f78292y0;
                                    if (th3 != null) {
                                        for (a<T> aVar2 : atomicReference.getAndSet(aVarArr2)) {
                                            if (aVar2.get() != Long.MIN_VALUE) {
                                                aVar2.f78293p0.onError(th3);
                                            }
                                        }
                                        return;
                                    }
                                    for (a<T> aVar3 : atomicReference.getAndSet(aVarArr2)) {
                                        if (aVar3.get() != Long.MIN_VALUE) {
                                            aVar3.f78293p0.onComplete();
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
                                            aVar4.f78295r0++;
                                            aVar4.f78293p0.onNext(t10);
                                        }
                                        i16++;
                                        iAddAndGet = i17;
                                    }
                                    int i18 = iAddAndGet;
                                    jMin--;
                                    z10 = true;
                                    if (i13 != 1 && (i15 = i15 + 1) == i12) {
                                        this.f78286r0.get().request(i12);
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
                            } else if (this.f78291x0 && simpleQueue.isEmpty()) {
                                Throwable th4 = this.f78292y0;
                                if (th4 != null) {
                                    for (a<T> aVar5 : atomicReference.getAndSet(aVarArr2)) {
                                        if (aVar5.get() != Long.MIN_VALUE) {
                                            aVar5.f78293p0.onError(th4);
                                        }
                                    }
                                    return;
                                }
                                for (a<T> aVar6 : atomicReference.getAndSet(aVarArr2)) {
                                    if (aVar6.get() != Long.MIN_VALUE) {
                                        aVar6.f78293p0.onComplete();
                                    }
                                }
                                return;
                            }
                        }
                        i11 = i15;
                        this.E0 = i11;
                        iAddAndGet = this.f78285q0.addAndGet(-i10);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
            i10 = iAddAndGet;
            this.E0 = i11;
            iAddAndGet = this.f78285q0.addAndGet(-i10);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final void f(a<T> aVar) {
        while (true) {
            a<T>[] aVarArr = this.f78287s0.get();
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
                AtomicReference<a<T>[]> atomicReference = this.f78287s0;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                    }
                }
                return;
            }
            if (!this.v0) {
                AtomicReference<a<T>[]> atomicReference2 = this.f78287s0;
                a<T>[] aVarArr3 = G0;
                while (!atomicReference2.compareAndSet(aVarArr, aVarArr3)) {
                    if (atomicReference2.get() != aVarArr) {
                    }
                }
                return;
            }
            AtomicReference<a<T>[]> atomicReference3 = this.f78287s0;
            a<T>[] aVarArr4 = H0;
            do {
                if (atomicReference3.compareAndSet(aVarArr, aVarArr4)) {
                    SubscriptionHelper.cancel(this.f78286r0);
                    this.f78291x0 = true;
                    return;
                }
            } while (atomicReference3.get() == aVarArr);
        }
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public Throwable getThrowable() {
        if (this.f78291x0) {
            return this.f78292y0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78291x0 && this.f78292y0 == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.f78287s0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78291x0 && this.f78292y0 != null;
    }

    @CheckReturnValue
    public boolean offer(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "offer called with a null value.");
        if (this.f78291x0) {
            return false;
        }
        if (this.F0 != 0) {
            throw new IllegalStateException("offer() should not be called in fusion mode!");
        }
        if (!this.f78290w0.offer(t10)) {
            return false;
        }
        e();
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f78291x0 = true;
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NonNull Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        if (this.f78291x0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78292y0 = th2;
        this.f78291x0 = true;
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        if (this.f78291x0) {
            return;
        }
        if (this.F0 == 0) {
            ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
            if (!this.f78290w0.offer(t10)) {
                SubscriptionHelper.cancel(this.f78286r0);
                onError(new MissingBackpressureException());
                return;
            }
        }
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f78286r0, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.F0 = iRequestFusion;
                    this.f78290w0 = queueSubscription;
                    this.f78291x0 = true;
                    e();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.F0 = iRequestFusion;
                    this.f78290w0 = queueSubscription;
                    subscription.request(this.f78288t0);
                    return;
                }
            }
            this.f78290w0 = new SpscArrayQueue(this.f78288t0);
            subscription.request(this.f78288t0);
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.f78286r0, EmptySubscription.INSTANCE)) {
            this.f78290w0 = new SpscArrayQueue(this.f78288t0);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.f78286r0, EmptySubscription.INSTANCE)) {
            this.f78290w0 = new SpscLinkedArrayQueue(this.f78288t0);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super T> subscriber) {
        Throwable th2;
        a<T> aVar = new a<>(subscriber, this);
        subscriber.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78287s0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == H0) {
                if (!this.f78291x0 || (th2 = this.f78292y0) == null) {
                    subscriber.onComplete();
                    return;
                } else {
                    subscriber.onError(th2);
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
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return new MulticastProcessor<>(i10, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return new MulticastProcessor<>(i10, z10);
    }
}
