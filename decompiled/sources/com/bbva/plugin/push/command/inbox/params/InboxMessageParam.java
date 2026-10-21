package com.bbva.plugin.push.command.inbox.params;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InboxParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/push/command/inbox/params/InboxMessageParam;", "Lcom/bbva/plugin/push/command/inbox/params/InboxParams;", "serviceId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InboxMessageParam extends InboxParams {

    @Nullable
    private final String messageId;

    public InboxMessageParam(@Nullable String str, @Nullable String str2) {
        super(str);
        this.messageId = str2;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }
}
