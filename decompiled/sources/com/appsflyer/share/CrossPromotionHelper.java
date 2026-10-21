package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.internal.AFg1ySDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CrossPromotionHelper {
    private static String valueOf = "https://%simpression.%s";

    private static void AFInAppEventParameterName(@NonNull String str, @NonNull Context context, @Nullable AFg1ySDK aFg1ySDK) {
        AFa1dSDK aFa1dSDKValueOf = AFa1dSDK.valueOf();
        aFa1dSDKValueOf.AFInAppEventType(context);
        AFc1zSDK aFc1zSDKAFInAppEventParameterName = aFa1dSDKValueOf.AFInAppEventParameterName();
        AFd1oSDK aFd1oSDK = new AFd1oSDK(aFc1zSDKAFInAppEventParameterName, str, aFg1ySDK);
        AFd1tSDK level = aFc1zSDKAFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1oSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static void setUrl(Map<String, String> map) {
        byte b10;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (key.equals("app")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                AFg1xSDK.AFInAppEventType = value;
            } else if (b10 == 1) {
                valueOf = value;
            }
        }
    }

    @NonNull
    private static LinkGenerator valueOf(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.values = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorValueOf = valueOf(context, str, str2, map, String.format(AFg1xSDK.AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFInAppEventParameterName(linkGeneratorValueOf.generateLink(), context, new AFg1ySDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventParameterName(valueOf(context, str, str2, map, String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).generateLink(), context, null);
        }
    }
}
