package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class InternalErrorException extends TohuSdkException {
    public InternalErrorException(String str) {
        super(str);
    }

    public InternalErrorException() {
    }

    public InternalErrorException(Exception exc) {
        super(exc);
    }

    public InternalErrorException(String str, int i10) {
        super(str, i10);
    }
}
