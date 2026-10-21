package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73581p0;

    public static final class a<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Disposable f73582p0;

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f73582p0.dispose();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73582p0, disposable)) {
                this.f73582p0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleToObservable(SingleSource<? extends T> singleSource) {
        this.f73581p0 = singleSource;
    }

    public static <T> SingleObserver<T> create(Observer<? super T> observer) {
        return new a(observer);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f73581p0.subscribe(create(observer));
    }
}
