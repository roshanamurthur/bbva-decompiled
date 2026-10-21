package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface RetryStrategy<TInput, TResult> {
    @Nullable
    TInput shouldRetry(TInput tinput, TResult tresult);
}
