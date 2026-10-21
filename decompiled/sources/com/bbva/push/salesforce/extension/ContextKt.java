package com.bbva.push.salesforce.extension;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isHmsDevice", "", "Landroid/content/Context;", "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextKt {
    public static final boolean isHmsDevice(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) != 0 && Intrinsics.areEqual(Build.MANUFACTURER, "HUAWEI");
    }
}
