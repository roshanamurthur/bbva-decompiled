package com.noknok.android.client.appsdk_plus.registration;

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

/* JADX INFO: loaded from: classes11.dex */
public class SetCredentialNameTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSDKPlus f63096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f63097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, String> f63098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IFidoRegistrationLiveData f63099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f63100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f63101f;

    public SetCredentialNameTask(AppSDKPlus appSDKPlus, SessionData sessionData, HashMap<String, String> map, String str, String str2, IFidoRegistrationLiveData iFidoRegistrationLiveData) {
        this.f63096a = appSDKPlus;
        this.f63097b = sessionData;
        this.f63098c = map;
        this.f63100e = str;
        this.f63101f = str2;
        this.f63099d = iFidoRegistrationLiveData;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            try {
                RegData regData = new RegData();
                regData.authenticatorName = this.f63101f;
                this.f63096a.updateRegistration(activityProxy, this.f63097b, this.f63100e, regData, this.f63098c);
            } catch (AppSDKException e5) {
                this.f63099d.onOperationCompleted(e5.getResultType(), e5.getResultType().getErrorMessage(activityProxy.getApplicationContext()));
                OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, new AppSDKException(ResultType.FAILURE), this.f63098c);
            }
        } finally {
            activityProxy.finish();
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        IFidoRegistrationLiveData iFidoRegistrationLiveData = this.f63099d;
        ResultType resultType = ResultType.FAILURE;
        iFidoRegistrationLiveData.onOperationCompleted(resultType, UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_ERROR_DEFAULT, R.string.nnl_result_default));
        OperationResultListener.getInstance(activityProxy.getApplicationContext()).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, new AppSDKException(resultType), this.f63098c);
    }
}
