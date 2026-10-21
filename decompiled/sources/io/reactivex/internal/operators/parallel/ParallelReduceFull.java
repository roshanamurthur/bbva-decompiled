package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f73329q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<T, T, T> f73330r0;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f73331p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f73332q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f73333r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73334s0;

        public a(b<T> bVar, BiFunction<T, T, T> biFunction) {
            this.f73331p0 = bVar;
            this.f73332q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f73334s0) {
                return;
            }
            this.f73334s0 = true;
            this.f73331p0.e(this.f73333r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f73334s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73334s0 = true;
                this.f73331p0.a(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f73334s0) {
                return;
            }
            T t11 = this.f73333r0;
            if (t11 == null) {
                this.f73333r0 = t10;
                return;
            }
            try {
                this.f73333r0 = (T) ObjectHelper.requireNonNull(this.f73332q0.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                get().cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class b<T> extends DeferredScalarSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T>[] f73335p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f73336q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<c<T>> f73337r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f73338s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Throwable> f73339t0;

        public b(Subscriber<? super T> subscriber, int i10, BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.f73337r0 = new AtomicReference<>();
            this.f73338s0 = new AtomicInteger();
            this.f73339t0 = new AtomicReference<>();
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, biFunction);
            }
            this.f73335p0 = aVarArr;
            this.f73336q0 = biFunction;
            this.f73338s0.lazySet(i10);
        }

        public final void a(Throwable th2) {
            AtomicReference<Throwable> atomicReference = this.f73339t0;
            while (!atomicReference.compareAndSet(null, th2)) {
                if (atomicReference.get() != null) {
                    if (th2 != atomicReference.get()) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                    return;
                }
            }
            cancel();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            for (a<T> aVar : this.f73335p0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }

        public final void e(T t10) {
            int i10;
            AtomicReference<c<T>> atomicReference = this.f73337r0;
            if (t10 != null) {
                while (true) {
                    c<T> cVar = atomicReference.get();
                    if (cVar == null) {
                        c<T> cVar2 = new c<>();
                        while (true) {
                            if (atomicReference.compareAndSet(null, cVar2)) {
                                cVar = cVar2;
                            } else if (atomicReference.get() != null) {
                            }
                        }
                    }
                    do {
                        i10 = cVar.get();
                        if (i10 >= 2) {
                            i10 = -1;
                            break;
                        }
                    } while (!cVar.compareAndSet(i10, i10 + 1));
                    if (i10 >= 0) {
                        if (i10 == 0) {
                            cVar.f73340p0 = t10;
                        } else {
                            cVar.f73341q0 = t10;
                        }
                        if (cVar.f73342r0.incrementAndGet() == 2) {
                            while (!atomicReference.compareAndSet(cVar, null) && atomicReference.get() == cVar) {
                            }
                        } else {
                            cVar = null;
                        }
                        if (cVar == null) {
                            break;
                        }
                        try {
                            t10 = (T) ObjectHelper.requireNonNull(this.f73336q0.apply(cVar.f73340p0, cVar.f73341q0), "The reducer returned a null value");
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            a(th2);
                            return;
                        }
                    } else {
                        while (!atomicReference.compareAndSet(cVar, null) && atomicReference.get() == cVar) {
                        }
                    }
                }
            }
            if (this.f73338s0.decrementAndGet() == 0) {
                c<T> cVar3 = atomicReference.get();
                atomicReference.lazySet(null);
                if (cVar3 != null) {
                    complete(cVar3.f73340p0);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class c<T> extends AtomicInteger {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public T f73340p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public T f73341q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f73342r0 = new AtomicInteger();
    }

    public ParallelReduceFull(ParallelFlowable<? extends T> parallelFlowable, BiFunction<T, T, T> biFunction) {
        this.f73329q0 = parallelFlowable;
        this.f73330r0 = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ParallelFlowable<? extends T> parallelFlowable = this.f73329q0;
        b bVar = new b(subscriber, parallelFlowable.parallelism(), this.f73330r0);
        subscriber.onSubscribe(bVar);
        parallelFlowable.subscribe(bVar.f73335p0);
    }
}
