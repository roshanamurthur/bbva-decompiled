package com.noknok.android.client.appsdk_plus;

import com.noknok.android.client.appsdk.ProtocolType;

/* JADX INFO: loaded from: classes11.dex */
public class AppSdkPlusConfig {
    public String authServerURL;
    public ProtocolType protocolType;
    public String regServerURL;
    public boolean remote;
    public String restClientParams;
    public boolean sendDiscoveryInfo;

    public AppSdkPlusConfig(AppSdkPlusConfig appSdkPlusConfig) {
        this(appSdkPlusConfig.regServerURL, appSdkPlusConfig.authServerURL, appSdkPlusConfig.restClientParams, appSdkPlusConfig.sendDiscoveryInfo);
        setRemote(appSdkPlusConfig.remote);
        setProtocolType(appSdkPlusConfig.protocolType);
    }

    public AppSdkPlusConfig setProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    public AppSdkPlusConfig setRemote(boolean z10) {
        this.remote = z10;
        return this;
    }

    public AppSdkPlusConfig(String str, String str2, String str3, boolean z10) {
        this.protocolType = ProtocolType.BOTH;
        this.regServerURL = str;
        this.authServerURL = str2;
        this.restClientParams = str3;
        this.sendDiscoveryInfo = z10;
    }
}
