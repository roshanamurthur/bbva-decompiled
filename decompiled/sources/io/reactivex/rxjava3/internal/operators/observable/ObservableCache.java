package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCache<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> implements Observer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f76402p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76403q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f76404r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile long f76405s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b<T> f76406t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public b<T> f76407u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Throwable f76408w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile boolean f76409x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final a[] f76401y0 = new a[0];
    public static final a[] E0 = new a[0];

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76410p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableCache<T> f76411q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public b<T> f76412r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f76413s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f76414t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f76415u0;

        public a(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.f76410p0 = observer;
            this.f76411q0 = observableCache;
            this.f76412r0 = observableCache.f76406t0;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            a<T>[] aVarArr;
            if (this.f76415u0) {
                return;
            }
            this.f76415u0 = true;
            ObservableCache<T> observableCache = this.f76411q0;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = observableCache.f76404r0;
                a<T>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr2[i10] == this) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = ObservableCache.f76401y0;
                } else {
                    a<T>[] aVarArr3 = new a[length - 1];
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76415u0;
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f76416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile b<T> f76417b;

        public b(int i10) {
            this.f76416a = (T[]) new Object[i10];
        }
    }

    public ObservableCache(Observable<T> observable, int i10) {
        super(observable);
        this.f76403q0 = i10;
        this.f76402p0 = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f76406t0 = bVar;
        this.f76407u0 = bVar;
        this.f76404r0 = new AtomicReference<>(f76401y0);
    }

    public final void d(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j10 = aVar.f76414t0;
        int i10 = aVar.f76413s0;
        b<T> bVar = aVar.f76412r0;
        Observer<? super T> observer = aVar.f76410p0;
        int i11 = this.f76403q0;
        int iAddAndGet = 1;
        while (!aVar.f76415u0) {
            boolean z10 = this.f76409x0;
            boolean z11 = this.f76405s0 == j10;
            if (z10 && z11) {
                aVar.f76412r0 = null;
                Throwable th2 = this.f76408w0;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (z11) {
                aVar.f76414t0 = j10;
                aVar.f76413s0 = i10;
                aVar.f76412r0 = bVar;
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i10 == i11) {
                    bVar = bVar.f76417b;
                    i10 = 0;
                }
                observer.onNext(bVar.f76416a[i10]);
                i10++;
                j10++;
            }
        }
        aVar.f76412r0 = null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        this.f76409x0 = true;
        for (a<T> aVar : this.f76404r0.getAndSet(E0)) {
            d(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        this.f76408w0 = th2;
        this.f76409x0 = true;
        for (a<T> aVar : this.f76404r0.getAndSet(E0)) {
            d(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        int i10 = this.v0;
        if (i10 == this.f76403q0) {
            b<T> bVar = new b<>(i10);
            bVar.f76416a[0] = t10;
            this.v0 = 1;
            this.f76407u0.f76417b = bVar;
            this.f76407u0 = bVar;
        } else {
            this.f76407u0.f76416a[i10] = t10;
            this.v0 = i10 + 1;
        }
        this.f76405s0++;
        for (a<T> aVar : this.f76404r0.get()) {
            d(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f76404r0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == E0) {
                break;
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == aVarArr);
        }
        AtomicBoolean atomicBoolean = this.f76402p0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            d(aVar);
        } else {
            this.source.subscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
    }
}
