package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends Publisher<B>> f71413q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f71414r0;

    public static final class a<T, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, B> f71415q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f71416r0;

        public a(b<T, B> bVar) {
            this.f71415q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71416r0) {
                return;
            }
            this.f71416r0 = true;
            b<T, B> bVar = this.f71415q0;
            bVar.f71425y0.cancel();
            bVar.E0 = true;
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71416r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71416r0 = true;
            b<T, B> bVar = this.f71415q0;
            bVar.f71425y0.cancel();
            if (!bVar.f71422u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                bVar.E0 = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            if (this.f71416r0) {
                return;
            }
            this.f71416r0 = true;
            dispose();
            b<T, B> bVar = this.f71415q0;
            AtomicReference<a<T, B>> atomicReference = bVar.f71419r0;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            bVar.f71421t0.offer(b.I0);
            bVar.b();
        }
    }

    public static final class b<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final a<Object, Object> H0 = new a<>(null);
        public static final Object I0 = new Object();
        public volatile boolean E0;
        public UnicastProcessor<T> F0;
        public long G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f71417p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71418q0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Callable<? extends Publisher<B>> f71423w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f71425y0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<a<T, B>> f71419r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f71420s0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MpscLinkedQueue<Object> f71421t0 = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f71422u0 = new AtomicThrowable();
        public final AtomicBoolean v0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f71424x0 = new AtomicLong();

        public b(Subscriber<? super Flowable<T>> subscriber, int i10, Callable<? extends Publisher<B>> callable) {
            this.f71417p0 = subscriber;
            this.f71418q0 = i10;
            this.f71423w0 = callable;
        }

        public final void a() {
            AtomicReference<a<T, B>> atomicReference = this.f71419r0;
            a<Object, Object> aVar = H0;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f71417p0;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f71421t0;
            AtomicThrowable atomicThrowable = this.f71422u0;
            long j10 = this.G0;
            int iAddAndGet = 1;
            while (this.f71420s0.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.F0;
                boolean z10 = this.E0;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.F0 = null;
                        unicastProcessor.onError(thTerminate);
                    }
                    subscriber.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastProcessor != null) {
                            this.F0 = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.F0 = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    subscriber.onError(thTerminate2);
                    return;
                }
                if (z11) {
                    this.G0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != I0) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.F0 = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.v0.get()) {
                        if (j10 != this.f71424x0.get()) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f71418q0, this);
                            this.F0 = unicastProcessorCreate;
                            this.f71420s0.getAndIncrement();
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71423w0.call(), "The other Callable returned a null Publisher");
                                a<T, B> aVar = new a<>(this);
                                AtomicReference<a<T, B>> atomicReference = this.f71419r0;
                                do {
                                    if (atomicReference.compareAndSet(null, aVar)) {
                                        publisher.subscribe(aVar);
                                        j10++;
                                        subscriber.onNext(unicastProcessorCreate);
                                        break;
                                    }
                                } while (atomicReference.get() == null);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                atomicThrowable.addThrowable(th2);
                                this.E0 = true;
                            }
                        } else {
                            this.f71425y0.cancel();
                            a();
                            atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.E0 = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.F0 = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0.compareAndSet(false, true)) {
                a();
                if (this.f71420s0.decrementAndGet() == 0) {
                    this.f71425y0.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            a();
            this.E0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            a();
            if (!this.f71422u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.E0 = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71421t0.offer(t10);
            b();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71425y0, subscription)) {
                this.f71425y0 = subscription;
                this.f71417p0.onSubscribe(this);
                this.f71421t0.offer(I0);
                b();
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71424x0, j10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f71420s0.decrementAndGet() == 0) {
                this.f71425y0.cancel();
            }
        }
    }

    public FlowableWindowBoundarySupplier(Flowable<T> flowable, Callable<? extends Publisher<B>> callable, int i10) {
        super(flowable);
        this.f71413q0 = callable;
        this.f71414r0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(subscriber, this.f71414r0, this.f71413q0));
    }
}
