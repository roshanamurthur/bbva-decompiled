package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        this.f74182p0 = null;
        this.f74183q0 = th2;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        this.f74182p0 = t10;
    }
}
