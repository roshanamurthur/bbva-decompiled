package com.bbva.ethermobilesdk.devicechecker.extension;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bbva.ethermobilesdk.devicechecker.common.util.SystemBuild;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PackageManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"getInstalledApplicationsCompat", "", "Landroid/content/pm/ApplicationInfo;", "Landroid/content/pm/PackageManager;", "flags", "", "getInstalledPackagesCompat", "Landroid/content/pm/PackageInfo;", "getPackageInfoCompat", "packageName", "", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PackageManagerKt {
    @NotNull
    public static final List<ApplicationInfo> getInstalledApplicationsCompat(@NotNull PackageManager packageManager, int i10) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        SystemBuild systemBuild = SystemBuild.INSTANCE;
        if (systemBuild.getVersion() >= systemBuild.getVersionCodesAndroidT()) {
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(i10));
            Intrinsics.checkNotNullExpressionValue(installedApplications, "{\n        getInstalledAp…of(flags.toLong()))\n    }");
            return installedApplications;
        }
        List<ApplicationInfo> installedApplications2 = packageManager.getInstalledApplications(128);
        Intrinsics.checkNotNullExpressionValue(installedApplications2, "{\n        getInstalledAp…ager.GET_META_DATA)\n    }");
        return installedApplications2;
    }

    public static /* synthetic */ List getInstalledApplicationsCompat$default(PackageManager packageManager, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return getInstalledApplicationsCompat(packageManager, i10);
    }

    @NotNull
    public static final List<PackageInfo> getInstalledPackagesCompat(@NotNull PackageManager packageManager, int i10) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        SystemBuild systemBuild = SystemBuild.INSTANCE;
        if (systemBuild.getVersion() >= systemBuild.getVersionCodesAndroidT()) {
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(i10));
            Intrinsics.checkNotNullExpressionValue(installedPackages, "{\n        getInstalledPa…of(flags.toLong()))\n    }");
            return installedPackages;
        }
        List<PackageInfo> installedPackages2 = packageManager.getInstalledPackages(128);
        Intrinsics.checkNotNullExpressionValue(installedPackages2, "{\n        getInstalledPa…ager.GET_META_DATA)\n    }");
        return installedPackages2;
    }

    public static /* synthetic */ List getInstalledPackagesCompat$default(PackageManager packageManager, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return getInstalledPackagesCompat(packageManager, i10);
    }

    @NotNull
    public static final PackageInfo getPackageInfoCompat(@NotNull PackageManager packageManager, @NotNull String packageName, int i10) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        SystemBuild systemBuild = SystemBuild.INSTANCE;
        if (systemBuild.getVersion() >= systemBuild.getVersionCodesAndroidT()) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i10));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n        getPackageInfo…of(flags.toLong()))\n    }");
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i10);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "{\n        getPackageInfo(packageName, flags)\n    }");
        return packageInfo2;
    }

    public static /* synthetic */ PackageInfo getPackageInfoCompat$default(PackageManager packageManager, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return getPackageInfoCompat(packageManager, str, i10);
    }
}
