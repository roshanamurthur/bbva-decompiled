package com.bbva.ethermobilesdk.devicechecker.util;

import android.content.pm.PackageInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherPackageInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR%\u0010\t\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/util/EtherPackageInfo;", "", "", "", "kotlin.jvm.PlatformType", "a", "Ljava/util/List;", "getRequestedPermissions", "()Ljava/util/List;", "requestedPermissions", "Landroid/content/pm/PackageInfo;", "packageInfo", "<init>", "(Landroid/content/pm/PackageInfo;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class EtherPackageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> requestedPermissions;

    public EtherPackageInfo(@NotNull PackageInfo packageInfo) {
        List<String> list;
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        String[] strArr = packageInfo.requestedPermissions;
        this.requestedPermissions = (strArr == null || (list = ArraysKt___ArraysKt.toList(strArr)) == null) ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final List<String> getRequestedPermissions() {
        return this.requestedPermissions;
    }
}
