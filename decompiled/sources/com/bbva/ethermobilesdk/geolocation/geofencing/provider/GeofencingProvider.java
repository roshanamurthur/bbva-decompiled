package com.bbva.ethermobilesdk.geolocation.geofencing.provider;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.GeofenceModel;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.TransitionGeofence;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeofencingProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH&J\b\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingProvider;", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/TransitionGeofence;", "addGeofence", "", "geofence", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "addGeofences", "geofenceList", "", "removeGeofence", "geofenceId", "", "removeGeofences", "geofenceIds", "stop", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GeofencingProvider {
    void addGeofence(@NotNull GeofenceModel geofence);

    void addGeofences(@NotNull List<GeofenceModel> geofenceList);

    void removeGeofence(@NotNull String geofenceId);

    void removeGeofences(@NotNull List<String> geofenceIds);

    @NotNull
    Flow<TransitionGeofence> start();

    void stop();
}
