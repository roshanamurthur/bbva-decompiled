package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableCache extends Completable implements CompletableObserver {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f69985t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f69986u0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f69987p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<a[]> f69988q0 = new AtomicReference<>(f69985t0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicBoolean f69989r0 = new AtomicBoolean();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Throwable f69990s0;

    public final class a extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f69991p0;

        public a(CompletableObserver completableObserver) {
            this.f69991p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }

    public CompletableCache(CompletableSource completableSource) {
        this.f69987p0 = completableSource;
    }

    public final void d(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference<a[]> atomicReference = this.f69988q0;
            a[] aVarArr2 = atomicReference.get();
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
                aVarArr = f69985t0;
            } else {
                a[] aVarArr3 = new a[length - 1];
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

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        for (a aVar : this.f69988q0.getAndSet(f69986u0)) {
            if (!aVar.get()) {
                aVar.f69991p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        this.f69990s0 = th2;
        for (a aVar : this.f69988q0.getAndSet(f69986u0)) {
            if (!aVar.get()) {
                aVar.f69991p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver);
        completableObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f69988q0;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == f69986u0) {
                Throwable th2 = this.f69990s0;
                if (th2 != null) {
                    completableObserver.onError(th2);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get()) {
                        d(aVar);
                    }
                    if (this.f69989r0.compareAndSet(false, true)) {
                        this.f69987p0.subscribe(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
    }
}
