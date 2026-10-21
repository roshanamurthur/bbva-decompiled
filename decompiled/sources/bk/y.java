package bk;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y Done;
    public static final y Failed;
    public static final y NotReady;
    public static final y Ready;

    static {
        y yVar = new y("Ready", 0);
        Ready = yVar;
        y yVar2 = new y("NotReady", 1);
        NotReady = yVar2;
        y yVar3 = new y("Done", 2);
        Done = yVar3;
        y yVar4 = new y("Failed", 3);
        Failed = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        $VALUES = yVarArr;
        $ENTRIES = EnumEntriesKt.enumEntries(yVarArr);
    }

    public y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
