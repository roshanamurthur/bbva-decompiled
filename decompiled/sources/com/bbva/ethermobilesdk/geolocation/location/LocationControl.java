package com.bbva.ethermobilesdk.geolocation.location;

import android.content.Context;
import android.location.Location;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationMode;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationState;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationStateKt;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/LocationControl;", "", "Landroid/location/Location;", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationMode;", "mode", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationState;", "getState", "()Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationState;", "state", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "provider", "<init>", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LocationProvider f29826b;

    public LocationControl(@NotNull Context context, @NotNull LocationProvider provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29825a = context;
        this.f29826b = provider;
    }

    public static /* synthetic */ Flow start$default(LocationControl locationControl, LocationMode locationMode, LocationParams locationParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locationMode = LocationMode.Continuous;
        }
        if ((i10 & 2) != 0) {
            locationParams = LocationParams.INSTANCE.getBEST_EFFORT();
        }
        return locationControl.start(locationMode, locationParams);
    }

    @Nullable
    public final Object getLastLocation(@NotNull Continuation<? super Location> continuation) {
        return this.f29826b.getLastLocation(continuation);
    }

    @NotNull
    public final LocationState getState() {
        return LocationStateKt.getLocationState(this.f29825a);
    }

    @NotNull
    public final Flow<Result<Location>> start(@NotNull LocationMode mode, @NotNull LocationParams params) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f29826b.start(params, mode == LocationMode.OneFix);
    }

    public final void stop() {
        this.f29826b.stop();
    }
}
