package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f71811p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f71812q0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public final R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(MaybeZipArray.this.f71812q0.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f71814p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f71815q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T>[] f71816r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Object[] f71817s0;

        public b(MaybeObserver<? super R> maybeObserver, int i10, Function<? super Object[], ? extends R> function) {
            super(i10);
            this.f71814p0 = maybeObserver;
            this.f71815q0 = function;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f71816r0 = cVarArr;
            this.f71817s0 = new Object[i10];
        }

        public final void a(int i10) {
            c<T>[] cVarArr = this.f71816r0;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                c<T> cVar = cVarArr[i11];
                cVar.getClass();
                DisposableHelper.dispose(cVar);
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                }
                c<T> cVar2 = cVarArr[i10];
                cVar2.getClass();
                DisposableHelper.dispose(cVar2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f71816r0) {
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

    public static final class c<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, ?> f71818p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71819q0;

        public c(b<T, ?> bVar, int i10) {
            this.f71818p0 = bVar;
            this.f71819q0 = i10;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            b<T, ?> bVar = this.f71818p0;
            if (bVar.getAndSet(0) > 0) {
                bVar.a(this.f71819q0);
                bVar.f71814p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            b<T, ?> bVar = this.f71818p0;
            if (bVar.getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
            } else {
                bVar.a(this.f71819q0);
                bVar.f71814p0.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            b<T, ?> bVar = this.f71818p0;
            MaybeObserver<? super Object> maybeObserver = bVar.f71814p0;
            Object[] objArr = bVar.f71817s0;
            objArr[this.f71819q0] = t10;
            if (bVar.decrementAndGet() == 0) {
                try {
                    maybeObserver.onSuccess(ObjectHelper.requireNonNull(bVar.f71815q0.apply(objArr), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    maybeObserver.onError(th2);
                }
            }
        }
    }

    public MaybeZipArray(MaybeSource<? extends T>[] maybeSourceArr, Function<? super Object[], ? extends R> function) {
        this.f71811p0 = maybeSourceArr;
        this.f71812q0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        MaybeSource<? extends T>[] maybeSourceArr = this.f71811p0;
        int length = maybeSourceArr.length;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new MaybeMap.a(maybeObserver, new a()));
            return;
        }
        b bVar = new b(maybeObserver, length, this.f71812q0);
        maybeObserver.onSubscribe(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            MaybeSource<? extends T> maybeSource = maybeSourceArr[i10];
            if (maybeSource == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (bVar.getAndSet(0) <= 0) {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                } else {
                    bVar.a(i10);
                    bVar.f71814p0.onError(nullPointerException);
                    return;
                }
            }
            maybeSource.subscribe(bVar.f71816r0[i10]);
        }
    }
}
