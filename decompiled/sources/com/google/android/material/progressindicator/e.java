package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: compiled from: LinearDrawingDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float f45072f;

    public e(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f45068b = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f6, boolean z10, boolean z11) {
        this.f45068b = rect.width();
        S s4 = this.f45034a;
        float f10 = ((LinearProgressIndicatorSpec) s4).trackThickness;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f10) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) s4).f45039a) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f45068b / 2.0f;
        float f12 = f10 / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        this.f45071e = ((LinearProgressIndicatorSpec) s4).trackThickness / 2 == ((LinearProgressIndicatorSpec) s4).trackCornerRadius;
        this.f45069c = ((LinearProgressIndicatorSpec) s4).trackThickness * f6;
        this.f45070d = Math.min(((LinearProgressIndicatorSpec) s4).trackThickness / 2, ((LinearProgressIndicatorSpec) s4).trackCornerRadius) * f6;
        if (z10 || z11) {
            if ((z10 && ((LinearProgressIndicatorSpec) s4).showAnimationBehavior == 2) || (z11 && ((LinearProgressIndicatorSpec) s4).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((LinearProgressIndicatorSpec) s4).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f6) * ((LinearProgressIndicatorSpec) s4).trackThickness) / 2.0f);
            }
        }
        if (z11 && ((LinearProgressIndicatorSpec) s4).hideAnimationBehavior == 3) {
            this.f45072f = f6;
        } else {
            this.f45072f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i10, i11);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f45034a;
        if (linearProgressIndicatorSpec.trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.f45068b / 2.0f) - (this.f45069c / 2.0f), 0.0f);
        int i12 = linearProgressIndicatorSpec.trackStopIndicatorSize;
        h(canvas, paint, pointF, null, i12, i12);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.f45037c, i10);
        float f6 = activeIndicator.f45035a;
        float f10 = activeIndicator.f45036b;
        int i11 = activeIndicator.f45038d;
        g(canvas, paint, f6, f10, iCompositeARGBWithAlpha, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void d(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, int i10, int i11, @Px int i12) {
        g(canvas, paint, f6, f10, MaterialColors.compositeARGBWithAlpha(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int e() {
        return ((LinearProgressIndicatorSpec) this.f45034a).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int f() {
        return -1;
    }

    public final void g(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, @ColorInt int i10, @Px int i11, @Px int i12) {
        float fClamp = MathUtils.clamp(f6, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f10, 0.0f, 1.0f);
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.f45072f, 1.0f, fClamp);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.f45072f, 1.0f, fClamp2);
        int iClamp = (int) ((MathUtils.clamp(fLerp, 0.0f, 0.01f) * i11) / 0.01f);
        float fClamp3 = 1.0f - MathUtils.clamp(fLerp2, 0.99f, 1.0f);
        float f11 = this.f45068b;
        int i13 = (int) ((fLerp * f11) + iClamp);
        int i14 = (int) ((fLerp2 * f11) - ((int) ((fClamp3 * i12) / 0.01f)));
        float f12 = (-f11) / 2.0f;
        if (i13 <= i14) {
            float f13 = this.f45070d;
            float f14 = i13 + f13;
            float f15 = i14 - f13;
            float f16 = f13 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f45069c);
            if (f14 >= f15) {
                h(canvas, paint, new PointF(f14 + f12, 0.0f), new PointF(f15 + f12, 0.0f), f16, this.f45069c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f45071e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f17 = f14 + f12;
            float f18 = f15 + f12;
            canvas.drawLine(f17, 0.0f, f18, 0.0f, paint);
            if (this.f45071e || this.f45070d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f14 > 0.0f) {
                h(canvas, paint, new PointF(f17, 0.0f), null, f16, this.f45069c);
            }
            if (f15 < this.f45068b) {
                h(canvas, paint, new PointF(f18, 0.0f), null, f16, this.f45069c);
            }
        }
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f6, float f10) {
        float fMin = Math.min(f10, this.f45069c);
        float f11 = f6 / 2.0f;
        float fMin2 = Math.min(f11, (this.f45070d * fMin) / this.f45069c);
        RectF rectF = new RectF((-f6) / 2.0f, (-fMin) / 2.0f, f11, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
