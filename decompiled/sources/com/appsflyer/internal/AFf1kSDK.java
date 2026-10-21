package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1kSDK {
    private final List<AFf1jSDK> AFInAppEventType = new ArrayList();

    public final void AFInAppEventParameterName(Context context, Runnable runnable, AFc1zSDK aFc1zSDK) {
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFf1iSDK(providerInfo, runnable, aFc1zSDK));
            } else {
                AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.AFInAppEventType.addAll(arrayList);
        StringBuilder sb2 = new StringBuilder("[Preinstall]: Detected ");
        sb2.append(arrayList.size());
        sb2.append(" valid preinstall provider(s)");
        AFLogger.afDebugLog(sb2.toString());
    }

    @NonNull
    public final synchronized AFf1jSDK[] AFInAppEventType() {
        return (AFf1jSDK[]) this.AFInAppEventType.toArray(new AFf1jSDK[0]);
    }

    public final synchronized void values(AFf1jSDK aFf1jSDK) {
        this.AFInAppEventType.add(aFf1jSDK);
    }
}
