package io.reactivex.rxjava3.internal.operators.flowable;

import a.d;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableScanSeed<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f75360q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<R> f75361r0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public R E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f75363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscArrayQueue f75364r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f75365s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f75366t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f75367u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75368w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f75369x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f75370y0;

        public a(Subscriber<? super R> subscriber, BiFunction<R, ? super T, R> biFunction, R r3, int i10) {
            this.f75362p0 = subscriber;
            this.f75363q0 = biFunction;
            this.E0 = r3;
            this.f75366t0 = i10;
            this.f75367u0 = i10 - (i10 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i10);
            this.f75364r0 = spscArrayQueue;
            spscArrayQueue.offer(r3);
            this.f75365s0 = new AtomicLong();
        }

        public final void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f75362p0;
            SpscArrayQueue spscArrayQueue = this.f75364r0;
            int i10 = this.f75367u0;
            int i11 = this.F0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f75365s0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.v0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f75368w0;
                    if (z10 && (th2 = this.f75369x0) != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    d dVar = (Object) spscArrayQueue.poll();
                    boolean z11 = dVar == null;
                    if (z10 && z11) {
                        subscriber.onComplete();
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(dVar);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.f75370y0.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.f75368w0) {
                    Throwable th3 = this.f75369x0;
                    if (th3 != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th3);
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f75365s0, j11);
                }
                this.F0 = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.v0 = true;
            this.f75370y0.cancel();
            if (getAndIncrement() == 0) {
                this.f75364r0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75368w0) {
                return;
            }
            this.f75368w0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75368w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75369x0 = th2;
            this.f75368w0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75368w0) {
                return;
            }
            try {
                R rApply = this.f75363q0.apply(this.E0, t10);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.E0 = rApply;
                this.f75364r0.offer(rApply);
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75370y0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75370y0, subscription)) {
                this.f75370y0 = subscription;
                this.f75362p0.onSubscribe(this);
                subscription.request(this.f75366t0 - 1);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75365s0, j10);
                a();
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.f75360q0 = biFunction;
        this.f75361r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        try {
            R r3 = this.f75361r0.get();
            Objects.requireNonNull(r3, "The seed supplied is null");
            this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75360q0, r3, Flowable.bufferSize()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
