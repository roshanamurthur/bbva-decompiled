package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1mSDK extends AFd1uSDK<Boolean> {
    private static volatile boolean afInfoLog = false;
    private final AFa1fSDK AFLogger;
    private final AFd1tSDK afDebugLog;
    private Boolean afErrorLog;
    private final AFc1zSDK afRDLog;

    public AFd1mSDK(@NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.LOAD_CACHE, new AFd1vSDK[0], "LoadCachedRequests");
        this.AFLogger = aFc1zSDK.AppsFlyer2dXConversionCallback();
        this.afDebugLog = aFc1zSDK.getLevel();
        this.afRDLog = aFc1zSDK;
    }

    public static boolean afRDLog() {
        return afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @NonNull
    public final AFd1ySDK values() throws Exception {
        for (AFa1rSDK aFa1rSDK : this.AFLogger.AFKeystoreWrapper()) {
            StringBuilder sb2 = new StringBuilder("CACHE: resending request: ");
            sb2.append(aFa1rSDK.values);
            AFLogger.afInfoLog(sb2.toString());
            try {
                AFe1eSDK aFe1eSDK = new AFe1eSDK(AFKeystoreWrapper(aFa1rSDK), aFa1rSDK.valueOf(), aFa1rSDK.AFKeystoreWrapper, aFa1rSDK.AFInAppEventParameterName);
                AFd1tSDK aFd1tSDK = this.afDebugLog;
                aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(new AFd1fSDK(aFe1eSDK, this.afRDLog)));
            } catch (Exception e5) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e5);
            }
        }
        this.afErrorLog = Boolean.TRUE;
        afInfoLog = true;
        return AFd1ySDK.SUCCESS;
    }

    private static String AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = Long.parseLong(aFa1rSDK.AFKeystoreWrapper, 10);
        String str = aFa1rSDK.values;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j10) / 1000)).toString();
        } catch (Exception e5) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e5);
            return str;
        }
    }
}
