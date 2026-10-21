package com.huawei.hms.feature.dynamicinstall;

import android.content.Context;
import com.huawei.hms.feature.install.FeatureInstallManagerFactory;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50235a = "FeatureCompat";

    private static boolean a(Context context) {
        String str = f50235a;
        Logger.i(str, "enter install channel.");
        String appFrom = FeatureInstallManagerFactory.getAppFrom(context);
        Logger.i(str, "app channel: " + appFrom);
        if (com.huawei.hms.feature.model.a.f50426b.equals(appFrom) || com.huawei.hms.feature.model.a.f50427c.equals(appFrom)) {
            return i.c(context);
        }
        Logger.w(str, "other channel:" + appFrom);
        return i.c(context);
    }

    public static boolean install(Context context) {
        Logger.i(f50235a, "FeatureCompat install");
        return a(context);
    }
}
