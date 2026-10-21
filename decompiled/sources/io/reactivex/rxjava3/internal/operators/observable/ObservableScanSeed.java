package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScanSeed<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f77092p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<R> f77093q0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f77094p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f77095q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f77096r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77097s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77098t0;

        public a(Observer<? super R> observer, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f77094p0 = observer;
            this.f77095q0 = biFunction;
            this.f77096r0 = r3;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77097s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77097s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77098t0) {
                return;
            }
            this.f77098t0 = true;
            this.f77094p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77098t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77098t0 = true;
                this.f77094p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77098t0) {
                return;
            }
            try {
                R rApply = this.f77095q0.apply(this.f77096r0, t10);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f77096r0 = rApply;
                this.f77094p0.onNext(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77097s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77097s0, disposable)) {
                this.f77097s0 = disposable;
                Observer<? super R> observer = this.f77094p0;
                observer.onSubscribe(this);
                observer.onNext(this.f77096r0);
            }
        }
    }

    public ObservableScanSeed(ObservableSource<T> observableSource, Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f77092p0 = biFunction;
        this.f77093q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        try {
            R r3 = this.f77093q0.get();
            Objects.requireNonNull(r3, "The seed supplied is null");
            this.source.subscribe(new a(observer, this.f77092p0, r3));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
