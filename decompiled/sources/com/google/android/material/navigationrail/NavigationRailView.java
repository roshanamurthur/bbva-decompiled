package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import ke.b;

/* JADX INFO: loaded from: classes10.dex */
public class NavigationRailView extends NavigationBarView {

    @Nullable
    public final Boolean E0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public View f45018w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final Boolean f45019x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public final Boolean f45020y0;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    public void addHeaderView(@LayoutRes int i10) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, false));
    }

    @Nullable
    public View getHeaderView() {
        return this.f45018w0;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f45018w0;
        int i14 = 0;
        boolean z11 = (view == null || view.getVisibility() == 8) ? false : true;
        int i15 = this.v0;
        if (z11) {
            int bottom = this.f45018w0.getBottom() + i15;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else if ((navigationRailMenuView.f45017c1.gravity & 112) == 48) {
            i14 = i15;
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumWidth > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i10, i11);
        View view = this.f45018w0;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild(getNavigationRailMenuView(), i10, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f45018w0.getMeasuredHeight()) - this.v0, Integer.MIN_VALUE));
    }

    public void removeHeaderView() {
        View view = this.f45018w0;
        if (view != null) {
            removeView(view);
            this.f45018w0 = null;
        }
    }

    public void setItemMinimumHeight(@Px int i10) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(@NonNull View view) {
        removeHeaderView();
        this.f45018w0 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.v0;
        addView(view, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationRailMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f45019x0 = null;
        this.f45020y0 = null;
        this.E0 = null;
        this.v0 = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i10, i11, new int[0]);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int i12 = R.styleable.NavigationRailView_itemMinHeight;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i12)) {
            setItemMinimumHeight(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = R.styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i13)) {
            this.f45019x0 = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i14)) {
            this.f45020y0 = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i14, false));
        }
        int i15 = R.styleable.NavigationRailView_paddingStartSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i15)) {
            this.E0 = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i15, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        ViewUtils.doOnApplyWindowInsets(this, new b(this));
    }
}
