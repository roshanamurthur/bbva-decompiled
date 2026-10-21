package com.noknok.android.client.appsdk_plus;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.ProtocolType;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppSdkPlusJson {
    public static final int API_0 = 0;
    public static final int API_1 = 1;
    public static final String API_META_KEY = "API";

    @Expose
    public String aaid;

    @Expose
    public String appIDUrl;

    @Expose
    public String authServerURL;

    @Expose
    public HashMap<String, String> extras;

    @Expose
    public JSONObject jsonRegAuthrInfo;

    @Expose
    public Method method;

    @Expose
    public String policy;

    @Expose
    public ProtocolType protocolType;

    @Expose
    public RegData regData;

    @Expose
    public String regServerURL;

    @Expose
    public boolean sendDiscoveryInfo;

    @Expose
    public String serverAdapter;

    @Expose
    public SessionData sessionData;

    @Expose
    public List<String> sessionKeys;

    @Expose
    public String transactionID;

    @Expose
    public int version;

    public enum Method {
        register,
        authenticate,
        transact,
        checkRegPossible,
        checkAuthPossible,
        checkTransPossible,
        deregister,
        update,
        clearLocalRegistrations,
        hasPlatformAuthenticator
    }

    public AppSdkPlusJson(AppSdkPlusConfig appSdkPlusConfig) {
        this(appSdkPlusConfig.regServerURL, appSdkPlusConfig.authServerURL, appSdkPlusConfig.restClientParams, appSdkPlusConfig.sendDiscoveryInfo);
        this.protocolType = appSdkPlusConfig.protocolType;
    }

    public static AppSdkPlusJson deserialize(String str) {
        return (AppSdkPlusJson) new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataDeserializer()).create().fromJson(str, AppSdkPlusJson.class);
    }

    public String serialize() {
        return new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataSerializer()).create().toJson(this, AppSdkPlusJson.class);
    }

    public AppSdkPlusJson(String str, String str2, String str3, boolean z10) {
        this.regServerURL = str;
        this.authServerURL = str2;
        this.serverAdapter = str3;
        this.sendDiscoveryInfo = z10;
        if (str3 == null || str3.isEmpty()) {
            this.serverAdapter = AuthType.JSON.name();
        }
    }
}
