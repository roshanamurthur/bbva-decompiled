package com.bbva.ethermobilesdk.geolocation.utils.extension;

import android.location.LocationManager;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationAccuracy;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.google.android.gms.location.LocationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"toLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "toProvider", "", "getBestProvider", "manager", "Landroid/location/LocationManager;", "params", "getFallbackProvider", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocationParamsKt {

    /* JADX INFO: compiled from: LocationParams.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationAccuracy.values().length];
            try {
                iArr[LocationAccuracy.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationAccuracy.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final String getBestProvider(@NotNull LocationManager manager, @NotNull LocationParams params) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(params, "params");
        String provider = toProvider(params);
        return manager.isProviderEnabled(provider) ? provider : getFallbackProvider(manager);
    }

    @Nullable
    public static final String getFallbackProvider(@NotNull LocationManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.isProviderEnabled("gps")) {
            return "gps";
        }
        if (manager.isProviderEnabled(DeepLinkListenerAdapter.Constants.ERROR_NETWORK)) {
            return DeepLinkListenerAdapter.Constants.ERROR_NETWORK;
        }
        if (manager.isProviderEnabled("passive")) {
            return "passive";
        }
        return null;
    }

    @NotNull
    public static final LocationRequest toLocationRequest(@NotNull LocationParams locationParams) {
        Intrinsics.checkNotNullParameter(locationParams, "<this>");
        float distance = locationParams.getDistance();
        LocationRequest.Builder builder = new LocationRequest.Builder(100, locationParams.getInterval());
        builder.setMinUpdateDistanceMeters(distance);
        builder.setGranularity(0);
        builder.setWaitForAccurateLocation(true);
        LocationRequest locationRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
        return locationRequestBuild;
    }

    @NotNull
    public static final String toProvider(@NotNull LocationParams locationParams) {
        Intrinsics.checkNotNullParameter(locationParams, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[locationParams.getAccuracy().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "passive" : DeepLinkListenerAdapter.Constants.ERROR_NETWORK;
        }
        return "gps";
    }
}
