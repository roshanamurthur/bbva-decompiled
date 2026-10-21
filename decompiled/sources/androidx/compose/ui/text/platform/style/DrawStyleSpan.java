package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawStyleSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "p0", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawStyle drawStyle;

    public DrawStyleSpan(@NotNull DrawStyle drawStyle) {
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        this.drawStyle = drawStyle;
    }

    @NotNull
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            Fill fill = Fill.INSTANCE;
            DrawStyle drawStyle = this.drawStyle;
            if (Intrinsics.areEqual(drawStyle, fill)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) drawStyle).getMiter());
                int join2 = ((Stroke) drawStyle).getJoin();
                StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
                if (StrokeJoin.m2814equalsimpl0(join2, companion.m2819getMiterLxFBmk8())) {
                    join = Paint.Join.MITER;
                } else if (StrokeJoin.m2814equalsimpl0(join2, companion.m2820getRoundLxFBmk8())) {
                    join = Paint.Join.ROUND;
                } else {
                    join = StrokeJoin.m2814equalsimpl0(join2, companion.m2818getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int cap2 = ((Stroke) drawStyle).getCap();
                StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
                if (StrokeCap.m2804equalsimpl0(cap2, companion2.m2808getButtKaPHkGw())) {
                    cap = Paint.Cap.BUTT;
                } else if (StrokeCap.m2804equalsimpl0(cap2, companion2.m2809getRoundKaPHkGw())) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = StrokeCap.m2804equalsimpl0(cap2, companion2.m2810getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                PathEffect pathEffect = ((Stroke) drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }
}
