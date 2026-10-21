package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int[] R0 = {R.attr.state_checked};
    public static final int[] S0 = {-16842910};
    public static final int T0 = com.google.android.material.R.style.Widget_Design_NavigationView;
    public final int E0;
    public final int[] F0;
    public SupportMenuInflater G0;
    public final d H0;
    public boolean I0;
    public boolean J0;

    @Px
    public int K0;
    public final boolean L0;

    @Px
    public final int M0;
    public final ShapeableDelegate N0;
    public final MaterialSideContainerBackHelper O0;
    public final MaterialBackOrchestrator P0;
    public final a Q0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    public final NavigationMenu f45006w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final NavigationMenuPresenter f45007x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public OnNavigationItemSelectedListener f45008y0;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public class a extends DrawerLayout.SimpleDrawerListener {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public final void onDrawerClosed(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.P0.stopListeningForBackCallbacks();
                if (!navigationView.L0 || navigationView.K0 == 0) {
                    return;
                }
                navigationView.K0 = 0;
                navigationView.d(navigationView.getWidth(), navigationView.getHeight());
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public final void onDrawerOpened(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                MaterialBackOrchestrator materialBackOrchestrator = navigationView.P0;
                Objects.requireNonNull(materialBackOrchestrator);
                view.post(new androidx.lifecycle.b(materialBackOrchestrator, 3));
            }
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.G0 == null) {
            this.G0 = new SupportMenuInflater(getContext());
        }
        return this.G0;
    }

    public void addHeaderView(@NonNull View view) {
        this.f45007x0.addHeaderView(view);
    }

    @Nullable
    public final ColorStateList b(int i10) {
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
        int[] iArr = S0;
        return new ColorStateList(new int[][]{iArr, R0, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @NonNull
    public final InsetDrawable c(@NonNull TintTypedArray tintTypedArray, @Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        e();
        this.O0.cancelBackProgress();
        if (!this.L0 || this.K0 == 0) {
            return;
        }
        this.K0 = 0;
        d(getWidth(), getHeight());
    }

    public final void d(@Px int i10, @Px int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.K0 > 0 || this.L0) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z10 = GravityCompat.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this)) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.K0);
                if (z10) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                ShapeableDelegate shapeableDelegate = this.N0;
                shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i10, i11));
                shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        this.N0.maybeClip(canvas, new c(this));
    }

    @CanIgnoreReturnValue
    public final Pair<DrawerLayout, DrawerLayout.LayoutParams> e() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.O0;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f45007x0.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f45007x0.getDividerInsetEnd();
    }

    @Px
    public int getDividerInsetStart() {
        return this.f45007x0.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.f45007x0.getHeaderCount();
    }

    public View getHeaderView(int i10) {
        return this.f45007x0.getHeaderView(i10);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f45007x0.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f45007x0.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f45007x0.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f45007x0.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.f45007x0.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f45007x0.getItemTextColor();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f45007x0.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.f45006w0;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f45007x0.getSubheaderInsetEnd();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f45007x0.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> pairE = e();
        DrawerLayout drawerLayout = (DrawerLayout) pairE.first;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        BackEventCompat backEventCompatOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
        } else {
            materialSideContainerBackHelper.finishBackProgress(backEventCompatOnHandleBackInvoked, ((DrawerLayout.LayoutParams) pairE.second).gravity, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
        }
    }

    public View inflateHeaderView(@LayoutRes int i10) {
        return this.f45007x0.inflateHeaderView(i10);
    }

    public void inflateMenu(int i10) {
        NavigationMenuPresenter navigationMenuPresenter = this.f45007x0;
        navigationMenuPresenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i10, this.f45006w0);
        navigationMenuPresenter.setUpdateSuspended(false);
        navigationMenuPresenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.J0;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.I0;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            MaterialBackOrchestrator materialBackOrchestrator = this.P0;
            if (materialBackOrchestrator.shouldListenForBackCallbacks()) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                a aVar = this.Q0;
                drawerLayout.removeDrawerListener(aVar);
                drawerLayout.addDrawerListener(aVar);
                if (drawerLayout.isDrawerOpen(this)) {
                    materialBackOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.H0);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).removeDrawerListener(this.Q0);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.f45007x0.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.E0;
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f45006w0.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.f45006w0.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f45007x0.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.J0 = z10;
    }

    public void setCheckedItem(@IdRes int i10) {
        MenuItem menuItemFindItem = this.f45006w0.findItem(i10);
        if (menuItemFindItem != null) {
            this.f45007x0.setCheckedItem((MenuItemImpl) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f45007x0.setDividerInsetEnd(i10);
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f45007x0.setDividerInsetStart(i10);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z10) {
        this.N0.setForceCompatClippingEnabled(this, z10);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f45007x0.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i10) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setItemHorizontalPadding(@Dimension int i10) {
        this.f45007x0.setItemHorizontalPadding(i10);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i10) {
        this.f45007x0.setItemHorizontalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@Dimension int i10) {
        this.f45007x0.setItemIconPadding(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f45007x0.setItemIconPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f45007x0.setItemIconSize(i10);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f45007x0.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f45007x0.setItemMaxLines(i10);
    }

    public void setItemTextAppearance(@StyleRes int i10) {
        this.f45007x0.setItemTextAppearance(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f45007x0.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f45007x0.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i10) {
        this.f45007x0.setItemVerticalPadding(i10);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i10) {
        this.f45007x0.setItemVerticalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f45008y0 = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        NavigationMenuPresenter navigationMenuPresenter = this.f45007x0;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i10);
        }
    }

    public void setSubheaderInsetEnd(@Px int i10) {
        this.f45007x0.setSubheaderInsetEnd(i10);
    }

    public void setSubheaderInsetStart(@Px int i10) {
        this.f45007x0.setSubheaderInsetStart(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.I0 = z10;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        e();
        this.O0.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        int i10 = ((DrawerLayout.LayoutParams) e().second).gravity;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, i10);
        if (this.L0) {
            this.K0 = AnimationUtils.lerp(0, this.M0, materialSideContainerBackHelper.interpolateProgress(backEventCompat.getProgress()));
            d(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        @Nullable
        public Bundle menuState;

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

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListB;
        int i11;
        int i12;
        int i13 = T0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i13), attributeSet, i10);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.f45007x0 = navigationMenuPresenter;
        this.F0 = new int[2];
        this.I0 = true;
        this.J0 = true;
        this.K0 = 0;
        this.N0 = ShapeableDelegate.create(this);
        this.O0 = new MaterialSideContainerBackHelper(this);
        this.P0 = new MaterialBackOrchestrator(this);
        this.Q0 = new a();
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.f45006w0 = navigationMenu;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i10, i13, new int[0]);
        int i14 = com.google.android.material.R.styleable.NavigationView_android_background;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i14)) {
            ViewCompat.setBackground(this, tintTypedArrayObtainTintedStyledAttributes.getDrawable(i14));
        }
        int dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.K0 = dimensionPixelSize;
        this.L0 = dimensionPixelSize == 0;
        this.M0 = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i10, i13).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        int i15 = com.google.android.material.R.styleable.NavigationView_elevation;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i15)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i15, 0));
        }
        setFitsSystemWindows(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.E0 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i16 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateList = tintTypedArrayObtainTintedStyledAttributes.hasValue(i16) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i16) : null;
        int i17 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.hasValue(i17) ? tintTypedArrayObtainTintedStyledAttributes.getResourceId(i17, 0) : 0;
        if (resourceId == 0 && colorStateList == null) {
            colorStateList = b(R.attr.textColorSecondary);
        }
        int i18 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            colorStateListB = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i18);
        } else {
            colorStateListB = b(R.attr.textColorSecondary);
        }
        int i19 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(i19) ? tintTypedArrayObtainTintedStyledAttributes.getResourceId(i19, 0) : 0;
        boolean z10 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i20 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i20)) {
            setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i20, 0));
        }
        int i21 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateList2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(i21) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i21) : null;
        if (resourceId2 == 0 && colorStateList2 == null) {
            colorStateList2 = b(R.attr.textColorPrimary);
        }
        Drawable drawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawable == null && (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay))) {
            drawable = c(tintTypedArrayObtainTintedStyledAttributes, MaterialResources.getColorStateList(getContext(), tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
            ColorStateList colorStateList3 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList3 != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList3), null, c(tintTypedArrayObtainTintedStyledAttributes, null)));
            }
        }
        int i22 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i22)) {
            i11 = 0;
            setItemHorizontalPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i22, 0));
        } else {
            i11 = 0;
        }
        int i23 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            setItemVerticalPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i23, i11));
        }
        setDividerInsetStart(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i11));
        setDividerInsetEnd(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i11));
        setSubheaderInsetStart(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i11));
        setSubheaderInsetEnd(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i11));
        setTopInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.I0));
        setBottomInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.J0));
        int dimensionPixelSize2 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, i11);
        setItemMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new b());
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateList);
        navigationMenuPresenter.setItemIconTintList(colorStateListB);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z10);
        navigationMenuPresenter.setItemTextColor(colorStateList2);
        navigationMenuPresenter.setItemBackground(drawable);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i24 = com.google.android.material.R.styleable.NavigationView_menu;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i24)) {
            i12 = 0;
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i24, 0));
        } else {
            i12 = 0;
        }
        int i25 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i25)) {
            inflateHeaderView(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i25, i12));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        this.H0 = new d(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.H0);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f45006w0.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f45007x0.setCheckedItem((MenuItemImpl) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public class b implements MenuBuilder.Callback {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.f45008y0;
            return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }
}
