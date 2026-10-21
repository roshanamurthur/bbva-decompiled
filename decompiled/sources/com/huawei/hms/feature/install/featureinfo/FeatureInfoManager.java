package com.huawei.hms.feature.install.featureinfo;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50400a = "FeatureInfoManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f50401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50402c;

    public FeatureInfoManager(Context context, String str) {
        this.f50401b = context;
        this.f50402c = str;
    }

    private final Bundle a() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.f50401b.getPackageManager().getApplicationInfo(this.f50402c, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final Set<String> b() {
        HashSet hashSet = new HashSet();
        Bundle bundleA = a();
        if (bundleA != null) {
            String string = bundleA.getString("com.android.dynamic.apk.fused.modules");
            if (TextUtils.isEmpty(string)) {
                Logger.d(f50400a, "There are no fused modules in App.");
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
            }
        }
        String[] strArrC = c();
        if (strArrC == null || strArrC.length == 0) {
            Logger.d(f50400a, "No splits are installed ");
        } else {
            Collections.addAll(hashSet, strArrC);
        }
        if (a.a() != null) {
            hashSet.addAll(a.a().a());
        }
        return hashSet;
    }

    @TargetApi(21)
    private final String[] c() {
        try {
            PackageInfo packageInfo = this.f50401b.getPackageManager().getPackageInfo(this.f50402c, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.splitNames;
        } catch (Exception unused) {
            Logger.w(f50400a, "no split apk in PackageManager");
            return null;
        }
    }

    private final b d() {
        String str;
        String str2;
        Bundle bundleA = a();
        if (bundleA == null) {
            return null;
        }
        int i10 = bundleA.getInt("com.android.vending.splits");
        if (i10 == 0) {
            str = f50400a;
            str2 = "Vending.splits not found in AndroidManifest.";
        } else {
            try {
                b bVarB = new d(this.f50401b.getResources().getXml(i10)).b();
                if (bVarB == null) {
                    Logger.d(f50400a, "Could not parse languages metadata.");
                }
                return bVarB;
            } catch (Resources.NotFoundException unused) {
                str = f50400a;
                str2 = "languages metadata does not exist in Resource";
            }
        }
        Logger.d(str, str2);
        return null;
    }

    public static String getFeatureNameFromName(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean isBaseConfig(String str) {
        return str.startsWith("config.");
    }

    public static boolean isConfigSplitApk(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public final Set<String> getFeatureMasterSplitsNames() {
        HashSet hashSet = new HashSet();
        for (String str : b()) {
            if (!isConfigSplitApk(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set<String> getInstalledLanguagesKey() {
        b bVarD = d();
        if (bVarD == null) {
            return null;
        }
        Set<String> setB = b();
        setB.add("");
        Set<String> featureMasterSplitsNames = getFeatureMasterSplitsNames();
        featureMasterSplitsNames.add("");
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Set<String>> entry : bVarD.a(featureMasterSplitsNames).entrySet()) {
            if (setB.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }
}
