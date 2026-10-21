package com.bbva.ethermobilesdk.geolocation.utils.extension;

import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"gmsActivityTypeToName", "", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityResponse;", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityResponseKt {
    @NotNull
    public static final String gmsActivityTypeToName(@NotNull ActivityResponse activityResponse) {
        Intrinsics.checkNotNullParameter(activityResponse, "<this>");
        int activityID = activityResponse.getActivityID();
        if (activityID == 0) {
            return "in_vehicle";
        }
        if (activityID == 1) {
            return "on_bicycle";
        }
        if (activityID == 2) {
            return "on_foot";
        }
        if (activityID != 3) {
            return activityID != 5 ? "unknown" : "tilting";
        }
        return "still";
    }
}
