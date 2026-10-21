package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020\u0012¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0016\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'*\u0004\b(\u0010)\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "", "setTextDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/Color;", "color", "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "c", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", "getShadow$ui_text_release$annotations", "()V", "Landroidx/compose/ui/graphics/BlendMode;", "<set-?>", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;)Ljava/lang/Object;", "blendMode", "", "flags", "density", "<init>", "(IF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
public final class AndroidTextPaint extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f18200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public TextDecoration f18201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Shadow shadow;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public DrawStyle f18203d;

    public AndroidTextPaint(int i10, float f6) {
        super(i10);
        ((TextPaint) this).density = f6;
        this.f18200a = AndroidPaint_androidKt.asComposePaint(this);
        this.f18201b = TextDecoration.INSTANCE.getNone();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m4184setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j10, float f6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f6 = Float.NaN;
        }
        androidTextPaint.m4187setBrush12SF9DM(brush, j10, f6);
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4185getBlendMode0nO6VwU() {
        return this.f18200a.mo2389getBlendMode0nO6VwU();
    }

    @NotNull
    /* JADX INFO: renamed from: getShadow$ui_text_release, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m4186setBlendModes9anfk8(int i10) {
        this.f18200a.mo2395setBlendModes9anfk8(i10);
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m4187setBrush12SF9DM(@Nullable Brush brush, long size, float alpha) {
        boolean z10 = brush instanceof SolidColor;
        Paint paint = this.f18200a;
        if ((z10 && ((SolidColor) brush).getValue() != Color.INSTANCE.m2544getUnspecified0d7_KjU()) || ((brush instanceof ShaderBrush) && size != Size.INSTANCE.m2352getUnspecifiedNHjbRc())) {
            brush.mo2461applyToPq9zytI(size, paint, Float.isNaN(alpha) ? paint.getAlpha() : c.coerceIn(alpha, 0.0f, 1.0f));
        } else if (brush == null) {
            paint.setShader(null);
        }
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m4188setColor8_81llA(long color) {
        if (color != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            Paint paint = this.f18200a;
            paint.mo2396setColor8_81llA(color);
            paint.setShader(null);
        }
    }

    public final void setDrawStyle(@Nullable DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.f18203d, drawStyle)) {
            return;
        }
        this.f18203d = drawStyle;
        boolean zAreEqual = Intrinsics.areEqual(drawStyle, Fill.INSTANCE);
        Paint paint = this.f18200a;
        if (zAreEqual) {
            paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2735getFillTiuSbCo());
            return;
        }
        if (drawStyle instanceof Stroke) {
            paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2736getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiterLimit(stroke.getMiter());
            paint.mo2399setStrokeJoinWw9F2mQ(stroke.getJoin());
            paint.mo2398setStrokeCapBeK7IIE(stroke.getCap());
            paint.setPathEffect(stroke.getPathEffect());
        }
    }

    public final void setShadow(@Nullable Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m2275getXimpl(this.shadow.getOffset()), Offset.m2276getYimpl(this.shadow.getOffset()), ColorKt.m2561toArgb8_81llA(this.shadow.getColor()));
        }
    }

    public final void setShadow$ui_text_release(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "<set-?>");
        this.shadow = shadow;
    }

    public final void setTextDecoration(@Nullable TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.f18201b, textDecoration)) {
            return;
        }
        this.f18201b = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.f18201b.contains(companion.getLineThrough()));
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }
}
