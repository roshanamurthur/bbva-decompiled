package org.reactivestreams;

/* JADX INFO: loaded from: classes13.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);

    void onSubscribe(Subscription subscription);
}
