package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAllSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76303p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f76304q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f76305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f76306q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76307r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76308s0;

        public a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f76305p0 = singleObserver;
            this.f76306q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76307r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76307r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76308s0) {
                return;
            }
            this.f76308s0 = true;
            this.f76305p0.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76308s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76308s0 = true;
                this.f76305p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76308s0) {
                return;
            }
            try {
                if (this.f76306q0.test(t10)) {
                    return;
                }
                this.f76308s0 = true;
                this.f76307r0.dispose();
                this.f76305p0.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76307r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76307r0, disposable)) {
                this.f76307r0 = disposable;
                this.f76305p0.onSubscribe(this);
            }
        }
    }

    public ObservableAllSingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f76303p0 = observableSource;
        this.f76304q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAll(this.f76303p0, this.f76304q0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f76303p0.subscribe(new a(singleObserver, this.f76304q0));
    }
}
