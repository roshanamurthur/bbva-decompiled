package com.bbva.networkplugin.command.impl;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.networkplugin.net.EndPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CleanAllCookiesCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/networkplugin/command/impl/CleanAllCookiesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "Lcom/bbva/networkplugin/net/EndPoint;", "endPoint", "<init>", "(Lcom/bbva/networkplugin/net/EndPoint;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class CleanAllCookiesCommand extends AbstractCommand<Void> {

    @NotNull
    public static final String ID = "cleanallcookies";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final EndPoint f35229p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanAllCookiesCommand(@NotNull EndPoint endPoint) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        this.f35229p0 = endPoint;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        if (this.f35229p0.cleanAllCookies()) {
            commandCallback.sendEvent();
        } else {
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }
}
