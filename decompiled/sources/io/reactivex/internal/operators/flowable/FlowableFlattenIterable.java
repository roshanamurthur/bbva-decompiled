package io.reactivex.internal.operators.flowable;

import a.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f70636q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70637r0;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        public Iterator<? extends R> E0;
        public int F0;
        public int G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f70638p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f70639q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70640r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70641s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f70643u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f70644w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f70645x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicReference<Throwable> f70646y0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f70642t0 = new AtomicLong();

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function, int i10) {
            this.f70638p0 = subscriber;
            this.f70639q0 = function;
            this.f70640r0 = i10;
            this.f70641s0 = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70645x0) {
                return;
            }
            this.f70645x0 = true;
            this.f70643u0.cancel();
            if (getAndIncrement() == 0) {
                this.v0.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.E0 = null;
            this.v0.clear();
        }

        /* JADX WARN: Code duplicated, block: B:79:0x0147 A[PHI: r6
          0x0147: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:36:0x0091, B:77:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x014e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<?> subscriber = this.f70638p0;
            SimpleQueue<T> simpleQueue = this.v0;
            int i10 = 1;
            boolean z10 = false;
            Object[] objArr = this.G0 != 1;
            Iterator<? extends R> it = this.E0;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z11 = this.f70644w0;
                    try {
                        T tPoll = simpleQueue.poll();
                        if (e(z11, tPoll == null ? i10 : z10 ? 1 : 0, subscriber, simpleQueue)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.f70639q0.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.E0 = it;
                                } else {
                                    if (objArr != false) {
                                        int i11 = this.F0 + i10;
                                        if (i11 == this.f70641s0) {
                                            this.F0 = z10 ? 1 : 0;
                                            this.f70643u0.request(i11);
                                        } else {
                                            this.F0 = i11;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.f70643u0.cancel();
                                ExceptionHelper.addThrowable(this.f70646y0, th2);
                                subscriber.onError(ExceptionHelper.terminate(this.f70646y0));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.f70643u0.cancel();
                        ExceptionHelper.addThrowable(this.f70646y0, th3);
                        Throwable thTerminate = ExceptionHelper.terminate(this.f70646y0);
                        this.E0 = null;
                        simpleQueue.clear();
                        subscriber.onError(thTerminate);
                        return;
                    }
                }
                if (it != null) {
                    long j10 = this.f70642t0.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (e(this.f70644w0, z10, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            subscriber.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (e(this.f70644w0, z10, subscriber, simpleQueue)) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    if (objArr != false) {
                                        int i12 = this.F0 + i10;
                                        if (i12 == this.f70641s0) {
                                            this.F0 = z10 ? 1 : 0;
                                            this.f70643u0.request(i12);
                                        } else {
                                            this.F0 = i12;
                                        }
                                    }
                                    this.E0 = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                this.E0 = null;
                                this.f70643u0.cancel();
                                ExceptionHelper.addThrowable(this.f70646y0, th4);
                                subscriber.onError(ExceptionHelper.terminate(this.f70646y0));
                                return;
                            }
                        } catch (Throwable th5) {
                            Exceptions.throwIfFatal(th5);
                            this.E0 = null;
                            this.f70643u0.cancel();
                            ExceptionHelper.addThrowable(this.f70646y0, th5);
                            subscriber.onError(ExceptionHelper.terminate(this.f70646y0));
                            return;
                        }
                    }
                    if (j11 == j10) {
                        if (e(this.f70644w0, simpleQueue.isEmpty() && it == null, subscriber, simpleQueue)) {
                            return;
                        }
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f70642t0.addAndGet(-j11);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                i10 = 1;
                z10 = false;
            }
        }

        public final boolean e(boolean z10, boolean z11, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            if (this.f70645x0) {
                this.E0 = null;
                simpleQueue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f70646y0.get() == null) {
                if (!z11) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable thTerminate = ExceptionHelper.terminate(this.f70646y0);
            this.E0 = null;
            simpleQueue.clear();
            subscriber.onError(thTerminate);
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.E0 == null && this.v0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70644w0) {
                return;
            }
            this.f70644w0 = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70644w0 || !ExceptionHelper.addThrowable(this.f70646y0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70644w0 = true;
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70644w0) {
                return;
            }
            if (this.G0 != 0 || this.v0.offer(t10)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70643u0, subscription)) {
                this.f70643u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.G0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        this.f70644w0 = true;
                        this.f70638p0.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.G0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        this.f70638p0.onSubscribe(this);
                        subscription.request(this.f70640r0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f70640r0);
                this.f70638p0.onSubscribe(this);
                subscription.request(this.f70640r0);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.E0;
            while (it == null) {
                T tPoll = this.v0.poll();
                if (tPoll != null) {
                    it = this.f70639q0.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.E0 = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r3 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.E0 = null;
            }
            return r3;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f70642t0, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return ((i10 & 1) == 0 || this.G0 != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i10) {
        super(flowable);
        this.f70636q0 = function;
        this.f70637r0 = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        boolean z10 = flowable instanceof Callable;
        Function<? super T, ? extends Iterable<? extends R>> function = this.f70636q0;
        if (!z10) {
            flowable.subscribe((FlowableSubscriber) new a(subscriber, function, this.f70637r0));
            return;
        }
        try {
            d dVar = (Object) ((Callable) flowable).call();
            if (dVar == null) {
                EmptySubscription.complete(subscriber);
                return;
            }
            try {
                FlowableFromIterable.subscribe(subscriber, function.apply(dVar).iterator());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, subscriber);
        }
    }
}
