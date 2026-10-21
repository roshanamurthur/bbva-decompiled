package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAmb<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T>[] f76309p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends ObservableSource<? extends T>> f76310q0;

    public static final class a<T> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76311p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T>[] f76312q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f76313r0 = new AtomicInteger();

        public a(Observer<? super T> observer, int i10) {
            this.f76311p0 = observer;
            this.f76312q0 = new b[i10];
        }

        public final boolean a(int i10) {
            AtomicInteger atomicInteger = this.f76313r0;
            int i11 = 0;
            if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f76312q0;
            int length = bVarArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    b<T> bVar = bVarArr[i11];
                    bVar.getClass();
                    DisposableHelper.dispose(bVar);
                }
                i11 = i12;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            AtomicInteger atomicInteger = this.f76313r0;
            if (atomicInteger.get() != -1) {
                atomicInteger.lazySet(-1);
                for (b<T> bVar : this.f76312q0) {
                    bVar.getClass();
                    DisposableHelper.dispose(bVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76313r0.get() == -1;
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f76314p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f76315q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Observer<? super T> f76316r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76317s0;

        public b(a<T> aVar, int i10, Observer<? super T> observer) {
            this.f76314p0 = aVar;
            this.f76315q0 = i10;
            this.f76316r0 = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            boolean z10 = this.f76317s0;
            Observer<? super T> observer = this.f76316r0;
            if (z10) {
                observer.onComplete();
            } else if (this.f76314p0.a(this.f76315q0)) {
                this.f76317s0 = true;
                observer.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            boolean z10 = this.f76317s0;
            Observer<? super T> observer = this.f76316r0;
            if (z10) {
                observer.onError(th2);
            } else if (!this.f76314p0.a(this.f76315q0)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76317s0 = true;
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            boolean z10 = this.f76317s0;
            Observer<? super T> observer = this.f76316r0;
            if (z10) {
                observer.onNext(t10);
            } else if (!this.f76314p0.a(this.f76315q0)) {
                get().dispose();
            } else {
                this.f76317s0 = true;
                observer.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableAmb(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.f76309p0 = observableSourceArr;
        this.f76310q0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        int length;
        Observer<? super T> observer2;
        ObservableSource<? extends T>[] observableSourceArr = this.f76309p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.f76310q0) {
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
        b<T>[] bVarArr = aVar.f76312q0;
        int length2 = bVarArr.length;
        int i11 = 0;
        while (true) {
            observer2 = aVar.f76311p0;
            if (i11 >= length2) {
                break;
            }
            int i12 = i11 + 1;
            bVarArr[i11] = new b<>(aVar, i12, observer2);
            i11 = i12;
        }
        AtomicInteger atomicInteger = aVar.f76313r0;
        atomicInteger.lazySet(0);
        observer2.onSubscribe(aVar);
        for (int i13 = 0; i13 < length2 && atomicInteger.get() == 0; i13++) {
            observableSourceArr[i13].subscribe(bVarArr[i13]);
        }
    }
}
