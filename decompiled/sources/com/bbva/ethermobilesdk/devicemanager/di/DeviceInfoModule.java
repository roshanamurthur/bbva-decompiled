package com.bbva.ethermobilesdk.devicemanager.di;

import android.content.Context;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceInfoModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/di/DeviceInfoModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "provideDeviceInfoRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "provideDeviceInfoRepository", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceInfoModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public DeviceInfoModule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final DeviceInfoRepository provideDeviceInfoRepository$devicemanager_release() {
        return new DeviceInfoRepositoryImpl(new DeviceInfo(this.context));
    }
}
