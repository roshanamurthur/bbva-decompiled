package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableToList<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<U> f73045p0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f73046p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f73047q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public U f73048r0;

        public a(Observer<? super U> observer, U u2) {
            this.f73046p0 = observer;
            this.f73048r0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73047q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73047q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u2 = this.f73048r0;
            this.f73048r0 = null;
            Observer<? super U> observer = this.f73046p0;
            observer.onNext(u2);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f73048r0 = null;
            this.f73046p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73048r0.add(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73047q0, disposable)) {
                this.f73047q0 = disposable;
                this.f73046p0.onSubscribe(this);
            }
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, int i10) {
        super(observableSource);
        this.f73045p0 = Functions.createArrayList(i10);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new a(observer, (Collection) ObjectHelper.requireNonNull(this.f73045p0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f73045p0 = callable;
    }
}
