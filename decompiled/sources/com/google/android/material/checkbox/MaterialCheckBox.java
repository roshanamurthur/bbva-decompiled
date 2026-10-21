package com.google.android.material.checkbox;

import ad.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    public static final int[] U0;
    public static final int[][] V0;

    @SuppressLint({"DiscouragedApi"})
    public static final int W0;

    @Nullable
    public CharSequence E0;

    @Nullable
    public Drawable F0;

    @Nullable
    public Drawable G0;
    public boolean H0;

    @Nullable
    public ColorStateList I0;

    @Nullable
    public ColorStateList J0;

    @NonNull
    public PorterDuff.Mode K0;
    public int L0;
    public int[] M0;
    public boolean N0;

    @Nullable
    public CharSequence O0;

    @Nullable
    public CompoundButton.OnCheckedChangeListener P0;

    @Nullable
    public final AnimatedVectorDrawableCompat Q0;
    public final a R0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OnErrorChangedListener> f44242t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OnCheckedStateChangedListener> f44243u0;

    @Nullable
    public ColorStateList v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f44244w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f44245x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f44246y0;
    public static final int S0 = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] T0 = {R.attr.state_indeterminate};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f44247p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f44247p0 = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f44247p0;
            if (i10 != 1) {
                str = i10 != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return d.f(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f44247p0));
        }
    }

    public class a extends Animatable2Compat.AnimationCallback {
        public a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.I0;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.I0;
            if (colorStateList != null) {
                DrawableCompat.setTint(drawable, colorStateList.getColorForState(materialCheckBox.M0, colorStateList.getDefaultColor()));
            }
        }
    }

    static {
        int i10 = R.attr.state_error;
        U0 = new int[]{i10};
        V0 = new int[][]{new int[]{android.R.attr.state_enabled, i10}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        W0 = Resources.getSystem().getIdentifier("btn_check_material_anim", PluginUtils.IDENTIFIER_DRAWABLE, "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.L0;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.v0 == null) {
            int color = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, R.attr.colorError);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            this.v0 = new ColorStateList(V0, new int[]{MaterialColors.layer(color3, color2, 1.0f), MaterialColors.layer(color3, color, 1.0f), MaterialColors.layer(color3, color4, 0.54f), MaterialColors.layer(color3, color4, 0.38f), MaterialColors.layer(color3, color4, 0.38f)});
        }
        return this.v0;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.I0;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.F0 = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.F0, this.I0, CompoundButtonCompat.getButtonTintMode(this));
        this.G0 = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.G0, this.J0, this.K0);
        if (this.H0) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.Q0;
            if (animatedVectorDrawableCompat != null) {
                a aVar = this.R0;
                animatedVectorDrawableCompat.unregisterAnimationCallback(aVar);
                animatedVectorDrawableCompat.registerAnimationCallback(aVar);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.F0;
                if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                    int i10 = R.id.checked;
                    int i11 = R.id.unchecked;
                    ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, animatedVectorDrawableCompat, false);
                    ((AnimatedStateListDrawable) this.F0).addTransition(R.id.indeterminate, i11, animatedVectorDrawableCompat, false);
                }
            }
        }
        Drawable drawable2 = this.F0;
        if (drawable2 != null && (colorStateList2 = this.I0) != null) {
            DrawableCompat.setTintList(drawable2, colorStateList2);
        }
        Drawable drawable3 = this.G0;
        if (drawable3 != null && (colorStateList = this.J0) != null) {
            DrawableCompat.setTintList(drawable3, colorStateList);
        }
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.F0, this.G0));
        refreshDrawableState();
    }

    public void addOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f44243u0.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f44242t0.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.f44243u0.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.f44242t0.clear();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.F0;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.G0;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.J0;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.K0;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.I0;
    }

    public int getCheckedState() {
        return this.L0;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.E0;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.f44245x0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.L0 == 1;
    }

    public boolean isErrorShown() {
        return this.f44246y0;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f44244w0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f44244w0 && this.I0 == null && this.J0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T0);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U0);
        }
        this.M0 = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f44245x0 || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.E0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f44247p0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44247p0 = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f44243u0.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f44242t0.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i10) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.G0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i10) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.J0 == colorStateList) {
            return;
        }
        this.J0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.K0 == mode) {
            return;
        }
        this.K0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.I0 == colorStateList) {
            return;
        }
        this.I0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f44245x0 = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.L0 != i10) {
            this.L0 = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.O0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.N0) {
                return;
            }
            this.N0 = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.f44243u0;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.L0);
                }
            }
            if (this.L0 != 2 && (onCheckedChangeListener = this.P0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.N0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.E0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f44246y0 == z10) {
            return;
        }
        this.f44246y0 = z10;
        refreshDrawableState();
        Iterator<OnErrorChangedListener> it = this.f44242t0.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.f44246y0);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.P0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.O0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f44244w0 = z10;
        if (z10) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.F0 = drawable;
        this.H0 = false;
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = S0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44242t0 = new LinkedHashSet<>();
        this.f44243u0 = new LinkedHashSet<>();
        this.Q0 = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.R0 = new a();
        Context context2 = getContext();
        this.F0 = CompoundButtonCompat.getButtonDrawable(this);
        this.I0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i10, i11, new int[0]);
        this.G0 = tintTypedArrayObtainTintedStyledAttributes.getDrawable(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.F0 != null && ThemeEnforcement.isMaterial3Theme(context2)) {
            int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.MaterialCheckBox_android_button, 0);
            int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == W0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.F0 = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
                this.H0 = true;
                if (this.G0 == null) {
                    this.G0 = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.J0 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.MaterialCheckBox_buttonIconTint);
        this.K0 = ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f44244w0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f44245x0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f44246y0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
        this.E0 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        int i12 = R.styleable.MaterialCheckBox_checkedState;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i12)) {
            setCheckedState(tintTypedArrayObtainTintedStyledAttributes.getInt(i12, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        a();
    }
}
