package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f44620u0 = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f44621p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f44622q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @ColorInt
    public int f44623r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f44624s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f44625t0;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f44623r0;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f44625t0;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f44624s0;
    }

    public int getDividerThickness() {
        return this.f44622q0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = ViewCompat.getLayoutDirection(this) == 1;
        int i11 = z10 ? this.f44625t0 : this.f44624s0;
        if (z10) {
            width = getWidth();
            i10 = this.f44624s0;
        } else {
            width = getWidth();
            i10 = this.f44625t0;
        }
        int i12 = width - i10;
        MaterialShapeDrawable materialShapeDrawable = this.f44621p0;
        materialShapeDrawable.setBounds(i11, 0, i12, getBottom() - getTop());
        materialShapeDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f44622q0;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i10) {
        if (this.f44623r0 != i10) {
            this.f44623r0 = i10;
            this.f44621p0.setFillColor(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f44625t0 = i10;
    }

    public void setDividerInsetEndResource(@DimenRes int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f44624s0 = i10;
    }

    public void setDividerInsetStartResource(@DimenRes int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        if (this.f44622q0 != i10) {
            this.f44622q0 = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f44620u0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f44621p0 = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i10, i11, new int[0]);
        this.f44622q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f44624s0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f44625t0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
