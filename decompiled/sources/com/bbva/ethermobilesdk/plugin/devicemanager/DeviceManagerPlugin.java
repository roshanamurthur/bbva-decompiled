package com.bbva.ethermobilesdk.plugin.devicemanager;

import com.bbva.androidtoolkit.plugin.Plugin;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceManagerPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/DeviceManagerPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "<init>", "()V", "getId", "", "createCommandFactory", "Lcom/bbva/ethermobilesdk/plugin/devicemanager/DeviceManagerCommandFactory;", "Companion", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceManagerPlugin extends Plugin {

    @NotNull
    public static final String ID = "DeviceManager";

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public DeviceManagerCommandFactory createCommandFactory() {
        return new DeviceManagerCommandFactory();
    }
}
