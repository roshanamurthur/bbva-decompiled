package aj;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AlertDialogBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALERT;
    public static final c PROGRESS;

    static {
        c cVar = new c("ALERT", 0);
        ALERT = cVar;
        c cVar2 = new c("PROGRESS", 1);
        PROGRESS = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = EnumEntriesKt.enumEntries(cVarArr);
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
