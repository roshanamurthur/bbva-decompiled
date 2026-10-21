package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1vSDK {

    @NotNull
    private final Map<String, Object> AFInAppEventParameterName;

    @NotNull
    private final String AFInAppEventType;

    @Nullable
    private final PackageManager valueOf;

    public AFb1vSDK() {
    }

    public AFb1vSDK(AFb1bSDK aFb1bSDK, AFb1cSDK aFb1cSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        this.AFInAppEventParameterName = new LinkedHashMap();
        Context context = aFb1bSDK.AFInAppEventParameterName;
        this.valueOf = context != null ? context.getPackageManager() : null;
        String packageName = aFb1cSDK.values.AFInAppEventParameterName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFInAppEventType = packageName;
    }

    public static boolean AFInAppEventParameterName(@androidx.annotation.Nullable String str) {
        return str == null || str.length() == 0;
    }

    public static boolean valueOf(@androidx.annotation.Nullable String str) {
        return str == null || str.trim().length() == 0;
    }

    @NotNull
    public final Map<String, Object> AFInAppEventType() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.AFInAppEventParameterName.isEmpty()) {
            try {
                PackageManager packageManager = this.valueOf;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFInAppEventType)) != null) {
                    this.AFInAppEventParameterName.put("installer_package", installerPackageName);
                }
            } catch (Exception e5) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e5);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventParameterName;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFInAppEventType;
                PackageManager packageManager2 = this.valueOf;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.AFInAppEventParameterName;
    }
}
