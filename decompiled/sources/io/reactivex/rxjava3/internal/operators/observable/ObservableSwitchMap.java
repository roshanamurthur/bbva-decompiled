package io.reactivex.rxjava3.internal.operators.observable;

import a.e;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f77192p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f77193q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f77194r0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, R> f77195p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77196q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f77197r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile SimpleQueue<R> f77198s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f77199t0;

        public a(b<T, R> bVar, long j10, int i10) {
            this.f77195p0 = bVar;
            this.f77196q0 = j10;
            this.f77197r0 = i10;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77196q0 == this.f77195p0.f77208y0) {
                this.f77199t0 = true;
                this.f77195p0.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f77195p0;
            bVar.getClass();
            if (this.f77196q0 != bVar.f77208y0 || !bVar.f77204t0.tryAddThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!bVar.f77203s0) {
                bVar.f77206w0.dispose();
                bVar.f77205u0 = true;
            }
            this.f77199t0 = true;
            bVar.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(R r3) {
            if (this.f77196q0 == this.f77195p0.f77208y0) {
                if (r3 != null) {
                    this.f77198s0.offer(r3);
                }
                this.f77195p0.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f77198s0 = queueDisposable;
                        this.f77199t0 = true;
                        this.f77195p0.a();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f77198s0 = queueDisposable;
                        return;
                    }
                }
                this.f77198s0 = new SpscLinkedArrayQueue(this.f77197r0);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final a<Object, Object> E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f77200p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f77201q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f77202r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f77203s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f77205u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f77206w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile long f77208y0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f77207x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f77204t0 = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            E0 = aVar;
            DisposableHelper.dispose(aVar);
        }

        public b(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
            this.f77200p0 = observer;
            this.f77201q0 = function;
            this.f77202r0 = i10;
            this.f77203s0 = z10;
        }

        public final void a() {
            SimpleQueue<R> simpleQueue;
            e eVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f77200p0;
            AtomicReference<a<T, R>> atomicReference = this.f77207x0;
            boolean z10 = this.f77203s0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f77205u0) {
                    boolean z11 = atomicReference.get() == null;
                    if (z10) {
                        if (z11) {
                            Throwable th2 = this.f77204t0.get();
                            if (th2 != null) {
                                observer.onError(th2);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.f77204t0.get() != null) {
                        this.f77204t0.tryTerminateConsumer(observer);
                        return;
                    } else if (z11) {
                        observer.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (simpleQueue = aVar.f77198s0) != null) {
                    boolean z12 = false;
                    while (!this.v0) {
                        if (aVar != atomicReference.get()) {
                            continue;
                        } else {
                            if (!z10 && this.f77204t0.get() != null) {
                                this.f77204t0.tryTerminateConsumer(observer);
                                return;
                            }
                            boolean z13 = aVar.f77199t0;
                            try {
                                eVarPoll = simpleQueue.poll();
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.f77204t0.tryAddThrowableOrReport(th3);
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                                if (z10) {
                                    DisposableHelper.dispose(aVar);
                                } else {
                                    a<T, R> andSet = this.f77207x0.getAndSet((a<T, R>) E0);
                                    if (andSet != null) {
                                        DisposableHelper.dispose(andSet);
                                    }
                                    this.f77206w0.dispose();
                                    this.f77205u0 = true;
                                }
                                z12 = true;
                                eVarPoll = null;
                            }
                            boolean z14 = eVarPoll == null;
                            if (z13 && z14) {
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            } else if (!z14) {
                                observer.onNext(eVarPoll);
                            } else if (z12) {
                                continue;
                            }
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f77206w0.dispose();
            a<T, R> andSet = this.f77207x0.getAndSet((a<T, R>) E0);
            if (andSet != null) {
                DisposableHelper.dispose(andSet);
            }
            this.f77204t0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77205u0) {
                return;
            }
            this.f77205u0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            a<T, R> andSet;
            if (this.f77205u0 || !this.f77204t0.tryAddThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f77203s0 && (andSet = this.f77207x0.getAndSet((a<T, R>) E0)) != null) {
                DisposableHelper.dispose(andSet);
            }
            this.f77205u0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long j10 = this.f77208y0 + 1;
            this.f77208y0 = j10;
            a<T, R> aVar = this.f77207x0.get();
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            try {
                ObservableSource<? extends R> observableSourceApply = this.f77201q0.apply(t10);
                Objects.requireNonNull(observableSourceApply, "The ObservableSource returned is null");
                ObservableSource<? extends R> observableSource = observableSourceApply;
                a<T, R> aVar2 = new a<>(this, j10, this.f77202r0);
                while (true) {
                    a<T, R> aVar3 = this.f77207x0.get();
                    if (aVar3 == E0) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f77207x0;
                    do {
                        if (atomicReference.compareAndSet(aVar3, aVar2)) {
                            observableSource.subscribe(aVar2);
                            return;
                        }
                    } while (atomicReference.get() == aVar3);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77206w0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77206w0, disposable)) {
                this.f77206w0 = disposable;
                this.f77200p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
        super(observableSource);
        this.f77192p0 = function;
        this.f77193q0 = i10;
        this.f77194r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        ObservableSource<T> observableSource = this.source;
        Function<? super T, ? extends ObservableSource<? extends R>> function = this.f77192p0;
        if (ObservableScalarXMap.tryScalarXMapSubscribe(observableSource, observer, function)) {
            return;
        }
        this.source.subscribe(new b(observer, function, this.f77193q0, this.f77194r0));
    }
}
