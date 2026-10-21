package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f72060q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f72061p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f72062q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72063r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72064s0;

        public a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f72061p0 = singleObserver;
            this.f72062q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72063r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72063r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72064s0) {
                return;
            }
            this.f72064s0 = true;
            this.f72061p0.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72064s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72064s0 = true;
                this.f72061p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72064s0) {
                return;
            }
            try {
                if (this.f72062q0.test(t10)) {
                    this.f72064s0 = true;
                    this.f72063r0.dispose();
                    this.f72061p0.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72063r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72063r0, disposable)) {
                this.f72063r0 = disposable;
                this.f72061p0.onSubscribe(this);
            }
        }
    }

    public ObservableAnySingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f72059p0 = observableSource;
        this.f72060q0 = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAny(this.f72059p0, this.f72060q0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f72059p0.subscribe(new a(singleObserver, this.f72060q0));
    }
}
