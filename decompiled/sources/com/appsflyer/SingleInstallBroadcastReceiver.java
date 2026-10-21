package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1dSDK;

/* JADX INFO: loaded from: classes2.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("referrer");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
            stringExtra = null;
        }
        if (stringExtra != null && AFa1dSDK.values(context).getString("referrer", null) != null) {
            AFa1dSDK.valueOf().AFInAppEventParameterName(context, stringExtra);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (string == null || jCurrentTimeMillis - Long.parseLong(string) >= 2000) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFa1dSDK.valueOf().valueOf(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
