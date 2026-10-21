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
public final class FlowableSkipLastTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71165q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71166r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f71167s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f71168t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f71169u0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public Throwable E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71170p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71171q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71172r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f71173s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f71174t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f71175u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicLong f71176w0 = new AtomicLong();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71177x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71178y0;

        public a(Subscriber<? super T> subscriber, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.f71170p0 = subscriber;
            this.f71171q0 = j10;
            this.f71172r0 = timeUnit;
            this.f71173s0 = scheduler;
            this.f71174t0 = new SpscLinkedArrayQueue<>(i10);
            this.f71175u0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f71170p0;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f71174t0;
            boolean z10 = this.f71175u0;
            TimeUnit timeUnit = this.f71172r0;
            Scheduler scheduler = this.f71173s0;
            long j10 = this.f71171q0;
            int iAddAndGet = 1;
            do {
                long j11 = this.f71176w0.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f71178y0;
                    Long l6 = (Long) spscLinkedArrayQueue.peek();
                    boolean z12 = l6 == null;
                    long jNow = scheduler.now(timeUnit);
                    if (!z12 && l6.longValue() > jNow - j10) {
                        z12 = true;
                    }
                    if (this.f71177x0) {
                        this.f71174t0.clear();
                        return;
                    }
                    if (z11) {
                        if (!z10) {
                            Throwable th2 = this.E0;
                            if (th2 != null) {
                                this.f71174t0.clear();
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
                    BackpressureHelper.produced(this.f71176w0, j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f71177x0) {
                return;
            }
            this.f71177x0 = true;
            this.v0.cancel();
            if (getAndIncrement() == 0) {
                this.f71174t0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71178y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.E0 = th2;
            this.f71178y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71174t0.offer(Long.valueOf(this.f71173s0.now(this.f71172r0)), t10);
            a();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f71170p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71176w0, j10);
                a();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.f71165q0 = j10;
        this.f71166r0 = timeUnit;
        this.f71167s0 = scheduler;
        this.f71168t0 = i10;
        this.f71169u0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71165q0, this.f71166r0, this.f71167s0, this.f71168t0, this.f71169u0));
    }
}
