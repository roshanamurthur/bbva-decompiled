package com.bbva.plugin.geolocation;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.geolocation.command.ClearWatchLocationCommand;
import com.bbva.plugin.geolocation.command.CoordinatesToOpenLocationCommand;
import com.bbva.plugin.geolocation.command.GetAddressFromLocationCommand;
import com.bbva.plugin.geolocation.command.GetCurrentPositionCommand;
import com.bbva.plugin.geolocation.command.GetLocationFromAddressCommand;
import com.bbva.plugin.geolocation.command.IsLocationServiceEnabledCommand;
import com.bbva.plugin.geolocation.command.OpenLocationToCoordinatesCommand;
import com.bbva.plugin.geolocation.command.PromptForLocationServiceCommand;
import com.bbva.plugin.geolocation.command.WatchLocationCommand;
import kotlin.Metadata;
import q6.a;
import z6.b;
import z6.c;
import z6.d;
import z6.e;
import z6.f;
import z6.g;
import z6.v;

/* JADX INFO: compiled from: GeolocationPluginCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/plugin/geolocation/GeolocationPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeolocationPluginCommandFactory extends CommandFactory {
    public GeolocationPluginCommandFactory() {
        addCommandProvider(ClearWatchLocationCommand.ID, new v(5));
        addCommandProvider(GetAddressFromLocationCommand.ID, new b(4));
        addCommandProvider(GetCurrentPositionCommand.ID, new a(4));
        addCommandProvider(GetLocationFromAddressCommand.ID, new q6.b(6));
        int i10 = 3;
        addCommandProvider(PromptForLocationServiceCommand.ID, new c(i10));
        addCommandProvider(WatchLocationCommand.ID, new d(i10));
        addCommandProvider(IsLocationServiceEnabledCommand.ID, new e(i10));
        addCommandProvider(CoordinatesToOpenLocationCommand.ID, new f(4));
        addCommandProvider(OpenLocationToCoordinatesCommand.ID, new g(5));
    }
}
