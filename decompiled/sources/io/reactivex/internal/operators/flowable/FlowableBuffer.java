package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, C> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f70218q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70219r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Callable<C> f70220s0;

    public static final class a<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f70221p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<C> f70222q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70223r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public C f70224s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70225t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f70226u0;
        public int v0;

        public a(Subscriber<? super C> subscriber, int i10, Callable<C> callable) {
            this.f70221p0 = subscriber;
            this.f70223r0 = i10;
            this.f70222q0 = callable;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70225t0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70226u0) {
                return;
            }
            this.f70226u0 = true;
            C c10 = this.f70224s0;
            Subscriber<? super C> subscriber = this.f70221p0;
            if (c10 != null && !c10.isEmpty()) {
                subscriber.onNext(c10);
            }
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70226u0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70226u0 = true;
                this.f70221p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70226u0) {
                return;
            }
            C c10 = this.f70224s0;
            if (c10 == null) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.f70222q0.call(), "The bufferSupplier returned a null buffer");
                    this.f70224s0 = c10;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c10.add(t10);
            int i10 = this.v0 + 1;
            if (i10 != this.f70223r0) {
                this.v0 = i10;
                return;
            }
            this.v0 = 0;
            this.f70224s0 = null;
            this.f70221p0.onNext(c10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70225t0, subscription)) {
                this.f70225t0 = subscription;
                this.f70221p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f70225t0.request(BackpressureHelper.multiplyCap(j10, this.f70223r0));
            }
        }
    }

    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {
        public long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f70227p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<C> f70228q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70229r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70230s0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f70233w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f70234x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f70235y0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicBoolean f70232u0 = new AtomicBoolean();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<C> f70231t0 = new ArrayDeque<>();

        public b(Subscriber<? super C> subscriber, int i10, int i11, Callable<C> callable) {
            this.f70227p0 = subscriber;
            this.f70229r0 = i10;
            this.f70230s0 = i11;
            this.f70228q0 = callable;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70235y0 = true;
            this.v0.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public final boolean getAsBoolean() {
            return this.f70235y0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70233w0) {
                return;
            }
            this.f70233w0 = true;
            long j10 = this.E0;
            if (j10 != 0) {
                BackpressureHelper.produced(this, j10);
            }
            QueueDrainHelper.postComplete(this.f70227p0, this.f70231t0, this, this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70233w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f70233w0 = true;
            this.f70231t0.clear();
            this.f70227p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70233w0) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f70231t0;
            int i10 = this.f70234x0;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    arrayDeque.offer((C) ((Collection) ObjectHelper.requireNonNull(this.f70228q0.call(), "The bufferSupplier returned a null buffer")));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            C cPeek = arrayDeque.peek();
            if (cPeek != null && cPeek.size() + 1 == this.f70229r0) {
                arrayDeque.poll();
                cPeek.add(t10);
                this.E0++;
                this.f70227p0.onNext(cPeek);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().add(t10);
            }
            if (i11 == this.f70230s0) {
                i11 = 0;
            }
            this.f70234x0 = i11;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f70227p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || QueueDrainHelper.postCompleteRequest(j10, this.f70227p0, this.f70231t0, this, this)) {
                return;
            }
            AtomicBoolean atomicBoolean = this.f70232u0;
            boolean z10 = atomicBoolean.get();
            int i10 = this.f70230s0;
            if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                this.v0.request(BackpressureHelper.multiplyCap(i10, j10));
            } else {
                this.v0.request(BackpressureHelper.addCap(this.f70229r0, BackpressureHelper.multiplyCap(i10, j10 - 1)));
            }
        }
    }

    public static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f70236p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<C> f70237q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f70238r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70239s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public C f70240t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f70241u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f70242w0;

        public c(Subscriber<? super C> subscriber, int i10, int i11, Callable<C> callable) {
            this.f70236p0 = subscriber;
            this.f70238r0 = i10;
            this.f70239s0 = i11;
            this.f70237q0 = callable;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70241u0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            C c10 = this.f70240t0;
            this.f70240t0 = null;
            Subscriber<? super C> subscriber = this.f70236p0;
            if (c10 != null) {
                subscriber.onNext(c10);
            }
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = true;
            this.f70240t0 = null;
            this.f70236p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            C c10 = this.f70240t0;
            int i10 = this.f70242w0;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.f70237q0.call(), "The bufferSupplier returned a null buffer");
                    this.f70240t0 = c10;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t10);
                if (c10.size() == this.f70238r0) {
                    this.f70240t0 = null;
                    this.f70236p0.onNext(c10);
                }
            }
            if (i11 == this.f70239s0) {
                i11 = 0;
            }
            this.f70242w0 = i11;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70241u0, subscription)) {
                this.f70241u0 = subscription;
                this.f70236p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = get();
                int i11 = this.f70239s0;
                if (i10 != 0 || !compareAndSet(0, 1)) {
                    this.f70241u0.request(BackpressureHelper.multiplyCap(i11, j10));
                    return;
                }
                int i12 = this.f70238r0;
                this.f70241u0.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j10, i12), BackpressureHelper.multiplyCap(i11 - i12, j10 - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i10, int i11, Callable<C> callable) {
        super(flowable);
        this.f70218q0 = i10;
        this.f70219r0 = i11;
        this.f70220s0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super C> subscriber) {
        Callable<C> callable = this.f70220s0;
        int i10 = this.f70218q0;
        int i11 = this.f70219r0;
        if (i10 == i11) {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, i10, callable));
        } else if (i11 > i10) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, i10, i11, callable));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, i10, i11, callable));
        }
    }
}
