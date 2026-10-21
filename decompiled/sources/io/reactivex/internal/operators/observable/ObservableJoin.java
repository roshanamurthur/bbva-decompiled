package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends TRight> f72551p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f72552q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f72553r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BiFunction<? super TLeft, ? super TRight, ? extends R> f72554s0;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.b {
        public static final Integer H0 = 1;
        public static final Integer I0 = 2;
        public static final Integer J0 = 3;
        public static final Integer K0 = 4;
        public int E0;
        public int F0;
        public volatile boolean G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72555p0;
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f72561w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> f72562x0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f72557r0 = new CompositeDisposable();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f72556q0 = new SpscLinkedArrayQueue<>(Observable.bufferSize());

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final LinkedHashMap f72558s0 = new LinkedHashMap();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final LinkedHashMap f72559t0 = new LinkedHashMap();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Throwable> f72560u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicInteger f72563y0 = new AtomicInteger(2);

        public a(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f72555p0 = observer;
            this.v0 = function;
            this.f72561w0 = function2;
            this.f72562x0 = biFunction;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void a(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.f72560u0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72563y0.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void b(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.f72560u0, th2)) {
                f();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void c(Object obj, boolean z10) {
            synchronized (this) {
                try {
                    this.f72556q0.offer(z10 ? H0 : I0, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void d(boolean z10, ObservableGroupJoin.c cVar) {
            synchronized (this) {
                try {
                    this.f72556q0.offer(z10 ? J0 : K0, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.G0) {
                return;
            }
            this.G0 = true;
            this.f72557r0.dispose();
            if (getAndIncrement() == 0) {
                this.f72556q0.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void e(ObservableGroupJoin.d dVar) {
            this.f72557r0.delete(dVar);
            this.f72563y0.decrementAndGet();
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.f72556q0;
            Observer<? super R> observer = this.f72555p0;
            int iAddAndGet = 1;
            while (!this.G0) {
                if (this.f72560u0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f72557r0.dispose();
                    g(observer);
                    return;
                }
                boolean z10 = this.f72563y0.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    this.f72558s0.clear();
                    this.f72559t0.clear();
                    this.f72557r0.dispose();
                    observer.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == H0) {
                        int i10 = this.E0;
                        this.E0 = i10 + 1;
                        this.f72558s0.put(Integer.valueOf(i10), objPoll);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.v0.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            ObservableGroupJoin.c cVar = new ObservableGroupJoin.c(this, true, i10);
                            this.f72557r0.add(cVar);
                            observableSource.subscribe(cVar);
                            if (this.f72560u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f72557r0.dispose();
                                g(observer);
                                return;
                            } else {
                                Iterator it = this.f72559t0.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        observer.onNext((Object) ObjectHelper.requireNonNull(this.f72562x0.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th2) {
                                        h(th2, observer, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            h(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == I0) {
                        int i11 = this.F0;
                        this.F0 = i11 + 1;
                        this.f72559t0.put(Integer.valueOf(i11), objPoll);
                        try {
                            ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(this.f72561w0.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            ObservableGroupJoin.c cVar2 = new ObservableGroupJoin.c(this, false, i11);
                            this.f72557r0.add(cVar2);
                            observableSource2.subscribe(cVar2);
                            if (this.f72560u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f72557r0.dispose();
                                g(observer);
                                return;
                            } else {
                                Iterator it2 = this.f72558s0.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        observer.onNext((Object) ObjectHelper.requireNonNull(this.f72562x0.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th4) {
                                        h(th4, observer, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            h(th5, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == J0) {
                        ObservableGroupJoin.c cVar3 = (ObservableGroupJoin.c) objPoll;
                        this.f72558s0.remove(Integer.valueOf(cVar3.f72500r0));
                        this.f72557r0.remove(cVar3);
                    } else {
                        ObservableGroupJoin.c cVar4 = (ObservableGroupJoin.c) objPoll;
                        this.f72559t0.remove(Integer.valueOf(cVar4.f72500r0));
                        this.f72557r0.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void g(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.f72560u0);
            this.f72558s0.clear();
            this.f72559t0.clear();
            observer.onError(thTerminate);
        }

        public final void h(Throwable th2, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.f72560u0, th2);
            spscLinkedArrayQueue.clear();
            this.f72557r0.dispose();
            g(observer);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.G0;
        }
    }

    public ObservableJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(observableSource);
        this.f72551p0 = observableSource2;
        this.f72552q0 = function;
        this.f72553r0 = function2;
        this.f72554s0 = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.f72552q0, this.f72553r0, this.f72554s0);
        observer.onSubscribe(aVar);
        ObservableGroupJoin.d dVar = new ObservableGroupJoin.d(aVar, true);
        CompositeDisposable compositeDisposable = aVar.f72557r0;
        compositeDisposable.add(dVar);
        ObservableGroupJoin.d dVar2 = new ObservableGroupJoin.d(aVar, false);
        compositeDisposable.add(dVar2);
        this.source.subscribe(dVar);
        this.f72551p0.subscribe(dVar2);
    }
}
