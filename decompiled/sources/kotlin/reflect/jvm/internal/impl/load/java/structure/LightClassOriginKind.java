package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LightClassOriginKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LightClassOriginKind[] $VALUES;
    public static final LightClassOriginKind BINARY;
    public static final LightClassOriginKind SOURCE;

    static {
        LightClassOriginKind lightClassOriginKind = new LightClassOriginKind("SOURCE", 0);
        SOURCE = lightClassOriginKind;
        LightClassOriginKind lightClassOriginKind2 = new LightClassOriginKind("BINARY", 1);
        BINARY = lightClassOriginKind2;
        LightClassOriginKind[] lightClassOriginKindArr = {lightClassOriginKind, lightClassOriginKind2};
        $VALUES = lightClassOriginKindArr;
        $ENTRIES = EnumEntriesKt.enumEntries(lightClassOriginKindArr);
    }

    public LightClassOriginKind() {
        throw null;
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) $VALUES.clone();
    }
}
