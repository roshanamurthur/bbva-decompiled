package com.bbva.ethermobilesdk.geolocation.utils.extension;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Int.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"gmsGeofenceTransitionTypeToName", "", "", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntKt {
    @NotNull
    public static final String gmsGeofenceTransitionTypeToName(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "dwell" : HearingDisabilitiesConstants.EXIT_VIDEO_CALL;
        }
        return "enter";
    }
}
