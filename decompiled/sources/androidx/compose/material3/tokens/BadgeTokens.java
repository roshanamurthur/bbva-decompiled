package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BadgeTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R \u0010%\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "b", "getLargeColor", "LargeColor", "c", "getLargeLabelTextColor", "LargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "d", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLargeLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getLargeShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Landroidx/compose/ui/unit/Dp;", "f", "F", "getLargeSize-D9Ej5fM", "()F", "LargeSize", "g", "getShape", "Shape", "h", "getSize-D9Ej5fM", "Size", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,33:1\n164#2:34\n164#2:35\n*S KotlinDebug\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n*L\n29#1:34\n31#1:35\n*E\n"})
public final class BadgeTokens {

    @NotNull
    public static final BadgeTokens INSTANCE = new BadgeTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens Color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LargeColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LargeLabelTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LargeLabelTextFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens LargeShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float LargeSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens Shape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
        LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        LargeSize = Dp.m4389constructorimpl((float) 16.0d);
        Shape = shapeKeyTokens;
        Size = Dp.m4389constructorimpl((float) 6.0d);
    }

    @NotNull
    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    @NotNull
    public final ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* JADX INFO: renamed from: getLargeSize-D9Ej5fM, reason: not valid java name */
    public final float m1513getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    @NotNull
    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1514getSizeD9Ej5fM() {
        return Size;
    }
}
