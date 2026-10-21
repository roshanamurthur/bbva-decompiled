package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.content.Context;
import android.content.pm.ProviderInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProviderInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"hasGroup", "", "Landroid/content/pm/ProviderInfo;", "group", "", "isOwnedBy", "context", "Landroid/content/Context;", "shared-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProviderInfoKt {
    public static final boolean hasGroup(@NotNull ProviderInfo providerInfo, @NotNull String group) {
        Intrinsics.checkNotNullParameter(providerInfo, "<this>");
        Intrinsics.checkNotNullParameter(group, "group");
        String name = providerInfo.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return l.endsWith(name, group + ".BusContentProvider", false);
    }

    public static final boolean isOwnedBy(@NotNull ProviderInfo providerInfo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(providerInfo, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String authority = providerInfo.authority;
        Intrinsics.checkNotNullExpressionValue(authority, "authority");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return l.startsWith$default(authority, packageName, false, 2, null);
    }
}
