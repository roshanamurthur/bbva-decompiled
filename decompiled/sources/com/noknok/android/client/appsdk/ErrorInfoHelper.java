package com.noknok.android.client.appsdk;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public class ErrorInfoHelper {
    public static void setAdditionalErrorInfo(AppSDKException appSDKException, JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.add(AppSDKException.KEY_ADDITIONAL_ERROR_INFO, (JsonElement) new Gson().fromJson(jsonObject.toString(), JsonElement.class));
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setCorrelationID(AppSDKException appSDKException, String str) {
        if (str == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.addProperty("correlationId", str);
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setFacetId(AppSDKException appSDKException, String str) {
        if (str == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.addProperty(AppSDKException.KEY_FACET_ID, str);
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setHttpStatusCode(AppSDKException appSDKException, String str) {
        if (str == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.addProperty("httpStatusCode", str);
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setOperationType(AppSDKException appSDKException, String str) {
        if (str == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.addProperty(AppSDKException.KEY_OPERATION_TYPE, str);
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setServerStatusCode(AppSDKException appSDKException, String str) {
        if (str == null) {
            return;
        }
        JsonObject additionalData = appSDKException.getAdditionalData();
        if (additionalData == null) {
            additionalData = new JsonObject();
        }
        additionalData.addProperty(AppSDKException.KEY_SERVER_STATUS_CODE, str);
        appSDKException.setAdditionalData(additionalData);
    }

    public static void setOperationType(AppSDKException appSDKException, OperationType operationType) {
        if (operationType != null) {
            setOperationType(appSDKException, operationType.name());
        }
    }
}
