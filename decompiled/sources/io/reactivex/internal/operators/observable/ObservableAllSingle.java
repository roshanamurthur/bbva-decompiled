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
public final class ObservableAllSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72039p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f72040q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f72041p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f72042q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72043r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72044s0;

        public a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f72041p0 = singleObserver;
            this.f72042q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72043r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72043r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72044s0) {
                return;
            }
            this.f72044s0 = true;
            this.f72041p0.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72044s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72044s0 = true;
                this.f72041p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72044s0) {
                return;
            }
            try {
                if (this.f72042q0.test(t10)) {
                    return;
                }
                this.f72044s0 = true;
                this.f72043r0.dispose();
                this.f72041p0.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72043r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72043r0, disposable)) {
                this.f72043r0 = disposable;
                this.f72041p0.onSubscribe(this);
            }
        }
    }

    public ObservableAllSingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f72039p0 = observableSource;
        this.f72040q0 = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAll(this.f72039p0, this.f72040q0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f72039p0.subscribe(new a(singleObserver, this.f72040q0));
    }
}
