package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, C> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f74480q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74481r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Supplier<C> f74482s0;

    public static final class a<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f74483p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<C> f74484q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74485r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public C f74486s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f74487t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74488u0;
        public int v0;

        public a(Subscriber<? super C> subscriber, int i10, Supplier<C> supplier) {
            this.f74483p0 = subscriber;
            this.f74485r0 = i10;
            this.f74484q0 = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74487t0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74488u0) {
                return;
            }
            this.f74488u0 = true;
            C c10 = this.f74486s0;
            this.f74486s0 = null;
            Subscriber<? super C> subscriber = this.f74483p0;
            if (c10 != null) {
                subscriber.onNext(c10);
            }
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74488u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74486s0 = null;
            this.f74488u0 = true;
            this.f74483p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74488u0) {
                return;
            }
            C c10 = this.f74486s0;
            if (c10 == null) {
                try {
                    C c11 = this.f74484q0.get();
                    Objects.requireNonNull(c11, "The bufferSupplier returned a null buffer");
                    c10 = c11;
                    this.f74486s0 = c10;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c10.add(t10);
            int i10 = this.v0 + 1;
            if (i10 != this.f74485r0) {
                this.v0 = i10;
                return;
            }
            this.v0 = 0;
            this.f74486s0 = null;
            this.f74483p0.onNext(c10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74487t0, subscription)) {
                this.f74487t0 = subscription;
                this.f74483p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f74487t0.request(BackpressureHelper.multiplyCap(j10, this.f74485r0));
            }
        }
    }

    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {
        public long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f74489p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<C> f74490q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74491r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74492s0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f74495w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f74496x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74497y0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicBoolean f74494u0 = new AtomicBoolean();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<C> f74493t0 = new ArrayDeque<>();

        public b(Subscriber<? super C> subscriber, int i10, int i11, Supplier<C> supplier) {
            this.f74489p0 = subscriber;
            this.f74491r0 = i10;
            this.f74492s0 = i11;
            this.f74490q0 = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74497y0 = true;
            this.v0.cancel();
        }

        @Override // io.reactivex.rxjava3.functions.BooleanSupplier
        public final boolean getAsBoolean() {
            return this.f74497y0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74495w0) {
                return;
            }
            this.f74495w0 = true;
            long j10 = this.E0;
            if (j10 != 0) {
                BackpressureHelper.produced(this, j10);
            }
            QueueDrainHelper.postComplete(this.f74489p0, this.f74493t0, this, this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74495w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74495w0 = true;
            this.f74493t0.clear();
            this.f74489p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74495w0) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f74493t0;
            int i10 = this.f74496x0;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    C c10 = this.f74490q0.get();
                    Objects.requireNonNull(c10, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(c10);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.f74491r0) {
                arrayDeque.poll();
                collection.add(t10);
                this.E0++;
                this.f74489p0.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t10);
            }
            if (i11 == this.f74492s0) {
                i11 = 0;
            }
            this.f74496x0 = i11;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f74489p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || QueueDrainHelper.postCompleteRequest(j10, this.f74489p0, this.f74493t0, this, this)) {
                return;
            }
            AtomicBoolean atomicBoolean = this.f74494u0;
            boolean z10 = atomicBoolean.get();
            int i10 = this.f74492s0;
            if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                this.v0.request(BackpressureHelper.multiplyCap(i10, j10));
            } else {
                this.v0.request(BackpressureHelper.addCap(this.f74491r0, BackpressureHelper.multiplyCap(i10, j10 - 1)));
            }
        }
    }

    public static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f74498p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<C> f74499q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74500r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74501s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public C f74502t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f74503u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f74504w0;

        public c(Subscriber<? super C> subscriber, int i10, int i11, Supplier<C> supplier) {
            this.f74498p0 = subscriber;
            this.f74500r0 = i10;
            this.f74501s0 = i11;
            this.f74499q0 = supplier;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74503u0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            C c10 = this.f74502t0;
            this.f74502t0 = null;
            Subscriber<? super C> subscriber = this.f74498p0;
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
            this.f74502t0 = null;
            this.f74498p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            C c10 = this.f74502t0;
            int i10 = this.f74504w0;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    C c11 = this.f74499q0.get();
                    Objects.requireNonNull(c11, "The bufferSupplier returned a null buffer");
                    c10 = c11;
                    this.f74502t0 = c10;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t10);
                if (c10.size() == this.f74500r0) {
                    this.f74502t0 = null;
                    this.f74498p0.onNext(c10);
                }
            }
            if (i11 == this.f74501s0) {
                i11 = 0;
            }
            this.f74504w0 = i11;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74503u0, subscription)) {
                this.f74503u0 = subscription;
                this.f74498p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = get();
                int i11 = this.f74501s0;
                if (i10 != 0 || !compareAndSet(0, 1)) {
                    this.f74503u0.request(BackpressureHelper.multiplyCap(i11, j10));
                    return;
                }
                int i12 = this.f74500r0;
                this.f74503u0.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j10, i12), BackpressureHelper.multiplyCap(i11 - i12, j10 - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i10, int i11, Supplier<C> supplier) {
        super(flowable);
        this.f74480q0 = i10;
        this.f74481r0 = i11;
        this.f74482s0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super C> subscriber) {
        Supplier<C> supplier = this.f74482s0;
        int i10 = this.f74480q0;
        int i11 = this.f74481r0;
        if (i10 == i11) {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, i10, supplier));
        } else if (i11 > i10) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, i10, i11, supplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, i10, i11, supplier));
        }
    }
}
