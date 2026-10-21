package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int[] f44967a1 = {R.attr.state_checked};

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final c f44968b1 = new c();

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final d f44969c1 = new d();
    public boolean E0;

    @Nullable
    public final FrameLayout F0;

    @Nullable
    public final View G0;
    public final ImageView H0;
    public final ViewGroup I0;
    public final TextView J0;
    public final TextView K0;
    public int L0;

    @StyleRes
    public int M0;

    @Nullable
    public MenuItemImpl N0;

    @Nullable
    public ColorStateList O0;

    @Nullable
    public Drawable P0;

    @Nullable
    public Drawable Q0;
    public ValueAnimator R0;
    public c S0;
    public float T0;
    public boolean U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;

    @Nullable
    public BadgeDrawable Z0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f44970p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ColorStateList f44971q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Drawable f44972r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f44973s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f44974t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f44975u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f44976w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f44977x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f44978y0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            BadgeDrawable badgeDrawable;
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            if (navigationBarItemView.H0.getVisibility() != 0 || (badgeDrawable = navigationBarItemView.Z0) == null) {
                return;
            }
            boolean z10 = BadgeUtils.USE_COMPAT_PARENT;
            ImageView imageView = navigationBarItemView.H0;
            BadgeUtils.setBadgeDrawableBounds(badgeDrawable, imageView, z10 ? (FrameLayout) imageView.getParent() : null);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f44980p0;

        public b(int i10) {
            this.f44980p0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = NavigationBarItemView.f44967a1;
            NavigationBarItemView.this.g(this.f44980p0);
        }
    }

    public static class c {
        public float a(@FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
            return 1.0f;
        }
    }

    public static class d extends c {
        @Override // com.google.android.material.navigation.NavigationBarItemView.c
        public final float a(float f6, float f10) {
            return AnimationUtils.lerp(0.4f, 1.0f, f6);
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f44970p0 = false;
        this.L0 = -1;
        this.M0 = 0;
        this.S0 = f44968b1;
        this.T0 = 0.0f;
        this.U0 = false;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = false;
        this.Y0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.F0 = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.G0 = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.H0 = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.I0 = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.J0 = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.K0 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f44973s0 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f44974t0 = viewGroup.getPaddingBottom();
        this.f44975u0 = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_active_indicator_label_padding);
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    public static void e(float f6, float f10, int i10, @NonNull TextView textView) {
        textView.setScaleX(f6);
        textView.setScaleY(f10);
        textView.setVisibility(i10);
    }

    public static void f(@NonNull View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.F0;
        return frameLayout != null ? frameLayout : this.H0;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.Z0;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.Z0.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.H0.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(int i10, @NonNull ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a(float f6, float f10) {
        this.v0 = f6 - f10;
        this.f44976w0 = (f10 * 1.0f) / f6;
        this.f44977x0 = (f6 * 1.0f) / f10;
    }

    public final void b() {
        MenuItemImpl menuItemImpl = this.N0;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    public final void c() {
        Drawable rippleDrawable = this.f44972r0;
        ColorStateList colorStateList = this.f44971q0;
        FrameLayout frameLayout = this.F0;
        RippleDrawable rippleDrawable2 = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.U0 && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f44971q0), null, activeIndicatorDrawable);
                z10 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(this.f44971q0), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        ViewCompat.setBackground(this, rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void d(@FloatRange(from = 0.0d, to = 1.0d) float f6, float f10) {
        View view = this.G0;
        if (view != null) {
            c cVar = this.S0;
            cVar.getClass();
            view.setScaleX(AnimationUtils.lerp(0.4f, 1.0f, f6));
            view.setScaleY(cVar.a(f6, f10));
            view.setAlpha(AnimationUtils.lerp(0.0f, 1.0f, f10 == 0.0f ? 0.8f : 0.0f, f10 == 0.0f ? 1.0f : 0.2f, f6));
        }
        this.T0 = f6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.F0;
        if (frameLayout != null && this.U0) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(int i10) {
        View view = this.G0;
        if (view == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.V0, i10 - (this.Y0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.X0 && this.f44978y0 == 2) ? iMin : this.W0;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.G0;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.Z0;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.N0;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.L0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.I0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f44975u0 : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.I0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        this.N0 = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.f44970p0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemImpl menuItemImpl = this.N0;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.N0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f44967a1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.Z0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.N0.getTitle();
            if (!TextUtils.isEmpty(this.N0.getContentDescription())) {
                title = this.N0.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.Z0.getContentDescription()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.G0;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.U0 = z10;
        c();
        View view = this.G0;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.W0 = i10;
        g(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f44975u0 != i10) {
            this.f44975u0 = i10;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i10) {
        this.Y0 = i10;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.X0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.V0 = i10;
        g(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        BadgeDrawable badgeDrawable2 = this.Z0;
        if (badgeDrawable2 == badgeDrawable) {
            return;
        }
        boolean z10 = badgeDrawable2 != null;
        ImageView imageView = this.H0;
        if (z10 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.Z0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.Z0, imageView);
                this.Z0 = null;
            }
        }
        this.Z0 = badgeDrawable;
        if (imageView == null || badgeDrawable == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeUtils.attachBadgeDrawable(this.Z0, imageView, BadgeUtils.USE_COMPAT_PARENT ? (FrameLayout) imageView.getParent() : null);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
        TextView textView = this.K0;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.J0;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f6 = z10 ? 1.0f : 0.0f;
        if (this.U0 && this.f44970p0 && ViewCompat.isAttachedToWindow(this)) {
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.T0, f6);
            this.R0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.navigation.b(this, f6));
            this.R0.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.R0.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            this.R0.start();
        } else {
            d(f6, f6);
        }
        int i10 = this.f44978y0;
        ViewGroup viewGroup = this.I0;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    f(getIconOrContainer(), this.f44973s0, 49);
                    h(this.f44974t0, viewGroup);
                    textView.setVisibility(0);
                } else {
                    f(getIconOrContainer(), this.f44973s0, 17);
                    h(0, viewGroup);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i10 == 1) {
                h(this.f44974t0, viewGroup);
                if (z10) {
                    f(getIconOrContainer(), (int) (this.f44973s0 + this.v0), 49);
                    e(1.0f, 1.0f, 0, textView);
                    float f10 = this.f44976w0;
                    e(f10, f10, 4, textView2);
                } else {
                    f(getIconOrContainer(), this.f44973s0, 49);
                    float f11 = this.f44977x0;
                    e(f11, f11, 4, textView);
                    e(1.0f, 1.0f, 0, textView2);
                }
            } else if (i10 == 2) {
                f(getIconOrContainer(), this.f44973s0, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.E0) {
            if (z10) {
                f(getIconOrContainer(), this.f44973s0, 49);
                h(this.f44974t0, viewGroup);
                textView.setVisibility(0);
            } else {
                f(getIconOrContainer(), this.f44973s0, 17);
                h(0, viewGroup);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            h(this.f44974t0, viewGroup);
            if (z10) {
                f(getIconOrContainer(), (int) (this.f44973s0 + this.v0), 49);
                e(1.0f, 1.0f, 0, textView);
                float f12 = this.f44976w0;
                e(f12, f12, 4, textView2);
            } else {
                f(getIconOrContainer(), this.f44973s0, 49);
                float f13 = this.f44977x0;
                e(f13, f13, 4, textView);
                e(1.0f, 1.0f, 0, textView2);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.J0.setEnabled(z10);
        this.K0.setEnabled(z10);
        this.H0.setEnabled(z10);
        if (z10) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.P0) {
            return;
        }
        this.P0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.Q0 = drawable;
            ColorStateList colorStateList = this.O0;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.H0.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.H0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.O0 = colorStateList;
        if (this.N0 == null || (drawable = this.Q0) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable, colorStateList);
        this.Q0.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : ContextCompat.getDrawable(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f44974t0 != i10) {
            this.f44974t0 = i10;
            b();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f44973s0 != i10) {
            this.f44973s0 = i10;
            b();
        }
    }

    public void setItemPosition(int i10) {
        this.L0 = i10;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f44971q0 = colorStateList;
        c();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f44978y0 != i10) {
            this.f44978y0 = i10;
            if (this.X0 && i10 == 2) {
                this.S0 = f44969c1;
            } else {
                this.S0 = f44968b1;
            }
            g(getWidth());
            b();
        }
    }

    public void setShifting(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
            b();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i10) {
        this.M0 = i10;
        TextView textView = this.K0;
        TextViewCompat.setTextAppearance(textView, i10);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i10, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
        a(this.J0.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.M0);
        TextView textView = this.K0;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(@StyleRes int i10) {
        TextView textView = this.J0;
        TextViewCompat.setTextAppearance(textView, i10);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i10, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
        a(textView.getTextSize(), this.K0.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.J0.setTextColor(colorStateList);
            this.K0.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.J0.setText(charSequence);
        this.K0.setText(charSequence);
        MenuItemImpl menuItemImpl = this.N0;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.N0;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.N0.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f44972r0 = drawable;
        c();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }
}
