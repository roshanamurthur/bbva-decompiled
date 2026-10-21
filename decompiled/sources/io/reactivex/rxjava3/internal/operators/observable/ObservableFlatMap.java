package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends U>> f76652p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f76653q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f76654r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76655s0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements Observer<U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U> f76656p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f76657q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile SimpleQueue<U> f76658r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f76659s0;

        public a(b bVar) {
            this.f76656p0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76657q0 = true;
            this.f76656p0.c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76656p0.f76666w0.tryAddThrowableOrReport(th2)) {
                b<T, U> bVar = this.f76656p0;
                if (!bVar.f76662r0) {
                    bVar.b();
                }
                this.f76657q0 = true;
                this.f76656p0.c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(U u2) {
            if (this.f76659s0 != 0) {
                this.f76656p0.c();
                return;
            }
            b<T, U> bVar = this.f76656p0;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f76660p0.onNext(u2);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.f76658r0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(bVar.f76664t0);
                    this.f76658r0 = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(u2);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.d();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f76659s0 = iRequestFusion;
                    this.f76658r0 = queueDisposable;
                    this.f76657q0 = true;
                    this.f76656p0.c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f76659s0 = iRequestFusion;
                    this.f76658r0 = queueDisposable;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final a<?, ?>[] J0 = new a[0];
        public static final a<?, ?>[] K0 = new a[0];
        public Disposable E0;
        public long F0;
        public int G0;
        public final ArrayDeque H0;
        public int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76660p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f76661q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76662r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f76663s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f76664t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile SimplePlainQueue<U> f76665u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicThrowable f76666w0 = new AtomicThrowable();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76667x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f76668y0;

        public b(int i10, int i11, Observer observer, Function function, boolean z10) {
            this.f76660p0 = observer;
            this.f76661q0 = function;
            this.f76662r0 = z10;
            this.f76663s0 = i10;
            this.f76664t0 = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.H0 = new ArrayDeque(i10);
            }
            this.f76668y0 = new AtomicReference<>(J0);
        }

        public final boolean a() {
            if (this.f76667x0) {
                return true;
            }
            Throwable th2 = this.f76666w0.get();
            if (this.f76662r0 || th2 == null) {
                return false;
            }
            b();
            this.f76666w0.tryTerminateConsumer(this.f76660p0);
            return true;
        }

        public final boolean b() {
            this.E0.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f76668y0;
            a<?, ?>[] aVarArr = K0;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet == aVarArr) {
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

        /* JADX WARN: Code duplicated, block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[PHI: r4
          0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            int size;
            boolean z10;
            Observer<? super U> observer = this.f76660p0;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f76665u0;
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
                    SimplePlainQueue<U> simplePlainQueue2 = this.f76665u0;
                    a<?, ?>[] aVarArr = this.f76668y0.get();
                    int length = aVarArr.length;
                    if (this.f76663s0 != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.H0.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z11 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                        this.f76666w0.tryTerminateConsumer(this.f76660p0);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.G0);
                        for (int i11 = 0; i11 < length; i11++) {
                            if (a()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[iMin];
                            SimpleQueue<U> simpleQueue = aVar.f76658r0;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        U uPoll2 = simpleQueue.poll();
                                        if (uPoll2 == null) {
                                            z10 = aVar.f76657q0;
                                            SimpleQueue<U> simpleQueue2 = aVar.f76658r0;
                                            if (z10 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                                e(aVar);
                                                i10++;
                                            }
                                            iMin++;
                                            if (iMin == length) {
                                                iMin = 0;
                                            }
                                        } else {
                                            observer.onNext(uPoll2);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        DisposableHelper.dispose(aVar);
                                        this.f76666w0.tryAddThrowableOrReport(th2);
                                        if (a()) {
                                            return;
                                        }
                                        e(aVar);
                                        i10++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                } while (!a());
                                return;
                            }
                            z10 = aVar.f76657q0;
                            SimpleQueue<U> simpleQueue3 = aVar.f76658r0;
                            if (z10) {
                                e(aVar);
                                i10++;
                            }
                            iMin++;
                            if (iMin == length) {
                                iMin = 0;
                            }
                        }
                        this.G0 = iMin;
                    }
                    if (i10 == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f76663s0 != Integer.MAX_VALUE) {
                        g(i10);
                    }
                } else if (this.f76663s0 != Integer.MAX_VALUE) {
                    g(i10);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76667x0 = true;
            if (b()) {
                this.f76666w0.tryTerminateAndReport();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f76668y0;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
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
                    aVarArr = J0;
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
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v5, types: [io.reactivex.rxjava3.internal.fuseable.SimpleQueue] */
        public final void f(ObservableSource<? extends U> observableSource) {
            boolean z10;
            do {
                z10 = false;
                if (observableSource instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) observableSource).get();
                        if (obj != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                this.f76660p0.onNext(obj);
                                if (decrementAndGet() != 0) {
                                }
                            } else {
                                SimplePlainQueue<U> simplePlainQueue = this.f76665u0;
                                ?? r3 = simplePlainQueue;
                                if (simplePlainQueue == false) {
                                    SimplePlainQueue<U> spscLinkedArrayQueue = this.f76663s0 == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.f76664t0) : new SpscArrayQueue(this.f76663s0);
                                    this.f76665u0 = spscLinkedArrayQueue;
                                    r3 = spscLinkedArrayQueue;
                                }
                                r3.offer(obj);
                                if (getAndIncrement() != 0) {
                                    return;
                                }
                            }
                            d();
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f76666w0.tryAddThrowableOrReport(th2);
                        c();
                    }
                    if (this.f76663s0 == Integer.MAX_VALUE) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            observableSource = (ObservableSource) this.H0.poll();
                            if (observableSource == null) {
                                this.I0--;
                                z10 = true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    this.F0++;
                    a<?, ?> aVar = new a<>(this);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f76668y0;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == K0) {
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
                        ObservableSource<? extends U> observableSource = (ObservableSource) this.H0.poll();
                        if (observableSource == null) {
                            this.I0--;
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76667x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
            } else if (this.f76666w0.tryAddThrowableOrReport(th2)) {
                this.v0 = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSourceApply = this.f76661q0.apply(t10);
                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                ObservableSource<? extends U> observableSource = observableSourceApply;
                if (this.f76663s0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.I0;
                            if (i10 == this.f76663s0) {
                                this.H0.offer(observableSource);
                                return;
                            }
                            this.I0 = i10 + 1;
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.E0, disposable)) {
                this.E0 = disposable;
                this.f76660p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z10, int i10, int i11) {
        super(observableSource);
        this.f76652p0 = function;
        this.f76653q0 = z10;
        this.f76654r0 = i10;
        this.f76655s0 = i11;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.f76652p0)) {
            return;
        }
        this.source.subscribe(new b(this.f76654r0, this.f76655s0, observer, this.f76652p0, this.f76653q0));
    }
}
