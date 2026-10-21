package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0.c;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextPainter {
    public static final int $stable = 0;

    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        boolean z10 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m4336equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8());
        if (z10) {
            Rect rectM2315Recttz77jQw = RectKt.m2315Recttz77jQw(Offset.INSTANCE.m2291getZeroF1C5BW0(), SizeKt.Size(IntSize.m4549getWidthimpl(textLayoutResult.getSize()), IntSize.m4548getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            c.o(canvas, rectM2315Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle.getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().m3873painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getAlpha() : 1.0f, (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : 0);
            } else {
                textLayoutResult.getMultiParagraph().m3871paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().mo4315getColor0d7_KjU() : Color.INSTANCE.m2534getBlack0d7_KjU(), (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z10) {
                canvas.restore();
            }
        }
    }
}
