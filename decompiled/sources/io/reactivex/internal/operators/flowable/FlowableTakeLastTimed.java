package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakeLastTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f71241s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f71242t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f71243u0;
    public final boolean v0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public Throwable F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71244p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71245q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71246r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f71247s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f71248t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f71249u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f71250w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f71251x0 = new AtomicLong();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71252y0;

        public a(int i10, long j10, long j11, Scheduler scheduler, TimeUnit timeUnit, Subscriber subscriber, boolean z10) {
            this.f71244p0 = subscriber;
            this.f71245q0 = j10;
            this.f71246r0 = j11;
            this.f71247s0 = timeUnit;
            this.f71248t0 = scheduler;
            this.f71249u0 = new SpscLinkedArrayQueue<>(i10);
            this.v0 = z10;
        }

        public final boolean a(Subscriber subscriber, boolean z10, boolean z11) {
            if (this.f71252y0) {
                this.f71249u0.clear();
                return true;
            }
            if (z11) {
                if (!z10) {
                    return false;
                }
                Throwable th2 = this.F0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th3 = this.F0;
            if (th3 != null) {
                this.f71249u0.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z10) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f71244p0;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f71249u0;
            boolean z10 = this.v0;
            int iAddAndGet = 1;
            do {
                if (this.E0) {
                    if (a(subscriber, spscLinkedArrayQueue.isEmpty(), z10)) {
                        return;
                    }
                    long j10 = this.f71251x0.get();
                    long j11 = 0;
                    while (true) {
                        if (a(subscriber, spscLinkedArrayQueue.peek() == null, z10)) {
                            return;
                        }
                        if (j10 == j11) {
                            if (j11 == 0) {
                                break;
                            }
                            BackpressureHelper.produced(this.f71251x0, j11);
                            break;
                        } else {
                            spscLinkedArrayQueue.poll();
                            subscriber.onNext(spscLinkedArrayQueue.poll());
                            j11++;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final void c(long j10, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j11 = this.f71245q0;
            boolean z10 = j11 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j10 - this.f71246r0 && (z10 || (spscLinkedArrayQueue.size() >> 1) <= j11)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f71252y0) {
                return;
            }
            this.f71252y0 = true;
            this.f71250w0.cancel();
            if (getAndIncrement() == 0) {
                this.f71249u0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            c(this.f71248t0.now(this.f71247s0), this.f71249u0);
            this.E0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.v0) {
                c(this.f71248t0.now(this.f71247s0), this.f71249u0);
            }
            this.F0 = th2;
            this.E0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long jNow = this.f71248t0.now(this.f71247s0);
            Long lValueOf = Long.valueOf(jNow);
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f71249u0;
            spscLinkedArrayQueue.offer(lValueOf, t10);
            c(jNow, spscLinkedArrayQueue);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71250w0, subscription)) {
                this.f71250w0 = subscription;
                this.f71244p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71251x0, j10);
                b();
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.f71239q0 = j10;
        this.f71240r0 = j11;
        this.f71241s0 = timeUnit;
        this.f71242t0 = scheduler;
        this.f71243u0 = i10;
        this.v0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Flowable<T> flowable = this.source;
        long j10 = this.f71239q0;
        long j11 = this.f71240r0;
        TimeUnit timeUnit = this.f71241s0;
        flowable.subscribe((FlowableSubscriber) new a(this.f71243u0, j10, j11, this.f71242t0, timeUnit, subscriber, this.v0));
    }
}
