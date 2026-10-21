package com.bbva.discreetmode.plugin;

import c4.e;
import c4.f;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.plugin.commands.StartMonitoringCommand;
import com.bbva.discreetmode.plugin.commands.StopMonitoringCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCommandFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/discreetmode/plugin/DiscreetModeCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "discreetMode", "Lcom/bbva/discreetmode/DiscreetMode;", "(Lcom/bbva/discreetmode/DiscreetMode;)V", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DiscreetModeCommandFactory extends CommandFactory {
    public DiscreetModeCommandFactory(@NotNull DiscreetMode discreetMode) {
        Intrinsics.checkNotNullParameter(discreetMode, "discreetMode");
        addCommandProvider(StartMonitoringCommand.ID, new e(discreetMode, 1));
        addCommandProvider(StopMonitoringCommand.ID, new f(discreetMode, 1));
    }
}
