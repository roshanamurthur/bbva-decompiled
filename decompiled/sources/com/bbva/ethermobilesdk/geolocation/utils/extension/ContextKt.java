package com.bbva.ethermobilesdk.geolocation.utils.extension;

import android.content.Context;
import android.location.LocationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"isLocationProviderEnabled", "", "Landroid/content/Context;", "locationProvider", "", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextKt {
    public static final boolean isLocationProviderEnabled(@NotNull Context context, @NotNull String locationProvider) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            return locationManager.isProviderEnabled(locationProvider);
        }
        return false;
    }
}
