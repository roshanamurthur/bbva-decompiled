package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnLifecycle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f77712p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f77713q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f77714r0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Disposable> f77716q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Action f77717r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77718s0;

        public a(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer, Action action) {
            this.f77715p0 = singleObserver;
            this.f77716q0 = consumer;
            this.f77717r0 = action;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                this.f77717r0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f77718s0.dispose();
            this.f77718s0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77718s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            Disposable disposable = this.f77718s0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77718s0 = disposableHelper;
                this.f77715p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            SingleObserver<? super T> singleObserver = this.f77715p0;
            try {
                this.f77716q0.accept(disposable);
                if (DisposableHelper.validate(this.f77718s0, disposable)) {
                    this.f77718s0 = disposable;
                    singleObserver.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f77718s0 = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, singleObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            Disposable disposable = this.f77718s0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                this.f77718s0 = disposableHelper;
                this.f77715p0.onSuccess(t10);
            }
        }
    }

    public SingleDoOnLifecycle(Single<T> single, Consumer<? super Disposable> consumer, Action action) {
        this.f77712p0 = single;
        this.f77713q0 = consumer;
        this.f77714r0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77712p0.subscribe(new a(singleObserver, this.f77713q0, this.f77714r0));
    }
}
