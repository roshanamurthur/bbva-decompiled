package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<? extends T> f77511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77513c;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public volatile boolean E0;
        public final AtomicInteger F0 = new AtomicInteger();
        public int G0;
        public int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T>[] f77514p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLongArray f77515q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long[] f77516r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f77517s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f77518t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f77519u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Throwable f77520w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f77521x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f77522y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.parallel.ParallelFromPublisher$a$a, reason: collision with other inner class name */
        public final class C0420a implements Subscription {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final int f77523p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final int f77524q0;

            public C0420a(int i10, int i11) {
                this.f77523p0 = i10;
                this.f77524q0 = i11;
            }

            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                if (a.this.f77515q0.compareAndSet(this.f77523p0 + this.f77524q0, 0L, 1L)) {
                    a aVar = a.this;
                    int i10 = this.f77524q0;
                    if (aVar.f77515q0.decrementAndGet(i10 + i10) == 0) {
                        aVar.E0 = true;
                        aVar.f77519u0.cancel();
                        if (aVar.getAndIncrement() == 0) {
                            aVar.v0.clear();
                        }
                    }
                }
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j10) {
                long j11;
                if (SubscriptionHelper.validate(j10)) {
                    a aVar = a.this;
                    AtomicLongArray atomicLongArray = aVar.f77515q0;
                    do {
                        j11 = atomicLongArray.get(this.f77523p0);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f77523p0, j11, BackpressureHelper.addCap(j11, j10)));
                    if (aVar.F0.get() == this.f77524q0) {
                        aVar.a();
                    }
                }
            }
        }

        public a(Subscriber<? super T>[] subscriberArr, int i10) {
            this.f77514p0 = subscriberArr;
            this.f77517s0 = i10;
            this.f77518t0 = i10 - (i10 >> 2);
            int length = subscriberArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.f77515q0 = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.f77516r0 = new long[length];
        }

        public final void a() {
            boolean z10;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            long j10 = 1;
            if (this.H0 == 1) {
                SimpleQueue<T> simpleQueue = this.v0;
                Subscriber<? super T>[] subscriberArr = this.f77514p0;
                AtomicLongArray atomicLongArray = this.f77515q0;
                long[] jArr = this.f77516r0;
                int length = jArr.length;
                int i10 = this.f77522y0;
                int iAddAndGet = 1;
                while (true) {
                    int i11 = 0;
                    do {
                        if (this.E0) {
                            simpleQueue.clear();
                            return;
                        }
                        if (simpleQueue.isEmpty()) {
                            for (Subscriber<? super T> subscriber : subscriberArr) {
                                subscriber.onComplete();
                            }
                            return;
                        }
                        long j11 = atomicLongArray.get(i10);
                        long j12 = jArr[i10];
                        if (j11 == j12 || atomicLongArray.get(length + i10) != 0) {
                            i11++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll == null) {
                                    for (Subscriber<? super T> subscriber2 : subscriberArr) {
                                        subscriber2.onComplete();
                                    }
                                    return;
                                }
                                subscriberArr[i10].onNext(tPoll);
                                jArr[i10] = j12 + 1;
                                i11 = 0;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.f77519u0.cancel();
                                for (Subscriber<? super T> subscriber3 : subscriberArr) {
                                    subscriber3.onError(th3);
                                }
                                return;
                            }
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                    } while (i11 != length);
                    int i12 = get();
                    if (i12 == iAddAndGet) {
                        this.f77522y0 = i10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i12;
                    }
                }
            } else {
                SimpleQueue<T> simpleQueue2 = this.v0;
                Subscriber<? super T>[] subscriberArr2 = this.f77514p0;
                AtomicLongArray atomicLongArray2 = this.f77515q0;
                long[] jArr2 = this.f77516r0;
                int length2 = jArr2.length;
                int i13 = this.f77522y0;
                int i14 = this.G0;
                int i15 = 1;
                while (true) {
                    int i16 = 0;
                    while (true) {
                        if (this.E0) {
                            simpleQueue2.clear();
                            return;
                        }
                        boolean z11 = this.f77521x0;
                        if (z11 && (th2 = this.f77520w0) != null) {
                            simpleQueue2.clear();
                            for (Subscriber<? super T> subscriber4 : subscriberArr2) {
                                subscriber4.onError(th2);
                            }
                            return;
                        }
                        boolean zIsEmpty = simpleQueue2.isEmpty();
                        if (!z11 || !zIsEmpty) {
                            if (!zIsEmpty) {
                                long j13 = atomicLongArray2.get(i13);
                                long j14 = jArr2[i13];
                                if (j13 == j14 || atomicLongArray2.get(length2 + i13) != 0) {
                                    z10 = true;
                                    i16++;
                                } else {
                                    try {
                                        T tPoll2 = simpleQueue2.poll();
                                        if (tPoll2 != null) {
                                            subscriberArr2[i13].onNext(tPoll2);
                                            jArr2[i13] = j14 + j10;
                                            i14++;
                                            if (i14 == this.f77518t0) {
                                                this.f77519u0.request(i14);
                                                i14 = 0;
                                            }
                                            z10 = true;
                                            i16 = 0;
                                        }
                                    } catch (Throwable th4) {
                                        Exceptions.throwIfFatal(th4);
                                        this.f77519u0.cancel();
                                        for (Subscriber<? super T> subscriber5 : subscriberArr2) {
                                            subscriber5.onError(th4);
                                        }
                                        return;
                                    }
                                }
                                i13++;
                                if (i13 == length2) {
                                    i13 = 0;
                                }
                                if (i16 == length2) {
                                    break;
                                } else {
                                    j10 = 1;
                                }
                            }
                            z10 = true;
                            break;
                        }
                        for (Subscriber<? super T> subscriber6 : subscriberArr2) {
                            subscriber6.onComplete();
                        }
                        return;
                    }
                    int iAddAndGet2 = get();
                    if (iAddAndGet2 == i15) {
                        this.f77522y0 = i13;
                        this.G0 = i14;
                        iAddAndGet2 = addAndGet(-i15);
                        if (iAddAndGet2 == 0) {
                            return;
                        }
                    }
                    i15 = iAddAndGet2;
                    j10 = 1;
                }
            }
        }

        public final void b() {
            Subscriber<? super T>[] subscriberArr = this.f77514p0;
            int length = subscriberArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                this.F0.lazySet(i11);
                subscriberArr[i10].onSubscribe(new C0420a(i10, length));
                i10 = i11;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f77521x0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f77520w0 = th2;
            this.f77521x0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.H0 != 0 || this.v0.offer(t10)) {
                a();
            } else {
                this.f77519u0.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f77519u0, subscription)) {
                this.f77519u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.H0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        this.f77521x0 = true;
                        b();
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.H0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        b();
                        subscription.request(this.f77517s0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f77517s0);
                b();
                subscription.request(this.f77517s0);
            }
        }
    }

    public ParallelFromPublisher(Publisher<? extends T> publisher, int i10, int i11) {
        this.f77511a = publisher;
        this.f77512b = i10;
        this.f77513c = i11;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f77512b;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            this.f77511a.subscribe(new a(subscriberArr, this.f77513c));
        }
    }
}
