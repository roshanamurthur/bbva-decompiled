package com.bbva.plugin.appsflyer;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.appsflyer.AppsFlyerAdapter;
import com.bbva.notifications.NotificationConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppsFlyerPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/appsflyer/AppsFlyerPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", NotificationConstants.APPSFLYER_SUBTYPE, "Lcom/bbva/appsflyer/AppsFlyerAdapter;", "(Lcom/bbva/appsflyer/AppsFlyerAdapter;)V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppsFlyerPlugin extends Plugin {
    public AppsFlyerPlugin(@NotNull AppsFlyerAdapter appsflyer) {
        Intrinsics.checkNotNullParameter(appsflyer, "appsflyer");
        Injection.INSTANCE.initialize(appsflyer);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new AppsFlyerPluginCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "AppsFlyerPlugin";
    }
}
