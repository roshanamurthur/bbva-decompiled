package com.bbva.plugin.appsflyer.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.appsflyer.Injection;
import com.bbva.plugin.appsflyer.models.AdditionalDataDTO;
import com.bbva.plugin.appsflyer.validators.AdditionalDataValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetAdditionalDataCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/appsflyer/command/SetAdditionalDataCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/appsflyer/models/AdditionalDataDTO;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetAdditionalDataCommand extends AbstractCommand<AdditionalDataDTO> {

    @NotNull
    public static final String ID = "setadditionaldata";

    public SetAdditionalDataCommand() {
        super(AdditionalDataDTO.class, new AdditionalDataValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull AdditionalDataDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Injection.INSTANCE.getAppsFlyerAdapter().setAdditionalData(params.getData());
        callback.sendEvent();
    }
}
