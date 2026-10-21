package com.bbva.networkplugin;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.networkplugin.command.connection.status.SubscribeConnectionStatusCommand;
import com.bbva.networkplugin.command.connection.status.UnsubscribeConnectionStatusCommand;
import com.bbva.networkplugin.command.impl.CleanAllCookiesCommand;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.networkplugin.command.impl.PostCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.networkplugin.utils.FileActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7.d;
import r7.e;
import r7.f;
import r7.g;
import r7.h;
import sa.a;

/* JADX INFO: compiled from: HttpCommandFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/networkplugin/HttpCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "endPoint", "Lcom/bbva/networkplugin/net/EndPoint;", "connectionStatusHandler", "Lcom/bbva/networkplugin/net/ConnectionStatusHandler;", "fileActions", "Lcom/bbva/networkplugin/utils/FileActions;", "(Lcom/bbva/networkplugin/net/EndPoint;Lcom/bbva/networkplugin/net/ConnectionStatusHandler;Lcom/bbva/networkplugin/utils/FileActions;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpCommandFactory extends CommandFactory {
    public /* synthetic */ HttpCommandFactory(EndPoint endPoint, ConnectionStatusHandler connectionStatusHandler, FileActions fileActions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPoint, connectionStatusHandler, (i10 & 4) != 0 ? new FileActions() : fileActions);
    }

    public HttpCommandFactory(@NotNull final EndPoint endPoint, @NotNull ConnectionStatusHandler connectionStatusHandler, @NotNull final FileActions fileActions) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(connectionStatusHandler, "connectionStatusHandler");
        Intrinsics.checkNotNullParameter(fileActions, "fileActions");
        addCommandProvider("get", new a(endPoint, 0));
        addCommandProvider(PostCommand.ID, new CommandProvider() { // from class: sa.b
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            public final AbstractCommand create() {
                EndPoint endPoint2 = endPoint;
                FileActions fileActions2 = fileActions;
                Intrinsics.checkNotNullParameter(endPoint2, "$endPoint");
                Intrinsics.checkNotNullParameter(fileActions2, "$fileActions");
                return new PostCommand(endPoint2, fileActions2, null, 4, null);
            }
        });
        addCommandProvider(PutCommand.ID, new CommandProvider() { // from class: sa.c
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            public final AbstractCommand create() {
                EndPoint endPoint2 = endPoint;
                FileActions fileActions2 = fileActions;
                Intrinsics.checkNotNullParameter(endPoint2, "$endPoint");
                Intrinsics.checkNotNullParameter(fileActions2, "$fileActions");
                return new PutCommand(endPoint2, fileActions2, null, 4, null);
            }
        });
        int i10 = 1;
        addCommandProvider(HeadCommand.ID, new d(endPoint, 1));
        addCommandProvider(PatchCommand.ID, new e(endPoint, i10));
        addCommandProvider("delete", new sa.d(endPoint, 0));
        addCommandProvider(CleanAllCookiesCommand.ID, new f(endPoint, i10));
        addCommandProvider(SubscribeConnectionStatusCommand.ID, new g(connectionStatusHandler, i10));
        addCommandProvider(UnsubscribeConnectionStatusCommand.ID, new h(connectionStatusHandler, i10));
    }
}
