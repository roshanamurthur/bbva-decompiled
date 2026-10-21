package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f77630u0 = new a[0];
    public static final a[] v0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77631p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f77632q0 = new AtomicInteger();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f77633r0 = new AtomicReference<>(f77630u0);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public T f77634s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Throwable f77635t0;

    public static final class a<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77636p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleCache<T> f77637q0;

        public a(SingleObserver<? super T> singleObserver, SingleCache<T> singleCache) {
            this.f77636p0 = singleObserver;
            this.f77637q0 = singleCache;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f77637q0.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(SingleSource<? extends T> singleSource) {
        this.f77631p0 = singleSource;
    }

    public final void c(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f77633r0;
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
                aVarArr = f77630u0;
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

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f77635t0 = th2;
        for (a<T> aVar : this.f77633r0.getAndSet(v0)) {
            if (!aVar.get()) {
                aVar.f77636p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        this.f77634s0 = t10;
        for (a<T> aVar : this.f77633r0.getAndSet(v0)) {
            if (!aVar.get()) {
                aVar.f77636p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a<T> aVar = new a<>(singleObserver, this);
        singleObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f77633r0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == v0) {
                Throwable th2 = this.f77635t0;
                if (th2 != null) {
                    singleObserver.onError(th2);
                    return;
                } else {
                    singleObserver.onSuccess(this.f77634s0);
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
                    if (this.f77632q0.getAndIncrement() == 0) {
                        this.f77631p0.subscribe(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
    }
}
