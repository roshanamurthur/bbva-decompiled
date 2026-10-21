package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<T> f75173q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75174r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<b<T>> f75175s0 = new AtomicReference<>();

    public static final class a<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75176p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f75177q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f75178r0;

        public a(Subscriber<? super T> subscriber, b<T> bVar) {
            this.f75176p0 = subscriber;
            this.f75177q0 = bVar;
        }

        public final boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                b<T> bVar = this.f75177q0;
                bVar.c(this);
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this, j10);
                this.f75177q0.b();
            }
        }
    }

    public static final class b<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public static final a[] E0 = new a[0];
        public static final a[] F0 = new a[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<b<T>> f75179p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75180q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f75181r0 = new AtomicBoolean();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<a<T>[]> f75182s0 = new AtomicReference<>(E0);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f75183t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimpleQueue<T> f75184u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75185w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f75186x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f75187y0;

        public b(AtomicReference<b<T>> atomicReference, int i10) {
            this.f75179p0 = atomicReference;
            this.f75183t0 = i10;
        }

        public final boolean a(boolean z10, boolean z11) {
            if (!z10 || !z11) {
                return false;
            }
            Throwable th2 = this.f75186x0;
            if (th2 != null) {
                d(th2);
                return true;
            }
            for (a<T> aVar : this.f75182s0.getAndSet(F0)) {
                if (!aVar.a()) {
                    aVar.f75176p0.onComplete();
                }
            }
            return true;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f75184u0;
            int i10 = this.f75187y0;
            int i11 = this.f75183t0;
            int i12 = i11 - (i11 >> 2);
            boolean z10 = this.v0 != 1;
            int iAddAndGet = 1;
            SimpleQueue<T> simpleQueue2 = simpleQueue;
            int i13 = i10;
            while (true) {
                if (simpleQueue2 != null) {
                    a<T>[] aVarArr = this.f75182s0.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z11 = false;
                    for (a<T> aVar : aVarArr) {
                        long j10 = aVar.get();
                        if (j10 != Long.MIN_VALUE) {
                            jMin = Math.min(j10 - aVar.f75178r0, jMin);
                            z11 = true;
                        }
                    }
                    long j11 = 0;
                    if (!z11) {
                        jMin = 0;
                    }
                    while (true) {
                        if (jMin != j11) {
                            boolean z12 = this.f75185w0;
                            try {
                                T tPoll = simpleQueue2.poll();
                                boolean z13 = tPoll == null;
                                if (a(z12, z13)) {
                                    return;
                                }
                                if (!z13) {
                                    for (a<T> aVar2 : aVarArr) {
                                        if (!aVar2.a()) {
                                            aVar2.f75176p0.onNext(tPoll);
                                            aVar2.f75178r0++;
                                        }
                                    }
                                    if (z10 && (i13 = i13 + 1) == i12) {
                                        this.f75180q0.get().request(i12);
                                        i13 = 0;
                                    }
                                    jMin--;
                                    if (aVarArr == this.f75182s0.get()) {
                                        j11 = 0;
                                    }
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f75180q0.get().cancel();
                                simpleQueue2.clear();
                                this.f75185w0 = true;
                                d(th2);
                                return;
                            }
                        }
                        if (a(this.f75185w0, simpleQueue2.isEmpty())) {
                            return;
                        }
                    }
                }
                this.f75187y0 = i13;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.f75184u0;
                }
            }
        }

        public final void c(a<T> aVar) {
            a<T>[] aVarArr;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.f75182s0;
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
                    aVarArr = E0;
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

        public final void d(Throwable th2) {
            for (a<T> aVar : this.f75182s0.getAndSet(F0)) {
                if (!aVar.a()) {
                    aVar.f75176p0.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            this.f75182s0.getAndSet(F0);
            do {
                atomicReference = this.f75179p0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            SubscriptionHelper.cancel(this.f75180q0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75182s0.get() == F0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75185w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75185w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75186x0 = th2;
            this.f75185w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 0 || this.f75184u0.offer(t10)) {
                b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f75180q0, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f75184u0 = queueSubscription;
                        this.f75185w0 = true;
                        b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f75184u0 = queueSubscription;
                        subscription.request(this.f75183t0);
                        return;
                    }
                }
                this.f75184u0 = new SpscArrayQueue(this.f75183t0);
                subscription.request(this.f75183t0);
            }
        }
    }

    public FlowablePublish(Publisher<T> publisher, int i10) {
        this.f75173q0 = publisher;
        this.f75174r0 = i10;
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f75175s0;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference, this.f75174r0);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        AtomicBoolean atomicBoolean = bVar.f75181r0;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            consumer.accept(bVar);
            if (z10) {
                this.f75173q0.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void reset() {
        AtomicReference<b<T>> atomicReference = this.f75175s0;
        b<T> bVar = atomicReference.get();
        if (bVar == null || !bVar.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f75173q0;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f75175s0;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference, this.f75174r0);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        a<T> aVar = new a<>(subscriber, bVar);
        subscriber.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference2 = bVar.f75182s0;
            a<T>[] aVarArr = atomicReference2.get();
            if (aVarArr == b.F0) {
                Throwable th2 = bVar.f75186x0;
                Subscriber<? super T> subscriber2 = aVar.f75176p0;
                if (th2 != null) {
                    subscriber2.onError(th2);
                    return;
                } else {
                    subscriber2.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference2.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.a()) {
                        bVar.c(aVar);
                        return;
                    } else {
                        bVar.b();
                        return;
                    }
                }
            } while (atomicReference2.get() == aVarArr);
        }
    }
}
