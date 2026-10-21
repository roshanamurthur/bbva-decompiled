package com.bbva.ethermobilesdk.devicemanager.gms.di;

import android.content.Context;
import com.bbva.ethermobilesdk.devicechecker.play.integrity.IntegrityApi;
import com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepository;
import com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceCheckerPlayIntegrityModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/di/DeviceCheckerPlayIntegrityModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "provideDeviceCheckerPlayIntegrityRepository$devicemanager_gms_release", "()Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "provideDeviceCheckerPlayIntegrityRepository", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceCheckerPlayIntegrityModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29741a;

    public DeviceCheckerPlayIntegrityModule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29741a = context;
    }

    @NotNull
    public final DeviceCheckerPlayIntegrityRepository provideDeviceCheckerPlayIntegrityRepository$devicemanager_gms_release() {
        return new DeviceCheckerPlayIntegrityRepositoryImpl(new IntegrityApi(this.f29741a));
    }
}
