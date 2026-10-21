package com.bbva.push.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InboxModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/push/model/MessageBulk;", "", "messages", "", "Lcom/bbva/push/model/Message;", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageBulk {

    @NotNull
    private final List<Message> messages;

    public MessageBulk(@NotNull List<Message> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }

    @NotNull
    public final List<Message> getMessages() {
        return this.messages;
    }
}
