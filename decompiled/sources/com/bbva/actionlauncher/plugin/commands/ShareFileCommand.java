package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.SharedValue;
import com.bbva.actionlauncher.plugin.params.ShareFileParams;
import com.bbva.actionlauncher.plugin.validators.ShareFileParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShareFileCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/ShareFileCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/ShareFileParams;", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "executeInternal", "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareFileCommand extends ActionLauncherCommand<ShareFileParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileCommand(@NotNull ActionLauncher actionLauncher) {
        super(ShareFileParams.class, actionLauncher, new ShareFileParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull ShareFileParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ActionLauncher actionLauncher = getActionLauncher();
        String mimetype = params.getMimetype();
        Intrinsics.checkNotNull(mimetype);
        String data = params.getData();
        Intrinsics.checkNotNull(data);
        return actionLauncher.launchShare(new SharedValue.File(mimetype, data));
    }
}
