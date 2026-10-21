package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    public static final int[] Z0 = {R.attr.state_checked};
    public int O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public final CheckedTextView S0;
    public FrameLayout T0;
    public MenuItemImpl U0;
    public ColorStateList V0;
    public boolean W0;
    public Drawable X0;
    public final a Y0;

    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.Q0);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.T0 == null) {
                this.T0 = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.T0.removeAllViews();
            this.T0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.U0;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        StateListDrawable stateListDrawable;
        this.U0 = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(Z0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.setBackground(this, stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        CharSequence title = this.U0.getTitle();
        CheckedTextView checkedTextView = this.S0;
        if (title == null && this.U0.getIcon() == null && this.U0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.T0;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.T0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.T0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.T0.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemImpl menuItemImpl = this.U0;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.U0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Z0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.T0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.S0.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.Q0 != z10) {
            this.Q0 = z10;
            this.Y0.sendAccessibilityEvent(this.S0, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.S0;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.R0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.W0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.V0);
            }
            int i10 = this.O0;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.P0) {
            if (this.X0 == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.X0 = drawable2;
                if (drawable2 != null) {
                    int i11 = this.O0;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.X0;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.S0, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.S0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@Dimension int i10) {
        this.O0 = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.V0 = colorStateList;
        this.W0 = colorStateList != null;
        MenuItemImpl menuItemImpl = this.U0;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.S0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.P0 = z10;
    }

    public void setTextAppearance(int i10) {
        TextViewCompat.setTextAppearance(this.S0, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.S0.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.S0.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R0 = true;
        a aVar = new a();
        this.Y0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.S0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, aVar);
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, boolean z10) {
        this.R0 = z10;
        initialize(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }
}
