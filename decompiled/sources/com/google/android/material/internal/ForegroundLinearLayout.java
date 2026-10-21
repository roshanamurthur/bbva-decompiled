package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    @Nullable
    public Drawable J0;
    public final Rect K0;
    public final Rect L0;
    public int M0;
    public boolean N0;
    protected boolean mForegroundInPadding;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.J0;
        if (drawable != null) {
            if (this.N0) {
                this.N0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.mForegroundInPadding;
                Rect rect = this.K0;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.M0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.L0;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f6, float f10) {
        super.drawableHotspotChanged(f6, f10);
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.setHotspot(f6, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.J0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.J0.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.J0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.M0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.N0 = z10 | this.N0;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.N0 = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.J0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.J0);
            }
            this.J0 = drawable;
            this.N0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.M0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.M0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.M0 = i10;
            if (i10 == 119 && this.J0 != null) {
                this.J0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J0;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.K0 = new Rect();
        this.L0 = new Rect();
        this.M0 = 119;
        this.mForegroundInPadding = true;
        this.N0 = false;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ForegroundLinearLayout, i10, 0, new int[0]);
        this.M0 = typedArrayObtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.M0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.mForegroundInPadding = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
