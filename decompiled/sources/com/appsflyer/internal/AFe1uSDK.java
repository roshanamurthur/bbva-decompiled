package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.fasterxml.jackson.core.JsonPointer;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1uSDK implements AFe1tSDK {

    @NotNull
    private final Context AFInAppEventParameterName;

    @NotNull
    private final AFb1jSDK AFInAppEventType;

    @NotNull
    private final AFf1fSDK AFKeystoreWrapper;

    @NotNull
    private final AFe1lSDK AFLogger;

    @NotNull
    private final AFb1cSDK afDebugLog;

    @NotNull
    private final AFe1xSDK afErrorLog;

    @NotNull
    private final AFb1fSDK afInfoLog;

    @NotNull
    private final AFa1iSDK afRDLog;

    @NotNull
    private final AFb1xSDK getLevel;

    @NotNull
    private final AFf1mSDK valueOf;

    @NotNull
    private final AFa1gSDK values;

    public AFe1uSDK() {
    }

    public AFe1uSDK(Context context, AFf1mSDK aFf1mSDK, AFb1jSDK aFb1jSDK, AFf1fSDK aFf1fSDK, AFa1gSDK aFa1gSDK, AFe1lSDK aFe1lSDK, AFb1fSDK aFb1fSDK, AFb1cSDK aFb1cSDK, AFa1iSDK aFa1iSDK, AFe1xSDK aFe1xSDK, AFb1xSDK aFb1xSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFf1mSDK, "");
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFa1gSDK, "");
        Intrinsics.checkNotNullParameter(aFe1lSDK, "");
        Intrinsics.checkNotNullParameter(aFb1fSDK, "");
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFa1iSDK, "");
        Intrinsics.checkNotNullParameter(aFe1xSDK, "");
        Intrinsics.checkNotNullParameter(aFb1xSDK, "");
        this.AFInAppEventParameterName = context;
        this.valueOf = aFf1mSDK;
        this.AFInAppEventType = aFb1jSDK;
        this.AFKeystoreWrapper = aFf1fSDK;
        this.values = aFa1gSDK;
        this.AFLogger = aFe1lSDK;
        this.afInfoLog = aFb1fSDK;
        this.afDebugLog = aFb1cSDK;
        this.afRDLog = aFa1iSDK;
        this.afErrorLog = aFe1xSDK;
        this.getLevel = aFb1xSDK;
    }

    private boolean afRDLog() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventParameterName(boolean z10, Map<String, Object> map, int i10) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
        map2.put("cpu_abi2", AFInAppEventParameterName("ro.product.cpu.abi2"));
        map2.put("arch", AFInAppEventParameterName("os.arch"));
        map2.put("build_display_id", AFInAppEventParameterName("ro.build.display.id"));
        if (z10) {
            AFb1jSDK.AFa1xSDK aFa1xSDKAFInAppEventParameterName = this.AFInAppEventType.AFInAppEventParameterName(this.AFInAppEventParameterName);
            float f6 = aFa1xSDKAFInAppEventParameterName.AFKeystoreWrapper;
            String str = aFa1xSDKAFInAppEventParameterName.AFInAppEventType;
            map2.put("btl", String.valueOf(f6));
            if (str != null) {
                map2.put("btch", str);
            }
            if (i10 <= 2) {
                map2.putAll(this.AFKeystoreWrapper.AFKeystoreWrapper());
            }
        }
        map2.put("dim", this.values.AFInAppEventType(this.AFInAppEventParameterName));
        map.put("deviceData", map2);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long AFKeystoreWrapper() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean AFLogger() {
        return Boolean.parseBoolean(this.afInfoLog.valueOf("sentSuccessfully", (String) null));
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @Nullable
    public final String afDebugLog() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("preInstallName");
        if (string != null) {
            return string;
        }
        String strAFInAppEventType = null;
        if (this.afInfoLog.valueOf("preInstallName")) {
            string = this.afInfoLog.valueOf("preInstallName", (String) null);
        } else {
            if (afErrorLog()) {
                File fileAFInAppEventType = AFInAppEventType(AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
                if (AFKeystoreWrapper(fileAFInAppEventType)) {
                    fileAFInAppEventType = AFInAppEventType(this.afDebugLog.valueOf("AF_PRE_INSTALL_PATH"));
                }
                if (AFKeystoreWrapper(fileAFInAppEventType)) {
                    fileAFInAppEventType = AFInAppEventType("/data/local/tmp/pre_install.appsflyer");
                }
                if (AFKeystoreWrapper(fileAFInAppEventType)) {
                    fileAFInAppEventType = AFInAppEventType("/etc/pre_install.appsflyer");
                }
                if (!AFKeystoreWrapper(fileAFInAppEventType)) {
                    String packageName = this.AFInAppEventParameterName.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    strAFInAppEventType = AFInAppEventType(fileAFInAppEventType, packageName);
                }
                string = strAFInAppEventType == null ? this.afDebugLog.valueOf("AF_PRE_INSTALL_NAME") : strAFInAppEventType;
            }
            if (string != null) {
                this.afInfoLog.values("preInstallName", string);
            }
        }
        if (string != null) {
            appsFlyerProperties.set("preInstallName", string);
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean afErrorLog() {
        return !this.afInfoLog.valueOf("appsFlyerCount");
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean afInfoLog() {
        try {
            Object systemService = this.AFInAppEventParameterName.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "");
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            AFLogger.afErrorLog("Failed collecting ivc data", e5);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @Nullable
    public final String valueOf() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        return AFa1cSDK.AFInAppEventType(this.AFInAppEventParameterName.getApplicationContext().getPackageManager(), this.AFInAppEventParameterName.getApplicationContext().getPackageName());
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @NotNull
    public final String values() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((long) (availableBlocksLong / dPow));
        sb2.append(JsonPointer.SEPARATOR);
        sb2.append((long) (blockCountLong / dPow));
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map) {
        String str = "";
        Intrinsics.checkNotNullParameter(map, "");
        Object systemService = this.AFInAppEventParameterName.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            str = "p";
        } else if (rotation == 1) {
            str = "l";
        } else if (rotation == 2) {
            str = "pr";
        } else if (rotation == 3) {
            str = "lr";
        }
        map.put("sc_o", str);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void valueOf(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1iSDK.AFa1vSDK aFa1vSDKValueOf = this.afRDLog.valueOf(this.AFInAppEventParameterName);
        String str = aFa1vSDKValueOf.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str, "");
        map.put(DeepLinkListenerAdapter.Constants.ERROR_NETWORK, str);
        if (z10) {
            return;
        }
        String str2 = aFa1vSDKValueOf.values;
        if (str2 != null) {
            map.put("operator", str2);
        }
        String str3 = aFa1vSDKValueOf.AFInAppEventType;
        if (str3 != null) {
            map.put(ContextualDataConstants.CD_CARRIER, str3);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @Nullable
    public final String AFInAppEventType() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        return string == null ? this.afDebugLog.valueOf("AF_STORE") : string;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String strValueOf = this.afInfoLog.valueOf("prev_event_name", (String) null);
            if (strValueOf != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.afInfoLog.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", strValueOf);
                map.put("prev_event", jSONObject);
            }
            this.afInfoLog.values("prev_event_name", str);
            this.afInfoLog.AFInAppEventType("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e5) {
            AFLogger.afErrorLog("Error while processing previous event.", e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    @Override // com.appsflyer.internal.AFe1tSDK
    @SuppressLint({"HardwareIds"})
    public final void AFInAppEventType(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        String strAFInAppEventType = this.afErrorLog.AFInAppEventType(this.afInfoLog);
        if (strAFInAppEventType != null && strAFInAppEventType.length() != 0) {
            map.put("imei", strAFInAppEventType);
        }
        boolean z10 = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
        String strValueOf = this.afInfoLog.valueOf("androidIdCached", (String) null);
        if (z10 && (str == null || str.length() == 0)) {
            if (afRDLog()) {
                try {
                    str = Settings.Secure.getString(this.AFInAppEventParameterName.getContentResolver(), "android_id");
                    if (str == null) {
                        if (strValueOf != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(strValueOf));
                            str = strValueOf;
                        } else {
                            str = null;
                        }
                    }
                } catch (Exception e5) {
                    if (strValueOf != null) {
                        AFLogger.afDebugLog("use cached AndroidId: ".concat(strValueOf));
                    } else {
                        strValueOf = null;
                    }
                    AFLogger.afErrorLog(e5.getMessage(), e5);
                }
            } else {
                str = null;
            }
        } else if (str == null) {
            str = null;
        }
        if (str != null) {
            this.afInfoLog.values("androidIdCached", str);
            map.put("android_id", str);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFc1uSDK.AFa1wSDK aFa1wSDKAFKeystoreWrapper = AFa1bSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
        if (aFa1wSDKAFKeystoreWrapper != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = aFa1wSDKAFKeystoreWrapper.values;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = aFa1wSDKAFKeystoreWrapper.AFInAppEventParameterName;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = aFa1wSDKAFKeystoreWrapper.AFInAppEventType;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        String strValues = this.getLevel.values();
        Intrinsics.checkNotNullExpressionValue(strValues, "");
        map.put("platformextension", strValues);
        if (z10) {
            map.put("platform_extension_v2", this.valueOf.AFInAppEventParameterName());
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFe1lSDK aFe1lSDK = this.AFLogger;
        HashMap map2 = new HashMap(aFe1lSDK.AFInAppEventParameterName);
        aFe1lSDK.AFInAppEventParameterName.clear();
        this.AFLogger.AFKeystoreWrapper.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (!map2.isEmpty()) {
            Map<String, Object> mapAFInAppEventParameterName = AFa1dSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(mapAFInAppEventParameterName, "");
            mapAFInAppEventParameterName.put("gcd", map2);
        }
    }

    private static boolean AFKeystoreWrapper(File file) {
        return file == null || !file.exists();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @Nullable
    public final String AFInAppEventParameterName() {
        String str = null;
        if (this.afInfoLog.valueOf("INSTALL_STORE")) {
            return this.afInfoLog.valueOf("INSTALL_STORE", (String) null);
        }
        if (afErrorLog()) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = this.afDebugLog.valueOf("AF_STORE");
            }
            str = string;
        }
        this.afInfoLog.values("INSTALL_STORE", str);
        return str;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @Nullable
    public final String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        String str = "";
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String strValueOf = this.afInfoLog.valueOf("appsFlyerFirstInstall", (String) null);
        if (strValueOf == null) {
            if (afErrorLog()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            }
            this.afInfoLog.values("appsFlyerFirstInstall", str);
            strValueOf = str;
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(strValueOf)));
        return strValueOf;
    }

    @SuppressLint({"PrivateApi"})
    @VisibleForTesting
    @Nullable
    private static String AFInAppEventParameterName(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static File AFInAppEventType(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() > 0) {
                return new File(StringsKt__StringsKt.trim((CharSequence) str).toString());
            }
            return null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static String AFInAppEventType(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
                        sb2.append(file.getAbsolutePath());
                        AFLogger.afDebugLog(sb2.toString());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
            } catch (Throwable th5) {
                AFLogger.afErrorLog(th5.getMessage(), th5);
            }
        } catch (Throwable th6) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th7) {
                    AFLogger.afErrorLog(th7.getMessage(), th7);
                }
            }
            throw th6;
        }
        return null;
    }
}
