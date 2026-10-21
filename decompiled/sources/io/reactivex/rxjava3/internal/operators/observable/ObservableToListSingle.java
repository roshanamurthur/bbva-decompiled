package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f77326p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<U> f77327q0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f77328p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public U f77329q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77330r0;

        public a(SingleObserver<? super U> singleObserver, U u2) {
            this.f77328p0 = singleObserver;
            this.f77329q0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77330r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77330r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            U u2 = this.f77329q0;
            this.f77329q0 = null;
            this.f77328p0.onSuccess(u2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77329q0 = null;
            this.f77328p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77329q0.add(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77330r0, disposable)) {
                this.f77330r0 = disposable;
                this.f77328p0.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i10) {
        this.f77326p0 = observableSource;
        this.f77327q0 = Functions.createArrayList(i10);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.f77326p0, this.f77327q0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f77326p0.subscribe(new a(singleObserver, (Collection) ExceptionHelper.nullCheck(this.f77327q0.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, Supplier<U> supplier) {
        this.f77326p0 = observableSource;
        this.f77327q0 = supplier;
    }
}
