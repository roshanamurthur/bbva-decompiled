package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f73376u0 = new a[0];
    public static final a[] v0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f73378q0 = new AtomicInteger();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f73379r0 = new AtomicReference<>(f73376u0);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public T f73380s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Throwable f73381t0;

    public static final class a<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73382p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleCache<T> f73383q0;

        public a(SingleObserver<? super T> singleObserver, SingleCache<T> singleCache) {
            this.f73382p0 = singleObserver;
            this.f73383q0 = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f73383q0.c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(SingleSource<? extends T> singleSource) {
        this.f73377p0 = singleSource;
    }

    public final void c(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73379r0;
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
                aVarArr = f73376u0;
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

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f73381t0 = th2;
        for (a<T> aVar : this.f73379r0.getAndSet(v0)) {
            if (!aVar.get()) {
                aVar.f73382p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t10) {
        this.f73380s0 = t10;
        for (a<T> aVar : this.f73379r0.getAndSet(v0)) {
            if (!aVar.get()) {
                aVar.f73382p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a<T> aVar = new a<>(singleObserver, this);
        singleObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f73379r0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == v0) {
                Throwable th2 = this.f73381t0;
                if (th2 != null) {
                    singleObserver.onError(th2);
                    return;
                } else {
                    singleObserver.onSuccess(this.f73380s0);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get()) {
                        c(aVar);
                    }
                    if (this.f73378q0.getAndIncrement() == 0) {
                        this.f73377p0.subscribe(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
    }
}
