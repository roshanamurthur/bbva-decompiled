package com.bbva.plugin.push;

import c4.c;
import c4.d;
import c4.e;
import c4.g;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.plugin.push.command.GetNotificationsCommand;
import com.bbva.plugin.push.command.GetOptionsCommand;
import com.bbva.plugin.push.command.GetPermissionsCommand;
import com.bbva.plugin.push.command.RequestServiceTokenCommand;
import com.bbva.plugin.push.command.RequestTokenCommand;
import com.bbva.plugin.push.command.SetOptionsCommand;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.plugin.push.command.inbox.AddFavoriteCommand;
import com.bbva.plugin.push.command.inbox.GetAllMessagesCountCommand;
import com.bbva.plugin.push.command.inbox.GetMessagesCommand;
import com.bbva.plugin.push.command.inbox.GetReadMessagesCountCommand;
import com.bbva.plugin.push.command.inbox.GetUnreadMessagesCountCommand;
import com.bbva.plugin.push.command.inbox.RemoveAllMessagesCommand;
import com.bbva.plugin.push.command.inbox.RemoveFavoriteCommand;
import com.bbva.plugin.push.command.inbox.RemoveMessageCommand;
import com.bbva.plugin.push.command.inbox.SetAllMessagesReadCommand;
import com.bbva.plugin.push.command.inbox.SetMessageReadCommand;
import com.bbva.plugin.push.command.inbox.SetMessageUnreadCommand;
import com.bbva.plugin.push.command.response.PushAction;
import com.bbva.push.PushManager;
import com.bbva.push.model.Push;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.f;
import r7.h;

/* JADX INFO: compiled from: PushPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/push/PushPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "components", "", "initialize", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "a", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PushPlugin extends Plugin {

    @NotNull
    public static final String ID = "PushPlugin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PushManager f35892a;

    /* JADX INFO: compiled from: PushPlugin.kt */
    public final class a extends CommandFactory {
        public a(PushPlugin pushPlugin) {
            final PushManager pushManager = pushPlugin.f35892a;
            int i10 = 2;
            addCommandProvider(TrackMessageOpenedCommand.ID, new f(pushManager, i10));
            addCommandProvider(GetPermissionsCommand.ID, new z6.a(6));
            addCommandProvider(GetNotificationsCommand.ID, new CommandProvider() { // from class: jb.i
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new GetNotificationsCommand(it);
                }
            });
            addCommandProvider(GetOptionsCommand.ID, new c4.a(pushManager, 1));
            addCommandProvider("register", new c4.b(pushManager, 2));
            addCommandProvider(RequestTokenCommand.ID, new c(pushManager, 1));
            addCommandProvider(RequestServiceTokenCommand.ID, new d(pushManager, 1));
            addCommandProvider(SetOptionsCommand.ID, new e(pushManager, 2));
            addCommandProvider(UnregisterCommand.ID, new c4.f(pushManager, 2));
            addCommandProvider(AddFavoriteCommand.ID, new g(pushManager, 1));
            addCommandProvider(GetAllMessagesCountCommand.ID, new r7.g(pushManager, i10));
            addCommandProvider(GetMessagesCommand.ID, new h(pushManager, i10));
            addCommandProvider(GetReadMessagesCountCommand.ID, new CommandProvider() { // from class: jb.a
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new GetReadMessagesCountCommand(it);
                }
            });
            addCommandProvider(GetUnreadMessagesCountCommand.ID, new CommandProvider() { // from class: jb.b
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new GetUnreadMessagesCountCommand(it);
                }
            });
            addCommandProvider(RemoveAllMessagesCommand.ID, new CommandProvider() { // from class: jb.c
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new RemoveAllMessagesCommand(it);
                }
            });
            addCommandProvider(RemoveFavoriteCommand.ID, new CommandProvider() { // from class: jb.d
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new RemoveFavoriteCommand(it);
                }
            });
            addCommandProvider(RemoveMessageCommand.ID, new CommandProvider() { // from class: jb.e
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new RemoveMessageCommand(it);
                }
            });
            addCommandProvider(SetAllMessagesReadCommand.ID, new CommandProvider() { // from class: jb.f
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new SetAllMessagesReadCommand(it);
                }
            });
            addCommandProvider(SetMessageReadCommand.ID, new CommandProvider() { // from class: jb.g
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new SetMessageReadCommand(it);
                }
            });
            addCommandProvider(SetMessageUnreadCommand.ID, new CommandProvider() { // from class: jb.h
                @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
                public final AbstractCommand create() {
                    PushManager it = pushManager;
                    Intrinsics.checkNotNullParameter(it, "$it");
                    return new SetMessageUnreadCommand(it);
                }
            });
        }
    }

    /* JADX INFO: compiled from: PushPlugin.kt */
    public static final class b extends Lambda implements Function1<Push, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PluginComponentContainer f35893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PushPlugin f35894q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PluginComponentContainer pluginComponentContainer, PushPlugin pushPlugin) {
            super(1);
            this.f35893p0 = pluginComponentContainer;
            this.f35894q0 = pushPlugin;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Push push) {
            PostMessenger postMessenger;
            Push it = push;
            Intrinsics.checkNotNullParameter(it, "it");
            PluginComponentContainer pluginComponentContainer = this.f35893p0;
            if (pluginComponentContainer != null && (postMessenger = pluginComponentContainer.getPostMessenger()) != null) {
                PushPlugin.access$emitPush(this.f35894q0, postMessenger, it);
            }
            return Unit.INSTANCE;
        }
    }

    public PushPlugin(@NotNull PushManager pushManager) {
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35892a = pushManager;
    }

    public static final void access$emitPush(PushPlugin pushPlugin, PostMessenger postMessenger, Push push) {
        pushPlugin.getClass();
        PushAction pushAction = new PushAction(null, push, 1, null);
        postMessenger.postMessage(pushAction.getAction(), pushAction);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new a(this);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@Nullable PluginComponentContainer components) {
        super.initialize(components);
        this.f35892a.addObserveNewPushes(new b(components, this));
    }
}
