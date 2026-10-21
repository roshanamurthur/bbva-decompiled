package com.bbva.plugin.push.command.inbox;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.response.GetMessagesResponseKt;
import com.bbva.plugin.push.command.response.WebBulkMessagesResponse;
import com.bbva.push.model.MessageBulk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetMessagesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<MessageBulk, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35979p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GetMessagesCommand f35980q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommandCallback commandCallback, GetMessagesCommand getMessagesCommand) {
        super(1);
        this.f35979p0 = commandCallback;
        this.f35980q0 = getMessagesCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MessageBulk messageBulk) {
        MessageBulk messageBulk2 = messageBulk;
        Intrinsics.checkNotNullParameter(messageBulk2, "messageBulk");
        this.f35979p0.sendEvent(new JSONObject(((AbstractCommand) this.f35980q0).mGson.toJson(new WebBulkMessagesResponse(GetMessagesResponseKt.toWebMessagesResponse(messageBulk2)))));
        return Unit.INSTANCE;
    }
}
