package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapBiSelector<T, U, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77746p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends U>> f77747q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f77748r0;

    public static final class a<T, U, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends U>> f77749p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0423a<T, U, R> f77750q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.single.SingleFlatMapBiSelector$a$a, reason: collision with other inner class name */
        public static final class C0423a<T, U, R> extends AtomicReference<Disposable> implements SingleObserver<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SingleObserver<? super R> f77751p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final BiFunction<? super T, ? super U, ? extends R> f77752q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public T f77753r0;

            public C0423a(SingleObserver<? super R> singleObserver, BiFunction<? super T, ? super U, ? extends R> biFunction) {
                this.f77751p0 = singleObserver;
                this.f77752q0 = biFunction;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                this.f77751p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(U u2) {
                SingleObserver<? super R> singleObserver = this.f77751p0;
                T t10 = this.f77753r0;
                this.f77753r0 = null;
                try {
                    R rApply = this.f77752q0.apply(t10, u2);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    singleObserver.onSuccess(rApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                }
            }
        }

        public a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f77750q0 = new C0423a<>(singleObserver, biFunction);
            this.f77749p0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77750q0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77750q0.get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77750q0.f77751p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            C0423a<T, U, R> c0423a = this.f77750q0;
            if (DisposableHelper.setOnce(c0423a, disposable)) {
                c0423a.f77751p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            C0423a<T, U, R> c0423a = this.f77750q0;
            try {
                SingleSource<? extends U> singleSourceApply = this.f77749p0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The mapper returned a null MaybeSource");
                SingleSource<? extends U> singleSource = singleSourceApply;
                if (DisposableHelper.replace(c0423a, null)) {
                    c0423a.f77753r0 = t10;
                    singleSource.subscribe(c0423a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                c0423a.f77751p0.onError(th2);
            }
        }
    }

    public SingleFlatMapBiSelector(SingleSource<T> singleSource, Function<? super T, ? extends SingleSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        this.f77746p0 = singleSource;
        this.f77747q0 = function;
        this.f77748r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f77746p0.subscribe(new a(singleObserver, this.f77747q0, this.f77748r0));
    }
}
