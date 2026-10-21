package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f72219p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ErrorMode f72220q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f72221r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72222s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        public int E0;
        public volatile boolean F0;
        public InnerQueuedObserver<R> G0;
        public int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72223p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72224q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72225r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f72226s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ErrorMode f72227t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f72228u0 = new AtomicThrowable();
        public final ArrayDeque<InnerQueuedObserver<R>> v0 = new ArrayDeque<>();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<T> f72229w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f72230x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f72231y0;

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
            this.f72223p0 = observer;
            this.f72224q0 = function;
            this.f72225r0 = i10;
            this.f72226s0 = i11;
            this.f72227t0 = errorMode;
        }

        public final void a() {
            InnerQueuedObserver<R> innerQueuedObserver = this.G0;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> innerQueuedObserverPoll = this.v0.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    innerQueuedObserverPoll.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.F0) {
                return;
            }
            this.F0 = true;
            this.f72230x0.dispose();
            if (getAndIncrement() == 0) {
                do {
                    this.f72229w0.clear();
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f72229w0;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.v0;
            Observer<? super R> observer = this.f72223p0;
            ErrorMode errorMode = this.f72227t0;
            int iAddAndGet = 1;
            while (true) {
                int i10 = this.H0;
                while (i10 != this.f72225r0) {
                    if (this.F0) {
                        simpleQueue.clear();
                        a();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.f72228u0.get() != null) {
                        simpleQueue.clear();
                        a();
                        observer.onError(this.f72228u0.terminate());
                        return;
                    }
                    try {
                        T tPoll = simpleQueue.poll();
                        if (tPoll == null) {
                            break;
                        }
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72224q0.apply(tPoll), "The mapper returned a null ObservableSource");
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.f72226s0);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.subscribe(innerQueuedObserver);
                        i10++;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f72230x0.dispose();
                        simpleQueue.clear();
                        a();
                        this.f72228u0.addThrowable(th2);
                        observer.onError(this.f72228u0.terminate());
                        return;
                    }
                }
                this.H0 = i10;
                if (this.F0) {
                    simpleQueue.clear();
                    a();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.f72228u0.get() != null) {
                    simpleQueue.clear();
                    a();
                    observer.onError(this.f72228u0.terminate());
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.G0;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.f72228u0.get() != null) {
                        simpleQueue.clear();
                        a();
                        observer.onError(this.f72228u0.terminate());
                        return;
                    }
                    boolean z10 = this.f72231y0;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z11 = innerQueuedObserverPoll == null;
                    if (z10 && z11) {
                        if (this.f72228u0.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        a();
                        observer.onError(this.f72228u0.terminate());
                        return;
                    }
                    if (!z11) {
                        this.G0 = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    SimpleQueue<R> simpleQueueQueue = innerQueuedObserver2.queue();
                    while (true) {
                        if (this.F0) {
                            simpleQueue.clear();
                            a();
                            return;
                        }
                        boolean zIsDone = innerQueuedObserver2.isDone();
                        if (errorMode == ErrorMode.IMMEDIATE && this.f72228u0.get() != null) {
                            simpleQueue.clear();
                            a();
                            observer.onError(this.f72228u0.terminate());
                            return;
                        }
                        try {
                            R rPoll = simpleQueueQueue.poll();
                            boolean z12 = rPoll == null;
                            if (zIsDone && z12) {
                                this.G0 = null;
                                this.H0--;
                            } else if (!z12) {
                                observer.onNext(rPoll);
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.f72228u0.addThrowable(th3);
                            this.G0 = null;
                            this.H0--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th2) {
            if (!this.f72228u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f72227t0 == ErrorMode.IMMEDIATE) {
                this.f72230x0.dispose();
            }
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r3) {
            innerQueuedObserver.queue().offer(r3);
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.F0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72231y0 = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f72228u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72231y0 = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.E0 == 0) {
                this.f72229w0.offer(t10);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72230x0, disposable)) {
                this.f72230x0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.E0 = iRequestFusion;
                        this.f72229w0 = queueDisposable;
                        this.f72231y0 = true;
                        this.f72223p0.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.E0 = iRequestFusion;
                        this.f72229w0 = queueDisposable;
                        this.f72223p0.onSubscribe(this);
                        return;
                    }
                }
                this.f72229w0 = new SpscLinkedArrayQueue(this.f72226s0);
                this.f72223p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, ErrorMode errorMode, int i10, int i11) {
        super(observableSource);
        this.f72219p0 = function;
        this.f72220q0 = errorMode;
        this.f72221r0 = i10;
        this.f72222s0 = i11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f72219p0, this.f72221r0, this.f72222s0, this.f72220q0));
    }
}
