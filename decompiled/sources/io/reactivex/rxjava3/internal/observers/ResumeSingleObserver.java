package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f74221p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleObserver<? super T> f74222q0;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f74221p0 = atomicReference;
        this.f74222q0 = singleObserver;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f74222q0.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f74221p0, disposable);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        this.f74222q0.onSuccess(t10);
    }
}
