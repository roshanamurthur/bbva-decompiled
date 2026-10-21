package com.bbva.plugin.appsflyer;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.appsflyer.command.SetAdditionalDataCommand;
import com.bbva.plugin.appsflyer.command.SetAppInviteOneLinkCommand;
import com.bbva.plugin.appsflyer.command.SetCustomerCommand;
import com.bbva.plugin.appsflyer.command.SetOneLinkCustomDomainCommand;
import com.bbva.plugin.appsflyer.command.StartTrackingCommand;
import com.bbva.plugin.appsflyer.command.TrackEventCommand;
import kotlin.Metadata;
import q6.b;
import z6.c;
import z6.d;
import z6.e;
import z6.f;
import z6.g;

/* JADX INFO: compiled from: AppsFlyerPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/appsflyer/AppsFlyerPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppsFlyerPluginCommandFactory extends CommandFactory {
    public AppsFlyerPluginCommandFactory() {
        addCommandProvider(TrackEventCommand.ID, new b(5));
        int i10 = 2;
        addCommandProvider(StartTrackingCommand.ID, new c(i10));
        addCommandProvider(SetCustomerCommand.ID, new d(i10));
        addCommandProvider(SetAdditionalDataCommand.ID, new e(i10));
        addCommandProvider(SetAppInviteOneLinkCommand.ID, new f(3));
        addCommandProvider(SetOneLinkCustomDomainCommand.ID, new g(4));
    }
}
