package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMapNotification<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, ObservableSource<? extends R>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<? extends R>> f76864p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends ObservableSource<? extends R>> f76865q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<? extends ObservableSource<? extends R>> f76866r0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super ObservableSource<? extends R>> f76867p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f76868q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends ObservableSource<? extends R>> f76869r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Supplier<? extends ObservableSource<? extends R>> f76870s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76871t0;

        public a(Observer<? super ObservableSource<? extends R>> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier) {
            this.f76867p0 = observer;
            this.f76868q0 = function;
            this.f76869r0 = function2;
            this.f76870s0 = supplier;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76871t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76871t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer<? super ObservableSource<? extends R>> observer = this.f76867p0;
            try {
                ObservableSource<? extends R> observableSource = this.f76870s0.get();
                Objects.requireNonNull(observableSource, "The onComplete ObservableSource returned is null");
                observer.onNext(observableSource);
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Observer<? super ObservableSource<? extends R>> observer = this.f76867p0;
            try {
                ObservableSource<? extends R> observableSourceApply = this.f76869r0.apply(th2);
                Objects.requireNonNull(observableSourceApply, "The onError ObservableSource returned is null");
                observer.onNext(observableSourceApply);
                observer.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            Observer<? super ObservableSource<? extends R>> observer = this.f76867p0;
            try {
                ObservableSource<? extends R> observableSourceApply = this.f76868q0.apply(t10);
                Objects.requireNonNull(observableSourceApply, "The onNext ObservableSource returned is null");
                observer.onNext(observableSourceApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76871t0, disposable)) {
                this.f76871t0 = disposable;
                this.f76867p0.onSubscribe(this);
            }
        }
    }

    public ObservableMapNotification(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier) {
        super(observableSource);
        this.f76864p0 = function;
        this.f76865q0 = function2;
        this.f76866r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super ObservableSource<? extends R>> observer) {
        this.source.subscribe(new a(observer, this.f76864p0, this.f76865q0, this.f76866r0));
    }
}
