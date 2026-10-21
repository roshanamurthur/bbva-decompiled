package com.bbva.ethermobilesdk.deviceinfo.plugin.di;

import android.content.Context;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/di/Injector;", "", "()V", "create", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "context", "Landroid/content/Context;", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    @NotNull
    public final DeviceInfo create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DeviceInfo(context);
    }
}
