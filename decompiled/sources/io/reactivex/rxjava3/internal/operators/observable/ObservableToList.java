package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableToList<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<U> f77322p0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f77323p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f77324q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public U f77325r0;

        public a(Observer<? super U> observer, U u2) {
            this.f77323p0 = observer;
            this.f77325r0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77324q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77324q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            U u2 = this.f77325r0;
            this.f77325r0 = null;
            Observer<? super U> observer = this.f77323p0;
            observer.onNext(u2);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77325r0 = null;
            this.f77323p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77325r0.add(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77324q0, disposable)) {
                this.f77324q0 = disposable;
                this.f77323p0.onSubscribe(this);
            }
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, Supplier<U> supplier) {
        super(observableSource);
        this.f77322p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new a(observer, (Collection) ExceptionHelper.nullCheck(this.f77322p0.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
