package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70273q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f70274r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f70275s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f70276t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Callable<U> f70277u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f70278w0;

    public static final class a<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        public Subscription E0;
        public long F0;
        public long G0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<U> f70279r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f70280s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f70281t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f70282u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Scheduler.Worker f70283w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public U f70284x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Disposable f70285y0;

        public a(SerializedSubscriber serializedSubscriber, Callable callable, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f70279r0 = callable;
            this.f70280s0 = j10;
            this.f70281t0 = timeUnit;
            this.f70282u0 = i10;
            this.v0 = z10;
            this.f70283w0 = worker;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            synchronized (this) {
                this.f70284x0 = null;
            }
            this.E0.cancel();
            this.f70283w0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70283w0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            U u2;
            synchronized (this) {
                u2 = this.f70284x0;
                this.f70284x0 = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f70283w0.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f70284x0 = null;
            }
            this.downstream.onError(th2);
            this.f70283w0.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f70284x0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                    if (u2.size() < this.f70282u0) {
                        return;
                    }
                    this.f70284x0 = null;
                    this.F0++;
                    if (this.v0) {
                        this.f70285y0.dispose();
                    }
                    fastPathOrderedEmitMax(u2, false, this);
                    try {
                        U u3 = (U) ObjectHelper.requireNonNull(this.f70279r0.call(), "The supplied buffer is null");
                        synchronized (this) {
                            this.f70284x0 = u3;
                            this.G0++;
                        }
                        if (this.v0) {
                            Scheduler.Worker worker = this.f70283w0;
                            long j10 = this.f70280s0;
                            this.f70285y0 = worker.schedulePeriodically(this, j10, j10, this.f70281t0);
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.E0, subscription)) {
                this.E0 = subscription;
                try {
                    this.f70284x0 = (U) ObjectHelper.requireNonNull(this.f70279r0.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f70283w0;
                    long j10 = this.f70280s0;
                    this.f70285y0 = worker.schedulePeriodically(this, j10, j10, this.f70281t0);
                    subscription.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f70283w0.dispose();
                    subscription.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f70279r0.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u3 = this.f70284x0;
                    if (u3 != null && this.F0 == this.G0) {
                        this.f70284x0 = u2;
                        fastPathOrderedEmitMax(u3, false, this);
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
        public final Callable<U> f70286r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f70287s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f70288t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Scheduler f70289u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public U f70290w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70291x0;

        public b(SerializedSubscriber serializedSubscriber, Callable callable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f70291x0 = new AtomicReference<>();
            this.f70286r0 = callable;
            this.f70287s0 = j10;
            this.f70288t0 = timeUnit;
            this.f70289u0 = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            this.downstream.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.v0.cancel();
            DisposableHelper.dispose(this.f70291x0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70291x0.get() == DisposableHelper.DISPOSED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.dispose(this.f70291x0);
            synchronized (this) {
                try {
                    U u2 = this.f70290w0;
                    if (u2 == null) {
                        return;
                    }
                    this.f70290w0 = null;
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
            DisposableHelper.dispose(this.f70291x0);
            synchronized (this) {
                this.f70290w0 = null;
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f70290w0;
                    if (u2 != null) {
                        u2.add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                try {
                    this.f70290w0 = (U) ObjectHelper.requireNonNull(this.f70286r0.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.f70289u0;
                    long j10 = this.f70287s0;
                    Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f70288t0);
                    AtomicReference<Disposable> atomicReference = this.f70291x0;
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
                U u2 = (U) ObjectHelper.requireNonNull(this.f70286r0.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u3 = this.f70290w0;
                        if (u3 == null) {
                            return;
                        }
                        this.f70290w0 = u2;
                        fastPathEmitMax(u3, false, this);
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
        public final Callable<U> f70292r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f70293s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f70294t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f70295u0;
        public final Scheduler.Worker v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final LinkedList f70296w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f70297x0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f70298p0;

            public a(U u2) {
                this.f70298p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f70296w0.remove(this.f70298p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmitMax(this.f70298p0, false, cVar.v0);
            }
        }

        public c(SerializedSubscriber serializedSubscriber, Callable callable, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f70292r0 = callable;
            this.f70293s0 = j10;
            this.f70294t0 = j11;
            this.f70295u0 = timeUnit;
            this.v0 = worker;
            this.f70296w0 = new LinkedList();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.f70297x0.cancel();
            this.v0.dispose();
            synchronized (this) {
                this.f70296w0.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f70296w0);
                this.f70296w0.clear();
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
                this.f70296w0.clear();
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator it = this.f70296w0.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Scheduler.Worker worker = this.v0;
            if (SubscriptionHelper.validate(this.f70297x0, subscription)) {
                this.f70297x0 = subscription;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.f70292r0.call(), "The supplied buffer is null");
                    this.f70296w0.add(collection);
                    this.downstream.onSubscribe(this);
                    subscription.request(Long.MAX_VALUE);
                    Scheduler.Worker worker2 = this.v0;
                    long j10 = this.f70294t0;
                    worker2.schedulePeriodically(this, j10, j10, this.f70295u0);
                    worker.schedule(new a(collection), this.f70293s0, this.f70295u0);
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
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f70292r0.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f70296w0.add(collection);
                        this.v0.schedule(new a(collection), this.f70293s0, this.f70295u0);
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

    public FlowableBufferTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i10, boolean z10) {
        super(flowable);
        this.f70273q0 = j10;
        this.f70274r0 = j11;
        this.f70275s0 = timeUnit;
        this.f70276t0 = scheduler;
        this.f70277u0 = callable;
        this.v0 = i10;
        this.f70278w0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        long j10 = this.f70273q0;
        long j11 = this.f70274r0;
        if (j10 == j11 && this.v0 == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f70277u0, this.f70273q0, this.f70275s0, this.f70276t0));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.f70276t0.createWorker();
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f70277u0, this.f70273q0, this.f70275s0, this.v0, this.f70278w0, workerCreateWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new c(new SerializedSubscriber(subscriber), this.f70277u0, this.f70273q0, this.f70274r0, this.f70275s0, workerCreateWorker));
        }
    }
}
