package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ShapeKeyTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/tokens/ShapeKeyTokens;", "", "CornerExtraLarge", "CornerExtraLargeTop", "CornerExtraSmall", "CornerExtraSmallTop", "CornerFull", "CornerLarge", "CornerLargeEnd", "CornerLargeTop", "CornerMedium", "CornerNone", "CornerSmall", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ShapeKeyTokens {
    private static final /* synthetic */ ShapeKeyTokens[] $VALUES;
    public static final ShapeKeyTokens CornerExtraLarge;
    public static final ShapeKeyTokens CornerExtraLargeTop;
    public static final ShapeKeyTokens CornerExtraSmall;
    public static final ShapeKeyTokens CornerExtraSmallTop;
    public static final ShapeKeyTokens CornerFull;
    public static final ShapeKeyTokens CornerLarge;
    public static final ShapeKeyTokens CornerLargeEnd;
    public static final ShapeKeyTokens CornerLargeTop;
    public static final ShapeKeyTokens CornerMedium;
    public static final ShapeKeyTokens CornerNone;
    public static final ShapeKeyTokens CornerSmall;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraLarge", 0);
        CornerExtraLarge = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLargeTop", 1);
        CornerExtraLargeTop = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraSmall", 2);
        CornerExtraSmall = shapeKeyTokens3;
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraSmallTop", 3);
        CornerExtraSmallTop = shapeKeyTokens4;
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerFull", 4);
        CornerFull = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerLarge", 5);
        CornerLarge = shapeKeyTokens6;
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerLargeEnd", 6);
        CornerLargeEnd = shapeKeyTokens7;
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLargeTop", 7);
        CornerLargeTop = shapeKeyTokens8;
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerMedium", 8);
        CornerMedium = shapeKeyTokens9;
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerNone", 9);
        CornerNone = shapeKeyTokens10;
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerSmall", 10);
        CornerSmall = shapeKeyTokens11;
        $VALUES = new ShapeKeyTokens[]{shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11};
    }

    public ShapeKeyTokens() {
        throw null;
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }
}
