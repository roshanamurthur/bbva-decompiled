package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77719p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f77720q0;

    public static final class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77721p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Disposable> f77722q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77723r0;

        public a(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.f77721p0 = singleObserver;
            this.f77722q0 = consumer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (this.f77723r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77721p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            SingleObserver<? super T> singleObserver = this.f77721p0;
            try {
                this.f77722q0.accept(disposable);
                singleObserver.onSubscribe(disposable);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77723r0 = true;
                disposable.dispose();
                EmptyDisposable.error(th2, singleObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            if (this.f77723r0) {
                return;
            }
            this.f77721p0.onSuccess(t10);
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f77719p0 = singleSource;
        this.f77720q0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77719p0.subscribe(new a(singleObserver, this.f77720q0));
    }
}
