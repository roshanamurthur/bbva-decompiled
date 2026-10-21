package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f77583q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<T, T, T> f77584r0;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f77585p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f77586q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f77587r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77588s0;

        public a(b<T> bVar, BiFunction<T, T, T> biFunction) {
            this.f77585p0 = bVar;
            this.f77586q0 = biFunction;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f77588s0) {
                return;
            }
            this.f77588s0 = true;
            this.f77585p0.e(this.f77587r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f77588s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77588s0 = true;
                this.f77585p0.a(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f77588s0) {
                return;
            }
            T t11 = this.f77587r0;
            if (t11 == null) {
                this.f77587r0 = t10;
                return;
            }
            try {
                T tApply = this.f77586q0.apply(t11, t10);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f77587r0 = tApply;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                get().cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class b<T> extends DeferredScalarSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T>[] f77589p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f77590q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<c<T>> f77591r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f77592s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f77593t0;

        public b(Subscriber<? super T> subscriber, int i10, BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.f77591r0 = new AtomicReference<>();
            this.f77592s0 = new AtomicInteger();
            this.f77593t0 = new AtomicThrowable();
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, biFunction);
            }
            this.f77589p0 = aVarArr;
            this.f77590q0 = biFunction;
            this.f77592s0.lazySet(i10);
        }

        public final void a(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f77593t0;
            if (atomicThrowable.compareAndSet(null, th2)) {
                cancel();
                this.downstream.onError(th2);
            } else if (th2 != atomicThrowable.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            for (a<T> aVar : this.f77589p0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }

        public final void e(T t10) {
            int i10;
            AtomicReference<c<T>> atomicReference = this.f77591r0;
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
                            cVar.f77594p0 = t10;
                        } else {
                            cVar.f77595q0 = t10;
                        }
                        if (cVar.f77596r0.incrementAndGet() == 2) {
                            while (!atomicReference.compareAndSet(cVar, null) && atomicReference.get() == cVar) {
                            }
                        } else {
                            cVar = null;
                        }
                        if (cVar == null) {
                            break;
                        }
                        try {
                            t10 = this.f77590q0.apply(cVar.f77594p0, cVar.f77595q0);
                            Objects.requireNonNull(t10, "The reducer returned a null value");
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
            if (this.f77592s0.decrementAndGet() == 0) {
                c<T> cVar3 = atomicReference.get();
                atomicReference.lazySet(null);
                if (cVar3 != null) {
                    complete(cVar3.f77594p0);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class c<T> extends AtomicInteger {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public T f77594p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public T f77595q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f77596r0 = new AtomicInteger();
    }

    public ParallelReduceFull(ParallelFlowable<? extends T> parallelFlowable, BiFunction<T, T, T> biFunction) {
        this.f77583q0 = parallelFlowable;
        this.f77584r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ParallelFlowable<? extends T> parallelFlowable = this.f77583q0;
        b bVar = new b(subscriber, parallelFlowable.parallelism(), this.f77584r0);
        subscriber.onSubscribe(bVar);
        parallelFlowable.subscribe(bVar.f77589p0);
    }
}
