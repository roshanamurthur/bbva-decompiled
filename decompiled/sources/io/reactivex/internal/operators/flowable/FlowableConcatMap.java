package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f70355q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70356r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ErrorMode f70357s0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70358a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f70358a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70358a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, f<R>, Subscription {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f70360q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70361r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70362s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70363t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f70364u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f70365w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f70366x0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final e<R> f70359p0 = new e<>(this);

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicThrowable f70367y0 = new AtomicThrowable();

        public b(Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
            this.f70360q0 = function;
            this.f70361r0 = i10;
            this.f70362s0 = i10 - (i10 >> 2);
        }

        public abstract void c();

        public abstract void d();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70365w0 = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.F0 == 2 || this.v0.offer(t10)) {
                c();
            } else {
                this.f70363t0.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70363t0, subscription)) {
                this.f70363t0 = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        this.f70365w0 = true;
                        d();
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueSubscription;
                        d();
                        subscription.request(this.f70361r0);
                        return;
                    }
                }
                this.v0 = new SpscArrayQueue(this.f70361r0);
                d();
                subscription.request(this.f70361r0);
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

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            if (!this.f70367y0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.H0) {
                this.f70363t0.cancel();
                this.f70365w0 = true;
            }
            this.E0 = false;
            c();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            this.G0.onNext(r3);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void c() {
            Object objCall;
            if (getAndIncrement() == 0) {
                while (!this.f70366x0) {
                    if (!this.E0) {
                        boolean z10 = this.f70365w0;
                        if (z10 && !this.H0 && this.f70367y0.get() != null) {
                            this.G0.onError(this.f70367y0.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.v0.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                Throwable thTerminate = this.f70367y0.terminate();
                                if (thTerminate != null) {
                                    this.G0.onError(thTerminate);
                                    return;
                                } else {
                                    this.G0.onComplete();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70360q0.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.F0 != 1) {
                                        int i10 = this.f70364u0 + 1;
                                        if (i10 == this.f70362s0) {
                                            this.f70364u0 = 0;
                                            this.f70363t0.request(i10);
                                        } else {
                                            this.f70364u0 = i10;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            objCall = ((Callable) publisher).call();
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.f70367y0.addThrowable(th2);
                                            if (!this.H0) {
                                                this.f70363t0.cancel();
                                                this.G0.onError(this.f70367y0.terminate());
                                                return;
                                            }
                                            objCall = null;
                                        }
                                        if (objCall == null) {
                                            continue;
                                        } else if (this.f70359p0.isUnbounded()) {
                                            this.G0.onNext(objCall);
                                        } else {
                                            this.E0 = true;
                                            this.f70359p0.setSubscription(new g(objCall, this.f70359p0));
                                        }
                                    } else {
                                        this.E0 = true;
                                        publisher.subscribe(this.f70359p0);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.f70363t0.cancel();
                                    this.f70367y0.addThrowable(th3);
                                    this.G0.onError(this.f70367y0.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.f70363t0.cancel();
                            this.f70367y0.addThrowable(th4);
                            this.G0.onError(this.f70367y0.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70366x0) {
                return;
            }
            this.f70366x0 = true;
            this.f70359p0.cancel();
            this.f70363t0.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            this.G0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f70367y0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70365w0 = true;
                c();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70359p0.request(j10);
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

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public final void a(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f70367y0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70363t0.cancel();
            if (getAndIncrement() == 0) {
                this.G0.onError(atomicThrowable.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public final void b(R r3) {
            if (get() == 0 && compareAndSet(0, 1)) {
                Subscriber<? super R> subscriber = this.G0;
                subscriber.onNext(r3);
                if (compareAndSet(1, 0)) {
                    return;
                }
                subscriber.onError(this.f70367y0.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void c() {
            if (this.H0.getAndIncrement() == 0) {
                while (!this.f70366x0) {
                    if (!this.E0) {
                        boolean z10 = this.f70365w0;
                        try {
                            T tPoll = this.v0.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.G0.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70360q0.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.F0 != 1) {
                                        int i10 = this.f70364u0 + 1;
                                        if (i10 == this.f70362s0) {
                                            this.f70364u0 = 0;
                                            this.f70363t0.request(i10);
                                        } else {
                                            this.f70364u0 = i10;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.f70359p0.isUnbounded()) {
                                                this.E0 = true;
                                                this.f70359p0.setSubscription(new g(objCall, this.f70359p0));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.G0.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.G0.onError(this.f70367y0.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.f70363t0.cancel();
                                            this.f70367y0.addThrowable(th2);
                                            this.G0.onError(this.f70367y0.terminate());
                                            return;
                                        }
                                    } else {
                                        this.E0 = true;
                                        publisher.subscribe(this.f70359p0);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.f70363t0.cancel();
                                    this.f70367y0.addThrowable(th3);
                                    this.G0.onError(this.f70367y0.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.f70363t0.cancel();
                            this.f70367y0.addThrowable(th4);
                            this.G0.onError(this.f70367y0.terminate());
                            return;
                        }
                    }
                    if (this.H0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70366x0) {
                return;
            }
            this.f70366x0 = true;
            this.f70359p0.cancel();
            this.f70363t0.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            this.G0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f70367y0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70359p0.cancel();
            if (getAndIncrement() == 0) {
                this.G0.onError(atomicThrowable.terminate());
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70359p0.request(j10);
        }
    }

    public static final class e<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final f<R> f70368w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f70369x0;

        public e(f<R> fVar) {
            super(false);
            this.f70368w0 = fVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j10 = this.f70369x0;
            if (j10 != 0) {
                this.f70369x0 = 0L;
                produced(j10);
            }
            b bVar = (b) this.f70368w0;
            bVar.E0 = false;
            bVar.c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            long j10 = this.f70369x0;
            if (j10 != 0) {
                this.f70369x0 = 0L;
                produced(j10);
            }
            this.f70368w0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f70369x0++;
            this.f70368w0.b(r3);
        }
    }

    public interface f<T> {
        void a(Throwable th2);

        void b(T t10);
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        super(flowable);
        this.f70355q0 = function;
        this.f70356r0 = i10;
        this.f70357s0 = errorMode;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i10, ErrorMode errorMode) {
        int i11 = a.f70358a[errorMode.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new d(subscriber, function, i10) : new c(i10, function, subscriber, true);
        }
        return new c(i10, function, subscriber, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        Function<? super T, ? extends Publisher<? extends R>> function = this.f70355q0;
        if (FlowableScalarXMap.tryScalarXMapSubscribe(flowable, subscriber, function)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, function, this.f70356r0, this.f70357s0));
    }

    public static final class g<T> extends AtomicBoolean implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70370p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f70371q0;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Object obj, e eVar) {
            this.f70371q0 = obj;
            this.f70370p0 = eVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (j10 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            T t10 = this.f70371q0;
            Subscriber<? super T> subscriber = this.f70370p0;
            subscriber.onNext(t10);
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }
    }
}
