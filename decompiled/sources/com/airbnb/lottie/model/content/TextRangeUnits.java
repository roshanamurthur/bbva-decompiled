package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TextRangeUnits {
    private static final /* synthetic */ TextRangeUnits[] $VALUES;
    public static final TextRangeUnits INDEX;
    public static final TextRangeUnits PERCENT;

    static {
        TextRangeUnits textRangeUnits = new TextRangeUnits("PERCENT", 0);
        PERCENT = textRangeUnits;
        TextRangeUnits textRangeUnits2 = new TextRangeUnits("INDEX", 1);
        INDEX = textRangeUnits2;
        $VALUES = new TextRangeUnits[]{textRangeUnits, textRangeUnits2};
    }

    public TextRangeUnits() {
        throw null;
    }

    public static TextRangeUnits valueOf(String str) {
        return (TextRangeUnits) Enum.valueOf(TextRangeUnits.class, str);
    }

    public static TextRangeUnits[] values() {
        return (TextRangeUnits[]) $VALUES.clone();
    }
}
