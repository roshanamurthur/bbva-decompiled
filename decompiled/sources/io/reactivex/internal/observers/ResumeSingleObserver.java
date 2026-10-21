package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f69968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleObserver<? super T> f69969q0;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f69968p0 = atomicReference;
        this.f69969q0 = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f69969q0.onError(th2);
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f69968p0, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t10) {
        this.f69969q0.onSuccess(t10);
    }
}
