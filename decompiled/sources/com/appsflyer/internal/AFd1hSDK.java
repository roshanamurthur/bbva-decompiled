package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1hSDK extends AFd1eSDK {

    @NonNull
    private final AFe1lSDK AFVersionDeclaration;

    @NonNull
    private final AFb1fSDK afErrorLogForExcManagerOnly;

    @NonNull
    private final AFf1kSDK afWarnLog;
    public Map<String, Object> getLevel;

    @NonNull
    private final AFc1tSDK onAppOpenAttributionNative;

    @NonNull
    private final AppsFlyerProperties onInstallConversionDataLoadedNative;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1hSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFf1jSDK.AFa1vSDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFf1jSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFf1jSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1hSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1zSDK aFc1zSDK) {
        super(aFa1qSDK, aFc1zSDK);
        this.afWarnLog = aFc1zSDK.AFLogger$LogLevel();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFKeystoreWrapper();
        this.AFVersionDeclaration = aFc1zSDK.AFLogger();
        this.onAppOpenAttributionNative = aFc1zSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = AppsFlyerProperties.getInstance();
        this.valueOf.add(AFd1vSDK.RESOLVE_ESP);
        this.valueOf.add(AFd1vSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        AFe1lSDK aFe1lSDK = this.AFVersionDeclaration;
        int i10 = ((AFd1eSDK) this).afInfoLog.afErrorLog;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            long j10 = aFe1lSDK.AFLogger;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFe1lSDK.values.put("net", Long.valueOf(jCurrentTimeMillis - j10));
            aFe1lSDK.AFKeystoreWrapper.values("first_launch", new JSONObject(aFe1lSDK.values).toString());
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void values(AFa1qSDK aFa1qSDK) throws Throwable {
        super.values(aFa1qSDK);
        int i10 = aFa1qSDK.afErrorLog;
        this.AFVersionDeclaration.AFKeystoreWrapper(i10);
        Map map = (Map) aFa1qSDK.AFInAppEventType().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.AFInAppEventType().put("meta", map);
        }
        AFf1uSDK aFf1uSDKAFInAppEventParameterName = this.onAppOpenAttributionNative.AFInAppEventParameterName();
        if (aFf1uSDKAFInAppEventParameterName != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFf1uSDKAFInAppEventParameterName.AFInAppEventType);
            String str = aFf1uSDKAFInAppEventParameterName.AFKeystoreWrapper;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j10 = aFf1uSDKAFInAppEventParameterName.values;
            if (j10 > 0) {
                map2.put("latency", Long.valueOf(j10));
            }
            long j11 = aFf1uSDKAFInAppEventParameterName.valueOf;
            if (j11 > 0) {
                map2.put("delay", Long.valueOf(j11));
            }
            int i11 = aFf1uSDKAFInAppEventParameterName.AFInAppEventParameterName;
            if (i11 > 0) {
                map2.put("res_code", Integer.valueOf(i11));
            }
            if (aFf1uSDKAFInAppEventParameterName.afDebugLog != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFf1uSDKAFInAppEventParameterName.afDebugLog.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFf1uSDKAFInAppEventParameterName.afDebugLog.getMessage());
                map2.put("error", sb2.toString());
            }
            AFf1sSDK aFf1sSDK = aFf1uSDKAFInAppEventParameterName.afInfoLog;
            if (aFf1sSDK != null) {
                map2.put("sig", aFf1sSDK.toString());
            }
            String str2 = aFf1uSDKAFInAppEventParameterName.afRDLog;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        if (i10 == 1) {
            if (this.onInstallConversionDataLoadedNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1qSDK.AFInAppEventType().put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFVersionDeclaration.AFInAppEventType);
            this.AFVersionDeclaration.AFKeystoreWrapper.AFInAppEventType("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFVersionDeclaration.values);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
        } else if (i10 == 2) {
            HashMap map5 = new HashMap(this.AFVersionDeclaration.values);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFVersionDeclaration.AFKeystoreWrapper.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1qSDK.AFInAppEventType().remove("meta");
        }
        if (i10 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFf1jSDK aFf1jSDK : this.afWarnLog.AFInAppEventType()) {
                boolean z10 = aFf1jSDK instanceof AFf1pSDK;
                int i12 = AnonymousClass2.AFKeystoreWrapper[aFf1jSDK.afRDLog.ordinal()];
                if (i12 == 1) {
                    if (z10) {
                        aFa1qSDK.AFInAppEventParameterName("rfr", ((AFf1pSDK) aFf1jSDK).values);
                        this.afErrorLogForExcManagerOnly.valueOf(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFf1jSDK.AFKeystoreWrapper);
                } else if (i12 == 2 && i10 == 2 && !z10) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFf1jSDK.AFInAppEventParameterName);
                    map6.put(DigipassManagerConstants.KEY_RESPONSE, "TIMEOUT");
                    map6.put("type", aFf1jSDK.afInfoLog);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.AFInAppEventParameterName("referrers", arrayList);
            }
            Object obj = this.getLevel;
            if (obj != null) {
                aFa1qSDK.AFInAppEventParameterName("fb_ddl", obj);
            }
        }
    }
}
