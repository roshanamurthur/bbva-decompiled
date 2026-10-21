package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRange extends Flowable<Integer> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f75205q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75206r0;

    public static abstract class a extends BasicQueueSubscription<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f75207p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f75208q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f75209r0;

        public a(int i10, int i11) {
            this.f75208q0 = i10;
            this.f75207p0 = i11;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75209r0 = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f75208q0 = this.f75207p0;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f75208q0 == this.f75207p0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Throwable {
            int i10 = this.f75208q0;
            if (i10 == this.f75207p0) {
                return null;
            }
            this.f75208q0 = i10 + 1;
            return Integer.valueOf(i10);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    e(j10);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super Integer> f75210s0;

        public b(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i10, int i11) {
            super(i10, i11);
            this.f75210s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.a
        public final void a() {
            int i10 = this.f75207p0;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f75210s0;
            for (int i11 = this.f75208q0; i11 != i10; i11++) {
                if (this.f75209r0) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i11));
            }
            if (this.f75209r0) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.a
        public final void e(long j10) {
            int i10 = this.f75207p0;
            int i11 = this.f75208q0;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f75210s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f75209r0) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f75209r0) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i11))) {
                            j11++;
                        }
                        i11++;
                    }
                }
                this.f75208q0 = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super Integer> f75211s0;

        public c(Subscriber<? super Integer> subscriber, int i10, int i11) {
            super(i10, i11);
            this.f75211s0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.a
        public final void a() {
            int i10 = this.f75207p0;
            Subscriber<? super Integer> subscriber = this.f75211s0;
            for (int i11 = this.f75208q0; i11 != i10; i11++) {
                if (this.f75209r0) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i11));
            }
            if (this.f75209r0) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.a
        public final void e(long j10) {
            int i10 = this.f75207p0;
            int i11 = this.f75208q0;
            Subscriber<? super Integer> subscriber = this.f75211s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f75209r0) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f75209r0) {
                            return;
                        }
                        subscriber.onNext(Integer.valueOf(i11));
                        j11++;
                        i11++;
                    }
                }
                this.f75208q0 = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableRange(int i10, int i11) {
        this.f75205q0 = i10;
        this.f75206r0 = i10 + i11;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Integer> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        int i10 = this.f75206r0;
        int i11 = this.f75205q0;
        if (z10) {
            subscriber.onSubscribe(new b((ConditionalSubscriber) subscriber, i11, i10));
        } else {
            subscriber.onSubscribe(new c(subscriber, i11, i10));
        }
    }
}
