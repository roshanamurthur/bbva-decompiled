package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWindow<T> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71358q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71359r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71360s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f71361p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71362q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f71363r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f71364s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f71365t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f71366u0;
        public UnicastProcessor<T> v0;

        public a(Subscriber<? super Flowable<T>> subscriber, long j10, int i10) {
            super(1);
            this.f71361p0 = subscriber;
            this.f71362q0 = j10;
            this.f71363r0 = new AtomicBoolean();
            this.f71364s0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f71363r0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.v0;
            if (unicastProcessor != null) {
                this.v0 = null;
                unicastProcessor.onComplete();
            }
            this.f71361p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.v0;
            if (unicastProcessor != null) {
                this.v0 = null;
                unicastProcessor.onError(th2);
            }
            this.f71361p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = this.f71365t0;
            UnicastProcessor<T> unicastProcessorCreate = this.v0;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.f71364s0, this);
                this.v0 = unicastProcessorCreate;
                this.f71361p0.onNext(unicastProcessorCreate);
            }
            long j11 = j10 + 1;
            unicastProcessorCreate.onNext(t10);
            if (j11 != this.f71362q0) {
                this.f71365t0 = j11;
                return;
            }
            this.f71365t0 = 0L;
            this.v0 = null;
            unicastProcessorCreate.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71366u0, subscription)) {
                this.f71366u0 = subscription;
                this.f71361p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f71366u0.request(BackpressureHelper.multiplyCap(this.f71362q0, j10));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f71366u0.cancel();
            }
        }
    }

    public static final class b<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public long E0;
        public long F0;
        public Subscription G0;
        public volatile boolean H0;
        public Throwable I0;
        public volatile boolean J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f71367p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<UnicastProcessor<T>> f71368q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71369r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f71370s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<UnicastProcessor<T>> f71371t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicBoolean f71372u0;
        public final AtomicBoolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicLong f71373w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicInteger f71374x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final int f71375y0;

        public b(Subscriber<? super Flowable<T>> subscriber, long j10, long j11, int i10) {
            super(1);
            this.f71367p0 = subscriber;
            this.f71369r0 = j10;
            this.f71370s0 = j11;
            this.f71368q0 = new SpscLinkedArrayQueue<>(i10);
            this.f71371t0 = new ArrayDeque<>();
            this.f71372u0 = new AtomicBoolean();
            this.v0 = new AtomicBoolean();
            this.f71373w0 = new AtomicLong();
            this.f71374x0 = new AtomicInteger();
            this.f71375y0 = i10;
        }

        public final boolean a(boolean z10, boolean z11, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.J0) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.I0;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void b() {
            if (this.f71374x0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f71367p0;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.f71368q0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f71373w0.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.H0;
                    UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                    boolean z11 = unicastProcessorPoll == null;
                    if (a(z10, z11, subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(unicastProcessorPoll);
                    j11++;
                }
                if (j11 == j10 && a(this.H0, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f71373w0.addAndGet(-j11);
                }
                iAddAndGet = this.f71374x0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.J0 = true;
            if (this.f71372u0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.H0) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f71371t0.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f71371t0.clear();
            this.H0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.H0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f71371t0.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f71371t0.clear();
            this.I0 = th2;
            this.H0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.H0) {
                return;
            }
            long j10 = this.E0;
            if (j10 == 0 && !this.J0) {
                getAndIncrement();
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f71375y0, this);
                this.f71371t0.offer(unicastProcessorCreate);
                this.f71368q0.offer(unicastProcessorCreate);
                b();
            }
            long j11 = j10 + 1;
            Iterator<UnicastProcessor<T>> it = this.f71371t0.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            long j12 = this.F0 + 1;
            if (j12 == this.f71369r0) {
                this.F0 = j12 - this.f71370s0;
                UnicastProcessor<T> unicastProcessorPoll = this.f71371t0.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.F0 = j12;
            }
            if (j11 == this.f71370s0) {
                this.E0 = 0L;
            } else {
                this.E0 = j11;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.G0, subscription)) {
                this.G0 = subscription;
                this.f71367p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71373w0, j10);
                AtomicBoolean atomicBoolean = this.v0;
                boolean z10 = atomicBoolean.get();
                long j11 = this.f71370s0;
                if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                    this.G0.request(BackpressureHelper.multiplyCap(j11, j10));
                } else {
                    this.G0.request(BackpressureHelper.addCap(this.f71369r0, BackpressureHelper.multiplyCap(j11, j10 - 1)));
                }
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.G0.cancel();
            }
        }
    }

    public static final class c<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f71376p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71377q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71378r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f71379s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicBoolean f71380t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71381u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f71382w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public UnicastProcessor<T> f71383x0;

        public c(Subscriber<? super Flowable<T>> subscriber, long j10, long j11, int i10) {
            super(1);
            this.f71376p0 = subscriber;
            this.f71377q0 = j10;
            this.f71378r0 = j11;
            this.f71379s0 = new AtomicBoolean();
            this.f71380t0 = new AtomicBoolean();
            this.f71381u0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f71379s0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f71383x0;
            if (unicastProcessor != null) {
                this.f71383x0 = null;
                unicastProcessor.onComplete();
            }
            this.f71376p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.f71383x0;
            if (unicastProcessor != null) {
                this.f71383x0 = null;
                unicastProcessor.onError(th2);
            }
            this.f71376p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            long j10 = this.v0;
            UnicastProcessor<T> unicastProcessorCreate = this.f71383x0;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.f71381u0, this);
                this.f71383x0 = unicastProcessorCreate;
                this.f71376p0.onNext(unicastProcessorCreate);
            }
            long j11 = j10 + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t10);
            }
            if (j11 == this.f71377q0) {
                this.f71383x0 = null;
                unicastProcessorCreate.onComplete();
            }
            if (j11 == this.f71378r0) {
                this.v0 = 0L;
            } else {
                this.v0 = j11;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71382w0, subscription)) {
                this.f71382w0 = subscription;
                this.f71376p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                AtomicBoolean atomicBoolean = this.f71380t0;
                boolean z10 = atomicBoolean.get();
                long j11 = this.f71378r0;
                if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                    this.f71382w0.request(BackpressureHelper.multiplyCap(j11, j10));
                } else {
                    long j12 = this.f71377q0;
                    this.f71382w0.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j12, j10), BackpressureHelper.multiplyCap(j11 - j12, j10 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f71382w0.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j10, long j11, int i10) {
        super(flowable);
        this.f71358q0 = j10;
        this.f71359r0 = j11;
        this.f71360s0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        long j10 = this.f71359r0;
        long j11 = this.f71358q0;
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, j11, this.f71360s0));
        } else if (j10 > j11) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, this.f71358q0, this.f71359r0, this.f71360s0));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, this.f71358q0, this.f71359r0, this.f71360s0));
        }
    }
}
