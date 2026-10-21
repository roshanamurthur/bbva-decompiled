package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromCompletable<T> extends Observable<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f76722p0;

    public static final class FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76723p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76724q0;

        public FromCompletableObserver(Observer<? super T> observer) {
            this.f76723p0 = observer;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f76724q0.dispose();
            this.f76724q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f76724q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.f76724q0 = DisposableHelper.DISPOSED;
            this.f76723p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th2) {
            this.f76724q0 = DisposableHelper.DISPOSED;
            this.f76723p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76724q0, disposable)) {
                this.f76724q0 = disposable;
                this.f76723p0.onSubscribe(this);
            }
        }
    }

    public ObservableFromCompletable(CompletableSource completableSource) {
        this.f76722p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f76722p0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f76722p0.subscribe(new FromCompletableObserver(observer));
    }
}
