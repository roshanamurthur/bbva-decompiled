package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f76474p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ErrorMode f76475q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f76476r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76477s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        public int E0;
        public volatile boolean F0;
        public InnerQueuedObserver<R> G0;
        public int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76478p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f76479q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76480r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f76481s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ErrorMode f76482t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f76483u0 = new AtomicThrowable();
        public final ArrayDeque<InnerQueuedObserver<R>> v0 = new ArrayDeque<>();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<T> f76484w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f76485x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76486y0;

        public a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
            this.f76478p0 = observer;
            this.f76479q0 = function;
            this.f76480r0 = i10;
            this.f76481s0 = i11;
            this.f76482t0 = errorMode;
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.F0) {
                return;
            }
            this.F0 = true;
            this.f76485x0.dispose();
            this.f76483u0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                do {
                    this.f76484w0.clear();
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f76484w0;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.v0;
            Observer<? super R> observer = this.f76478p0;
            ErrorMode errorMode = this.f76482t0;
            int iAddAndGet = 1;
            while (true) {
                int i10 = this.H0;
                while (i10 != this.f76480r0) {
                    if (this.F0) {
                        simpleQueue.clear();
                        a();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.f76483u0.get() != null) {
                        simpleQueue.clear();
                        a();
                        this.f76483u0.tryTerminateConsumer(this.f76478p0);
                        return;
                    }
                    try {
                        T tPoll = simpleQueue.poll();
                        if (tPoll == null) {
                            break;
                        }
                        ObservableSource<? extends R> observableSourceApply = this.f76479q0.apply(tPoll);
                        Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                        ObservableSource<? extends R> observableSource = observableSourceApply;
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.f76481s0);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.subscribe(innerQueuedObserver);
                        i10++;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f76485x0.dispose();
                        simpleQueue.clear();
                        a();
                        this.f76483u0.tryAddThrowableOrReport(th2);
                        this.f76483u0.tryTerminateConsumer(this.f76478p0);
                        return;
                    }
                }
                this.H0 = i10;
                if (this.F0) {
                    simpleQueue.clear();
                    a();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.f76483u0.get() != null) {
                    simpleQueue.clear();
                    a();
                    this.f76483u0.tryTerminateConsumer(this.f76478p0);
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.G0;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.f76483u0.get() != null) {
                        simpleQueue.clear();
                        a();
                        this.f76483u0.tryTerminateConsumer(observer);
                        return;
                    }
                    boolean z10 = this.f76486y0;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z11 = innerQueuedObserverPoll == null;
                    if (z10 && z11) {
                        if (this.f76483u0.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        a();
                        this.f76483u0.tryTerminateConsumer(observer);
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
                        if (errorMode == ErrorMode.IMMEDIATE && this.f76483u0.get() != null) {
                            simpleQueue.clear();
                            a();
                            this.f76483u0.tryTerminateConsumer(observer);
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
                            this.f76483u0.tryAddThrowableOrReport(th3);
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

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th2) {
            if (this.f76483u0.tryAddThrowableOrReport(th2)) {
                if (this.f76482t0 == ErrorMode.IMMEDIATE) {
                    this.f76485x0.dispose();
                }
                innerQueuedObserver.setDone();
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r3) {
            innerQueuedObserver.queue().offer(r3);
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.F0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76486y0 = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76483u0.tryAddThrowableOrReport(th2)) {
                this.f76486y0 = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.E0 == 0) {
                this.f76484w0.offer(t10);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76485x0, disposable)) {
                this.f76485x0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.E0 = iRequestFusion;
                        this.f76484w0 = queueDisposable;
                        this.f76486y0 = true;
                        this.f76478p0.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.E0 = iRequestFusion;
                        this.f76484w0 = queueDisposable;
                        this.f76478p0.onSubscribe(this);
                        return;
                    }
                }
                this.f76484w0 = new SpscLinkedArrayQueue(this.f76481s0);
                this.f76478p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, ErrorMode errorMode, int i10, int i11) {
        super(observableSource);
        this.f76474p0 = function;
        this.f76475q0 = errorMode;
        this.f76476r0 = i10;
        this.f76477s0 = i11;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f76474p0, this.f76476r0, this.f76477s0, this.f76475q0));
    }
}
