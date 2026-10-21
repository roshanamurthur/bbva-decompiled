package com.noknok.android.client.appsdk;

import com.google.gson.annotations.Expose;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FidoOut {

    @Expose
    public String discoveryData;

    @Expose
    public String fidoResponse;

    @Expose
    public ResultType fidoStatus = ResultType.FAILURE;

    @Expose
    public boolean isPlatformAuthenticator;

    @Expose
    public boolean isQuickSupported;

    @Expose
    public boolean isSharedPasskey;

    @Expose
    public String registrationID;

    @Expose
    public String responseParams;
    public AppSDKException.SubSystem subSystem;

    @Expose
    public List<String> syncedRegTokens;

    public FidoOut setStatus(ResultType resultType) {
        this.fidoStatus = resultType;
        return this;
    }
}
