package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f73459q0;

    public static final class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73460p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Disposable> f73461q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73462r0;

        public a(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.f73460p0 = singleObserver;
            this.f73461q0 = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            if (this.f73462r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73460p0.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            SingleObserver<? super T> singleObserver = this.f73460p0;
            try {
                this.f73461q0.accept(disposable);
                singleObserver.onSubscribe(disposable);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f73462r0 = true;
                disposable.dispose();
                EmptyDisposable.error(th2, singleObserver);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            if (this.f73462r0) {
                return;
            }
            this.f73460p0.onSuccess(t10);
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f73458p0 = singleSource;
        this.f73459q0 = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73458p0.subscribe(new a(singleObserver, this.f73459q0));
    }
}
