package com.bbva.tohu.android.product.valkyria.sdk.managers;

/* JADX INFO: loaded from: classes6.dex */
public interface RetryStrategy {
    Integer getRetryCounter();

    long getSecondsToNextRetry();

    void incRetriesCount();

    boolean isInRetryWindow();
}
