package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAmb<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T>[] f72045p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends ObservableSource<? extends T>> f72046q0;

    public static final class a<T> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72047p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T>[] f72048q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f72049r0 = new AtomicInteger();

        public a(Observer<? super T> observer, int i10) {
            this.f72047p0 = observer;
            this.f72048q0 = new b[i10];
        }

        public final boolean a(int i10) {
            AtomicInteger atomicInteger = this.f72049r0;
            int i11 = atomicInteger.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!atomicInteger.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f72048q0;
            int length = bVarArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    b<T> bVar = bVarArr[i12];
                    bVar.getClass();
                    DisposableHelper.dispose(bVar);
                }
                i12 = i13;
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            AtomicInteger atomicInteger = this.f72049r0;
            if (atomicInteger.get() != -1) {
                atomicInteger.lazySet(-1);
                for (b<T> bVar : this.f72048q0) {
                    bVar.getClass();
                    DisposableHelper.dispose(bVar);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72049r0.get() == -1;
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f72050p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72051q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Observer<? super T> f72052r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72053s0;

        public b(a<T> aVar, int i10, Observer<? super T> observer) {
            this.f72050p0 = aVar;
            this.f72051q0 = i10;
            this.f72052r0 = observer;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            boolean z10 = this.f72053s0;
            Observer<? super T> observer = this.f72052r0;
            if (z10) {
                observer.onComplete();
            } else if (this.f72050p0.a(this.f72051q0)) {
                this.f72053s0 = true;
                observer.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f72053s0;
            Observer<? super T> observer = this.f72052r0;
            if (z10) {
                observer.onError(th2);
            } else if (!this.f72050p0.a(this.f72051q0)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72053s0 = true;
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            boolean z10 = this.f72053s0;
            Observer<? super T> observer = this.f72052r0;
            if (z10) {
                observer.onNext(t10);
            } else if (!this.f72050p0.a(this.f72051q0)) {
                get().dispose();
            } else {
                this.f72053s0 = true;
                observer.onNext(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableAmb(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.f72045p0 = observableSourceArr;
        this.f72046q0 = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        int length;
        Observer<? super T> observer2;
        ObservableSource<? extends T>[] observableSourceArr = this.f72045p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.f72046q0) {
                    if (observableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i10 = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
            return;
        }
        if (length == 1) {
            observableSourceArr[0].subscribe(observer);
            return;
        }
        a aVar = new a(observer, length);
        b<T>[] bVarArr = aVar.f72048q0;
        int length2 = bVarArr.length;
        int i11 = 0;
        while (true) {
            observer2 = aVar.f72047p0;
            if (i11 >= length2) {
                break;
            }
            int i12 = i11 + 1;
            bVarArr[i11] = new b<>(aVar, i12, observer2);
            i11 = i12;
        }
        AtomicInteger atomicInteger = aVar.f72049r0;
        atomicInteger.lazySet(0);
        observer2.onSubscribe(aVar);
        for (int i13 = 0; i13 < length2 && atomicInteger.get() == 0; i13++) {
            observableSourceArr[i13].subscribe(bVarArr[i13]);
        }
    }
}
