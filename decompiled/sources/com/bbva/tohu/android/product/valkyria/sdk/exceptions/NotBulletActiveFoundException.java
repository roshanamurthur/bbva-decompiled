package com.bbva.tohu.android.product.valkyria.sdk.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class NotBulletActiveFoundException extends TohuSdkException {
    private String cardUniqueReference;

    public NotBulletActiveFoundException(String str) {
        super(PaymentStatus.TEMP_DISABLED, 3);
        this.cardUniqueReference = str;
    }

    public String getCardUniquereference() {
        return this.cardUniqueReference;
    }
}
