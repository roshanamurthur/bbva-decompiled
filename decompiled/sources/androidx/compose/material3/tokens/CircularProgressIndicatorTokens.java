package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CircularProgressIndicatorTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\"\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveShape", "Landroidx/compose/ui/unit/Dp;", "c", "F", "getActiveIndicatorWidth-D9Ej5fM", "()F", "ActiveIndicatorWidth", "d", "getFourColorActiveIndicatorFourColor", "FourColorActiveIndicatorFourColor", "e", "getFourColorActiveIndicatorOneColor", "FourColorActiveIndicatorOneColor", "f", "getFourColorActiveIndicatorThreeColor", "FourColorActiveIndicatorThreeColor", "g", "getFourColorActiveIndicatorTwoColor", "FourColorActiveIndicatorTwoColor", "h", "getSize-D9Ej5fM", "Size", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCircularProgressIndicatorTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/CircularProgressIndicatorTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,32:1\n164#2:33\n164#2:34\n*S KotlinDebug\n*F\n+ 1 CircularProgressIndicatorTokens.kt\nandroidx/compose/material3/tokens/CircularProgressIndicatorTokens\n*L\n26#1:33\n31#1:34\n*E\n"})
public final class CircularProgressIndicatorTokens {

    @NotNull
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveIndicatorColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ActiveShape;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ActiveIndicatorWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ActiveShape = ShapeKeyTokens.CornerNone;
        ActiveIndicatorWidth = Dp.m4389constructorimpl((float) 4.0d);
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        Size = Dp.m4389constructorimpl((float) 48.0d);
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m1537getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    @NotNull
    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorFourColor() {
        return FourColorActiveIndicatorFourColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorOneColor() {
        return FourColorActiveIndicatorOneColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorThreeColor() {
        return FourColorActiveIndicatorThreeColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFourColorActiveIndicatorTwoColor() {
        return FourColorActiveIndicatorTwoColor;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1538getSizeD9Ej5fM() {
        return Size;
    }
}
