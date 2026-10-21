package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74527q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f74528r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f74529s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f74530t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Supplier<U> f74531u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f74532w0;

    public static final class a<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        public Subscription E0;
        public long F0;
        public long G0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<U> f74533r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f74534s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f74535t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f74536u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Scheduler.Worker f74537w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public U f74538x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Disposable f74539y0;

        public a(SerializedSubscriber serializedSubscriber, Supplier supplier, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f74533r0 = supplier;
            this.f74534s0 = j10;
            this.f74535t0 = timeUnit;
            this.f74536u0 = i10;
            this.v0 = z10;
            this.f74537w0 = worker;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber, io.reactivex.rxjava3.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            synchronized (this) {
                this.f74538x0 = null;
            }
            this.E0.cancel();
            this.f74537w0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74537w0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            U u2;
            synchronized (this) {
                u2 = this.f74538x0;
                this.f74538x0 = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f74537w0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f74538x0 = null;
            }
            this.downstream.onError(th2);
            this.f74537w0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f74538x0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                    if (u2.size() < this.f74536u0) {
                        return;
                    }
                    this.f74538x0 = null;
                    this.F0++;
                    if (this.v0) {
                        this.f74539y0.dispose();
                    }
                    fastPathOrderedEmitMax(u2, false, this);
                    try {
                        U u3 = this.f74533r0.get();
                        Objects.requireNonNull(u3, "The supplied buffer is null");
                        U u6 = u3;
                        synchronized (this) {
                            this.f74538x0 = u6;
                            this.G0++;
                        }
                        if (this.v0) {
                            Scheduler.Worker worker = this.f74537w0;
                            long j10 = this.f74534s0;
                            this.f74539y0 = worker.schedulePeriodically(this, j10, j10, this.f74535t0);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancel();
                        this.downstream.onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.E0, subscription)) {
                this.E0 = subscription;
                try {
                    U u2 = this.f74533r0.get();
                    Objects.requireNonNull(u2, "The supplied buffer is null");
                    this.f74538x0 = u2;
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f74537w0;
                    long j10 = this.f74534s0;
                    this.f74539y0 = worker.schedulePeriodically(this, j10, j10, this.f74535t0);
                    subscription.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f74537w0.dispose();
                    subscription.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u2 = this.f74533r0.get();
                Objects.requireNonNull(u2, "The supplied buffer is null");
                U u3 = u2;
                synchronized (this) {
                    U u6 = this.f74538x0;
                    if (u6 != null && this.F0 == this.G0) {
                        this.f74538x0 = u3;
                        fastPathOrderedEmitMax(u6, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<U> f74540r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f74541s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f74542t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Scheduler f74543u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public U f74544w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Disposable> f74545x0;

        public b(SerializedSubscriber serializedSubscriber, Supplier supplier, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f74545x0 = new AtomicReference<>();
            this.f74540r0 = supplier;
            this.f74541s0 = j10;
            this.f74542t0 = timeUnit;
            this.f74543u0 = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber, io.reactivex.rxjava3.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            this.downstream.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.v0.cancel();
            DisposableHelper.dispose(this.f74545x0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74545x0.get() == DisposableHelper.DISPOSED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.dispose(this.f74545x0);
            synchronized (this) {
                try {
                    U u2 = this.f74544w0;
                    if (u2 == null) {
                        return;
                    }
                    this.f74544w0 = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f74545x0);
            synchronized (this) {
                this.f74544w0 = null;
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f74544w0;
                    if (u2 != null) {
                        u2.add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                try {
                    U u2 = this.f74540r0.get();
                    Objects.requireNonNull(u2, "The supplied buffer is null");
                    this.f74544w0 = u2;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.f74543u0;
                    long j10 = this.f74541s0;
                    Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f74542t0);
                    AtomicReference<Disposable> atomicReference = this.f74545x0;
                    while (!atomicReference.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                        if (atomicReference.get() != null) {
                            disposableSchedulePeriodicallyDirect.dispose();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u2 = this.f74540r0.get();
                Objects.requireNonNull(u2, "The supplied buffer is null");
                U u3 = u2;
                synchronized (this) {
                    try {
                        U u6 = this.f74544w0;
                        if (u6 == null) {
                            return;
                        }
                        this.f74544w0 = u3;
                        fastPathEmitMax(u6, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }
    }

    public static final class c<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<U> f74546r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f74547s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f74548t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f74549u0;
        public final Scheduler.Worker v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final LinkedList f74550w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f74551x0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f74552p0;

            public a(U u2) {
                this.f74552p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f74550w0.remove(this.f74552p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmitMax(this.f74552p0, false, cVar.v0);
            }
        }

        public c(SerializedSubscriber serializedSubscriber, Supplier supplier, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f74546r0 = supplier;
            this.f74547s0 = j10;
            this.f74548t0 = j11;
            this.f74549u0 = timeUnit;
            this.v0 = worker;
            this.f74550w0 = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber, io.reactivex.rxjava3.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.f74551x0.cancel();
            this.v0.dispose();
            synchronized (this) {
                this.f74550w0.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f74550w0);
                this.f74550w0.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.v0, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.done = true;
            this.v0.dispose();
            synchronized (this) {
                this.f74550w0.clear();
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator it = this.f74550w0.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Scheduler.Worker worker = this.v0;
            if (SubscriptionHelper.validate(this.f74551x0, subscription)) {
                this.f74551x0 = subscription;
                try {
                    U u2 = this.f74546r0.get();
                    Objects.requireNonNull(u2, "The supplied buffer is null");
                    U u3 = u2;
                    this.f74550w0.add(u3);
                    this.downstream.onSubscribe(this);
                    subscription.request(Long.MAX_VALUE);
                    Scheduler.Worker worker2 = this.v0;
                    long j10 = this.f74548t0;
                    worker2.schedulePeriodically(this, j10, j10, this.f74549u0);
                    worker.schedule(new a(u3), this.f74547s0, this.f74549u0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    worker.dispose();
                    subscription.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                return;
            }
            try {
                U u2 = this.f74546r0.get();
                Objects.requireNonNull(u2, "The supplied buffer is null");
                U u3 = u2;
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f74550w0.add(u3);
                        this.v0.schedule(new a(u3), this.f74547s0, this.f74549u0);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Supplier<U> supplier, int i10, boolean z10) {
        super(flowable);
        this.f74527q0 = j10;
        this.f74528r0 = j11;
        this.f74529s0 = timeUnit;
        this.f74530t0 = scheduler;
        this.f74531u0 = supplier;
        this.v0 = i10;
        this.f74532w0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        long j10 = this.f74527q0;
        long j11 = this.f74528r0;
        if (j10 == j11 && this.v0 == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f74531u0, this.f74527q0, this.f74529s0, this.f74530t0));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.f74530t0.createWorker();
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f74531u0, this.f74527q0, this.f74529s0, this.v0, this.f74532w0, workerCreateWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new c(new SerializedSubscriber(subscriber), this.f74531u0, this.f74527q0, this.f74528r0, this.f74529s0, workerCreateWorker));
        }
    }
}
