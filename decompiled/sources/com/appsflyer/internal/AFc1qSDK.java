package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adobe.marketing.mobile.EventDataKeys;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1qSDK {

    @VisibleForTesting
    private static String AFInAppEventType = null;
    private static int AFLogger$LogLevel = 1;
    private static int afDebugLog;
    private static char[] afInfoLog;
    private static long afRDLog;
    public static String valueOf;

    @VisibleForTesting
    private static String values;
    private final AFb1cSDK AFInAppEventParameterName;
    private final AFc1pSDK AFKeystoreWrapper;
    private final AFc1cSDK AFLogger;
    private final AppsFlyerProperties afErrorLog;

    static {
        AFInAppEventType();
        AFInAppEventType = "https://%smonitorsdk.%s/remote-debug?app_id=";
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        values = "https://%sonelink.%s/shortlink-sdk/v2";
        int i10 = AFLogger$LogLevel + 29;
        afDebugLog = i10 % 128;
        int i11 = i10 % 2;
    }

    public AFc1qSDK(AFc1pSDK aFc1pSDK, AFb1cSDK aFb1cSDK, AppsFlyerProperties appsFlyerProperties, AFc1cSDK aFc1cSDK) {
        this.AFKeystoreWrapper = aFc1pSDK;
        this.AFInAppEventParameterName = aFb1cSDK;
        this.afErrorLog = appsFlyerProperties;
        this.AFLogger = aFc1cSDK;
    }

    public static void AFInAppEventType() {
        afInfoLog = new char[]{'A', 38861, 12155, 51026, 24261, 63024, 36460, 9676, 48428, 21878, 60636, 33852, 55659, 20176, 63038, 7782, 34753};
        afRDLog = -3902864565468424277L;
    }

    @NonNull
    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        try {
            AFc1nSDK<String> aFc1nSDKValues = values(new AFb1ySDK(sb2.toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(73 - Color.alpha(0), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1jSDK());
            int i10 = afDebugLog + 75;
            AFLogger$LogLevel = i10 % 128;
            int i11 = i10 % 2;
            return aFc1nSDKValues;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1nSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFb1bSDK aFb1bSDK) throws Throwable {
        try {
            AFc1nSDK<String> aFc1nSDKValues = values(new AFb1ySDK(aFa1qSDK.afInfoLog, (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, AFa1qSDK.class, String.class, AFb1bSDK.class).invoke(null, aFa1qSDK, str, aFb1bSDK), "POST", Collections.emptyMap(), aFa1qSDK.AFKeystoreWrapper()), new AFc1jSDK());
            int i10 = afDebugLog + 31;
            AFLogger$LogLevel = i10 % 128;
            if (i10 % 2 != 0) {
                return aFc1nSDKValues;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1nSDK<String> valueOf(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put(EventDataKeys.Audience.UUID, string);
        map2.put("data", map);
        map2.put("meta", AFKeystoreWrapper());
        if (str2 != null) {
            int i10 = AFLogger$LogLevel + 1;
            afDebugLog = i10 % 128;
            if (i10 % 2 != 0) {
                map2.put("brand_domain", str2);
                throw null;
            }
            map2.put("brand_domain", str2);
            int i11 = AFLogger$LogLevel + 111;
            afDebugLog = i11 % 128;
            int i12 = i11 % 2;
        }
        String string2 = AFa1rSDK.values(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        valueOf((char) View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, Color.blue(0), objArr);
        map3.put(((String) objArr[0]).intern(), values(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(str);
        return AFKeystoreWrapper(new AFb1ySDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFc1fSDK) new AFc1jSDK(), true);
    }

    @NonNull
    public final AFc1nSDK<String> values(Map<String, Object> map, String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        try {
            AFc1nSDK<String> aFc1nSDKValues = values(new AFb1ySDK(sb2.toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 72, 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - Process.getGidForName("")))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1jSDK());
            int i10 = AFLogger$LogLevel + 111;
            afDebugLog = i10 % 128;
            if (i10 % 2 == 0) {
                return aFc1nSDKValues;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @NonNull
    public final AFc1nSDK<AFf1vSDK> AFInAppEventType(boolean z10, boolean z11, @NonNull String str, int i10) {
        String str2;
        String str3;
        int i11 = afDebugLog + 95;
        AFLogger$LogLevel = i11 % 128;
        int i12 = i11 % 2;
        AFc1cSDK aFc1cSDK = this.AFLogger;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z10 ? AFc1cSDK.valueOf : AFc1cSDK.AFKeystoreWrapper;
        if (z11) {
            int i13 = afDebugLog + 37;
            AFLogger$LogLevel = i13 % 128;
            int i14 = i13 % 2;
            str2 = "stg";
        } else {
            str2 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[4];
        if (AFc1cSDK.AFInAppEventParameterName()) {
            int i15 = AFLogger$LogLevel + 1;
            afDebugLog = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            str3 = (String) aFc1cSDK.AFInAppEventParameterName.getValue();
        } else {
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = str2;
        objArr[2] = aFc1cSDK.AFInAppEventType();
        objArr[3] = str;
        AFb1ySDK aFb1ySDK = new AFb1ySDK(ai.a.i(objArr, 4, str4, ""), "GET");
        aFb1ySDK.afDebugLog = 1500;
        return values(aFb1ySDK, new AFc1kSDK());
    }

    public final AFc1nSDK<Map<String, String>> AFKeystoreWrapper(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map<String, Object> mapAFKeystoreWrapper = AFKeystoreWrapper();
        String strValueOf = String.valueOf(mapAFKeystoreWrapper.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapAFKeystoreWrapper.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapAFKeystoreWrapper.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapAFKeystoreWrapper.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapAFKeystoreWrapper.get(EmulatorApi.SDK)));
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (Process.myTid() >> 22) + 12, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
        map.put(((String) objArr[0]).intern(), values(str3, string, "GET", string, str, str2, strValueOf));
        AFc1nSDK<Map<String, String>> aFc1nSDKValues = values(new AFb1ySDK(string2, null, "GET", map, false), new AFc1eSDK());
        int i10 = AFLogger$LogLevel + 5;
        afDebugLog = i10 % 128;
        int i11 = i10 % 2;
        return aFc1nSDKValues;
    }

    @NonNull
    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        AFc1nSDK<String> aFc1nSDKValues = values(new AFb1ySDK(sb2.toString(), new JSONObject(map).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), false, false), new AFc1jSDK());
        int i10 = AFLogger$LogLevel + 109;
        afDebugLog = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 18 / 0;
        }
        return aFc1nSDKValues;
    }

    public final AFc1nSDK<String> values(AFe1eSDK aFe1eSDK) {
        AFc1nSDK<String> aFc1nSDKValues = values(new AFb1ySDK(aFe1eSDK.afInfoLog, aFe1eSDK.valueOf(), "POST", Collections.emptyMap(), true), new AFc1jSDK());
        int i10 = afDebugLog + 63;
        AFLogger$LogLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1nSDKValues;
        }
        throw null;
    }

    public final AFc1nSDK<String> values(@NonNull String str) {
        AFb1ySDK aFb1ySDK = new AFb1ySDK(str, null, "GET", Collections.emptyMap(), false);
        aFb1ySDK.afDebugLog = 10000;
        aFb1ySDK.AFKeystoreWrapper = false;
        AFc1nSDK<String> aFc1nSDKValues = values(aFb1ySDK, new AFc1jSDK());
        int i10 = afDebugLog + 119;
        AFLogger$LogLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1nSDKValues;
        }
        throw null;
    }

    private boolean valueOf() {
        int i10 = AFLogger$LogLevel + 21;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0 ? this.afErrorLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : this.afErrorLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            return false;
        }
        int i11 = afDebugLog + 97;
        AFLogger$LogLevel = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static void valueOf(char c10, int i10, int i11, Object[] objArr) {
        String str;
        synchronized (AFg1iSDK.valueOf) {
            try {
                char[] cArr = new char[i10];
                AFg1iSDK.values = 0;
                while (true) {
                    int i12 = AFg1iSDK.values;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((((long) afInfoLog[i11 + i12]) ^ (((long) i12) * afRDLog)) ^ ((long) c10));
                        AFg1iSDK.values = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    private <T> AFc1nSDK<T> values(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK) {
        int i10 = AFLogger$LogLevel + 29;
        afDebugLog = i10 % 128;
        int i11 = i10 % 2;
        AFc1nSDK<T> aFc1nSDKAFKeystoreWrapper = AFKeystoreWrapper(aFb1ySDK, aFc1fSDK, valueOf());
        int i12 = AFLogger$LogLevel + 107;
        afDebugLog = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 22 / 0;
        }
        return aFc1nSDKAFKeystoreWrapper;
    }

    @VisibleForTesting
    private Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        map.put("build_number", "6.12.1");
        map.put("counter", Integer.valueOf(this.AFInAppEventParameterName.AFInAppEventType.AFInAppEventType("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        valueOf((char) (55561 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, (ViewConfiguration.getTouchSlop() >> 8) + 12, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(EmulatorApi.SDK, Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventParameterName.values.AFInAppEventParameterName;
        map.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context, context.getPackageName()));
        map.put("app_id", this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        map.put("platformextension", new AFb1xSDK().values());
        int i10 = afDebugLog + 103;
        AFLogger$LogLevel = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    private static String values(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strValues = AFb1zSDK.values((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String strAFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(strValues, sb2.toString());
        int i10 = AFLogger$LogLevel + 123;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0) {
            return strAFKeystoreWrapper;
        }
        throw null;
    }

    public final AFc1nSDK<Map<String, Object>> AFInAppEventType(String str, String str2) {
        String packageName = this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName();
        AFb1cSDK aFb1cSDK = this.AFInAppEventParameterName;
        AFc1nSDK<Map<String, Object>> aFc1nSDKValues = values(AFc1oSDK.AFKeystoreWrapper(packageName, AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType), str, str2), new AFc1iSDK());
        int i10 = AFLogger$LogLevel + 117;
        afDebugLog = i10 % 128;
        int i11 = i10 % 2;
        return aFc1nSDKValues;
    }

    private <T> AFc1nSDK<T> AFKeystoreWrapper(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK, boolean z10) {
        aFb1ySDK.valueOf = z10;
        AFc1pSDK aFc1pSDK = this.AFKeystoreWrapper;
        AFc1nSDK<T> aFc1nSDK = new AFc1nSDK<>(aFb1ySDK, aFc1pSDK.valueOf, aFc1pSDK.values, aFc1fSDK);
        int i10 = afDebugLog + 27;
        AFLogger$LogLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1nSDK;
        }
        throw null;
    }
}
