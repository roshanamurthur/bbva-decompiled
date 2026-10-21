package com.google.zxing.pdf417.encoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Compaction {
    private static final /* synthetic */ Compaction[] $VALUES;
    public static final Compaction AUTO;
    public static final Compaction BYTE;
    public static final Compaction NUMERIC;
    public static final Compaction TEXT;

    static {
        Compaction compaction = new Compaction("AUTO", 0);
        AUTO = compaction;
        Compaction compaction2 = new Compaction("TEXT", 1);
        TEXT = compaction2;
        Compaction compaction3 = new Compaction("BYTE", 2);
        BYTE = compaction3;
        Compaction compaction4 = new Compaction("NUMERIC", 3);
        NUMERIC = compaction4;
        $VALUES = new Compaction[]{compaction, compaction2, compaction3, compaction4};
    }

    public Compaction() {
        throw null;
    }

    public static Compaction valueOf(String str) {
        return (Compaction) Enum.valueOf(Compaction.class, str);
    }

    public static Compaction[] values() {
        return (Compaction[]) $VALUES.clone();
    }
}
