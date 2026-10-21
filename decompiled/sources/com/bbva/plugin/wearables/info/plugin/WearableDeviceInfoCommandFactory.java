package com.bbva.plugin.wearables.info.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.wearables.info.library.WearableDeviceInfo;
import com.bbva.plugin.wearables.info.plugin.commands.GetWearableConnectivityCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7.h;

/* JADX INFO: compiled from: WearableDeviceInfoCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/wearables/info/plugin/WearableDeviceInfoCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "wearableDeviceInfo", "Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;", "(Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WearableDeviceInfoCommandFactory extends CommandFactory {
    public WearableDeviceInfoCommandFactory(@NotNull WearableDeviceInfo wearableDeviceInfo) {
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "wearableDeviceInfo");
        addCommandProvider(GetWearableConnectivityCommand.ID, new h(wearableDeviceInfo, 3));
    }
}
