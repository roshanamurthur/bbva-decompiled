package com.bbva.ethermobilesdk.tokencompat.util;

import android.content.pm.PackageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherPackageInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/util/EtherPackageInfo;", "", "", "a", "J", "getFirstInstallTime", "()J", "firstInstallTime", "Landroid/content/pm/PackageInfo;", "packageInfo", "<init>", "(Landroid/content/pm/PackageInfo;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class EtherPackageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long firstInstallTime;

    public EtherPackageInfo(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        this.firstInstallTime = packageInfo.firstInstallTime;
    }

    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }
}
