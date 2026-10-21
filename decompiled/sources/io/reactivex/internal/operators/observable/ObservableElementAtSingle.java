package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72359p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72360q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f72361r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f72362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f72364r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72365s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f72366t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f72367u0;

        public a(SingleObserver<? super T> singleObserver, long j10, T t10) {
            this.f72362p0 = singleObserver;
            this.f72363q0 = j10;
            this.f72364r0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72365s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72365s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72367u0) {
                return;
            }
            this.f72367u0 = true;
            SingleObserver<? super T> singleObserver = this.f72362p0;
            T t10 = this.f72364r0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72367u0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72367u0 = true;
                this.f72362p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72367u0) {
                return;
            }
            long j10 = this.f72366t0;
            if (j10 != this.f72363q0) {
                this.f72366t0 = j10 + 1;
                return;
            }
            this.f72367u0 = true;
            this.f72365s0.dispose();
            this.f72362p0.onSuccess(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72365s0, disposable)) {
                this.f72365s0 = disposable;
                this.f72362p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(ObservableSource<T> observableSource, long j10, T t10) {
        this.f72359p0 = observableSource;
        this.f72360q0 = j10;
        this.f72361r0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f72359p0, this.f72360q0, this.f72361r0, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f72359p0.subscribe(new a(singleObserver, this.f72360q0, this.f72361r0));
    }
}
