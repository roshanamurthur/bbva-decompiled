package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final R f76962q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f76963r0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f76964p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f76965q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f76966r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76967s0;

        public a(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f76964p0 = singleObserver;
            this.f76966r0 = r3;
            this.f76965q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76967s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76967s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            R r3 = this.f76966r0;
            if (r3 != null) {
                this.f76966r0 = null;
                this.f76964p0.onSuccess(r3);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76966r0 == null) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76966r0 = null;
                this.f76964p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            R r3 = this.f76966r0;
            if (r3 != null) {
                try {
                    R rApply = this.f76965q0.apply(r3, t10);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    this.f76966r0 = rApply;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f76967s0.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76967s0, disposable)) {
                this.f76967s0 = disposable;
                this.f76964p0.onSubscribe(this);
            }
        }
    }

    public ObservableReduceSeedSingle(ObservableSource<T> observableSource, R r3, BiFunction<R, ? super T, R> biFunction) {
        this.f76961p0 = observableSource;
        this.f76962q0 = r3;
        this.f76963r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f76961p0.subscribe(new a(singleObserver, this.f76963r0, this.f76962q0));
    }
}
