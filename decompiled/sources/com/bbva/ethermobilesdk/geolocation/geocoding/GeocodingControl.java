package com.bbva.ethermobilesdk.geolocation.geocoding;

import android.location.Address;
import android.location.Location;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import com.bbva.ethermobilesdk.geolocation.geocoding.provider.GeocodingProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeocodingControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geocoding/GeocodingControl;", "", "", "name", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "geocoding", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/location/Location;", "location", "Landroid/location/Address;", "reverseGeocoding", "(Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/GeocodingProvider;", "provider", "<init>", "(Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/GeocodingProvider;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class GeocodingControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GeocodingProvider f29787a;

    public GeocodingControl(@NotNull GeocodingProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29787a = provider;
    }

    @Nullable
    public final Object geocoding(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation) {
        return this.f29787a.getLocationFromAddress(str, continuation);
    }

    @Nullable
    public final Object reverseGeocoding(@NotNull Location location, @NotNull Continuation<? super Address> continuation) {
        return this.f29787a.getAddressFromLocation(location, continuation);
    }
}
