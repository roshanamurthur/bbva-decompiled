package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureBuffer<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f75123q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f75124r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f75125s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f75126t0;

    public static final class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75127p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SimplePlainQueue<T> f75128q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f75129r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f75130s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f75131t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f75132u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Throwable f75133w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f75134x0 = new AtomicLong();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f75135y0;

        public a(Subscriber<? super T> subscriber, int i10, boolean z10, boolean z11, Action action) {
            this.f75127p0 = subscriber;
            this.f75130s0 = action;
            this.f75129r0 = z11;
            this.f75128q0 = z10 ? new SpscLinkedArrayQueue<>(i10) : new SpscArrayQueue<>(i10);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75132u0) {
                return;
            }
            this.f75132u0 = true;
            this.f75131t0.cancel();
            if (this.f75135y0 || getAndIncrement() != 0) {
                return;
            }
            this.f75128q0.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f75128q0.clear();
        }

        public final void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.f75128q0;
                Subscriber<? super T> subscriber = this.f75127p0;
                int iAddAndGet = 1;
                while (!e(subscriber, this.v0, simplePlainQueue.isEmpty())) {
                    long j10 = this.f75134x0.get();
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
                        this.f75134x0.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public final boolean e(Subscriber subscriber, boolean z10, boolean z11) {
            if (this.f75132u0) {
                this.f75128q0.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f75129r0) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f75133w0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f75133w0;
            if (th3 != null) {
                this.f75128q0.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f75128q0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.v0 = true;
            if (this.f75135y0) {
                this.f75127p0.onComplete();
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75133w0 = th2;
            this.v0 = true;
            if (this.f75135y0) {
                this.f75127p0.onError(th2);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75128q0.offer(t10)) {
                if (this.f75135y0) {
                    this.f75127p0.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.f75131t0.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f75130s0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75131t0, subscription)) {
                this.f75131t0 = subscription;
                this.f75127p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return this.f75128q0.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (this.f75135y0 || !SubscriptionHelper.validate(j10)) {
                return;
            }
            BackpressureHelper.add(this.f75134x0, j10);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f75135y0 = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i10, boolean z10, boolean z11, Action action) {
        super(flowable);
        this.f75123q0 = i10;
        this.f75124r0 = z10;
        this.f75125s0 = z11;
        this.f75126t0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75123q0, this.f75124r0, this.f75125s0, this.f75126t0));
    }
}
