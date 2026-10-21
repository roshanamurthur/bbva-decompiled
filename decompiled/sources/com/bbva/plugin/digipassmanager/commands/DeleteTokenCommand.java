package com.bbva.plugin.digipassmanager.commands;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import com.bbva.plugin.digipassmanager.commands.errors.CustomErrors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteTokenCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/DeleteTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeleteTokenCommand extends AbstractCommand {

    @NotNull
    public static final String ID = "delete_token";

    public DeleteTokenCommand() {
        super(Void.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        DigipassManagerHelper companion = DigipassManagerHelper.INSTANCE.getInstance();
        Context applicationContext = this.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
        companion.deleteToken(applicationContext, new OnDeleteTokenCronto() { // from class: com.bbva.plugin.digipassmanager.commands.DeleteTokenCommand.execute.1
            @Override // com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto
            public void onComplete(boolean success) {
                CommandCallback commandCallback = callback;
                if (success) {
                    commandCallback.sendEvent("ok");
                } else {
                    commandCallback.sendError(CustomErrors.InternalError);
                }
            }
        });
    }
}
