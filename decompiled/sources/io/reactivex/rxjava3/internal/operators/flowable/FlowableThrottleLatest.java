package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableThrottleLatest<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75538q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f75539r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f75540s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f75541t0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public volatile boolean E0;
        public volatile boolean F0;
        public long G0;
        public boolean H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75542p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75543q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75544r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f75545s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f75546t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<T> f75547u0 = new AtomicReference<>();
        public final AtomicLong v0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f75548w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f75549x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f75550y0;

        public a(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f75542p0 = subscriber;
            this.f75543q0 = j10;
            this.f75544r0 = timeUnit;
            this.f75545s0 = worker;
            this.f75546t0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f75547u0;
            AtomicLong atomicLong = this.v0;
            Subscriber<? super T> subscriber = this.f75542p0;
            int iAddAndGet = 1;
            while (!this.E0) {
                boolean z10 = this.f75549x0;
                if (z10 && this.f75550y0 != null) {
                    atomicReference.lazySet(null);
                    subscriber.onError(this.f75550y0);
                    this.f75545s0.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    if (z11 || !this.f75546t0) {
                        atomicReference.lazySet(null);
                        subscriber.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j10 = this.G0;
                        if (j10 != atomicLong.get()) {
                            this.G0 = j10 + 1;
                            subscriber.onNext(andSet);
                            subscriber.onComplete();
                        } else {
                            subscriber.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.f75545s0.dispose();
                    return;
                }
                if (z11) {
                    if (this.F0) {
                        this.H0 = false;
                        this.F0 = false;
                    }
                } else if (!this.H0 || this.F0) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j11 = this.G0;
                    if (j11 == atomicLong.get()) {
                        this.f75548w0.cancel();
                        subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.f75545s0.dispose();
                        return;
                    } else {
                        subscriber.onNext(andSet2);
                        this.G0 = j11 + 1;
                        this.F0 = false;
                        this.H0 = true;
                        this.f75545s0.schedule(this, this.f75543q0, this.f75544r0);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.E0 = true;
            this.f75548w0.cancel();
            this.f75545s0.dispose();
            if (getAndIncrement() == 0) {
                this.f75547u0.lazySet(null);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75549x0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75550y0 = th2;
            this.f75549x0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75547u0.set(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75548w0, subscription)) {
                this.f75548w0 = subscription;
                this.f75542p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.v0, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.F0 = true;
            a();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.f75538q0 = j10;
        this.f75539r0 = timeUnit;
        this.f75540s0 = scheduler;
        this.f75541t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75538q0, this.f75539r0, this.f75540s0.createWorker(), this.f75541t0));
    }
}
