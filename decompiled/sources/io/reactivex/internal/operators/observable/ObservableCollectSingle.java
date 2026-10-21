package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72170p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends U> f72171q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f72172r0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f72173p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f72174q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f72175r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72176s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72177t0;

        public a(SingleObserver<? super U> singleObserver, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f72173p0 = singleObserver;
            this.f72174q0 = biConsumer;
            this.f72175r0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72176s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72176s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72177t0) {
                return;
            }
            this.f72177t0 = true;
            this.f72173p0.onSuccess(this.f72175r0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72177t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72177t0 = true;
                this.f72173p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72177t0) {
                return;
            }
            try {
                this.f72174q0.accept(this.f72175r0, t10);
            } catch (Throwable th2) {
                this.f72176s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72176s0, disposable)) {
                this.f72176s0 = disposable;
                this.f72173p0.onSubscribe(this);
            }
        }
    }

    public ObservableCollectSingle(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f72170p0 = observableSource;
        this.f72171q0 = callable;
        this.f72172r0 = biConsumer;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCollect(this.f72170p0, this.f72171q0, this.f72172r0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f72170p0.subscribe(new a(singleObserver, ObjectHelper.requireNonNull(this.f72171q0.call(), "The initialSupplier returned a null value"), this.f72172r0));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
