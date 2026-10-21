package com.bbva.ethermobilesdk.geolocation.geocoding.provider;

import android.location.Address;
import android.location.Location;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeocodingProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/GeocodingProvider;", "", "getLocationFromAddress", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromLocation", "Landroid/location/Address;", "location", "Landroid/location/Location;", "(Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GeocodingProvider {
    @Nullable
    Object getAddressFromLocation(@NotNull Location location, @NotNull Continuation<? super Address> continuation);

    @Nullable
    Object getLocationFromAddress(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation);
}
