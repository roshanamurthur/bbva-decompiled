package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoFinally<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77695p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f77696q0;

    public static final class a<T> extends AtomicInteger implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77697p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f77698q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77699r0;

        public a(SingleObserver<? super T> singleObserver, Action action) {
            this.f77697p0 = singleObserver;
            this.f77698q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f77698q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77699r0.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77699r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77697p0.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77699r0, disposable)) {
                this.f77699r0 = disposable;
                this.f77697p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77697p0.onSuccess(t10);
            a();
        }
    }

    public SingleDoFinally(SingleSource<T> singleSource, Action action) {
        this.f77695p0 = singleSource;
        this.f77696q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77695p0.subscribe(new a(singleObserver, this.f77696q0));
    }
}
