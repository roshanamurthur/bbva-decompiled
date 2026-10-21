package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends U>> f72371p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f72372q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f72373r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72374s0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f72375p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U> f72376q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f72377r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile SimpleQueue<U> f72378s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f72379t0;

        public a(b<T, U> bVar, long j10) {
            this.f72375p0 = j10;
            this.f72376q0 = bVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72377r0 = true;
            this.f72376q0.c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f72376q0.f72386w0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            b<T, U> bVar = this.f72376q0;
            if (!bVar.f72382r0) {
                bVar.b();
            }
            this.f72377r0 = true;
            this.f72376q0.c();
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u2) {
            if (this.f72379t0 != 0) {
                this.f72376q0.c();
                return;
            }
            b<T, U> bVar = this.f72376q0;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f72380p0.onNext(u2);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.f72378s0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(bVar.f72384t0);
                    this.f72378s0 = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(u2);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.d();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f72379t0 = iRequestFusion;
                    this.f72378s0 = queueDisposable;
                    this.f72377r0 = true;
                    this.f72376q0.c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f72379t0 = iRequestFusion;
                    this.f72378s0 = queueDisposable;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final a<?, ?>[] K0 = new a[0];
        public static final a<?, ?>[] L0 = new a[0];
        public Disposable E0;
        public long F0;
        public long G0;
        public int H0;
        public final ArrayDeque I0;
        public int J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f72380p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f72381q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f72382r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f72383s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f72384t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimplePlainQueue<U> f72385u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicThrowable f72386w0 = new AtomicThrowable();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72387x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f72388y0;

        public b(int i10, int i11, Observer observer, Function function, boolean z10) {
            this.f72380p0 = observer;
            this.f72381q0 = function;
            this.f72382r0 = z10;
            this.f72383s0 = i10;
            this.f72384t0 = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.I0 = new ArrayDeque(i10);
            }
            this.f72388y0 = new AtomicReference<>(K0);
        }

        public final boolean a() {
            if (this.f72387x0) {
                return true;
            }
            Throwable th2 = this.f72386w0.get();
            if (this.f72382r0 || th2 == null) {
                return false;
            }
            b();
            Throwable thTerminate = this.f72386w0.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f72380p0.onError(thTerminate);
            }
            return true;
        }

        public final boolean b() {
            a<?, ?>[] andSet;
            this.E0.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f72388y0;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = L0;
            if (aVarArr == aVarArr2 || (andSet = atomicReference.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                DisposableHelper.dispose(aVar);
            }
            return true;
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* JADX WARN: Code duplicated, block: B:113:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:90:0x00fc A[PHI: r4
          0x00fc: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:77:0x00db, B:89:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            int size;
            boolean z10;
            Observer<? super U> observer = this.f72380p0;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f72385u0;
                int i10 = 0;
                if (simplePlainQueue != null) {
                    while (!a()) {
                        U uPoll = simplePlainQueue.poll();
                        if (uPoll != null) {
                            observer.onNext(uPoll);
                            i10++;
                        }
                    }
                    return;
                }
                if (i10 == 0) {
                    boolean z11 = this.v0;
                    SimplePlainQueue<U> simplePlainQueue2 = this.f72385u0;
                    a<?, ?>[] aVarArr = this.f72388y0.get();
                    int length = aVarArr.length;
                    if (this.f72383s0 != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.I0.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z11 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thTerminate = this.f72386w0.terminate();
                        if (thTerminate != ExceptionHelper.TERMINATED) {
                            if (thTerminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(thTerminate);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j10 = this.G0;
                        int i11 = this.H0;
                        if (length <= i11 || aVarArr[i11].f72375p0 != j10) {
                            if (length <= i11) {
                                i11 = 0;
                            }
                            for (int i12 = 0; i12 < length && aVarArr[i11].f72375p0 != j10; i12++) {
                                i11++;
                                if (i11 == length) {
                                    i11 = 0;
                                }
                            }
                            this.H0 = i11;
                            this.G0 = aVarArr[i11].f72375p0;
                        }
                        for (int i13 = 0; i13 < length; i13++) {
                            if (a()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[i11];
                            SimpleQueue<U> simpleQueue = aVar.f72378s0;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        U uPoll2 = simpleQueue.poll();
                                        if (uPoll2 == null) {
                                            z10 = aVar.f72377r0;
                                            SimpleQueue<U> simpleQueue2 = aVar.f72378s0;
                                            if (z10 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                                e(aVar);
                                                if (a()) {
                                                    return;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                            i11++;
                                            if (i11 == length) {
                                                i11 = 0;
                                            }
                                        } else {
                                            observer.onNext(uPoll2);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        DisposableHelper.dispose(aVar);
                                        this.f72386w0.addThrowable(th2);
                                        if (a()) {
                                            return;
                                        }
                                        e(aVar);
                                        i10++;
                                        i11++;
                                        if (i11 == length) {
                                        }
                                    }
                                } while (!a());
                                return;
                            }
                            z10 = aVar.f72377r0;
                            SimpleQueue<U> simpleQueue3 = aVar.f72378s0;
                            if (z10) {
                                e(aVar);
                                if (a()) {
                                    return;
                                } else {
                                    i10++;
                                }
                            }
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                        }
                        this.H0 = i11;
                        this.G0 = aVarArr[i11].f72375p0;
                    }
                    if (i10 == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f72383s0 != Integer.MAX_VALUE) {
                        g(i10);
                    }
                } else if (this.f72383s0 != Integer.MAX_VALUE) {
                    g(i10);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Throwable thTerminate;
            if (this.f72387x0) {
                return;
            }
            this.f72387x0 = true;
            if (!b() || (thTerminate = this.f72386w0.terminate()) == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f72388y0;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr2[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = K0;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v5, types: [io.reactivex.internal.fuseable.SimpleQueue] */
        public final void f(ObservableSource<? extends U> observableSource) {
            boolean z10;
            do {
                z10 = false;
                if (observableSource instanceof Callable) {
                    try {
                        Object objCall = ((Callable) observableSource).call();
                        if (objCall != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                this.f72380p0.onNext(objCall);
                                if (decrementAndGet() != 0) {
                                    d();
                                }
                            } else {
                                SimplePlainQueue<U> simplePlainQueue = this.f72385u0;
                                ?? r3 = simplePlainQueue;
                                if (simplePlainQueue == false) {
                                    SimplePlainQueue<U> spscLinkedArrayQueue = this.f72383s0 == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.f72384t0) : new SpscArrayQueue(this.f72383s0);
                                    this.f72385u0 = spscLinkedArrayQueue;
                                    r3 = spscLinkedArrayQueue;
                                }
                                if (r3.offer(objCall)) {
                                    if (getAndIncrement() != 0) {
                                        return;
                                    }
                                    d();
                                } else {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f72386w0.addThrowable(th2);
                        c();
                    }
                    if (this.f72383s0 == Integer.MAX_VALUE) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            observableSource = (ObservableSource) this.I0.poll();
                            if (observableSource == null) {
                                this.J0--;
                                z10 = true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    long j10 = this.F0;
                    this.F0 = 1 + j10;
                    a<?, ?> aVar = new a<>(this, j10);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f72388y0;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == L0) {
                            DisposableHelper.dispose(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        do {
                            if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                                observableSource.subscribe(aVar);
                                return;
                            }
                        } while (atomicReference.get() == aVarArr);
                    }
                }
            } while (!z10);
            c();
        }

        public final void g(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource<? extends U> observableSource = (ObservableSource) this.I0.poll();
                        if (observableSource == null) {
                            this.J0--;
                        } else {
                            f(observableSource);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                i10 = i11;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72387x0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
            } else if (!this.f72386w0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.v0 = true;
                c();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72381q0.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f72383s0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.J0;
                            if (i10 == this.f72383s0) {
                                this.I0.offer(observableSource);
                                return;
                            }
                            this.J0 = i10 + 1;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                f(observableSource);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.E0.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.E0, disposable)) {
                this.E0 = disposable;
                this.f72380p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z10, int i10, int i11) {
        super(observableSource);
        this.f72371p0 = function;
        this.f72372q0 = z10;
        this.f72373r0 = i10;
        this.f72374s0 = i11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.f72371p0)) {
            return;
        }
        this.source.subscribe(new b(this.f72373r0, this.f72374s0, observer, this.f72371p0, this.f72372q0));
    }
}
