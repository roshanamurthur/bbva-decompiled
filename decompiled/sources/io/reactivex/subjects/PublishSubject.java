package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a[] f78645r0 = new a[0];

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a[] f78646s0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78647p0 = new AtomicReference<>(f78646s0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f78648q0;

    public static final class a<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f78649p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final PublishSubject<T> f78650q0;

        public a(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.f78649p0 = observer;
            this.f78650q0 = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f78650q0.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
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
            AtomicReference<a<T>[]> atomicReference = this.f78647p0;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f78645r0 || aVarArr2 == (aVarArr = f78646s0)) {
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

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.f78647p0.get() == f78645r0) {
            return this.f78648q0;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.f78647p0.get() == f78645r0 && this.f78648q0 == null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f78647p0.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.f78647p0.get() == f78645r0 && this.f78648q0 != null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f78647p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78645r0;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.f78649p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<a<T>[]> atomicReference = this.f78647p0;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f78645r0;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78648q0 = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                RxJavaPlugins.onError(th2);
            } else {
                aVar.f78649p0.onError(th2);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f78647p0.get()) {
            if (!aVar.get()) {
                aVar.f78649p0.onNext(t10);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78647p0.get() == f78645r0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78647p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78645r0) {
                Throwable th2 = this.f78648q0;
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
