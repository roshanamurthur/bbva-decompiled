package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoFinally<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73441p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f73442q0;

    public static final class a<T> extends AtomicInteger implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73443p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f73444q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73445r0;

        public a(SingleObserver<? super T> singleObserver, Action action) {
            this.f73443p0 = singleObserver;
            this.f73444q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f73444q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73445r0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73445r0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73443p0.onError(th2);
            a();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73445r0, disposable)) {
                this.f73445r0 = disposable;
                this.f73443p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73443p0.onSuccess(t10);
            a();
        }
    }

    public SingleDoFinally(SingleSource<T> singleSource, Action action) {
        this.f73441p0 = singleSource;
        this.f73442q0 = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73441p0.subscribe(new a(singleObserver, this.f73442q0));
    }
}
