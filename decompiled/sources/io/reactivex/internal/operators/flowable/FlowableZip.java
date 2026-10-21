package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T>[] f71481q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f71482r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f71483s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f71484t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f71485u0;

    public static final class a<T, R> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71486p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, R>[] f71487q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f71488r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71489s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71490t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f71491u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Object[] f71492w0;

        public a(Subscriber subscriber, Function function, boolean z10, int i10, int i11) {
            this.f71486p0 = subscriber;
            this.f71488r0 = function;
            this.f71491u0 = z10;
            b<T, R>[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b<>(this, i11);
            }
            this.f71492w0 = new Object[i10];
            this.f71487q0 = bVarArr;
            this.f71489s0 = new AtomicLong();
            this.f71490t0 = new AtomicThrowable();
        }

        public final void a() {
            for (b<T, R> bVar : this.f71487q0) {
                bVar.getClass();
                SubscriptionHelper.cancel(bVar);
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71486p0;
            b<T, R>[] bVarArr = this.f71487q0;
            int length = bVarArr.length;
            Object[] objArr = this.f71492w0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f71489s0.get();
                long j11 = 0;
                while (j10 != j11) {
                    if (this.v0) {
                        return;
                    }
                    if (!this.f71491u0 && this.f71490t0.get() != null) {
                        a();
                        subscriber.onError(this.f71490t0.terminate());
                        return;
                    }
                    boolean z10 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        b<T, R> bVar = bVarArr[i10];
                        if (objArr[i10] == null) {
                            try {
                                boolean z11 = bVar.f71498u0;
                                SimpleQueue<T> simpleQueue = bVar.f71496s0;
                                T tPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    a();
                                    if (this.f71490t0.get() != null) {
                                        subscriber.onError(this.f71490t0.terminate());
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (z12) {
                                    z10 = true;
                                } else {
                                    objArr[i10] = tPoll;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f71490t0.addThrowable(th2);
                                if (!this.f71491u0) {
                                    a();
                                    subscriber.onError(this.f71490t0.terminate());
                                    return;
                                }
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        subscriber.onNext((Object) ObjectHelper.requireNonNull(this.f71488r0.apply(objArr.clone()), "The zipper returned a null value"));
                        j11++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        a();
                        this.f71490t0.addThrowable(th3);
                        subscriber.onError(this.f71490t0.terminate());
                        return;
                    }
                }
                if (j10 == j11) {
                    if (this.v0) {
                        return;
                    }
                    if (!this.f71491u0 && this.f71490t0.get() != null) {
                        a();
                        subscriber.onError(this.f71490t0.terminate());
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        b<T, R> bVar2 = bVarArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                boolean z13 = bVar2.f71498u0;
                                SimpleQueue<T> simpleQueue2 = bVar2.f71496s0;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z14 = tPoll2 == null;
                                if (z13 && z14) {
                                    a();
                                    if (this.f71490t0.get() != null) {
                                        subscriber.onError(this.f71490t0.terminate());
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (!z14) {
                                    objArr[i11] = tPoll2;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                this.f71490t0.addThrowable(th4);
                                if (!this.f71491u0) {
                                    a();
                                    subscriber.onError(this.f71490t0.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j11 != 0) {
                    for (b<T, R> bVar3 : bVarArr) {
                        bVar3.request(j11);
                    }
                    if (j10 != Long.MAX_VALUE) {
                        this.f71489s0.addAndGet(-j11);
                    }
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
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71489s0, j10);
                b();
            }
        }
    }

    public static final class b<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, R> f71493p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71494q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71495r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SimpleQueue<T> f71496s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71497t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71498u0;
        public int v0;

        public b(a<T, R> aVar, int i10) {
            this.f71493p0 = aVar;
            this.f71494q0 = i10;
            this.f71495r0 = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71498u0 = true;
            this.f71493p0.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            a<T, R> aVar = this.f71493p0;
            if (!aVar.f71490t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71498u0 = true;
                aVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 2) {
                this.f71496s0.offer(t10);
            }
            this.f71493p0.b();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f71496s0 = queueSubscription;
                        this.f71498u0 = true;
                        this.f71493p0.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f71496s0 = queueSubscription;
                        subscription.request(this.f71494q0);
                        return;
                    }
                }
                this.f71496s0 = new SpscArrayQueue(this.f71494q0);
                subscription.request(this.f71494q0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (this.v0 != 1) {
                long j11 = this.f71497t0 + j10;
                if (j11 < this.f71495r0) {
                    this.f71497t0 = j11;
                } else {
                    this.f71497t0 = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public FlowableZip(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f71481q0 = publisherArr;
        this.f71482r0 = iterable;
        this.f71483s0 = function;
        this.f71484t0 = i10;
        this.f71485u0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<? extends T>[] publisherArr = this.f71481q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            length = 0;
            for (Publisher<? extends T> publisher : this.f71482r0) {
                if (length == publisherArr.length) {
                    Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                    System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        a aVar = new a(subscriber, this.f71483s0, this.f71485u0, i10, this.f71484t0);
        subscriber.onSubscribe(aVar);
        b<T, R>[] bVarArr = aVar.f71487q0;
        for (int i11 = 0; i11 < i10 && !aVar.v0; i11++) {
            if (!aVar.f71491u0 && aVar.f71490t0.get() != null) {
                return;
            }
            publisherArr[i11].subscribe(bVarArr[i11]);
        }
    }
}
