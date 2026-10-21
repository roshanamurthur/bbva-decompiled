package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableOnErrorReturn<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f76924p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76925p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends T> f76926q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76927r0;

        public a(Observer<? super T> observer, Function<? super Throwable, ? extends T> function) {
            this.f76925p0 = observer;
            this.f76926q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76927r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76927r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76925p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Observer<? super T> observer = this.f76925p0;
            try {
                T tApply = this.f76926q0.apply(th2);
                if (tApply != null) {
                    observer.onNext(tApply);
                    observer.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    observer.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76925p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76927r0, disposable)) {
                this.f76927r0 = disposable;
                this.f76925p0.onSubscribe(this);
            }
        }
    }

    public ObservableOnErrorReturn(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f76924p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76924p0));
    }
}
