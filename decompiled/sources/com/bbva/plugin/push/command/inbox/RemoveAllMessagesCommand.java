package com.bbva.plugin.push.command.inbox;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.inbox.params.InboxParams;
import com.bbva.plugin.push.command.validator.InboxParamsValidator;
import com.bbva.plugin.push.extension.PushManagerKt;
import com.bbva.push.PushManager;
import com.bbva.push.inbox.Inbox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveAllMessagesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/push/command/inbox/RemoveAllMessagesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/inbox/params/InboxParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class RemoveAllMessagesCommand extends AbstractCommand<InboxParams> {

    @NotNull
    public static final String ID = "removeallmessages";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35959p0;

    /* JADX INFO: compiled from: RemoveAllMessagesCommand.kt */
    public static final class a extends Lambda implements Function1<Inbox, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35960p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f35960p0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Inbox inbox) {
            Inbox it = inbox;
            Intrinsics.checkNotNullParameter(it, "it");
            it.removeAllMessages();
            this.f35960p0.sendEvent();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAllMessagesCommand(@NotNull PushManager pushManager) {
        super(InboxParams.class, new InboxParamsValidator());
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35959p0 = pushManager;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable InboxParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String serviceId = params != null ? params.getServiceId() : null;
        Intrinsics.checkNotNull(serviceId);
        PushManagerKt.executeWithInbox(this.f35959p0, serviceId, callback, new a(callback));
    }
}
