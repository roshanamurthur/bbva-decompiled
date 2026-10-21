package com.bbva.ethermobilesdk.plugin.devicemanager.di;

import android.app.Application;
import com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/di/Injector;", "", "<init>", "()V", "getClient", "Lcom/bbva/ethermobilesdk/devicemanager/DeviceManagerApi;", Constants.APPLICATION, "Landroid/app/Application;", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    @NotNull
    public final DeviceManagerApi getClient(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new DeviceManagerApi(application);
    }
}
