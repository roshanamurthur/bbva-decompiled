package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMapNotification<T, R> extends io.reactivex.internal.operators.observable.a<T, ObservableSource<? extends R>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f72578p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends ObservableSource<? extends R>> f72579q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<? extends ObservableSource<? extends R>> f72580r0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super ObservableSource<? extends R>> f72581p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f72582q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends ObservableSource<? extends R>> f72583r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Callable<? extends ObservableSource<? extends R>> f72584s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72585t0;

        public a(Observer<? super ObservableSource<? extends R>> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
            this.f72581p0 = observer;
            this.f72582q0 = function;
            this.f72583r0 = function2;
            this.f72584s0 = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72585t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72585t0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer<? super ObservableSource<? extends R>> observer = this.f72581p0;
            try {
                observer.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f72584s0.call(), "The onComplete ObservableSource returned is null"));
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Observer<? super ObservableSource<? extends R>> observer = this.f72581p0;
            try {
                observer.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f72583r0.apply(th2), "The onError ObservableSource returned is null"));
                observer.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            Observer<? super ObservableSource<? extends R>> observer = this.f72581p0;
            try {
                observer.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f72582q0.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72585t0, disposable)) {
                this.f72585t0 = disposable;
                this.f72581p0.onSubscribe(this);
            }
        }
    }

    public ObservableMapNotification(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.f72578p0 = function;
        this.f72579q0 = function2;
        this.f72580r0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super ObservableSource<? extends R>> observer) {
        this.source.subscribe(new a(observer, this.f72578p0, this.f72579q0, this.f72580r0));
    }
}
