package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoAfterTerminate<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f73437q0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f73439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73440r0;

        public a(SingleObserver<? super T> singleObserver, Action action) {
            this.f73438p0 = singleObserver;
            this.f73439q0 = action;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73440r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73440r0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73438p0.onError(th2);
            try {
                this.f73439q0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73440r0, disposable)) {
                this.f73440r0 = disposable;
                this.f73438p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73438p0.onSuccess(t10);
            try {
                this.f73439q0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public SingleDoAfterTerminate(SingleSource<T> singleSource, Action action) {
        this.f73436p0 = singleSource;
        this.f73437q0 = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73436p0.subscribe(new a(singleObserver, this.f73437q0));
    }
}
