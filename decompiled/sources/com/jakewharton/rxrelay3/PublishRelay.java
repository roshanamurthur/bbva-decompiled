package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class PublishRelay<T> extends Relay<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a[] f50735q0 = new a[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f50736p0 = new AtomicReference<>(f50735q0);

    public static final class a<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f50737p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final PublishRelay<T> f50738q0;

        public a(Observer<? super T> observer, PublishRelay<T> publishRelay) {
            this.f50737p0 = observer;
            this.f50738q0 = publishRelay;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f50738q0.d(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishRelay<T> create() {
        return new PublishRelay<>();
    }

    @Override // com.jakewharton.rxrelay3.Relay, io.reactivex.rxjava3.functions.Consumer
    public void accept(@NonNull T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        for (a<T> aVar : this.f50736p0.get()) {
            if (!aVar.get()) {
                aVar.f50737p0.onNext(t10);
            }
        }
    }

    public final void d(a<T> aVar) {
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f50736p0;
            a<T>[] aVarArr = atomicReference.get();
            a<T>[] aVarArr2 = f50735q0;
            if (aVarArr == aVarArr2) {
                return;
            }
            int length = aVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                }
            }
            return;
        }
    }

    @Override // com.jakewharton.rxrelay3.Relay
    public boolean hasObservers() {
        return this.f50736p0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f50736p0;
            a<T>[] aVarArr = atomicReference.get();
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == aVarArr);
        }
        if (aVar.get()) {
            d(aVar);
        }
    }
}
