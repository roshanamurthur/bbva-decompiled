package com.noknok.android.client.appsdk_plus.pending_auth;

import android.content.Context;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.BaseTask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class RefreshPendingAuthsTask extends BaseTask<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IPendingAuthsLiveData f63054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSdkPlusConfig f63055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SessionData f63056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, String> f63057d;

    public RefreshPendingAuthsTask(IPendingAuthsLiveData iPendingAuthsLiveData, AppSdkPlusConfig appSdkPlusConfig, SessionData sessionData, HashMap<String, String> map) {
        this.f63054a = iPendingAuthsLiveData;
        this.f63055b = appSdkPlusConfig;
        this.f63056c = sessionData;
        this.f63057d = map;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(Context... contextArr) {
        this.f63054a.setPendingAuths(new AppSDKPlus(this.f63055b, contextArr[0]).getPendingAuths(this.f63056c, this.f63057d), ResultType.SUCCESS, null);
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, Context... contextArr) {
        this.f63054a.setPendingAuths(new ArrayList(), ResultType.FAILURE, runtimeException.getMessage());
    }
}
