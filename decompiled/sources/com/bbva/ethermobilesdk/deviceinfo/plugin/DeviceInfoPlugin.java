package com.bbva.ethermobilesdk.deviceinfo.plugin;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/DeviceInfoPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "components", "", "initialize", "", "getId", "Lcom/bbva/ethermobilesdk/deviceinfo/plugin/DeviceInfoCommandFactory;", "createCommandFactory", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceInfoPlugin extends Plugin {
    public DeviceInfoPlugin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "DeviceInfo";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@Nullable PluginComponentContainer components) {
        super.initialize(components);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public DeviceInfoCommandFactory createCommandFactory() {
        return new DeviceInfoCommandFactory();
    }
}
