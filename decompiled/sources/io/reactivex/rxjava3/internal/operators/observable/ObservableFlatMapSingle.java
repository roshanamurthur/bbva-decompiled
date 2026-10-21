package io.reactivex.rxjava3.internal.operators.observable;

import a.e;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapSingle<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76699p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f76700q0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76701p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f76702q0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f76706u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f76707w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76708x0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f76703r0 = new CompositeDisposable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f76705t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f76704s0 = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> v0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C0411a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public C0411a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f76703r0;
                compositeDisposable.delete(this);
                if (aVar.f76705t0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76702q0) {
                        aVar.f76707w0.dispose();
                        compositeDisposable.dispose();
                    }
                    aVar.f76704s0.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0044  */
            /* JADX WARN: Code duplicated, block: B:21:0x0050  */
            /* JADX WARN: Code duplicated, block: B:25:0x0061  */
            /* JADX WARN: Code duplicated, block: B:39:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:0x0067 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:22:0x0059->B:43:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                AtomicReference<SpscLinkedArrayQueue<R>> atomicReference;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2;
                a aVar = a.this;
                aVar.f76703r0.delete(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.f76701p0.onNext(r3);
                        boolean z10 = aVar.f76704s0.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = aVar.v0.get();
                        if (z10 && (spscLinkedArrayQueue3 == null || spscLinkedArrayQueue3.isEmpty())) {
                            aVar.f76705t0.tryTerminateConsumer(aVar.f76701p0);
                            return;
                        } else if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        atomicReference = aVar.v0;
                        spscLinkedArrayQueue = atomicReference.get();
                        if (spscLinkedArrayQueue == null) {
                            spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
                            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
                                if (atomicReference.get() != null) {
                                    spscLinkedArrayQueue = atomicReference.get();
                                    break;
                                }
                            }
                        }
                        spscLinkedArrayQueue2 = spscLinkedArrayQueue;
                        synchronized (spscLinkedArrayQueue2) {
                            spscLinkedArrayQueue2.offer(r3);
                        }
                        aVar.f76704s0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    atomicReference = aVar.v0;
                    spscLinkedArrayQueue = atomicReference.get();
                    if (spscLinkedArrayQueue == null) {
                        spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
                        while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
                            if (atomicReference.get() != null) {
                                spscLinkedArrayQueue = atomicReference.get();
                                break;
                            }
                        }
                    }
                    spscLinkedArrayQueue2 = spscLinkedArrayQueue;
                    synchronized (spscLinkedArrayQueue2) {
                        spscLinkedArrayQueue2.offer(r3);
                        aVar.f76704s0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f76701p0 = observer;
            this.f76706u0 = function;
            this.f76702q0 = z10;
        }

        public final void a() {
            Observer<? super R> observer = this.f76701p0;
            AtomicInteger atomicInteger = this.f76704s0;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.v0;
            int iAddAndGet = 1;
            while (!this.f76708x0) {
                if (!this.f76702q0 && this.f76705t0.get() != null) {
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.v0.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    this.f76705t0.tryTerminateConsumer(observer);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                e eVarPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11) {
                    this.f76705t0.tryTerminateConsumer(this.f76701p0);
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(eVarPoll);
                }
            }
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.v0.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76708x0 = true;
            this.f76707w0.dispose();
            this.f76703r0.dispose();
            this.f76705t0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76708x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76704s0.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76704s0.decrementAndGet();
            if (this.f76705t0.tryAddThrowableOrReport(th2)) {
                if (!this.f76702q0) {
                    this.f76703r0.dispose();
                }
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            try {
                SingleSource<? extends R> singleSourceApply = this.f76706u0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                this.f76704s0.getAndIncrement();
                C0411a c0411a = new C0411a();
                if (this.f76708x0 || !this.f76703r0.add(c0411a)) {
                    return;
                }
                singleSource.subscribe(c0411a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76707w0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76707w0, disposable)) {
                this.f76707w0 = disposable;
                this.f76701p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapSingle(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        super(observableSource);
        this.f76699p0 = function;
        this.f76700q0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f76699p0, this.f76700q0));
    }
}
