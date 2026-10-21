package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f78028p0 == null) {
            this.f78029q0 = th2;
        } else {
            RxJavaPlugins.onError(th2);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f78028p0 == null) {
            this.f78028p0 = t10;
            this.f78030r0.cancel();
            countDown();
        }
    }
}
