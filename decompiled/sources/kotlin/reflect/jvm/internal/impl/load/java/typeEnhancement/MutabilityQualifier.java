package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class MutabilityQualifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MutabilityQualifier[] $VALUES;
    public static final MutabilityQualifier MUTABLE;
    public static final MutabilityQualifier READ_ONLY;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        READ_ONLY = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        MUTABLE = mutabilityQualifier2;
        MutabilityQualifier[] mutabilityQualifierArr = {mutabilityQualifier, mutabilityQualifier2};
        $VALUES = mutabilityQualifierArr;
        $ENTRIES = EnumEntriesKt.enumEntries(mutabilityQualifierArr);
    }

    public MutabilityQualifier() {
        throw null;
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) $VALUES.clone();
    }
}
