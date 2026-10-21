package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f71384q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f71385r0;

    public static final class a<T, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, B> f71386q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f71387r0;

        public a(b<T, B> bVar) {
            this.f71386q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71387r0) {
                return;
            }
            this.f71387r0 = true;
            b<T, B> bVar = this.f71386q0;
            SubscriptionHelper.cancel(bVar.f71391s0);
            bVar.f71396y0 = true;
            bVar.a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71387r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71387r0 = true;
            b<T, B> bVar = this.f71386q0;
            SubscriptionHelper.cancel(bVar.f71391s0);
            if (!bVar.v0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                bVar.f71396y0 = true;
                bVar.a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            if (this.f71387r0) {
                return;
            }
            Object obj = b.G0;
            b<T, B> bVar = this.f71386q0;
            bVar.f71393u0.offer(obj);
            bVar.a();
        }
    }

    public static final class b<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final Object G0 = new Object();
        public UnicastProcessor<T> E0;
        public long F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f71388p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71389q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, B> f71390r0 = new a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71391s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f71392t0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final MpscLinkedQueue<Object> f71393u0 = new MpscLinkedQueue<>();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f71394w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f71395x0 = new AtomicLong();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71396y0;

        public b(Subscriber<? super Flowable<T>> subscriber, int i10) {
            this.f71388p0 = subscriber;
            this.f71389q0 = i10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f71388p0;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f71393u0;
            AtomicThrowable atomicThrowable = this.v0;
            long j10 = this.F0;
            int iAddAndGet = 1;
            while (this.f71392t0.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.E0;
                boolean z10 = this.f71396y0;
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
                    if (!this.f71394w0.get()) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f71389q0, this);
                        this.E0 = unicastProcessorCreate;
                        this.f71392t0.getAndIncrement();
                        if (j10 != this.f71395x0.get()) {
                            j10++;
                            subscriber.onNext(unicastProcessorCreate);
                        } else {
                            SubscriptionHelper.cancel(this.f71391s0);
                            this.f71390r0.dispose();
                            atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f71396y0 = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.E0 = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f71394w0.compareAndSet(false, true)) {
                this.f71390r0.dispose();
                if (this.f71392t0.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.f71391s0);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71390r0.dispose();
            this.f71396y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71390r0.dispose();
            if (!this.v0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71396y0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71393u0.offer(t10);
            a();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this.f71391s0, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71395x0, j10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f71392t0.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.f71391s0);
            }
        }
    }

    public FlowableWindowBoundary(Flowable<T> flowable, Publisher<B> publisher, int i10) {
        super(flowable);
        this.f71384q0 = publisher;
        this.f71385r0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        b bVar = new b(subscriber, this.f71385r0);
        subscriber.onSubscribe(bVar);
        bVar.f71393u0.offer(b.G0);
        bVar.a();
        this.f71384q0.subscribe(bVar.f71390r0);
        this.source.subscribe((FlowableSubscriber) bVar);
    }
}
