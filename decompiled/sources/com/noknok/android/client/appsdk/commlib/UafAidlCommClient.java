package com.noknok.android.client.appsdk.commlib;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;
import com.noknok.android.uaf.framework.agent.UafAppSdkAidl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UafAidlCommClient implements ICommunicationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62887a;

    public UafAidlCommClient(Context context) {
        this.f62887a = context;
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        Logger.i("UafAidlCommClient", "getServiceModuleList() called.");
        AppFinder appFinder = new AppFinder(this.f62887a, AppFinder.MIME_TYPE_CLIENT);
        List<ResolveInfo> serviceApps = appFinder.getServiceApps();
        if (AppSDKConfig.getInstance(this.f62887a).get(AppSDKConfig.Key.usePreloadedOnly).getAsBoolean()) {
            appFinder.removeUserApps(serviceApps);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = serviceApps.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo.packageName);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        try {
            UafAppSdkAidl.Instance().process((Intent) obj, iCommunicationClientResponse);
            return 0L;
        } catch (UafAppSdkAidl.ServiceException e5) {
            Logger.e("UafAidlCommClient", "Failed process AIDL request", e5);
            FidoOut fidoOut = new FidoOut();
            fidoOut.fidoStatus = ResultType.NOT_INSTALLED;
            iCommunicationClientResponse.onResponse(null, fidoOut);
            return 0L;
        }
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void removeRequest(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void waitForResponse(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void postRequest(String str, String str2, Object obj) {
    }
}
