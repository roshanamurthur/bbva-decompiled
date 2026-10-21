package com.bbva.securesharing.plugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.securesharing.plugin.command.params.PutValueParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PutValueCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/securesharing/plugin/command/PutValueCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/securesharing/plugin/command/params/PutValueParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "sSharingClient", "<init>", "(Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;)V", "securesharing-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class PutValueCommand extends AbstractCommand<PutValueParams> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SecureSharing f36455p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PutValueCommand(@NotNull SecureSharing sSharingClient) {
        super(PutValueParams.class, 2);
        Intrinsics.checkNotNullParameter(sSharingClient, "sSharingClient");
        this.f36455p0 = sSharingClient;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable PutValueParams params, @Nullable CommandCallback callback) {
        if (params == null) {
            if (callback == null) {
                return;
            }
            callback.sendError(Errors.ErrorMalformedParam);
        } else {
            if (params.getKey().length() == 0 || params.getValue().length() == 0) {
                if (callback == null) {
                    return;
                }
                callback.sendError(Errors.ErrorMalformedParam);
                return;
            }
            try {
                this.f36455p0.putValue(params.getKey(), params.getValue());
                if (callback == null) {
                    return;
                }
                callback.sendEvent();
            } catch (Exception unused) {
                if (callback == null) {
                    return;
                }
                callback.sendError(Errors.ErrorDefault);
            }
        }
    }
}
