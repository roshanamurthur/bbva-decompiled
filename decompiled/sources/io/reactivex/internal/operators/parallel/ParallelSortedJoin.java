package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
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
    public final ParallelFlowable<List<T>> f73358q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Comparator<? super T> f73359r0;

    public static final class b<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a<T>[] f73363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final List<T>[] f73364r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int[] f73365s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Comparator<? super T> f73366t0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f73367u0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicInteger f73368w0 = new AtomicInteger();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Throwable> f73369x0 = new AtomicReference<>();

        public b(Subscriber<? super T> subscriber, int i10, Comparator<? super T> comparator) {
            this.f73362p0 = subscriber;
            this.f73366t0 = comparator;
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, i11);
            }
            this.f73363q0 = aVarArr;
            this.f73364r0 = new List[i10];
            this.f73365s0 = new int[i10];
            this.f73368w0.lazySet(i10);
        }

        public final void a() {
            for (a<T> aVar : this.f73363q0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }

        public final void b() {
            int i10;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f73362p0;
            List<T>[] listArr = this.f73364r0;
            int[] iArr = this.f73365s0;
            int length = iArr.length;
            int i11 = 1;
            while (true) {
                long j10 = this.f73367u0.get();
                long j11 = 0;
                while (true) {
                    i10 = 0;
                    if (j11 != j10) {
                        if (this.v0) {
                            Arrays.fill(listArr, (Object) null);
                            return;
                        }
                        Throwable th2 = this.f73369x0.get();
                        if (th2 != null) {
                            a();
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onError(th2);
                            return;
                        }
                        int i12 = -1;
                        T t10 = null;
                        while (i10 < length) {
                            List<T> list = listArr[i10];
                            int i13 = iArr[i10];
                            if (list.size() != i13) {
                                if (t10 == null) {
                                    t10 = list.get(i13);
                                } else {
                                    T t11 = list.get(i13);
                                    try {
                                        if (this.f73366t0.compare(t10, t11) > 0) {
                                            t10 = t11;
                                        }
                                    } catch (Throwable th3) {
                                        Exceptions.throwIfFatal(th3);
                                        a();
                                        Arrays.fill(listArr, (Object) null);
                                        AtomicReference<Throwable> atomicReference = this.f73369x0;
                                        for (Throwable th4 = null; !atomicReference.compareAndSet(th4, th3); th4 = null) {
                                            if (atomicReference.get() != null) {
                                                RxJavaPlugins.onError(th3);
                                                break;
                                            }
                                        }
                                        subscriber.onError(this.f73369x0.get());
                                        return;
                                    }
                                }
                                i12 = i10;
                            }
                            i10++;
                        }
                        if (t10 == null) {
                            Arrays.fill(listArr, (Object) null);
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onNext(t10);
                            iArr[i12] = iArr[i12] + 1;
                            j11++;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.v0) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th5 = this.f73369x0.get();
                    if (th5 != null) {
                        a();
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onError(th5);
                        return;
                    } else {
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
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f73367u0.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i11 && (iAddAndGet = addAndGet(-i11)) == 0) {
                    return;
                } else {
                    i11 = iAddAndGet;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f73364r0, (Object) null);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f73367u0, j10);
                if (this.f73368w0.get() == 0) {
                    b();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.f73358q0 = parallelFlowable;
        this.f73359r0 = comparator;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ParallelFlowable<List<T>> parallelFlowable = this.f73358q0;
        b bVar = new b(subscriber, parallelFlowable.parallelism(), this.f73359r0);
        subscriber.onSubscribe(bVar);
        parallelFlowable.subscribe(bVar.f73363q0);
    }

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f73360p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73361q0;

        public a(b<T> bVar, int i10) {
            this.f73360p0 = bVar;
            this.f73361q0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<T> bVar = this.f73360p0;
            AtomicReference<Throwable> atomicReference = bVar.f73369x0;
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
            b<T> bVar = this.f73360p0;
            bVar.f73364r0[this.f73361q0] = (List) obj;
            if (bVar.f73368w0.decrementAndGet() == 0) {
                bVar.b();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
