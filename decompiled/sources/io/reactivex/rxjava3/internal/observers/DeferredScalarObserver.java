package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {
    protected Disposable upstream;

    public DeferredScalarObserver(Observer<? super R> observer) {
        super(observer);
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        T t10 = this.value;
        if (t10 == null) {
            complete();
        } else {
            this.value = null;
            complete(t10);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        this.value = null;
        error(th2);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
