package com.noknok.android.client.appsdk_plus.pending_auth;

import android.app.Activity;
import android.content.Context;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.oobsdk.OobReceiver;
import com.noknok.android.client.oobsdk.c;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class PendingAuthsController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSdkPlusConfig f63035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f63036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, String> f63037c;

    public PendingAuthsController(AppSdkPlusConfig appSdkPlusConfig, SessionData sessionData, HashMap<String, String> map) {
        this.f63035a = appSdkPlusConfig;
        this.f63036b = sessionData;
        HashMap<String, String> map2 = new HashMap<>();
        this.f63037c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public void onApprovePendingAuth(final Activity activity, final IPendingAuthsLiveData iPendingAuthsLiveData, String str) {
        OobReceiver.instance().processMessage(ActivityProxy.createFromActivity(activity), str, new OobReceiver.ICompletionListener() { // from class: com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsController.1
            @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
            public final /* synthetic */ void onComplete(Activity activity2, ResultType resultType, String str2, AppSDK2.Operation operation) {
                c.a(this, activity2, resultType, str2, operation);
            }

            @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
            public void onComplete(ActivityProxy activityProxy, ResultType resultType, String str2, AppSDK2.Operation operation) {
                PendingAuthsController.this.onRefresh(activity, iPendingAuthsLiveData);
                if (resultType.equals(ResultType.SUCCESS)) {
                    iPendingAuthsLiveData.onApproveCompleted(resultType, null);
                } else {
                    iPendingAuthsLiveData.onApproveCompleted(resultType, resultType.getMessage(activity.getApplicationContext()));
                }
            }
        }, this.f63037c);
    }

    public void onRefresh(Context context, IPendingAuthsLiveData iPendingAuthsLiveData) {
        new RefreshPendingAuthsTask(iPendingAuthsLiveData, this.f63035a, this.f63036b, this.f63037c).execute(context);
    }

    public void onRejectPendingAuth(final Activity activity, final IPendingAuthsLiveData iPendingAuthsLiveData, String str) {
        this.f63037c.put(IAppSDKPlus.EXTRA_KEY_CANCEL_PENDING_AUTH, "true");
        OobReceiver.instance().processMessage(ActivityProxy.createFromActivity(activity), str, new OobReceiver.ICompletionListener() { // from class: com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsController.2
            @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
            public final /* synthetic */ void onComplete(Activity activity2, ResultType resultType, String str2, AppSDK2.Operation operation) {
                c.a(this, activity2, resultType, str2, operation);
            }

            @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
            public void onComplete(ActivityProxy activityProxy, ResultType resultType, String str2, AppSDK2.Operation operation) {
                PendingAuthsController.this.onRefresh(activity, iPendingAuthsLiveData);
                if (resultType.equals(ResultType.CANCELED)) {
                    iPendingAuthsLiveData.onRejectCompleted(resultType, null);
                } else {
                    iPendingAuthsLiveData.onRejectCompleted(resultType, resultType.getMessage(activity.getApplicationContext()));
                }
            }
        }, this.f63037c);
    }
}
