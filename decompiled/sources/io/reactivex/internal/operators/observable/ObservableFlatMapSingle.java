package io.reactivex.internal.operators.observable;

import a.e;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapSingle<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f72419p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f72420q0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72421p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f72422q0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f72426u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f72427w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72428x0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f72423r0 = new CompositeDisposable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f72425t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f72424s0 = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> v0 = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C0346a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public C0346a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f72423r0;
                compositeDisposable.delete(this);
                if (!aVar.f72425t0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (!aVar.f72422q0) {
                    aVar.f72427w0.dispose();
                    compositeDisposable.dispose();
                }
                aVar.f72424s0.decrementAndGet();
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x005c  */
            /* JADX WARN: Code duplicated, block: B:39:0x0085  */
            /* JADX WARN: Code duplicated, block: B:42:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x005a A[EDGE_INSN: B:44:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:21:0x0050->B:47:?], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x005a A[EDGE_INSN: B:45:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:21:0x0050->B:47:?, LOOP_LABEL: LOOP:0: B:21:0x0050->B:47:?], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                AtomicReference<SpscLinkedArrayQueue<R>> atomicReference;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2;
                a aVar = a.this;
                aVar.f72423r0.delete(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.f72421p0.onNext(r3);
                        boolean z10 = aVar.f72424s0.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = aVar.v0.get();
                        if (z10 && (spscLinkedArrayQueue3 == null || spscLinkedArrayQueue3.isEmpty())) {
                            Throwable thTerminate = aVar.f72425t0.terminate();
                            if (thTerminate != null) {
                                aVar.f72421p0.onError(thTerminate);
                                return;
                            } else {
                                aVar.f72421p0.onComplete();
                                return;
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        loop0: while (true) {
                            atomicReference = aVar.v0;
                            spscLinkedArrayQueue = atomicReference.get();
                            if (spscLinkedArrayQueue != null) {
                                break;
                            }
                            spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
                            do {
                                if (atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
                                    break loop0;
                                }
                            } while (atomicReference.get() == null);
                        }
                        spscLinkedArrayQueue2 = spscLinkedArrayQueue;
                        synchronized (spscLinkedArrayQueue2) {
                            spscLinkedArrayQueue2.offer(r3);
                        }
                        aVar.f72424s0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    loop0: while (true) {
                        atomicReference = aVar.v0;
                        spscLinkedArrayQueue = atomicReference.get();
                        if (spscLinkedArrayQueue != null) {
                            break;
                            break;
                        }
                        spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
                        do {
                            if (atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
                                break loop0;
                                break loop0;
                            }
                        } while (atomicReference.get() == null);
                    }
                    spscLinkedArrayQueue2 = spscLinkedArrayQueue;
                    synchronized (spscLinkedArrayQueue2) {
                        spscLinkedArrayQueue2.offer(r3);
                        aVar.f72424s0.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f72421p0 = observer;
            this.f72426u0 = function;
            this.f72422q0 = z10;
        }

        public final void a() {
            Observer<? super R> observer = this.f72421p0;
            AtomicInteger atomicInteger = this.f72424s0;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.v0;
            int iAddAndGet = 1;
            while (!this.f72428x0) {
                if (!this.f72422q0 && this.f72425t0.get() != null) {
                    Throwable thTerminate = this.f72425t0.terminate();
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.v0.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    observer.onError(thTerminate);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                e eVarPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = this.f72425t0.terminate();
                    if (thTerminate2 != null) {
                        observer.onError(thTerminate2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z11) {
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72428x0 = true;
            this.f72427w0.dispose();
            this.f72423r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72428x0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72424s0.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72424s0.decrementAndGet();
            if (!this.f72425t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f72422q0) {
                this.f72423r0.dispose();
            }
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f72426u0.apply(t10), "The mapper returned a null SingleSource");
                this.f72424s0.getAndIncrement();
                C0346a c0346a = new C0346a();
                if (this.f72428x0 || !this.f72423r0.add(c0346a)) {
                    return;
                }
                singleSource.subscribe(c0346a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72427w0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72427w0, disposable)) {
                this.f72427w0 = disposable;
                this.f72421p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapSingle(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        super(observableSource);
        this.f72419p0 = function;
        this.f72420q0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f72419p0, this.f72420q0));
    }
}
