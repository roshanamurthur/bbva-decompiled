package com.bbva.ethermobilesdk.devicemanager.gms.di;

import android.content.Context;
import com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository;
import com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository;
import com.bbva.ethermobilesdk.geolocation.EtherLocation;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesWithFallbackProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeolocationGmsModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/di/GeolocationGmsModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "provideGeolocationRepository$devicemanager_gms_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "provideGeolocationRepository", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "permissionRepository", "<init>", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class GeolocationGmsModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PermissionRepository f29743b;

    public GeolocationGmsModule(@NotNull Context context, @NotNull PermissionRepository permissionRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionRepository, "permissionRepository");
        this.f29742a = context;
        this.f29743b = permissionRepository;
    }

    @NotNull
    public final GeolocationRepository provideGeolocationRepository$devicemanager_gms_release() {
        Context context = this.f29742a;
        return new GeolocationRepositoryImpl(this.f29743b, new EtherLocation(context), new LocationGooglePlayServicesWithFallbackProvider(context));
    }
}
