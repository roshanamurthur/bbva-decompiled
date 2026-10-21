package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeWhile<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f77248p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77249p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f77250q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77251r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77252s0;

        public a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f77249p0 = observer;
            this.f77250q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77251r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77251r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77252s0) {
                return;
            }
            this.f77252s0 = true;
            this.f77249p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77252s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77252s0 = true;
                this.f77249p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77252s0) {
                return;
            }
            try {
                boolean zTest = this.f77250q0.test(t10);
                Observer<? super T> observer = this.f77249p0;
                if (zTest) {
                    observer.onNext(t10);
                    return;
                }
                this.f77252s0 = true;
                this.f77251r0.dispose();
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77251r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77251r0, disposable)) {
                this.f77251r0 = disposable;
                this.f77249p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f77248p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77248p0));
    }
}
