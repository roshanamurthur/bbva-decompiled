package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
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
public final class FlowableFlatMap<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends U>> f74829q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74830r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74831s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f74832t0;

    public static final class a<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f74833p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U> f74834q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74835r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74836s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f74837t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimpleQueue<U> f74838u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f74839w0;

        public a(b<T, U> bVar, int i10, long j10) {
            this.f74833p0 = j10;
            this.f74834q0 = bVar;
            this.f74836s0 = i10;
            this.f74835r0 = i10 >> 2;
        }

        public final void a(long j10) {
            if (this.f74839w0 != 1) {
                long j11 = this.v0 + j10;
                if (j11 < this.f74835r0) {
                    this.v0 = j11;
                } else {
                    this.v0 = 0L;
                    get().request(j11);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74837t0 = true;
            this.f74834q0.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            lazySet(SubscriptionHelper.CANCELLED);
            b<T, U> bVar = this.f74834q0;
            if (bVar.f74846w0.tryAddThrowableOrReport(th2)) {
                this.f74837t0 = true;
                if (!bVar.f74842r0) {
                    bVar.F0.cancel();
                    for (a<?, ?> aVar : bVar.f74848y0.getAndSet(b.M0)) {
                        aVar.getClass();
                        SubscriptionHelper.cancel(aVar);
                    }
                }
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            if (this.f74839w0 == 2) {
                this.f74834q0.b();
                return;
            }
            b<T, U> bVar = this.f74834q0;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                long j10 = bVar.E0.get();
                SimpleQueue spscArrayQueue = this.f74838u0;
                if (j10 == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(bVar.f74844t0);
                        this.f74838u0 = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(u2)) {
                        bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    bVar.f74840p0.onNext(u2);
                    if (j10 != Long.MAX_VALUE) {
                        bVar.E0.decrementAndGet();
                    }
                    a(1L);
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue2 = this.f74838u0;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(bVar.f74844t0);
                    this.f74838u0 = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(u2)) {
                    bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.c();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f74839w0 = iRequestFusion;
                        this.f74838u0 = queueSubscription;
                        this.f74837t0 = true;
                        this.f74834q0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f74839w0 = iRequestFusion;
                        this.f74838u0 = queueSubscription;
                    }
                }
                subscription.request(this.f74836s0);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final a<?, ?>[] L0 = new a[0];
        public static final a<?, ?>[] M0 = new a[0];
        public final AtomicLong E0;
        public Subscription F0;
        public long G0;
        public long H0;
        public int I0;
        public int J0;
        public final int K0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super U> f74840p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends U>> f74841q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f74842r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74843s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f74844t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimplePlainQueue<U> f74845u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicThrowable f74846w0 = new AtomicThrowable();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f74847x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f74848y0;

        public b(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f74848y0 = atomicReference;
            this.E0 = new AtomicLong();
            this.f74840p0 = subscriber;
            this.f74841q0 = function;
            this.f74842r0 = z10;
            this.f74843s0 = i10;
            this.f74844t0 = i11;
            this.K0 = Math.max(1, i10 >> 1);
            atomicReference.lazySet(L0);
        }

        public final boolean a() {
            if (this.f74847x0) {
                SimplePlainQueue<U> simplePlainQueue = this.f74845u0;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                return true;
            }
            if (this.f74842r0 || this.f74846w0.get() == null) {
                return false;
            }
            SimplePlainQueue<U> simplePlainQueue2 = this.f74845u0;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            this.f74846w0.tryTerminateConsumer(this.f74840p0);
            return true;
        }

        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            long j10;
            long j11;
            long j12;
            boolean z10;
            int i10;
            int i11;
            long j13;
            long j14;
            Subscriber<? super U> subscriber = this.f74840p0;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f74845u0;
                long jAddAndGet = this.E0.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j15 = 0;
                if (simplePlainQueue != null) {
                    long j16 = 0;
                    j10 = 0;
                    while (jAddAndGet != 0) {
                        U uPoll = simplePlainQueue.poll();
                        if (a()) {
                            return;
                        }
                        if (uPoll == null) {
                            break;
                        }
                        subscriber.onNext(uPoll);
                        j10++;
                        j16++;
                        jAddAndGet--;
                    }
                    if (j16 != 0) {
                        jAddAndGet = z11 ? Long.MAX_VALUE : this.E0.addAndGet(-j16);
                    }
                } else {
                    j10 = 0;
                }
                boolean z12 = this.v0;
                SimplePlainQueue<U> simplePlainQueue2 = this.f74845u0;
                a<?, ?>[] aVarArr = this.f74848y0.get();
                int length = aVarArr.length;
                if (z12 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    this.f74846w0.tryTerminateConsumer(this.f74840p0);
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j17 = this.H0;
                    int i13 = this.I0;
                    if (length <= i13 || aVarArr[i13].f74833p0 != j17) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && aVarArr[i13].f74833p0 != j17; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.I0 = i13;
                        this.H0 = aVarArr[i13].f74833p0;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i15];
                        Object obj = null;
                        while (true) {
                            SimpleQueue<U> simpleQueue = aVar.f74838u0;
                            if (simpleQueue == null) {
                                i10 = length;
                                break;
                            }
                            i10 = length;
                            Object obj2 = obj;
                            long j18 = j15;
                            while (true) {
                                if (jAddAndGet == j15) {
                                    j13 = j15;
                                    break;
                                }
                                if (a()) {
                                    return;
                                }
                                try {
                                    U uPoll2 = simpleQueue.poll();
                                    if (uPoll2 == null) {
                                        obj2 = uPoll2;
                                        j13 = 0;
                                        break;
                                    } else {
                                        subscriber.onNext(uPoll2);
                                        jAddAndGet--;
                                        j18++;
                                        obj2 = uPoll2;
                                        j15 = 0;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    SubscriptionHelper.cancel(aVar);
                                    this.f74846w0.tryAddThrowableOrReport(th2);
                                    if (!this.f74842r0) {
                                        this.F0.cancel();
                                    }
                                    if (a()) {
                                        return;
                                    }
                                    e(aVar);
                                    i16++;
                                    i11 = i10;
                                    z13 = true;
                                }
                            }
                            if (j18 != j13) {
                                jAddAndGet = !z11 ? this.E0.addAndGet(-j18) : Long.MAX_VALUE;
                                aVar.a(j18);
                                j14 = 0;
                            } else {
                                j14 = j13;
                            }
                            if (jAddAndGet == j14 || obj2 == null) {
                                break;
                            }
                            length = i10;
                            obj = obj2;
                            j15 = 0;
                        }
                        boolean z14 = aVar.f74837t0;
                        SimpleQueue<U> simpleQueue2 = aVar.f74838u0;
                        if (z14 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                            e(aVar);
                            if (a()) {
                                return;
                            }
                            j10++;
                            z13 = true;
                        }
                        if (jAddAndGet == 0) {
                            z10 = z13;
                            break;
                        }
                        i15++;
                        i11 = i10;
                        if (i15 == i11) {
                            i15 = 0;
                        }
                        i16++;
                        length = i11;
                        j15 = 0;
                    }
                    this.I0 = i15;
                    this.H0 = aVarArr[i15].f74833p0;
                    j12 = j10;
                    j11 = 0;
                } else {
                    j11 = 0;
                    j12 = j10;
                    z10 = false;
                }
                if (j12 != j11 && !this.f74847x0) {
                    this.F0.request(j12);
                }
                if (z10) {
                    iAddAndGet = i12;
                } else {
                    iAddAndGet = addAndGet(-i12);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.f74847x0) {
                return;
            }
            this.f74847x0 = true;
            this.F0.cancel();
            AtomicReference<a<?, ?>[]> atomicReference = this.f74848y0;
            a<?, ?>[] aVarArr = M0;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    SubscriptionHelper.cancel(aVar);
                }
                this.f74846w0.tryTerminateAndReport();
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f74845u0) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public final SimplePlainQueue d() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.f74845u0;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.f74843s0 == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.f74844t0) : new SpscArrayQueue<>(this.f74843s0);
                this.f74845u0 = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f74848y0;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr2[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = L0;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f74846w0.tryAddThrowableOrReport(th2)) {
                this.v0 = true;
                if (!this.f74842r0) {
                    for (a<?, ?> aVar : this.f74848y0.getAndSet(M0)) {
                        aVar.getClass();
                        SubscriptionHelper.cancel(aVar);
                    }
                }
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            try {
                Publisher<? extends U> publisherApply = this.f74841q0.apply(t10);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends U> publisher = publisherApply;
                if (publisher instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) publisher).get();
                        if (obj == null) {
                            if (this.f74843s0 == Integer.MAX_VALUE || this.f74847x0) {
                                return;
                            }
                            int i10 = this.J0 + 1;
                            this.J0 = i10;
                            int i11 = this.K0;
                            if (i10 == i11) {
                                this.J0 = 0;
                                this.F0.request(i11);
                                return;
                            }
                            return;
                        }
                        if (get() == 0 && compareAndSet(0, 1)) {
                            long j10 = this.E0.get();
                            SimplePlainQueue<U> simplePlainQueue = this.f74845u0;
                            if (j10 == 0 || !(simplePlainQueue == 0 || simplePlainQueue.isEmpty())) {
                                if (simplePlainQueue == 0) {
                                    simplePlainQueue = (SimplePlainQueue<U>) d();
                                }
                                if (!simplePlainQueue.offer(obj)) {
                                    onError(new MissingBackpressureException("Scalar queue full?!"));
                                }
                            } else {
                                this.f74840p0.onNext(obj);
                                if (j10 != Long.MAX_VALUE) {
                                    this.E0.decrementAndGet();
                                }
                                if (this.f74843s0 != Integer.MAX_VALUE && !this.f74847x0) {
                                    int i12 = this.J0 + 1;
                                    this.J0 = i12;
                                    int i13 = this.K0;
                                    if (i12 == i13) {
                                        this.J0 = 0;
                                        this.F0.request(i13);
                                    }
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } else if (!d().offer(obj)) {
                            onError(new MissingBackpressureException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                        c();
                        return;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f74846w0.tryAddThrowableOrReport(th2);
                        b();
                        return;
                    }
                }
                int i14 = this.f74844t0;
                long j11 = this.G0;
                this.G0 = 1 + j11;
                a<?, ?> aVar = new a<>(this, i14, j11);
                while (true) {
                    AtomicReference<a<?, ?>[]> atomicReference = this.f74848y0;
                    a<?, ?>[] aVarArr = atomicReference.get();
                    if (aVarArr == M0) {
                        SubscriptionHelper.cancel(aVar);
                        return;
                    }
                    int length = aVarArr.length;
                    a<?, ?>[] aVarArr2 = new a[length + 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    aVarArr2[length] = aVar;
                    do {
                        if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            publisher.subscribe(aVar);
                            return;
                        }
                    } while (atomicReference.get() == aVarArr);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.F0.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.F0, subscription)) {
                this.F0 = subscription;
                this.f74840p0.onSubscribe(this);
                if (this.f74847x0) {
                    return;
                }
                int i10 = this.f74843s0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.E0, j10);
                b();
            }
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
        super(flowable);
        this.f74829q0 = function;
        this.f74830r0 = z10;
        this.f74831s0 = i10;
        this.f74832t0 = i11;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
        return new b(subscriber, function, z10, i10, i11);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends U>> function = this.f74829q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(subscriber, function, this.f74830r0, this.f74831s0, this.f74832t0));
    }
}
