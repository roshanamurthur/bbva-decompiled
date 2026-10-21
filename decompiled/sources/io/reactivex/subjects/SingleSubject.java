package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78679t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f78680u0 = new a[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f78683r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Throwable f78684s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f78682q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78681p0 = new AtomicReference<>(f78679t0);

    public static final class a<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f78685p0;

        public a(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.f78685p0 = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> SingleSubject<T> create() {
        return new SingleSubject<>();
    }

    public final void c(@NonNull a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78681p0;
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
                aVarArr = f78679t0;
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

    @Nullable
    public Throwable getThrowable() {
        if (this.f78681p0.get() == f78680u0) {
            return this.f78684s0;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f78681p0.get() == f78680u0) {
            return this.f78683r0;
        }
        return null;
    }

    public boolean hasObservers() {
        return this.f78681p0.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78681p0.get() == f78680u0 && this.f78684s0 != null;
    }

    public boolean hasValue() {
        return this.f78681p0.get() == f78680u0 && this.f78683r0 != null;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(@NonNull Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f78682q0.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78684s0 = th2;
        for (a<T> aVar : this.f78681p0.getAndSet(f78680u0)) {
            aVar.f78685p0.onError(th2);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        if (this.f78681p0.get() == f78680u0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(@NonNull T t10) {
        ObjectHelper.requireNonNull(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78682q0.compareAndSet(false, true)) {
            this.f78683r0 = t10;
            for (a<T> aVar : this.f78681p0.getAndSet(f78680u0)) {
                aVar.f78685p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(@NonNull SingleObserver<? super T> singleObserver) {
        a<T> aVar = new a<>(singleObserver, this);
        singleObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78681p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78680u0) {
                Throwable th2 = this.f78684s0;
                if (th2 != null) {
                    singleObserver.onError(th2);
                    return;
                } else {
                    singleObserver.onSuccess(this.f78683r0);
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
                        c(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
