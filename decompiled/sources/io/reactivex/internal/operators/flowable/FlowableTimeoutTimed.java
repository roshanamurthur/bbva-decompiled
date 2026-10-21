package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71315q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71316r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f71317s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Publisher<? extends T> f71318t0;

    public static final class a<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71319p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SubscriptionArbiter f71320q0;

        public a(Subscriber<? super T> subscriber, SubscriptionArbiter subscriptionArbiter) {
            this.f71319p0 = subscriber;
            this.f71320q0 = subscriptionArbiter;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71319p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71319p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71319p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f71320q0.setSubscription(subscription);
        }
    }

    public static final class b<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, d {
        public final Scheduler.Worker E0;
        public final SequentialDisposable F0;
        public final AtomicReference<Subscription> G0;
        public final AtomicLong H0;
        public long I0;
        public Publisher<? extends T> J0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f71321w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final long f71322x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final TimeUnit f71323y0;

        public b(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker, Publisher<? extends T> publisher) {
            super(true);
            this.f71321w0 = subscriber;
            this.f71322x0 = j10;
            this.f71323y0 = timeUnit;
            this.E0 = worker;
            this.J0 = publisher;
            this.F0 = new SequentialDisposable();
            this.G0 = new AtomicReference<>();
            this.H0 = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.d
        public final void b(long j10) {
            if (this.H0.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.G0);
                long j11 = this.I0;
                if (j11 != 0) {
                    produced(j11);
                }
                Publisher<? extends T> publisher = this.J0;
                this.J0 = null;
                publisher.subscribe(new a(this.f71321w0, this));
                this.E0.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.E0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.H0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.F0.dispose();
                this.f71321w0.onComplete();
                this.E0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.H0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.F0.dispose();
            this.f71321w0.onError(th2);
            this.E0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.H0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.F0;
                    sequentialDisposable.get().dispose();
                    this.I0++;
                    this.f71321w0.onNext(t10);
                    sequentialDisposable.replace(this.E0.schedule(new e(j11, this), this.f71322x0, this.f71323y0));
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.G0, subscription)) {
                setSubscription(subscription);
            }
        }
    }

    public static final class c<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71324p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71325q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71326r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f71327s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SequentialDisposable f71328t0 = new SequentialDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71329u0 = new AtomicReference<>();
        public final AtomicLong v0 = new AtomicLong();

        public c(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f71324p0 = subscriber;
            this.f71325q0 = j10;
            this.f71326r0 = timeUnit;
            this.f71327s0 = worker;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f71329u0);
                this.f71324p0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.f71325q0, this.f71326r0)));
                this.f71327s0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71329u0);
            this.f71327s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f71328t0.dispose();
                this.f71324p0.onComplete();
                this.f71327s0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71328t0.dispose();
            this.f71324p0.onError(th2);
            this.f71327s0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f71328t0;
                    sequentialDisposable.get().dispose();
                    this.f71324p0.onNext(t10);
                    sequentialDisposable.replace(this.f71327s0.schedule(new e(j11, this), this.f71325q0, this.f71326r0));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71329u0, this.v0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71329u0, this.v0, j10);
        }
    }

    public interface d {
        void b(long j10);
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final d f71330p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71331q0;

        public e(long j10, d dVar) {
            this.f71331q0 = j10;
            this.f71330p0 = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f71330p0.b(this.f71331q0);
        }
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, Publisher<? extends T> publisher) {
        super(flowable);
        this.f71315q0 = j10;
        this.f71316r0 = timeUnit;
        this.f71317s0 = scheduler;
        this.f71318t0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Publisher<? extends T> publisher = this.f71318t0;
        Scheduler scheduler = this.f71317s0;
        if (publisher == null) {
            c cVar = new c(subscriber, this.f71315q0, this.f71316r0, scheduler.createWorker());
            subscriber.onSubscribe(cVar);
            cVar.f71328t0.replace(cVar.f71327s0.schedule(new e(0L, cVar), cVar.f71325q0, cVar.f71326r0));
            this.source.subscribe((FlowableSubscriber) cVar);
            return;
        }
        b bVar = new b(subscriber, this.f71315q0, this.f71316r0, scheduler.createWorker(), this.f71318t0);
        subscriber.onSubscribe(bVar);
        bVar.F0.replace(bVar.E0.schedule(new e(0L, bVar), bVar.f71322x0, bVar.f71323y0));
        this.source.subscribe((FlowableSubscriber) bVar);
    }
}
