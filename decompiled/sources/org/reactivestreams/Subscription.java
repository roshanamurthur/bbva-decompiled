package org.reactivestreams;

/* JADX INFO: loaded from: classes13.dex */
public interface Subscription {
    void cancel();

    void request(long j10);
}
