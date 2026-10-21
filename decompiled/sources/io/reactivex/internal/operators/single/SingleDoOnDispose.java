package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnDispose<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73446p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f73447q0;

    public static final class a<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73448p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f73449q0;

        public a(SingleObserver<? super T> singleObserver, Action action) {
            this.f73448p0 = singleObserver;
            lazySet(action);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                this.f73449q0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73449q0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73448p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73449q0, disposable)) {
                this.f73449q0 = disposable;
                this.f73448p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73448p0.onSuccess(t10);
        }
    }

    public SingleDoOnDispose(SingleSource<T> singleSource, Action action) {
        this.f73446p0 = singleSource;
        this.f73447q0 = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73446p0.subscribe(new a(singleObserver, this.f73447q0));
    }
}
