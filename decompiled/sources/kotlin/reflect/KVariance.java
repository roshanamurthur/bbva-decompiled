package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: KVariance.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/KVariance;", "", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class KVariance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KVariance[] $VALUES;
    public static final KVariance IN;
    public static final KVariance INVARIANT;
    public static final KVariance OUT;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        INVARIANT = kVariance;
        KVariance kVariance2 = new KVariance("IN", 1);
        IN = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        OUT = kVariance3;
        KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        $VALUES = kVarianceArr;
        $ENTRIES = EnumEntriesKt.enumEntries(kVarianceArr);
    }

    public KVariance() {
        throw null;
    }

    @NotNull
    public static EnumEntries<KVariance> getEntries() {
        return $ENTRIES;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) $VALUES.clone();
    }
}
