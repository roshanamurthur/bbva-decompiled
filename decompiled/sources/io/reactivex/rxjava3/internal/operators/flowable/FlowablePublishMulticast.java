package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Flowable<T>, ? extends Publisher<? extends R>> f75188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f75190s0;

    public static final class a<T> extends Flowable<T> implements FlowableSubscriber<T> {
        public static final b[] G0 = new b[0];
        public static final b[] H0 = new b[0];
        public Throwable E0;
        public int F0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f75193s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f75194t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f75195u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile SimpleQueue<T> f75196w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f75197x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f75198y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f75191q0 = new AtomicInteger();
        public final AtomicReference<Subscription> v0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<b<T>[]> f75192r0 = new AtomicReference<>(G0);

        public a(int i10, boolean z10) {
            this.f75193s0 = i10;
            this.f75194t0 = i10 - (i10 >> 2);
            this.f75195u0 = z10;
        }

        public final void dispose() {
            SimpleQueue<T> simpleQueue;
            if (this.f75198y0) {
                return;
            }
            SubscriptionHelper.cancel(this.v0);
            if (this.f75191q0.getAndIncrement() != 0 || (simpleQueue = this.f75196w0) == null) {
                return;
            }
            simpleQueue.clear();
        }

        public final void e() {
            for (b<T> bVar : this.f75192r0.getAndSet(H0)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f75199p0.onComplete();
                }
            }
        }

        public final void f() {
            AtomicReference<b<T>[]> atomicReference;
            Throwable th2;
            Throwable th3;
            if (this.f75191q0.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f75196w0;
            int i10 = this.F0;
            int i11 = this.f75194t0;
            boolean z10 = this.f75197x0 != 1;
            AtomicReference<b<T>[]> atomicReference2 = this.f75192r0;
            b<T>[] bVarArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = bVarArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = bVarArr.length;
                    long j10 = Long.MAX_VALUE;
                    long j11 = Long.MAX_VALUE;
                    int i12 = 0;
                    while (i12 < length2) {
                        b<T> bVar = bVarArr[i12];
                        AtomicReference<b<T>[]> atomicReference3 = atomicReference2;
                        long j12 = bVar.get() - bVar.f75201r0;
                        if (j12 == Long.MIN_VALUE) {
                            length--;
                        } else if (j11 > j12) {
                            j11 = j12;
                        }
                        i12++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j13 = 0;
                    if (length == 0) {
                        j11 = 0;
                    }
                    while (true) {
                        if (j11 != j13) {
                            if (this.v0.get() == SubscriptionHelper.CANCELLED) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z11 = this.f75198y0;
                            if (z11 && !this.f75195u0 && (th3 = this.E0) != null) {
                                g(th3);
                                return;
                            }
                            try {
                                T tPoll = simpleQueue.poll();
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    Throwable th4 = this.E0;
                                    if (th4 != null) {
                                        g(th4);
                                        return;
                                    } else {
                                        e();
                                        return;
                                    }
                                }
                                if (!z12) {
                                    int length3 = bVarArr.length;
                                    int i13 = 0;
                                    boolean z13 = false;
                                    while (i13 < length3) {
                                        b<T> bVar2 = bVarArr[i13];
                                        long j14 = bVar2.get();
                                        if (j14 != Long.MIN_VALUE) {
                                            if (j14 != j10) {
                                                bVar2.f75201r0++;
                                            }
                                            bVar2.f75199p0.onNext(tPoll);
                                        } else {
                                            z13 = true;
                                        }
                                        i13++;
                                        j10 = Long.MAX_VALUE;
                                    }
                                    j11--;
                                    if (z10 && (i10 = i10 + 1) == i11) {
                                        this.v0.get().request(i11);
                                        i10 = 0;
                                    }
                                    b<T>[] bVarArr2 = atomicReference.get();
                                    if (z13 || bVarArr2 != bVarArr) {
                                        bVarArr = bVarArr2;
                                    } else {
                                        j13 = 0;
                                        j10 = Long.MAX_VALUE;
                                    }
                                }
                                atomicReference2 = atomicReference;
                            } catch (Throwable th5) {
                                Exceptions.throwIfFatal(th5);
                                SubscriptionHelper.cancel(this.v0);
                                g(th5);
                                return;
                            }
                        }
                        if (j11 == j13) {
                            if (this.v0.get() == SubscriptionHelper.CANCELLED) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z14 = this.f75198y0;
                            if (z14 && !this.f75195u0 && (th2 = this.E0) != null) {
                                g(th2);
                                return;
                            }
                            if (z14 && simpleQueue.isEmpty()) {
                                Throwable th6 = this.E0;
                                if (th6 != null) {
                                    g(th6);
                                    return;
                                } else {
                                    e();
                                    return;
                                }
                            }
                        }
                    }
                }
                this.F0 = i10;
                iAddAndGet = this.f75191q0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.f75196w0;
                }
                bVarArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        public final void g(Throwable th2) {
            for (b<T> bVar : this.f75192r0.getAndSet(H0)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f75199p0.onError(th2);
                }
            }
        }

        public final void h(b<T> bVar) {
            b<T>[] bVarArr;
            while (true) {
                AtomicReference<b<T>[]> atomicReference = this.f75192r0;
                b<T>[] bVarArr2 = atomicReference.get();
                int length = bVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (bVarArr2[i10] == bVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr = G0;
                } else {
                    b<T>[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr2, 0, bVarArr3, 0, i10);
                    System.arraycopy(bVarArr2, i10 + 1, bVarArr3, i10, (length - i10) - 1);
                    bVarArr = bVarArr3;
                }
                while (!atomicReference.compareAndSet(bVarArr2, bVarArr)) {
                    if (atomicReference.get() != bVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75198y0) {
                return;
            }
            this.f75198y0 = true;
            f();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75198y0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.E0 = th2;
            this.f75198y0 = true;
            f();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75198y0) {
                return;
            }
            if (this.f75197x0 != 0 || this.f75196w0.offer(t10)) {
                f();
            } else {
                this.v0.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.v0, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f75197x0 = iRequestFusion;
                        this.f75196w0 = queueSubscription;
                        this.f75198y0 = true;
                        f();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f75197x0 = iRequestFusion;
                        this.f75196w0 = queueSubscription;
                        QueueDrainHelper.request(subscription, this.f75193s0);
                        return;
                    }
                }
                this.f75196w0 = QueueDrainHelper.createQueue(this.f75193s0);
                QueueDrainHelper.request(subscription, this.f75193s0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public final void subscribeActual(Subscriber<? super T> subscriber) {
            b<T> bVar = new b<>(subscriber, this);
            subscriber.onSubscribe(bVar);
            while (true) {
                AtomicReference<b<T>[]> atomicReference = this.f75192r0;
                b<T>[] bVarArr = atomicReference.get();
                if (bVarArr == H0) {
                    Throwable th2 = this.E0;
                    if (th2 != null) {
                        subscriber.onError(th2);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                int length = bVarArr.length;
                b<T>[] bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
                do {
                    if (atomicReference.compareAndSet(bVarArr, bVarArr2)) {
                        if (bVar.get() == Long.MIN_VALUE) {
                            h(bVar);
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                } while (atomicReference.get() == bVarArr);
            }
        }
    }

    public static final class b<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75199p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a<T> f75200q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f75201r0;

        public b(Subscriber<? super T> subscriber, a<T> aVar) {
            this.f75199p0 = subscriber;
            this.f75200q0 = aVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                a<T> aVar = this.f75200q0;
                aVar.h(this);
                aVar.f();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this, j10);
                this.f75200q0.f();
            }
        }
    }

    public static final class c<R> implements FlowableSubscriber<R>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75202p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a<?> f75203q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75204r0;

        public c(Subscriber<? super R> subscriber, a<?> aVar) {
            this.f75202p0 = subscriber;
            this.f75203q0 = aVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75204r0.cancel();
            this.f75203q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75202p0.onComplete();
            this.f75203q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75202p0.onError(th2);
            this.f75203q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f75202p0.onNext(r3);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75204r0, subscription)) {
                this.f75204r0 = subscription;
                this.f75202p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75204r0.request(j10);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends Publisher<? extends R>> function, int i10, boolean z10) {
        super(flowable);
        this.f75188q0 = function;
        this.f75189r0 = i10;
        this.f75190s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        a aVar = new a(this.f75189r0, this.f75190s0);
        try {
            Publisher<? extends R> publisherApply = this.f75188q0.apply(aVar);
            Objects.requireNonNull(publisherApply, "selector returned a null Publisher");
            publisherApply.subscribe(new c(subscriber, aVar));
            this.source.subscribe((FlowableSubscriber) aVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
