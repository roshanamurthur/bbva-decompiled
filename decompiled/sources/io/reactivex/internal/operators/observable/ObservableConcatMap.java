package io.reactivex.internal.operators.observable;

import a.d;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMap<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends U>> f72194p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72195q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f72196r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72197p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72198q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72199r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f72200s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final C0339a<R> f72201t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f72202u0;
        public SimpleQueue<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f72203w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72204x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f72205y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableConcatMap$a$a, reason: collision with other inner class name */
        public static final class C0339a<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super R> f72206p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<?, R> f72207q0;

            public C0339a(Observer<? super R> observer, a<?, R> aVar) {
                this.f72206p0 = observer;
                this.f72207q0 = aVar;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                a<?, R> aVar = this.f72207q0;
                aVar.f72204x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f72207q0;
                if (!aVar.f72200s0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (!aVar.f72202u0) {
                    aVar.f72203w0.dispose();
                }
                aVar.f72204x0 = false;
                aVar.a();
            }

            @Override // io.reactivex.Observer
            public final void onNext(R r3) {
                this.f72206p0.onNext(r3);
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
            this.f72197p0 = observer;
            this.f72198q0 = function;
            this.f72199r0 = i10;
            this.f72202u0 = z10;
            this.f72201t0 = new C0339a<>(observer, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f72197p0;
            SimpleQueue<T> simpleQueue = this.v0;
            AtomicThrowable atomicThrowable = this.f72200s0;
            while (true) {
                if (!this.f72204x0) {
                    if (this.E0) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f72202u0 && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.E0 = true;
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.f72205y0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.E0 = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                observer.onError(thTerminate);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72198q0.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (observableSource instanceof Callable) {
                                    try {
                                        d dVar = (Object) ((Callable) observableSource).call();
                                        if (dVar != null && !this.E0) {
                                            observer.onNext(dVar);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        atomicThrowable.addThrowable(th2);
                                    }
                                } else {
                                    this.f72204x0 = true;
                                    observableSource.subscribe(this.f72201t0);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.E0 = true;
                                this.f72203w0.dispose();
                                simpleQueue.clear();
                                atomicThrowable.addThrowable(th3);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.E0 = true;
                        this.f72203w0.dispose();
                        atomicThrowable.addThrowable(th4);
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.E0 = true;
            this.f72203w0.dispose();
            C0339a<R> c0339a = this.f72201t0;
            c0339a.getClass();
            DisposableHelper.dispose(c0339a);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.E0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72205y0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f72200s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72205y0 = true;
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.F0 == 0) {
                this.v0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72203w0, disposable)) {
                this.f72203w0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueDisposable;
                        this.f72205y0 = true;
                        this.f72197p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.F0 = iRequestFusion;
                        this.v0 = queueDisposable;
                        this.f72197p0.onSubscribe(this);
                        return;
                    }
                }
                this.v0 = new SpscLinkedArrayQueue(this.f72199r0);
                this.f72197p0.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f72208p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f72209q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<U> f72210r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f72211s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SimpleQueue<T> f72212t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72213u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72214w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72215x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f72216y0;

        public static final class a<U> extends AtomicReference<Disposable> implements Observer<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Observer<? super U> f72217p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final b<?, ?> f72218q0;

            public a(SerializedObserver serializedObserver, b bVar) {
                this.f72217p0 = serializedObserver;
                this.f72218q0 = bVar;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                b<?, ?> bVar = this.f72218q0;
                bVar.v0 = false;
                bVar.a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                this.f72218q0.dispose();
                this.f72217p0.onError(th2);
            }

            @Override // io.reactivex.Observer
            public final void onNext(U u2) {
                this.f72217p0.onNext(u2);
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public b(SerializedObserver serializedObserver, Function function, int i10) {
            this.f72208p0 = serializedObserver;
            this.f72209q0 = function;
            this.f72211s0 = i10;
            this.f72210r0 = new a<>(serializedObserver, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f72214w0) {
                if (!this.v0) {
                    boolean z10 = this.f72215x0;
                    try {
                        T tPoll = this.f72212t0.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f72214w0 = true;
                            this.f72208p0.onComplete();
                            return;
                        } else if (!z11) {
                            try {
                                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72209q0.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.v0 = true;
                                observableSource.subscribe(this.f72210r0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                dispose();
                                this.f72212t0.clear();
                                this.f72208p0.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        dispose();
                        this.f72212t0.clear();
                        this.f72208p0.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f72212t0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72214w0 = true;
            a<U> aVar = this.f72210r0;
            aVar.getClass();
            DisposableHelper.dispose(aVar);
            this.f72213u0.dispose();
            if (getAndIncrement() == 0) {
                this.f72212t0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72214w0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72215x0) {
                return;
            }
            this.f72215x0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72215x0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f72215x0 = true;
            dispose();
            this.f72208p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72215x0) {
                return;
            }
            if (this.f72216y0 == 0) {
                this.f72212t0.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72213u0, disposable)) {
                this.f72213u0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f72216y0 = iRequestFusion;
                        this.f72212t0 = queueDisposable;
                        this.f72215x0 = true;
                        this.f72208p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f72216y0 = iRequestFusion;
                        this.f72212t0 = queueDisposable;
                        this.f72208p0.onSubscribe(this);
                        return;
                    }
                }
                this.f72212t0 = new SpscLinkedArrayQueue(this.f72211s0);
                this.f72208p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i10, ErrorMode errorMode) {
        super(observableSource);
        this.f72194p0 = function;
        this.f72196r0 = errorMode;
        this.f72195q0 = Math.max(8, i10);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        ObservableSource<T> observableSource = this.source;
        Function<? super T, ? extends ObservableSource<? extends U>> function = this.f72194p0;
        if (ObservableScalarXMap.tryScalarXMapSubscribe(observableSource, observer, function)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.IMMEDIATE;
        int i10 = this.f72195q0;
        ErrorMode errorMode2 = this.f72196r0;
        if (errorMode2 == errorMode) {
            this.source.subscribe(new b(new SerializedObserver(observer), function, i10));
        } else {
            this.source.subscribe(new a(observer, function, i10, errorMode2 == ErrorMode.END));
        }
    }
}
