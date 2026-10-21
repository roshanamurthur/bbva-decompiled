package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes8.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f69932p0 = null;
        this.f69933q0 = th2;
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        this.f69932p0 = t10;
    }
}
