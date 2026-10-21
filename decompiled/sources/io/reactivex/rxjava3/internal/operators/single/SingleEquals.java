package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77732p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f77733q0;

    public static class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f77734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f77735q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Object[] f77736r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f77737s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f77738t0;

        public a(int i10, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver<? super Boolean> singleObserver, AtomicInteger atomicInteger) {
            this.f77734p0 = i10;
            this.f77735q0 = compositeDisposable;
            this.f77736r0 = objArr;
            this.f77737s0 = singleObserver;
            this.f77738t0 = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            int andSet = this.f77738t0.getAndSet(-1);
            if (andSet != 0 && andSet != 1) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77735q0.dispose();
                this.f77737s0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77735q0.add(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            int i10 = this.f77734p0;
            Object[] objArr = this.f77736r0;
            objArr[i10] = t10;
            if (this.f77738t0.incrementAndGet() == 2) {
                this.f77737s0.onSuccess(Boolean.valueOf(Objects.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        this.f77732p0 = singleSource;
        this.f77733q0 = singleSource2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.f77732p0.subscribe(new a(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.f77733q0.subscribe(new a(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}
