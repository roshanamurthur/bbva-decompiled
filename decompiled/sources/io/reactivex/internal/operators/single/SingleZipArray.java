package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleZipArray<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T>[] f73596p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f73597q0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public final R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(SingleZipArray.this.f73597q0.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f73599p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f73600q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T>[] f73601r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Object[] f73602s0;

        public b(SingleObserver<? super R> singleObserver, int i10, Function<? super Object[], ? extends R> function) {
            super(i10);
            this.f73599p0 = singleObserver;
            this.f73600q0 = function;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f73601r0 = cVarArr;
            this.f73602s0 = new Object[i10];
        }

        public final void a(int i10, Throwable th2) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            c<T>[] cVarArr = this.f73601r0;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                c<T> cVar = cVarArr[i11];
                cVar.getClass();
                DisposableHelper.dispose(cVar);
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    this.f73599p0.onError(th2);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i10];
                    cVar2.getClass();
                    DisposableHelper.dispose(cVar2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f73601r0) {
                    cVar.getClass();
                    DisposableHelper.dispose(cVar);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class c<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, ?> f73603p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73604q0;

        public c(b<T, ?> bVar, int i10) {
            this.f73603p0 = bVar;
            this.f73604q0 = i10;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73603p0.a(this.f73604q0, th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            b<T, ?> bVar = this.f73603p0;
            SingleObserver<? super Object> singleObserver = bVar.f73599p0;
            Object[] objArr = bVar.f73602s0;
            objArr[this.f73604q0] = t10;
            if (bVar.decrementAndGet() == 0) {
                try {
                    singleObserver.onSuccess(ObjectHelper.requireNonNull(bVar.f73600q0.apply(objArr), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                }
            }
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.f73596p0 = singleSourceArr;
        this.f73597q0 = function;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.f73596p0;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.a(singleObserver, new a()));
            return;
        }
        b bVar = new b(singleObserver, length, this.f73597q0);
        singleObserver.onSubscribe(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            SingleSource<? extends T> singleSource = singleSourceArr[i10];
            if (singleSource == null) {
                bVar.a(i10, new NullPointerException("One of the sources is null"));
                return;
            }
            singleSource.subscribe(bVar.f73601r0[i10]);
        }
    }
}
