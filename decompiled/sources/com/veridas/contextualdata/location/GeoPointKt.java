package com.veridas.contextualdata.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeoPoint.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToGeoPoint", "Lcom/veridas/contextualdata/location/GeoPoint;", "Landroid/location/Location;", "common-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GeoPointKt {
    @NotNull
    public static final GeoPoint mapToGeoPoint(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new GeoPoint(location.getLatitude(), location.getLongitude());
    }
}
