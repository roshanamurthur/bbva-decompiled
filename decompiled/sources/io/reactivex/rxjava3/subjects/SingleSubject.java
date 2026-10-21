package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78434t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f78435u0 = new a[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f78438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Throwable f78439s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f78437q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78436p0 = new AtomicReference<>(f78434t0);

    public static final class a<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f78440p0;

        public a(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.f78440p0 = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
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
            AtomicReference<a<T>[]> atomicReference = this.f78436p0;
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
                aVarArr = f78434t0;
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
        if (this.f78436p0.get() == f78435u0) {
            return this.f78439s0;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f78436p0.get() == f78435u0) {
            return this.f78438r0;
        }
        return null;
    }

    public boolean hasObservers() {
        return this.f78436p0.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78436p0.get() == f78435u0 && this.f78439s0 != null;
    }

    public boolean hasValue() {
        return this.f78436p0.get() == f78435u0 && this.f78438r0 != null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(@NonNull Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        if (!this.f78437q0.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78439s0 = th2;
        for (a<T> aVar : this.f78436p0.getAndSet(f78435u0)) {
            aVar.f78440p0.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        if (this.f78436p0.get() == f78435u0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(@NonNull T t10) {
        ExceptionHelper.nullCheck(t10, "onSuccess called with a null value.");
        if (this.f78437q0.compareAndSet(false, true)) {
            this.f78438r0 = t10;
            for (a<T> aVar : this.f78436p0.getAndSet(f78435u0)) {
                aVar.f78440p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(@NonNull SingleObserver<? super T> singleObserver) {
        a<T> aVar = new a<>(singleObserver, this);
        singleObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78436p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78435u0) {
                Throwable th2 = this.f78439s0;
                if (th2 != null) {
                    singleObserver.onError(th2);
                    return;
                } else {
                    singleObserver.onSuccess(this.f78438r0);
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
