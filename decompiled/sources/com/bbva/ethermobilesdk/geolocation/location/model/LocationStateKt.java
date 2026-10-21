package com.bbva.ethermobilesdk.geolocation.location.model;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocationState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getLocationState", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationState;", "context", "Landroid/content/Context;", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocationStateKt {
    @NotNull
    public static final LocationState getLocationState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocationState locationState = LocationState.INSTANCE;
        if (!locationState.isInitialized$geolocation_release()) {
            locationState.initialize$geolocation_release(context);
        }
        return locationState;
    }
}
