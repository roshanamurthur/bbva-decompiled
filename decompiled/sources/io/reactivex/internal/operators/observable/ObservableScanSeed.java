package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScanSeed<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f72815p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<R> f72816q0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f72818q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f72819r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72820s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72821t0;

        public a(Observer<? super R> observer, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f72817p0 = observer;
            this.f72818q0 = biFunction;
            this.f72819r0 = r3;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72820s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72820s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72821t0) {
                return;
            }
            this.f72821t0 = true;
            this.f72817p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72821t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72821t0 = true;
                this.f72817p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72821t0) {
                return;
            }
            try {
                R r3 = (R) ObjectHelper.requireNonNull(this.f72818q0.apply(this.f72819r0, t10), "The accumulator returned a null value");
                this.f72819r0 = r3;
                this.f72817p0.onNext(r3);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72820s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72820s0, disposable)) {
                this.f72820s0 = disposable;
                Observer<? super R> observer = this.f72817p0;
                observer.onSubscribe(this);
                observer.onNext(this.f72819r0);
            }
        }
    }

    public ObservableScanSeed(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f72815p0 = biFunction;
        this.f72816q0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        try {
            this.source.subscribe(new a(observer, this.f72815p0, ObjectHelper.requireNonNull(this.f72816q0.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
