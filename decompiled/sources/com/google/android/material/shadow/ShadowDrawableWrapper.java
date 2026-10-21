package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class ShadowDrawableWrapper extends DrawableWrapperCompat {
    public static final double K0 = Math.cos(Math.toRadians(45.0d));
    public final int E0;
    public final int F0;
    public final int G0;
    public boolean H0;
    public float I0;
    public boolean J0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Paint f45203q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final Paint f45204r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final RectF f45205s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f45206t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Path f45207u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f45208w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f45209x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f45210y0;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f6, float f10, float f11) {
        super(drawable);
        this.f45210y0 = true;
        this.H0 = true;
        this.J0 = false;
        this.E0 = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.F0 = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.G0 = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f45203q0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f45206t0 = Math.round(f6);
        this.f45205s0 = new RectF();
        Paint paint2 = new Paint(paint);
        this.f45204r0 = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f10, f11);
    }

    public static float calculateHorizontalPadding(float f6, float f10, boolean z10) {
        if (!z10) {
            return f6;
        }
        return (float) (((1.0d - K0) * ((double) f10)) + ((double) f6));
    }

    public static float calculateVerticalPadding(float f6, float f10, boolean z10) {
        if (!z10) {
            return f6 * 1.5f;
        }
        return (float) (((1.0d - K0) * ((double) f10)) + ((double) (f6 * 1.5f)));
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11 = this.f45210y0;
        Paint paint = this.f45204r0;
        Paint paint2 = this.f45203q0;
        RectF rectF = this.f45205s0;
        if (z11) {
            Rect bounds = getBounds();
            float f6 = this.v0;
            float f10 = 1.5f * f6;
            rectF.set(bounds.left + f6, bounds.top + f10, bounds.right - f6, bounds.bottom - f10);
            getDrawable().setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            float f11 = this.f45206t0;
            float f12 = -f11;
            RectF rectF2 = new RectF(f12, f12, f11, f11);
            RectF rectF3 = new RectF(rectF2);
            float f13 = -this.f45208w0;
            rectF3.inset(f13, f13);
            Path path = this.f45207u0;
            if (path == null) {
                this.f45207u0 = new Path();
            } else {
                path.reset();
            }
            this.f45207u0.setFillType(Path.FillType.EVEN_ODD);
            this.f45207u0.moveTo(-this.f45206t0, 0.0f);
            this.f45207u0.rLineTo(-this.f45208w0, 0.0f);
            this.f45207u0.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f45207u0.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f45207u0.close();
            float f14 = -rectF3.top;
            int i11 = this.G0;
            int i12 = this.F0;
            int i13 = this.E0;
            if (f14 > 0.0f) {
                float f15 = this.f45206t0 / f14;
                z10 = true;
                paint2.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{0, i13, i12, i11}, new float[]{0.0f, f15, ((1.0f - f15) / 2.0f) + f15, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                z10 = true;
            }
            paint.setShader(new LinearGradient(0.0f, rectF2.top, 0.0f, rectF3.top, new int[]{i13, i12, i11}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAntiAlias(false);
            this.f45210y0 = false;
        } else {
            z10 = true;
        }
        int iSave = canvas.save();
        canvas.rotate(this.I0, rectF.centerX(), rectF.centerY());
        float f16 = this.f45206t0;
        float f17 = (-f16) - this.f45208w0;
        float f18 = f16 * 2.0f;
        boolean z12 = rectF.width() - f18 > 0.0f ? z10 : false;
        if (rectF.height() - f18 <= 0.0f) {
            z10 = false;
        }
        float f19 = this.f45209x0;
        float f20 = f16 / ((f19 - (0.5f * f19)) + f16);
        float f21 = f16 / ((f19 - (0.25f * f19)) + f16);
        float f22 = f16 / ((f19 - (f19 * 1.0f)) + f16);
        int iSave2 = canvas.save();
        canvas.translate(rectF.left + f16, rectF.top + f16);
        canvas.scale(f20, f21);
        canvas.drawPath(this.f45207u0, paint2);
        if (z12) {
            canvas.scale(1.0f / f20, 1.0f);
            canvas.drawRect(0.0f, f17, rectF.width() - f18, -this.f45206t0, paint);
            i10 = iSave2;
        } else {
            i10 = iSave2;
        }
        canvas.restoreToCount(i10);
        int iSave3 = canvas.save();
        canvas.translate(rectF.right - f16, rectF.bottom - f16);
        canvas.scale(f20, f22);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f45207u0, paint2);
        if (z12) {
            canvas.scale(1.0f / f20, 1.0f);
            canvas.drawRect(0.0f, f17, rectF.width() - f18, (-this.f45206t0) + this.f45208w0, paint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(rectF.left + f16, rectF.bottom - f16);
        canvas.scale(f20, f22);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f45207u0, paint2);
        if (z10) {
            canvas.scale(1.0f / f22, 1.0f);
            canvas.drawRect(0.0f, f17, rectF.height() - f18, -this.f45206t0, paint);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        canvas.translate(rectF.right - f16, rectF.top + f16);
        canvas.scale(f20, f21);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f45207u0, paint2);
        if (z10) {
            canvas.scale(1.0f / f21, 1.0f);
            canvas.drawRect(0.0f, f17, rectF.height() - f18, -this.f45206t0, paint);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f45206t0;
    }

    public float getMaxShadowSize() {
        return this.v0;
    }

    public float getMinHeight() {
        float f6 = this.v0;
        return (this.v0 * 1.5f * 2.0f) + (Math.max(f6, ((f6 * 1.5f) / 2.0f) + this.f45206t0) * 2.0f);
    }

    public float getMinWidth() {
        float f6 = this.v0;
        return (this.v0 * 2.0f) + (Math.max(f6, (f6 / 2.0f) + this.f45206t0) * 2.0f);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.v0, this.f45206t0, this.H0));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.v0, this.f45206t0, this.H0));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float getShadowSize() {
        return this.f45209x0;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f45210y0 = true;
    }

    public void setAddPaddingForCorners(boolean z10) {
        this.H0 = z10;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f45203q0.setAlpha(i10);
        this.f45204r0.setAlpha(i10);
    }

    public void setCornerRadius(float f6) {
        float fRound = Math.round(f6);
        if (this.f45206t0 == fRound) {
            return;
        }
        this.f45206t0 = fRound;
        this.f45210y0 = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f6) {
        setShadowSize(this.f45209x0, f6);
    }

    public final void setRotation(float f6) {
        if (this.I0 != f6) {
            this.I0 = f6;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f6, float f10) {
        if (f6 < 0.0f || f10 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        int iRound = Math.round(f6);
        if (iRound % 2 == 1) {
            iRound--;
        }
        float f11 = iRound;
        int iRound2 = Math.round(f10);
        if (iRound2 % 2 == 1) {
            iRound2--;
        }
        float f12 = iRound2;
        if (f11 > f12) {
            if (!this.J0) {
                this.J0 = true;
            }
            f11 = f12;
        }
        if (this.f45209x0 == f11 && this.v0 == f12) {
            return;
        }
        this.f45209x0 = f11;
        this.v0 = f12;
        this.f45208w0 = Math.round(f11 * 1.5f);
        this.f45210y0 = true;
        invalidateSelf();
    }

    public void setShadowSize(float f6) {
        setShadowSize(f6, this.v0);
    }
}
