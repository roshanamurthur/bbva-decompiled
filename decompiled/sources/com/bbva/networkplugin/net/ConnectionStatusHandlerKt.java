package com.bbva.networkplugin.net;

import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.network.model.ConnectionStatusEvent;
import com.bbva.networkplugin.command.response.ConnectionStatusAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectionStatusHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"emitConnectionStatus", "", "Lcom/bbva/androidtoolkit/plugin/postmessage/PostMessenger;", "event", "Lcom/bbva/network/model/ConnectionStatusEvent;", "network-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConnectionStatusHandlerKt {
    public static final void emitConnectionStatus(@NotNull PostMessenger postMessenger, @NotNull ConnectionStatusEvent event) {
        Intrinsics.checkNotNullParameter(postMessenger, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        ConnectionStatusAction connectionStatusAction = new ConnectionStatusAction(null, event, 1, null);
        postMessenger.postMessage(connectionStatusAction.getAction(), connectionStatusAction);
    }
}
