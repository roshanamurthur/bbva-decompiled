package com.noknok.android.client.appsdk_plus.management;

import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class GetFidoRegistrationTask extends BaseTask<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSDKPlus f62992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SessionData f62993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, String> f62994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IManageRegistrationsLiveData f62995d;

    public GetFidoRegistrationTask(AppSDKPlus appSDKPlus, SessionData sessionData, HashMap<String, String> map, IManageRegistrationsLiveData iManageRegistrationsLiveData) {
        this.f62992a = appSDKPlus;
        this.f62993b = sessionData;
        this.f62994c = map;
        this.f62995d = iManageRegistrationsLiveData;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(Void... voidArr) {
        try {
            this.f62995d.setMethods(this.f62992a.getRegistrations(this.f62993b, this.f62994c), ResultType.SUCCESS, null);
        } catch (AppSDKException e5) {
            Logger.e("GetFidoRegistrationTask", "Problem getting registration list", e5);
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, Void... voidArr) {
        Logger.e("GetFidoRegistrationTask", "Problem getting registration list", runtimeException);
    }
}
