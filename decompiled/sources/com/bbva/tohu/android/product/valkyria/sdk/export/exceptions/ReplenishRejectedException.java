package com.bbva.tohu.android.product.valkyria.sdk.export.exceptions;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishRejectedException extends TohuSdkException {
    public ReplenishRejectedException() {
        super("Too many requests");
    }

    public ReplenishRejectedException(Exception exc) {
        super(exc);
    }

    public ReplenishRejectedException(String str) {
        super(str);
    }
}
