package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th2) {
        if (this.f74182p0 == null) {
            this.f74183q0 = th2;
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t10) {
        if (this.f74182p0 == null) {
            this.f74182p0 = t10;
            this.f74184r0.dispose();
            countDown();
        }
    }
}
