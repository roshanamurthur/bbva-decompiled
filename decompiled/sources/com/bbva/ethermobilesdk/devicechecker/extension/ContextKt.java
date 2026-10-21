package com.bbva.ethermobilesdk.devicechecker.extension;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.devicechecker.util.EtherPackageInfo;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004*\u00020\u0002H\u0000\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0001\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\u001a\u0010\u0010\u001a\u00020\r*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0000\u001a0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\u00020\u00022\u001c\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0014j\b\u0012\u0004\u0012\u00020\u000b`\u00150\u0004H\u0000\u001a\u001a\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0004*\u00020\u0002H\u0000\u001a\u0016\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¨\u0006\u001d"}, d2 = {"activityManager", "Landroid/app/ActivityManager;", "Landroid/content/Context;", "appPid", "", "", "getInstalledApplications", "Landroid/content/pm/ApplicationInfo;", "historicalProcesses", "Landroid/app/ApplicationExitInfo;", "packageName", "", "isPackageInstalled", "", "isPackageInstalledBase64", "packageNameBase64", "isPackageInstalledStartWith", "packageNames", "permissionsByApp", "permissionFilter", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "runningAppProcesses", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "kotlin.jvm.PlatformType", "unbindService", "", "serviceConnection", "Landroid/content/ServiceConnection;", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/devicechecker/extension/ContextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1747#2,3:64\n1549#2:68\n1620#2,3:69\n1549#2:72\n1620#2,2:73\n1603#2,9:75\n1855#2:84\n1856#2:86\n1612#2:87\n1622#2:88\n819#2:89\n847#2,2:90\n1#3:67\n1#3:85\n*S KotlinDebug\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/devicechecker/extension/ContextKt\n*L\n26#1:64,3\n38#1:68\n38#1:69,3\n50#1:72\n50#1:73,2\n54#1:75,9\n54#1:84\n54#1:86\n54#1:87\n50#1:88\n57#1:89\n57#1:90,2\n54#1:85\n*E\n"})
public final class ContextKt {
    @NotNull
    public static final ActivityManager activityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return (ActivityManager) systemService;
    }

    @NotNull
    public static final List<Integer> appPid(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        List<ActivityManager.RunningAppProcessInfo> listRunningAppProcesses = runningAppProcesses(context);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listRunningAppProcesses, 10));
        Iterator<T> it = listRunningAppProcesses.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ActivityManager.RunningAppProcessInfo) it.next()).pid));
        }
        return arrayList;
    }

    @NotNull
    public static final List<ApplicationInfo> getInstalledApplications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
        return PackageManagerKt.getInstalledApplicationsCompat$default(packageManager, 0, 1, null);
    }

    @RequiresApi(30)
    @NotNull
    public static final List<ApplicationExitInfo> historicalProcesses(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager(context).getHistoricalProcessExitReasons(packageName, 0, 0);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "activityManager().getHis…easons(packageName, 0, 0)");
        return historicalProcessExitReasons;
    }

    public static final boolean isPackageInstalled(@NotNull Context context, @NotNull String packageName) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(PackageManagerKt.getPackageInfoCompat$default(packageManager, packageName, 0, 2, null).firstInstallTime > 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    public static final boolean isPackageInstalledBase64(@NotNull Context context, @NotNull String packageNameBase64) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageNameBase64, "packageNameBase64");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(isPackageInstalled(context, new String(com.bbva.ethermobilesdk.devicechecker.common.extension.StringKt.base64ToByteArray(packageNameBase64), Charsets.UTF_8))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    public static final boolean isPackageInstalledStartWith(@NotNull Context context, @NotNull List<String> packageNames) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
        List<PackageInfo> installedPackagesCompat$default = PackageManagerKt.getInstalledPackagesCompat$default(packageManager, 0, 1, null);
        if ((installedPackagesCompat$default instanceof Collection) && installedPackagesCompat$default.isEmpty()) {
            return false;
        }
        for (PackageInfo packageInfo : installedPackagesCompat$default) {
            List<String> list = packageNames;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    String str2 = packageInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "devicePackage.packageName");
                    if (l.startsWith$default(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final List<String> permissionsByApp(@NotNull Context context, @NotNull List<? extends HashSet<String>> permissionFilter) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissionFilter, "permissionFilter");
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageManager permissionsByApp$lambda$10$lambda$9 = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(permissionsByApp$lambda$10$lambda$9, "permissionsByApp$lambda$10$lambda$9");
            List<ApplicationInfo> installedApplicationsCompat$default = PackageManagerKt.getInstalledApplicationsCompat$default(permissionsByApp$lambda$10$lambda$9, 0, 1, null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(installedApplicationsCompat$default, 10));
            for (ApplicationInfo applicationInfo : installedApplicationsCompat$default) {
                String str = applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "ai.packageName");
                List<String> requestedPermissions = new EtherPackageInfo(PackageManagerKt.getPackageInfoCompat(permissionsByApp$lambda$10$lambda$9, str, 4096)).getRequestedPermissions();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = permissionFilter.iterator();
                while (it.hasNext()) {
                    String str2 = requestedPermissions.containsAll((HashSet) it.next()) ? applicationInfo.packageName : null;
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                String str3 = (String) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList2);
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(str3);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() != 0) {
                    arrayList3.add(obj);
                }
            }
            objM5535constructorimpl = Result.m5535constructorimpl(arrayList3);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = listEmptyList;
        }
        return (List) objM5535constructorimpl;
    }

    @NotNull
    public static final List<ActivityManager.RunningAppProcessInfo> runningAppProcesses(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager(context).getRunningAppProcesses();
        return runningAppProcesses == null ? CollectionsKt__CollectionsKt.emptyList() : runningAppProcesses;
    }

    public static final void unbindService(@NotNull Context context, @Nullable ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (serviceConnection != null) {
            context.unbindService(serviceConnection);
        }
    }
}
