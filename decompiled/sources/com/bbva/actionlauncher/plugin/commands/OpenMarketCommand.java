package com.bbva.actionlauncher.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.actionlauncher.plugin.params.MarketParams;
import com.bbva.actionlauncher.plugin.validators.MarketParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenMarketCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/OpenMarketCommand;", "Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", "Lcom/bbva/actionlauncher/plugin/params/MarketParams;", "params", "", "executeInternal", "Lcom/bbva/actionlauncher/ActionLauncher;", "actionLauncher", "Lcom/bbva/actionlauncher/model/PlatformType;", "platformType", "<init>", "(Lcom/bbva/actionlauncher/ActionLauncher;Lcom/bbva/actionlauncher/model/PlatformType;)V", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class OpenMarketCommand extends ActionLauncherCommand<MarketParams> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final PlatformType f26466q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenMarketCommand(@NotNull ActionLauncher actionLauncher, @NotNull PlatformType platformType) {
        super(MarketParams.class, actionLauncher, new MarketParamsValidator());
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.f26466q0 = platformType;
    }

    @Override // com.bbva.actionlauncher.plugin.commands.ActionLauncherCommand
    public boolean executeInternal(@NotNull MarketParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ActionLauncher actionLauncher = getActionLauncher();
        String packageId = params.getPackageId();
        Intrinsics.checkNotNull(packageId);
        actionLauncher.launchMarket(packageId, this.f26466q0);
        return true;
    }
}
