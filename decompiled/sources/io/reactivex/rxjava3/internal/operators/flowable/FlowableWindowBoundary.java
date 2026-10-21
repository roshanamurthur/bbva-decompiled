package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f75640q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75641r0;

    public static final class a<T, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, B> f75642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f75643r0;

        public a(b<T, B> bVar) {
            this.f75642q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75643r0) {
                return;
            }
            this.f75643r0 = true;
            b<T, B> bVar = this.f75642q0;
            SubscriptionHelper.cancel(bVar.f75647s0);
            bVar.f75652y0 = true;
            bVar.a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75643r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75643r0 = true;
            b<T, B> bVar = this.f75642q0;
            SubscriptionHelper.cancel(bVar.f75647s0);
            if (bVar.v0.tryAddThrowableOrReport(th2)) {
                bVar.f75652y0 = true;
                bVar.a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            if (this.f75643r0) {
                return;
            }
            Object obj = b.G0;
            b<T, B> bVar = this.f75642q0;
            bVar.f75649u0.offer(obj);
            bVar.a();
        }
    }

    public static final class b<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final Object G0 = new Object();
        public UnicastProcessor<T> E0;
        public long F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f75644p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75645q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, B> f75646r0 = new a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75647s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f75648t0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final MpscLinkedQueue<Object> f75649u0 = new MpscLinkedQueue<>();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f75650w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f75651x0 = new AtomicLong();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f75652y0;

        public b(Subscriber<? super Flowable<T>> subscriber, int i10) {
            this.f75644p0 = subscriber;
            this.f75645q0 = i10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f75644p0;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f75649u0;
            AtomicThrowable atomicThrowable = this.v0;
            long j10 = this.F0;
            int iAddAndGet = 1;
            while (this.f75648t0.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.E0;
                boolean z10 = this.f75652y0;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.E0 = null;
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
                            this.E0 = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.E0 = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    subscriber.onError(thTerminate2);
                    return;
                }
                if (z11) {
                    this.F0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != G0) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.E0 = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.f75650w0.get()) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f75645q0, this);
                        this.E0 = unicastProcessorCreate;
                        this.f75648t0.getAndIncrement();
                        if (j10 != this.f75651x0.get()) {
                            j10++;
                            io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
                            subscriber.onNext(bVar);
                            if (bVar.e()) {
                                unicastProcessorCreate.onComplete();
                            }
                        } else {
                            SubscriptionHelper.cancel(this.f75647s0);
                            this.f75646r0.dispose();
                            atomicThrowable.tryAddThrowableOrReport(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f75652y0 = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.E0 = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75650w0.compareAndSet(false, true)) {
                this.f75646r0.dispose();
                if (this.f75648t0.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.f75647s0);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75646r0.dispose();
            this.f75652y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75646r0.dispose();
            if (this.v0.tryAddThrowableOrReport(th2)) {
                this.f75652y0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75649u0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this.f75647s0, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f75651x0, j10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f75648t0.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.f75647s0);
            }
        }
    }

    public FlowableWindowBoundary(Flowable<T> flowable, Publisher<B> publisher, int i10) {
        super(flowable);
        this.f75640q0 = publisher;
        this.f75641r0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        b bVar = new b(subscriber, this.f75641r0);
        subscriber.onSubscribe(bVar);
        bVar.f75649u0.offer(b.G0);
        bVar.a();
        this.f75640q0.subscribe(bVar.f75646r0);
        this.source.subscribe((FlowableSubscriber) bVar);
    }
}
