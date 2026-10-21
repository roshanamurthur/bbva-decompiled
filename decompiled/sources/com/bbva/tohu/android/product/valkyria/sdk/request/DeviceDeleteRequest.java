package com.bbva.tohu.android.product.valkyria.sdk.request;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceDeleteRequest {
    private String deviceCode;

    public String getDeviceCode() {
        return this.deviceCode;
    }

    public void setDeviceCode(String str) {
        this.deviceCode = str;
    }

    public String toString() {
        return d.f(new StringBuilder("DeviceDeleteRequest{deviceCode='"), this.deviceCode, "'}");
    }
}
