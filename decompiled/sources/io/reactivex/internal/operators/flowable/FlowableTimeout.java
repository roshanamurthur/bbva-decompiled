package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<U> f71302q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<V>> f71303r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Publisher<? extends T> f71304s0;

    public static final class a extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final c f71305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71306q0;

        public a(long j10, c cVar) {
            this.f71306q0 = j10;
            this.f71305p0 = cVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f71305p0.b(this.f71306q0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                lazySet(subscriptionHelper);
                this.f71305p0.a(this.f71306q0, th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = (Subscription) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                lazySet(subscriptionHelper);
                this.f71305p0.b(this.f71306q0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class b<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, c {
        public final AtomicReference<Subscription> E0;
        public final AtomicLong F0;
        public Publisher<? extends T> G0;
        public long H0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f71307w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<?>> f71308x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final SequentialDisposable f71309y0;

        public b(Publisher publisher, Subscriber subscriber, Function function) {
            super(true);
            this.f71307w0 = subscriber;
            this.f71308x0 = function;
            this.f71309y0 = new SequentialDisposable();
            this.E0 = new AtomicReference<>();
            this.G0 = publisher;
            this.F0 = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.c
        public final void a(long j10, Throwable th2) {
            if (!this.F0.compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                SubscriptionHelper.cancel(this.E0);
                this.f71307w0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.d
        public final void b(long j10) {
            if (this.F0.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.E0);
                Publisher<? extends T> publisher = this.G0;
                this.G0 = null;
                long j11 = this.H0;
                if (j11 != 0) {
                    produced(j11);
                }
                publisher.subscribe(new FlowableTimeoutTimed.a(this.f71307w0, this));
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f71309y0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.F0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f71309y0;
                sequentialDisposable.dispose();
                this.f71307w0.onComplete();
                sequentialDisposable.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.F0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f71309y0;
            sequentialDisposable.dispose();
            this.f71307w0.onError(th2);
            sequentialDisposable.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.F0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f71309y0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.H0++;
                    Subscriber<? super T> subscriber = this.f71307w0;
                    subscriber.onNext(t10);
                    try {
                        Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71308x0.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            publisher.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.E0.get().cancel();
                        atomicLong.getAndSet(Long.MAX_VALUE);
                        subscriber.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.E0, subscription)) {
                setSubscription(subscription);
            }
        }
    }

    public interface c extends FlowableTimeoutTimed.d {
        void a(long j10, Throwable th2);
    }

    public static final class d<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, c {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71310p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<?>> f71311q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f71312r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71313s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f71314t0 = new AtomicLong();

        public d(Subscriber<? super T> subscriber, Function<? super T, ? extends Publisher<?>> function) {
            this.f71310p0 = subscriber;
            this.f71311q0 = function;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.c
        public final void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                SubscriptionHelper.cancel(this.f71313s0);
                this.f71310p0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f71313s0);
                this.f71310p0.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71313s0);
            this.f71312r0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f71312r0.dispose();
                this.f71310p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71312r0.dispose();
                this.f71310p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f71312r0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Subscriber<? super T> subscriber = this.f71310p0;
                    subscriber.onNext(t10);
                    try {
                        Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71311q0.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            publisher.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f71313s0.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        subscriber.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71313s0, this.f71314t0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71313s0, this.f71314t0, j10);
        }
    }

    public FlowableTimeout(Flowable<T> flowable, Publisher<U> publisher, Function<? super T, ? extends Publisher<V>> function, Publisher<? extends T> publisher2) {
        super(flowable);
        this.f71302q0 = publisher;
        this.f71303r0 = function;
        this.f71304s0 = publisher2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Publisher<U> publisher = this.f71302q0;
        Function<? super T, ? extends Publisher<V>> function = this.f71303r0;
        Publisher<? extends T> publisher2 = this.f71304s0;
        if (publisher2 == null) {
            d dVar = new d(subscriber, function);
            subscriber.onSubscribe(dVar);
            if (publisher != null) {
                a aVar = new a(0L, dVar);
                if (dVar.f71312r0.replace(aVar)) {
                    publisher.subscribe(aVar);
                }
            }
            this.source.subscribe((FlowableSubscriber) dVar);
            return;
        }
        b bVar = new b(publisher2, subscriber, function);
        subscriber.onSubscribe(bVar);
        if (publisher != null) {
            a aVar2 = new a(0L, bVar);
            if (bVar.f71309y0.replace(aVar2)) {
                publisher.subscribe(aVar2);
            }
        }
        this.source.subscribe((FlowableSubscriber) bVar);
    }
}
