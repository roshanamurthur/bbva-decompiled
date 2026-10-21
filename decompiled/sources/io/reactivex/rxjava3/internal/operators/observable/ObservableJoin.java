package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends TRight> f76837p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f76838q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f76839r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BiFunction<? super TLeft, ? super TRight, ? extends R> f76840s0;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.b {
        public static final Integer H0 = 1;
        public static final Integer I0 = 2;
        public static final Integer J0 = 3;
        public static final Integer K0 = 4;
        public int E0;
        public int F0;
        public volatile boolean G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76841p0;
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f76847w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> f76848x0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f76843r0 = new CompositeDisposable();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f76842q0 = new SpscLinkedArrayQueue<>(Observable.bufferSize());

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final LinkedHashMap f76844s0 = new LinkedHashMap();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final LinkedHashMap f76845t0 = new LinkedHashMap();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Throwable> f76846u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicInteger f76849y0 = new AtomicInteger(2);

        public a(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f76841p0 = observer;
            this.v0 = function;
            this.f76847w0 = function2;
            this.f76848x0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.b
        public final void a(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.f76846u0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76849y0.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.b
        public final void b(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.f76846u0, th2)) {
                f();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.b
        public final void c(Object obj, boolean z10) {
            synchronized (this) {
                try {
                    this.f76842q0.offer(z10 ? H0 : I0, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.b
        public final void d(ObservableGroupJoin.d dVar) {
            this.f76843r0.delete(dVar);
            this.f76849y0.decrementAndGet();
            f();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.G0) {
                return;
            }
            this.G0 = true;
            this.f76843r0.dispose();
            if (getAndIncrement() == 0) {
                this.f76842q0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.b
        public final void e(boolean z10, ObservableGroupJoin.c cVar) {
            synchronized (this) {
                try {
                    this.f76842q0.offer(z10 ? J0 : K0, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.f76842q0;
            Observer<? super R> observer = this.f76841p0;
            int iAddAndGet = 1;
            while (!this.G0) {
                if (this.f76846u0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f76843r0.dispose();
                    g(observer);
                    return;
                }
                boolean z10 = this.f76849y0.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    this.f76844s0.clear();
                    this.f76845t0.clear();
                    this.f76843r0.dispose();
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
                        this.f76844s0.put(Integer.valueOf(i10), objPoll);
                        try {
                            ObservableSource observableSourceApply = this.v0.apply(objPoll);
                            Objects.requireNonNull(observableSourceApply, "The leftEnd returned a null ObservableSource");
                            ObservableSource observableSource = observableSourceApply;
                            ObservableGroupJoin.c cVar = new ObservableGroupJoin.c(this, true, i10);
                            this.f76843r0.add(cVar);
                            observableSource.subscribe(cVar);
                            if (this.f76846u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f76843r0.dispose();
                                g(observer);
                                return;
                            }
                            Iterator it = this.f76845t0.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    R rApply = this.f76848x0.apply(objPoll, it.next());
                                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                    observer.onNext(rApply);
                                } catch (Throwable th2) {
                                    h(th2, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            h(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == I0) {
                        int i11 = this.F0;
                        this.F0 = i11 + 1;
                        this.f76845t0.put(Integer.valueOf(i11), objPoll);
                        try {
                            ObservableSource observableSourceApply2 = this.f76847w0.apply(objPoll);
                            Objects.requireNonNull(observableSourceApply2, "The rightEnd returned a null ObservableSource");
                            ObservableSource observableSource2 = observableSourceApply2;
                            ObservableGroupJoin.c cVar2 = new ObservableGroupJoin.c(this, false, i11);
                            this.f76843r0.add(cVar2);
                            observableSource2.subscribe(cVar2);
                            if (this.f76846u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f76843r0.dispose();
                                g(observer);
                                return;
                            }
                            Iterator it2 = this.f76844s0.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    R rApply2 = this.f76848x0.apply(it2.next(), objPoll);
                                    Objects.requireNonNull(rApply2, "The resultSelector returned a null value");
                                    observer.onNext(rApply2);
                                } catch (Throwable th4) {
                                    h(th4, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th5) {
                            h(th5, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == J0) {
                        ObservableGroupJoin.c cVar3 = (ObservableGroupJoin.c) objPoll;
                        this.f76844s0.remove(Integer.valueOf(cVar3.f76786r0));
                        this.f76843r0.remove(cVar3);
                    } else {
                        ObservableGroupJoin.c cVar4 = (ObservableGroupJoin.c) objPoll;
                        this.f76845t0.remove(Integer.valueOf(cVar4.f76786r0));
                        this.f76843r0.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void g(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.f76846u0);
            this.f76844s0.clear();
            this.f76845t0.clear();
            observer.onError(thTerminate);
        }

        public final void h(Throwable th2, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.f76846u0, th2);
            spscLinkedArrayQueue.clear();
            this.f76843r0.dispose();
            g(observer);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.G0;
        }
    }

    public ObservableJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(observableSource);
        this.f76837p0 = observableSource2;
        this.f76838q0 = function;
        this.f76839r0 = function2;
        this.f76840s0 = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.f76838q0, this.f76839r0, this.f76840s0);
        observer.onSubscribe(aVar);
        ObservableGroupJoin.d dVar = new ObservableGroupJoin.d(aVar, true);
        CompositeDisposable compositeDisposable = aVar.f76843r0;
        compositeDisposable.add(dVar);
        ObservableGroupJoin.d dVar2 = new ObservableGroupJoin.d(aVar, false);
        compositeDisposable.add(dVar2);
        this.source.subscribe(dVar);
        this.f76837p0.subscribe(dVar2);
    }
}
