package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f73737p0 == null) {
            this.f73738q0 = th2;
        } else {
            RxJavaPlugins.onError(th2);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f73737p0 == null) {
            this.f73737p0 = t10;
            this.f73739r0.cancel();
            countDown();
        }
    }
}
