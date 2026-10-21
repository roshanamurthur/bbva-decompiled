package com.appsflyer;

import androidx.annotation.Nullable;
import com.appsflyer.internal.AFb1fSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties values = new AppsFlyerProperties();
    public String AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean AFKeystoreWrapper = false;
    public boolean valueOf;

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int AFInAppEventParameterName;

        EmailsCryptType(int i10) {
            this.AFInAppEventParameterName = i10;
        }

        public final int getValue() {
            return this.AFInAppEventParameterName;
        }
    }

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return values;
    }

    private boolean valueOf() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    public boolean getBoolean(String str, boolean z10) {
        String string = getString(str);
        return string == null ? z10 : Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i10) {
        String string = getString(str);
        return string == null ? i10 : Integer.parseInt(string);
    }

    public long getLong(String str, long j10) {
        String string = getString(str);
        return string == null ? j10 : Long.parseLong(string);
    }

    public synchronized Object getObject(String str) {
        return this.AFInAppEventType.get(str);
    }

    public String getReferrer(AFb1fSDK aFb1fSDK) {
        String str = this.AFInAppEventParameterName;
        if (str != null) {
            return str;
        }
        return getString("AF_REFERRER") != null ? getString("AF_REFERRER") : aFb1fSDK.valueOf("referrer", (String) null);
    }

    @Nullable
    public synchronized String getString(String str) {
        return (String) this.AFInAppEventType.get(str);
    }

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        return getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel();
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(AFb1fSDK aFb1fSDK) {
        try {
            if (valueOf()) {
                return;
            }
            String strValueOf = aFb1fSDK.valueOf("savedProperties", (String) null);
            if (strValueOf != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.AFInAppEventType.get(next) == null) {
                            this.AFInAppEventType.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix"};
                    for (int i10 = 0; i10 < 3; i10++) {
                        this.AFInAppEventType.remove(strArr[i10]);
                    }
                    saveProperties(aFb1fSDK);
                    this.AFKeystoreWrapper = true;
                } catch (JSONException e5) {
                    AFLogger.afErrorLog("Failed loading properties", e5);
                }
                StringBuilder sb2 = new StringBuilder("Done loading properties: ");
                sb2.append(this.AFKeystoreWrapper);
                AFLogger.afDebugLog(sb2.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(String str) {
        this.AFInAppEventType.remove(str);
    }

    public synchronized void saveProperties(AFb1fSDK aFb1fSDK) {
        this.AFInAppEventType.remove("AppsFlyerKey");
        aFb1fSDK.values("savedProperties", new JSONObject(this.AFInAppEventType).toString());
    }

    public synchronized void set(String str, String str2) {
        this.AFInAppEventType.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.AFInAppEventType.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFInAppEventType.put(USER_EMAILS, str);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFInAppEventType.put(str, strArr);
    }

    public synchronized void set(String str, int i10) {
        this.AFInAppEventType.put(str, Integer.toString(i10));
    }

    public synchronized void set(String str, long j10) {
        this.AFInAppEventType.put(str, Long.toString(j10));
    }

    public synchronized void set(String str, boolean z10) {
        this.AFInAppEventType.put(str, Boolean.toString(z10));
    }
}
