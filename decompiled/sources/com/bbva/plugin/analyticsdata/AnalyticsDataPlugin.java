package com.bbva.plugin.analyticsdata;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.plugin.analyticsdata.di.Injector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnalyticsDataPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsDataPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "components", "", "initialize", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "config", "<init>", "(Landroid/content/Context;Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;)V", "Companion", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsDataPlugin extends Plugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnalyticsSourceConfig f35567b;

    public AnalyticsDataPlugin(@NotNull Context context, @NotNull AnalyticsSourceConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f35566a = context;
        this.f35567b = config;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new AnalyticsDataPluginCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "AdobeAnalyticsData";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@Nullable PluginComponentContainer components) {
        Injector.INSTANCE.create(this.f35566a, this.f35567b);
        super.initialize(components);
    }
}
