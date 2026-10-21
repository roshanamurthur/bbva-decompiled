package io.reactivex.rxjava3.internal.operators.flowable;

import a.e;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapSingle<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f74889q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74890r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74891s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74892p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f74893q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74894r0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f74898w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f74900y0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f74895s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f74896t0 = new CompositeDisposable();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f74897u0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<SpscLinkedArrayQueue<R>> f74899x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C0372a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public C0372a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f74896t0;
                compositeDisposable.delete(this);
                if (aVar.v0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f74893q0) {
                        aVar.f74900y0.cancel();
                        compositeDisposable.dispose();
                    } else if (aVar.f74894r0 != Integer.MAX_VALUE) {
                        aVar.f74900y0.request(1L);
                    }
                    aVar.f74897u0.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.b();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0070  */
            /* JADX WARN: Code duplicated, block: B:42:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueueC;
                a aVar = a.this;
                aVar.f74896t0.delete(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z10 = aVar.f74897u0.decrementAndGet() == 0;
                        if (aVar.f74895s0.get() != 0) {
                            aVar.f74892p0.onNext(r3);
                            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = aVar.f74899x0.get();
                            if (z10 && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                aVar.v0.tryTerminateConsumer(aVar.f74892p0);
                                return;
                            } else {
                                BackpressureHelper.produced(aVar.f74895s0, 1L);
                                if (aVar.f74894r0 != Integer.MAX_VALUE) {
                                    aVar.f74900y0.request(1L);
                                }
                            }
                        } else {
                            SpscLinkedArrayQueue<R> spscLinkedArrayQueueC2 = aVar.c();
                            synchronized (spscLinkedArrayQueueC2) {
                                spscLinkedArrayQueueC2.offer(r3);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        spscLinkedArrayQueueC = aVar.c();
                        synchronized (spscLinkedArrayQueueC) {
                            spscLinkedArrayQueueC.offer(r3);
                        }
                        aVar.f74897u0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    spscLinkedArrayQueueC = aVar.c();
                    synchronized (spscLinkedArrayQueueC) {
                        spscLinkedArrayQueueC.offer(r3);
                        aVar.f74897u0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                aVar.b();
            }
        }

        public a(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f74892p0 = subscriber;
            this.f74898w0 = function;
            this.f74893q0 = z10;
            this.f74894r0 = i10;
        }

        public final void a() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.f74899x0.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public final void b() {
            Subscriber<? super R> subscriber = this.f74892p0;
            AtomicInteger atomicInteger = this.f74897u0;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f74899x0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f74895s0.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.E0) {
                        a();
                        return;
                    }
                    if (!this.f74893q0 && this.v0.get() != null) {
                        a();
                        this.v0.tryTerminateConsumer(this.f74892p0);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                    e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z11 = eVarPoll == null;
                    if (z10 && z11) {
                        this.v0.tryTerminateConsumer(subscriber);
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        subscriber.onNext(eVarPoll);
                        j11++;
                    }
                }
                if (j11 == j10) {
                    if (this.E0) {
                        a();
                        return;
                    }
                    if (!this.f74893q0 && this.v0.get() != null) {
                        a();
                        this.v0.tryTerminateConsumer(subscriber);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                    boolean z13 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z12 && z13) {
                        this.v0.tryTerminateConsumer(subscriber);
                        return;
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f74895s0, j11);
                    if (this.f74894r0 != Integer.MAX_VALUE) {
                        this.f74900y0.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final SpscLinkedArrayQueue<R> c() {
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f74899x0;
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
            if (spscLinkedArrayQueue != null) {
                return spscLinkedArrayQueue;
            }
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
            }
            return spscLinkedArrayQueue2;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.E0 = true;
            this.f74900y0.cancel();
            this.f74896t0.dispose();
            this.v0.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74897u0.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74897u0.decrementAndGet();
            if (this.v0.tryAddThrowableOrReport(th2)) {
                if (!this.f74893q0) {
                    this.f74896t0.dispose();
                }
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                SingleSource<? extends R> singleSourceApply = this.f74898w0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                this.f74897u0.getAndIncrement();
                C0372a c0372a = new C0372a();
                if (this.E0 || !this.f74896t0.add(c0372a)) {
                    return;
                }
                singleSource.subscribe(c0372a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74900y0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74900y0, subscription)) {
                this.f74900y0 = subscription;
                this.f74892p0.onSubscribe(this);
                int i10 = this.f74894r0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f74895s0, j10);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        super(flowable);
        this.f74889q0 = function;
        this.f74890r0 = z10;
        this.f74891s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f74891s0, this.f74889q0, subscriber, this.f74890r0));
    }
}
