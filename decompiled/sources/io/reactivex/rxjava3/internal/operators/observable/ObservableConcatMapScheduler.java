package io.reactivex.rxjava3.internal.operators.observable;

import a.d;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapScheduler<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends U>> f76487p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76488q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76489r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f76490s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean E0;
        public volatile boolean F0;
        public int G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76491p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f76492q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76493r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76494s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0404a<R> f76495t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f76496u0;
        public final Scheduler.Worker v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<T> f76497w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f76498x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76499y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapScheduler$a$a, reason: collision with other inner class name */
        public static final class C0404a<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super R> f76500p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<?, R> f76501q0;

            public C0404a(Observer<? super R> observer, a<?, R> aVar) {
                this.f76500p0 = observer;
                this.f76501q0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a<?, R> aVar = this.f76501q0;
                aVar.f76499y0 = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76501q0;
                if (aVar.f76494s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76496u0) {
                        aVar.f76498x0.dispose();
                    }
                    aVar.f76499y0 = false;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(R r3) {
                this.f76500p0.onNext(r3);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10, Scheduler.Worker worker) {
            this.f76491p0 = observer;
            this.f76492q0 = function;
            this.f76493r0 = i10;
            this.f76496u0 = z10;
            this.f76495t0 = new C0404a<>(observer, this);
            this.v0 = worker;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.v0.schedule(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.F0 = true;
            this.f76498x0.dispose();
            C0404a<R> c0404a = this.f76495t0;
            c0404a.getClass();
            DisposableHelper.dispose(c0404a);
            this.v0.dispose();
            this.f76494s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.F0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.E0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76494s0.tryAddThrowableOrReport(th2)) {
                this.E0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.G0 == 0) {
                this.f76497w0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76498x0, disposable)) {
                this.f76498x0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.G0 = iRequestFusion;
                        this.f76497w0 = queueDisposable;
                        this.E0 = true;
                        this.f76491p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.G0 = iRequestFusion;
                        this.f76497w0 = queueDisposable;
                        this.f76491p0.onSubscribe(this);
                        return;
                    }
                }
                this.f76497w0 = new SpscLinkedArrayQueue(this.f76493r0);
                this.f76491p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Observer<? super R> observer = this.f76491p0;
            SimpleQueue<T> simpleQueue = this.f76497w0;
            AtomicThrowable atomicThrowable = this.f76494s0;
            while (true) {
                if (!this.f76499y0) {
                    if (this.F0) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f76496u0 && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.F0 = true;
                        atomicThrowable.tryTerminateConsumer(observer);
                        this.v0.dispose();
                        return;
                    }
                    boolean z10 = this.E0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.F0 = true;
                            atomicThrowable.tryTerminateConsumer(observer);
                            this.v0.dispose();
                            return;
                        }
                        if (!z11) {
                            try {
                                ObservableSource<? extends R> observableSourceApply = this.f76492q0.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends R> observableSource = observableSourceApply;
                                if (observableSource instanceof Supplier) {
                                    try {
                                        d dVar = (Object) ((Supplier) observableSource).get();
                                        if (dVar != null && !this.F0) {
                                            observer.onNext(dVar);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        atomicThrowable.tryAddThrowableOrReport(th2);
                                    }
                                } else {
                                    this.f76499y0 = true;
                                    observableSource.subscribe(this.f76495t0);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.F0 = true;
                                this.f76498x0.dispose();
                                simpleQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th3);
                                atomicThrowable.tryTerminateConsumer(observer);
                                this.v0.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.F0 = true;
                        this.f76498x0.dispose();
                        atomicThrowable.tryAddThrowableOrReport(th4);
                        atomicThrowable.tryTerminateConsumer(observer);
                        this.v0.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76502p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f76503q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<U> f76504r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f76505s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler.Worker f76506t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public SimpleQueue<T> f76507u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76508w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76509x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76510y0;

        public static final class a<U> extends AtomicReference<Disposable> implements Observer<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super U> f76511p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final b<?, ?> f76512q0;

            public a(SerializedObserver serializedObserver, b bVar) {
                this.f76511p0 = serializedObserver;
                this.f76512q0 = bVar;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                b<?, ?> bVar = this.f76512q0;
                bVar.f76508w0 = false;
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
                bVar.f76506t0.schedule(bVar);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                this.f76512q0.dispose();
                this.f76511p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(U u2) {
                this.f76511p0.onNext(u2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public b(SerializedObserver serializedObserver, Function function, int i10, Scheduler.Worker worker) {
            this.f76502p0 = serializedObserver;
            this.f76503q0 = function;
            this.f76505s0 = i10;
            this.f76504r0 = new a<>(serializedObserver, this);
            this.f76506t0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76509x0 = true;
            a<U> aVar = this.f76504r0;
            aVar.getClass();
            DisposableHelper.dispose(aVar);
            this.v0.dispose();
            this.f76506t0.dispose();
            if (getAndIncrement() == 0) {
                this.f76507u0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76509x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76510y0) {
                return;
            }
            this.f76510y0 = true;
            if (getAndIncrement() != 0) {
                return;
            }
            this.f76506t0.schedule(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76510y0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f76510y0 = true;
            dispose();
            this.f76502p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76510y0) {
                return;
            }
            if (this.E0 == 0) {
                this.f76507u0.offer(t10);
            }
            if (getAndIncrement() != 0) {
                return;
            }
            this.f76506t0.schedule(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.E0 = iRequestFusion;
                        this.f76507u0 = queueDisposable;
                        this.f76510y0 = true;
                        this.f76502p0.onSubscribe(this);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                        this.f76506t0.schedule(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.E0 = iRequestFusion;
                        this.f76507u0 = queueDisposable;
                        this.f76502p0.onSubscribe(this);
                        return;
                    }
                }
                this.f76507u0 = new SpscLinkedArrayQueue(this.f76505s0);
                this.f76502p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f76509x0) {
                if (!this.f76508w0) {
                    boolean z10 = this.f76510y0;
                    try {
                        T tPoll = this.f76507u0.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f76509x0 = true;
                            this.f76502p0.onComplete();
                            this.f76506t0.dispose();
                            return;
                        } else if (!z11) {
                            try {
                                ObservableSource<? extends U> observableSourceApply = this.f76503q0.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends U> observableSource = observableSourceApply;
                                this.f76508w0 = true;
                                observableSource.subscribe(this.f76504r0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                dispose();
                                this.f76507u0.clear();
                                this.f76502p0.onError(th2);
                                this.f76506t0.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        dispose();
                        this.f76507u0.clear();
                        this.f76502p0.onError(th3);
                        this.f76506t0.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f76507u0.clear();
        }
    }

    public ObservableConcatMapScheduler(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i10, ErrorMode errorMode, Scheduler scheduler) {
        super(observableSource);
        this.f76487p0 = function;
        this.f76489r0 = errorMode;
        this.f76488q0 = Math.max(8, i10);
        this.f76490s0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        ErrorMode errorMode = ErrorMode.IMMEDIATE;
        Scheduler scheduler = this.f76490s0;
        ErrorMode errorMode2 = this.f76489r0;
        if (errorMode2 != errorMode) {
            this.source.subscribe(new a(observer, this.f76487p0, this.f76488q0, errorMode2 == ErrorMode.END, scheduler.createWorker()));
        } else {
            this.source.subscribe(new b(new SerializedObserver(observer), this.f76487p0, this.f76488q0, scheduler.createWorker()));
        }
    }
}
