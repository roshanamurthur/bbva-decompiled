package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelJoin<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f73272q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f73273r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f73274s0;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final c<T> f73275p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73276q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f73277r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f73278s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SpscArrayQueue f73279t0;

        public a(c<T> cVar, int i10) {
            this.f73275p0 = cVar;
            this.f73276q0 = i10;
            this.f73277r0 = i10 - (i10 >> 2);
        }

        public final SimplePlainQueue<T> a() {
            SpscArrayQueue spscArrayQueue = this.f73279t0;
            if (spscArrayQueue != null) {
                return spscArrayQueue;
            }
            SpscArrayQueue spscArrayQueue2 = new SpscArrayQueue(this.f73276q0);
            this.f73279t0 = spscArrayQueue2;
            return spscArrayQueue2;
        }

        public final void b() {
            long j10 = this.f73278s0 + 1;
            if (j10 != this.f73277r0) {
                this.f73278s0 = j10;
            } else {
                this.f73278s0 = 0L;
                get().request(j10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f73275p0.d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f73275p0.e(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f73275p0.f(this, t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, this.f73276q0);
        }
    }

    public static final class b<T> extends c<T> {
        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void d() {
            this.f73285u0.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void e(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f73282r0;
            if (atomicThrowable.compareAndSet(null, th2)) {
                a();
                c();
            } else if (th2 != atomicThrowable.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void f(a<T> aVar, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                AtomicLong atomicLong = this.f73283s0;
                long j10 = atomicLong.get();
                Subscriber<? super T> subscriber = this.f73280p0;
                if (j10 != 0) {
                    subscriber.onNext(t10);
                    if (atomicLong.get() != Long.MAX_VALUE) {
                        atomicLong.decrementAndGet();
                    }
                    long j11 = aVar.f73278s0 + 1;
                    if (j11 >= aVar.f73277r0) {
                        aVar.f73278s0 = 0L;
                        aVar.get().request(j11);
                    } else {
                        aVar.f73278s0 = j11;
                    }
                } else if (!aVar.a().offer(t10)) {
                    a();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.f73282r0.compareAndSet(null, missingBackpressureException)) {
                        subscriber.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!aVar.a().offer(t10)) {
                a();
                e(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        public final void g() {
            boolean z10;
            a.d dVar;
            a<T>[] aVarArr = this.f73281q0;
            int length = aVarArr.length;
            Subscriber<? super T> subscriber = this.f73280p0;
            int i10 = 1;
            while (true) {
                long j10 = this.f73283s0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f73284t0) {
                        b();
                        return;
                    }
                    Throwable th2 = this.f73282r0.get();
                    if (th2 != null) {
                        b();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z11 = this.f73285u0.get() == 0;
                    boolean z12 = true;
                    for (a<T> aVar : aVarArr) {
                        SpscArrayQueue spscArrayQueue = aVar.f73279t0;
                        if (spscArrayQueue != null && (dVar = (Object) spscArrayQueue.poll()) != null) {
                            subscriber.onNext(dVar);
                            aVar.b();
                            j11++;
                            if (j11 == j10) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    if (!z11 || !z12) {
                        if (z12) {
                            break;
                        }
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j11 == j10) {
                    if (this.f73284t0) {
                        b();
                        return;
                    }
                    Throwable th3 = this.f73282r0.get();
                    if (th3 != null) {
                        b();
                        subscriber.onError(th3);
                        return;
                    }
                    boolean z13 = this.f73285u0.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        SpscArrayQueue spscArrayQueue2 = aVarArr[i11].f73279t0;
                        if (spscArrayQueue2 != null && !spscArrayQueue2.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    }
                    if (z13 && z10) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f73283s0.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    public static abstract class c<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73280p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a<T>[] f73281q0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f73284t0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f73282r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f73283s0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f73285u0 = new AtomicInteger();

        public c(Subscriber<? super T> subscriber, int i10, int i11) {
            this.f73280p0 = subscriber;
            a<T>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i11);
            }
            this.f73281q0 = aVarArr;
            this.f73285u0.lazySet(i10);
        }

        public final void a() {
            for (a<T> aVar : this.f73281q0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }

        public final void b() {
            for (a<T> aVar : this.f73281q0) {
                aVar.f73279t0 = null;
            }
        }

        public abstract void c();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f73284t0) {
                return;
            }
            this.f73284t0 = true;
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public abstract void d();

        public abstract void e(Throwable th2);

        public abstract void f(a<T> aVar, T t10);

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f73283s0, j10);
                c();
            }
        }
    }

    public static final class d<T> extends c<T> {
        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void d() {
            this.f73285u0.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void e(Throwable th2) {
            this.f73282r0.addThrowable(th2);
            this.f73285u0.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public final void f(a<T> aVar, T t10) {
            int i10 = get();
            AtomicInteger atomicInteger = this.f73285u0;
            AtomicThrowable atomicThrowable = this.f73282r0;
            if (i10 == 0 && compareAndSet(0, 1)) {
                AtomicLong atomicLong = this.f73283s0;
                if (atomicLong.get() != 0) {
                    this.f73280p0.onNext(t10);
                    if (atomicLong.get() != Long.MAX_VALUE) {
                        atomicLong.decrementAndGet();
                    }
                    long j10 = aVar.f73278s0 + 1;
                    if (j10 >= aVar.f73277r0) {
                        aVar.f73278s0 = 0L;
                        aVar.get().request(j10);
                    } else {
                        aVar.f73278s0 = j10;
                    }
                } else if (!aVar.a().offer(t10)) {
                    SubscriptionHelper.cancel(aVar);
                    atomicThrowable.addThrowable(new MissingBackpressureException("Queue full?!"));
                    atomicInteger.decrementAndGet();
                    g();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!aVar.a().offer(t10) && SubscriptionHelper.cancel(aVar)) {
                    atomicThrowable.addThrowable(new MissingBackpressureException("Queue full?!"));
                    atomicInteger.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            g();
        }

        public final void g() {
            boolean z10;
            a.d dVar;
            a<T>[] aVarArr = this.f73281q0;
            int length = aVarArr.length;
            Subscriber<? super T> subscriber = this.f73280p0;
            int i10 = 1;
            while (true) {
                long j10 = this.f73283s0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f73284t0) {
                        b();
                        return;
                    }
                    boolean z11 = this.f73285u0.get() == 0;
                    boolean z12 = true;
                    for (a<T> aVar : aVarArr) {
                        SpscArrayQueue spscArrayQueue = aVar.f73279t0;
                        if (spscArrayQueue != null && (dVar = (Object) spscArrayQueue.poll()) != null) {
                            subscriber.onNext(dVar);
                            aVar.b();
                            j11++;
                            if (j11 == j10) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    if (z11 && z12) {
                        if (this.f73282r0.get() != null) {
                            subscriber.onError(this.f73282r0.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                }
                if (j11 == j10) {
                    if (this.f73284t0) {
                        b();
                        return;
                    }
                    boolean z13 = this.f73285u0.get() == 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z10 = true;
                            break;
                        }
                        SpscArrayQueue spscArrayQueue2 = aVarArr[i11].f73279t0;
                        if (spscArrayQueue2 != null && !spscArrayQueue2.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    }
                    if (z13 && z10) {
                        if (this.f73282r0.get() != null) {
                            subscriber.onError(this.f73282r0.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f73283s0.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i10 && (iAddAndGet = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = iAddAndGet;
                }
            }
        }
    }

    public ParallelJoin(ParallelFlowable<? extends T> parallelFlowable, int i10, boolean z10) {
        this.f73272q0 = parallelFlowable;
        this.f73273r0 = i10;
        this.f73274s0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = this.f73274s0;
        int i10 = this.f73273r0;
        ParallelFlowable<? extends T> parallelFlowable = this.f73272q0;
        c dVar = z10 ? new d(subscriber, parallelFlowable.parallelism(), i10) : new b(subscriber, parallelFlowable.parallelism(), i10);
        subscriber.onSubscribe(dVar);
        parallelFlowable.subscribe(dVar.f73281q0);
    }
}
