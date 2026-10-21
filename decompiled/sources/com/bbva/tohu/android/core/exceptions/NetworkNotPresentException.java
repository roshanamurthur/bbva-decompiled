package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.core.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkNotPresentException extends TohuSdkException {
    public NetworkNotPresentException() {
        super(ResponseCodes.TOHU_NETWORK_NOT_PRESENT, 1);
    }

    public NetworkNotPresentException(Exception exc) {
        super(ResponseCodes.TOHU_NETWORK_NOT_PRESENT, 1, exc);
    }
}
