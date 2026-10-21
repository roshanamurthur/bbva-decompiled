package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a[] f78400r0 = new a[0];

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a[] f78401s0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78402p0 = new AtomicReference<>(f78401s0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f78403q0;

    public static final class a<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f78404p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final PublishSubject<T> f78405q0;

        public a(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.f78404p0 = observer;
            this.f78405q0 = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f78405q0.d(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>();
    }

    public final void d(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78402p0;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f78400r0 || aVarArr2 == (aVarArr = f78401s0)) {
                return;
            }
            int length = aVarArr2.length;
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
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i10);
                System.arraycopy(aVarArr2, i10 + 1, aVarArr, i10, (length - i10) - 1);
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
    @Nullable
    public Throwable getThrowable() {
        if (this.f78402p0.get() == f78400r0) {
            return this.f78403q0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78402p0.get() == f78400r0 && this.f78403q0 == null;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasObservers() {
        return this.f78402p0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78402p0.get() == f78400r0 && this.f78403q0 != null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f78402p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78400r0;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.f78404p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f78402p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78400r0;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78403q0 = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                RxJavaPlugins.onError(th2);
            } else {
                aVar.f78404p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        for (a<T> aVar : this.f78402p0.get()) {
            if (!aVar.get()) {
                aVar.f78404p0.onNext(t10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78402p0.get() == f78400r0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78402p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78400r0) {
                Throwable th2 = this.f78403q0;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
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
                        d(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
