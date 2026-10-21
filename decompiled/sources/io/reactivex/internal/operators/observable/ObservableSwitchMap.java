package io.reactivex.internal.operators.observable;

import a.e;
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
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f72915p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72916q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f72917r0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, R> f72918p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72919q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72920r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile SimpleQueue<R> f72921s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f72922t0;

        public a(b<T, R> bVar, long j10, int i10) {
            this.f72918p0 = bVar;
            this.f72919q0 = j10;
            this.f72920r0 = i10;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72919q0 == this.f72918p0.f72931y0) {
                this.f72922t0 = true;
                this.f72918p0.b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f72918p0;
            bVar.getClass();
            if (this.f72919q0 != bVar.f72931y0 || !bVar.f72927t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!bVar.f72926s0) {
                bVar.f72929w0.dispose();
                bVar.f72928u0 = true;
            }
            this.f72922t0 = true;
            bVar.b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r3) {
            if (this.f72919q0 == this.f72918p0.f72931y0) {
                if (r3 != null) {
                    this.f72921s0.offer(r3);
                }
                this.f72918p0.b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f72921s0 = queueDisposable;
                        this.f72922t0 = true;
                        this.f72918p0.b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f72921s0 = queueDisposable;
                        return;
                    }
                }
                this.f72921s0 = new SpscLinkedArrayQueue(this.f72920r0);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final a<Object, Object> E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72923p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72924q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72925r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f72926s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f72928u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f72929w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile long f72931y0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f72930x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f72927t0 = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            E0 = aVar;
            DisposableHelper.dispose(aVar);
        }

        public b(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
            this.f72923p0 = observer;
            this.f72924q0 = function;
            this.f72925r0 = i10;
            this.f72926s0 = z10;
        }

        public final void a() {
            a<T, R> andSet;
            AtomicReference<a<T, R>> atomicReference = this.f72930x0;
            a<T, R> aVar = atomicReference.get();
            a<Object, Object> aVar2 = E0;
            if (aVar == aVar2 || (andSet = atomicReference.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            SimpleQueue<R> simpleQueue;
            e eVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f72923p0;
            AtomicReference<a<T, R>> atomicReference = this.f72930x0;
            boolean z10 = this.f72926s0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f72928u0) {
                    boolean z11 = atomicReference.get() == null;
                    if (z10) {
                        if (z11) {
                            Throwable th2 = this.f72927t0.get();
                            if (th2 != null) {
                                observer.onError(th2);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.f72927t0.get() != null) {
                        observer.onError(this.f72927t0.terminate());
                        return;
                    } else if (z11) {
                        observer.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (simpleQueue = aVar.f72921s0) != null) {
                    if (aVar.f72922t0) {
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (z10) {
                            if (zIsEmpty) {
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            }
                        } else if (this.f72927t0.get() != null) {
                            observer.onError(this.f72927t0.terminate());
                            return;
                        } else if (zIsEmpty) {
                            while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                            }
                        }
                    }
                    boolean z12 = false;
                    while (!this.v0) {
                        if (aVar != atomicReference.get()) {
                            continue;
                        } else {
                            if (!z10 && this.f72927t0.get() != null) {
                                observer.onError(this.f72927t0.terminate());
                                return;
                            }
                            boolean z13 = aVar.f72922t0;
                            try {
                                eVarPoll = simpleQueue.poll();
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.f72927t0.addThrowable(th3);
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                                if (z10) {
                                    DisposableHelper.dispose(aVar);
                                } else {
                                    a();
                                    this.f72929w0.dispose();
                                    this.f72928u0 = true;
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f72929w0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72928u0) {
                return;
            }
            this.f72928u0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72928u0 || !this.f72927t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f72926s0) {
                a();
            }
            this.f72928u0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long j10 = this.f72931y0 + 1;
            this.f72931y0 = j10;
            a<T, R> aVar = this.f72930x0.get();
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72924q0.apply(t10), "The ObservableSource returned is null");
                a<T, R> aVar2 = new a<>(this, j10, this.f72925r0);
                while (true) {
                    a<T, R> aVar3 = this.f72930x0.get();
                    if (aVar3 == E0) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f72930x0;
                    do {
                        if (atomicReference.compareAndSet(aVar3, aVar2)) {
                            observableSource.subscribe(aVar2);
                            return;
                        }
                    } while (atomicReference.get() == aVar3);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72929w0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72929w0, disposable)) {
                this.f72929w0 = disposable;
                this.f72923p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, boolean z10) {
        super(observableSource);
        this.f72915p0 = function;
        this.f72916q0 = i10;
        this.f72917r0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        ObservableSource<T> observableSource = this.source;
        Function<? super T, ? extends ObservableSource<? extends R>> function = this.f72915p0;
        if (ObservableScalarXMap.tryScalarXMapSubscribe(observableSource, observer, function)) {
            return;
        }
        this.source.subscribe(new b(observer, function, this.f72916q0, this.f72917r0));
    }
}
