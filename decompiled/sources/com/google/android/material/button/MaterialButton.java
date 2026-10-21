package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.j;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;

    @Px
    public int E0;
    public boolean F0;
    public boolean G0;
    public int H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.button.a f44127p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OnCheckedChangeListener> f44128q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public a f44129r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f44130s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44131t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Drawable f44132u0;

    @Nullable
    public String v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Px
    public int f44133w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Px
    public int f44134x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Px
    public int f44135y0;
    public static final int[] I0 = {R.attr.state_checkable};
    public static final int[] J0 = {R.attr.state_checked};
    public static final int K0 = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44136a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44137b;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f44137b = propertyMapper.mapInt("iconPadding", com.google.android.material.R.attr.iconPadding);
            this.f44136a = true;
        }

        public void readProperties(@NonNull MaterialButton materialButton, @NonNull PropertyReader propertyReader) {
            if (!this.f44136a) {
                throw j.c();
            }
            propertyReader.readInt(this.f44137b, materialButton.getIconPadding());
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f44138q0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f44138q0 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f44138q0 ? 1 : 0);
        }
    }

    public interface a {
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f44128q0.add(onCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        this.f44128q0.clear();
    }

    public final boolean f() {
        com.google.android.material.button.a aVar = this.f44127p0;
        return (aVar == null || aVar.f44169o) ? false : true;
    }

    public final void g() {
        int i10 = this.H0;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f44132u0, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f44132u0, null);
        } else if (i10 == 16 || i10 == 32) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f44132u0, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.v0)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.v0;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (f()) {
            return this.f44127p0.f44162g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f44132u0;
    }

    public int getIconGravity() {
        return this.H0;
    }

    @Px
    public int getIconPadding() {
        return this.E0;
    }

    @Px
    public int getIconSize() {
        return this.f44133w0;
    }

    public ColorStateList getIconTint() {
        return this.f44131t0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f44130s0;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f44127p0.f44161f;
    }

    @Dimension
    public int getInsetTop() {
        return this.f44127p0.f44160e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f44127p0.f44167l;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (f()) {
            return this.f44127p0.f44157b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f44127p0.f44166k;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (f()) {
            return this.f44127p0.f44163h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f44127p0.f44165j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f44127p0.f44164i : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f44132u0;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f44132u0 = drawableMutate;
            DrawableCompat.setTintList(drawableMutate, this.f44131t0);
            PorterDuff.Mode mode = this.f44130s0;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f44132u0, mode);
            }
            int intrinsicWidth = this.f44133w0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f44132u0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f44133w0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f44132u0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f44132u0;
            int i10 = this.f44134x0;
            int i11 = this.f44135y0;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f44132u0.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.H0;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f44132u0) || (((i12 == 3 || i12 == 4) && drawable5 != this.f44132u0) || ((i12 == 16 || i12 == 32) && drawable4 != this.f44132u0))) {
            g();
        }
    }

    public final void i(int i10, int i11) {
        if (this.f44132u0 == null || getLayout() == null) {
            return;
        }
        int i12 = this.H0;
        if (!(i12 == 1 || i12 == 2) && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f44134x0 = 0;
                if (i12 == 16) {
                    this.f44135y0 = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f44133w0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f44132u0.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.E0) - getPaddingBottom()) / 2);
                if (this.f44135y0 != iMax) {
                    this.f44135y0 = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f44135y0 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.H0;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f44134x0 = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f44133w0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f44132u0.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - intrinsicWidth) - this.E0) - ViewCompat.getPaddingStart(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((ViewCompat.getLayoutDirection(this) == 1) != (this.H0 == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f44134x0 != textLayoutWidth) {
            this.f44134x0 = textLayoutWidth;
            h(false);
        }
    }

    public boolean isCheckable() {
        com.google.android.material.button.a aVar = this.f44127p0;
        return aVar != null && aVar.f44171q;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.F0;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.f44127p0.f44172r;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.f44127p0.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f44138q0);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44138q0 = this.F0;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f44127p0.f44172r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f44132u0 != null) {
            if (this.f44132u0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f44128q0.remove(onCheckedChangeListener);
    }

    public void setA11yClassName(@Nullable String str) {
        this.v0 = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        if (!f()) {
            super.setBackgroundColor(i10);
            return;
        }
        com.google.android.material.button.a aVar = this.f44127p0;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        com.google.android.material.button.a aVar = this.f44127p0;
        aVar.f44169o = true;
        ColorStateList colorStateList = aVar.f44165j;
        MaterialButton materialButton = aVar.f44156a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(aVar.f44164i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        setBackgroundDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f44127p0.f44171q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (isCheckable() && isEnabled() && this.F0 != z10) {
            this.F0 = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.F0;
                if (!materialButtonToggleGroup.f44144u0) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (this.G0) {
                return;
            }
            this.G0 = true;
            Iterator<OnCheckedChangeListener> it = this.f44128q0.iterator();
            while (it.hasNext()) {
                it.next().onCheckedChanged(this, this.F0);
            }
            this.G0 = false;
        }
    }

    public void setCornerRadius(@Px int i10) {
        if (f()) {
            com.google.android.material.button.a aVar = this.f44127p0;
            if (aVar.f44170p && aVar.f44162g == i10) {
                return;
            }
            aVar.f44162g = i10;
            aVar.f44170p = true;
            aVar.c(aVar.f44157b.withCornerSize(i10));
        }
    }

    public void setCornerRadiusResource(@DimenRes int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (f()) {
            this.f44127p0.b(false).setElevation(f6);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f44132u0 != drawable) {
            this.f44132u0 = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@DrawableRes int i10) {
        setIcon(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setIconSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f44133w0 != i10) {
            this.f44133w0 = i10;
            h(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f44131t0 != colorStateList) {
            this.f44131t0 = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f44130s0 != mode) {
            this.f44130s0 = mode;
            h(false);
        }
    }

    public void setIconTintResource(@ColorRes int i10) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(@Dimension int i10) {
        com.google.android.material.button.a aVar = this.f44127p0;
        aVar.d(aVar.f44160e, i10);
    }

    public void setInsetTop(@Dimension int i10) {
        com.google.android.material.button.a aVar = this.f44127p0;
        aVar.d(i10, aVar.f44161f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable a aVar) {
        this.f44129r0 = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f44129r0;
        if (aVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (f()) {
            com.google.android.material.button.a aVar = this.f44127p0;
            if (aVar.f44167l != colorStateList) {
                aVar.f44167l = colorStateList;
                MaterialButton materialButton = aVar.f44156a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        if (f()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f44127p0.c(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            com.google.android.material.button.a aVar = this.f44127p0;
            aVar.f44168n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (f()) {
            com.google.android.material.button.a aVar = this.f44127p0;
            if (aVar.f44166k != colorStateList) {
                aVar.f44166k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        if (f()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(@Px int i10) {
        if (f()) {
            com.google.android.material.button.a aVar = this.f44127p0;
            if (aVar.f44163h != i10) {
                aVar.f44163h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!f()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.google.android.material.button.a aVar = this.f44127p0;
        if (aVar.f44165j != colorStateList) {
            aVar.f44165j = colorStateList;
            if (aVar.b(false) != null) {
                DrawableCompat.setTintList(aVar.b(false), aVar.f44165j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!f()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.google.android.material.button.a aVar = this.f44127p0;
        if (aVar.f44164i != mode) {
            aVar.f44164i = mode;
            if (aVar.b(false) == null || aVar.f44164i == null) {
                return;
            }
            DrawableCompat.setTintMode(aVar.b(false), aVar.f44164i);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f44127p0.f44172r = z10;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.F0);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = K0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44128q0 = new LinkedHashSet<>();
        this.F0 = false;
        this.G0 = false;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i10, i11, new int[0]);
        this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f44130s0 = ViewUtils.parseTintMode(i12, mode);
        this.f44131t0 = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.f44132u0 = MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_icon);
        this.H0 = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.f44133w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build());
        this.f44127p0 = aVar;
        aVar.f44158c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetLeft, 0);
        aVar.f44159d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetRight, 0);
        aVar.f44160e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetTop, 0);
        aVar.f44161f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetBottom, 0);
        int i13 = com.google.android.material.R.styleable.MaterialButton_cornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1);
            aVar.f44162g = dimensionPixelSize;
            aVar.c(aVar.f44157b.withCornerSize(dimensionPixelSize));
            aVar.f44170p = true;
        }
        aVar.f44163h = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_strokeWidth, 0);
        aVar.f44164i = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_backgroundTintMode, -1), mode);
        aVar.f44165j = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_backgroundTint);
        aVar.f44166k = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_strokeColor);
        aVar.f44167l = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_rippleColor);
        aVar.f44171q = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checkable, false);
        aVar.f44174t = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_elevation, 0);
        aVar.f44172r = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = ViewCompat.getPaddingStart(this);
        int paddingTop = getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialButton_android_background)) {
            aVar.f44169o = true;
            setSupportBackgroundTintList(aVar.f44165j);
            setSupportBackgroundTintMode(aVar.f44164i);
        } else {
            aVar.e();
        }
        ViewCompat.setPaddingRelative(this, paddingStart + aVar.f44158c, paddingTop + aVar.f44160e, paddingEnd + aVar.f44159d, paddingBottom + aVar.f44161f);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.E0);
        h(this.f44132u0 != null);
    }
}
