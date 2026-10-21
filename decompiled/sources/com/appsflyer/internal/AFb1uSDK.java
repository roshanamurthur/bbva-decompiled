package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1uSDK {
    public static Intent AFInAppEventType;
    public Map<String, String> AFInAppEventParameterName;
    private final AFc1zSDK AFLogger;

    @Nullable
    public String[] afInfoLog;
    public long afRDLog;

    @Nullable
    public DeepLinkListener valueOf;
    public String values;

    @NonNull
    public List<List<String>> AFKeystoreWrapper = new ArrayList();

    @NonNull
    public final List<String> afDebugLog = new ArrayList();

    public AFb1uSDK(@NonNull AFc1zSDK aFc1zSDK) {
        this.AFLogger = aFc1zSDK;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    private boolean values(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri uriAFInAppEventType;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AFInAppEventType;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!this.AFKeystoreWrapper.isEmpty() && extras != null) {
                for (List<String> list : this.AFKeystoreWrapper) {
                    if (list == null) {
                        uriAFInAppEventType = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriAFInAppEventType = AFInAppEventType(string, it);
                        } else {
                            uriAFInAppEventType = null;
                        }
                    }
                    if (uriAFInAppEventType != null) {
                        StringBuilder sb2 = new StringBuilder("Found deeplink in push payload at ");
                        sb2.append(list.toString());
                        AFLogger.afDebugLog(sb2.toString());
                        AFa1dSDK.AFInAppEventParameterName(map).put("payloadKey", this.AFKeystoreWrapper);
                        uri = uriAFInAppEventType;
                        break;
                    }
                }
            }
        } else {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb3.append(data.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (data2 != null) {
            if (!AFInAppEventType.hasExtra("af_consumed")) {
                AFInAppEventType.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data2);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb4.append(data2.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            AFInAppEventType(context, map, uri);
            return true;
        }
        StringBuilder sb5 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb5.append(uri.toString());
        sb5.append(" w/af_consumed");
        AFLogger.afInfoLog(sb5.toString());
        return false;
    }

    public final void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf == null) {
            AFInAppEventType(map);
            return;
        }
        try {
            try {
                DeepLink deepLinkAFInAppEventParameterName = DeepLink.AFInAppEventParameterName(map);
                deepLinkAFInAppEventParameterName.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(deepLinkAFInAppEventParameterName, null);
            } catch (JSONException e5) {
                AFLogger.afErrorLog("[DDL] Error occurred", e5, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            AFInAppEventParameterName(deepLinkResult);
        } catch (Throwable th2) {
            AFInAppEventParameterName(new DeepLinkResult(null, null));
            throw th2;
        }
    }

    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        AFd1lSDK aFd1lSDK = new AFd1lSDK(context, map, uri, this.afDebugLog);
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFd1tSDK level = this.AFLogger.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1lSDK));
        AFInAppEventType = null;
    }

    public final void valueOf(Map<String, Object> map, Intent intent, Context context) {
        AFc1xSDK aFc1xSDK = (AFc1xSDK) this.AFLogger;
        if (context != null) {
            aFc1xSDK.AFInAppEventParameterName.AFInAppEventParameterName = context.getApplicationContext();
        }
        if (!values(intent, context, map) && this.valueOf != null && this.AFLogger.AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0) == 0 && !this.AFLogger.AFKeystoreWrapper().AFKeystoreWrapper("ddl_sent")) {
            AFb1sSDK aFb1sSDK = new AFb1sSDK(this.AFLogger);
            AFd1tSDK level = this.AFLogger.getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(new AFd1jSDK(aFb1sSDK)));
        }
        this.AFLogger.AFKeystoreWrapper().valueOf("ddl_sent", true);
    }

    @Nullable
    private Uri AFInAppEventType(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e5) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e5);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            StringBuilder sb2 = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            AFLogger.afDebugLog(sb2.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
                return;
            }
        }
        AFLogger.afDebugLog("[DDL] skipping, no callback registered");
    }

    public final void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
        } else {
            AFInAppEventType(str);
        }
    }

    private static void AFInAppEventType(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    private static void AFInAppEventType(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
