package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSampleTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71083q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71084r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f71085s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f71086t0;

    public static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicInteger f71087w0;

        public a(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedSubscriber, j10, timeUnit, scheduler);
            this.f71087w0 = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.c
        public final void a() {
            b();
            if (this.f71087w0.decrementAndGet() == 0) {
                this.f71088p0.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.c, java.lang.Runnable
        public final void run() {
            AtomicInteger atomicInteger = this.f71087w0;
            if (atomicInteger.incrementAndGet() == 2) {
                b();
                if (atomicInteger.decrementAndGet() == 0) {
                    this.f71088p0.onComplete();
                }
            }
        }
    }

    public static final class b<T> extends c<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.c
        public final void a() {
            this.f71088p0.onComplete();
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71088p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71089q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71090r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f71091s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f71092t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SequentialDisposable f71093u0 = new SequentialDisposable();
        public Subscription v0;

        public c(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f71088p0 = serializedSubscriber;
            this.f71089q0 = j10;
            this.f71090r0 = timeUnit;
            this.f71091s0 = scheduler;
        }

        public abstract void a();

        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f71092t0;
                long j10 = atomicLong.get();
                Subscriber<? super T> subscriber = this.f71088p0;
                if (j10 != 0) {
                    subscriber.onNext(andSet);
                    BackpressureHelper.produced(atomicLong, 1L);
                } else {
                    cancel();
                    subscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.dispose(this.f71093u0);
            this.v0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.dispose(this.f71093u0);
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f71093u0);
            this.f71088p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f71088p0.onSubscribe(this);
                Scheduler scheduler = this.f71091s0;
                long j10 = this.f71089q0;
                this.f71093u0.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f71090r0));
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71092t0, j10);
            }
        }

        public void run() {
            b();
        }
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.f71083q0 = j10;
        this.f71084r0 = timeUnit;
        this.f71085s0 = scheduler;
        this.f71086t0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.f71086t0) {
            this.source.subscribe((FlowableSubscriber) new a(serializedSubscriber, this.f71083q0, this.f71084r0, this.f71085s0));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(serializedSubscriber, this.f71083q0, this.f71084r0, this.f71085s0));
        }
    }
}
