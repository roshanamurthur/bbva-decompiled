package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mx.openpay.library.domain.util.Constant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1sSDK extends AFe1fSDK {

    @VisibleForTesting
    private static String getLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final CountDownLatch AFLogger$LogLevel;
    private final List<AFf1jSDK> AFVersionDeclaration;
    private final AFf1kSDK AppsFlyer2dXConversionCallback;
    private final AFe1lSDK afErrorLogForExcManagerOnly;
    private final AFb1wSDK init;
    private final AFb1cSDK onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onConversionDataSuccess;
    private int onDeepLinkingNative;
    private final ExecutorService onInstallConversionDataLoadedNative;
    private final AFe1xSDK onInstallConversionFailureNative;
    private final AFb1uSDK onResponseErrorNative;
    private boolean onResponseNative;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1sSDK$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFf1jSDK.AFa1vSDK.values().length];
            values = iArr;
            try {
                iArr[AFf1jSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFf1jSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1sSDK(AFc1zSDK aFc1zSDK) {
        super(null, getLevel, Boolean.FALSE, Boolean.TRUE, null);
        this.AFVersionDeclaration = new ArrayList();
        this.AFLogger$LogLevel = new CountDownLatch(1);
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFLogger();
        this.onAppOpenAttributionNative = aFc1zSDK.AFInAppEventParameterName();
        this.onInstallConversionFailureNative = aFc1zSDK.AFVersionDeclaration();
        this.AppsFlyer2dXConversionCallback = aFc1zSDK.AFLogger$LogLevel();
        this.onInstallConversionDataLoadedNative = aFc1zSDK.valueOf();
        this.init = aFc1zSDK.afErrorLogForExcManagerOnly();
        this.onResponseErrorNative = aFc1zSDK.init();
    }

    private static boolean AFInAppEventParameterName(AFf1jSDK aFf1jSDK) {
        Long l6 = (Long) aFf1jSDK.AFKeystoreWrapper.get("click_ts");
        return l6 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l6.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    private Map<String, Object> AFInAppEventType(final AFc1uSDK.AFa1wSDK aFa1wSDK) {
        if (aFa1wSDK == null || aFa1wSDK.AFInAppEventParameterName == null) {
            return null;
        }
        Boolean bool = aFa1wSDK.AFInAppEventType;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1sSDK.2
                {
                    put("type", "unhashed");
                    put("value", aFa1wSDK.AFInAppEventParameterName);
                }
            };
        }
        return null;
    }

    private boolean AFLogger$LogLevel() {
        List list = (List) this.AFInAppEventParameterName.get("referrers");
        return (list != null ? list.size() : 0) < this.onDeepLinkingNative && !this.AFInAppEventParameterName.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afErrorLogForExcManagerOnly() {
        String[] strArr;
        this.onConversionDataSuccess++;
        StringBuilder sb2 = new StringBuilder("[DDL] Preparing request ");
        sb2.append(this.onConversionDataSuccess);
        AFLogger.afDebugLog(sb2.toString());
        if (this.onConversionDataSuccess == 1) {
            AFa1dSDK aFa1dSDKValueOf = AFa1dSDK.valueOf();
            this.AFInAppEventParameterName.put("is_first", Boolean.valueOf(this.onAppOpenAttributionNative.AFInAppEventType.AFInAppEventType("appsFlyerCount", 0) == 0));
            Map<String, Object> map = this.AFInAppEventParameterName;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Locale.getDefault().getLanguage());
            sb3.append(Constant.DASH_STRING);
            sb3.append(Locale.getDefault().getCountry());
            map.put("lang", sb3.toString());
            this.AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventParameterName.put("type", Build.MODEL);
            Map<String, Object> map2 = this.AFInAppEventParameterName;
            AFb1cSDK aFb1cSDK = this.onAppOpenAttributionNative;
            map2.put("request_id", AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType));
            AFa1bSDK aFa1bSDK = aFa1dSDKValueOf.afDebugLog;
            if (aFa1bSDK != null && (strArr = aFa1bSDK.AFInAppEventType) != null) {
                this.AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            Map<String, Object> mapAFInAppEventType = AFInAppEventType(AFa1bSDK.valueOf(this.onAppOpenAttributionNative.values.AFInAppEventParameterName, new HashMap()));
            Map<String, Object> mapAFInAppEventType2 = AFInAppEventType(AFa1bSDK.AFKeystoreWrapper(this.onAppOpenAttributionNative.values.AFInAppEventParameterName));
            if (mapAFInAppEventType != null) {
                this.AFInAppEventParameterName.put("gaid", mapAFInAppEventType);
            }
            if (mapAFInAppEventType2 != null) {
                this.AFInAppEventParameterName.put("oaid", mapAFInAppEventType2);
            }
        }
        Map<String, Object> map3 = this.AFInAppEventParameterName;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long jCurrentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map3.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        this.AFInAppEventParameterName.put("request_count", Integer.valueOf(this.onConversionDataSuccess));
        ArrayList arrayList = new ArrayList();
        Iterator<AFf1jSDK> it = this.AFVersionDeclaration.iterator();
        while (it.hasNext()) {
            Map<String, String> mapAFInAppEventType3 = AFInAppEventType(it.next());
            if (mapAFInAppEventType3 != null) {
                arrayList.add(mapAFInAppEventType3);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventParameterName.put("referrers", arrayList);
        }
        valueOf(onAppOpenAttributionNative());
    }

    @VisibleForTesting
    private String onAppOpenAttributionNative() {
        String str = this.onInstallConversionFailureNative.AFInAppEventType;
        String packageName = this.onAppOpenAttributionNative.values.AFInAppEventParameterName.getPackageName();
        String strAFKeystoreWrapper = this.onAppOpenAttributionNative.AFKeystoreWrapper();
        String strConcat = (strAFKeystoreWrapper == null || strAFKeystoreWrapper.trim().isEmpty()) ? "" : Constant.DASH_STRING.concat(strAFKeystoreWrapper);
        Uri.Builder builderBuildUpon = Uri.parse(String.format(getLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).buildUpon();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(strConcat);
        Uri.Builder builderAppendPath = builderBuildUpon.appendPath(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.AFInAppEventParameterName.get("timestamp"));
        sb3.append(str);
        return builderAppendPath.appendQueryParameter("af_sig", AFb1zSDK.AFKeystoreWrapper(sb3.toString(), str)).appendQueryParameter(k.a.f65050r, AFa1dSDK.AFKeystoreWrapper).build().toString();
    }

    public static /* synthetic */ void values(AFb1sSDK aFb1sSDK) {
        ArrayList<AFf1jSDK> arrayList = new ArrayList();
        for (AFf1jSDK aFf1jSDK : aFb1sSDK.AppsFlyer2dXConversionCallback.AFInAppEventType()) {
            if (aFf1jSDK != null && aFf1jSDK.afRDLog != AFf1jSDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFf1jSDK);
            }
        }
        aFb1sSDK.onDeepLinkingNative = arrayList.size();
        for (final AFf1jSDK aFf1jSDK2 : arrayList) {
            int i10 = AnonymousClass4.values[aFf1jSDK2.afRDLog.ordinal()];
            if (i10 == 1) {
                StringBuilder sb2 = new StringBuilder("[DDL] ");
                sb2.append(aFf1jSDK2.AFKeystoreWrapper.get("source"));
                sb2.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb2.toString());
                aFb1sSDK.AFKeystoreWrapper(aFf1jSDK2);
            } else if (i10 == 2) {
                aFf1jSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1sSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb3 = new StringBuilder("[DDL] ");
                        sb3.append(aFf1jSDK2.AFKeystoreWrapper.get("source"));
                        sb3.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb3.toString());
                        AFb1sSDK.this.AFKeystoreWrapper((AFf1jSDK) observable);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    public final DeepLinkResult AFLogger() {
        DeepLinkResult.Error error;
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.AFb1sSDK.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ DeepLinkResult call() throws Exception {
                AFb1sSDK.values(AFb1sSDK.this);
                AFb1sSDK.this.afErrorLogForExcManagerOnly();
                return AFb1sSDK.AFInAppEventParameterName(AFb1sSDK.this);
            }
        });
        this.onInstallConversionDataLoadedNative.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(this.onResponseErrorNative.afRDLog, TimeUnit.MILLISECONDS);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException e5) {
            e = e5;
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, error);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult2, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult2);
            return deepLinkResult2;
        } catch (ExecutionException e7) {
            e = e7;
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, error);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult3, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult3);
            return deepLinkResult3;
        } catch (TimeoutException e10) {
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", e10);
            StringBuilder sb2 = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb2.append(this.onConversionDataSuccess);
            sb2.append(" attempt(s) within ");
            sb2.append(this.onResponseErrorNative.afRDLog);
            sb2.append(" milliseconds");
            AFLogger.afDebugLog(sb2.toString());
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult4, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult4);
            return deepLinkResult4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFf1jSDK aFf1jSDK) {
        if (AFInAppEventParameterName(aFf1jSDK)) {
            this.AFVersionDeclaration.add(aFf1jSDK);
            this.AFLogger$LogLevel.countDown();
            AFLogger.afDebugLog("[DDL] Added non-organic ".concat(aFf1jSDK.getClass().getSimpleName()));
        } else {
            int i10 = this.onAttributionFailureNative + 1;
            this.onAttributionFailureNative = i10;
            if (i10 == this.onDeepLinkingNative) {
                this.AFLogger$LogLevel.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.DLSDK;
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventParameterName(AFb1sSDK aFb1sSDK) throws JSONException, InterruptedException, IOException {
        DeepLink deepLinkAFKeystoreWrapper;
        while (true) {
            AFe1lSDK aFe1lSDK = aFb1sSDK.afErrorLogForExcManagerOnly;
            int i10 = aFb1sSDK.onConversionDataSuccess;
            if (i10 > 0 && i10 <= 2) {
                int i11 = i10 - 1;
                aFe1lSDK.afErrorLog[i11] = System.currentTimeMillis();
                if (i11 == 0) {
                    long j10 = aFe1lSDK.afDebugLog;
                    if (j10 != 0) {
                        aFe1lSDK.AFInAppEventType.put("from_fg", Long.valueOf(aFe1lSDK.afErrorLog[i11] - j10));
                        aFe1lSDK.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK.AFInAppEventType).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
            }
            HttpURLConnection httpURLConnectionAFInAppEventType = new AFa1uSDK(aFb1sSDK, aFb1sSDK.init).AFInAppEventType(aFb1sSDK.onInstallConversionFailureNative.AFInAppEventType);
            AFe1lSDK aFe1lSDK2 = aFb1sSDK.afErrorLogForExcManagerOnly;
            int i12 = aFb1sSDK.onConversionDataSuccess;
            if (i12 > 0 && i12 <= 2) {
                int i13 = i12 - 1;
                aFe1lSDK2.afInfoLog[i13] = System.currentTimeMillis();
                long j11 = aFe1lSDK2.afErrorLog[i13];
                if (j11 != 0) {
                    long[] jArr = aFe1lSDK2.afRDLog;
                    jArr[i13] = aFe1lSDK2.afInfoLog[i13] - j11;
                    aFe1lSDK2.AFInAppEventType.put("net", jArr);
                    aFe1lSDK2.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK2.AFInAppEventType).toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i13);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i12))));
            }
            if (httpURLConnectionAFInAppEventType.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(AFa1dSDK.AFInAppEventType(httpURLConnectionAFInAppEventType));
                aFb1sSDK.onResponseNative = jSONObject.optBoolean("is_second_ping", true);
                if (jSONObject.optBoolean(DeepLinkListenerAdapter.Constants.STATUS_FOUND)) {
                    deepLinkAFKeystoreWrapper = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                    deepLinkAFKeystoreWrapper.valueOf.put("is_deferred", true);
                } else {
                    deepLinkAFKeystoreWrapper = null;
                }
                if (deepLinkAFKeystoreWrapper != null) {
                    return new DeepLinkResult(deepLinkAFKeystoreWrapper, null);
                }
                if (aFb1sSDK.onConversionDataSuccess <= 1 && aFb1sSDK.AFLogger$LogLevel() && aFb1sSDK.onResponseNative) {
                    AFLogger.afDebugLog("[DDL] Waiting for referrers...");
                    aFb1sSDK.AFLogger$LogLevel.await();
                    AFe1lSDK aFe1lSDK3 = aFb1sSDK.afErrorLogForExcManagerOnly;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j12 = aFe1lSDK3.afInfoLog[0];
                    if (j12 != 0) {
                        aFe1lSDK3.AFInAppEventType.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j12));
                        aFe1lSDK3.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK3.AFInAppEventType).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (aFb1sSDK.onAttributionFailureNative == aFb1sSDK.onDeepLinkingNative) {
                        return new DeepLinkResult(null, null);
                    }
                    aFb1sSDK.afErrorLogForExcManagerOnly();
                } else {
                    return new DeepLinkResult(null, null);
                }
            } else {
                StringBuilder sb3 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb3.append(httpURLConnectionAFInAppEventType.getResponseCode());
                AFLogger.afDebugLog(sb3.toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
    }

    private static Map<String, String> AFInAppEventType(AFf1jSDK aFf1jSDK) {
        if (aFf1jSDK.afRDLog != AFf1jSDK.AFa1vSDK.FINISHED) {
            return null;
        }
        HashMap map = new HashMap();
        String str = (String) aFf1jSDK.AFKeystoreWrapper.get("referrer");
        if (str == null) {
            return null;
        }
        map.put("source", (String) aFf1jSDK.AFKeystoreWrapper.get("source"));
        map.put("value", str);
        return map;
    }
}
