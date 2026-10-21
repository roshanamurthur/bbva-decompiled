package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ParallelFlowable<List<T>> f77612q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Comparator<? super T> f77613r0;

    public static final class b<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f77616p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a<T>[] f77617q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final List<T>[] f77618r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int[] f77619s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Comparator<? super T> f77620t0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f77621u0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicInteger f77622w0 = new AtomicInteger();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Throwable> f77623x0 = new AtomicReference<>();

        public b(Subscriber<? super T> subscriber, int i10, Comparator<? super T> comparator) {
            this.f77616p0 = subscriber;
            this.f77620t0 = comparator;
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, i11);
            }
            this.f77617q0 = aVarArr;
            this.f77618r0 = new List[i10];
            this.f77619s0 = new int[i10];
            this.f77622w0.lazySet(i10);
        }

        public final void a() {
            for (a<T> aVar : this.f77617q0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }

        public final void b() {
            int i10;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f77616p0;
            List<T>[] listArr = this.f77618r0;
            int[] iArr = this.f77619s0;
            int length = iArr.length;
            int iAddAndGet = 1;
            do {
                long j10 = this.f77621u0.get();
                long j11 = 0;
                while (true) {
                    i10 = 0;
                    if (j11 != j10) {
                        if (this.v0) {
                            Arrays.fill(listArr, (Object) null);
                            return;
                        }
                        Throwable th2 = this.f77623x0.get();
                        if (th2 != null) {
                            a();
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onError(th2);
                            return;
                        }
                        int i11 = -1;
                        T t10 = null;
                        while (i10 < length) {
                            List<T> list = listArr[i10];
                            int i12 = iArr[i10];
                            if (list.size() != i12) {
                                if (t10 == null) {
                                    t10 = list.get(i12);
                                } else {
                                    T t11 = list.get(i12);
                                    try {
                                        if (this.f77620t0.compare(t10, t11) > 0) {
                                            t10 = t11;
                                        }
                                    } catch (Throwable th3) {
                                        Exceptions.throwIfFatal(th3);
                                        a();
                                        Arrays.fill(listArr, (Object) null);
                                        AtomicReference<Throwable> atomicReference = this.f77623x0;
                                        for (Throwable th4 = null; !atomicReference.compareAndSet(th4, th3); th4 = null) {
                                            if (atomicReference.get() != null) {
                                                RxJavaPlugins.onError(th3);
                                                break;
                                            }
                                        }
                                        subscriber.onError(this.f77623x0.get());
                                        return;
                                    }
                                }
                                i11 = i10;
                            }
                            i10++;
                        }
                        if (t10 == null) {
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onNext(t10);
                            iArr[i11] = iArr[i11] + 1;
                            j11++;
                        }
                    }
                }
                if (this.v0) {
                    Arrays.fill(listArr, (Object) null);
                    return;
                }
                Throwable th5 = this.f77623x0.get();
                if (th5 != null) {
                    a();
                    Arrays.fill(listArr, (Object) null);
                    subscriber.onError(th5);
                    return;
                }
                while (true) {
                    if (i10 >= length) {
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onComplete();
                        return;
                    } else if (iArr[i10] != listArr[i10].size()) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f77621u0, j11);
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
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f77618r0, (Object) null);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f77621u0, j10);
                if (this.f77622w0.get() == 0) {
                    b();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.f77612q0 = parallelFlowable;
        this.f77613r0 = comparator;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ParallelFlowable<List<T>> parallelFlowable = this.f77612q0;
        b bVar = new b(subscriber, parallelFlowable.parallelism(), this.f77613r0);
        subscriber.onSubscribe(bVar);
        parallelFlowable.subscribe(bVar.f77617q0);
    }

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f77614p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f77615q0;

        public a(b<T> bVar, int i10) {
            this.f77614p0 = bVar;
            this.f77615q0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T> bVar = this.f77614p0;
            AtomicReference<Throwable> atomicReference = bVar.f77623x0;
            while (!atomicReference.compareAndSet(null, th2)) {
                if (atomicReference.get() != null) {
                    if (th2 != atomicReference.get()) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                    return;
                }
            }
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            b<T> bVar = this.f77614p0;
            bVar.f77618r0[this.f77615q0] = (List) obj;
            if (bVar.f77622w0.decrementAndGet() == 0) {
                bVar.b();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
