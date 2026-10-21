package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TypeUsage.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeUsage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeUsage[] $VALUES;
    public static final TypeUsage COMMON;
    public static final TypeUsage SUPERTYPE;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        SUPERTYPE = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage(CodePackage.COMMON, 1);
        COMMON = typeUsage2;
        TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        $VALUES = typeUsageArr;
        $ENTRIES = EnumEntriesKt.enumEntries(typeUsageArr);
    }

    public TypeUsage() {
        throw null;
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) $VALUES.clone();
    }
}
