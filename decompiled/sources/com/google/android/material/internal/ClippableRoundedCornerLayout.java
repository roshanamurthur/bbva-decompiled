package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Path f44780p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f44781q0;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f44780p0 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f44780p0);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f44781q0;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.f44780p0 = null;
        this.f44781q0 = 0.0f;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(@NonNull Rect rect, float f6) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f6);
    }

    public void updateCornerRadius(float f6) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f6);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateClipBoundsAndCornerRadius(float f6, float f10, float f11, float f12, float f13) {
        updateClipBoundsAndCornerRadius(new RectF(f6, f10, f11, f12), f13);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void updateClipBoundsAndCornerRadius(@NonNull RectF rectF, float f6) {
        if (this.f44780p0 == null) {
            this.f44780p0 = new Path();
        }
        this.f44781q0 = f6;
        this.f44780p0.reset();
        this.f44780p0.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        this.f44780p0.close();
        invalidate();
    }
}
