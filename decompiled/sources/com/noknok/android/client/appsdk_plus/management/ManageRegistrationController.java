package com.noknok.android.client.appsdk_plus.management;

import android.app.Activity;
import android.content.Context;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.IOperationResultListener;
import com.noknok.android.client.appsdk_plus.OperationResult;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.RegData;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ManageRegistrationController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AppSDKPlus f62996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SessionData f62997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AppSdkPlusConfig f62998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, String> f62999d;

    public class SessionDataListener implements IOperationResultListener {
        public /* synthetic */ SessionDataListener(ManageRegistrationController manageRegistrationController, int i10) {
            this();
        }

        @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
        public void onSessionDataUpdated(SessionData sessionData) {
            ManageRegistrationController.this.setSessionData(sessionData);
        }

        private SessionDataListener() {
        }

        @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
        public void onComplete(OperationResultListener.ListenerOperationType listenerOperationType, IOperationResultListener.OperationData operationData, HashMap<String, String> map) {
        }

        @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
        public void onFailure(OperationResultListener.ListenerOperationType listenerOperationType, RuntimeException runtimeException, HashMap<String, String> map) {
        }
    }

    public ManageRegistrationController(AppSdkPlusConfig appSdkPlusConfig, SessionData sessionData, HashMap<String, String> map) {
        f62998c = appSdkPlusConfig;
        f62997b = sessionData;
        f62999d = map;
        OperationResultListener.addInstance(new SessionDataListener(this, 0));
    }

    public void onOpCompleted(IManageRegistrationsLiveData iManageRegistrationsLiveData, OperationResult operationResult) {
        if (operationResult.isSucceeded.booleanValue()) {
            OperationResultListener.ListenerOperationType listenerOperationType = operationResult.type;
            if (listenerOperationType == OperationResultListener.ListenerOperationType.REG || listenerOperationType == OperationResultListener.ListenerOperationType.DELETE_REG || listenerOperationType == OperationResultListener.ListenerOperationType.RENAME_REG) {
                onRefresh(iManageRegistrationsLiveData);
            }
        }
    }

    public void onRefresh(IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        new GetFidoRegistrationTask(f62996a, f62997b, f62999d, iManageRegistrationsLiveData).execute(new Void[0]);
    }

    public void onRemove(Activity activity, JSONObject jSONObject, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        onRemove(ActivityProxy.createFromActivity(activity), jSONObject, iManageRegistrationsLiveData);
    }

    public void onRemoveAll(Activity activity, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        onRemoveAll(ActivityProxy.createFromActivity(activity), iManageRegistrationsLiveData);
    }

    public void onRename(Activity activity, JSONObject jSONObject, RegData regData, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        onRename(ActivityProxy.createFromActivity(activity), jSONObject, regData, iManageRegistrationsLiveData);
    }

    public ManageRegistrationController setApplicationContext(Context context) {
        f62996a = new AppSDKPlus(f62998c, context.getApplicationContext());
        return this;
    }

    @Deprecated
    public ManageRegistrationController setCallerActivity(Activity activity) {
        return setApplicationContext(activity.getApplicationContext());
    }

    public void setSessionData(SessionData sessionData) {
        f62997b = sessionData;
    }

    public void onRemove(ActivityProxy activityProxy, JSONObject jSONObject, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        new DeleteManageRegistrationTask(f62996a, f62997b, jSONObject, iManageRegistrationsLiveData).execute(activityProxy);
    }

    public void onRemoveAll(ActivityProxy activityProxy, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        new DeleteManageRegistrationTask(f62996a, f62997b, null, iManageRegistrationsLiveData).execute(activityProxy);
    }

    public void onRename(ActivityProxy activityProxy, JSONObject jSONObject, RegData regData, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        new FidoRenameRegistrationTask(f62996a, f62997b, null, jSONObject, regData, iManageRegistrationsLiveData).execute(activityProxy);
    }
}
