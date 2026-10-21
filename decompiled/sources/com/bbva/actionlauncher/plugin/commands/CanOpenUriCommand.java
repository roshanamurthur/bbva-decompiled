package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.UriValue;
import com.bbva.actionlauncher.plugin.params.UriParams;
import com.bbva.actionlauncher.plugin.validators.UriParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CanOpenUriCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/CanOpenUriCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/UriParams;", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "executeInternal", "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CanOpenUriCommand extends ActionLauncherCommand<UriParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanOpenUriCommand(@NotNull ActionLauncher actionLauncher) {
        super(UriParams.class, actionLauncher, new UriParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull UriParams params) {
        UriValue uri;
        Intrinsics.checkNotNullParameter(params, "params");
        ActionLauncher actionLauncher = getActionLauncher();
        if (params.isPackage()) {
            String packageId = params.getPackageId();
            Intrinsics.checkNotNull(packageId);
            uri = new UriValue.App(packageId);
        } else {
            String scheme = params.getScheme();
            Intrinsics.checkNotNull(scheme);
            uri = new UriValue.Uri(scheme);
        }
        return actionLauncher.canOpenUri(uri);
    }
}
