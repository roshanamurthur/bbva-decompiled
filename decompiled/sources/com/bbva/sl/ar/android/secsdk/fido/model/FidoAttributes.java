package com.bbva.sl.ar.android.secsdk.fido.model;

/* JADX INFO: loaded from: classes8.dex */
public class FidoAttributes {
    private String appId;
    private String externalDeviceId;
    private String internalDeviceId;

    public FidoAttributes(String str, String str2, String str3) {
        this.appId = str;
        this.internalDeviceId = str2;
        this.externalDeviceId = str3;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getExternalDeviceId() {
        return this.externalDeviceId;
    }

    public String getInternalDeviceId() {
        return this.internalDeviceId;
    }
}
