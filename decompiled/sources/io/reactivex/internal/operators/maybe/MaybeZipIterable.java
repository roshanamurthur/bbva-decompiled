package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeZipIterable<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends MaybeSource<? extends T>> f71820p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f71821q0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public final R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(MaybeZipIterable.this.f71821q0.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public MaybeZipIterable(Iterable<? extends MaybeSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.f71820p0 = iterable;
        this.f71821q0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        MaybeSource[] maybeSourceArr = new MaybeSource[8];
        try {
            int i10 = 0;
            for (MaybeSource<? extends T> maybeSource : this.f71820p0) {
                if (maybeSource == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver);
                    return;
                }
                if (i10 == maybeSourceArr.length) {
                    maybeSourceArr = (MaybeSource[]) Arrays.copyOf(maybeSourceArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                maybeSourceArr[i10] = maybeSource;
                i10 = i11;
            }
            if (i10 == 0) {
                EmptyDisposable.complete(maybeObserver);
                return;
            }
            if (i10 == 1) {
                maybeSourceArr[0].subscribe(new MaybeMap.a(maybeObserver, new a()));
                return;
            }
            MaybeZipArray.b bVar = new MaybeZipArray.b(maybeObserver, i10, this.f71821q0);
            maybeObserver.onSubscribe(bVar);
            for (int i12 = 0; i12 < i10 && !bVar.isDisposed(); i12++) {
                maybeSourceArr[i12].subscribe(bVar.f71816r0[i12]);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }
}
