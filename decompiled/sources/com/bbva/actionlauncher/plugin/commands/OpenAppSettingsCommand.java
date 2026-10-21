package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.plugin.params.AppSettingsParams;
import com.bbva.actionlauncher.plugin.validators.AppSettingsParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenAppSettingsCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/OpenAppSettingsCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/AppSettingsParams;", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "executeInternal", "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OpenAppSettingsCommand extends ActionLauncherCommand<AppSettingsParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAppSettingsCommand(@NotNull ActionLauncher actionLauncher) {
        super(AppSettingsParams.class, actionLauncher, new AppSettingsParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull AppSettingsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ActionLauncher actionLauncher = getActionLauncher();
        String packageId = params.getPackageId();
        Intrinsics.checkNotNull(packageId);
        return actionLauncher.launchSettings(packageId);
    }
}
