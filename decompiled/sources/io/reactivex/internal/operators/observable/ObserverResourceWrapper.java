package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f73208p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73209q0 = new AtomicReference<>();

    public ObserverResourceWrapper(Observer<? super T> observer) {
        this.f73208p0 = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.f73209q0);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73209q0.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        dispose();
        this.f73208p0.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        dispose();
        this.f73208p0.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        this.f73208p0.onNext(t10);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.f73209q0, disposable)) {
            this.f73208p0.onSubscribe(this);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
