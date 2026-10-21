package androidx.compose.ui.text;

import a1.c;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001am\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001ai\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "drawText", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,398:1\n261#2,11:399\n261#2,11:410\n261#2,8:421\n269#2,3:432\n261#2,11:435\n652#3:429\n658#3:430\n646#3:431\n159#4:446\n159#4:447\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:399,11\n233#1:410,11\n277#1:421,8\n277#1:432,3\n337#1:435,11\n284#1:429\n297#1:430\n297#1:431\n375#1:446\n387#1:447\n*E\n"})
public final class TextPainterKt {
    public static final void a(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m4336equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8())) {
            return;
        }
        c.d(drawTransform, 0.0f, 0.0f, IntSize.m4549getWidthimpl(textLayoutResult.getSize()), IntSize.m4548getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    public static final long b(DrawScope drawScope, long j10, long j11) {
        int iRoundToInt;
        int iRoundToInt2;
        int iRoundToInt3;
        Size.Companion companion = Size.INSTANCE;
        int iRoundToInt4 = 0;
        if (j10 == companion.m2352getUnspecifiedNHjbRc() || Float.isNaN(Size.m2344getWidthimpl(j10))) {
            iRoundToInt = mk.c.roundToInt((float) Math.ceil(Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc()) - Offset.m2275getXimpl(j11)));
            iRoundToInt2 = 0;
        } else {
            iRoundToInt2 = mk.c.roundToInt((float) Math.ceil(Size.m2344getWidthimpl(j10)));
            iRoundToInt = iRoundToInt2;
        }
        if (j10 == companion.m2352getUnspecifiedNHjbRc() || Float.isNaN(Size.m2341getHeightimpl(j10))) {
            iRoundToInt3 = mk.c.roundToInt((float) Math.ceil(Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc()) - Offset.m2276getYimpl(j11)));
        } else {
            iRoundToInt4 = mk.c.roundToInt((float) Math.ceil(Size.m2341getHeightimpl(j10)));
            iRoundToInt3 = iRoundToInt4;
        }
        return ConstraintsKt.Constraints(iRoundToInt2, iRoundToInt, iRoundToInt4, iRoundToInt3);
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m3947drawTextJFhB2K4(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull AnnotatedString text, long j10, @NotNull TextStyle style, int i10, boolean z10, int i11, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long j11, int i12) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        TextLayoutResult textLayoutResultM3944measurexDpz5zY$default = TextMeasurer.m3944measurexDpz5zY$default(textMeasurer, text, style, i10, z10, i11, placeholders, b(drawText, j11, j10), drawText.getLayoutDirection(), drawText, null, false, 1536, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10));
        a(transform, textLayoutResultM3944measurexDpz5zY$default);
        textLayoutResultM3944measurexDpz5zY$default.getMultiParagraph().m3871paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i12);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m3949drawTextLVfH_YU(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, @NotNull Brush brush, long j10, float f6, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i10) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10));
        a(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m3873painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f6) ? f6 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i10);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m3951drawTextTPWCCtM(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull String text, long j10, @NotNull TextStyle style, int i10, boolean z10, int i11, long j11, int i12) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        TextLayoutResult textLayoutResultM3944measurexDpz5zY$default = TextMeasurer.m3944measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, i10, z10, i11, null, b(drawText, j11, j10), drawText.getLayoutDirection(), drawText, null, false, 1568, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10));
        a(transform, textLayoutResultM3944measurexDpz5zY$default);
        textLayoutResultM3944measurexDpz5zY$default.getMultiParagraph().m3871paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : i12);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m3953drawTextd8rzKo(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, long j10, long j11, float f6, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i10) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2275getXimpl(j11), Offset.m2276getYimpl(j11));
        a(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush == null || j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            textLayoutResult.getMultiParagraph().m3871paintLG529CI(drawText.getDrawContext().getCanvas(), TextDrawStyleKt.m4314modulateDxMtmZc(j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU() ? j10 : textLayoutResult.getLayoutInput().getStyle().m3988getColor0d7_KjU(), f6), shadow2, textDecoration2, drawStyle2, i10);
        } else {
            textLayoutResult.getMultiParagraph().m3873painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f6) ? f6 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i10);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }
}
