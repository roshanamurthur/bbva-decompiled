package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a[] f78632s0 = new a[0];

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78633t0 = new a[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Throwable f78636r0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f78635q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a[]> f78634p0 = new AtomicReference<>(f78632s0);

    public static final class a extends AtomicReference<CompletableSubject> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f78637p0;

        public a(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.f78637p0 = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    @CheckReturnValue
    @NonNull
    public static CompletableSubject create() {
        return new CompletableSubject();
    }

    public final void d(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference<a[]> atomicReference = this.f78634p0;
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
                aVarArr = f78632s0;
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

    @Nullable
    public Throwable getThrowable() {
        if (this.f78634p0.get() == f78633t0) {
            return this.f78636r0;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f78634p0.get() == f78633t0 && this.f78636r0 == null;
    }

    public boolean hasObservers() {
        return this.f78634p0.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78634p0.get() == f78633t0 && this.f78636r0 != null;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.f78635q0.compareAndSet(false, true)) {
            for (a aVar : this.f78634p0.getAndSet(f78633t0)) {
                aVar.f78637p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f78635q0.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78636r0 = th2;
        for (a aVar : this.f78634p0.getAndSet(f78633t0)) {
            aVar.f78637p0.onError(th2);
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.f78634p0.get() == f78633t0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this);
        completableObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f78634p0;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == f78633t0) {
                Throwable th2 = this.f78636r0;
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
                    if (aVar.isDisposed()) {
                        d(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
