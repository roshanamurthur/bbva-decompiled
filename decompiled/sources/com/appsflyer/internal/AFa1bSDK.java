package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1bSDK {
    static String AFInAppEventParameterName;

    @Nullable
    static Boolean valueOf;
    public final String[] AFInAppEventType;

    public AFa1bSDK() {
    }

    public AFa1bSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
            this.AFInAppEventType = new String[]{SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL};
        } else if (arrayList.isEmpty()) {
            this.AFInAppEventType = null;
        } else {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        }
    }

    private static boolean AFInAppEventType() {
        Boolean bool = valueOf;
        return bool == null || bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Nullable
    public static AFc1uSDK.AFa1wSDK AFKeystoreWrapper(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = AFInAppEventParameterName;
        boolean z10 = str != null;
        if (z10) {
            lat = null;
        } else {
            Boolean bool = valueOf;
            if ((bool == null || !bool.booleanValue()) && !(valueOf == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id;
                        } catch (Throwable unused) {
                            str = id;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFc1uSDK.AFa1wSDK aFa1wSDK = new AFc1uSDK.AFa1wSDK(str, lat);
        aFa1wSDK.values = Boolean.valueOf(z10);
        return aFa1wSDK;
    }

    @Nullable
    public static AFc1uSDK.AFa1wSDK valueOf(Context context, Map<String, Object> map) {
        int iIsGooglePlayServicesAvailable;
        boolean z10;
        Throwable th2;
        Boolean bool;
        String str = null;
        Boolean boolValueOf = null;
        if (!AFInAppEventType()) {
            return null;
        }
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder sb2 = new StringBuilder();
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th3);
            iIsGooglePlayServicesAvailable = -1;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null) {
                sb2.append("gpsAdInfo-null |");
                throw new IllegalStateException("GpsAdIndo is null");
            }
            String string = advertisingIdInfo.getId();
            try {
                boolValueOf = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                if (string != null) {
                    try {
                        if (string.length() == 0) {
                            sb2.append("emptyOrNull |");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = true;
                        Throwable th5 = th;
                        bool = boolValueOf;
                        str = string;
                        th2 = th5;
                        StringBuilder sb3 = new StringBuilder("Google Play Services is missing ");
                        sb3.append(th2.getMessage());
                        AFLogger.afErrorLog(sb3.toString(), th2);
                        sb2.append(th2.getClass().getSimpleName());
                        sb2.append(" |");
                        AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                            try {
                                AFa1jSDK.AFa1wSDK aFa1wSDKAFInAppEventType = AFa1jSDK.AFInAppEventType(context);
                                String str2 = aFa1wSDKAFInAppEventType.AFInAppEventParameterName;
                                boolValueOf = Boolean.valueOf(aFa1wSDKAFInAppEventType.AFKeystoreWrapper());
                                if (str2 == null || str2.length() == 0) {
                                    sb2.append("emptyOrNull (bypass) |");
                                }
                                string = str2;
                            } catch (Throwable th6) {
                                AFLogger.afErrorLog(th6.getMessage(), th6, true, false, false);
                                sb2.append(th6.getClass().getSimpleName());
                                sb2.append(" |");
                                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                Boolean boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                if (th6.getLocalizedMessage() != null) {
                                    AFLogger.afInfoLog(th6.getLocalizedMessage());
                                } else {
                                    AFLogger.afInfoLog(th6.toString());
                                }
                                boolValueOf = boolValueOf2;
                            }
                        } else {
                            string = str;
                            boolValueOf = bool;
                        }
                    }
                } else {
                    sb2.append("emptyOrNull |");
                }
                z10 = true;
            } catch (Throwable th7) {
                th = th7;
                z10 = false;
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                boolValueOf = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                sb2.append("context = android.app.ReceiverRestrictedContext |");
            }
            if (sb2.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(iIsGooglePlayServicesAvailable);
                sb4.append(": ");
                sb4.append((Object) sb2);
                map.put("gaidError", sb4.toString());
            }
            if (string != null && boolValueOf != null) {
                map.put("advertiserId", string);
                map.put("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
                AppsFlyerProperties.getInstance().set("advertiserId", string);
                AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
                map.put("isGaidWithGps", String.valueOf(z10));
            }
            return new AFc1uSDK.AFa1wSDK(string, boolValueOf);
        } catch (Throwable th8) {
            z10 = false;
            th2 = th8;
            bool = null;
        }
    }

    @Nullable
    public static AFc1uSDK.AFa1wSDK values(ContentResolver contentResolver) {
        String string;
        if (!AFInAppEventType() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i10 == 0) {
            return new AFc1uSDK.AFa1wSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i10 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
            string = "";
        }
        return new AFc1uSDK.AFa1wSDK(string, Boolean.TRUE);
    }
}
