package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76371p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76372q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f76373r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f76374s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Supplier<U> f76375t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f76376u0;
    public final boolean v0;

    public static final class a<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public long E0;
        public long F0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<U> f76377q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f76378r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f76379s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f76380t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f76381u0;
        public final Scheduler.Worker v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public U f76382w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f76383x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Disposable f76384y0;

        public a(SerializedObserver serializedObserver, Supplier supplier, long j10, TimeUnit timeUnit, int i10, boolean z10, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f76377q0 = supplier;
            this.f76378r0 = j10;
            this.f76379s0 = timeUnit;
            this.f76380t0 = i10;
            this.f76381u0 = z10;
            this.v0 = worker;
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f76384y0.dispose();
            this.v0.dispose();
            synchronized (this) {
                this.f76382w0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            U u2;
            this.v0.dispose();
            synchronized (this) {
                u2 = this.f76382w0;
                this.f76382w0 = null;
            }
            if (u2 != null) {
                this.queue.offer(u2);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f76382w0 = null;
            }
            this.downstream.onError(th2);
            this.v0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f76382w0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                    if (u2.size() < this.f76380t0) {
                        return;
                    }
                    this.f76382w0 = null;
                    this.E0++;
                    if (this.f76381u0) {
                        this.f76383x0.dispose();
                    }
                    fastPathOrderedEmit(u2, false, this);
                    try {
                        U u3 = this.f76377q0.get();
                        Objects.requireNonNull(u3, "The buffer supplied is null");
                        U u6 = u3;
                        synchronized (this) {
                            this.f76382w0 = u6;
                            this.F0++;
                        }
                        if (this.f76381u0) {
                            Scheduler.Worker worker = this.v0;
                            long j10 = this.f76378r0;
                            this.f76383x0 = worker.schedulePeriodically(this, j10, j10, this.f76379s0);
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76384y0, disposable)) {
                this.f76384y0 = disposable;
                try {
                    U u2 = this.f76377q0.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.f76382w0 = u2;
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.v0;
                    long j10 = this.f76378r0;
                    this.f76383x0 = worker.schedulePeriodically(this, j10, j10, this.f76379s0);
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
                U u2 = this.f76377q0.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    U u6 = this.f76382w0;
                    if (u6 != null && this.E0 == this.F0) {
                        this.f76382w0 = u3;
                        fastPathOrderedEmit(u6, false, this);
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
        public final Supplier<U> f76385q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f76386r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f76387s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f76388t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76389u0;
        public U v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76390w0;

        public b(SerializedObserver serializedObserver, Supplier supplier, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f76390w0 = new AtomicReference<>();
            this.f76385q0 = supplier;
            this.f76386r0 = j10;
            this.f76387s0 = timeUnit;
            this.f76388t0 = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            this.downstream.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f76390w0);
            this.f76389u0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76390w0.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
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
            DisposableHelper.dispose(this.f76390w0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.v0 = null;
            }
            this.downstream.onError(th2);
            DisposableHelper.dispose(this.f76390w0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76389u0, disposable)) {
                this.f76389u0 = disposable;
                try {
                    U u2 = this.f76385q0.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.v0 = u2;
                    this.downstream.onSubscribe(this);
                    AtomicReference<Disposable> atomicReference = this.f76390w0;
                    if (DisposableHelper.isDisposed(atomicReference.get())) {
                        return;
                    }
                    Scheduler scheduler = this.f76388t0;
                    long j10 = this.f76386r0;
                    DisposableHelper.set(atomicReference, scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f76387s0));
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
                U u3 = this.f76385q0.get();
                Objects.requireNonNull(u3, "The bufferSupplier returned a null buffer");
                U u6 = u3;
                synchronized (this) {
                    try {
                        u2 = this.v0;
                        if (u2 != null) {
                            this.v0 = u6;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u2 == null) {
                    DisposableHelper.dispose(this.f76390w0);
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
        public final Supplier<U> f76391q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f76392r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f76393s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f76394t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Scheduler.Worker f76395u0;
        public final LinkedList v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f76396w0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f76397p0;

            public a(U u2) {
                this.f76397p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.v0.remove(this.f76397p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.f76397p0, false, cVar.f76395u0);
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final U f76399p0;

            public b(U u2) {
                this.f76399p0 = u2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.v0.remove(this.f76399p0);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.f76399p0, false, cVar.f76395u0);
            }
        }

        public c(SerializedObserver serializedObserver, Supplier supplier, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f76391q0 = supplier;
            this.f76392r0 = j10;
            this.f76393s0 = j11;
            this.f76394t0 = timeUnit;
            this.f76395u0 = worker;
            this.v0 = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            synchronized (this) {
                this.v0.clear();
            }
            this.f76396w0.dispose();
            this.f76395u0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
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
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f76395u0, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.done = true;
            synchronized (this) {
                this.v0.clear();
            }
            this.downstream.onError(th2);
            this.f76395u0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            Scheduler.Worker worker = this.f76395u0;
            if (DisposableHelper.validate(this.f76396w0, disposable)) {
                this.f76396w0 = disposable;
                try {
                    U u2 = this.f76391q0.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    U u3 = u2;
                    this.v0.add(u3);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker2 = this.f76395u0;
                    long j10 = this.f76393s0;
                    worker2.schedulePeriodically(this, j10, j10, this.f76394t0);
                    worker.schedule(new b(u3), this.f76392r0, this.f76394t0);
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
                U u2 = this.f76391q0.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.v0.add(u3);
                        this.f76395u0.schedule(new a(u3), this.f76392r0, this.f76394t0);
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

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Supplier<U> supplier, int i10, boolean z10) {
        super(observableSource);
        this.f76371p0 = j10;
        this.f76372q0 = j11;
        this.f76373r0 = timeUnit;
        this.f76374s0 = scheduler;
        this.f76375t0 = supplier;
        this.f76376u0 = i10;
        this.v0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        long j10 = this.f76371p0;
        long j11 = this.f76372q0;
        if (j10 == j11 && this.f76376u0 == Integer.MAX_VALUE) {
            this.source.subscribe(new b(new SerializedObserver(observer), this.f76375t0, this.f76371p0, this.f76373r0, this.f76374s0));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.f76374s0.createWorker();
        if (j10 == j11) {
            this.source.subscribe(new a(new SerializedObserver(observer), this.f76375t0, this.f76371p0, this.f76373r0, this.f76376u0, this.v0, workerCreateWorker));
        } else {
            this.source.subscribe(new c(new SerializedObserver(observer), this.f76375t0, this.f76371p0, this.f76372q0, this.f76373r0, workerCreateWorker));
        }
    }
}
