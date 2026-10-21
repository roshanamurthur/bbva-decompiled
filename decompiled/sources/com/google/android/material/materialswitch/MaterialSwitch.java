package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int A1 = R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    public static final int[] B1 = {R.attr.state_with_icon};

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @Nullable
    public Drawable f44926n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public Drawable f44927o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Px
    public int f44928p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Nullable
    public Drawable f44929q1;

    @Nullable
    public Drawable r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44930s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44931t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f44932u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44933v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44934w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f44935x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int[] f44936y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int[] f44937z1;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    public static void g(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f6) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        DrawableCompat.setTint(drawable, ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f6));
    }

    public final void e() {
        this.f44926n1 = DrawableUtils.createTintableDrawableIfNeeded(this.f44926n1, this.f44930s1, getThumbTintMode());
        this.f44927o1 = DrawableUtils.createTintableDrawableIfNeeded(this.f44927o1, this.f44931t1, this.f44932u1);
        h();
        Drawable drawable = this.f44926n1;
        Drawable drawable2 = this.f44927o1;
        int i10 = this.f44928p1;
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void f() {
        this.f44929q1 = DrawableUtils.createTintableDrawableIfNeeded(this.f44929q1, this.f44933v1, getTrackTintMode());
        this.r1 = DrawableUtils.createTintableDrawableIfNeeded(this.r1, this.f44934w1, this.f44935x1);
        h();
        Drawable layerDrawable = this.f44929q1;
        if (layerDrawable != null && this.r1 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f44929q1, this.r1});
        } else if (layerDrawable == null) {
            layerDrawable = this.r1;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f44926n1;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f44927o1;
    }

    @Px
    public int getThumbIconSize() {
        return this.f44928p1;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f44931t1;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f44932u1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f44930s1;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.r1;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f44934w1;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f44935x1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f44929q1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f44933v1;
    }

    public final void h() {
        if (this.f44930s1 == null && this.f44931t1 == null && this.f44933v1 == null && this.f44934w1 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f44930s1;
        if (colorStateList != null) {
            g(this.f44926n1, colorStateList, this.f44936y1, this.f44937z1, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f44931t1;
        if (colorStateList2 != null) {
            g(this.f44927o1, colorStateList2, this.f44936y1, this.f44937z1, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f44933v1;
        if (colorStateList3 != null) {
            g(this.f44929q1, colorStateList3, this.f44936y1, this.f44937z1, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f44934w1;
        if (colorStateList4 != null) {
            g(this.r1, colorStateList4, this.f44936y1, this.f44937z1, thumbPosition);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f44927o1 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B1);
        }
        this.f44936y1 = DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.f44937z1 = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f44926n1 = drawable;
        e();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f44927o1 = drawable;
        e();
    }

    public void setThumbIconResource(@DrawableRes int i10) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setThumbIconSize(@Px int i10) {
        if (this.f44928p1 != i10) {
            this.f44928p1 = i10;
            e();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f44931t1 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f44932u1 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f44930s1 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.r1 = drawable;
        f();
    }

    public void setTrackDecorationResource(@DrawableRes int i10) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f44934w1 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f44935x1 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f44929q1 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f44933v1 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = A1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44928p1 = -1;
        Context context2 = getContext();
        this.f44926n1 = super.getThumbDrawable();
        this.f44930s1 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f44929q1 = super.getTrackDrawable();
        this.f44933v1 = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialSwitch, i10, i11, new int[0]);
        this.f44927o1 = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialSwitch_thumbIcon);
        this.f44928p1 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.MaterialSwitch_thumbIconSize, -1);
        this.f44931t1 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.MaterialSwitch_thumbIconTint);
        int i12 = tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f44932u1 = ViewUtils.parseTintMode(i12, mode);
        this.r1 = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialSwitch_trackDecoration);
        this.f44934w1 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.MaterialSwitch_trackDecorationTint);
        this.f44935x1 = ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialSwitch_trackDecorationTintMode, -1), mode);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setEnforceSwitchWidth(false);
        e();
        f();
    }
}
