package com.bbva.ethermobilesdk.deviceinfo.plugin.di;

import android.content.Context;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000¨\u0006\u0007"}, d2 = {"withDeviceInfoClient", "", "context", "Landroid/content/Context;", "block", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceinfo-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InjectorKt {
    public static final void withDeviceInfoClient(@NotNull Context context, @NotNull Function1<? super DeviceInfo, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(Injector.INSTANCE.create(context));
    }
}
