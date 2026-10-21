package com.noknok.android.client.appsdk_plus.management;

import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.R;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.RegData;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class FidoRenameRegistrationTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSDKPlus f62986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f62987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, String> f62988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IManageRegistrationsLiveData f62989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f62990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RegData f62991f;

    public FidoRenameRegistrationTask(AppSDKPlus appSDKPlus, SessionData sessionData, HashMap<String, String> map, JSONObject jSONObject, RegData regData, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        this.f62986a = appSDKPlus;
        this.f62987b = sessionData;
        this.f62988c = map;
        this.f62990e = jSONObject;
        this.f62991f = regData;
        this.f62989d = iManageRegistrationsLiveData;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            try {
                try {
                    this.f62986a.updateRegistration(activityProxy, this.f62987b, this.f62990e.getString("handle"), this.f62991f, this.f62988c);
                    this.f62989d.onRenameCompleted(ResultType.SUCCESS, null);
                } catch (JSONException unused) {
                    IManageRegistrationsLiveData iManageRegistrationsLiveData = this.f62989d;
                    ResultType resultType = ResultType.FAILURE;
                    iManageRegistrationsLiveData.onRenameCompleted(resultType, UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_DEFAULT, R.string.nnl_result_default));
                    OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, new AppSDKException(resultType), this.f62988c);
                }
            } catch (AppSDKException e5) {
                this.f62989d.onRenameCompleted(e5.getResultType(), e5.getResultType().getErrorMessage(activityProxy.getApplicationContext()));
                OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, new AppSDKException(ResultType.FAILURE), this.f62988c);
            }
        } finally {
            activityProxy.finish();
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        IManageRegistrationsLiveData iManageRegistrationsLiveData = this.f62989d;
        ResultType resultType = ResultType.FAILURE;
        iManageRegistrationsLiveData.onRenameCompleted(resultType, UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_DEFAULT, R.string.nnl_result_default));
        OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, new AppSDKException(resultType), this.f62988c);
    }
}
