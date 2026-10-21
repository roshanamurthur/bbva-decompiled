package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72116p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72117q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f72118r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f72119s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Callable<U> f72120t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f72121u0;
    public final boolean v0;

    public static final class a<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public long E0;
        public long F0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<U> f72122q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f72123r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f72124s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f72125t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f72126u0;
        public final Scheduler.Worker v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public U f72127w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f72128x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Disposable f72129y0;

        public a(SerializedObserver serializedObserver, Callable callable, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f72122q0 = callable;
            this.f72123r0 = j10;
            this.f72124s0 = timeUnit;
            this.f72125t0 = i10;
            this.f72126u0 = z10;
            this.v0 = worker;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f72129y0.dispose();
            this.v0.dispose();
            synchronized (this) {
                this.f72127w0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u2;
            this.v0.dispose();
            synchronized (this) {
                u2 = this.f72127w0;
                this.f72127w0 = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f72127w0 = null;
            }
            this.downstream.onError(th2);
            this.v0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f72127w0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                    if (u2.size() < this.f72125t0) {
                        return;
                    }
                    this.f72127w0 = null;
                    this.E0++;
                    if (this.f72126u0) {
                        this.f72128x0.dispose();
                    }
                    fastPathOrderedEmit(u2, false, this);
                    try {
                        U u3 = (U) ObjectHelper.requireNonNull(this.f72122q0.call(), "The buffer supplied is null");
                        synchronized (this) {
                            this.f72127w0 = u3;
                            this.F0++;
                        }
                        if (this.f72126u0) {
                            Scheduler.Worker worker = this.v0;
                            long j10 = this.f72123r0;
                            this.f72128x0 = worker.schedulePeriodically(this, j10, j10, this.f72124s0);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.downstream.onError(th2);
                        dispose();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72129y0, disposable)) {
                this.f72129y0 = disposable;
                try {
                    this.f72127w0 = (U) ObjectHelper.requireNonNull(this.f72122q0.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.v0;
                    long j10 = this.f72123r0;
                    this.f72128x0 = worker.schedulePeriodically(this, j10, j10, this.f72124s0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.v0.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f72122q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u3 = this.f72127w0;
                    if (u3 != null && this.E0 == this.F0) {
                        this.f72127w0 = u2;
                        fastPathOrderedEmit(u3, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.downstream.onError(th2);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<U> f72130q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f72131r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f72132s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f72133t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72134u0;
        public U v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72135w0;

        public b(SerializedObserver serializedObserver, Callable callable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f72135w0 = new AtomicReference<>();
            this.f72130q0 = callable;
            this.f72131r0 = j10;
            this.f72132s0 = timeUnit;
            this.f72133t0 = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            this.downstream.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72135w0);
            this.f72134u0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72135w0.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u2;
            synchronized (this) {
                u2 = this.v0;
                this.v0 = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f72135w0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.v0 = null;
            }
            this.downstream.onError(th2);
            DisposableHelper.dispose(this.f72135w0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.v0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72134u0, disposable)) {
                this.f72134u0 = disposable;
                try {
                    this.v0 = (U) ObjectHelper.requireNonNull(this.f72130q0.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    Scheduler scheduler = this.f72133t0;
                    long j10 = this.f72131r0;
                    Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f72132s0);
                    AtomicReference<Disposable> atomicReference = this.f72135w0;
                    while (!atomicReference.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                        if (atomicReference.get() != null) {
                            disposableSchedulePeriodicallyDirect.dispose();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u2;
            try {
                U u3 = (U) ObjectHelper.requireNonNull(this.f72130q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u2 = this.v0;
                        if (u2 != null) {
                            this.v0 = u3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u2 == null) {
                    DisposableHelper.dispose(this.f72135w0);
                } else {
                    fastPathEmit(u2, false, this);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    public static final class c<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<U> f72136q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f72137r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f72138s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f72139t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Scheduler.Worker f72140u0;
        public final LinkedList v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f72141w0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f72142p0;

            public a(U u2) {
                this.f72142p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.v0.remove(this.f72142p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.f72142p0, false, cVar.f72140u0);
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f72144p0;

            public b(U u2) {
                this.f72144p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.v0.remove(this.f72144p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.f72144p0, false, cVar.f72140u0);
            }
        }

        public c(SerializedObserver serializedObserver, Callable callable, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f72136q0 = callable;
            this.f72137r0 = j10;
            this.f72138s0 = j11;
            this.f72139t0 = timeUnit;
            this.f72140u0 = worker;
            this.v0 = new LinkedList();
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            synchronized (this) {
                this.v0.clear();
            }
            this.f72141w0.dispose();
            this.f72140u0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.v0);
                this.v0.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f72140u0, this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.done = true;
            synchronized (this) {
                this.v0.clear();
            }
            this.downstream.onError(th2);
            this.f72140u0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator it = this.v0.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            Scheduler.Worker worker = this.f72140u0;
            if (DisposableHelper.validate(this.f72141w0, disposable)) {
                this.f72141w0 = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.f72136q0.call(), "The buffer supplied is null");
                    this.v0.add(collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker2 = this.f72140u0;
                    long j10 = this.f72138s0;
                    worker2.schedulePeriodically(this, j10, j10, this.f72139t0);
                    worker.schedule(new b(collection), this.f72137r0, this.f72139t0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    worker.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f72136q0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.v0.add(collection);
                        this.f72140u0.schedule(new a(collection), this.f72137r0, this.f72139t0);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i10, boolean z10) {
        super(observableSource);
        this.f72116p0 = j10;
        this.f72117q0 = j11;
        this.f72118r0 = timeUnit;
        this.f72119s0 = scheduler;
        this.f72120t0 = callable;
        this.f72121u0 = i10;
        this.v0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        long j10 = this.f72116p0;
        long j11 = this.f72117q0;
        if (j10 == j11 && this.f72121u0 == Integer.MAX_VALUE) {
            this.source.subscribe(new b(new SerializedObserver(observer), this.f72120t0, this.f72116p0, this.f72118r0, this.f72119s0));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.f72119s0.createWorker();
        if (j10 == j11) {
            this.source.subscribe(new a(new SerializedObserver(observer), this.f72120t0, this.f72116p0, this.f72118r0, this.f72121u0, this.v0, workerCreateWorker));
        } else {
            this.source.subscribe(new c(new SerializedObserver(observer), this.f72120t0, this.f72116p0, this.f72117q0, this.f72118r0, workerCreateWorker));
        }
    }
}
