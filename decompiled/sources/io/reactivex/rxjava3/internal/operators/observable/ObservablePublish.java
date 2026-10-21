package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76928p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<b<T>> f76929q0 = new AtomicReference<>();

    public static final class a<T> extends AtomicReference<b<T>> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76930p0;

        public a(Observer<? super T> observer, b<T> bVar) {
            this.f76930p0 = observer;
            lazySet(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    public static final class b<T> extends AtomicReference<a<T>[]> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final a[] f76931t0 = new a[0];

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final a[] f76932u0 = new a[0];

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<b<T>> f76934q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f76936s0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f76933p0 = new AtomicBoolean();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76935r0 = new AtomicReference<>();

        public b(AtomicReference<b<T>> atomicReference) {
            this.f76934q0 = atomicReference;
            lazySet(f76931t0);
        }

        public final void a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
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
                aVarArr2 = f76931t0;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            getAndSet(f76932u0);
            do {
                atomicReference = this.f76934q0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            DisposableHelper.dispose(this.f76935r0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == f76932u0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76935r0.lazySet(DisposableHelper.DISPOSED);
            for (a<T> aVar : getAndSet(f76932u0)) {
                aVar.f76930p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            AtomicReference<Disposable> atomicReference = this.f76935r0;
            Disposable disposable = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f76936s0 = th2;
            atomicReference.lazySet(disposableHelper);
            for (a<T> aVar : getAndSet(f76932u0)) {
                aVar.f76930p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            for (a<T> aVar : get()) {
                aVar.f76930p0.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f76935r0, disposable);
        }
    }

    public ObservablePublish(ObservableSource<T> observableSource) {
        this.f76928p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f76929q0;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        AtomicBoolean atomicBoolean = bVar.f76933p0;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            consumer.accept(bVar);
            if (z10) {
                this.f76928p0.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void reset() {
        AtomicReference<b<T>> atomicReference = this.f76929q0;
        b<T> bVar = atomicReference.get();
        if (bVar == null || !bVar.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f76928p0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        b<T> bVar;
        a<T>[] aVarArr;
        a[] aVarArr2;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f76929q0;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        a<T> aVar = new a<>(observer, bVar);
        observer.onSubscribe(aVar);
        do {
            aVarArr = bVar.get();
            if (aVarArr == b.f76932u0) {
                Throwable th2 = bVar.f76936s0;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!bVar.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            bVar.a(aVar);
        }
    }
}
