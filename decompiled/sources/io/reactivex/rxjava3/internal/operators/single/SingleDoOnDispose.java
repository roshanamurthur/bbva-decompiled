package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnDispose<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77700p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f77701q0;

    public static final class a<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77702p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f77703q0;

        public a(SingleObserver<? super T> singleObserver, Action action) {
            this.f77702p0 = singleObserver;
            lazySet(action);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                this.f77703q0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77703q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77702p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77703q0, disposable)) {
                this.f77703q0 = disposable;
                this.f77702p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77702p0.onSuccess(t10);
        }
    }

    public SingleDoOnDispose(SingleSource<T> singleSource, Action action) {
        this.f77700p0 = singleSource;
        this.f77701q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77700p0.subscribe(new a(singleObserver, this.f77701q0));
    }
}
