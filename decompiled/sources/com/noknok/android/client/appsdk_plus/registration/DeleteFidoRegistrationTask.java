package com.noknok.android.client.appsdk_plus.registration;

import android.util.Base64;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class DeleteFidoRegistrationTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IAppSDKPlus f63069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f63070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FidoMethod f63071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FidoRegistrationController f63072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IFidoRegistrationLiveData f63073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IFidoRegistrationListener f63074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f63075g;

    public DeleteFidoRegistrationTask(IAppSDKPlus iAppSDKPlus, SessionData sessionData, FidoMethod fidoMethod, FidoRegistrationController fidoRegistrationController, IFidoRegistrationLiveData iFidoRegistrationLiveData, IFidoRegistrationListener iFidoRegistrationListener, HashMap<String, String> map) {
        this.f63069a = iAppSDKPlus;
        this.f63070b = sessionData;
        this.f63071c = fidoMethod;
        this.f63072d = fidoRegistrationController;
        this.f63073e = iFidoRegistrationLiveData;
        this.f63074f = iFidoRegistrationListener;
        this.f63075g = map;
    }

    private String a(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String string = jSONArray.getJSONObject(i10).getString("handle");
                if (this.f63071c.isFido2()) {
                    if (string.equals(this.f63071c.mFido2CredentialId)) {
                        return string;
                    }
                } else if (new String(Base64.decode(string, 9), Charsets.utf8Charset).contains(this.f63071c.mAaid)) {
                    return string;
                }
            } catch (JSONException e5) {
                Logger.w("DeleteFidoRegistrationTask", e5.getMessage(), e5);
            }
        }
        return null;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            String strA = a(this.f63069a.getRegistrations(this.f63070b, this.f63075g));
            if (strA != null) {
                this.f63069a.deleteRegistration(activityProxyArr[0], this.f63070b, strA, this.f63075g);
                FidoRegistrationController fidoRegistrationController = this.f63072d;
                IFidoRegistrationLiveData iFidoRegistrationLiveData = this.f63073e;
                fidoRegistrationController.getClass();
                iFidoRegistrationLiveData.onOperationCompleted(ResultType.SUCCESS, null);
                return;
            }
            FidoRegistrationController fidoRegistrationController2 = this.f63072d;
            ActivityProxy activityProxy2 = activityProxyArr[0];
            IFidoRegistrationLiveData iFidoRegistrationLiveData2 = this.f63073e;
            AppSDKException appSDKException = new AppSDKException(ResultType.FAILURE, "Problem during fetch the handle");
            fidoRegistrationController2.getClass();
            iFidoRegistrationLiveData2.onOperationCompleted(appSDKException.getResultType(), appSDKException.getResultType().getRegErrorMessage(activityProxy2.getApplicationContext()));
        } catch (AppSDKException e5) {
            FidoRegistrationController fidoRegistrationController3 = this.f63072d;
            ActivityProxy activityProxy3 = activityProxyArr[0];
            IFidoRegistrationLiveData iFidoRegistrationLiveData3 = this.f63073e;
            fidoRegistrationController3.getClass();
            iFidoRegistrationLiveData3.onOperationCompleted(e5.getResultType(), e5.getResultType().getRegErrorMessage(activityProxy3.getApplicationContext()));
            IFidoRegistrationListener iFidoRegistrationListener = this.f63074f;
            if (iFidoRegistrationListener != null) {
                iFidoRegistrationListener.onDeregisterFailed(e5.getResultType());
            }
        } finally {
            activityProxy.finish();
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        AppSDKException appSDKException = new AppSDKException(ResultType.FAILURE, runtimeException);
        FidoRegistrationController fidoRegistrationController = this.f63072d;
        ActivityProxy activityProxy = activityProxyArr[0];
        IFidoRegistrationLiveData iFidoRegistrationLiveData = this.f63073e;
        fidoRegistrationController.getClass();
        iFidoRegistrationLiveData.onOperationCompleted(appSDKException.getResultType(), appSDKException.getResultType().getRegErrorMessage(activityProxy.getApplicationContext()));
        IFidoRegistrationListener iFidoRegistrationListener = this.f63074f;
        if (iFidoRegistrationListener != null) {
            iFidoRegistrationListener.onDeregisterFailed(appSDKException.getResultType());
        }
    }
}
