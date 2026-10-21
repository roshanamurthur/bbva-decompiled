package com.bbva.tohu.android.product.valkyria.sdk.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class TohuInitException extends TohuSdkException {
    public TohuInitException() {
        super(ResponseCodes.TOHU_INIT_NEEDED, 3);
    }

    public TohuInitException(Exception exc) {
        super(ResponseCodes.TOHU_INIT_NEEDED, 3, exc);
    }

    public TohuInitException(String str) {
        super(ResponseCodes.TOHU_INIT_NEEDED, 3, str);
    }
}
