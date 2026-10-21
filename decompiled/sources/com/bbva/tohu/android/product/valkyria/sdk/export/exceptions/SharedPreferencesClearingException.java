package com.bbva.tohu.android.product.valkyria.sdk.export.exceptions;

import com.bbva.tohu.android.core.constants.ResponseCodes;

/* JADX INFO: loaded from: classes6.dex */
public class SharedPreferencesClearingException extends TohuSdkException {
    public SharedPreferencesClearingException() {
        super(ResponseCodes.TOHU_INTERNAL_ERROR, 3, "Error clearing user shared preferences");
    }
}
