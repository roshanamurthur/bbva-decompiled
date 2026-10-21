package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73471p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f73472q0;

    public static class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f73473p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f73474q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Object[] f73475r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f73476s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f73477t0;

        public a(int i10, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver<? super Boolean> singleObserver, AtomicInteger atomicInteger) {
            this.f73473p0 = i10;
            this.f73474q0 = compositeDisposable;
            this.f73475r0 = objArr;
            this.f73476s0 = singleObserver;
            this.f73477t0 = atomicInteger;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            AtomicInteger atomicInteger;
            int i10;
            do {
                atomicInteger = this.f73477t0;
                i10 = atomicInteger.get();
                if (i10 >= 2) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
            } while (!atomicInteger.compareAndSet(i10, 2));
            this.f73474q0.dispose();
            this.f73476s0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73474q0.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            int i10 = this.f73473p0;
            Object[] objArr = this.f73475r0;
            objArr[i10] = t10;
            if (this.f73477t0.incrementAndGet() == 2) {
                this.f73476s0.onSuccess(Boolean.valueOf(ObjectHelper.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        this.f73471p0 = singleSource;
        this.f73472q0 = singleSource2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.f73471p0.subscribe(new a(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.f73472q0.subscribe(new a(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}
