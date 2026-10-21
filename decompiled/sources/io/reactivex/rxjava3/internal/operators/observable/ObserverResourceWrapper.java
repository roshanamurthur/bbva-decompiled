package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f77457p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f77458q0 = new AtomicReference<>();

    public ObserverResourceWrapper(Observer<? super T> observer) {
        this.f77457p0 = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.f77458q0);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f77458q0.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        dispose();
        this.f77457p0.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        dispose();
        this.f77457p0.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        this.f77457p0.onNext(t10);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.f77458q0, disposable)) {
            this.f77457p0.onSubscribe(this);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
