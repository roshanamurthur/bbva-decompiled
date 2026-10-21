package com.bbva.ethermobilesdk.geolocation.location.model;

import android.content.Context;
import android.location.LocationManager;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocationState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0010\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationState;", "", "Landroid/content/Context;", "context", "", "initialize$geolocation_release", "(Landroid/content/Context;)V", "initialize", "", "isAnyProviderAvailable", "a", "Z", "isInitialized$geolocation_release", "()Z", "setInitialized$geolocation_release", "(Z)V", "isInitialized", "<init>", "()V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationState {

    @NotNull
    public static final LocationState INSTANCE = new LocationState();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static boolean isInitialized;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LocationManager f29842b;

    public final void initialize$geolocation_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        f29842b = (LocationManager) systemService;
        isInitialized = true;
    }

    public final boolean isAnyProviderAvailable() {
        LocationManager locationManager = f29842b;
        LocationManager locationManager2 = null;
        if (locationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationManager");
            locationManager = null;
        }
        if (!locationManager.isProviderEnabled("gps")) {
            LocationManager locationManager3 = f29842b;
            if (locationManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationManager");
            } else {
                locationManager2 = locationManager3;
            }
            if (!locationManager2.isProviderEnabled(DeepLinkListenerAdapter.Constants.ERROR_NETWORK)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInitialized$geolocation_release() {
        return isInitialized;
    }

    public final void setInitialized$geolocation_release(boolean z10) {
        isInitialized = z10;
    }
}
