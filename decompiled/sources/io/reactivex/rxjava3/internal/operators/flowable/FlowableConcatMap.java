package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f74609q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74610r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f74611s0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74612a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f74612a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74612a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, f<R>, Subscription {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f74614q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74615r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74616s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f74617t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f74618u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f74619w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f74620x0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final e<R> f74613p0 = new e<>(this);

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicThrowable f74621y0 = new AtomicThrowable();

        public b(Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
            this.f74614q0 = function;
            this.f74615r0 = i10;
            this.f74616s0 = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void c() {
            this.E0 = false;
            d();
        }

        public abstract void d();

        public abstract void e();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74619w0 = true;
            d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.F0 == 2 || this.v0.offer(t10)) {
                d();
            } else {
                this.f74617t0.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74617t0, subscription)) {
                this.f74617t0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        this.f74619w0 = true;
                        e();
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        e();
                        subscription.request(this.f74615r0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f74615r0);
                e();
                subscription.request(this.f74615r0);
            }
        }
    }

    public static final class c<T, R> extends b<T, R> {
        public final Subscriber<? super R> G0;
        public final boolean H0;

        public c(int i10, Function function, Subscriber subscriber, boolean z10) {
            super(function, i10);
            this.G0 = subscriber;
            this.H0 = z10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            if (this.f74621y0.tryAddThrowableOrReport(th2)) {
                if (!this.H0) {
                    this.f74617t0.cancel();
                    this.f74619w0 = true;
                }
                this.E0 = false;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            this.G0.onNext(r3);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74620x0) {
                return;
            }
            this.f74620x0 = true;
            this.f74613p0.cancel();
            this.f74617t0.cancel();
            this.f74621y0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f74620x0) {
                    if (!this.E0) {
                        boolean z10 = this.f74619w0;
                        if (z10 && !this.H0 && this.f74621y0.get() != null) {
                            this.f74621y0.tryTerminateConsumer(this.G0);
                            return;
                        }
                        try {
                            T tPoll = this.v0.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f74621y0.tryTerminateConsumer(this.G0);
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f74614q0.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.F0 != 1) {
                                        int i10 = this.f74618u0 + 1;
                                        if (i10 == this.f74616s0) {
                                            this.f74618u0 = 0;
                                            this.f74617t0.request(i10);
                                        } else {
                                            this.f74618u0 = i10;
                                        }
                                    }
                                    if (publisher instanceof Supplier) {
                                        try {
                                            obj = ((Supplier) publisher).get();
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.f74621y0.tryAddThrowableOrReport(th2);
                                            if (!this.H0) {
                                                this.f74617t0.cancel();
                                                this.f74621y0.tryTerminateConsumer(this.G0);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f74613p0.isUnbounded()) {
                                            this.G0.onNext(obj);
                                        } else {
                                            this.E0 = true;
                                            e<R> eVar = this.f74613p0;
                                            eVar.setSubscription(new g(obj, eVar));
                                        }
                                    } else {
                                        this.E0 = true;
                                        publisher.subscribe(this.f74613p0);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.f74617t0.cancel();
                                    this.f74621y0.tryAddThrowableOrReport(th3);
                                    this.f74621y0.tryTerminateConsumer(this.G0);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.f74617t0.cancel();
                            this.f74621y0.tryAddThrowableOrReport(th4);
                            this.f74621y0.tryTerminateConsumer(this.G0);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public final void e() {
            this.G0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74621y0.tryAddThrowableOrReport(th2)) {
                this.f74619w0 = true;
                d();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74613p0.request(j10);
        }
    }

    public static final class d<T, R> extends b<T, R> {
        public final Subscriber<? super R> G0;
        public final AtomicInteger H0;

        public d(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
            super(function, i10);
            this.G0 = subscriber;
            this.H0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            this.f74617t0.cancel();
            HalfSerializer.onError(this.G0, th2, this, this.f74621y0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            HalfSerializer.onNext(this.G0, r3, this, this.f74621y0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74620x0) {
                return;
            }
            this.f74620x0 = true;
            this.f74613p0.cancel();
            this.f74617t0.cancel();
            this.f74621y0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            if (this.H0.getAndIncrement() == 0) {
                while (!this.f74620x0) {
                    if (!this.E0) {
                        boolean z10 = this.f74619w0;
                        try {
                            T tPoll = this.v0.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.G0.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f74614q0.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.F0 != 1) {
                                        int i10 = this.f74618u0 + 1;
                                        if (i10 == this.f74616s0) {
                                            this.f74618u0 = 0;
                                            this.f74617t0.request(i10);
                                        } else {
                                            this.f74618u0 = i10;
                                        }
                                    }
                                    if (publisher instanceof Supplier) {
                                        try {
                                            Object obj = ((Supplier) publisher).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f74613p0.isUnbounded()) {
                                                this.E0 = true;
                                                e<R> eVar = this.f74613p0;
                                                eVar.setSubscription(new g(obj, eVar));
                                            } else if (!HalfSerializer.onNext(this.G0, obj, this, this.f74621y0)) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.f74617t0.cancel();
                                            this.f74621y0.tryAddThrowableOrReport(th2);
                                            this.f74621y0.tryTerminateConsumer(this.G0);
                                            return;
                                        }
                                    } else {
                                        this.E0 = true;
                                        publisher.subscribe(this.f74613p0);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.f74617t0.cancel();
                                    this.f74621y0.tryAddThrowableOrReport(th3);
                                    this.f74621y0.tryTerminateConsumer(this.G0);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.f74617t0.cancel();
                            this.f74621y0.tryAddThrowableOrReport(th4);
                            this.f74621y0.tryTerminateConsumer(this.G0);
                            return;
                        }
                    }
                    if (this.H0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public final void e() {
            this.G0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74613p0.cancel();
            HalfSerializer.onError(this.G0, th2, this, this.f74621y0);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74613p0.request(j10);
        }
    }

    public static final class e<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final f<R> f74622w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f74623x0;

        public e(f<R> fVar) {
            super(false);
            this.f74622w0 = fVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j10 = this.f74623x0;
            if (j10 != 0) {
                this.f74623x0 = 0L;
                produced(j10);
            }
            this.f74622w0.c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            long j10 = this.f74623x0;
            if (j10 != 0) {
                this.f74623x0 = 0L;
                produced(j10);
            }
            this.f74622w0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f74623x0++;
            this.f74622w0.b(r3);
        }
    }

    public interface f<T> {
        void a(Throwable th2);

        void b(T t10);

        void c();
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        super(flowable);
        this.f74609q0 = function;
        this.f74610r0 = i10;
        this.f74611s0 = errorMode;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        int i11 = a.f74612a[errorMode.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new d(subscriber, function, i10) : new c(i10, function, subscriber, true);
        }
        return new c(i10, function, subscriber, false);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends R>> function = this.f74609q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, function, this.f74610r0, this.f74611s0));
    }

    public static final class g<T> implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74624p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f74625q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f74626r0;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Object obj, e eVar) {
            this.f74625q0 = obj;
            this.f74624p0 = eVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (j10 <= 0 || this.f74626r0) {
                return;
            }
            this.f74626r0 = true;
            T t10 = this.f74625q0;
            Subscriber<? super T> subscriber = this.f74624p0;
            subscriber.onNext(t10);
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }
    }
}
