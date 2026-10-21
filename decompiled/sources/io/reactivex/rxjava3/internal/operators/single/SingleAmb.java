package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleAmb<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T>[] f77624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends SingleSource<? extends T>> f77625q0;

    public static final class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f77626p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleObserver<? super T> f77627q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f77628r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77629s0;

        public a(SingleObserver<? super T> singleObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f77627q0 = singleObserver;
            this.f77626p0 = compositeDisposable;
            this.f77628r0 = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f77628r0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f77629s0;
            CompositeDisposable compositeDisposable = this.f77626p0;
            compositeDisposable.delete(disposable);
            compositeDisposable.dispose();
            this.f77627q0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77629s0 = disposable;
            this.f77626p0.add(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            if (this.f77628r0.compareAndSet(false, true)) {
                Disposable disposable = this.f77629s0;
                CompositeDisposable compositeDisposable = this.f77626p0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f77627q0.onSuccess(t10);
            }
        }
    }

    public SingleAmb(SingleSource<? extends T>[] singleSourceArr, Iterable<? extends SingleSource<? extends T>> iterable) {
        this.f77624p0 = singleSourceArr;
        this.f77625q0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        int length;
        SingleSource<? extends T>[] singleSourceArr = this.f77624p0;
        if (singleSourceArr == null) {
            singleSourceArr = new SingleSource[8];
            try {
                length = 0;
                for (SingleSource<? extends T> singleSource : this.f77625q0) {
                    if (singleSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver);
                        return;
                    }
                    if (length == singleSourceArr.length) {
                        SingleSource<? extends T>[] singleSourceArr2 = new SingleSource[(length >> 2) + length];
                        System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, length);
                        singleSourceArr = singleSourceArr2;
                    }
                    int i10 = length + 1;
                    singleSourceArr[length] = singleSource;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, singleObserver);
                return;
            }
        } else {
            length = singleSourceArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        for (int i11 = 0; i11 < length; i11++) {
            SingleSource<? extends T> singleSource2 = singleSourceArr[i11];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (singleSource2 == null) {
                compositeDisposable.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    singleObserver.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            singleSource2.subscribe(new a(singleObserver, compositeDisposable, atomicBoolean));
        }
    }
}
