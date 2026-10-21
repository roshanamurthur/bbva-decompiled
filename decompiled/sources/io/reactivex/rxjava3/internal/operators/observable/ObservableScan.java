package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableScan<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiFunction<T, T, T> f77086p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77087p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f77088q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77089r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f77090s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f77091t0;

        public a(Observer<? super T> observer, BiFunction<T, T, T> biFunction) {
            this.f77087p0 = observer;
            this.f77088q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77089r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77089r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77091t0) {
                return;
            }
            this.f77091t0 = true;
            this.f77087p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77091t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77091t0 = true;
                this.f77087p0.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77091t0) {
                return;
            }
            T t11 = this.f77090s0;
            Observer<? super T> observer = this.f77087p0;
            if (t11 == null) {
                this.f77090s0 = t10;
                observer.onNext(t10);
                return;
            }
            try {
                T tApply = this.f77088q0.apply(t11, t10);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f77090s0 = tApply;
                observer.onNext(tApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77089r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77089r0, disposable)) {
                this.f77089r0 = disposable;
                this.f77087p0.onSubscribe(this);
            }
        }
    }

    public ObservableScan(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f77086p0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77086p0));
    }
}
