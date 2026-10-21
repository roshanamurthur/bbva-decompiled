package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends TRight> f72485p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f72486q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f72487r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> f72488s0;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, b {
        public static final Integer H0 = 1;
        public static final Integer I0 = 2;
        public static final Integer J0 = 3;
        public static final Integer K0 = 4;
        public int E0;
        public int F0;
        public volatile boolean G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72489p0;
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f72495w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> f72496x0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f72491r0 = new CompositeDisposable();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f72490q0 = new SpscLinkedArrayQueue<>(Observable.bufferSize());

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final LinkedHashMap f72492s0 = new LinkedHashMap();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final LinkedHashMap f72493t0 = new LinkedHashMap();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Throwable> f72494u0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicInteger f72497y0 = new AtomicInteger(2);

        public a(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
            this.f72489p0 = observer;
            this.v0 = function;
            this.f72495w0 = function2;
            this.f72496x0 = biFunction;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void a(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.f72494u0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72497y0.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void b(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.f72494u0, th2)) {
                f();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void c(Object obj, boolean z10) {
            synchronized (this) {
                try {
                    this.f72490q0.offer(z10 ? H0 : I0, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void d(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f72490q0.offer(z10 ? J0 : K0, cVar);
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
            this.f72491r0.dispose();
            if (getAndIncrement() == 0) {
                this.f72490q0.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public final void e(d dVar) {
            this.f72491r0.delete(dVar);
            this.f72497y0.decrementAndGet();
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.f72490q0;
            Observer<? super R> observer = this.f72489p0;
            int iAddAndGet = 1;
            while (!this.G0) {
                if (this.f72494u0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f72491r0.dispose();
                    g(observer);
                    return;
                }
                boolean z10 = this.f72497y0.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    Iterator it = this.f72492s0.values().iterator();
                    while (it.hasNext()) {
                        ((UnicastSubject) it.next()).onComplete();
                    }
                    this.f72492s0.clear();
                    this.f72493t0.clear();
                    this.f72491r0.dispose();
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
                        UnicastSubject unicastSubjectCreate = UnicastSubject.create();
                        int i10 = this.E0;
                        this.E0 = i10 + 1;
                        this.f72492s0.put(Integer.valueOf(i10), unicastSubjectCreate);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.v0.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            c cVar = new c(this, true, i10);
                            this.f72491r0.add(cVar);
                            observableSource.subscribe(cVar);
                            if (this.f72494u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f72491r0.dispose();
                                g(observer);
                                return;
                            } else {
                                try {
                                    observer.onNext((Object) ObjectHelper.requireNonNull(this.f72496x0.apply(objPoll, unicastSubjectCreate), "The resultSelector returned a null value"));
                                    Iterator it2 = this.f72493t0.values().iterator();
                                    while (it2.hasNext()) {
                                        unicastSubjectCreate.onNext(it2.next());
                                    }
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
                        this.f72493t0.put(Integer.valueOf(i11), objPoll);
                        try {
                            ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(this.f72495w0.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            c cVar2 = new c(this, false, i11);
                            this.f72491r0.add(cVar2);
                            observableSource2.subscribe(cVar2);
                            if (this.f72494u0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f72491r0.dispose();
                                g(observer);
                                return;
                            } else {
                                Iterator it3 = this.f72492s0.values().iterator();
                                while (it3.hasNext()) {
                                    ((UnicastSubject) it3.next()).onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            h(th4, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == J0) {
                        c cVar3 = (c) objPoll;
                        UnicastSubject unicastSubject = (UnicastSubject) this.f72492s0.remove(Integer.valueOf(cVar3.f72500r0));
                        this.f72491r0.remove(cVar3);
                        if (unicastSubject != null) {
                            unicastSubject.onComplete();
                        }
                    } else if (num == K0) {
                        c cVar4 = (c) objPoll;
                        this.f72493t0.remove(Integer.valueOf(cVar4.f72500r0));
                        this.f72491r0.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void g(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.f72494u0);
            LinkedHashMap linkedHashMap = this.f72492s0;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((UnicastSubject) it.next()).onError(thTerminate);
            }
            linkedHashMap.clear();
            this.f72493t0.clear();
            observer.onError(thTerminate);
        }

        public final void h(Throwable th2, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.f72494u0, th2);
            spscLinkedArrayQueue.clear();
            this.f72491r0.dispose();
            g(observer);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.G0;
        }
    }

    public interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(Object obj, boolean z10);

        void d(boolean z10, c cVar);

        void e(d dVar);
    }

    public static final class c extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f72498p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f72499q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72500r0;

        public c(b bVar, boolean z10, int i10) {
            this.f72498p0 = bVar;
            this.f72499q0 = z10;
            this.f72500r0 = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72498p0.d(this.f72499q0, this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72498p0.b(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.f72498p0.d(this.f72499q0, this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class d extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f72501p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f72502q0;

        public d(b bVar, boolean z10) {
            this.f72501p0 = bVar;
            this.f72502q0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72501p0.e(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72501p0.a(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f72501p0.c(obj, this.f72502q0);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableGroupJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.f72485p0 = observableSource2;
        this.f72486q0 = function;
        this.f72487r0 = function2;
        this.f72488s0 = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.f72486q0, this.f72487r0, this.f72488s0);
        observer.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        CompositeDisposable compositeDisposable = aVar.f72491r0;
        compositeDisposable.add(dVar);
        d dVar2 = new d(aVar, false);
        compositeDisposable.add(dVar2);
        this.source.subscribe(dVar);
        this.f72485p0.subscribe(dVar2);
    }
}
