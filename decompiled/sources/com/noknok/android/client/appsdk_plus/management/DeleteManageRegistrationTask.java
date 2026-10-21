package com.noknok.android.client.appsdk_plus.management;

import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.R;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class DeleteManageRegistrationTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSDKPlus f62981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f62982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, String> f62983c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IManageRegistrationsLiveData f62984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f62985e;

    public DeleteManageRegistrationTask(AppSDKPlus appSDKPlus, SessionData sessionData, JSONObject jSONObject, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        this.f62981a = appSDKPlus;
        this.f62982b = sessionData;
        this.f62984d = iManageRegistrationsLiveData;
        this.f62985e = jSONObject;
    }

    private void a(ActivityProxy activityProxy) {
        AppSdkPlusConfig appSdkPlusConfig = new AppSdkPlusConfig(this.f62981a.getAppSdkPlusConfig());
        ProtocolType[] protocolTypeArr = {ProtocolType.UAF, ProtocolType.FIDO2};
        AppSDKException e5 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            appSdkPlusConfig.protocolType = protocolTypeArr[i10];
            try {
                new AppSDKPlus(appSdkPlusConfig, activityProxy.getApplicationContext()).deleteAllRegistrations(activityProxy, this.f62982b, this.f62983c);
                z10 = true;
            } catch (AppSDKException e7) {
                e5 = e7;
            }
        }
        if (!z10) {
            throw e5;
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            try {
                try {
                    JSONObject jSONObject = this.f62985e;
                    if (jSONObject == null || !jSONObject.has("handle")) {
                        a(activityProxy);
                    } else {
                        String string = this.f62985e.getString("handle");
                        if (!string.isEmpty()) {
                            this.f62981a.deleteRegistration(activityProxy, this.f62982b, string, this.f62983c);
                        }
                    }
                    this.f62984d.onRemoveCompleted(ResultType.SUCCESS, null);
                } catch (JSONException e5) {
                    handleException(new RuntimeException(e5), activityProxyArr);
                }
            } catch (AppSDKException e7) {
                this.f62984d.onRemoveCompleted(e7.getResultType(), e7.getResultType().getErrorMessage(activityProxy.getApplicationContext()));
                OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.DELETE_REG, e7, this.f62983c);
            }
        } finally {
            activityProxy.finish();
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        IManageRegistrationsLiveData iManageRegistrationsLiveData = this.f62984d;
        ResultType resultType = ResultType.FAILURE;
        iManageRegistrationsLiveData.onRemoveCompleted(resultType, UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_DEFAULT, R.string.nnl_result_default));
        OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.DELETE_REG, new AppSDKException(resultType, runtimeException), this.f62983c);
    }
}
