package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: JavaTypeFlexibility.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaTypeFlexibility {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JavaTypeFlexibility[] $VALUES;
    public static final JavaTypeFlexibility FLEXIBLE_LOWER_BOUND;
    public static final JavaTypeFlexibility FLEXIBLE_UPPER_BOUND;
    public static final JavaTypeFlexibility INFLEXIBLE;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        INFLEXIBLE = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = javaTypeFlexibility3;
        JavaTypeFlexibility[] javaTypeFlexibilityArr = {javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
        $VALUES = javaTypeFlexibilityArr;
        $ENTRIES = EnumEntriesKt.enumEntries(javaTypeFlexibilityArr);
    }

    public JavaTypeFlexibility() {
        throw null;
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) $VALUES.clone();
    }
}
