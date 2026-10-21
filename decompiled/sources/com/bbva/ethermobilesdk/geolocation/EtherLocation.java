package com.bbva.ethermobilesdk.geolocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.bbva.ethermobilesdk.geolocation.activity.ActivityRecognitionControl;
import com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityProvider;
import com.bbva.ethermobilesdk.geolocation.geocoding.GeocodingControl;
import com.bbva.ethermobilesdk.geolocation.geocoding.provider.AndroidGeocodingProvider;
import com.bbva.ethermobilesdk.geolocation.geocoding.provider.GeocodingProvider;
import com.bbva.ethermobilesdk.geolocation.geofencing.GeofencingControl;
import com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.geofencing.provider.GeofencingProvider;
import com.bbva.ethermobilesdk.geolocation.location.LocationControl;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesWithFallbackProvider;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider;
import com.bbva.ethermobilesdk.geolocation.receiver.JobServiceReceiver;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherLocation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\f¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/EtherLocation;", "", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "provider", "Lcom/bbva/ethermobilesdk/geolocation/location/LocationControl;", "location", "Lcom/bbva/ethermobilesdk/geolocation/activity/provider/ActivityProvider;", "Lcom/bbva/ethermobilesdk/geolocation/activity/ActivityRecognitionControl;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/ethermobilesdk/geolocation/geofencing/provider/GeofencingProvider;", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/GeofencingControl;", "geofencing", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/GeocodingProvider;", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/GeocodingControl;", "geocoding", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"UnspecifiedRegisterReceiverFlag"})
public final class EtherLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29778a;

    public EtherLocation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29778a = context;
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m5535constructorimpl(Build.VERSION.SDK_INT >= 34 ? context.getApplicationContext().registerReceiver(new JobServiceReceiver(), new IntentFilter(ConstantsKt.JOB_SERVICE_ACTION), 4) : context.getApplicationContext().registerReceiver(new JobServiceReceiver(), new IntentFilter(ConstantsKt.JOB_SERVICE_ACTION)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static /* synthetic */ ActivityRecognitionControl activity$default(EtherLocation etherLocation, ActivityProvider activityProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            activityProvider = null;
        }
        return etherLocation.activity(activityProvider);
    }

    public static /* synthetic */ GeocodingControl geocoding$default(EtherLocation etherLocation, GeocodingProvider geocodingProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            geocodingProvider = null;
        }
        return etherLocation.geocoding(geocodingProvider);
    }

    public static /* synthetic */ GeofencingControl geofencing$default(EtherLocation etherLocation, GeofencingProvider geofencingProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            geofencingProvider = null;
        }
        return etherLocation.geofencing(geofencingProvider);
    }

    public static /* synthetic */ LocationControl location$default(EtherLocation etherLocation, LocationProvider locationProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locationProvider = null;
        }
        return etherLocation.location(locationProvider);
    }

    @NotNull
    public final ActivityRecognitionControl activity(@Nullable ActivityProvider provider) {
        if (provider == null) {
            provider = new ActivityGooglePlayServicesProvider(this.f29778a);
        }
        return new ActivityRecognitionControl(provider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final GeocodingControl geocoding(@Nullable GeocodingProvider provider) {
        if (provider == null) {
            provider = new AndroidGeocodingProvider(this.f29778a, null, 2, 0 == true ? 1 : 0);
        }
        return new GeocodingControl(provider);
    }

    @NotNull
    public final GeofencingControl geofencing(@Nullable GeofencingProvider provider) {
        if (provider == null) {
            provider = new GeofencingGooglePlayServicesProvider(this.f29778a);
        }
        return new GeofencingControl(provider);
    }

    @NotNull
    public final LocationControl location(@Nullable LocationProvider provider) {
        Context context = this.f29778a;
        if (provider == null) {
            provider = new LocationGooglePlayServicesWithFallbackProvider(context);
        }
        return new LocationControl(context, provider);
    }
}
