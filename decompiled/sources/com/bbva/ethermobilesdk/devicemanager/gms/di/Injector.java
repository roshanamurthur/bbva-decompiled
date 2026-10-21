package com.bbva.ethermobilesdk.devicemanager.gms.di;

import android.content.Context;
import com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository;
import com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/di/Injector;", "", "Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "a", "Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "getDeviceCheckerPlayIntegrityRepository$devicemanager_gms_release", "()Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "deviceCheckerPlayIntegrityRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "b", "Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "getGeolocationRepository$devicemanager_gms_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "geolocationRepository", "Lcom/bbva/ethermobilesdk/devicemanager/di/Injector;", "injectorBase", "Landroid/content/Context;", "context", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/di/Injector;Landroid/content/Context;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class Injector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceCheckerPlayIntegrityRepository deviceCheckerPlayIntegrityRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GeolocationRepository geolocationRepository;

    public Injector(@NotNull com.bbva.ethermobilesdk.devicemanager.di.Injector injectorBase, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(injectorBase, "injectorBase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.deviceCheckerPlayIntegrityRepository = new DeviceCheckerPlayIntegrityModule(context).provideDeviceCheckerPlayIntegrityRepository$devicemanager_gms_release();
        this.geolocationRepository = new GeolocationGmsModule(context, injectorBase.getPermissionRepository()).provideGeolocationRepository$devicemanager_gms_release();
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceCheckerPlayIntegrityRepository$devicemanager_gms_release, reason: from getter */
    public final DeviceCheckerPlayIntegrityRepository getDeviceCheckerPlayIntegrityRepository() {
        return this.deviceCheckerPlayIntegrityRepository;
    }

    @NotNull
    /* JADX INFO: renamed from: getGeolocationRepository$devicemanager_gms_release, reason: from getter */
    public final GeolocationRepository getGeolocationRepository() {
        return this.geolocationRepository;
    }
}
