package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleZipIterable<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends SingleSource<? extends T>> f77894p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f77895q0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(T t10) throws Throwable {
            R rApply = SingleZipIterable.this.f77895q0.apply(new Object[]{t10});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public SingleZipIterable(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.f77894p0 = iterable;
        this.f77895q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource[] singleSourceArr = new SingleSource[8];
        try {
            int i10 = 0;
            for (SingleSource<? extends T> singleSource : this.f77894p0) {
                if (singleSource == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver);
                    return;
                }
                if (i10 == singleSourceArr.length) {
                    singleSourceArr = (SingleSource[]) Arrays.copyOf(singleSourceArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                singleSourceArr[i10] = singleSource;
                i10 = i11;
            }
            if (i10 == 0) {
                EmptyDisposable.error(new NoSuchElementException(), singleObserver);
                return;
            }
            if (i10 == 1) {
                singleSourceArr[0].subscribe(new SingleMap.a(singleObserver, new a()));
                return;
            }
            SingleZipArray.b bVar = new SingleZipArray.b(singleObserver, i10, this.f77895q0);
            singleObserver.onSubscribe(bVar);
            for (int i12 = 0; i12 < i10 && !bVar.isDisposed(); i12++) {
                singleSourceArr[i12].subscribe(bVar.f77890r0[i12]);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
