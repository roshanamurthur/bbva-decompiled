package com.bbva.ethermobilesdk.devicemanager.di;

import android.app.Application;
import com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepository;
import com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepositoryImpl;
import com.bbva.ethermobilesdk.deviceuid.DeviceUIDKt;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceUidModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/di/DeviceUidModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "provideDeviceUidRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "provideDeviceUidRepository", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceUidModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f29661a;

    public DeviceUidModule(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f29661a = application;
    }

    @NotNull
    public final DeviceUidRepository provideDeviceUidRepository$devicemanager_release() {
        return new DeviceUidRepositoryImpl(DeviceUIDKt.DeviceUID$default(this.f29661a, false, null, null, false, 30, null));
    }
}
