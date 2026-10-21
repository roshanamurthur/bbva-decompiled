package com.bbva.notifications.extensions;

import android.net.Uri;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkModelExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toUri", "Landroid/net/Uri;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "scheme", "", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeepLinkModelExtensionKt {
    @NotNull
    public static final Uri toUri(@NotNull DeepLinkModel deepLinkModel, @NotNull String scheme) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Uri.Builder builderScheme = new Uri.Builder().scheme(scheme);
        String key = deepLinkModel.getKey();
        if (key == null) {
            key = "deeplink";
        }
        Uri uriBuild = builderScheme.authority(key + "=" + deepLinkModel.getAction()).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }
}
