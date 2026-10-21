package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1oSDK extends AFd1nSDK<String> {

    @NonNull
    private final String afInfoLog;

    @Nullable
    private final AFg1ySDK getLevel;

    public AFd1oSDK(@NonNull AFc1zSDK aFc1zSDK, @NonNull String str, @Nullable AFg1ySDK aFg1ySDK) {
        super(AFd1vSDK.IMPRESSIONS, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, str);
        this.afInfoLog = str;
        this.getLevel = aFg1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        AFc1gSDK<Result> aFc1gSDK = ((AFd1nSDK) this).AFLogger;
        if (aFc1gSDK != 0) {
            int statusCode = aFc1gSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.afInfoLog);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.afInfoLog);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.afInfoLog);
            AFLogger.afInfoLog(sb4.toString(), false);
            String strAFInAppEventType = aFc1gSDK.AFInAppEventType("Location");
            AFg1ySDK aFg1ySDK = this.getLevel;
            if (aFg1ySDK == null || strAFInAppEventType == null) {
                return;
            }
            aFg1ySDK.valueOf = strAFInAppEventType;
            Context context = aFg1ySDK.AFInAppEventParameterName.get();
            if (context != null) {
                try {
                    if (aFg1ySDK.valueOf != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFg1ySDK.valueOf)).setFlags(268435456));
                    }
                } catch (Exception e5) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e5)), e5);
                }
            }
        }
    }
}
