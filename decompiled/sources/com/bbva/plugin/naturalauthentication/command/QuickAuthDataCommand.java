package com.bbva.plugin.naturalauthentication.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.naturalauthentication.command.provider.FidoCallbackProvider;
import com.bbva.plugin.naturalauthentication.domain.model.QuickAuthDataParams;
import ib.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QuickAuthDataCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/QuickAuthDataCommand;", "Lcom/bbva/plugin/naturalauthentication/command/FidoCommand;", "Lcom/bbva/plugin/naturalauthentication/domain/model/QuickAuthDataParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;", "provider", "<init>", "(Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class QuickAuthDataCommand extends FidoCommand<QuickAuthDataParams> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final FidoCallbackProvider f35878r0;

    /* JADX WARN: Multi-variable type inference failed */
    public QuickAuthDataCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ QuickAuthDataCommand(FidoCallbackProvider fidoCallbackProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new FidoCallbackProvider() : fidoCallbackProvider);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable QuickAuthDataParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
        } else {
            withAuthClient(callback, CommandError.ErrorGettingQuickAuthData, params.getUserId(), params.getTenant(), new b(this, callback, 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAuthDataCommand(@NotNull FidoCallbackProvider provider) {
        super(QuickAuthDataParams.class);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35878r0 = provider;
    }
}
