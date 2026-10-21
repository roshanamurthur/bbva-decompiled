package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSubscribeOn<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f71192q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71193r0;

    public static final class a<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71194p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler.Worker f71195q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71196r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71197s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f71198t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Publisher<T> f71199u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$a$a, reason: collision with other inner class name */
        public static final class RunnableC0313a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Subscription f71200p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final long f71201q0;

            public RunnableC0313a(long j10, Subscription subscription) {
                this.f71200p0 = subscription;
                this.f71201q0 = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f71200p0.request(this.f71201q0);
            }
        }

        public a(Subscriber subscriber, Scheduler.Worker worker, Flowable flowable, boolean z10) {
            this.f71194p0 = subscriber;
            this.f71195q0 = worker;
            this.f71199u0 = flowable;
            this.f71198t0 = !z10;
        }

        public final void a(long j10, Subscription subscription) {
            if (this.f71198t0 || Thread.currentThread() == get()) {
                subscription.request(j10);
            } else {
                this.f71195q0.schedule(new RunnableC0313a(j10, subscription));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71196r0);
            this.f71195q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71194p0.onComplete();
            this.f71195q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71194p0.onError(th2);
            this.f71195q0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71194p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f71196r0, subscription)) {
                long andSet = this.f71197s0.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, subscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                AtomicReference<Subscription> atomicReference = this.f71196r0;
                Subscription subscription = atomicReference.get();
                if (subscription != null) {
                    a(j10, subscription);
                    return;
                }
                AtomicLong atomicLong = this.f71197s0;
                BackpressureHelper.add(atomicLong, j10);
                Subscription subscription2 = atomicReference.get();
                if (subscription2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, subscription2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            Publisher<T> publisher = this.f71199u0;
            this.f71199u0 = null;
            publisher.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.f71192q0 = scheduler;
        this.f71193r0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.f71192q0.createWorker();
        a aVar = new a(subscriber, workerCreateWorker, this.source, this.f71193r0);
        subscriber.onSubscribe(aVar);
        workerCreateWorker.schedule(aVar);
    }
}
