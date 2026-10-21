package com.bbva.ethermobilesdk.geolocation.location.provider;

import android.content.Context;
import android.location.Location;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationGooglePlayServicesWithFallbackProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationGooglePlayServicesWithFallbackProvider;", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "params", "", "singleUpdate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "getProvider", "()Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "setProvider", "(Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;)V", "provider", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationGooglePlayServicesWithFallbackProvider implements LocationProvider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LocationProvider provider;

    public LocationGooglePlayServicesWithFallbackProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.provider = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0 ? new LocationGooglePlayServicesProvider(context) : new LocationManagerProvider(context);
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @Nullable
    public Object getLastLocation(@NotNull Continuation<? super Location> continuation) {
        return this.provider.getLastLocation(continuation);
    }

    @NotNull
    public final LocationProvider getProvider() {
        return this.provider;
    }

    public final void setProvider(@NotNull LocationProvider locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "<set-?>");
        this.provider = locationProvider;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @NotNull
    public Flow<Result<Location>> start(@NotNull LocationParams params, boolean singleUpdate) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.provider.start(params, singleUpdate);
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    public void stop() {
        this.provider.stop();
    }
}
