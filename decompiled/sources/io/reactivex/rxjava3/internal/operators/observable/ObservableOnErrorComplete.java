package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableOnErrorComplete<T> extends a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super Throwable> f76914p0;

    public static final class OnErrorCompleteObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76915p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super Throwable> f76916q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76917r0;

        public OnErrorCompleteObserver(Observer<? super T> observer, Predicate<? super Throwable> predicate) {
            this.f76915p0 = observer;
            this.f76916q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f76917r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f76917r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.f76915p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th2) {
            Observer<? super T> observer = this.f76915p0;
            try {
                if (this.f76916q0.test(th2)) {
                    observer.onComplete();
                } else {
                    observer.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                observer.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t10) {
            this.f76915p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76917r0, disposable)) {
                this.f76917r0 = disposable;
                this.f76915p0.onSubscribe(this);
            }
        }
    }

    public ObservableOnErrorComplete(ObservableSource<T> observableSource, Predicate<? super Throwable> predicate) {
        super(observableSource);
        this.f76914p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new OnErrorCompleteObserver(observer, this.f76914p0));
    }
}
