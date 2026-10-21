package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.datastore.preferences.protobuf.e;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75671q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f75672r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f75673s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f75674t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f75675u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f75676w0;

    public static abstract class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f75677p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f75679r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f75680s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f75681t0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75683w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f75684x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f75685y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MpscLinkedQueue f75678q0 = new MpscLinkedQueue();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f75682u0 = new AtomicLong();
        public final AtomicBoolean E0 = new AtomicBoolean();
        public final AtomicInteger G0 = new AtomicInteger(1);

        public a(Subscriber<? super Flowable<T>> subscriber, long j10, TimeUnit timeUnit, int i10) {
            this.f75677p0 = subscriber;
            this.f75679r0 = j10;
            this.f75680s0 = timeUnit;
            this.f75681t0 = i10;
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.E0.compareAndSet(false, true)) {
                d();
            }
        }

        public final void d() {
            if (this.G0.decrementAndGet() == 0) {
                a();
                this.f75685y0.cancel();
                this.F0 = true;
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75683w0 = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75684x0 = th2;
            this.f75683w0 = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75678q0.offer(t10);
            c();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75685y0, subscription)) {
                this.f75685y0 = subscription;
                this.f75677p0.onSubscribe(this);
                b();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75682u0, j10);
            }
        }

        public void run() {
            d();
        }
    }

    public static final class b<T> extends a<T> implements Runnable {
        public final Scheduler H0;
        public final boolean I0;
        public final long J0;
        public final Scheduler.Worker K0;
        public long L0;
        public UnicastProcessor<T> M0;
        public final SequentialDisposable N0;

        public static final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b<?> f75686p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final long f75687q0;

            public a(b<?> bVar, long j10) {
                this.f75686p0 = bVar;
                this.f75687q0 = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b<?> bVar = this.f75686p0;
                bVar.f75678q0.offer(this);
                bVar.c();
            }
        }

        public b(int i10, long j10, long j11, Scheduler scheduler, TimeUnit timeUnit, Subscriber subscriber, boolean z10) {
            super(subscriber, j10, timeUnit, i10);
            this.H0 = scheduler;
            this.J0 = j11;
            this.I0 = z10;
            if (z10) {
                this.K0 = scheduler.createWorker();
            } else {
                this.K0 = null;
            }
            this.N0 = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void a() {
            this.N0.dispose();
            Scheduler.Worker worker = this.K0;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void b() {
            if (this.E0.get()) {
                return;
            }
            if (this.f75682u0.get() == 0) {
                this.f75685y0.cancel();
                this.f75677p0.onError(new MissingBackpressureException(FlowableWindowTimed.e(this.v0)));
                a();
                this.F0 = true;
                return;
            }
            this.v0 = 1L;
            this.G0.getAndIncrement();
            this.M0 = UnicastProcessor.create(this.f75681t0, this);
            io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(this.M0);
            this.f75677p0.onNext(bVar);
            a aVar = new a(this, 1L);
            if (this.I0) {
                SequentialDisposable sequentialDisposable = this.N0;
                Scheduler.Worker worker = this.K0;
                long j10 = this.f75679r0;
                sequentialDisposable.replace(worker.schedulePeriodically(aVar, j10, j10, this.f75680s0));
            } else {
                SequentialDisposable sequentialDisposable2 = this.N0;
                Scheduler scheduler = this.H0;
                long j11 = this.f75679r0;
                sequentialDisposable2.replace(scheduler.schedulePeriodicallyDirect(aVar, j11, j11, this.f75680s0));
            }
            if (bVar.e()) {
                this.M0.onComplete();
            }
            this.f75685y0.request(Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f75678q0;
            Subscriber<? super Flowable<T>> subscriber = this.f75677p0;
            UnicastProcessor<T> unicastProcessorE = this.M0;
            int iAddAndGet = 1;
            while (true) {
                if (this.F0) {
                    mpscLinkedQueue.clear();
                    unicastProcessorE = null;
                    this.M0 = null;
                } else {
                    boolean z10 = this.f75683w0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f75684x0;
                        if (th2 != null) {
                            if (unicastProcessorE != null) {
                                unicastProcessorE.onError(th2);
                            }
                            subscriber.onError(th2);
                        } else {
                            if (unicastProcessorE != null) {
                                unicastProcessorE.onComplete();
                            }
                            subscriber.onComplete();
                        }
                        a();
                        this.F0 = true;
                    } else if (!z11) {
                        if (tPoll instanceof a) {
                            if (((a) tPoll).f75687q0 == this.v0 || !this.I0) {
                                this.L0 = 0L;
                                unicastProcessorE = e(unicastProcessorE);
                            }
                        } else if (unicastProcessorE != null) {
                            unicastProcessorE.onNext(tPoll);
                            long j10 = this.L0 + 1;
                            if (j10 == this.J0) {
                                this.L0 = 0L;
                                unicastProcessorE = e(unicastProcessorE);
                            } else {
                                this.L0 = j10;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final UnicastProcessor<T> e(UnicastProcessor<T> unicastProcessor) {
            if (unicastProcessor != null) {
                unicastProcessor.onComplete();
                unicastProcessor = null;
            }
            if (this.E0.get()) {
                a();
            } else {
                long j10 = this.v0;
                if (this.f75682u0.get() == j10) {
                    this.f75685y0.cancel();
                    a();
                    this.F0 = true;
                    this.f75677p0.onError(new MissingBackpressureException(FlowableWindowTimed.e(j10)));
                } else {
                    long j11 = j10 + 1;
                    this.v0 = j11;
                    this.G0.getAndIncrement();
                    unicastProcessor = UnicastProcessor.create(this.f75681t0, this);
                    this.M0 = unicastProcessor;
                    io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessor);
                    this.f75677p0.onNext(bVar);
                    if (this.I0) {
                        SequentialDisposable sequentialDisposable = this.N0;
                        Scheduler.Worker worker = this.K0;
                        a aVar = new a(this, j11);
                        long j12 = this.f75679r0;
                        sequentialDisposable.update(worker.schedulePeriodically(aVar, j12, j12, this.f75680s0));
                    }
                    if (bVar.e()) {
                        unicastProcessor.onComplete();
                    }
                }
            }
            return unicastProcessor;
        }
    }

    public static final class c<T> extends a<T> implements Runnable {
        public static final Object L0 = new Object();
        public final Scheduler H0;
        public UnicastProcessor<T> I0;
        public final SequentialDisposable J0;
        public final a K0;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.d();
            }
        }

        public c(Subscriber<? super Flowable<T>> subscriber, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(subscriber, j10, timeUnit, i10);
            this.H0 = scheduler;
            this.J0 = new SequentialDisposable();
            this.K0 = new a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void a() {
            this.J0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void b() {
            if (this.E0.get()) {
                return;
            }
            if (this.f75682u0.get() == 0) {
                this.f75685y0.cancel();
                this.f75677p0.onError(new MissingBackpressureException(FlowableWindowTimed.e(this.v0)));
                a();
                this.F0 = true;
                return;
            }
            this.G0.getAndIncrement();
            this.I0 = UnicastProcessor.create(this.f75681t0, this.K0);
            this.v0 = 1L;
            io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(this.I0);
            this.f75677p0.onNext(bVar);
            SequentialDisposable sequentialDisposable = this.J0;
            Scheduler scheduler = this.H0;
            long j10 = this.f75679r0;
            sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f75680s0));
            if (bVar.e()) {
                this.I0.onComplete();
            }
            this.f75685y0.request(Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f75678q0;
            Subscriber<? super Flowable<T>> subscriber = this.f75677p0;
            UnicastProcessor<T> unicastProcessorCreate = this.I0;
            int iAddAndGet = 1;
            while (true) {
                if (this.F0) {
                    mpscLinkedQueue.clear();
                    this.I0 = null;
                    unicastProcessorCreate = null;
                } else {
                    boolean z10 = this.f75683w0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f75684x0;
                        if (th2 != null) {
                            if (unicastProcessorCreate != null) {
                                unicastProcessorCreate.onError(th2);
                            }
                            subscriber.onError(th2);
                        } else {
                            if (unicastProcessorCreate != null) {
                                unicastProcessorCreate.onComplete();
                            }
                            subscriber.onComplete();
                        }
                        a();
                        this.F0 = true;
                    } else if (!z11) {
                        if (tPoll == L0) {
                            if (unicastProcessorCreate != null) {
                                unicastProcessorCreate.onComplete();
                                this.I0 = null;
                                unicastProcessorCreate = null;
                            }
                            if (this.E0.get()) {
                                this.J0.dispose();
                            } else {
                                long j10 = this.f75682u0.get();
                                long j11 = this.v0;
                                if (j10 == j11) {
                                    this.f75685y0.cancel();
                                    a();
                                    this.F0 = true;
                                    subscriber.onError(new MissingBackpressureException(FlowableWindowTimed.e(this.v0)));
                                } else {
                                    this.v0 = j11 + 1;
                                    this.G0.getAndIncrement();
                                    unicastProcessorCreate = UnicastProcessor.create(this.f75681t0, this.K0);
                                    this.I0 = unicastProcessorCreate;
                                    io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
                                    subscriber.onNext(bVar);
                                    if (bVar.e()) {
                                        unicastProcessorCreate.onComplete();
                                    }
                                }
                            }
                        } else if (unicastProcessorCreate != null) {
                            unicastProcessorCreate.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a, java.lang.Runnable
        public final void run() {
            this.f75678q0.offer(L0);
            c();
        }
    }

    public static final class d<T> extends a<T> implements Runnable {
        public static final Object K0 = new Object();
        public static final Object L0 = new Object();
        public final long H0;
        public final Scheduler.Worker I0;
        public final LinkedList J0;

        public static final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final d<?> f75689p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final boolean f75690q0;

            public a(d<?> dVar, boolean z10) {
                this.f75689p0 = dVar;
                this.f75690q0 = z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                d<?> dVar = this.f75689p0;
                dVar.f75678q0.offer(this.f75690q0 ? d.K0 : d.L0);
                dVar.c();
            }
        }

        public d(Subscriber<? super Flowable<T>> subscriber, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(subscriber, j10, timeUnit, i10);
            this.H0 = j11;
            this.I0 = worker;
            this.J0 = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void a() {
            this.I0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void b() {
            if (this.E0.get()) {
                return;
            }
            if (this.f75682u0.get() == 0) {
                this.f75685y0.cancel();
                this.f75677p0.onError(new MissingBackpressureException(FlowableWindowTimed.e(this.v0)));
                a();
                this.F0 = true;
                return;
            }
            this.v0 = 1L;
            this.G0.getAndIncrement();
            UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.f75681t0, this);
            this.J0.add(unicastProcessorCreate);
            io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
            this.f75677p0.onNext(bVar);
            this.I0.schedule(new a(this, false), this.f75679r0, this.f75680s0);
            Scheduler.Worker worker = this.I0;
            a aVar = new a(this, true);
            long j10 = this.H0;
            worker.schedulePeriodically(aVar, j10, j10, this.f75680s0);
            if (bVar.e()) {
                unicastProcessorCreate.onComplete();
                this.J0.remove(unicastProcessorCreate);
            }
            this.f75685y0.request(Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f75678q0;
            Subscriber<? super Flowable<T>> subscriber = this.f75677p0;
            LinkedList linkedList = this.J0;
            int iAddAndGet = 1;
            while (true) {
                if (this.F0) {
                    mpscLinkedQueue.clear();
                    linkedList.clear();
                } else {
                    boolean z10 = this.f75683w0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f75684x0;
                        if (th2 != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((UnicastProcessor) it.next()).onError(th2);
                            }
                            subscriber.onError(th2);
                        } else {
                            Iterator it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                                ((UnicastProcessor) it2.next()).onComplete();
                            }
                            subscriber.onComplete();
                        }
                        a();
                        this.F0 = true;
                    } else if (!z11) {
                        if (tPoll == K0) {
                            if (!this.E0.get()) {
                                long j10 = this.v0;
                                if (this.f75682u0.get() != j10) {
                                    this.v0 = j10 + 1;
                                    this.G0.getAndIncrement();
                                    UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.f75681t0, this);
                                    linkedList.add(unicastProcessorCreate);
                                    io.reactivex.rxjava3.internal.operators.flowable.b bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(unicastProcessorCreate);
                                    subscriber.onNext(bVar);
                                    this.I0.schedule(new a(this, false), this.f75679r0, this.f75680s0);
                                    if (bVar.e()) {
                                        unicastProcessorCreate.onComplete();
                                    }
                                } else {
                                    this.f75685y0.cancel();
                                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException(FlowableWindowTimed.e(j10));
                                    Iterator it3 = linkedList.iterator();
                                    while (it3.hasNext()) {
                                        ((UnicastProcessor) it3.next()).onError(missingBackpressureException);
                                    }
                                    subscriber.onError(missingBackpressureException);
                                    a();
                                    this.F0 = true;
                                }
                            }
                        } else if (tPoll != L0) {
                            Iterator it4 = linkedList.iterator();
                            while (it4.hasNext()) {
                                ((UnicastProcessor) it4.next()).onNext(tPoll);
                            }
                        } else if (!linkedList.isEmpty()) {
                            ((UnicastProcessor) linkedList.remove(0)).onComplete();
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(flowable);
        this.f75671q0 = j10;
        this.f75672r0 = j11;
        this.f75673s0 = timeUnit;
        this.f75674t0 = scheduler;
        this.f75675u0 = j12;
        this.v0 = i10;
        this.f75676w0 = z10;
    }

    public static String e(long j10) {
        return e.f("Unable to emit the next window (#", j10, ") due to lack of requests. Please make sure the downstream is ready to consume windows.");
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        if (this.f75671q0 != this.f75672r0) {
            this.source.subscribe((FlowableSubscriber) new d(subscriber, this.f75671q0, this.f75672r0, this.f75673s0, this.f75674t0.createWorker(), this.v0));
            return;
        }
        if (this.f75675u0 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, this.f75671q0, this.f75673s0, this.f75674t0, this.v0));
            return;
        }
        Flowable<T> flowable = this.source;
        long j10 = this.f75671q0;
        TimeUnit timeUnit = this.f75673s0;
        flowable.subscribe((FlowableSubscriber) new b(this.v0, j10, this.f75675u0, this.f75674t0, timeUnit, subscriber, this.f75676w0));
    }
}
