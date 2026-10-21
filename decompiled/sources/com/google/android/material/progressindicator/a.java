package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;

/* JADX INFO: compiled from: CircularDrawingDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float f45044f;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f6, boolean z10, boolean z11) {
        float fWidth = rect.width() / i();
        float fHeight = rect.height() / i();
        S s4 = this.f45034a;
        float f10 = (((CircularProgressIndicatorSpec) s4).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s4).indicatorInset;
        canvas.translate((f10 * fWidth) + rect.left, (f10 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) s4).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        this.f45043e = ((CircularProgressIndicatorSpec) s4).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s4).trackCornerRadius;
        this.f45040b = ((CircularProgressIndicatorSpec) s4).trackThickness * f6;
        this.f45041c = Math.min(((CircularProgressIndicatorSpec) s4).trackThickness / 2, ((CircularProgressIndicatorSpec) s4).trackCornerRadius) * f6;
        float f12 = (((CircularProgressIndicatorSpec) s4).indicatorSize - ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f;
        this.f45042d = f12;
        if (z10 || z11) {
            if ((z10 && ((CircularProgressIndicatorSpec) s4).showAnimationBehavior == 2) || (z11 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 1)) {
                this.f45042d = (((1.0f - f6) * ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f) + f12;
            } else if ((z10 && ((CircularProgressIndicatorSpec) s4).showAnimationBehavior == 1) || (z11 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 2)) {
                this.f45042d = f12 - (((1.0f - f6) * ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f);
            }
        }
        if (z11 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 3) {
            this.f45044f = f6;
        } else {
            this.f45044f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.f45037c, i10);
        float f6 = activeIndicator.f45035a;
        float f10 = activeIndicator.f45036b;
        int i11 = activeIndicator.f45038d;
        g(canvas, paint, f6, f10, iCompositeARGBWithAlpha, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void d(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, @ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11, int i12) {
        g(canvas, paint, f6, f10, MaterialColors.compositeARGBWithAlpha(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int e() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int f() {
        return i();
    }

    public final void g(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, @ColorInt int i10, @Px int i11, @Px int i12) {
        float f11 = f10 >= f6 ? f10 - f6 : (f10 + 1.0f) - f6;
        float f12 = f6 % 1.0f;
        if (this.f45044f < 1.0f) {
            float f13 = f12 + f11;
            if (f13 > 1.0f) {
                g(canvas, paint, f12, 1.0f, i10, i11, 0);
                g(canvas, paint, 1.0f, f13, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f45041c / this.f45042d);
        if (f12 == 0.0f && f11 >= 0.99f) {
            f11 += (((degrees * 2.0f) / 360.0f) * (f11 - 0.99f)) / 0.01f;
        }
        float fLerp = MathUtils.lerp(1.0f - this.f45044f, 1.0f, f12);
        float fLerp2 = MathUtils.lerp(0.0f, this.f45044f, f11);
        float degrees2 = (float) Math.toDegrees(i11 / this.f45042d);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f45042d));
        float f14 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f45040b);
        float f15 = degrees * 2.0f;
        if (degrees3 < f15) {
            float f16 = degrees3 / f15;
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, (degrees * f16) + f14, this.f45041c * 2.0f, this.f45040b, f16);
            return;
        }
        float f17 = this.f45042d;
        float f18 = -f17;
        RectF rectF = new RectF(f18, f18, f17, f17);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f45043e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f14 + degrees;
        canvas.drawArc(rectF, f19, degrees3 - f15, false, paint);
        if (this.f45043e || this.f45041c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, f19, this.f45041c * 2.0f, this.f45040b, 1.0f);
        h(canvas, paint, (f14 + degrees3) - degrees, this.f45041c * 2.0f, this.f45040b, 1.0f);
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, float f11, float f12) {
        float fMin = (int) Math.min(f11, this.f45040b);
        float f13 = f10 / 2.0f;
        float fMin2 = Math.min(f13, (this.f45041c * fMin) / this.f45040b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f10) / 2.0f, fMin / 2.0f, f13);
        canvas.save();
        double d2 = f6;
        canvas.translate((float) (Math.cos(Math.toRadians(d2)) * ((double) this.f45042d)), (float) (Math.sin(Math.toRadians(d2)) * ((double) this.f45042d)));
        canvas.rotate(f6);
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int i() {
        S s4 = this.f45034a;
        return (((CircularProgressIndicatorSpec) s4).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s4).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11) {
    }
}
