package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72684p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final R f72685q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f72686r0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f72687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f72688q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public R f72689r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72690s0;

        public a(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r3) {
            this.f72687p0 = singleObserver;
            this.f72689r0 = r3;
            this.f72688q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72690s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72690s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            R r3 = this.f72689r0;
            if (r3 != null) {
                this.f72689r0 = null;
                this.f72687p0.onSuccess(r3);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72689r0 == null) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72689r0 = null;
                this.f72687p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            R r3 = this.f72689r0;
            if (r3 != null) {
                try {
                    this.f72689r0 = (R) ObjectHelper.requireNonNull(this.f72688q0.apply(r3, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f72690s0.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72690s0, disposable)) {
                this.f72690s0 = disposable;
                this.f72687p0.onSubscribe(this);
            }
        }
    }

    public ObservableReduceSeedSingle(ObservableSource<T> observableSource, R r3, BiFunction<R, ? super T, R> biFunction) {
        this.f72684p0 = observableSource;
        this.f72685q0 = r3;
        this.f72686r0 = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f72684p0.subscribe(new a(singleObserver, this.f72686r0, this.f72685q0));
    }
}
