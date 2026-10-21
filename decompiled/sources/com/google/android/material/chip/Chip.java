package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    public static final int R0 = R.style.Widget_MaterialComponents_Chip_Action;
    public static final Rect S0 = new Rect();
    public static final int[] T0 = {android.R.attr.state_selected};
    public static final int[] U0 = {android.R.attr.state_checkable};
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;

    @Dimension(unit = 1)
    public int K0;

    @Nullable
    public CharSequence L0;

    @NonNull
    public final b M0;
    public boolean N0;
    public final Rect O0;
    public final RectF P0;
    public final a Q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public ChipDrawable f44249t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public InsetDrawable f44250u0;

    @Nullable
    public RippleDrawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f44251w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f44252x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public MaterialCheckable.OnCheckedChangeListener<Chip> f44253y0;

    public class b extends ExploreByTouchHelper {
        public b(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int getVirtualViewAt(float f6, float f10) {
            int i10 = Chip.R0;
            Chip chip = Chip.this;
            return (chip.c() && chip.getCloseIconTouchBounds().contains(f6, f10)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            int i10 = Chip.R0;
            Chip chip = Chip.this;
            if (chip.c() && chip.isCloseIconVisible() && chip.f44251w0 != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            Chip chip = Chip.this;
            if (i10 == 0) {
                return chip.performClick();
            }
            if (i10 == 1) {
                return chip.performCloseIconClick();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Chip chip = Chip.this;
            accessibilityNodeInfoCompat.setCheckable(chip.isCheckable());
            accessibilityNodeInfoCompat.setClickable(chip.isClickable());
            accessibilityNodeInfoCompat.setClassName(chip.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(chip.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForVirtualView(int i10, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i10 != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.S0);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i11 = R.string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfoCompat.setContentDescription(context.getString(i11, objArr).trim());
            }
            accessibilityNodeInfoCompat.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.H0 = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.P0;
        rectF.setEmpty();
        if (c() && this.f44251w0 != null) {
            this.f44249t0.getCloseIconTouchBounds(rectF);
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.O0;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getTextAppearance();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.F0 != z10) {
            this.F0 = z10;
            refreshDrawableState();
        }
    }

    public final boolean c() {
        ChipDrawable chipDrawable = this.f44249t0;
        return (chipDrawable == null || chipDrawable.getCloseIcon() == null) ? false : true;
    }

    public final void d() {
        if (c() && isCloseIconVisible() && this.f44251w0 != null) {
            ViewCompat.setAccessibilityDelegate(this, this.M0);
            this.N0 = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.N0 = false;
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.N0) {
            return this.M0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.N0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.M0;
        if (!bVar.dispatchKeyEvent(keyEvent) || bVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable == null || !chipDrawable.isCloseIconStateful()) {
            return;
        }
        ChipDrawable chipDrawable2 = this.f44249t0;
        ?? IsEnabled = isEnabled();
        if (this.H0) {
            i10 = IsEnabled;
            i10 = IsEnabled + 1;
        }
        i10 = IsEnabled;
        int i11 = i10;
        if (this.G0) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.F0) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.H0) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.G0) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.F0) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        if (chipDrawable2.setCloseIconState(iArr)) {
            invalidate();
        }
    }

    public final void e() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            f();
            return;
        }
        this.f44249t0.setUseCompatRipple(true);
        ViewCompat.setBackground(this, getBackgroundDrawable());
        g();
        if (getBackgroundDrawable() == this.f44250u0 && this.f44249t0.getCallback() == null) {
            this.f44249t0.setCallback(this.f44250u0);
        }
    }

    public boolean ensureAccessibleTouchTarget(@Dimension int i10) {
        this.K0 = i10;
        if (!shouldEnsureMinTouchTargetSize()) {
            InsetDrawable insetDrawable = this.f44250u0;
            if (insetDrawable == null) {
                e();
            } else if (insetDrawable != null) {
                this.f44250u0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f44249t0.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f44249t0.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f44250u0;
            if (insetDrawable2 == null) {
                e();
            } else if (insetDrawable2 != null) {
                this.f44250u0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f44250u0 != null) {
            Rect rect = new Rect();
            this.f44250u0.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                e();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f44250u0 = new InsetDrawable((Drawable) this.f44249t0, i11, i12, i11, i12);
        e();
        return true;
    }

    public final void f() {
        this.v0 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f44249t0.getRippleColor()), getBackgroundDrawable(), null);
        this.f44249t0.setUseCompatRipple(false);
        ViewCompat.setBackground(this, this.v0);
        g();
    }

    public final void g() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.f44249t0) == null) {
            return;
        }
        int iL = (int) (this.f44249t0.l() + this.f44249t0.getTextEndPadding() + chipDrawable.getChipEndPadding());
        int iK = (int) (this.f44249t0.k() + this.f44249t0.getTextStartPadding() + this.f44249t0.getChipStartPadding());
        if (this.f44250u0 != null) {
            Rect rect = new Rect();
            this.f44250u0.getPadding(rect);
            iK += rect.left;
            iL += rect.right;
        }
        ViewCompat.setPaddingRelative(this, iK, getPaddingTop(), iL, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.L0)) {
            return this.L0;
        }
        if (!isCheckable()) {
            return isClickable() ? "android.widget.Button" : AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f44250u0;
        return insetDrawable == null ? this.f44249t0 : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIcon();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIconTint();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.getChipCornerRadius());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f44249t0;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIcon();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconTint();
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.N0) {
            b bVar = this.M0;
            if (bVar.getKeyboardFocusedVirtualViewId() == 1 || bVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getRippleColor();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f44249t0.getShapeAppearanceModel();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            return chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.Q0);
        }
    }

    public boolean isCheckable() {
        ChipDrawable chipDrawable = this.f44249t0;
        return chipDrawable != null && chipDrawable.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        ChipDrawable chipDrawable = this.f44249t0;
        return chipDrawable != null && chipDrawable.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        ChipDrawable chipDrawable = this.f44249t0;
        return chipDrawable != null && chipDrawable.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        ChipDrawable chipDrawable = this.f44249t0;
        return chipDrawable != null && chipDrawable.isCloseIconVisible();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f44249t0);
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.K0);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T0);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.N0) {
            this.M0.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            int i10 = -1;
            if (chipGroup.isSingleLine()) {
                int i11 = 0;
                for (int i12 = 0; i12 < chipGroup.getChildCount(); i12++) {
                    View childAt = chipGroup.getChildAt(i12);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i12).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    }
                }
            }
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.getRowIndex(this), 1, i10, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.J0 != i10) {
            this.J0 = i10;
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.F0
            if (r0 == 0) goto L41
            if (r1 != 0) goto L49
            r5.setCloseIconPressed(r3)
            goto L49
        L2b:
            boolean r0 = r5.F0
            if (r0 == 0) goto L34
            r5.performCloseIconClick()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            if (r0 != 0) goto L49
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.setCloseIconPressed(r2)
            goto L49
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f44251w0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.N0) {
            this.M0.sendEventForVirtualView(1, 1);
        }
        return z10;
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.L0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.v0) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.v0) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(z10);
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckableResource(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable == null) {
            this.E0 = z10;
        } else if (chipDrawable.isCheckable()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIcon(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(i10);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(i10);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(i10);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColorResource(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadius(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadiusResource(i10);
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f44249t0;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.setDelegate(null);
            }
            this.f44249t0 = chipDrawable;
            chipDrawable.Y1 = false;
            chipDrawable.setDelegate(this);
            ensureAccessibleTouchTarget(this.K0);
        }
    }

    public void setChipEndPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f6);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPaddingResource(i10);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIcon(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconResource(i10);
        }
    }

    public void setChipIconSize(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSize(f6);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(i10);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(i10);
        }
    }

    public void setChipIconVisible(@BoolRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(i10);
        }
    }

    public void setChipMinHeight(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f6);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeightResource(i10);
        }
    }

    public void setChipStartPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPadding(f6);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(i10);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColorResource(i10);
        }
    }

    public void setChipStrokeWidth(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidth(f6);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidthResource(i10);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIcon(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPadding(f6);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPaddingResource(i10);
        }
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconResource(i10);
        }
        d();
    }

    public void setCloseIconSize(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSize(f6);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(i10);
        }
    }

    public void setCloseIconStartPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPadding(f6);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPaddingResource(i10);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(i10);
        }
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setElevation(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f44249t0 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setEllipsize(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.I0 = z10;
        ensureAccessibleTouchTarget(this.K0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpecResource(i10);
        }
    }

    public void setIconEndPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPadding(f6);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPaddingResource(i10);
        }
    }

    public void setIconStartPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPadding(f6);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPaddingResource(i10);
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.f44253y0 = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f44249t0 == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i10) {
        super.setMaxWidth(i10);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setMaxWidth(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f44252x0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f44251w0 = onClickListener;
        d();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor(colorStateList);
        }
        if (this.f44249t0.getUseCompatRipple()) {
            return;
        }
        f();
    }

    public void setRippleColorResource(@ColorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setRippleColorResource(i10);
            if (this.f44249t0.getUseCompatRipple()) {
                return;
            }
            f();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f44249t0.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpecResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.Y1 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.f44249t0;
        if (chipDrawable2 != null) {
            chipDrawable2.setText(charSequence);
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearance(textAppearance);
        }
        h();
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPadding(f6);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f6) {
        super.setTextSize(i10, f6);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextSize(TypedValue.applyDimension(i10, f6, getResources().getDisplayMetrics()));
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f6);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(i10);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.I0;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconVisible(z10);
        }
        d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = R0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.O0 = new Rect();
        this.P0 = new RectF();
        this.Q0 = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        ChipDrawable chipDrawableCreateFromAttributes = ChipDrawable.createFromAttributes(context2, attributeSet, i10, i11);
        int[] iArr = R.styleable.Chip;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, iArr, i10, i11, new int[0]);
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.K0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(chipDrawableCreateFromAttributes);
        chipDrawableCreateFromAttributes.setElevation(ViewCompat.getElevation(this));
        TypedArray typedArrayObtainStyledAttributes2 = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, iArr, i10, i11, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.M0 = new b(this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new ge.b(this));
        }
        setChecked(this.E0);
        setText(chipDrawableCreateFromAttributes.getText());
        setEllipsize(chipDrawableCreateFromAttributes.getEllipsize());
        h();
        if (!this.f44249t0.Y1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.K0);
        }
        this.J0 = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ge.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip chip = this.f68601a;
                MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener = chip.f44253y0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(chip, z10);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.f44252x0;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i10);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        ChipDrawable chipDrawable = this.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i10);
        }
        h();
    }

    public class a extends TextAppearanceFontCallback {
        public a() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            ChipDrawable chipDrawable = chip.f44249t0;
            chip.setText(chipDrawable.Y1 ? chipDrawable.getText() : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrievalFailed(int i10) {
        }
    }
}
