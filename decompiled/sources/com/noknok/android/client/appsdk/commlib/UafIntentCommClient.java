package com.noknok.android.client.appsdk.commlib;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UafIntentCommClient implements ICommunicationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityProxy f62889b;

    public UafIntentCommClient(Context context, ActivityProxy activityProxy) {
        this.f62888a = context;
        this.f62889b = activityProxy;
    }

    private boolean a(ResolveInfo resolveInfo) throws PackageManager.NameNotFoundException {
        Logger.i("UafIntentCommClient", "Checking FIDO UAF client with packageName, " + resolveInfo.activityInfo.applicationInfo.packageName);
        this.f62888a.getPackageManager();
        return true;
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        Logger.i("UafIntentCommClient", "getServiceModuleList() called.");
        AppFinder appFinder = new AppFinder(this.f62888a, AppFinder.MIME_TYPE_CLIENT);
        List<ResolveInfo> intentApps = appFinder.getIntentApps();
        if (AppSDKConfig.getInstance(this.f62888a).get(AppSDKConfig.Key.usePreloadedOnly).getAsBoolean()) {
            appFinder.removeUserApps(intentApps);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : intentApps) {
            if (!resolveInfo.activityInfo.applicationInfo.packageName.equals(this.f62888a.getPackageName())) {
                try {
                    if (a(resolveInfo)) {
                        arrayList.add(resolveInfo.activityInfo.applicationInfo.packageName);
                    }
                } catch (PackageManager.NameNotFoundException e5) {
                    Logger.e("UafIntentCommClient", "Error while determining if an installed App is a client", e5);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        if (!this.f62889b.hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for calling remote client with intent");
        }
        Intent intent = (Intent) obj;
        this.f62889b.setIntentClass(intent, IntentHelperActivity.class);
        iCommunicationClientResponse.onResponse(null, this.f62889b.startActivityForResult(intent, null));
        return 0L;
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
