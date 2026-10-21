package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScan<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<T, T, T> f72809p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72810p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f72811q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72812r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f72813s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72814t0;

        public a(Observer<? super T> observer, BiFunction<T, T, T> biFunction) {
            this.f72810p0 = observer;
            this.f72811q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72812r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72812r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72814t0) {
                return;
            }
            this.f72814t0 = true;
            this.f72810p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72814t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72814t0 = true;
                this.f72810p0.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72814t0) {
                return;
            }
            T t11 = this.f72813s0;
            Observer<? super T> observer = this.f72810p0;
            if (t11 == null) {
                this.f72813s0 = t10;
                observer.onNext(t10);
                return;
            }
            try {
                ?? r4 = (T) ObjectHelper.requireNonNull(this.f72811q0.apply(t11, t10), "The value returned by the accumulator is null");
                this.f72813s0 = r4;
                observer.onNext(r4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72812r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72812r0, disposable)) {
                this.f72812r0 = disposable;
                this.f72810p0.onSubscribe(this);
            }
        }
    }

    public ObservableScan(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f72809p0 = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72809p0));
    }
}
