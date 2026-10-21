package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlattenIterable<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f76710p0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76711p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f76712q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76713r0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f76711p0 = observer;
            this.f76712q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76713r0.dispose();
            this.f76713r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76713r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Disposable disposable = this.f76713r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            this.f76713r0 = disposableHelper;
            this.f76711p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Disposable disposable = this.f76713r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76713r0 = disposableHelper;
                this.f76711p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76713r0 == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                for (R r3 : this.f76712q0.apply(t10)) {
                    try {
                        try {
                            Objects.requireNonNull(r3, "The iterator returned a null value");
                            this.f76711p0.onNext(r3);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.f76713r0.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.f76713r0.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f76713r0.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76713r0, disposable)) {
                this.f76713r0 = disposable;
                this.f76711p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlattenIterable(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f76710p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f76710p0));
    }
}
