package com.bbva.plugin.naturalauthentication.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.naturalauthentication.domain.model.SetExternalDeviceIdParams;
import com.bbva.plugin.naturalauthentication.injection.Injector;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetExternalDeviceIdCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/SetExternalDeviceIdCommand;", "Lcom/bbva/plugin/naturalauthentication/command/FidoCommand;", "Lcom/bbva/plugin/naturalauthentication/domain/model/SetExternalDeviceIdParams;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetExternalDeviceIdCommand extends FidoCommand<SetExternalDeviceIdParams> {
    public SetExternalDeviceIdCommand() {
        super(SetExternalDeviceIdParams.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable SetExternalDeviceIdParams params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Injector.INSTANCE.getNaturalAuthentication().setExternalDeviceId(params.getExternalDeviceId());
            callback.sendEvent();
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return;
        }
        callback.sendError(CommandError.ErrorSettingExternalDeviceId);
    }
}
