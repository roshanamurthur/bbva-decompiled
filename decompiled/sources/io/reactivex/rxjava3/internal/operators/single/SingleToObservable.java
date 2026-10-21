package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77870p0;

    public static final class a<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Disposable f77871p0;

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f77871p0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77871p0, disposable)) {
                this.f77871p0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleToObservable(SingleSource<? extends T> singleSource) {
        this.f77870p0 = singleSource;
    }

    public static <T> SingleObserver<T> create(Observer<? super T> observer) {
        return new a(observer);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f77870p0.subscribe(create(observer));
    }
}
