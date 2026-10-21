package com.noknok.android.client.appsdk_plus.registration;

import android.app.Activity;
import android.content.Context;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.IOperationResultListener;
import com.noknok.android.client.appsdk_plus.OperationResult;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class FidoRegistrationController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f63086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppSDKPlus f63087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SessionData f63088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AppSdkPlusConfig f63089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IFidoRegistrationListener f63090e;

    public class SessionDataListener implements IOperationResultListener {
        public /* synthetic */ SessionDataListener(FidoRegistrationController fidoRegistrationController, int i10) {
            this();
        }

        @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
        public void onSessionDataUpdated(SessionData sessionData) {
            FidoRegistrationController.this.setSessionData(sessionData);
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

    public FidoRegistrationController(SessionData sessionData, AppSdkPlusConfig appSdkPlusConfig, HashMap<String, String> map) {
        this.f63088c = sessionData;
        this.f63089d = appSdkPlusConfig;
        this.f63086a = map;
        OperationResultListener.addInstance(new SessionDataListener(this, 0));
    }

    public void onDeregister(Activity activity, IFidoRegistrationLiveData iFidoRegistrationLiveData, FidoMethod fidoMethod) {
        onDeregister(ActivityProxy.createFromActivity(activity), iFidoRegistrationLiveData, fidoMethod);
    }

    public void onOpCompleted(Activity activity, IFidoRegistrationLiveData iFidoRegistrationLiveData, OperationResult operationResult) {
        if (operationResult.isSucceeded.booleanValue()) {
            OperationResultListener.ListenerOperationType listenerOperationType = operationResult.type;
            if (listenerOperationType == OperationResultListener.ListenerOperationType.DELETE_REG || listenerOperationType == OperationResultListener.ListenerOperationType.REG) {
                onOpCompleted(ActivityProxy.createFromActivity(activity), iFidoRegistrationLiveData, operationResult);
            }
        }
    }

    public void onRefresh(Activity activity, IFidoRegistrationLiveData iFidoRegistrationLiveData) {
        onRefresh(ActivityProxy.createFromActivity(activity), iFidoRegistrationLiveData);
    }

    public void onRegister(Activity activity, IFidoRegistrationLiveData iFidoRegistrationLiveData, FidoMethod fidoMethod) {
        onRegister(ActivityProxy.createFromActivity(activity), iFidoRegistrationLiveData, fidoMethod);
    }

    public FidoRegistrationController setApplicationContext(Context context) {
        this.f63087b = new AppSDKPlus(this.f63089d, context.getApplicationContext());
        return this;
    }

    @Deprecated
    public FidoRegistrationController setCallerActivity(Activity activity) {
        setApplicationContext(activity.getApplicationContext());
        return this;
    }

    public void setCredentialName(Activity activity, IFidoRegistrationLiveData iFidoRegistrationLiveData, String str, String str2) {
        setCredentialName(ActivityProxy.createFromActivity(activity), iFidoRegistrationLiveData, str, str2);
    }

    public FidoRegistrationController setListener(IFidoRegistrationListener iFidoRegistrationListener) {
        this.f63090e = iFidoRegistrationListener;
        return this;
    }

    public void setSessionData(SessionData sessionData) {
        this.f63088c = sessionData;
    }

    public void onDeregister(ActivityProxy activityProxy, IFidoRegistrationLiveData iFidoRegistrationLiveData, FidoMethod fidoMethod) {
        new DeleteFidoRegistrationTask(this.f63087b, this.f63088c, fidoMethod, this, iFidoRegistrationLiveData, this.f63090e, this.f63086a).execute(activityProxy);
    }

    public void onRefresh(ActivityProxy activityProxy, IFidoRegistrationLiveData iFidoRegistrationLiveData) {
        new FidoRefreshRegistrationsTask(this.f63088c, this.f63087b, iFidoRegistrationLiveData, this.f63086a).execute(activityProxy);
    }

    public void onRegister(ActivityProxy activityProxy, IFidoRegistrationLiveData iFidoRegistrationLiveData, FidoMethod fidoMethod) {
        new AddFidoRegistrationTask(this.f63088c, this.f63087b, this, iFidoRegistrationLiveData, fidoMethod, this.f63086a, this.f63090e).execute(activityProxy);
    }

    public void setCredentialName(ActivityProxy activityProxy, IFidoRegistrationLiveData iFidoRegistrationLiveData, String str, String str2) {
        new SetCredentialNameTask(this.f63087b, this.f63088c, null, str, str2, iFidoRegistrationLiveData).execute(activityProxy);
    }

    public void onOpCompleted(ActivityProxy activityProxy, IFidoRegistrationLiveData iFidoRegistrationLiveData, OperationResult operationResult) {
        if (operationResult.isSucceeded.booleanValue()) {
            OperationResultListener.ListenerOperationType listenerOperationType = operationResult.type;
            if (listenerOperationType == OperationResultListener.ListenerOperationType.DELETE_REG || listenerOperationType == OperationResultListener.ListenerOperationType.REG) {
                onRefresh(activityProxy, iFidoRegistrationLiveData);
            }
        }
    }
}
