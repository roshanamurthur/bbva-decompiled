package androidx.compose.ui.text.android.animation;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SegmentType.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentType;", "", "Document", "Paragraph", "Line", "Word", "Character", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class SegmentType {
    private static final /* synthetic */ SegmentType[] $VALUES;
    public static final SegmentType Character;
    public static final SegmentType Document;
    public static final SegmentType Line;
    public static final SegmentType Paragraph;
    public static final SegmentType Word;

    static {
        SegmentType segmentType = new SegmentType("Document", 0);
        Document = segmentType;
        SegmentType segmentType2 = new SegmentType("Paragraph", 1);
        Paragraph = segmentType2;
        SegmentType segmentType3 = new SegmentType("Line", 2);
        Line = segmentType3;
        SegmentType segmentType4 = new SegmentType("Word", 3);
        Word = segmentType4;
        SegmentType segmentType5 = new SegmentType("Character", 4);
        Character = segmentType5;
        $VALUES = new SegmentType[]{segmentType, segmentType2, segmentType3, segmentType4, segmentType5};
    }

    public SegmentType() {
        throw null;
    }

    public static SegmentType valueOf(String str) {
        return (SegmentType) Enum.valueOf(SegmentType.class, str);
    }

    public static SegmentType[] values() {
        return (SegmentType[]) $VALUES.clone();
    }
}
