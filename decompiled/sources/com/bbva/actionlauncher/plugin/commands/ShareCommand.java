package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.SharedValue;
import com.bbva.actionlauncher.plugin.params.ShareParams;
import com.bbva.actionlauncher.plugin.validators.ShareParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShareCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/ShareCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/ShareParams;", "params", "", "executeInternal", "Lcom/bbva/actionlauncher/ActionLauncher;", "actionLauncher", "<init>", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ShareCommand extends ActionLauncherCommand<ShareParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareCommand(@NotNull ActionLauncher actionLauncher) {
        super(ShareParams.class, actionLauncher, new ShareParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull ShareParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ActionLauncher actionLauncher = getActionLauncher();
        String text = params.getText();
        Intrinsics.checkNotNull(text);
        return actionLauncher.launchShare(new SharedValue.Text(text));
    }
}
