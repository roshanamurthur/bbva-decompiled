package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithSingle<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f72240p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72241p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SingleSource<? extends T> f72242q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72243r0;

        public a(Observer<? super T> observer, SingleSource<? extends T> singleSource) {
            this.f72241p0 = observer;
            this.f72242q0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72243r0 = true;
            DisposableHelper.replace(this, null);
            SingleSource<? extends T> singleSource = this.f72242q0;
            this.f72242q0 = null;
            singleSource.subscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72241p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72241p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f72243r0) {
                return;
            }
            this.f72241p0.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            Observer<? super T> observer = this.f72241p0;
            observer.onNext(t10);
            observer.onComplete();
        }
    }

    public ObservableConcatWithSingle(Observable<T> observable, SingleSource<? extends T> singleSource) {
        super(observable);
        this.f72240p0 = singleSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72240p0));
    }
}
