package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRange extends Flowable<Integer> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f70948q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70949r0;

    public static abstract class a extends BasicQueueSubscription<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f70950p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f70951q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f70952r0;

        public a(int i10, int i11) {
            this.f70951q0 = i10;
            this.f70950p0 = i11;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70952r0 = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70951q0 = this.f70950p0;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70951q0 == this.f70950p0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Exception {
            int i10 = this.f70951q0;
            if (i10 == this.f70950p0) {
                return null;
            }
            this.f70951q0 = i10 + 1;
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

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super Integer> f70953s0;

        public b(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i10, int i11) {
            super(i10, i11);
            this.f70953s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.a
        public final void a() {
            int i10 = this.f70950p0;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f70953s0;
            for (int i11 = this.f70951q0; i11 != i10; i11++) {
                if (this.f70952r0) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i11));
            }
            if (this.f70952r0) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.a
        public final void e(long j10) {
            int i10 = this.f70950p0;
            int i11 = this.f70951q0;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f70953s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f70952r0) {
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
                        if (this.f70952r0) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i11))) {
                            j11++;
                        }
                        i11++;
                    }
                }
                this.f70951q0 = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super Integer> f70954s0;

        public c(Subscriber<? super Integer> subscriber, int i10, int i11) {
            super(i10, i11);
            this.f70954s0 = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.a
        public final void a() {
            int i10 = this.f70950p0;
            Subscriber<? super Integer> subscriber = this.f70954s0;
            for (int i11 = this.f70951q0; i11 != i10; i11++) {
                if (this.f70952r0) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i11));
            }
            if (this.f70952r0) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.a
        public final void e(long j10) {
            int i10 = this.f70950p0;
            int i11 = this.f70951q0;
            Subscriber<? super Integer> subscriber = this.f70954s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f70952r0) {
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
                        if (this.f70952r0) {
                            return;
                        }
                        subscriber.onNext(Integer.valueOf(i11));
                        j11++;
                        i11++;
                    }
                }
                this.f70951q0 = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableRange(int i10, int i11) {
        this.f70948q0 = i10;
        this.f70949r0 = i10 + i11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Integer> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        int i10 = this.f70949r0;
        int i11 = this.f70948q0;
        if (z10) {
            subscriber.onSubscribe(new b((ConditionalSubscriber) subscriber, i11, i10));
        } else {
            subscriber.onSubscribe(new c(subscriber, i11, i10));
        }
    }
}
