package com.bbva.ethermobilesdk.geolocation.utils;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingGooglePlayServicesProvider;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\"\u001a\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\t\"\u0014\u0010\u0012\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\t\"\u0014\u0010\u0013\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\t\"\u001a\u0010\u0016\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\f\"\u0014\u0010\u0017\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\t\"\u0014\u0010\u0018\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\t\"\u0014\u0010\u0019\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\t\"\u0014\u0010\u001a\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"", "a", "Z", "isEqualOrGreaterThanS", "()Z", "b", "isEqualOrGreaterThanR", "", "DETECTED_ACTIVITY_EXTRA_ID", "Ljava/lang/String;", "c", "getBROADCAST_INTENT_ACTION", "()Ljava/lang/String;", "BROADCAST_INTENT_ACTION", "", "RESULT_CODE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "GEOFENCES_EXTRA_ID", "TRANSITION_EXTRA_ID", "LOCATION_EXTRA_ID", "d", "getGEOFENCE_BROADCAST_INTENT_ACTION", "GEOFENCE_BROADCAST_INTENT_ACTION", "JOB_SERVICE_ACTION", ConstantsKt.TYPE, "ACTIVITY_TYPE", "GEOFENCING_TYPE", "geolocation_release"}, k = 2, mv = {2, 0, 0})
public final class ConstantsKt {

    @NotNull
    public static final String ACTIVITY_TYPE = "ACTIVITY";

    @NotNull
    public static final String DETECTED_ACTIVITY_EXTRA_ID = "activity";

    @NotNull
    public static final String GEOFENCES_EXTRA_ID = "geofences";

    @NotNull
    public static final String GEOFENCING_TYPE = "GEOFENCE";

    @NotNull
    public static final String JOB_SERVICE_ACTION = "JobServiceReceiverAction";

    @NotNull
    public static final String LOCATION_EXTRA_ID = "location";
    public static final int RESULT_CODE = 10003;

    @NotNull
    public static final String TRANSITION_EXTRA_ID = "transition";

    @NotNull
    public static final String TYPE = "TYPE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 31)
    public static final boolean f29868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 30)
    public static final boolean f29869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f29870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f29871d;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f29868a = i10 >= 31;
        f29869b = i10 >= 30;
        f29870c = u.f(ActivityGooglePlayServicesProvider.class.getCanonicalName(), ".DETECTED_ACTIVITY");
        f29871d = u.f(GeofencingGooglePlayServicesProvider.class.getCanonicalName(), ".GEOFENCE_TRANSITION");
    }

    @NotNull
    public static final String getBROADCAST_INTENT_ACTION() {
        return f29870c;
    }

    @NotNull
    public static final String getGEOFENCE_BROADCAST_INTENT_ACTION() {
        return f29871d;
    }

    public static final boolean isEqualOrGreaterThanR() {
        return f29869b;
    }

    public static final boolean isEqualOrGreaterThanS() {
        return f29868a;
    }
}
