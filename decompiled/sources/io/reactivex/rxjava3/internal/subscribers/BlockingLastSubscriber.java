package io.reactivex.rxjava3.internal.subscribers;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        this.f78028p0 = null;
        this.f78029q0 = th2;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f78028p0 = t10;
    }
}
