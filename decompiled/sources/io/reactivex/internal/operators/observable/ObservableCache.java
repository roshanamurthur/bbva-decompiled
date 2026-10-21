package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.a<T, T> implements Observer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f72147p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72148q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f72149r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile long f72150s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b<T> f72151t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public b<T> f72152u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Throwable f72153w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile boolean f72154x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final a[] f72146y0 = new a[0];
    public static final a[] E0 = new a[0];

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72155p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableCache<T> f72156q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public b<T> f72157r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f72158s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f72159t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f72160u0;

        public a(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.f72155p0 = observer;
            this.f72156q0 = observableCache;
            this.f72157r0 = observableCache.f72151t0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            a<T>[] aVarArr;
            if (this.f72160u0) {
                return;
            }
            this.f72160u0 = true;
            ObservableCache<T> observableCache = this.f72156q0;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = observableCache.f72149r0;
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
                    aVarArr = ObservableCache.f72146y0;
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

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72160u0;
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f72161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile b<T> f72162b;

        public b(int i10) {
            this.f72161a = (T[]) new Object[i10];
        }
    }

    public ObservableCache(Observable<T> observable, int i10) {
        super(observable);
        this.f72148q0 = i10;
        this.f72147p0 = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f72151t0 = bVar;
        this.f72152u0 = bVar;
        this.f72149r0 = new AtomicReference<>(f72146y0);
    }

    public final void d(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j10 = aVar.f72159t0;
        int i10 = aVar.f72158s0;
        b<T> bVar = aVar.f72157r0;
        Observer<? super T> observer = aVar.f72155p0;
        int i11 = this.f72148q0;
        int iAddAndGet = 1;
        while (!aVar.f72160u0) {
            boolean z10 = this.f72154x0;
            boolean z11 = this.f72150s0 == j10;
            if (z10 && z11) {
                aVar.f72157r0 = null;
                Throwable th2 = this.f72153w0;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (z11) {
                aVar.f72159t0 = j10;
                aVar.f72158s0 = i10;
                aVar.f72157r0 = bVar;
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i10 == i11) {
                    bVar = bVar.f72162b;
                    i10 = 0;
                }
                observer.onNext(bVar.f72161a[i10]);
                i10++;
                j10++;
            }
        }
        aVar.f72157r0 = null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f72154x0 = true;
        for (a<T> aVar : this.f72149r0.getAndSet(E0)) {
            d(aVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f72153w0 = th2;
        this.f72154x0 = true;
        for (a<T> aVar : this.f72149r0.getAndSet(E0)) {
            d(aVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        int i10 = this.v0;
        if (i10 == this.f72148q0) {
            b<T> bVar = new b<>(i10);
            bVar.f72161a[0] = t10;
            this.v0 = 1;
            this.f72152u0.f72162b = bVar;
            this.f72152u0 = bVar;
        } else {
            this.f72152u0.f72161a[i10] = t10;
            this.v0 = i10 + 1;
        }
        this.f72150s0++;
        for (a<T> aVar : this.f72149r0.get()) {
            d(aVar);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f72149r0;
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
        AtomicBoolean atomicBoolean = this.f72147p0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            d(aVar);
        } else {
            this.source.subscribe(this);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }
}
