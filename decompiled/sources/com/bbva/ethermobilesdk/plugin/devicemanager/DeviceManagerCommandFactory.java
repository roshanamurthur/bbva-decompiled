package com.bbva.ethermobilesdk.plugin.devicemanager;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.ethermobilesdk.plugin.devicemanager.command.DeviceIdCommand;
import kotlin.Metadata;
import z6.h;

/* JADX INFO: compiled from: DeviceManagerCommandFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/DeviceManagerCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceManagerCommandFactory extends CommandFactory {
    public DeviceManagerCommandFactory() {
        addCommandProvider(DeviceIdCommand.ID, new h(1));
    }
}
