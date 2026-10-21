package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ChannelSecurityContext {
    private ChannelInfo channelInfo;
    private List<DeviceCerts> deviceCerts;
    private String keyData;
    private List<VtsCerts> vtsCerts;

    public ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public List<DeviceCerts> getDeviceCerts() {
        return this.deviceCerts;
    }

    public String getKeyData() {
        return this.keyData;
    }

    public List<VtsCerts> getVtsCerts() {
        return this.vtsCerts;
    }

    public void setChannelInfo(ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public void setDeviceCerts(List<DeviceCerts> list) {
        this.deviceCerts = list;
    }

    public void setKeyData(String str) {
        this.keyData = str;
    }

    public void setVtsCerts(List<VtsCerts> list) {
        this.vtsCerts = list;
    }
}
