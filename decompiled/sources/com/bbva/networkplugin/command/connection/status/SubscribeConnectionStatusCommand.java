package com.bbva.networkplugin.command.connection.status;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.networkplugin.command.params.ConnectionStatusSettings;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubscribeConnectionStatusCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/networkplugin/command/connection/status/SubscribeConnectionStatusCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/networkplugin/command/params/ConnectionStatusSettings;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/networkplugin/net/ConnectionStatusHandler;", "handler", "<init>", "(Lcom/bbva/networkplugin/net/ConnectionStatusHandler;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class SubscribeConnectionStatusCommand extends AbstractCommand<ConnectionStatusSettings> {

    @NotNull
    public static final String ID = "subscribe.connection.status";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ConnectionStatusHandler f35226p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeConnectionStatusCommand(@NotNull ConnectionStatusHandler handler) {
        super(ConnectionStatusSettings.class);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f35226p0 = handler;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable ConnectionStatusSettings params, @NotNull CommandCallback callback) {
        Long delay;
        Intrinsics.checkNotNullParameter(callback, "callback");
        PostMessenger mPostMessenger = this.mPostMessenger;
        Intrinsics.checkNotNullExpressionValue(mPostMessenger, "mPostMessenger");
        this.f35226p0.subscribe(mPostMessenger, Long.valueOf((params == null || (delay = params.getDelay()) == null) ? 100L : delay.longValue()));
        callback.sendEvent();
    }
}
