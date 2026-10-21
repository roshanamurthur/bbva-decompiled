package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1tSDK {
    public AFf1vSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFb1fSDK AFKeystoreWrapper;
    public long values;

    public AFb1tSDK() {
    }

    public AFb1tSDK(AFb1fSDK aFb1fSDK) {
        this.AFKeystoreWrapper = aFb1fSDK;
        this.AFInAppEventParameterName = values();
        this.values = aFb1fSDK.values("af_rc_timestamp", 0L);
        this.AFInAppEventType = aFb1fSDK.values("af_rc_max_age", 0L);
    }

    @Nullable
    public static JSONObject AFInAppEventParameterName(String str) {
        JSONObject jSONObjectValueOf = AFa1rSDK.valueOf(str);
        if (jSONObjectValueOf != null) {
            try {
                boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                boolean zOptBoolean = jSONObjectValueOf.optBoolean("monitor", false);
                AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                if (!zOptBoolean || z10) {
                    aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventParameterName();
                    aFb1wSDKAfErrorLogForExcManagerOnly.valueOf();
                } else {
                    aFb1wSDKAfErrorLogForExcManagerOnly.AFKeystoreWrapper();
                }
                if (jSONObjectValueOf.has("ol_id")) {
                    String strOptString = jSONObjectValueOf.optString("ol_scheme", null);
                    String strOptString2 = jSONObjectValueOf.optString("ol_domain", null);
                    String strOptString3 = jSONObjectValueOf.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, strOptString3);
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), th2);
                AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
                AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().valueOf();
            }
        }
        return jSONObjectValueOf;
    }

    @Nullable
    private AFf1vSDK values() {
        String strValueOf = this.AFKeystoreWrapper.valueOf("af_remote_config", (String) null);
        if (strValueOf == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFf1vSDK(new String(Base64.decode(strValueOf, 2), Charset.defaultCharset()));
        } catch (Exception e5) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e5, true);
            return null;
        }
    }
}
