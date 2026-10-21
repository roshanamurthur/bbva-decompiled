package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<U> f76348p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends Open> f76349q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Open, ? extends ObservableSource<? extends Close>> f76350r0;

    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
        public long E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super C> f76351p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<C> f76352q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<? extends Open> f76353r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Function<? super Open, ? extends ObservableSource<? extends Close>> f76354s0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76357w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f76359y0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<C> f76358x0 = new SpscLinkedArrayQueue<>(Observable.bufferSize());

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f76355t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76356u0 = new AtomicReference<>();
        public LinkedHashMap F0 = new LinkedHashMap();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableBufferBoundary$a$a, reason: collision with other inner class name */
        public static final class C0402a<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, ?, Open, ?> f76360p0;

            public C0402a(a<?, ?, Open, ?> aVar) {
                this.f76360p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f76360p0;
                aVar.f76355t0.delete(this);
                if (aVar.f76355t0.size() == 0) {
                    DisposableHelper.dispose(aVar.f76356u0);
                    aVar.f76357w0 = true;
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                lazySet(DisposableHelper.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f76360p0;
                DisposableHelper.dispose(aVar.f76356u0);
                aVar.f76355t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f76360p0;
                aVar.getClass();
                try {
                    C c10 = aVar.f76352q0.get();
                    Objects.requireNonNull(c10, "The bufferSupplier returned a null Collection");
                    C c11 = c10;
                    ObservableSource<? extends Object> observableSourceApply = aVar.f76354s0.apply(open);
                    Objects.requireNonNull(observableSourceApply, "The bufferClose returned a null ObservableSource");
                    ObservableSource<? extends Object> observableSource = observableSourceApply;
                    long j10 = aVar.E0;
                    aVar.E0 = 1 + j10;
                    synchronized (aVar) {
                        try {
                            LinkedHashMap linkedHashMap = aVar.F0;
                            if (linkedHashMap != null) {
                                linkedHashMap.put(Long.valueOf(j10), c11);
                                b bVar = new b(aVar, j10);
                                aVar.f76355t0.add(bVar);
                                observableSource.subscribe(bVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    DisposableHelper.dispose(aVar.f76356u0);
                    aVar.onError(th3);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super C> observer, ObservableSource<? extends Open> observableSource, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Supplier<C> supplier) {
            this.f76351p0 = observer;
            this.f76352q0 = supplier;
            this.f76353r0 = observableSource;
            this.f76354s0 = function;
        }

        public final void a(b<T, C> bVar, long j10) {
            boolean z10;
            this.f76355t0.delete(bVar);
            if (this.f76355t0.size() == 0) {
                DisposableHelper.dispose(this.f76356u0);
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
                    this.f76358x0.offer((C) linkedHashMap.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f76357w0 = true;
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
            Observer<? super C> observer = this.f76351p0;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.f76358x0;
            int iAddAndGet = 1;
            while (!this.f76359y0) {
                boolean z10 = this.f76357w0;
                if (z10 && this.v0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.v0.tryTerminateConsumer(observer);
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (DisposableHelper.dispose(this.f76356u0)) {
                this.f76359y0 = true;
                this.f76355t0.dispose();
                synchronized (this) {
                    this.F0 = null;
                }
                if (getAndIncrement() != 0) {
                    this.f76358x0.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f76356u0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76355t0.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.F0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f76358x0.offer((C) ((Collection) it.next()));
                    }
                    this.F0 = null;
                    this.f76357w0 = true;
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.v0.tryAddThrowableOrReport(th2)) {
                this.f76355t0.dispose();
                synchronized (this) {
                    this.F0 = null;
                }
                this.f76357w0 = true;
                b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.f76356u0, disposable)) {
                C0402a c0402a = new C0402a(this);
                this.f76355t0.add(c0402a);
                this.f76353r0.subscribe(c0402a);
            }
        }
    }

    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, C, ?, ?> f76361p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76362q0;

        public b(a<T, C, ?, ?> aVar, long j10) {
            this.f76361p0 = aVar;
            this.f76362q0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                this.f76361p0.a(this, this.f76362q0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            lazySet(disposableHelper);
            a<T, C, ?, ?> aVar = this.f76361p0;
            DisposableHelper.dispose(aVar.f76356u0);
            aVar.f76355t0.delete(this);
            aVar.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                disposable.dispose();
                this.f76361p0.a(this, this.f76362q0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableBufferBoundary(ObservableSource<T> observableSource, ObservableSource<? extends Open> observableSource2, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Supplier<U> supplier) {
        super(observableSource);
        this.f76349q0 = observableSource2;
        this.f76350r0 = function;
        this.f76348p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        a aVar = new a(observer, this.f76349q0, this.f76350r0, this.f76348p0);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
    }
}
