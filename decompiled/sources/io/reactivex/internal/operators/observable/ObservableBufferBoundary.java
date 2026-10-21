package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<U> f72084p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends Open> f72085q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Open, ? extends ObservableSource<? extends Close>> f72086r0;

    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
        public long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super C> f72087p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<C> f72088q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends Open> f72089r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Function<? super Open, ? extends ObservableSource<? extends Close>> f72090s0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72093w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f72095y0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<C> f72094x0 = new SpscLinkedArrayQueue<>(Observable.bufferSize());

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f72091t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72092u0 = new AtomicReference<>();
        public LinkedHashMap F0 = new LinkedHashMap();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundary$a$a, reason: collision with other inner class name */
        public static final class C0338a<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, ?, Open, ?> f72096p0;

            public C0338a(a<?, ?, Open, ?> aVar) {
                this.f72096p0 = aVar;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f72096p0;
                aVar.f72091t0.delete(this);
                if (aVar.f72091t0.size() == 0) {
                    DisposableHelper.dispose(aVar.f72092u0);
                    aVar.f72093w0 = true;
                    aVar.b();
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th2) {
                lazySet(DisposableHelper.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f72096p0;
                DisposableHelper.dispose(aVar.f72092u0);
                aVar.f72091t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f72096p0;
                aVar.getClass();
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(aVar.f72088q0.call(), "The bufferSupplier returned a null Collection");
                    ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(aVar.f72090s0.apply(open), "The bufferClose returned a null ObservableSource");
                    long j10 = aVar.E0;
                    aVar.E0 = 1 + j10;
                    synchronized (aVar) {
                        try {
                            LinkedHashMap linkedHashMap = aVar.F0;
                            if (linkedHashMap != null) {
                                linkedHashMap.put(Long.valueOf(j10), collection);
                                b bVar = new b(aVar, j10);
                                aVar.f72091t0.add(bVar);
                                observableSource.subscribe(bVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    DisposableHelper.dispose(aVar.f72092u0);
                    aVar.onError(th3);
                }
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super C> observer, ObservableSource<? extends Open> observableSource, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<C> callable) {
            this.f72087p0 = observer;
            this.f72088q0 = callable;
            this.f72089r0 = observableSource;
            this.f72090s0 = function;
        }

        public final void a(b<T, C> bVar, long j10) {
            boolean z10;
            this.f72091t0.delete(bVar);
            if (this.f72091t0.size() == 0) {
                DisposableHelper.dispose(this.f72092u0);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.F0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f72094x0.offer((C) linkedHashMap.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f72093w0 = true;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super C> observer = this.f72087p0;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.f72094x0;
            int iAddAndGet = 1;
            while (!this.f72095y0) {
                boolean z10 = this.f72093w0;
                if (z10 && this.v0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    observer.onError(this.v0.terminate());
                    return;
                }
                C cPoll = spscLinkedArrayQueue.poll();
                boolean z11 = cPoll == null;
                if (z10 && z11) {
                    observer.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(cPoll);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (DisposableHelper.dispose(this.f72092u0)) {
                this.f72095y0 = true;
                this.f72091t0.dispose();
                synchronized (this) {
                    this.F0 = null;
                }
                if (getAndIncrement() != 0) {
                    this.f72094x0.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72092u0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72091t0.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.F0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f72094x0.offer((C) ((Collection) it.next()));
                    }
                    this.F0 = null;
                    this.f72093w0 = true;
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.v0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f72091t0.dispose();
            synchronized (this) {
                this.F0 = null;
            }
            this.f72093w0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.F0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.f72092u0, disposable)) {
                C0338a c0338a = new C0338a(this);
                this.f72091t0.add(c0338a);
                this.f72089r0.subscribe(c0338a);
            }
        }
    }

    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, C, ?, ?> f72097p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72098q0;

        public b(a<T, C, ?, ?> aVar, long j10) {
            this.f72097p0 = aVar;
            this.f72098q0 = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                this.f72097p0.a(this, this.f72098q0);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            lazySet(disposableHelper);
            a<T, C, ?, ?> aVar = this.f72097p0;
            DisposableHelper.dispose(aVar.f72092u0);
            aVar.f72091t0.delete(this);
            aVar.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                disposable.dispose();
                this.f72097p0.a(this, this.f72098q0);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableBufferBoundary(ObservableSource<T> observableSource, ObservableSource<? extends Open> observableSource2, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<U> callable) {
        super(observableSource);
        this.f72085q0 = observableSource2;
        this.f72086r0 = function;
        this.f72084p0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        a aVar = new a(observer, this.f72085q0, this.f72086r0, this.f72084p0);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
    }
}
