package com.huawei.hms.feature.install;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.feature.broadcast.ActionType;
import com.huawei.hms.feature.broadcast.BroadcastHandlerManager;
import com.huawei.hms.feature.remote.RemoteApkInstallerProxy;
import com.huawei.hms.feature.remote.RemoteFeatureManager;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.hms.feature.utils.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureInstallManagerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50385a = "FeatureInstallManagerFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, FeatureInstallManager> f50386b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f50387c = null;

    private static void a(Context context) {
        f50386b.put(com.huawei.hms.feature.model.a.f50426b, new b(context));
        f50386b.put(com.huawei.hms.feature.model.a.f50427c, new b(context));
    }

    private static FeatureInstallManager b(Context context) {
        String appFrom = getAppFrom(context);
        String str = f50385a;
        Logger.i(str, "use channel: " + appFrom);
        if (f50386b.containsKey(appFrom)) {
            return f50386b.get(appFrom);
        }
        Logger.w(str, "unknown app channel, please check your meta data.");
        return new b(context);
    }

    private static boolean c(Context context) {
        String appFrom = getAppFrom(context);
        Logger.i(f50385a, "The channel strategy is:" + appFrom);
        return TextUtils.equals(appFrom, com.huawei.hms.feature.model.a.f50426b) || TextUtils.equals(appFrom, com.huawei.hms.feature.model.a.f50427c);
    }

    public static FeatureInstallManager create(Context context) {
        boolean zIsRemoteVersionHigher;
        String str = f50385a;
        Logger.i(str, "create remoteMode false");
        a(context);
        if (!c(context)) {
            Logger.i(str, "Not default strategy, no need to check remote mode.");
            return b(context);
        }
        try {
            zIsRemoteVersionHigher = RemoteFeatureManager.getInstance(context).isRemoteVersionHigher(context);
            try {
                Logger.i(str, "exist higher remote version: " + zIsRemoteVersionHigher);
            } catch (Exception unused) {
                Logger.w(f50385a, "query remoteMode fail, use local mode ...");
            }
        } catch (Exception unused2) {
            zIsRemoteVersionHigher = false;
        }
        return zIsRemoteVersionHigher ? new RemoteApkInstallerProxy(context) : b(context);
    }

    public static String getAppFrom(Context context) {
        String str = f50387c;
        if (str != null) {
            return str;
        }
        for (String str2 : f50386b.keySet()) {
            if (!TextUtils.equals(str2, com.huawei.hms.feature.model.a.f50426b) && !TextUtils.equals(str2, com.huawei.hms.feature.model.a.f50427c)) {
                f50387c = str2;
            }
        }
        if (!TextUtils.isEmpty(f50387c)) {
            return f50387c;
        }
        Logger.i(f50385a, "No registered channel info by API, check the meta data.");
        String strA = f.a(context);
        f50387c = strA;
        return strA;
    }

    public static void registerChannelStrategy(String str, FeatureInstallManager featureInstallManager, ActionType actionType, String str2) {
        Logger.i(f50385a, "registerChannelStrategy");
        a(str, featureInstallManager);
        BroadcastHandlerManager.registerFilterStrategy(str, actionType, str2);
    }

    private static void a(String str, FeatureInstallManager featureInstallManager) {
        if (TextUtils.equals(str, com.huawei.hms.feature.model.a.f50426b) || TextUtils.equals(str, com.huawei.hms.feature.model.a.f50427c)) {
            Logger.w(f50385a, "invalid channel name.");
        } else {
            f50386b.put(str, featureInstallManager);
        }
    }
}
