package com.bbva.push.inbox;

import com.bbva.push.model.MessageBulk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultInbox.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\u000b\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/bbva/push/inbox/DefaultInbox;", "Lcom/bbva/push/inbox/Inbox;", "()V", "addFavorite", "", "id", "", "getAllMessagesCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReadMessagesCount", "getAllUnreadMessagesCount", "getMessages", "callback", "Lkotlin/Function1;", "Lcom/bbva/push/model/MessageBulk;", "removeAllMessages", "removeFavorite", "removeMessage", "setAllMessagesRead", "setMessageRead", "setMessageUnread", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultInbox implements Inbox {
    @Override // com.bbva.push.inbox.Inbox
    public void addFavorite(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(0);
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllReadMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(0);
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllUnreadMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(0);
    }

    @Override // com.bbva.push.inbox.Inbox
    public void getMessages(@NotNull Function1<? super MessageBulk, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(new MessageBulk(CollectionsKt__CollectionsKt.emptyList()));
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeFavorite(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeMessage(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setMessageRead(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setMessageUnread(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox, com.bbva.push.tracker.Tracker
    public void track(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        Inbox.DefaultImpls.track(this, str, str2, map);
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeAllMessages() {
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setAllMessagesRead() {
    }
}
