package io.reactivex.rxjava3.internal.operators.flowable;

import a.e;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMergeWithSingle<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f75100q0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public volatile int F0;
        public long G0;
        public int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75101p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75102q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0375a<T> f75103r0 = new C0375a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f75104s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f75105t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f75106u0;
        public final int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile SpscArrayQueue f75107w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public T f75108x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f75109y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableMergeWithSingle$a$a, reason: collision with other inner class name */
        public static final class C0375a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T> f75110p0;

            public C0375a(a<T> aVar) {
                this.f75110p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<T> aVar = this.f75110p0;
                if (aVar.f75104s0.tryAddThrowableOrReport(th2)) {
                    SubscriptionHelper.cancel(aVar.f75102q0);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                a<T> aVar = this.f75110p0;
                if (aVar.compareAndSet(0, 1)) {
                    long j10 = aVar.G0;
                    if (aVar.f75105t0.get() != j10) {
                        aVar.G0 = j10 + 1;
                        aVar.f75101p0.onNext(t10);
                        aVar.F0 = 2;
                    } else {
                        aVar.f75108x0 = t10;
                        aVar.F0 = 1;
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    aVar.f75108x0 = t10;
                    aVar.F0 = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(Subscriber<? super T> subscriber) {
            this.f75101p0 = subscriber;
            int iBufferSize = Flowable.bufferSize();
            this.f75106u0 = iBufferSize;
            this.v0 = iBufferSize - (iBufferSize >> 2);
        }

        public final void a() {
            Subscriber<? super T> subscriber = this.f75101p0;
            long j10 = this.G0;
            int i10 = this.H0;
            int i11 = this.v0;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f75105t0.get();
                while (j10 != j11) {
                    if (this.f75109y0) {
                        this.f75108x0 = null;
                        this.f75107w0 = null;
                        return;
                    }
                    if (this.f75104s0.get() != null) {
                        this.f75108x0 = null;
                        this.f75107w0 = null;
                        this.f75104s0.tryTerminateConsumer(this.f75101p0);
                        return;
                    }
                    int i13 = this.F0;
                    if (i13 == i12) {
                        T t10 = this.f75108x0;
                        this.f75108x0 = null;
                        this.F0 = 2;
                        subscriber.onNext(t10);
                        j10++;
                    } else {
                        boolean z10 = this.E0;
                        SpscArrayQueue spscArrayQueue = this.f75107w0;
                        e eVar = spscArrayQueue != null ? (Object) spscArrayQueue.poll() : null;
                        boolean z11 = eVar == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f75107w0 = null;
                            subscriber.onComplete();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            subscriber.onNext(eVar);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                this.f75102q0.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f75109y0) {
                        this.f75108x0 = null;
                        this.f75107w0 = null;
                        return;
                    }
                    if (this.f75104s0.get() != null) {
                        this.f75108x0 = null;
                        this.f75107w0 = null;
                        this.f75104s0.tryTerminateConsumer(this.f75101p0);
                        return;
                    }
                    boolean z12 = this.E0;
                    SpscArrayQueue spscArrayQueue2 = this.f75107w0;
                    boolean z13 = spscArrayQueue2 == null || spscArrayQueue2.isEmpty();
                    if (z12 && z13 && this.F0 == 2) {
                        this.f75107w0 = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.G0 = j10;
                this.H0 = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75109y0 = true;
            SubscriptionHelper.cancel(this.f75102q0);
            DisposableHelper.dispose(this.f75103r0);
            this.f75104s0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f75107w0 = null;
                this.f75108x0 = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.E0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75104s0.tryAddThrowableOrReport(th2)) {
                DisposableHelper.dispose(this.f75103r0);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.G0;
                if (this.f75105t0.get() != j10) {
                    SpscArrayQueue spscArrayQueue = this.f75107w0;
                    if (spscArrayQueue == null || spscArrayQueue.isEmpty()) {
                        this.G0 = j10 + 1;
                        this.f75101p0.onNext(t10);
                        int i10 = this.H0 + 1;
                        if (i10 == this.v0) {
                            this.H0 = 0;
                            this.f75102q0.get().request(i10);
                        } else {
                            this.H0 = i10;
                        }
                    } else {
                        spscArrayQueue.offer(t10);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue2 = this.f75107w0;
                    if (spscArrayQueue2 == null) {
                        spscArrayQueue2 = new SpscArrayQueue(Flowable.bufferSize());
                        this.f75107w0 = spscArrayQueue2;
                    }
                    spscArrayQueue2.offer(t10);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue3 = this.f75107w0;
                if (spscArrayQueue3 == null) {
                    spscArrayQueue3 = new SpscArrayQueue(Flowable.bufferSize());
                    this.f75107w0 = spscArrayQueue3;
                }
                spscArrayQueue3.offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this.f75102q0, subscription, this.f75106u0);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f75105t0, j10);
            if (getAndIncrement() == 0) {
                a();
            }
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.f75100q0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
        this.f75100q0.subscribe(aVar.f75103r0);
    }
}
