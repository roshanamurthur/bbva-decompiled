package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnBackpressureBuffer<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f70851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70852r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70853s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f70854t0;

    public static final class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70855p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SimplePlainQueue<T> f70856q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f70857r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f70858s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70859t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f70860u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Throwable f70861w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f70862x0 = new AtomicLong();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f70863y0;

        public a(Subscriber<? super T> subscriber, int i10, boolean z10, boolean z11, Action action) {
            this.f70855p0 = subscriber;
            this.f70858s0 = action;
            this.f70857r0 = z11;
            this.f70856q0 = z10 ? new SpscLinkedArrayQueue<>(i10) : new SpscArrayQueue<>(i10);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70860u0) {
                return;
            }
            this.f70860u0 = true;
            this.f70859t0.cancel();
            if (this.f70863y0 || getAndIncrement() != 0) {
                return;
            }
            this.f70856q0.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70856q0.clear();
        }

        public final void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.f70856q0;
                Subscriber<? super T> subscriber = this.f70855p0;
                int iAddAndGet = 1;
                while (!e(subscriber, this.v0, simplePlainQueue.isEmpty())) {
                    long j10 = this.f70862x0.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.v0;
                        T tPoll = simplePlainQueue.poll();
                        boolean z11 = tPoll == null;
                        if (e(subscriber, z10, z11)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && e(subscriber, this.v0, simplePlainQueue.isEmpty())) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f70862x0.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public final boolean e(Subscriber subscriber, boolean z10, boolean z11) {
            if (this.f70860u0) {
                this.f70856q0.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f70857r0) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f70861w0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f70861w0;
            if (th3 != null) {
                this.f70856q0.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70856q0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.v0 = true;
            if (this.f70863y0) {
                this.f70855p0.onComplete();
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70861w0 = th2;
            this.v0 = true;
            if (this.f70863y0) {
                this.f70855p0.onError(th2);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70856q0.offer(t10)) {
                if (this.f70863y0) {
                    this.f70855p0.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.f70859t0.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f70858s0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70859t0, subscription)) {
                this.f70859t0 = subscription;
                this.f70855p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            return this.f70856q0.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (this.f70863y0 || !SubscriptionHelper.validate(j10)) {
                return;
            }
            BackpressureHelper.add(this.f70862x0, j10);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f70863y0 = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i10, boolean z10, boolean z11, Action action) {
        super(flowable);
        this.f70851q0 = i10;
        this.f70852r0 = z10;
        this.f70853s0 = z11;
        this.f70854t0 = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70851q0, this.f70852r0, this.f70853s0, this.f70854t0));
    }
}
