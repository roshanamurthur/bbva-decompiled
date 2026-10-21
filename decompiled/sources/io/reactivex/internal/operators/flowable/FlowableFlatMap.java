package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends U>> f70562q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70563r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f70564s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f70565t0;

    public static final class a<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f70566p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U> f70567q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70568r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70569s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f70570t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimpleQueue<U> f70571u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f70572w0;

        public a(b<T, U> bVar, long j10) {
            this.f70566p0 = j10;
            this.f70567q0 = bVar;
            int i10 = bVar.f70577t0;
            this.f70569s0 = i10;
            this.f70568r0 = i10 >> 2;
        }

        public final void a(long j10) {
            if (this.f70572w0 != 1) {
                long j11 = this.v0 + j10;
                if (j11 < this.f70568r0) {
                    this.v0 = j11;
                } else {
                    this.v0 = 0L;
                    get().request(j11);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70570t0 = true;
            this.f70567q0.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            lazySet(SubscriptionHelper.CANCELLED);
            b<T, U> bVar = this.f70567q0;
            if (!bVar.f70579w0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70570t0 = true;
            if (!bVar.f70575r0) {
                bVar.F0.cancel();
                for (a<?, ?> aVar : bVar.f70581y0.getAndSet(b.M0)) {
                    aVar.getClass();
                    SubscriptionHelper.cancel(aVar);
                }
            }
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u2) {
            if (this.f70572w0 == 2) {
                this.f70567q0.b();
                return;
            }
            b<T, U> bVar = this.f70567q0;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                long j10 = bVar.E0.get();
                SimpleQueue spscArrayQueue = this.f70571u0;
                if (j10 == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null && (spscArrayQueue = this.f70571u0) == null) {
                        spscArrayQueue = new SpscArrayQueue(bVar.f70577t0);
                        this.f70571u0 = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(u2)) {
                        bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    bVar.f70573p0.onNext(u2);
                    if (j10 != Long.MAX_VALUE) {
                        bVar.E0.decrementAndGet();
                    }
                    a(1L);
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue2 = this.f70571u0;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(bVar.f70577t0);
                    this.f70571u0 = spscArrayQueue2;
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f70572w0 = iRequestFusion;
                        this.f70571u0 = queueSubscription;
                        this.f70570t0 = true;
                        this.f70567q0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f70572w0 = iRequestFusion;
                        this.f70571u0 = queueSubscription;
                    }
                }
                subscription.request(this.f70569s0);
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
        public final Subscriber<? super U> f70573p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends U>> f70574q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f70575r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70576s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f70577t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimplePlainQueue<U> f70578u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicThrowable f70579w0 = new AtomicThrowable();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f70580x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f70581y0;

        public b(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f70581y0 = atomicReference;
            this.E0 = new AtomicLong();
            this.f70573p0 = subscriber;
            this.f70574q0 = function;
            this.f70575r0 = z10;
            this.f70576s0 = i10;
            this.f70577t0 = i11;
            this.K0 = Math.max(1, i10 >> 1);
            atomicReference.lazySet(L0);
        }

        public final boolean a() {
            if (this.f70580x0) {
                SimplePlainQueue<U> simplePlainQueue = this.f70578u0;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                return true;
            }
            if (this.f70575r0 || this.f70579w0.get() == null) {
                return false;
            }
            SimplePlainQueue<U> simplePlainQueue2 = this.f70578u0;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            Throwable thTerminate = this.f70579w0.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f70573p0.onError(thTerminate);
            }
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
            boolean z10;
            int i10;
            int i11;
            long j12;
            Object obj;
            Subscriber<? super U> subscriber = this.f70573p0;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f70578u0;
                long jAddAndGet = this.E0.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j13 = 0;
                long j14 = 0;
                if (simplePlainQueue != null) {
                    do {
                        long j15 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = simplePlainQueue.poll();
                            if (a()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            subscriber.onNext(uPoll);
                            j14++;
                            j15++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j15 != 0) {
                            jAddAndGet = z11 ? Long.MAX_VALUE : this.E0.addAndGet(-j15);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.v0;
                SimplePlainQueue<U> simplePlainQueue2 = this.f70578u0;
                a<?, ?>[] aVarArr = this.f70581y0.get();
                int length = aVarArr.length;
                if (z12 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.f70579w0.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j16 = this.H0;
                    int i13 = this.I0;
                    if (length <= i13 || aVarArr[i13].f70566p0 != j16) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && aVarArr[i13].f70566p0 != j16; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.I0 = i13;
                        this.H0 = aVarArr[i13].f70566p0;
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
                        Object obj2 = null;
                        while (!a()) {
                            SimpleQueue<U> simpleQueue = aVar.f70571u0;
                            if (simpleQueue == null) {
                                i10 = length;
                            } else {
                                i10 = length;
                                Object obj3 = obj2;
                                long j17 = j13;
                                while (jAddAndGet != j13) {
                                    try {
                                        U uPoll2 = simpleQueue.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j13 = 0;
                                            break;
                                        }
                                        subscriber.onNext(uPoll2);
                                        if (a()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j17++;
                                        obj3 = uPoll2;
                                        j13 = 0;
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        SubscriptionHelper.cancel(aVar);
                                        this.f70579w0.addThrowable(th2);
                                        if (!this.f70575r0) {
                                            this.F0.cancel();
                                        }
                                        if (a()) {
                                            return;
                                        }
                                        e(aVar);
                                        i16++;
                                        z13 = true;
                                        i11 = 1;
                                    }
                                }
                                if (j17 != j13) {
                                    jAddAndGet = !z11 ? this.E0.addAndGet(-j17) : Long.MAX_VALUE;
                                    aVar.a(j17);
                                    j12 = 0;
                                } else {
                                    j12 = j13;
                                }
                                if (jAddAndGet != j12 && obj3 != null) {
                                    length = i10;
                                    obj2 = obj3;
                                    j13 = 0;
                                }
                            }
                            boolean z14 = aVar.f70570t0;
                            SimpleQueue<U> simpleQueue2 = aVar.f70571u0;
                            if (z14 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                e(aVar);
                                if (a()) {
                                    return;
                                }
                                j14++;
                                z13 = true;
                            }
                            if (jAddAndGet == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i10) {
                                i15 = 0;
                            }
                            i11 = 1;
                            i16 += i11;
                            length = i10;
                            j13 = 0;
                        }
                        return;
                    }
                    this.I0 = i15;
                    this.H0 = aVarArr[i15].f70566p0;
                    j11 = j14;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j14;
                    z10 = false;
                }
                if (j11 != j10 && !this.f70580x0) {
                    this.F0.request(j11);
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
            a<?, ?>[] andSet;
            if (this.f70580x0) {
                return;
            }
            this.f70580x0 = true;
            this.F0.cancel();
            AtomicReference<a<?, ?>[]> atomicReference = this.f70581y0;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = M0;
            if (aVarArr != aVarArr2 && (andSet = atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    SubscriptionHelper.cancel(aVar);
                }
                Throwable thTerminate = this.f70579w0.terminate();
                if (thTerminate != null && thTerminate != ExceptionHelper.TERMINATED) {
                    RxJavaPlugins.onError(thTerminate);
                }
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f70578u0) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public final SimplePlainQueue d() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.f70578u0;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.f70576s0 == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.f70577t0) : new SpscArrayQueue<>(this.f70576s0);
                this.f70578u0 = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f70581y0;
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
            if (!this.f70579w0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = true;
            if (!this.f70575r0) {
                for (a<?, ?> aVar : this.f70581y0.getAndSet(M0)) {
                    aVar.getClass();
                    SubscriptionHelper.cancel(aVar);
                }
            }
            b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70574q0.apply(t10), "The mapper returned a null Publisher");
                if (publisher instanceof Callable) {
                    try {
                        Object objCall = ((Callable) publisher).call();
                        if (objCall == null) {
                            if (this.f70576s0 == Integer.MAX_VALUE || this.f70580x0) {
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
                            SimplePlainQueue<U> simplePlainQueue = this.f70578u0;
                            if (j10 == 0 || !(simplePlainQueue == 0 || simplePlainQueue.isEmpty())) {
                                if (simplePlainQueue == 0) {
                                    simplePlainQueue = (SimplePlainQueue<U>) d();
                                }
                                if (!simplePlainQueue.offer(objCall)) {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            } else {
                                this.f70573p0.onNext(objCall);
                                if (j10 != Long.MAX_VALUE) {
                                    this.E0.decrementAndGet();
                                }
                                if (this.f70576s0 != Integer.MAX_VALUE && !this.f70580x0) {
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
                        } else if (!d().offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                        c();
                        return;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f70579w0.addThrowable(th2);
                        b();
                        return;
                    }
                }
                long j11 = this.G0;
                this.G0 = 1 + j11;
                a<?, ?> aVar = new a<>(this, j11);
                while (true) {
                    AtomicReference<a<?, ?>[]> atomicReference = this.f70581y0;
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.F0, subscription)) {
                this.F0 = subscription;
                this.f70573p0.onSubscribe(this);
                if (this.f70580x0) {
                    return;
                }
                int i10 = this.f70576s0;
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
        this.f70562q0 = function;
        this.f70563r0 = z10;
        this.f70564s0 = i10;
        this.f70565t0 = i11;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z10, int i10, int i11) {
        return new b(subscriber, function, z10, i10, i11);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends U>> function = this.f70562q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(subscriber, function, this.f70563r0, this.f70564s0, this.f70565t0));
    }
}
