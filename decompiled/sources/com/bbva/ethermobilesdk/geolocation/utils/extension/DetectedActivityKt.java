package com.bbva.ethermobilesdk.geolocation.utils.extension;

import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityResponse;
import com.google.android.gms.location.DetectedActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DetectedActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asActivityResponse", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityResponse;", "Lcom/google/android/gms/location/DetectedActivity;", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DetectedActivityKt {
    @NotNull
    public static final ActivityResponse asActivityResponse(@NotNull DetectedActivity detectedActivity) {
        Intrinsics.checkNotNullParameter(detectedActivity, "<this>");
        return new ActivityResponse(detectedActivity.getType(), detectedActivity.getConfidence());
    }
}
