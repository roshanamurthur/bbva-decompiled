package com.bbva.notifications.delegate;

import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LogEventDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J4\u0010\u0006\u001a\u00020\u00032*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\tH&J4\u0010\n\u001a\u00020\u00032*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\tH&¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/delegate/LogEventDelegate;", "", "storeInformPushAction", "", "method", "", "storeSelectPushAction", "notificationMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "storeVisualizePushAction", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LogEventDelegate {
    void storeInformPushAction(@NotNull String method);

    void storeSelectPushAction(@Nullable HashMap<String, Object> notificationMap);

    void storeVisualizePushAction(@Nullable HashMap<String, Object> notificationMap);
}
