package io.reactivex.rxjava3.internal.jdk8;

import a.d;
import androidx.appcompat.app.r;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapStream<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f74028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74030s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public long F0;
        public int G0;
        public int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74031p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Stream<? extends R>> f74032q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74033r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SimpleQueue<T> f74035t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f74036u0;
        public Iterator<? extends R> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public AutoCloseable f74037w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f74038x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74039y0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f74034s0 = new AtomicLong();
        public final AtomicThrowable E0 = new AtomicThrowable();

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Stream<? extends R>> function, int i10) {
            this.f74031p0 = subscriber;
            this.f74032q0 = function;
            this.f74033r0 = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1 */
        /* JADX WARN: Type inference failed for: r17v2 */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f74031p0;
            SimpleQueue<T> simpleQueue = this.f74035t0;
            AtomicThrowable atomicThrowable = this.E0;
            Iterator<? extends R> it = this.v0;
            long j10 = this.f74034s0.get();
            long j11 = this.F0;
            int i10 = this.f74033r0;
            int i11 = i10 - (i10 >> 2);
            int i12 = 0;
            ?? r12 = 1;
            boolean z10 = this.H0 != 1;
            long j12 = j11;
            int iAddAndGet = 1;
            long j13 = j10;
            Iterator<? extends R> it2 = it;
            while (true) {
                if (this.f74038x0) {
                    simpleQueue.clear();
                    try {
                        this.v0 = null;
                        AutoCloseable autoCloseable = this.f74037w0;
                        this.f74037w0 = null;
                        if (autoCloseable != null) {
                            autoCloseable.close();
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(th2);
                    }
                } else {
                    boolean z11 = this.f74039y0;
                    if (atomicThrowable.get() != null) {
                        subscriber.onError(atomicThrowable.get());
                        this.f74038x0 = r12;
                    } else if (it2 == null) {
                        try {
                            T tPoll = simpleQueue.poll();
                            ?? r17 = tPoll == null ? r12 : i12;
                            if (z11 && r17 != 0) {
                                subscriber.onComplete();
                                this.f74038x0 = r12;
                            } else if (r17 == 0) {
                                if (z10) {
                                    int i13 = this.G0 + r12;
                                    this.G0 = i13;
                                    if (i13 == i11) {
                                        this.G0 = i12;
                                        this.f74036u0.request(i11);
                                    }
                                }
                                try {
                                    Stream<? extends R> streamApply = this.f74032q0.apply(tPoll);
                                    Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                                    Stream streamC = r.c(streamApply);
                                    it2 = streamC.iterator();
                                    if (it2.hasNext()) {
                                        this.v0 = it2;
                                        this.f74037w0 = streamC;
                                    } else {
                                        it2 = null;
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    b(th3, subscriber);
                                }
                            }
                            if (it2 == null && j12 != j13) {
                                try {
                                    Object obj = (R) it2.next();
                                    Objects.requireNonNull(obj, "The Stream.Iterator returned a null value");
                                    if (!this.f74038x0) {
                                        subscriber.onNext(obj);
                                        j12++;
                                        if (!this.f74038x0) {
                                            try {
                                                if (!it2.hasNext()) {
                                                    try {
                                                        this.v0 = null;
                                                        AutoCloseable autoCloseable2 = this.f74037w0;
                                                        this.f74037w0 = null;
                                                        if (autoCloseable2 != null) {
                                                            autoCloseable2.close();
                                                        }
                                                        it2 = null;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        it2 = null;
                                                        Exceptions.throwIfFatal(th);
                                                        b(th, subscriber);
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Exceptions.throwIfFatal(th6);
                                    b(th6, subscriber);
                                }
                            }
                        } catch (Throwable th7) {
                            Exceptions.throwIfFatal(th7);
                            b(th7, subscriber);
                        }
                    } else if (it2 == null) {
                    }
                    i12 = 0;
                    r12 = 1;
                }
                this.F0 = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j13 = this.f74034s0.get();
                i12 = 0;
                r12 = 1;
            }
        }

        public final void b(Throwable th2, Subscriber subscriber) {
            if (!this.E0.compareAndSet(null, th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74036u0.cancel();
            this.f74038x0 = true;
            subscriber.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74038x0 = true;
            this.f74036u0.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74039y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.E0.compareAndSet(null, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74039y0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.H0 == 2 || this.f74035t0.offer(t10)) {
                a();
            } else {
                this.f74036u0.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(@NonNull Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74036u0, subscription)) {
                this.f74036u0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.H0 = iRequestFusion;
                        this.f74035t0 = queueSubscription;
                        this.f74039y0 = true;
                        this.f74031p0.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.H0 = iRequestFusion;
                        this.f74035t0 = queueSubscription;
                        this.f74031p0.onSubscribe(this);
                        subscription.request(this.f74033r0);
                        return;
                    }
                }
                this.f74035t0 = new SpscArrayQueue(this.f74033r0);
                this.f74031p0.onSubscribe(this);
                subscription.request(this.f74033r0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f74034s0, j10);
                a();
            }
        }
    }

    public FlowableFlatMapStream(Flowable<T> flowable, Function<? super T, ? extends Stream<? extends R>> function, int i10) {
        this.f74028q0 = flowable;
        this.f74029r0 = function;
        this.f74030s0 = i10;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Stream<? extends R>> function, int i10) {
        return new a(subscriber, function, i10);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Stream streamC;
        Publisher publisher = this.f74028q0;
        boolean z10 = publisher instanceof Supplier;
        Function<? super T, ? extends Stream<? extends R>> function = this.f74029r0;
        if (!z10) {
            publisher.subscribe(subscribe(subscriber, function, this.f74030s0));
            return;
        }
        try {
            d dVar = (Object) ((Supplier) publisher).get();
            if (dVar != null) {
                Stream<? extends R> streamApply = function.apply(dVar);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                streamC = r.c(streamApply);
            } else {
                streamC = null;
            }
            if (streamC != null) {
                FlowableFromStream.subscribeStream(subscriber, streamC);
            } else {
                EmptySubscription.complete(subscriber);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
