package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithSingle<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f76521p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76522p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SingleSource<? extends T> f76523q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76524r0;

        public a(Observer<? super T> observer, SingleSource<? extends T> singleSource) {
            this.f76522p0 = observer;
            this.f76523q0 = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76524r0 = true;
            DisposableHelper.replace(this, null);
            SingleSource<? extends T> singleSource = this.f76523q0;
            this.f76523q0 = null;
            singleSource.subscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76522p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76522p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f76524r0) {
                return;
            }
            this.f76522p0.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            Observer<? super T> observer = this.f76522p0;
            observer.onNext(t10);
            observer.onComplete();
        }
    }

    public ObservableConcatWithSingle(Observable<T> observable, SingleSource<? extends T> singleSource) {
        super(observable);
        this.f76521p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76521p0));
    }
}
