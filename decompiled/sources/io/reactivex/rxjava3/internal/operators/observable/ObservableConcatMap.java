package io.reactivex.rxjava3.internal.operators.observable;

import a.d;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
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
public final class ObservableConcatMap<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends U>> f76449p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76450q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76451r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76452p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f76453q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76454r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76455s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0403a<R> f76456t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f76457u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f76458w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76459x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76460y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMap$a$a, reason: collision with other inner class name */
        public static final class C0403a<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super R> f76461p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<?, R> f76462q0;

            public C0403a(Observer<? super R> observer, a<?, R> aVar) {
                this.f76461p0 = observer;
                this.f76462q0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a<?, R> aVar = this.f76462q0;
                aVar.f76459x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76462q0;
                if (aVar.f76455s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76457u0) {
                        aVar.f76458w0.dispose();
                    }
                    aVar.f76459x0 = false;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(R r3) {
                this.f76461p0.onNext(r3);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
            this.f76452p0 = observer;
            this.f76453q0 = function;
            this.f76454r0 = i10;
            this.f76457u0 = z10;
            this.f76456t0 = new C0403a<>(observer, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f76452p0;
            SimpleQueue<T> simpleQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f76455s0;
            while (true) {
                if (!this.f76459x0) {
                    if (this.E0) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f76457u0 && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.E0 = true;
                        atomicThrowable.tryTerminateConsumer(observer);
                        return;
                    }
                    boolean z10 = this.f76460y0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.E0 = true;
                            atomicThrowable.tryTerminateConsumer(observer);
                            return;
                        }
                        if (!z11) {
                            try {
                                ObservableSource<? extends R> observableSourceApply = this.f76453q0.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends R> observableSource = observableSourceApply;
                                if (observableSource instanceof Supplier) {
                                    try {
                                        d dVar = (Object) ((Supplier) observableSource).get();
                                        if (dVar != null && !this.E0) {
                                            observer.onNext(dVar);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        atomicThrowable.tryAddThrowableOrReport(th2);
                                    }
                                } else {
                                    this.f76459x0 = true;
                                    observableSource.subscribe(this.f76456t0);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.E0 = true;
                                this.f76458w0.dispose();
                                simpleQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th3);
                                atomicThrowable.tryTerminateConsumer(observer);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.E0 = true;
                        this.f76458w0.dispose();
                        atomicThrowable.tryAddThrowableOrReport(th4);
                        atomicThrowable.tryTerminateConsumer(observer);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.E0 = true;
            this.f76458w0.dispose();
            C0403a<R> c0403a = this.f76456t0;
            c0403a.getClass();
            DisposableHelper.dispose(c0403a);
            this.f76455s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76460y0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76455s0.tryAddThrowableOrReport(th2)) {
                this.f76460y0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.F0 == 0) {
                this.v0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76458w0, disposable)) {
                this.f76458w0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueDisposable;
                        this.f76460y0 = true;
                        this.f76452p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueDisposable;
                        this.f76452p0.onSubscribe(this);
                        return;
                    }
                }
                this.v0 = new SpscLinkedArrayQueue(this.f76454r0);
                this.f76452p0.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76463p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f76464q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<U> f76465r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f76466s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SimpleQueue<T> f76467t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76468u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76469w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76470x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f76471y0;

        public static final class a<U> extends AtomicReference<Disposable> implements Observer<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super U> f76472p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final b<?, ?> f76473q0;

            public a(SerializedObserver serializedObserver, b bVar) {
                this.f76472p0 = serializedObserver;
                this.f76473q0 = bVar;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                b<?, ?> bVar = this.f76473q0;
                bVar.v0 = false;
                bVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                this.f76473q0.dispose();
                this.f76472p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(U u2) {
                this.f76472p0.onNext(u2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public b(SerializedObserver serializedObserver, Function function, int i10) {
            this.f76463p0 = serializedObserver;
            this.f76464q0 = function;
            this.f76466s0 = i10;
            this.f76465r0 = new a<>(serializedObserver, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f76469w0) {
                if (!this.v0) {
                    boolean z10 = this.f76470x0;
                    try {
                        T tPoll = this.f76467t0.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f76469w0 = true;
                            this.f76463p0.onComplete();
                            return;
                        }
                        if (!z11) {
                            try {
                                ObservableSource<? extends U> observableSourceApply = this.f76464q0.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends U> observableSource = observableSourceApply;
                                this.v0 = true;
                                observableSource.subscribe(this.f76465r0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                dispose();
                                this.f76467t0.clear();
                                this.f76463p0.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        dispose();
                        this.f76467t0.clear();
                        this.f76463p0.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f76467t0.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76469w0 = true;
            a<U> aVar = this.f76465r0;
            aVar.getClass();
            DisposableHelper.dispose(aVar);
            this.f76468u0.dispose();
            if (getAndIncrement() == 0) {
                this.f76467t0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76469w0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76470x0) {
                return;
            }
            this.f76470x0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76470x0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f76470x0 = true;
            dispose();
            this.f76463p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76470x0) {
                return;
            }
            if (this.f76471y0 == 0) {
                this.f76467t0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76468u0, disposable)) {
                this.f76468u0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f76471y0 = iRequestFusion;
                        this.f76467t0 = queueDisposable;
                        this.f76470x0 = true;
                        this.f76463p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f76471y0 = iRequestFusion;
                        this.f76467t0 = queueDisposable;
                        this.f76463p0.onSubscribe(this);
                        return;
                    }
                }
                this.f76467t0 = new SpscLinkedArrayQueue(this.f76466s0);
                this.f76463p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i10, ErrorMode errorMode) {
        super(observableSource);
        this.f76449p0 = function;
        this.f76451r0 = errorMode;
        this.f76450q0 = Math.max(8, i10);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        ObservableSource<T> observableSource = this.source;
        Function<? super T, ? extends ObservableSource<? extends U>> function = this.f76449p0;
        if (ObservableScalarXMap.tryScalarXMapSubscribe(observableSource, observer, function)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.IMMEDIATE;
        int i10 = this.f76450q0;
        ErrorMode errorMode2 = this.f76451r0;
        if (errorMode2 == errorMode) {
            this.source.subscribe(new b(new SerializedObserver(observer), function, i10));
        } else {
            this.source.subscribe(new a(observer, function, i10, errorMode2 == ErrorMode.END));
        }
    }
}
