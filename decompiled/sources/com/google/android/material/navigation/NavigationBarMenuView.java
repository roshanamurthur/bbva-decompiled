package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public static final int[] Z0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int[] f44982a1 = {-16842910};
    public ColorStateList E0;

    @Nullable
    public final ColorStateList F0;

    @StyleRes
    public int G0;

    @StyleRes
    public int H0;
    public boolean I0;
    public Drawable J0;

    @Nullable
    public ColorStateList K0;
    public int L0;

    @NonNull
    public final SparseArray<BadgeDrawable> M0;
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public int T0;
    public ShapeAppearanceModel U0;
    public boolean V0;
    public ColorStateList W0;
    public NavigationBarPresenter X0;
    public MenuBuilder Y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final AutoTransition f44983p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final a f44984q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Pools.SynchronizedPool f44985r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final SparseArray<View.OnTouchListener> f44986s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f44987t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public NavigationBarItemView[] f44988u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f44989w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44990x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Dimension
    public int f44991y0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (navigationBarMenuView.Y0.performItemAction(itemData, navigationBarMenuView.X0, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f44985r0 = new Pools.SynchronizedPool(5);
        this.f44986s0 = new SparseArray<>(5);
        this.v0 = 0;
        this.f44989w0 = 0;
        this.M0 = new SparseArray<>(5);
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.V0 = false;
        this.F0 = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f44983p0 = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f44983p0 = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.addTransition(new TextScale());
        }
        this.f44984q0 = new a();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public static void b(int i10) {
        if (i10 != -1) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f44985r0.acquire();
        return navigationBarItemView == null ? createNavigationBarItemView(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (id == -1 || (badgeDrawable = this.M0.get(id)) == null) {
            return;
        }
        navigationBarItemView.setBadge(badgeDrawable);
    }

    @Nullable
    public final MaterialShapeDrawable a() {
        if (this.U0 == null || this.W0 == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.U0);
        materialShapeDrawable.setFillColor(this.W0);
        return materialShapeDrawable;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f44985r0.release(navigationBarItemView);
                    if (navigationBarItemView.Z0 != null) {
                        ImageView imageView = navigationBarItemView.H0;
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            BadgeUtils.detachBadgeDrawable(navigationBarItemView.Z0, imageView);
                        }
                        navigationBarItemView.Z0 = null;
                    }
                    navigationBarItemView.N0 = null;
                    navigationBarItemView.T0 = 0.0f;
                    navigationBarItemView.f44970p0 = false;
                }
            }
        }
        if (this.Y0.size() == 0) {
            this.v0 = 0;
            this.f44989w0 = 0;
            this.f44988u0 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Y0.size(); i10++) {
            hashSet.add(Integer.valueOf(this.Y0.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray<BadgeDrawable> sparseArray = this.M0;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        this.f44988u0 = new NavigationBarItemView[this.Y0.size()];
        boolean zIsShifting = isShifting(this.f44987t0, this.Y0.getVisibleItems().size());
        for (int i12 = 0; i12 < this.Y0.size(); i12++) {
            this.X0.setUpdateSuspended(true);
            this.Y0.getItem(i12).setCheckable(true);
            this.X0.setUpdateSuspended(false);
            NavigationBarItemView newItem = getNewItem();
            this.f44988u0[i12] = newItem;
            newItem.setIconTintList(this.f44990x0);
            newItem.setIconSize(this.f44991y0);
            newItem.setTextColor(this.F0);
            newItem.setTextAppearanceInactive(this.G0);
            newItem.setTextAppearanceActive(this.H0);
            newItem.setTextAppearanceActiveBoldEnabled(this.I0);
            newItem.setTextColor(this.E0);
            int i13 = this.N0;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.O0;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            int i15 = this.P0;
            if (i15 != -1) {
                newItem.setActiveIndicatorLabelPadding(i15);
            }
            newItem.setActiveIndicatorWidth(this.R0);
            newItem.setActiveIndicatorHeight(this.S0);
            newItem.setActiveIndicatorMarginHorizontal(this.T0);
            newItem.setActiveIndicatorDrawable(a());
            newItem.setActiveIndicatorResizeable(this.V0);
            newItem.setActiveIndicatorEnabled(this.Q0);
            Drawable drawable = this.J0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.L0);
            }
            newItem.setItemRippleColor(this.K0);
            newItem.setShifting(zIsShifting);
            newItem.setLabelVisibilityMode(this.f44987t0);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.Y0.getItem(i12);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i12);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.f44986s0.get(itemId));
            newItem.setOnClickListener(this.f44984q0);
            int i16 = this.v0;
            if (i16 != 0 && itemId == i16) {
                this.f44989w0 = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.Y0.size() - 1, this.f44989w0);
        this.f44989w0 = iMin;
        this.Y0.getItem(iMin).setChecked(true);
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f44982a1;
        return new ColorStateList(new int[][]{iArr, Z0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @NonNull
    public abstract NavigationBarItemView createNavigationBarItemView(@NonNull Context context);

    @Nullable
    public NavigationBarItemView findItemView(int i10) {
        b(i10);
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i10) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.P0;
    }

    @Nullable
    public BadgeDrawable getBadge(int i10) {
        return this.M0.get(i10);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.M0;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f44990x0;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.W0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.Q0;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.S0;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.T0;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.U0;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.R0;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.J0 : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.L0;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f44991y0;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.O0;
    }

    @Px
    public int getItemPaddingTop() {
        return this.N0;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.K0;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.H0;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.G0;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.E0;
    }

    public int getLabelVisibilityMode() {
        return this.f44987t0;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.Y0;
    }

    public int getSelectedItemId() {
        return this.v0;
    }

    public int getSelectedItemPosition() {
        return this.f44989w0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.Y0 = menuBuilder;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.V0;
    }

    public boolean isShifting(int i10, int i11) {
        if (i10 == -1) {
            if (i11 <= 3) {
                return false;
            }
        } else if (i10 != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.Y0.getVisibleItems().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(@Px int i10) {
        this.P0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f44990x0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.W0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(a());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.Q0 = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i10) {
        this.S0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i10) {
        this.T0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.V0 = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.U0 = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(a());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i10) {
        this.R0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.J0 = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.L0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f44991y0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i10);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i10, @Nullable View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.f44986s0;
        if (onTouchListener == null) {
            sparseArray.remove(i10);
        } else {
            sparseArray.put(i10, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i10) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@Px int i10) {
        this.O0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(@Px int i10) {
        this.N0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.K0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i10) {
        this.H0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.E0;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.I0 = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i10) {
        this.G0 = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.E0;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.E0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f44988u0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f44987t0 = i10;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.X0 = navigationBarPresenter;
    }

    public void updateMenuView() {
        AutoTransition autoTransition;
        MenuBuilder menuBuilder = this.Y0;
        if (menuBuilder == null || this.f44988u0 == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != this.f44988u0.length) {
            buildMenuView();
            return;
        }
        int i10 = this.v0;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.Y0.getItem(i11);
            if (item.isChecked()) {
                this.v0 = item.getItemId();
                this.f44989w0 = i11;
            }
        }
        if (i10 != this.v0 && (autoTransition = this.f44983p0) != null) {
            TransitionManager.beginDelayedTransition(this, autoTransition);
        }
        boolean zIsShifting = isShifting(this.f44987t0, this.Y0.getVisibleItems().size());
        for (int i12 = 0; i12 < size; i12++) {
            this.X0.setUpdateSuspended(true);
            this.f44988u0[i12].setLabelVisibilityMode(this.f44987t0);
            this.f44988u0[i12].setShifting(zIsShifting);
            this.f44988u0[i12].initialize((MenuItemImpl) this.Y0.getItem(i12), 0);
            this.X0.setUpdateSuspended(false);
        }
    }
}
