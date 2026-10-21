package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class AsyncSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a[] f78367s0 = new a[0];

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78368t0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78369p0 = new AtomicReference<>(f78367s0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f78370q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f78371r0;

    public static final class a<T> extends DeferredScalarDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AsyncSubject<T> f78372p0;

        public a(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
            this.f78372p0 = asyncSubject;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (super.tryDispose()) {
                this.f78372p0.d(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncSubject<T> create() {
        return new AsyncSubject<>();
    }

    public final void d(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78369p0;
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
                aVarArr = f78367s0;
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

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public Throwable getThrowable() {
        if (this.f78369p0.get() == f78368t0) {
            return this.f78370q0;
        }
        return null;
    }

    @CheckReturnValue
    @Nullable
    public T getValue() {
        if (this.f78369p0.get() == f78368t0) {
            return this.f78371r0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78369p0.get() == f78368t0 && this.f78370q0 == null;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasObservers() {
        return this.f78369p0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78369p0.get() == f78368t0 && this.f78370q0 != null;
    }

    @CheckReturnValue
    public boolean hasValue() {
        return this.f78369p0.get() == f78368t0 && this.f78371r0 != null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f78369p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78368t0;
        if (aVarArr == aVarArr2) {
            return;
        }
        T t10 = this.f78371r0;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].complete(t10);
            i10++;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f78369p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78368t0;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78371r0 = null;
        this.f78370q0 = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78369p0.get() == f78368t0) {
            return;
        }
        this.f78371r0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78369p0.get() == f78368t0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78369p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78368t0) {
                Throwable th2 = this.f78370q0;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                }
                T t10 = this.f78371r0;
                if (t10 != null) {
                    aVar.complete(t10);
                    return;
                } else {
                    aVar.onComplete();
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
                        d(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
