package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f73049p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<U> f73050q0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f73051p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public U f73052q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73053r0;

        public a(SingleObserver<? super U> singleObserver, U u2) {
            this.f73051p0 = singleObserver;
            this.f73052q0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73053r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73053r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u2 = this.f73052q0;
            this.f73052q0 = null;
            this.f73051p0.onSuccess(u2);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f73052q0 = null;
            this.f73051p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73052q0.add(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73053r0, disposable)) {
                this.f73053r0 = disposable;
                this.f73051p0.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i10) {
        this.f73049p0 = observableSource;
        this.f73050q0 = Functions.createArrayList(i10);
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.f73049p0, this.f73050q0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f73049p0.subscribe(new a(singleObserver, (Collection) ObjectHelper.requireNonNull(this.f73050q0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, Callable<U> callable) {
        this.f73049p0 = observableSource;
        this.f73050q0 = callable;
    }
}
