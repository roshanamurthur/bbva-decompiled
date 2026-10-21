package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f75746t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f75747u0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<MaybeSource<T>> f75748p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f75749q0 = new AtomicReference<>(f75746t0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f75750r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Throwable f75751s0;

    public static final class a<T> extends AtomicReference<MaybeCache<T>> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75752p0;

        public a(MaybeObserver<? super T> maybeObserver, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.f75752p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    public MaybeCache(MaybeSource<T> maybeSource) {
        this.f75748p0 = new AtomicReference<>(maybeSource);
    }

    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f75749q0;
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
                aVarArr = f75746t0;
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

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        for (a<T> aVar : this.f75749q0.getAndSet(f75747u0)) {
            if (!aVar.isDisposed()) {
                aVar.f75752p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f75751s0 = th2;
        for (a<T> aVar : this.f75749q0.getAndSet(f75747u0)) {
            if (!aVar.isDisposed()) {
                aVar.f75752p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        this.f75750r0 = t10;
        for (a<T> aVar : this.f75749q0.getAndSet(f75747u0)) {
            if (!aVar.isDisposed()) {
                aVar.f75752p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a<T> aVar = new a<>(maybeObserver, this);
        maybeObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f75749q0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f75747u0) {
                if (aVar.isDisposed()) {
                    return;
                }
                Throwable th2 = this.f75751s0;
                if (th2 != null) {
                    maybeObserver.onError(th2);
                    return;
                }
                T t10 = this.f75750r0;
                if (t10 != null) {
                    maybeObserver.onSuccess(t10);
                    return;
                } else {
                    maybeObserver.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.isDisposed()) {
                        a(aVar);
                        return;
                    }
                    MaybeSource<T> andSet = this.f75748p0.getAndSet(null);
                    if (andSet != null) {
                        andSet.subscribe(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
    }
}
