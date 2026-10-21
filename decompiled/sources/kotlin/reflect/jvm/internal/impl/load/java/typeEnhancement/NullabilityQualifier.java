package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NullabilityQualifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NullabilityQualifier[] $VALUES;
    public static final NullabilityQualifier FORCE_FLEXIBILITY;
    public static final NullabilityQualifier NOT_NULL;
    public static final NullabilityQualifier NULLABLE;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        FORCE_FLEXIBILITY = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        NULLABLE = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        NOT_NULL = nullabilityQualifier3;
        NullabilityQualifier[] nullabilityQualifierArr = {nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
        $VALUES = nullabilityQualifierArr;
        $ENTRIES = EnumEntriesKt.enumEntries(nullabilityQualifierArr);
    }

    public NullabilityQualifier() {
        throw null;
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) $VALUES.clone();
    }
}
