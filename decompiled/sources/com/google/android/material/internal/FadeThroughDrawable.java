package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f44837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f44838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f44839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44840d;

    public FadeThroughDrawable(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f44837a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f44838b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f44839c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f44837a.draw(canvas);
        this.f44838b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f44837a.getIntrinsicHeight(), this.f44838b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f44837a.getIntrinsicWidth(), this.f44838b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f44837a.getMinimumHeight(), this.f44838b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f44837a.getMinimumWidth(), this.f44838b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f44837a.isStateful() || this.f44838b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        float f6 = this.f44840d;
        Drawable drawable = this.f44838b;
        Drawable drawable2 = this.f44837a;
        if (f6 <= 0.5f) {
            drawable2.setAlpha(i10);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f44837a.setBounds(i10, i11, i12, i13);
        this.f44838b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f44837a.setColorFilter(colorFilter);
        this.f44838b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (this.f44840d != f6) {
            this.f44840d = f6;
            float[] fArr = this.f44839c;
            b.a(f6, fArr);
            this.f44837a.setAlpha((int) (fArr[0] * 255.0f));
            this.f44838b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f44837a.setState(iArr) || this.f44838b.setState(iArr);
    }
}
