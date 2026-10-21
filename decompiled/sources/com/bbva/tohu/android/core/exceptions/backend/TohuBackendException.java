package com.bbva.tohu.android.core.exceptions.backend;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class TohuBackendException extends TohuSdkException {
    public TohuBackendException(String str, int i10) {
        super(str, i10);
    }

    public TohuBackendException(int i10, Exception exc) {
        super(exc);
    }

    public TohuBackendException() {
    }

    public TohuBackendException(Exception exc) {
        super(exc);
    }

    public TohuBackendException(String str) {
        this(new Exception(str));
    }
}
