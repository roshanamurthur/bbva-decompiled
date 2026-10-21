package com.bbva.plugin.naturalauthentication.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.naturalauthentication.command.provider.FidoCallbackProvider;
import com.bbva.plugin.naturalauthentication.domain.model.RegisterParams;
import ib.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/RegisterCommand;", "Lcom/bbva/plugin/naturalauthentication/command/FidoCommand;", "Lcom/bbva/plugin/naturalauthentication/domain/model/RegisterParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;", "provider", "<init>", "(Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class RegisterCommand extends FidoCommand<RegisterParams> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final FidoCallbackProvider f35879r0;

    /* JADX WARN: Multi-variable type inference failed */
    public RegisterCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RegisterCommand(FidoCallbackProvider fidoCallbackProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new FidoCallbackProvider() : fidoCallbackProvider);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable RegisterParams params, @NotNull CommandCallback callback) {
        ErrorMessage errorMessage;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        String action = params.getAction();
        if (Intrinsics.areEqual(action, RegisterAction.CHECK.getAction())) {
            errorMessage = CommandError.ErrorCheckRegister;
        } else {
            errorMessage = Intrinsics.areEqual(action, RegisterAction.REGISTER.getAction()) ? CommandError.ErrorRegister : Errors.ErrorDefault;
        }
        withAuthClient(callback, errorMessage, params.getUserId(), new c(params, this, callback, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterCommand(@NotNull FidoCallbackProvider provider) {
        super(RegisterParams.class);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35879r0 = provider;
    }
}
