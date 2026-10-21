package com.noknok.android.client.appsdk.jsonapi;

import android.content.Context;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.PBKDF2Helper;
import com.noknok.android.client.utils.TimeProviderManager;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class QuickData {

    @Expose
    public String aaid;

    @Expose
    public String appID;

    @Expose
    public String keyID;

    @Expose
    public QuickAuthData quickAuthData = new QuickAuthData();

    public static QuickData fromJson(String str) {
        return (QuickData) new Gson().fromJson(str, QuickData.class);
    }

    public static String fromServer(String str, Context context) {
        Server server;
        List<Server.AuthenticatorResult> list;
        QuickAuthData quickAuthData;
        try {
            Charset charset = Charsets.utf8Charset;
            String str2 = new String(Base64.decode(str.getBytes(charset), 8), charset);
            if (str2.isEmpty() || (server = ((Message) new Gson().fromJson(str2, Message.class)).server) == null || (list = server.authenticatorsResult) == null || list.isEmpty() || (quickAuthData = server.quickAuthData) == null || quickAuthData.saltSuffix == null) {
                return null;
            }
            QuickData quickData = new QuickData();
            String str3 = server.appID;
            quickData.appID = (str3 == null || str3.isEmpty()) ? AppUtils.computeFacetID(context, null, AppUtils.Algorithm.SHA1) : server.appID;
            quickData.keyID = server.authenticatorsResult.get(0).keyID;
            quickData.aaid = server.authenticatorsResult.get(0).aaid;
            quickData.quickAuthData = server.quickAuthData;
            return quickData.toJson();
        } catch (RuntimeException e5) {
            Logger.w("QuickData", "Failed to retrieve QuickData from message", e5);
            return null;
        }
    }

    public void generateChallenge() {
        if (!isNotEmpty()) {
            throw new AppSDKException(ResultType.FAILURE, "Invalid or empty quick auth data");
        }
        long currentTime = TimeProviderManager.getInstance().getCurrentTime();
        QuickAuthData quickAuthData = this.quickAuthData;
        quickAuthData.challenge = PBKDF2Helper.generateChallenge(currentTime, this.keyID, this.appID, quickAuthData.saltSuffix, quickAuthData.algorithm.minIterations.intValue(), this.quickAuthData.keyLength.intValue());
        QuickAuthData.Algorithm algorithm = this.quickAuthData.algorithm;
        algorithm.iterations = algorithm.minIterations.toString();
        this.quickAuthData.clientTime = String.valueOf(currentTime);
        QuickAuthData quickAuthData2 = this.quickAuthData;
        quickAuthData2.algorithm.minIterations = null;
        quickAuthData2.keyLength = null;
        quickAuthData2.saltSuffix = null;
    }

    public boolean isNotEmpty() {
        return this.quickAuthData.isNotEmpty();
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
