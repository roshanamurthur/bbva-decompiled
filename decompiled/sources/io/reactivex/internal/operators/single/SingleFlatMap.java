package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMap<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73479p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f73480q0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f73481p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f73482q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.SingleFlatMap$a$a, reason: collision with other inner class name */
        public static final class C0357a<R> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final AtomicReference<Disposable> f73483p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final SingleObserver<? super R> f73484q0;

            public C0357a(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
                this.f73483p0 = atomicReference;
                this.f73484q0 = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                this.f73484q0.onError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this.f73483p0, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                this.f73484q0.onSuccess(r3);
            }
        }

        public a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f73481p0 = singleObserver;
            this.f73482q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73481p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73481p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super R> singleObserver = this.f73481p0;
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f73482q0.apply(t10), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new C0357a(this, singleObserver));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleFlatMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f73480q0 = function;
        this.f73479p0 = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f73479p0.subscribe(new a(singleObserver, this.f73480q0));
    }
}
