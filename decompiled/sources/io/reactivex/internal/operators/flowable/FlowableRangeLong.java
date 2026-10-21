package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRangeLong extends Flowable<Long> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70955q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f70956r0;

    public static abstract class a extends BasicQueueSubscription<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f70957p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f70958q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f70959r0;

        public a(long j10, long j11) {
            this.f70958q0 = j10;
            this.f70957p0 = j11;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70959r0 = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70958q0 = this.f70957p0;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70958q0 == this.f70957p0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Exception {
            long j10 = this.f70958q0;
            if (j10 == this.f70957p0) {
                return null;
            }
            this.f70958q0 = 1 + j10;
            return Long.valueOf(j10);
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
        public final ConditionalSubscriber<? super Long> f70960s0;

        public b(ConditionalSubscriber<? super Long> conditionalSubscriber, long j10, long j11) {
            super(j10, j11);
            this.f70960s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.a
        public final void a() {
            long j10 = this.f70957p0;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.f70960s0;
            for (long j11 = this.f70958q0; j11 != j10; j11++) {
                if (this.f70959r0) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Long.valueOf(j11));
            }
            if (this.f70959r0) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.a
        public final void e(long j10) {
            long j11 = this.f70957p0;
            long j12 = this.f70958q0;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.f70960s0;
            do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f70959r0) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f70959r0) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Long.valueOf(j12))) {
                            j13++;
                        }
                        j12++;
                    }
                }
                this.f70958q0 = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super Long> f70961s0;

        public c(Subscriber<? super Long> subscriber, long j10, long j11) {
            super(j10, j11);
            this.f70961s0 = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.a
        public final void a() {
            long j10 = this.f70957p0;
            Subscriber<? super Long> subscriber = this.f70961s0;
            for (long j11 = this.f70958q0; j11 != j10; j11++) {
                if (this.f70959r0) {
                    return;
                }
                subscriber.onNext(Long.valueOf(j11));
            }
            if (this.f70959r0) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.a
        public final void e(long j10) {
            long j11 = this.f70957p0;
            long j12 = this.f70958q0;
            Subscriber<? super Long> subscriber = this.f70961s0;
            do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f70959r0) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f70959r0) {
                            return;
                        }
                        subscriber.onNext(Long.valueOf(j12));
                        j13++;
                        j12++;
                    }
                }
                this.f70958q0 = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public FlowableRangeLong(long j10, long j11) {
        this.f70955q0 = j10;
        this.f70956r0 = j10 + j11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new b((ConditionalSubscriber) subscriber, this.f70955q0, this.f70956r0));
        } else {
            subscriber.onSubscribe(new c(subscriber, this.f70955q0, this.f70956r0));
        }
    }
}
