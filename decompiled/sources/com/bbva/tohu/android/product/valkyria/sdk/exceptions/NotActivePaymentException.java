package com.bbva.tohu.android.product.valkyria.sdk.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class NotActivePaymentException extends TohuSdkException {
    public NotActivePaymentException() {
        super(ResponseCodes.TOHU_PAYMENT_NOT_ACTIVE_IN_DEVICE, 3);
    }
}
