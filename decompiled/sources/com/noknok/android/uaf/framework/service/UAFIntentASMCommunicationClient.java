package com.noknok.android.uaf.framework.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.fido.android.framework.service.Mfac;
import com.fido.android.framework.tm.AsmIntentHelperActivity;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.mfac.ASMCommunicationClientRequest;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UAFIntentASMCommunicationClient implements ICommunicationClient {
    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        ArrayList arrayList = new ArrayList();
        Context applicationContext = Mfac.Instance().getContext().getApplicationContext();
        AppFinder appFinder = new AppFinder(applicationContext, AppFinder.MIME_TYPE_ASM);
        List<ResolveInfo> intentApps = appFinder.getIntentApps();
        if (AppSDKConfig.getInstance(applicationContext).get(AppSDKConfig.Key.usePreloadedOnly).getAsBoolean()) {
            appFinder.removeUserApps(intentApps);
        }
        for (ResolveInfo resolveInfo : intentApps) {
            arrayList.add(resolveInfo.activityInfo.applicationInfo.packageName + "," + resolveInfo.activityInfo.name);
        }
        Logger.i("UAFIntentASMCommunicationClient", "UAF Intent ASM list: " + arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        ASMCommunicationClientRequest aSMCommunicationClientRequest = (ASMCommunicationClientRequest) obj;
        if (!aSMCommunicationClientRequest.activityProxy.hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for Calling remote ASM via Intent");
        }
        Intent intent = new Intent(aSMCommunicationClientRequest.activityProxy.getApplicationContext(), (Class<?>) AsmIntentHelperActivity.class);
        String[] strArrSplit = str.split(",");
        intent.putExtra("COMPONENT_NAME", new ComponentName(strArrSplit[0], strArrSplit[1]));
        intent.putExtra("IN_PARAM", aSMCommunicationClientRequest.sRequest);
        aSMCommunicationClientRequest.activityProxy.setIntentClass(intent, AsmIntentHelperActivity.class);
        iCommunicationClientResponse.onResponse(null, (String) aSMCommunicationClientRequest.activityProxy.startActivityForResult(intent, null));
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
