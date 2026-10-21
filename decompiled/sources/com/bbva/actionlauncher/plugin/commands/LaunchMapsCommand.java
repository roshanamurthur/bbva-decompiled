package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.plugin.params.MapsParams;
import com.bbva.actionlauncher.plugin.validators.MapsParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LaunchMapsCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/LaunchMapsCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/MapsParams;", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "executeInternal", "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LaunchMapsCommand extends ActionLauncherCommand<MapsParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchMapsCommand(@NotNull ActionLauncher actionLauncher) {
        super(MapsParams.class, actionLauncher, new MapsParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull MapsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return getActionLauncher().launchMaps(params.getUriString());
    }
}
