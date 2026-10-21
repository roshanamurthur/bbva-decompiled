package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleZipArray<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T>[] f77885p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f77886q0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(T t10) throws Throwable {
            R rApply = SingleZipArray.this.f77886q0.apply(new Object[]{t10});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f77888p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f77889q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T>[] f77890r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Object[] f77891s0;

        public b(SingleObserver<? super R> singleObserver, int i10, Function<? super Object[], ? extends R> function) {
            super(i10);
            this.f77888p0 = singleObserver;
            this.f77889q0 = function;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f77890r0 = cVarArr;
            this.f77891s0 = new Object[i10];
        }

        public final void a(int i10, Throwable th2) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            c<T>[] cVarArr = this.f77890r0;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                c<T> cVar = cVarArr[i11];
                cVar.getClass();
                DisposableHelper.dispose(cVar);
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    this.f77888p0.onError(th2);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i10];
                    cVar2.getClass();
                    DisposableHelper.dispose(cVar2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f77890r0) {
                    cVar.getClass();
                    DisposableHelper.dispose(cVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class c<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, ?> f77892p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f77893q0;

        public c(b<T, ?> bVar, int i10) {
            this.f77892p0 = bVar;
            this.f77893q0 = i10;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77892p0.a(this.f77893q0, th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            b<T, ?> bVar = this.f77892p0;
            SingleObserver<? super Object> singleObserver = bVar.f77888p0;
            Object[] objArr = bVar.f77891s0;
            objArr[this.f77893q0] = t10;
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object objApply = bVar.f77889q0.apply(objArr);
                    Objects.requireNonNull(objApply, "The zipper returned a null value");
                    singleObserver.onSuccess(objApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                }
            }
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.f77885p0 = singleSourceArr;
        this.f77886q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.f77885p0;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.a(singleObserver, new a()));
            return;
        }
        b bVar = new b(singleObserver, length, this.f77886q0);
        singleObserver.onSubscribe(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            SingleSource<? extends T> singleSource = singleSourceArr[i10];
            if (singleSource == null) {
                bVar.a(i10, new NullPointerException("One of the sources is null"));
                return;
            }
            singleSource.subscribe(bVar.f77890r0[i10]);
        }
    }
}
