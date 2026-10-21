package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Disposable f78215p0;

    public final void cancel() {
        Disposable disposable = this.f78215p0;
        this.f78215p0 = DisposableHelper.DISPOSED;
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.validate(this.f78215p0, disposable, getClass())) {
            this.f78215p0 = disposable;
            onStart();
        }
    }

    public void onStart() {
    }
}
