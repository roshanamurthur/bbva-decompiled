package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1lSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final AFb1fSDK AFKeystoreWrapper;
    public long AFLogger;
    public long afDebugLog;
    public final long[] afErrorLog;
    public long afErrorLogForExcManagerOnly;
    public final long[] afInfoLog;
    public final long[] afRDLog;
    public long getLevel;
    public long valueOf;
    public final Map<String, Object> values;

    public AFe1lSDK(AFb1fSDK aFb1fSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.values = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap3;
        this.valueOf = 0L;
        this.afDebugLog = 0L;
        this.afErrorLog = new long[2];
        this.afInfoLog = new long[2];
        this.afRDLog = new long[2];
        this.AFLogger = 0L;
        this.getLevel = 0L;
        this.AFKeystoreWrapper = aFb1fSDK;
        concurrentHashMap.putAll(AFInAppEventType("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventType("ddl"));
        concurrentHashMap3.putAll(AFInAppEventType("gcd"));
        this.afErrorLogForExcManagerOnly = aFb1fSDK.values("prev_session_dur", 0L);
    }

    private Map<String, Object> AFInAppEventType(String str) {
        Map<String, Object> mapEmptyMap = Collections.emptyMap();
        String strValueOf = this.AFKeystoreWrapper.valueOf(str, (String) null);
        if (strValueOf == null) {
            return mapEmptyMap;
        }
        try {
            return AFa1rSDK.values(new JSONObject(strValueOf));
        } catch (Exception e5) {
            AFLogger.afErrorLog("Error while parsing cached json data", e5, true);
            return mapEmptyMap;
        }
    }

    public final void AFInAppEventParameterName() {
        this.afDebugLog = System.currentTimeMillis();
        if (values()) {
            long j10 = this.valueOf;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.values.put("init_to_fg", Long.valueOf(this.afDebugLog - j10));
            this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final void AFKeystoreWrapper(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFLogger = jCurrentTimeMillis;
        if (i10 == 1) {
            long j10 = this.afDebugLog;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.values.put("from_fg", Long.valueOf(jCurrentTimeMillis - j10));
            this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final void values(AFe1oSDK aFe1oSDK) {
        if (values()) {
            this.values.put("start_with", aFe1oSDK.toString());
            this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final void values(DeepLinkResult deepLinkResult, long j10) {
        this.AFInAppEventType.put("status", deepLinkResult.getStatus().toString());
        this.AFInAppEventType.put("timeout_value", Long.valueOf(j10));
        this.AFKeystoreWrapper.values("ddl", new JSONObject(this.AFInAppEventType).toString());
    }

    public final void values(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.getLevel;
        if (j10 != 0) {
            this.AFInAppEventParameterName.put("net", Long.valueOf(jCurrentTimeMillis - j10));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventParameterName.put("retries", Integer.valueOf(i10));
        this.AFKeystoreWrapper.values("gcd", new JSONObject(this.AFInAppEventParameterName).toString());
    }

    public final boolean values() {
        return this.AFKeystoreWrapper.AFInAppEventType("appsFlyerCount", 0) == 0;
    }
}
