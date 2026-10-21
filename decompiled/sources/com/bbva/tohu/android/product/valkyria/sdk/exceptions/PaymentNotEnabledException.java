package com.bbva.tohu.android.product.valkyria.sdk.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentNotEnabledException extends TohuSdkException {
    public PaymentNotEnabledException(Exception exc) {
        super(ResponseCodes.TOHU_PAYMENT_NOT_ENABLED, 3, exc);
    }

    public PaymentNotEnabledException() {
        super(ResponseCodes.TOHU_PAYMENT_NOT_ENABLED, 3);
    }
}
