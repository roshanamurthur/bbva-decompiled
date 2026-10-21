package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76641q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f76642r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f76643p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76644q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f76645r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76646s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f76647t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f76648u0;

        public a(SingleObserver<? super T> singleObserver, long j10, T t10) {
            this.f76643p0 = singleObserver;
            this.f76644q0 = j10;
            this.f76645r0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76646s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76646s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76648u0) {
                return;
            }
            this.f76648u0 = true;
            SingleObserver<? super T> singleObserver = this.f76643p0;
            T t10 = this.f76645r0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76648u0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76648u0 = true;
                this.f76643p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76648u0) {
                return;
            }
            long j10 = this.f76647t0;
            if (j10 != this.f76644q0) {
                this.f76647t0 = j10 + 1;
                return;
            }
            this.f76648u0 = true;
            this.f76646s0.dispose();
            this.f76643p0.onSuccess(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76646s0, disposable)) {
                this.f76646s0 = disposable;
                this.f76643p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(ObservableSource<T> observableSource, long j10, T t10) {
        this.f76640p0 = observableSource;
        this.f76641q0 = j10;
        this.f76642r0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f76640p0, this.f76641q0, this.f76642r0, true));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f76640p0.subscribe(new a(singleObserver, this.f76641q0, this.f76642r0));
    }
}
