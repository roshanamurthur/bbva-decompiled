package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapEager<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f74627q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74628r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74629s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ErrorMode f74630t0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, InnerQueuedSubscriberSupport<R> {
        public volatile boolean E0;
        public volatile InnerQueuedSubscriber<R> F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74631p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f74632q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74633r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74634s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ErrorMode f74635t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f74636u0 = new AtomicThrowable();
        public final AtomicLong v0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> f74637w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f74638x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74639y0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
            this.f74631p0 = subscriber;
            this.f74632q0 = function;
            this.f74633r0 = i10;
            this.f74634s0 = i11;
            this.f74635t0 = errorMode;
            this.f74637w0 = new SpscLinkedArrayQueue<>(Math.min(i11, i10));
        }

        public final void a() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.F0;
            this.F0 = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.f74637w0.poll();
                if (innerQueuedSubscriberPoll == null) {
                    return;
                } else {
                    innerQueuedSubscriberPoll.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74639y0) {
                return;
            }
            this.f74639y0 = true;
            this.f74638x0.cancel();
            this.f74636u0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                do {
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void drain() {
            int i10;
            boolean z10;
            long j10;
            long j11;
            SimpleQueue<R> simpleQueueQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.F0;
            Subscriber<? super R> subscriber = this.f74631p0;
            ErrorMode errorMode = this.f74635t0;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.v0.get();
                if (innerQueuedSubscriberPoll != null) {
                    innerQueuedSubscriberPoll = innerQueuedSubscriberPoll;
                } else {
                    if (errorMode != ErrorMode.END && this.f74636u0.get() != null) {
                        a();
                        this.f74636u0.tryTerminateConsumer(this.f74631p0);
                        return;
                    }
                    boolean z11 = this.E0;
                    innerQueuedSubscriberPoll = this.f74637w0.poll();
                    if (z11 && innerQueuedSubscriberPoll == null) {
                        this.f74636u0.tryTerminateConsumer(this.f74631p0);
                        return;
                    } else if (innerQueuedSubscriberPoll != null) {
                        this.F0 = innerQueuedSubscriberPoll;
                    }
                }
                if (innerQueuedSubscriberPoll == null || (simpleQueueQueue = innerQueuedSubscriberPoll.queue()) == null) {
                    i10 = iAddAndGet;
                    z10 = false;
                    j10 = 0;
                    j11 = 0;
                } else {
                    j11 = 0;
                    while (true) {
                        i10 = iAddAndGet;
                        if (j11 != j12) {
                            if (this.f74639y0) {
                                a();
                                return;
                            }
                            if (errorMode == ErrorMode.IMMEDIATE && this.f74636u0.get() != null) {
                                this.F0 = null;
                                innerQueuedSubscriberPoll.cancel();
                                a();
                                this.f74636u0.tryTerminateConsumer(this.f74631p0);
                                return;
                            }
                            boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                            try {
                                R rPoll = simpleQueueQueue.poll();
                                boolean z12 = rPoll == null;
                                if (zIsDone && z12) {
                                    this.F0 = null;
                                    this.f74638x0.request(1L);
                                    innerQueuedSubscriberPoll = null;
                                    z10 = true;
                                    break;
                                }
                                if (!z12) {
                                    subscriber.onNext(rPoll);
                                    j11++;
                                    innerQueuedSubscriberPoll.request(1L);
                                    iAddAndGet = i10;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.F0 = null;
                                innerQueuedSubscriberPoll.cancel();
                                a();
                                subscriber.onError(th2);
                                return;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (j11 == j12) {
                        if (this.f74639y0) {
                            a();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.f74636u0.get() != null) {
                            this.F0 = null;
                            innerQueuedSubscriberPoll.cancel();
                            a();
                            this.f74636u0.tryTerminateConsumer(this.f74631p0);
                            return;
                        }
                        boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                        boolean zIsEmpty = simpleQueueQueue.isEmpty();
                        if (zIsDone2 && zIsEmpty) {
                            this.F0 = null;
                            this.f74638x0.request(1L);
                            innerQueuedSubscriberPoll = null;
                            z10 = true;
                        }
                    }
                    j10 = 0;
                }
                if (j11 != j10 && j12 != Long.MAX_VALUE) {
                    this.v0.addAndGet(-j11);
                }
                if (z10) {
                    iAddAndGet = i10;
                } else {
                    iAddAndGet = addAndGet(-i10);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th2) {
            if (this.f74636u0.tryAddThrowableOrReport(th2)) {
                innerQueuedSubscriber.setDone();
                if (this.f74635t0 != ErrorMode.END) {
                    this.f74638x0.cancel();
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r3) {
            if (innerQueuedSubscriber.queue().offer(r3)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.E0 = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74636u0.tryAddThrowableOrReport(th2)) {
                this.E0 = true;
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                Publisher<? extends R> publisherApply = this.f74632q0.apply(t10);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher = publisherApply;
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.f74634s0);
                if (this.f74639y0) {
                    return;
                }
                this.f74637w0.offer(innerQueuedSubscriber);
                publisher.subscribe(innerQueuedSubscriber);
                if (this.f74639y0) {
                    innerQueuedSubscriber.cancel();
                    if (getAndIncrement() == 0) {
                        do {
                            a();
                        } while (decrementAndGet() != 0);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74638x0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74638x0, subscription)) {
                this.f74638x0 = subscription;
                this.f74631p0.onSubscribe(this);
                int i10 = this.f74633r0;
                subscription.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.v0, j10);
                drain();
            }
        }
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
        super(flowable);
        this.f74627q0 = function;
        this.f74628r0 = i10;
        this.f74629s0 = i11;
        this.f74630t0 = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74627q0, this.f74628r0, this.f74629s0, this.f74630t0));
    }
}
