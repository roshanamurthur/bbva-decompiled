package com.bbva.notifications;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NotificationConstants.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/notifications/NotificationType;", "", "OOB", "OOB_TIMEOUT", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType OOB;
    public static final NotificationType OOB_TIMEOUT;

    static {
        NotificationType notificationType = new NotificationType("OOB", 0);
        OOB = notificationType;
        NotificationType notificationType2 = new NotificationType("OOB_TIMEOUT", 1);
        OOB_TIMEOUT = notificationType2;
        NotificationType[] notificationTypeArr = {notificationType, notificationType2};
        $VALUES = notificationTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(notificationTypeArr);
    }

    public NotificationType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<NotificationType> getEntries() {
        return $ENTRIES;
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }
}
