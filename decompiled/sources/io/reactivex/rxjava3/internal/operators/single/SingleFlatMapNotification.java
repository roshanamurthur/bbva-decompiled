package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapNotification<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77780p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f77781q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends SingleSource<? extends R>> f77782r0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f77783p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f77784q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends SingleSource<? extends R>> f77785r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77786s0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.single.SingleFlatMapNotification$a$a, reason: collision with other inner class name */
        public final class C0424a implements SingleObserver<R> {
            public C0424a() {
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a.this.f77783p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(a.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a.this.f77783p0.onSuccess(r3);
            }
        }

        public a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
            this.f77783p0 = singleObserver;
            this.f77784q0 = function;
            this.f77785r0 = function2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f77786s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            try {
                SingleSource<? extends R> singleSourceApply = this.f77785r0.apply(th2);
                Objects.requireNonNull(singleSourceApply, "The onErrorMapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new C0424a());
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f77783p0.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77786s0, disposable)) {
                this.f77786s0 = disposable;
                this.f77783p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                SingleSource<? extends R> singleSourceApply = this.f77784q0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The onSuccessMapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new C0424a());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77783p0.onError(th2);
            }
        }
    }

    public SingleFlatMapNotification(SingleSource<T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
        this.f77780p0 = singleSource;
        this.f77781q0 = function;
        this.f77782r0 = function2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f77780p0.subscribe(new a(singleObserver, this.f77781q0, this.f77782r0));
    }
}
