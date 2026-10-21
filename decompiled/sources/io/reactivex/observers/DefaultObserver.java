package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Disposable f73805p0;

    public final void cancel() {
        Disposable disposable = this.f73805p0;
        this.f73805p0 = DisposableHelper.DISPOSED;
        disposable.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.validate(this.f73805p0, disposable, getClass())) {
            this.f73805p0 = disposable;
            onStart();
        }
    }

    public void onStart() {
    }
}
