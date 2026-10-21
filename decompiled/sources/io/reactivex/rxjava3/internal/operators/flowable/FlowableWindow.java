package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindow<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75614q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75615r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f75616s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f75617p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75618q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f75619r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f75620s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f75621t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f75622u0;
        public UnicastProcessor<T> v0;

        public a(Subscriber<? super Flowable<T>> subscriber, long j10, int i10) {
            super(1);
            this.f75617p0 = subscriber;
            this.f75618q0 = j10;
            this.f75619r0 = new AtomicBoolean();
            this.f75620s0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75619r0.compareAndSet(false, true)) {
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
            this.f75617p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.v0;
            if (unicastProcessor != null) {
                this.v0 = null;
                unicastProcessor.onError(th2);
            }
            this.f75617p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            io.reactivex.rxjava3.internal.operators.flowable.b bVar;
            long j10 = this.f75621t0;
            UnicastProcessor<T> unicastProcessorCreate = this.v0;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.f75620s0, this);
                this.v0 = unicastProcessorCreate;
                bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
                this.f75617p0.onNext(bVar);
            } else {
                bVar = null;
            }
            long j11 = j10 + 1;
            unicastProcessorCreate.onNext(t10);
            if (j11 == this.f75618q0) {
                this.f75621t0 = 0L;
                this.v0 = null;
                unicastProcessorCreate.onComplete();
            } else {
                this.f75621t0 = j11;
            }
            if (bVar == null || !bVar.e()) {
                return;
            }
            bVar.f75738q0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75622u0, subscription)) {
                this.f75622u0 = subscription;
                this.f75617p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f75622u0.request(BackpressureHelper.multiplyCap(this.f75618q0, j10));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f75622u0.cancel();
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
        public final Subscriber<? super Flowable<T>> f75623p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<UnicastProcessor<T>> f75624q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f75625r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f75626s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<UnicastProcessor<T>> f75627t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicBoolean f75628u0;
        public final AtomicBoolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicLong f75629w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicInteger f75630x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final int f75631y0;

        public b(Subscriber<? super Flowable<T>> subscriber, long j10, long j11, int i10) {
            super(1);
            this.f75623p0 = subscriber;
            this.f75625r0 = j10;
            this.f75626s0 = j11;
            this.f75624q0 = new SpscLinkedArrayQueue<>(i10);
            this.f75627t0 = new ArrayDeque<>();
            this.f75628u0 = new AtomicBoolean();
            this.v0 = new AtomicBoolean();
            this.f75629w0 = new AtomicLong();
            this.f75630x0 = new AtomicInteger();
            this.f75631y0 = i10;
        }

        public final void a() {
            if (this.f75630x0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f75623p0;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.f75624q0;
            int iAddAndGet = 1;
            while (true) {
                if (this.J0) {
                    while (true) {
                        UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                        if (unicastProcessorPoll == null) {
                            break;
                        } else {
                            unicastProcessorPoll.onComplete();
                        }
                    }
                } else {
                    long j10 = this.f75629w0.get();
                    long j11 = 0;
                    while (true) {
                        if (j11 != j10) {
                            boolean z10 = this.H0;
                            UnicastProcessor<T> unicastProcessorPoll2 = spscLinkedArrayQueue.poll();
                            boolean z11 = unicastProcessorPoll2 == null;
                            if (this.J0) {
                                continue;
                            } else {
                                if (z10) {
                                    Throwable th2 = this.I0;
                                    if (th2 != null) {
                                        spscLinkedArrayQueue.clear();
                                        subscriber.onError(th2);
                                        return;
                                    } else if (z11) {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (!z11) {
                                    io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorPoll2);
                                    subscriber.onNext(bVar);
                                    if (bVar.e()) {
                                        unicastProcessorPoll2.onComplete();
                                    }
                                    j11++;
                                }
                            }
                        }
                        if (j11 == j10) {
                            if (this.J0) {
                                continue;
                            } else {
                                boolean z12 = this.H0;
                                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                                if (z12) {
                                    Throwable th3 = this.I0;
                                    if (th3 != null) {
                                        spscLinkedArrayQueue.clear();
                                        subscriber.onError(th3);
                                        return;
                                    } else if (zIsEmpty) {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                            }
                        }
                        if (j11 != 0 && j10 != Long.MAX_VALUE) {
                            this.f75629w0.addAndGet(-j11);
                        }
                    }
                }
                iAddAndGet = this.f75630x0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.J0 = true;
            if (this.f75628u0.compareAndSet(false, true)) {
                run();
            }
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Iterator<UnicastProcessor<T>> it = this.f75627t0.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f75627t0.clear();
            this.H0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Iterator<UnicastProcessor<T>> it = this.f75627t0.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f75627t0.clear();
            this.I0 = th2;
            this.H0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            UnicastProcessor<T> unicastProcessorCreate;
            long j10 = this.E0;
            if (j10 != 0 || this.J0) {
                unicastProcessorCreate = null;
            } else {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.f75631y0, this);
                this.f75627t0.offer(unicastProcessorCreate);
            }
            long j11 = j10 + 1;
            Iterator<UnicastProcessor<T>> it = this.f75627t0.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (unicastProcessorCreate != null) {
                this.f75624q0.offer(unicastProcessorCreate);
                a();
            }
            long j12 = this.F0 + 1;
            if (j12 == this.f75625r0) {
                this.F0 = j12 - this.f75626s0;
                UnicastProcessor<T> unicastProcessorPoll = this.f75627t0.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.F0 = j12;
            }
            if (j11 == this.f75626s0) {
                this.E0 = 0L;
            } else {
                this.E0 = j11;
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.G0, subscription)) {
                this.G0 = subscription;
                this.f75623p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75629w0, j10);
                AtomicBoolean atomicBoolean = this.v0;
                boolean z10 = atomicBoolean.get();
                long j11 = this.f75626s0;
                if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                    this.G0.request(BackpressureHelper.multiplyCap(j11, j10));
                } else {
                    this.G0.request(BackpressureHelper.addCap(this.f75625r0, BackpressureHelper.multiplyCap(j11, j10 - 1)));
                }
                a();
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
        public final Subscriber<? super Flowable<T>> f75632p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75633q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f75634r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f75635s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicBoolean f75636t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f75637u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Subscription f75638w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public UnicastProcessor<T> f75639x0;

        public c(Subscriber<? super Flowable<T>> subscriber, long j10, long j11, int i10) {
            super(1);
            this.f75632p0 = subscriber;
            this.f75633q0 = j10;
            this.f75634r0 = j11;
            this.f75635s0 = new AtomicBoolean();
            this.f75636t0 = new AtomicBoolean();
            this.f75637u0 = i10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75635s0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f75639x0;
            if (unicastProcessor != null) {
                this.f75639x0 = null;
                unicastProcessor.onComplete();
            }
            this.f75632p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.f75639x0;
            if (unicastProcessor != null) {
                this.f75639x0 = null;
                unicastProcessor.onError(th2);
            }
            this.f75632p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            io.reactivex.rxjava3.internal.operators.flowable.b bVar;
            long j10 = this.v0;
            UnicastProcessor<T> unicastProcessorCreate = this.f75639x0;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.f75637u0, this);
                this.f75639x0 = unicastProcessorCreate;
                bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
                this.f75632p0.onNext(bVar);
            } else {
                bVar = null;
            }
            long j11 = j10 + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t10);
            }
            if (j11 == this.f75633q0) {
                this.f75639x0 = null;
                unicastProcessorCreate.onComplete();
            }
            if (j11 == this.f75634r0) {
                this.v0 = 0L;
            } else {
                this.v0 = j11;
            }
            if (bVar == null || !bVar.e()) {
                return;
            }
            bVar.f75738q0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75638w0, subscription)) {
                this.f75638w0 = subscription;
                this.f75632p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                AtomicBoolean atomicBoolean = this.f75636t0;
                boolean z10 = atomicBoolean.get();
                long j11 = this.f75634r0;
                if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                    this.f75638w0.request(BackpressureHelper.multiplyCap(j11, j10));
                } else {
                    long j12 = this.f75633q0;
                    this.f75638w0.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j12, j10), BackpressureHelper.multiplyCap(j11 - j12, j10 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f75638w0.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j10, long j11, int i10) {
        super(flowable);
        this.f75614q0 = j10;
        this.f75615r0 = j11;
        this.f75616s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        long j10 = this.f75615r0;
        long j11 = this.f75614q0;
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, j11, this.f75616s0));
        } else if (j10 > j11) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, this.f75614q0, this.f75615r0, this.f75616s0));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, this.f75614q0, this.f75615r0, this.f75616s0));
        }
    }
}
