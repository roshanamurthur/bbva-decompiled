package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TypeComponentPosition.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeComponentPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeComponentPosition[] $VALUES;
    public static final TypeComponentPosition FLEXIBLE_LOWER;
    public static final TypeComponentPosition FLEXIBLE_UPPER;
    public static final TypeComponentPosition INFLEXIBLE;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        FLEXIBLE_LOWER = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        FLEXIBLE_UPPER = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        INFLEXIBLE = typeComponentPosition3;
        TypeComponentPosition[] typeComponentPositionArr = {typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
        $VALUES = typeComponentPositionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(typeComponentPositionArr);
    }

    public TypeComponentPosition() {
        throw null;
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) $VALUES.clone();
    }
}
