package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, FlowablePublishClassic<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f70898q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<c<T>> f70899r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f70900s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Publisher<T> f70901t0;

    public static final class a<T> implements Publisher<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<c<T>> f70902p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f70903q0;

        public a(AtomicReference<c<T>> atomicReference, int i10) {
            this.f70902p0 = atomicReference;
            this.f70903q0 = i10;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            c<T> cVar;
            b<T> bVar = new b<>(subscriber);
            subscriber.onSubscribe(bVar);
            loop0: while (true) {
                c<T> cVar2 = this.f70902p0.get();
                if (cVar2 == null || cVar2.isDisposed()) {
                    c<T> cVar3 = new c<>(this.f70902p0, this.f70903q0);
                    AtomicReference<c<T>> atomicReference = this.f70902p0;
                    while (true) {
                        if (atomicReference.compareAndSet(cVar2, cVar3)) {
                            cVar = cVar3;
                        } else if (atomicReference.get() != cVar2) {
                        }
                    }
                } else {
                    cVar = cVar2;
                }
                while (true) {
                    AtomicReference<b<T>[]> atomicReference2 = cVar.f70911r0;
                    b<T>[] bVarArr = atomicReference2.get();
                    if (bVarArr == c.f70908y0) {
                        break;
                    }
                    int length = bVarArr.length;
                    b<T>[] bVarArr2 = new b[length + 1];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    do {
                        if (atomicReference2.compareAndSet(bVarArr, bVarArr2)) {
                            break loop0;
                        }
                    } while (atomicReference2.get() == bVarArr);
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar.c(bVar);
            } else {
                bVar.f70905q0 = cVar;
            }
            cVar.b();
        }
    }

    public static final class b<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70904p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile c<T> f70905q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f70906r0;

        public b(Subscriber<? super T> subscriber) {
            this.f70904p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.f70905q0) == null) {
                return;
            }
            cVar.c(this);
            cVar.b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this, j10);
                c<T> cVar = this.f70905q0;
                if (cVar != null) {
                    cVar.b();
                }
            }
        }
    }

    public static final class c<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final b[] f70907x0 = new b[0];

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final b[] f70908y0 = new b[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<c<T>> f70909p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f70910q0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile Object f70914u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile SimpleQueue<T> f70915w0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Subscription> f70913t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<b<T>[]> f70911r0 = new AtomicReference<>(f70907x0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f70912s0 = new AtomicBoolean();

        public c(AtomicReference<c<T>> atomicReference, int i10) {
            this.f70909p0 = atomicReference;
            this.f70910q0 = i10;
        }

        public final boolean a(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                boolean zIsComplete = NotificationLite.isComplete(obj);
                b<T>[] bVarArr = f70908y0;
                AtomicReference<b<T>[]> atomicReference = this.f70911r0;
                AtomicReference<c<T>> atomicReference2 = this.f70909p0;
                if (!zIsComplete) {
                    Throwable error = NotificationLite.getError(obj);
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    b<T>[] andSet = atomicReference.getAndSet(bVarArr);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].f70904p0.onError(error);
                            i10++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z10) {
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    b<T>[] andSet2 = atomicReference.getAndSet(bVarArr);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].f70904p0.onComplete();
                        i10++;
                    }
                    return true;
                }
            }
            return false;
        }

        public final void b() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<b<T>[]> atomicReference = this.f70911r0;
            boolean z10 = true;
            b<T>[] bVarArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.f70914u0;
                SimpleQueue<T> simpleQueue = this.f70915w0;
                boolean z11 = (simpleQueue == null || simpleQueue.isEmpty()) ? z10 : false;
                if (a(obj, z11)) {
                    return;
                }
                if (!z11) {
                    int length = bVarArr.length;
                    int i10 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (b<T> bVar : bVarArr) {
                        long j10 = bVar.get();
                        if (j10 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j10 - bVar.f70906r0);
                        } else {
                            i10++;
                        }
                    }
                    if (length == i10) {
                        Object objError = this.f70914u0;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.f70913t0.get().cancel();
                            objError = NotificationLite.error(th2);
                            this.f70914u0 = objError;
                            tPoll = null;
                        }
                        if (a(objError, tPoll == null ? z10 : false)) {
                            return;
                        }
                        if (this.v0 != z10) {
                            this.f70913t0.get().request(1L);
                        }
                    } else {
                        int i11 = 0;
                        while (true) {
                            long j11 = i11;
                            if (j11 < jMin) {
                                Object objError2 = this.f70914u0;
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.f70913t0.get().cancel();
                                    objError2 = NotificationLite.error(th3);
                                    this.f70914u0 = objError2;
                                    tPoll2 = null;
                                }
                                boolean z12 = tPoll2 == null ? z10 : false;
                                if (a(objError2, z12)) {
                                    return;
                                }
                                if (z12) {
                                    z11 = z12;
                                } else {
                                    Object value = NotificationLite.getValue(tPoll2);
                                    int length2 = bVarArr.length;
                                    int i12 = 0;
                                    boolean z13 = false;
                                    while (i12 < length2) {
                                        b<T> bVar2 = bVarArr[i12];
                                        long j12 = bVar2.get();
                                        if (j12 != Long.MIN_VALUE) {
                                            if (j12 != Long.MAX_VALUE) {
                                                bVar2.f70906r0++;
                                            }
                                            bVar2.f70904p0.onNext(value);
                                        } else {
                                            simpleQueue = simpleQueue;
                                            z12 = z12;
                                            z13 = true;
                                        }
                                        i12++;
                                        simpleQueue = simpleQueue;
                                        z12 = z12;
                                    }
                                    SimpleQueue<T> simpleQueue2 = simpleQueue;
                                    boolean z14 = z12;
                                    i11++;
                                    b<T>[] bVarArr2 = atomicReference.get();
                                    if (z13 || bVarArr2 != bVarArr) {
                                        if (i11 != 0 && this.v0 != 1) {
                                            this.f70913t0.get().request(i11);
                                        }
                                        bVarArr = bVarArr2;
                                        z10 = true;
                                    } else {
                                        simpleQueue = simpleQueue2;
                                        z11 = z14;
                                        z10 = true;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                z10 = true;
                                if (this.v0 != 1) {
                                    this.f70913t0.get().request(j11);
                                }
                            } else {
                                z10 = true;
                            }
                            if (jMin == 0 || z11) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    bVarArr = atomicReference.get();
                }
            }
        }

        public final void c(b<T> bVar) {
            b<T>[] bVarArr;
            while (true) {
                AtomicReference<b<T>[]> atomicReference = this.f70911r0;
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
                    } else if (bVarArr2[i10].equals(bVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr = f70907x0;
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            AtomicReference<c<T>> atomicReference;
            AtomicReference<b<T>[]> atomicReference2 = this.f70911r0;
            b<T>[] bVarArr = atomicReference2.get();
            b<T>[] bVarArr2 = f70908y0;
            if (bVarArr == bVarArr2 || atomicReference2.getAndSet(bVarArr2) == bVarArr2) {
                return;
            }
            do {
                atomicReference = this.f70909p0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            SubscriptionHelper.cancel(this.f70913t0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70911r0.get() == f70908y0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70914u0 == null) {
                this.f70914u0 = NotificationLite.complete();
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70914u0 != null) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70914u0 = NotificationLite.error(th2);
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 0 || this.f70915w0.offer(t10)) {
                b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f70913t0, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f70915w0 = queueSubscription;
                        this.f70914u0 = NotificationLite.complete();
                        b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f70915w0 = queueSubscription;
                        subscription.request(this.f70910q0);
                        return;
                    }
                }
                this.f70915w0 = new SpscArrayQueue(this.f70910q0);
                subscription.request(this.f70910q0);
            }
        }
    }

    public FlowablePublish(a aVar, Flowable flowable, AtomicReference atomicReference, int i10) {
        this.f70901t0 = aVar;
        this.f70898q0 = flowable;
        this.f70899r0 = atomicReference;
        this.f70900s0 = i10;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new a(atomicReference, i10), flowable, atomicReference, i10));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        c<T> cVar;
        loop0: while (true) {
            AtomicReference<c<T>> atomicReference = this.f70899r0;
            cVar = atomicReference.get();
            if (cVar != null && !cVar.isDisposed()) {
                break;
            }
            c<T> cVar2 = new c<>(atomicReference, this.f70900s0);
            do {
                if (atomicReference.compareAndSet(cVar, cVar2)) {
                    cVar = cVar2;
                    break loop0;
                }
            } while (atomicReference.get() == cVar);
        }
        AtomicBoolean atomicBoolean = cVar.f70912s0;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            consumer.accept(cVar);
            if (z10) {
                this.f70898q0.subscribe((FlowableSubscriber) cVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public int publishBufferSize() {
        return this.f70900s0;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public Publisher<T> publishSource() {
        return this.f70898q0;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f70898q0;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f70901t0.subscribe(subscriber);
    }
}
