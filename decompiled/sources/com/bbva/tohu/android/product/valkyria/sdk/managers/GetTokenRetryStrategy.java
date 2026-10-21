package com.bbva.tohu.android.product.valkyria.sdk.managers;

import androidx.activity.a;
import com.bbva.tohu.android.core.utils.LogTohu;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class GetTokenRetryStrategy implements RetryStrategy {
    public static final int MAX_RETRIES = 3;
    public static final long RETRY_SECONDS_AFTER_FIRST_RETRY = 10;
    private static final Long RETRY_SECONDS_AFTER_SECOND_RETRY = 30L;
    public static final String TAG = "GetTokenRetryStrategy";
    private final Long initialDelayInSeconds;
    private final Long maxTimeInSeconds;
    private int retryCounter;

    public GetTokenRetryStrategy(Integer num, Long l6, Long l7) {
        this.retryCounter = num.intValue();
        this.initialDelayInSeconds = l6;
        this.maxTimeInSeconds = l7;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.RetryStrategy
    public Integer getRetryCounter() {
        return Integer.valueOf(this.retryCounter);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.RetryStrategy
    public long getSecondsToNextRetry() {
        Long l6;
        int i10 = this.retryCounter;
        if (i10 == 0) {
            l6 = this.initialDelayInSeconds;
        } else {
            l6 = i10 == 1 ? 10L : RETRY_SECONDS_AFTER_SECOND_RETRY;
        }
        LogTohu.d(TAG, "Retry counter: %d, with %d seconds", Integer.valueOf(this.retryCounter), l6);
        return l6.longValue();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.RetryStrategy
    public void incRetriesCount() {
        int i10 = this.retryCounter + 1;
        this.retryCounter = i10;
        LogTohu.d(TAG, "Incrementing retries count: %d", Integer.valueOf(i10));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.RetryStrategy
    public boolean isInRetryWindow() {
        return this.retryCounter < 3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GetTokenRetryStrategy{initialDelayInSeconds=");
        sb2.append(this.initialDelayInSeconds);
        sb2.append(", maxTimeInSeconds=");
        sb2.append(this.maxTimeInSeconds);
        sb2.append(", retryCounter=");
        return a.d(sb2, this.retryCounter, AbstractJsonLexerKt.END_OBJ);
    }
}
