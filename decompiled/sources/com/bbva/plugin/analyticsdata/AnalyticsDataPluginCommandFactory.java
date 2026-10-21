package com.bbva.plugin.analyticsdata;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.analyticsdata.command.GetMarketingCloudIdCommand;
import com.bbva.plugin.analyticsdata.command.GetPrivacyStatusCommand;
import com.bbva.plugin.analyticsdata.command.SetPrivacyStatusCommand;
import kotlin.Metadata;
import z6.b;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: AnalyticsDataPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsDataPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnalyticsDataPluginCommandFactory extends CommandFactory {
    public AnalyticsDataPluginCommandFactory() {
        addCommandProvider(GetMarketingCloudIdCommand.ID, new u(3));
        addCommandProvider(GetPrivacyStatusCommand.ID, new v(4));
        addCommandProvider(SetPrivacyStatusCommand.ID, new b(3));
    }
}
