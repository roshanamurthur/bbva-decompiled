package mx.openpay.library.domain.model.taponphone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NotifyUserItem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/taponphone/NotifyUserItem;", "", "IDLE", "PROCESSING", "INITIALIZE_KEYS", "BRING_CARD_CLOSER", "DO_NOT_REMOVE_CARD", "MOVE_CARD_AWAY", "CANCELLING", "SEE_DEVICE", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class NotifyUserItem {
    private static final /* synthetic */ NotifyUserItem[] $VALUES;
    public static final NotifyUserItem BRING_CARD_CLOSER;
    public static final NotifyUserItem CANCELLING;
    public static final NotifyUserItem DO_NOT_REMOVE_CARD;
    public static final NotifyUserItem IDLE;
    public static final NotifyUserItem INITIALIZE_KEYS;
    public static final NotifyUserItem MOVE_CARD_AWAY;
    public static final NotifyUserItem PROCESSING;
    public static final NotifyUserItem SEE_DEVICE;

    static {
        NotifyUserItem notifyUserItem = new NotifyUserItem("IDLE", 0);
        IDLE = notifyUserItem;
        NotifyUserItem notifyUserItem2 = new NotifyUserItem("PROCESSING", 1);
        PROCESSING = notifyUserItem2;
        NotifyUserItem notifyUserItem3 = new NotifyUserItem("INITIALIZE_KEYS", 2);
        INITIALIZE_KEYS = notifyUserItem3;
        NotifyUserItem notifyUserItem4 = new NotifyUserItem("BRING_CARD_CLOSER", 3);
        BRING_CARD_CLOSER = notifyUserItem4;
        NotifyUserItem notifyUserItem5 = new NotifyUserItem("DO_NOT_REMOVE_CARD", 4);
        DO_NOT_REMOVE_CARD = notifyUserItem5;
        NotifyUserItem notifyUserItem6 = new NotifyUserItem("MOVE_CARD_AWAY", 5);
        MOVE_CARD_AWAY = notifyUserItem6;
        NotifyUserItem notifyUserItem7 = new NotifyUserItem("CANCELLING", 6);
        CANCELLING = notifyUserItem7;
        NotifyUserItem notifyUserItem8 = new NotifyUserItem("SEE_DEVICE", 7);
        SEE_DEVICE = notifyUserItem8;
        $VALUES = new NotifyUserItem[]{notifyUserItem, notifyUserItem2, notifyUserItem3, notifyUserItem4, notifyUserItem5, notifyUserItem6, notifyUserItem7, notifyUserItem8};
    }

    public NotifyUserItem() {
        throw null;
    }

    public static NotifyUserItem valueOf(String str) {
        return (NotifyUserItem) Enum.valueOf(NotifyUserItem.class, str);
    }

    public static NotifyUserItem[] values() {
        return (NotifyUserItem[]) $VALUES.clone();
    }
}
