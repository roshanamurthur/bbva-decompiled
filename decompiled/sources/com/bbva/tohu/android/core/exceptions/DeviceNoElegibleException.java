package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.core.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceNoElegibleException extends TohuSdkException {
    public DeviceNoElegibleException(Exception exc) {
        super(ResponseCodes.TOHU_DEVICE_NOT_ELEGIBLE, exc);
    }
}
