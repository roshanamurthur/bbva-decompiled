package com.noknok.android.client.appsdk_plus;

import com.google.gson.JsonObject;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public interface IOperationResultListener {

    public static class OperationData {
        public JsonObject additionalInfo;
        public String authenticatorAttachment;
        public String handle;
        public String protocolFamily;
        public String quickData;
        public JSONArray registrations;
        public String username;
    }

    void onComplete(OperationResultListener.ListenerOperationType listenerOperationType, OperationData operationData, HashMap<String, String> map);

    void onFailure(OperationResultListener.ListenerOperationType listenerOperationType, RuntimeException runtimeException, HashMap<String, String> map);

    void onSessionDataUpdated(SessionData sessionData);
}
