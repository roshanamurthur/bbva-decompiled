package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PackageManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0006"}, d2 = {"getProviderMetadata", "", "Landroid/content/pm/PackageManager;", UAFAppIntentExtras.IEN_COMPONENT_NAME, "Landroid/content/ComponentName;", "tagName", "shared-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PackageManagerKt {
    @Nullable
    public static final String getProviderMetadata(@NotNull PackageManager packageManager, @NotNull ComponentName componentName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            ProviderInfo providerInfo = packageManager.getProviderInfo(componentName, 128);
            Intrinsics.checkNotNullExpressionValue(providerInfo, "getProviderInfo(...)");
            Bundle bundle = providerInfo.metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
