package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelCollector<T, A, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ParallelFlowable<? extends T> f74126q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Collector<T, A, R> f74127r0;

    public static final class a<T, A, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, A, R> f74128p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<A, T> f74129q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BinaryOperator<A> f74130r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public A f74131s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74132t0;

        public a(b<T, A, R> bVar, A a10, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator) {
            this.f74128p0 = bVar;
            this.f74129q0 = biConsumer;
            this.f74130r0 = binaryOperator;
            this.f74131s0 = a10;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            b<T, A, R> bVar;
            AtomicReference<c<A>> atomicReference;
            int i10;
            if (this.f74132t0) {
                return;
            }
            A a10 = this.f74131s0;
            this.f74131s0 = null;
            this.f74132t0 = true;
            BinaryOperator<A> binaryOperator = this.f74130r0;
            while (true) {
                bVar = this.f74128p0;
                atomicReference = bVar.f74134q0;
                c<A> cVar = atomicReference.get();
                if (cVar == null) {
                    c<A> cVar2 = new c<>();
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
                        cVar.f74138p0 = (T) a10;
                    } else {
                        cVar.f74139q0 = (T) a10;
                    }
                    if (cVar.f74140r0.incrementAndGet() == 2) {
                        while (!atomicReference.compareAndSet(cVar, null) && atomicReference.get() == cVar) {
                        }
                    } else {
                        cVar = null;
                    }
                    if (cVar == null) {
                        break;
                    }
                    try {
                        a10 = (T) binaryOperator.apply(cVar.f74138p0, cVar.f74139q0);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        bVar.a(th2);
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(cVar, null) && atomicReference.get() == cVar) {
                    }
                }
            }
            if (bVar.f74135r0.decrementAndGet() == 0) {
                c<A> cVar3 = atomicReference.get();
                atomicReference.lazySet(null);
                try {
                    Object objApply = bVar.f74137t0.apply(cVar3.f74138p0);
                    Objects.requireNonNull(objApply, "The finisher returned a null value");
                    bVar.complete((T) objApply);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    bVar.a(th3);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74132t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74131s0 = null;
            this.f74132t0 = true;
            this.f74128p0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74132t0) {
                return;
            }
            try {
                this.f74129q0.accept(this.f74131s0, t10);
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

    public static final class b<T, A, R> extends DeferredScalarSubscription<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, A, R>[] f74133p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<c<A>> f74134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f74135r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f74136s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Function<A, R> f74137t0;

        public b(Subscriber<? super R> subscriber, int i10, Collector<T, A, R> collector) {
            super(subscriber);
            this.f74134q0 = new AtomicReference<>();
            this.f74135r0 = new AtomicInteger();
            this.f74136s0 = new AtomicThrowable();
            this.f74137t0 = collector.finisher();
            a<T, A, R>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, collector.supplier().get(), collector.accumulator(), collector.combiner());
            }
            this.f74133p0 = aVarArr;
            this.f74135r0.lazySet(i10);
        }

        public final void a(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f74136s0;
            if (atomicThrowable.compareAndSet(null, th2)) {
                cancel();
                this.downstream.onError(th2);
            } else if (th2 != atomicThrowable.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            for (a<T, A, R> aVar : this.f74133p0) {
                aVar.getClass();
                SubscriptionHelper.cancel(aVar);
            }
        }
    }

    public static final class c<T> extends AtomicInteger {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public T f74138p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public T f74139q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f74140r0 = new AtomicInteger();
    }

    public ParallelCollector(ParallelFlowable<? extends T> parallelFlowable, Collector<T, A, R> collector) {
        this.f74126q0 = parallelFlowable;
        this.f74127r0 = collector;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        ParallelFlowable<? extends T> parallelFlowable = this.f74126q0;
        try {
            b bVar = new b(subscriber, parallelFlowable.parallelism(), this.f74127r0);
            subscriber.onSubscribe(bVar);
            parallelFlowable.subscribe(bVar.f74133p0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
