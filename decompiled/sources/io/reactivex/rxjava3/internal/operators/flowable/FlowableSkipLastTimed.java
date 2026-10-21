package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipLastTimed<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75423q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f75424r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f75425s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f75426t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f75427u0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public Throwable E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75429q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75430r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f75431s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f75432t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f75433u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicLong f75434w0 = new AtomicLong();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f75435x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f75436y0;

        public a(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.f75428p0 = subscriber;
            this.f75429q0 = j10;
            this.f75430r0 = timeUnit;
            this.f75431s0 = scheduler;
            this.f75432t0 = new SpscLinkedArrayQueue<>(i10);
            this.f75433u0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f75428p0;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f75432t0;
            boolean z10 = this.f75433u0;
            TimeUnit timeUnit = this.f75430r0;
            Scheduler scheduler = this.f75431s0;
            long j10 = this.f75429q0;
            int iAddAndGet = 1;
            do {
                long j11 = this.f75434w0.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f75436y0;
                    Long l6 = (Long) spscLinkedArrayQueue.peek();
                    boolean z12 = l6 == null;
                    long jNow = scheduler.now(timeUnit);
                    if (!z12 && l6.longValue() > jNow - j10) {
                        z12 = true;
                    }
                    if (this.f75435x0) {
                        this.f75432t0.clear();
                        return;
                    }
                    if (z11) {
                        if (!z10) {
                            Throwable th2 = this.E0;
                            if (th2 != null) {
                                this.f75432t0.clear();
                                subscriber.onError(th2);
                                return;
                            } else if (z12) {
                                subscriber.onComplete();
                                return;
                            }
                        } else if (z12) {
                            Throwable th3 = this.E0;
                            if (th3 != null) {
                                subscriber.onError(th3);
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                    if (z12) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    subscriber.onNext(spscLinkedArrayQueue.poll());
                    j12++;
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this.f75434w0, j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75435x0) {
                return;
            }
            this.f75435x0 = true;
            this.v0.cancel();
            if (getAndIncrement() == 0) {
                this.f75432t0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75436y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.E0 = th2;
            this.f75436y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75432t0.offer(Long.valueOf(this.f75431s0.now(this.f75430r0)), t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f75428p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75434w0, j10);
                a();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.f75423q0 = j10;
        this.f75424r0 = timeUnit;
        this.f75425s0 = scheduler;
        this.f75426t0 = i10;
        this.f75427u0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75423q0, this.f75424r0, this.f75425s0, this.f75426t0, this.f75427u0));
    }
}
