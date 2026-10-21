package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAll<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f76298p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Boolean> f76299p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f76300q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76301r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76302s0;

        public a(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f76299p0 = observer;
            this.f76300q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76301r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76301r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76302s0) {
                return;
            }
            this.f76302s0 = true;
            Boolean bool = Boolean.TRUE;
            Observer<? super Boolean> observer = this.f76299p0;
            observer.onNext(bool);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76302s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76302s0 = true;
                this.f76299p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76302s0) {
                return;
            }
            try {
                if (this.f76300q0.test(t10)) {
                    return;
                }
                this.f76302s0 = true;
                this.f76301r0.dispose();
                Boolean bool = Boolean.FALSE;
                Observer<? super Boolean> observer = this.f76299p0;
                observer.onNext(bool);
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76301r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76301r0, disposable)) {
                this.f76301r0 = disposable;
                this.f76299p0.onSubscribe(this);
            }
        }
    }

    public ObservableAll(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f76298p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new a(observer, this.f76298p0));
    }
}
