package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/DeprecationLevel;", "", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class DeprecationLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeprecationLevel[] $VALUES;
    public static final DeprecationLevel ERROR;
    public static final DeprecationLevel HIDDEN;
    public static final DeprecationLevel WARNING;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        WARNING = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        ERROR = deprecationLevel2;
        DeprecationLevel deprecationLevel3 = new DeprecationLevel("HIDDEN", 2);
        HIDDEN = deprecationLevel3;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, deprecationLevel3};
        $VALUES = deprecationLevelArr;
        $ENTRIES = EnumEntriesKt.enumEntries(deprecationLevelArr);
    }

    public DeprecationLevel() {
        throw null;
    }

    @NotNull
    public static EnumEntries<DeprecationLevel> getEntries() {
        return $ENTRIES;
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) $VALUES.clone();
    }
}
