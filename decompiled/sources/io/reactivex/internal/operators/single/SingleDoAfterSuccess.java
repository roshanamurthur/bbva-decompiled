package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoAfterSuccess<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73431p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f73432q0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73433p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f73434q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73435r0;

        public a(SingleObserver<? super T> singleObserver, Consumer<? super T> consumer) {
            this.f73433p0 = singleObserver;
            this.f73434q0 = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73435r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73435r0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73433p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73435r0, disposable)) {
                this.f73435r0 = disposable;
                this.f73433p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73433p0.onSuccess(t10);
            try {
                this.f73434q0.accept(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public SingleDoAfterSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f73431p0 = singleSource;
        this.f73432q0 = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73431p0.subscribe(new a(singleObserver, this.f73432q0));
    }
}
