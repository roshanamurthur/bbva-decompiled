package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ErrorInfoHelper;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.jsonapi.QuickData;
import com.noknok.android.client.utils.ActivityProxy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class ClientAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSDK2 f62924a;

    public ClientAPI(Context context, ProtocolType protocolType) {
        this.f62924a = new AppSDK2(context, protocolType);
    }

    public final String a(AppSDK2.Operation operation, @NonNull AppSDK2.RPData rPData) {
        QuickData quickData;
        if (operation.equals(AppSDK2.Operation.AUTH) && (quickData = rPData.quickData) != null && quickData.isNotEmpty()) {
            return null;
        }
        AppSDK2.ResponseData responseDataInitOperation = this.f62924a.initOperation(operation, rPData);
        if (responseDataInitOperation.status == ResultType.SUCCESS) {
            return responseDataInitOperation.message;
        }
        AppSDKException appSDKException = new AppSDKException(responseDataInitOperation.status);
        ErrorInfoHelper.setOperationType(appSDKException, operation.name());
        throw appSDKException;
    }

    public final void b(ActivityProxy activityProxy) {
        if (!this.f62924a.hasPlatformAuthenticator(activityProxy)) {
            throw new AppSDKException(ResultType.NO_MATCH);
        }
    }

    public void checkAuthPossible(ActivityProxy activityProxy, String str) {
        checkAuthPossible(activityProxy, str, null);
    }

    public void clearLocalRegistrations(ActivityProxy activityProxy, String str, String str2) {
        this.f62924a.clearLocalRegistrations(activityProxy, str, str2);
    }

    public void checkAuthPossible(ActivityProxy activityProxy, String str, String str2) {
        ResultType resultTypeCheckAuthPossible = this.f62924a.checkAuthPossible(activityProxy, str, str2);
        if (resultTypeCheckAuthPossible != ResultType.SUCCESS) {
            throw new AppSDKException(resultTypeCheckAuthPossible);
        }
    }

    public final AppSDK2.ResponseData a(String str, @NonNull AppSDK2.RPData rPData) {
        AppSDK2.ResponseData responseDataProcess = this.f62924a.process(rPData, str);
        if (responseDataProcess.status == ResultType.SUCCESS) {
            return responseDataProcess;
        }
        AppSDKException subSystem = new AppSDKException(responseDataProcess.status).setSubSystem(responseDataProcess.subSystem);
        JsonObject jsonObject = responseDataProcess.additionalData;
        if (jsonObject != null) {
            subSystem.setAdditionalData(jsonObject);
            throw subSystem;
        }
        throw subSystem;
    }

    public final JSONObject a(ActivityProxy activityProxy) {
        JSONObject jSONObjectDiscover = this.f62924a.discover(activityProxy);
        if (jSONObjectDiscover != null) {
            return jSONObjectDiscover;
        }
        throw new AppSDKException(ResultType.FAILURE);
    }
}
