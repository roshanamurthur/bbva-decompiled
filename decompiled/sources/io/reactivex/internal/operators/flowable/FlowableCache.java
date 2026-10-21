package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements FlowableSubscriber<T> {
    public static final a[] E0 = new a[0];
    public static final a[] F0 = new a[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f70300q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70301r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f70302s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile long f70303t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final b<T> f70304u0;
    public b<T> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f70305w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Throwable f70306x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile boolean f70307y0;

    public static final class a<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70308p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableCache<T> f70309q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f70310r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public b<T> f70311s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f70312t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f70313u0;

        public a(Subscriber<? super T> subscriber, FlowableCache<T> flowableCache) {
            this.f70308p0 = subscriber;
            this.f70309q0 = flowableCache;
            this.f70311s0 = flowableCache.f70304u0;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            a<T>[] aVarArr;
            if (this.f70310r0.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                while (true) {
                    AtomicReference<a<T>[]> atomicReference = this.f70309q0.f70302s0;
                    a<T>[] aVarArr2 = atomicReference.get();
                    int length = aVarArr2.length;
                    if (length == 0) {
                        return;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (aVarArr2[i10] == this) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        aVarArr = FlowableCache.E0;
                    } else {
                        a<T>[] aVarArr3 = new a[length - 1];
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
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this.f70310r0, j10);
                this.f70309q0.e(this);
            }
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f70314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile b<T> f70315b;

        public b(int i10) {
            this.f70314a = (T[]) new Object[i10];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i10) {
        super(flowable);
        this.f70301r0 = i10;
        this.f70300q0 = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f70304u0 = bVar;
        this.v0 = bVar;
        this.f70302s0 = new AtomicReference<>(E0);
    }

    public final void e(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j10 = aVar.f70313u0;
        int i10 = aVar.f70312t0;
        b<T> bVar = aVar.f70311s0;
        AtomicLong atomicLong = aVar.f70310r0;
        Subscriber<? super T> subscriber = aVar.f70308p0;
        int i11 = this.f70301r0;
        int iAddAndGet = 1;
        while (true) {
            boolean z10 = this.f70307y0;
            boolean z11 = this.f70303t0 == j10;
            if (z10 && z11) {
                aVar.f70311s0 = null;
                Throwable th2 = this.f70306x0;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            if (!z11) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    aVar.f70311s0 = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        bVar = bVar.f70315b;
                        i10 = 0;
                    }
                    subscriber.onNext(bVar.f70314a[i10]);
                    i10++;
                    j10++;
                }
            }
            aVar.f70313u0 = j10;
            aVar.f70312t0 = i10;
            aVar.f70311s0 = bVar;
            iAddAndGet = aVar.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f70307y0 = true;
        for (a<T> aVar : this.f70302s0.getAndSet(F0)) {
            e(aVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f70307y0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f70306x0 = th2;
        this.f70307y0 = true;
        for (a<T> aVar : this.f70302s0.getAndSet(F0)) {
            e(aVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        int i10 = this.f70305w0;
        if (i10 == this.f70301r0) {
            b<T> bVar = new b<>(i10);
            bVar.f70314a[0] = t10;
            this.f70305w0 = 1;
            this.v0.f70315b = bVar;
            this.v0 = bVar;
        } else {
            this.v0.f70314a[i10] = t10;
            this.f70305w0 = i10 + 1;
        }
        this.f70303t0++;
        for (a<T> aVar : this.f70302s0.get()) {
            e(aVar);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a<T> aVar = new a<>(subscriber, this);
        subscriber.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f70302s0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == F0) {
                break;
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == aVarArr);
        }
        AtomicBoolean atomicBoolean = this.f70300q0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            e(aVar);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }
}
