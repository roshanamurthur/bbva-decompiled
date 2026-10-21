package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final NavigationBarMenu f44998p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final NavigationBarMenuView f44999q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final NavigationBarPresenter f45000r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SupportMenuInflater f45001s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public OnItemSelectedListener f45002t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public OnItemReselectedListener f45003u0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public Bundle f45004q0;

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
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f45004q0 = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f45004q0);
        }
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f45000r0 = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = R.styleable.NavigationBarView;
        int i12 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i13 = R.styleable.NavigationBarView_itemTextAppearanceActive;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i10, i11, i12, i13);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.f44998p0 = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.f44999q0 = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        int i14 = R.styleable.NavigationBarView_itemIconTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i14)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i14));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i12)) {
            setItemTextAppearanceInactive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i12, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i13)) {
            setItemTextAppearanceActive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i13, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        int i15 = R.styleable.NavigationBarView_itemTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i15)) {
            setItemTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i15));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        int i16 = R.styleable.NavigationBarView_itemPaddingTop;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i16)) {
            setItemPaddingTop(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i16, 0));
        }
        int i17 = R.styleable.NavigationBarView_itemPaddingBottom;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i17)) {
            setItemPaddingBottom(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i17, 0));
        }
        int i18 = R.styleable.NavigationBarView_activeIndicatorLabelPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            setActiveIndicatorLabelPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i18, 0));
        }
        int i19 = R.styleable.NavigationBarView_elevation;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i19, 0));
        }
        DrawableCompat.setTintList(getBackground().mutate(), MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(tintTypedArrayObtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i20 = R.styleable.NavigationBarView_menu;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i20)) {
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i20, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        addView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarMenu.setCallback(new a());
    }

    private MenuInflater getMenuInflater() {
        if (this.f45001s0 == null) {
            this.f45001s0 = new SupportMenuInflater(getContext());
        }
        return this.f45001s0;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.f44999q0.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int i10) {
        return this.f44999q0.getBadge(i10);
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f44999q0.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f44999q0.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f44999q0.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f44999q0.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f44999q0.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f44999q0.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f44999q0.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f44999q0.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f44999q0.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f44999q0.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f44999q0.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f44999q0.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f44999q0.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f44999q0.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f44999q0.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f44999q0.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f44998p0;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f44999q0;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f44999q0;
        navigationBarMenuView.getClass();
        NavigationBarMenuView.b(i10);
        SparseArray<BadgeDrawable> sparseArray = navigationBarMenuView.M0;
        BadgeDrawable badgeDrawableCreate = sparseArray.get(i10);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = BadgeDrawable.create(navigationBarMenuView.getContext());
            sparseArray.put(i10, badgeDrawableCreate);
        }
        NavigationBarItemView navigationBarItemViewFindItemView = navigationBarMenuView.findItemView(i10);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f45000r0;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f44999q0.getSelectedItemId();
    }

    public void inflateMenu(int i10) {
        NavigationBarPresenter navigationBarPresenter = this.f45000r0;
        navigationBarPresenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i10, this.f44998p0);
        navigationBarPresenter.setUpdateSuspended(false);
        navigationBarPresenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.f44999q0.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44998p0.restorePresenterStates(savedState.f45004q0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f45004q0 = bundle;
        this.f44998p0.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f44999q0;
        navigationBarMenuView.getClass();
        NavigationBarMenuView.b(i10);
        NavigationBarItemView navigationBarItemViewFindItemView = navigationBarMenuView.findItemView(i10);
        if (navigationBarItemViewFindItemView != null && navigationBarItemViewFindItemView.Z0 != null) {
            ImageView imageView = navigationBarItemViewFindItemView.H0;
            if (imageView != null) {
                navigationBarItemViewFindItemView.setClipChildren(true);
                navigationBarItemViewFindItemView.setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(navigationBarItemViewFindItemView.Z0, imageView);
            }
            navigationBarItemViewFindItemView.Z0 = null;
        }
        navigationBarMenuView.M0.put(i10, null);
    }

    public void setActiveIndicatorLabelPadding(@Px int i10) {
        this.f44999q0.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f44999q0.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f44999q0.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(@Px int i10) {
        this.f44999q0.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i10) {
        this.f44999q0.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f44999q0.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i10) {
        this.f44999q0.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f44999q0.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i10) {
        this.f44999q0.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f44999q0.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(@DimenRes int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f44999q0.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i10, @Nullable View.OnTouchListener onTouchListener) {
        this.f44999q0.setItemOnTouchListener(i10, onTouchListener);
    }

    public void setItemPaddingBottom(@Px int i10) {
        this.f44999q0.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(@Px int i10) {
        this.f44999q0.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f44999q0.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i10) {
        this.f44999q0.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f44999q0.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i10) {
        this.f44999q0.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f44999q0.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f44999q0;
        if (navigationBarMenuView.getLabelVisibilityMode() != i10) {
            navigationBarMenuView.setLabelVisibilityMode(i10);
            this.f45000r0.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.f45003u0 = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.f45002t0 = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i10) {
        NavigationBarMenu navigationBarMenu = this.f44998p0;
        MenuItem menuItemFindItem = navigationBarMenu.findItem(i10);
        if (menuItemFindItem == null || navigationBarMenu.performItemAction(menuItemFindItem, this.f45000r0, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public class a implements MenuBuilder.Callback {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            NavigationBarView navigationBarView = NavigationBarView.this;
            if (navigationBarView.f45003u0 == null || menuItem.getItemId() != navigationBarView.getSelectedItemId()) {
                OnItemSelectedListener onItemSelectedListener = navigationBarView.f45002t0;
                return (onItemSelectedListener == null || onItemSelectedListener.onNavigationItemSelected(menuItem)) ? false : true;
            }
            navigationBarView.f45003u0.onNavigationItemReselected(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }
}
