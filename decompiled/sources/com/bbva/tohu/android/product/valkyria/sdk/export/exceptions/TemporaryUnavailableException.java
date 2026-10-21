package com.bbva.tohu.android.product.valkyria.sdk.export.exceptions;

/* JADX INFO: loaded from: classes6.dex */
public class TemporaryUnavailableException extends TohuSdkException {
    public TemporaryUnavailableException() {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2);
    }

    public TemporaryUnavailableException(Exception exc) {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2, exc);
    }

    public TemporaryUnavailableException(String str) {
        super("TOHU_TEMPORARILY_UNAVAILABLE", 2, str);
    }
}
