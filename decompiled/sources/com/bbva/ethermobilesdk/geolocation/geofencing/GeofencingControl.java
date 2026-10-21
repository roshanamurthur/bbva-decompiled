package com.bbva.ethermobilesdk.geolocation.geofencing;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.GeofenceModel;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.TransitionGeofence;
import com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeofencingControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/GeofencingControl;", "", "", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", ConstantsKt.GEOFENCES_EXTRA_ID, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/TransitionGeofence;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingProvider;", "provider", "<init>", "(Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingProvider;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class GeofencingControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GeofencingProvider f29793a;

    public GeofencingControl(@NotNull GeofencingProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29793a = provider;
    }

    @NotNull
    public final Flow<TransitionGeofence> start(@NotNull List<GeofenceModel> geofences) {
        Intrinsics.checkNotNullParameter(geofences, "geofences");
        GeofencingProvider geofencingProvider = this.f29793a;
        geofencingProvider.addGeofences(geofences);
        return geofencingProvider.start();
    }

    public final void stop() {
        this.f29793a.stop();
    }
}
