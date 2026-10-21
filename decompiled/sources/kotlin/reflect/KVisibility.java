package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: KVisibility.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class KVisibility {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KVisibility[] $VALUES;
    public static final KVisibility INTERNAL;
    public static final KVisibility PRIVATE;
    public static final KVisibility PROTECTED;
    public static final KVisibility PUBLIC;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        PUBLIC = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        PROTECTED = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        INTERNAL = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        PRIVATE = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        $VALUES = kVisibilityArr;
        $ENTRIES = EnumEntriesKt.enumEntries(kVisibilityArr);
    }

    public KVisibility() {
        throw null;
    }

    @NotNull
    public static EnumEntries<KVisibility> getEntries() {
        return $ENTRIES;
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) $VALUES.clone();
    }
}
