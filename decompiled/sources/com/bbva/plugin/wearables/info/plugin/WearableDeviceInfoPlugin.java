package com.bbva.plugin.wearables.info.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.wearables.info.library.WearableDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WearableDeviceInfoPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/wearables/info/plugin/WearableDeviceInfoPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;", "wearableDeviceInfo", "<init>", "(Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;)V", "Companion", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class WearableDeviceInfoPlugin extends Plugin {

    @NotNull
    public static final String ID = "WearableDeviceInfoPlugin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WearableDeviceInfo f36087a;

    public WearableDeviceInfoPlugin(@NotNull WearableDeviceInfo wearableDeviceInfo) {
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "wearableDeviceInfo");
        this.f36087a = wearableDeviceInfo;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new WearableDeviceInfoCommandFactory(this.f36087a);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}
