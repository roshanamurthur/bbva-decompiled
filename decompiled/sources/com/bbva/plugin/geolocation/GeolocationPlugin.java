package com.bbva.plugin.geolocation;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.geolocation.di.Injector;
import com.bbva.plugin.geolocation.manager.Locator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeolocationPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/geolocation/GeolocationPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "locator", "Lcom/bbva/plugin/geolocation/manager/Locator;", "<init>", "(Lcom/bbva/plugin/geolocation/manager/Locator;)V", "getId", "", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeolocationPlugin extends Plugin {
    public GeolocationPlugin(@NotNull Locator locator) {
        Intrinsics.checkNotNullParameter(locator, "locator");
        Injector.INSTANCE.warmUp(locator);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new GeolocationPluginCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "GeolocationPlugin";
    }
}
