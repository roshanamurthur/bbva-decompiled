package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class SafetyNetException extends TohuSdkException {
    public SafetyNetException() {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2);
    }

    public SafetyNetException(Exception exc) {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2, exc);
    }

    public SafetyNetException(String str) {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2, str);
    }
}
