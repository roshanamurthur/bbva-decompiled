package io.reactivex.internal.operators.flowable;

import a.e;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapSingle<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f70623q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70624r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f70625s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f70626p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f70627q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70628r0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f70632w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f70634y0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f70629s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f70630t0 = new CompositeDisposable();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f70631u0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<SpscLinkedArrayQueue<R>> f70633x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C0308a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public C0308a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f70630t0;
                compositeDisposable.delete(this);
                if (!aVar.v0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (!aVar.f70627q0) {
                    aVar.f70634y0.cancel();
                    compositeDisposable.dispose();
                } else if (aVar.f70628r0 != Integer.MAX_VALUE) {
                    aVar.f70634y0.request(1L);
                }
                aVar.f70631u0.decrementAndGet();
                if (aVar.getAndIncrement() == 0) {
                    aVar.b();
                }
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x007c  */
            /* JADX WARN: Code duplicated, block: B:45:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueueC;
                a aVar = a.this;
                aVar.f70630t0.delete(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z10 = aVar.f70631u0.decrementAndGet() == 0;
                        if (aVar.f70629s0.get() != 0) {
                            aVar.f70626p0.onNext(r3);
                            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = aVar.f70633x0.get();
                            if (z10 && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                Throwable thTerminate = aVar.v0.terminate();
                                if (thTerminate != null) {
                                    aVar.f70626p0.onError(thTerminate);
                                    return;
                                } else {
                                    aVar.f70626p0.onComplete();
                                    return;
                                }
                            }
                            BackpressureHelper.produced(aVar.f70629s0, 1L);
                            if (aVar.f70628r0 != Integer.MAX_VALUE) {
                                aVar.f70634y0.request(1L);
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
                        aVar.f70631u0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    spscLinkedArrayQueueC = aVar.c();
                    synchronized (spscLinkedArrayQueueC) {
                        spscLinkedArrayQueueC.offer(r3);
                        aVar.f70631u0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                aVar.b();
            }
        }

        public a(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f70626p0 = subscriber;
            this.f70632w0 = function;
            this.f70627q0 = z10;
            this.f70628r0 = i10;
        }

        public final void a() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.f70633x0.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public final void b() {
            Subscriber<? super R> subscriber = this.f70626p0;
            AtomicInteger atomicInteger = this.f70631u0;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f70633x0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f70629s0.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.E0) {
                        a();
                        return;
                    }
                    if (!this.f70627q0 && this.v0.get() != null) {
                        Throwable thTerminate = this.v0.terminate();
                        a();
                        subscriber.onError(thTerminate);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                    e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z11 = eVarPoll == null;
                    if (z10 && z11) {
                        Throwable thTerminate2 = this.v0.terminate();
                        if (thTerminate2 != null) {
                            subscriber.onError(thTerminate2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(eVarPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.E0) {
                        a();
                        return;
                    }
                    if (!this.f70627q0 && this.v0.get() != null) {
                        Throwable thTerminate3 = this.v0.terminate();
                        a();
                        subscriber.onError(thTerminate3);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                    boolean z13 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z12 && z13) {
                        Throwable thTerminate4 = this.v0.terminate();
                        if (thTerminate4 != null) {
                            subscriber.onError(thTerminate4);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f70629s0, j11);
                    if (this.f70628r0 != Integer.MAX_VALUE) {
                        this.f70634y0.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final SpscLinkedArrayQueue<R> c() {
            while (true) {
                AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f70633x0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                if (spscLinkedArrayQueue != null) {
                    return spscLinkedArrayQueue;
                }
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
                while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                    if (atomicReference.get() != null) {
                    }
                }
                return spscLinkedArrayQueue2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.E0 = true;
            this.f70634y0.cancel();
            this.f70630t0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70631u0.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70631u0.decrementAndGet();
            if (!this.v0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f70627q0) {
                this.f70630t0.dispose();
            }
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f70632w0.apply(t10), "The mapper returned a null SingleSource");
                this.f70631u0.getAndIncrement();
                C0308a c0308a = new C0308a();
                if (this.E0 || !this.f70630t0.add(c0308a)) {
                    return;
                }
                singleSource.subscribe(c0308a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70634y0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70634y0, subscription)) {
                this.f70634y0 = subscription;
                this.f70626p0.onSubscribe(this);
                int i10 = this.f70628r0;
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
                BackpressureHelper.add(this.f70629s0, j10);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        super(flowable);
        this.f70623q0 = function;
        this.f70624r0 = z10;
        this.f70625s0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f70625s0, this.f70623q0, subscriber, this.f70624r0));
    }
}
