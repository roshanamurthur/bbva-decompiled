package com.noknok.android.client.appsdk.jsonapi;

import com.google.gson.annotations.Expose;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Server {

    @Expose
    public String appID;

    @Expose
    public List<AuthenticatorResult> authenticatorsResult;

    @Expose
    public String newOperation;

    @Expose
    public String nnlData;

    @Expose
    public String protocolMessage;

    @Expose
    public QuickAuthData quickAuthData;

    public static class AuthenticatorResult {

        @Expose
        public String aaid;

        @Expose
        public String keyID;

        @Expose
        public String status;
    }
}
