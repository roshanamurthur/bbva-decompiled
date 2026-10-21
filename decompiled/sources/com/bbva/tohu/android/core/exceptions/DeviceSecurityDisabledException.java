package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceSecurityDisabledException extends TohuSdkException {
    public DeviceSecurityDisabledException() {
        super("TOHU_INSECURE_DEVICE", 5);
    }
}
