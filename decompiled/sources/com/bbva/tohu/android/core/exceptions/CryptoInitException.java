package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class CryptoInitException extends TohuSdkException {
    public CryptoInitException() {
        super("TOHU_CRYPTO_ERROR", 0);
    }

    public CryptoInitException(Exception exc) {
        super("TOHU_CRYPTO_ERROR", 0, exc);
    }

    public CryptoInitException(String str) {
        super("TOHU_CRYPTO_ERROR", 0, str);
    }
}
