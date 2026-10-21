package com.bbva.push.inbox;

import com.bbva.push.model.MessageBulk;
import com.bbva.push.tracker.Tracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Inbox.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0011\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010\n\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/push/inbox/Inbox;", "Lcom/bbva/push/tracker/Tracker;", "addFavorite", "", "id", "", "getAllMessagesCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReadMessagesCount", "getAllUnreadMessagesCount", "getMessages", "callback", "Lkotlin/Function1;", "Lcom/bbva/push/model/MessageBulk;", "removeAllMessages", "removeFavorite", "removeMessage", "setAllMessagesRead", "setMessageRead", "setMessageUnread", "track", "notificationId", "action", "data", "", "", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Inbox extends Tracker {

    /* JADX INFO: compiled from: Inbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void track(@NotNull Inbox inbox, @NotNull String notificationId, @NotNull String action, @NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(notificationId, "notificationId");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    void addFavorite(@NotNull String id);

    @Nullable
    Object getAllMessagesCount(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getAllReadMessagesCount(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getAllUnreadMessagesCount(@NotNull Continuation<? super Integer> continuation);

    void getMessages(@NotNull Function1<? super MessageBulk, Unit> callback);

    void removeAllMessages();

    void removeFavorite(@NotNull String id);

    void removeMessage(@NotNull String id);

    void setAllMessagesRead();

    void setMessageRead(@NotNull String id);

    void setMessageUnread(@NotNull String id);

    @Override // com.bbva.push.tracker.Tracker
    void track(@NotNull String notificationId, @NotNull String action, @NotNull Map<String, ? extends Object> data);
}
