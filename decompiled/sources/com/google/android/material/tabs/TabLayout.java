package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f45486q1 = R.style.Widget_Design_TabLayout;
    public static final Pools.SynchronizedPool r1 = new Pools.SynchronizedPool(16);
    public final int E0;
    public ColorStateList F0;
    public ColorStateList G0;
    public ColorStateList H0;

    @NonNull
    public Drawable I0;
    public int J0;
    public final PorterDuff.Mode K0;
    public final float L0;
    public final float M0;
    public final int N0;
    public int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public int T0;
    public final int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f45487a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f45488b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public com.google.android.material.tabs.a f45489c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final TimeInterpolator f45490d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @Nullable
    public BaseOnTabSelectedListener f45491e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final ArrayList<BaseOnTabSelectedListener> f45492f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @Nullable
    public ViewPagerOnTabSelectedListener f45493g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public ValueAnimator f45494h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @Nullable
    public ViewPager f45495i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @Nullable
    public PagerAdapter f45496j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public c f45497k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TabLayoutOnPageChangeListener f45498l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public b f45499m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f45500n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f45501o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f45502p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final Pools.SimplePool f45503p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList<Tab> f45504q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Tab f45505r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final d f45506s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f45507t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f45508u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f45509w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f45510x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f45511y0;

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t10);

        void onTabSelected(T t10);

        void onTabUnselected(T t10);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f45520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45522c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f45520a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.f45521b = this.f45522c;
            this.f45522c = i10;
            TabLayout tabLayout = this.f45520a.get();
            if (tabLayout != null) {
                tabLayout.f45501o1 = this.f45522c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f6, int i11) {
            TabLayout tabLayout = this.f45520a.get();
            if (tabLayout != null) {
                int i12 = this.f45522c;
                tabLayout.j(i10, f6, i12 != 2 || this.f45521b == 1, (i12 == 2 && this.f45521b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f45520a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f45522c;
            tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f45521b == 0));
        }
    }

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int F0 = 0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Tab f45523p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TextView f45524q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ImageView f45525r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public View f45526s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @Nullable
        public BadgeDrawable f45527t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @Nullable
        public View f45528u0;

        @Nullable
        public TextView v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        @Nullable
        public ImageView f45529w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        @Nullable
        public Drawable f45530x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f45531y0;

        public TabView(Context context) {
            super(context);
            this.f45531y0 = 2;
            g(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.f45507t0, TabLayout.this.f45508u0, TabLayout.this.v0, TabLayout.this.f45509w0);
            setGravity(17);
            setOrientation(!TabLayout.this.X0 ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.f45527t0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.f45527t0 == null) {
                this.f45527t0 = BadgeDrawable.create(getContext());
            }
            e();
            BadgeDrawable badgeDrawable = this.f45527t0;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final boolean c() {
            return this.f45527t0 != null;
        }

        public final void d() {
            if (c()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f45526s0;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.f45527t0, view);
                    this.f45526s0 = null;
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f45530x0;
            if (drawable != null && drawable.isStateful() && this.f45530x0.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            Tab tab;
            Tab tab2;
            if (c()) {
                if (this.f45528u0 != null) {
                    d();
                    return;
                }
                FrameLayout frameLayout = null;
                if (this.f45525r0 != null && (tab2 = this.f45523p0) != null && tab2.getIcon() != null) {
                    View view = this.f45526s0;
                    ImageView imageView = this.f45525r0;
                    if (view == imageView) {
                        f(imageView);
                        return;
                    }
                    d();
                    ImageView imageView2 = this.f45525r0;
                    if (c() && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        BadgeDrawable badgeDrawable = this.f45527t0;
                        if ((imageView2 == this.f45525r0 || imageView2 == this.f45524q0) && BadgeUtils.USE_COMPAT_PARENT) {
                            frameLayout = (FrameLayout) imageView2.getParent();
                        }
                        BadgeUtils.attachBadgeDrawable(badgeDrawable, imageView2, frameLayout);
                        this.f45526s0 = imageView2;
                        return;
                    }
                    return;
                }
                if (this.f45524q0 == null || (tab = this.f45523p0) == null || tab.getTabLabelVisibility() != 1) {
                    d();
                    return;
                }
                View view2 = this.f45526s0;
                TextView textView = this.f45524q0;
                if (view2 == textView) {
                    f(textView);
                    return;
                }
                d();
                TextView textView2 = this.f45524q0;
                if (c() && textView2 != null) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup2 = (ViewGroup) getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.setClipChildren(false);
                        viewGroup2.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable2 = this.f45527t0;
                    if ((textView2 == this.f45525r0 || textView2 == this.f45524q0) && BadgeUtils.USE_COMPAT_PARENT) {
                        frameLayout = (FrameLayout) textView2.getParent();
                    }
                    BadgeUtils.attachBadgeDrawable(badgeDrawable2, textView2, frameLayout);
                    this.f45526s0 = textView2;
                }
            }
        }

        public final void f(@NonNull View view) {
            if (c() && view == this.f45526s0) {
                BadgeDrawable badgeDrawable = this.f45527t0;
                FrameLayout frameLayout = null;
                if ((view == this.f45525r0 || view == this.f45524q0) && BadgeUtils.USE_COMPAT_PARENT) {
                    frameLayout = (FrameLayout) view.getParent();
                }
                BadgeUtils.setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
            }
        }

        public final void g(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.N0;
            if (i10 != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i10);
                this.f45530x0 = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f45530x0.setState(getDrawableState());
                }
            } else {
                this.f45530x0 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.H0 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(tabLayout.H0);
                boolean z10 = tabLayout.f45488b1;
                if (z10) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z10 ? null : gradientDrawable3);
            }
            ViewCompat.setBackground(this, rippleDrawable);
            tabLayout.invalidate();
        }

        public int getContentHeight() {
            View[] viewArr = {this.f45524q0, this.f45525r0, this.f45528u0};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f45524q0, this.f45525r0, this.f45528u0};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public Tab getTab() {
            return this.f45523p0;
        }

        public final void h() {
            int i10;
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            ViewParent parent;
            Tab tab = this.f45523p0;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view = this.f45528u0;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f45528u0);
                    }
                    addView(customView);
                }
                this.f45528u0 = customView;
                TextView textView = this.f45524q0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f45525r0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f45525r0.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(android.R.id.text1);
                this.v0 = textView2;
                if (textView2 != null) {
                    this.f45531y0 = TextViewCompat.getMaxLines(textView2);
                }
                this.f45529w0 = (ImageView) customView.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f45528u0;
                if (view2 != null) {
                    removeView(view2);
                    this.f45528u0 = null;
                }
                this.v0 = null;
                this.f45529w0 = null;
            }
            if (this.f45528u0 == null) {
                if (this.f45525r0 == null) {
                    if (BadgeUtils.USE_COMPAT_PARENT) {
                        FrameLayout frameLayout = new FrameLayout(getContext());
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout, 0);
                        viewGroup2 = frameLayout;
                    } else {
                        viewGroup2 = this;
                    }
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, viewGroup2, false);
                    this.f45525r0 = imageView2;
                    viewGroup2.addView(imageView2, 0);
                }
                if (this.f45524q0 == null) {
                    if (BadgeUtils.USE_COMPAT_PARENT) {
                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout2);
                        viewGroup = frameLayout2;
                    } else {
                        viewGroup = this;
                    }
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, viewGroup, false);
                    this.f45524q0 = textView3;
                    viewGroup.addView(textView3);
                    this.f45531y0 = TextViewCompat.getMaxLines(this.f45524q0);
                }
                TextView textView4 = this.f45524q0;
                TabLayout tabLayout = TabLayout.this;
                TextViewCompat.setTextAppearance(textView4, tabLayout.f45510x0);
                if (!isSelected() || (i10 = tabLayout.E0) == -1) {
                    TextViewCompat.setTextAppearance(this.f45524q0, tabLayout.f45511y0);
                } else {
                    TextViewCompat.setTextAppearance(this.f45524q0, i10);
                }
                ColorStateList colorStateList = tabLayout.F0;
                if (colorStateList != null) {
                    this.f45524q0.setTextColor(colorStateList);
                }
                i(this.f45524q0, this.f45525r0, true);
                e();
                ImageView imageView3 = this.f45525r0;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView3));
                }
                TextView textView5 = this.f45524q0;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView5));
                }
            } else {
                TextView textView6 = this.v0;
                if (textView6 != null || this.f45529w0 != null) {
                    i(textView6, this.f45529w0, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.f45515d)) {
                return;
            }
            setContentDescription(tab.f45515d);
        }

        public final void i(@Nullable TextView textView, @Nullable ImageView imageView, boolean z10) {
            boolean z11;
            Tab tab = this.f45523p0;
            Drawable drawableMutate = (tab == null || tab.getIcon() == null) ? null : DrawableCompat.wrap(this.f45523p0.getIcon()).mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                DrawableCompat.setTintList(drawableMutate, tabLayout.G0);
                PorterDuff.Mode mode = tabLayout.K0;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawableMutate, mode);
                }
            }
            Tab tab2 = this.f45523p0;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z12 = !TextUtils.isEmpty(text);
            if (textView != null) {
                z11 = z12 && this.f45523p0.f45518g == 1;
                textView.setText(z12 ? text : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (z11 && imageView.getVisibility() == 0) ? (int) ViewUtils.dpToPx(getContext(), 8) : 0;
                if (tabLayout.X0) {
                    if (iDpToPx != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f45523p0;
            CharSequence charSequence = tab3 != null ? tab3.f45515d : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    text = charSequence;
                }
                TooltipCompat.setTooltipText(this, text);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f45527t0;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfoCompatWrap.setContentDescription(this.f45527t0.getContentDescription());
            }
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f45523p0.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfoCompatWrap.setClickable(false);
                accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.O0, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f45524q0 != null) {
                float f6 = tabLayout.L0;
                int i12 = this.f45531y0;
                ImageView imageView = this.f45525r0;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f45524q0;
                    if (textView != null && textView.getLineCount() > 1) {
                        f6 = tabLayout.M0;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f45524q0.getTextSize();
                int lineCount = this.f45524q0.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f45524q0);
                if (f6 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (tabLayout.W0 == 1 && f6 > textSize && lineCount == 1) {
                        Layout layout = this.f45524q0.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f6 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f45524q0.setTextSize(0, f6);
                    this.f45524q0.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f45523p0 == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f45523p0.select();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f45524q0;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f45525r0;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f45528u0;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(@Nullable Tab tab) {
            if (tab != this.f45523p0) {
                this.f45523p0 = tab;
                h();
                Tab tab2 = this.f45523p0;
                setSelected(tab2 != null && tab2.isSelected());
            }
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45534a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f45495i1 == viewPager) {
                tabLayout.i(pagerAdapter2, this.f45534a);
            }
        }
    }

    public class c extends DataSetObserver {
        public c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.g();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.g();
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final /* synthetic */ int f45537r0 = 0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ValueAnimator f45538p0;

        public d(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f45501o1 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.a aVar = tabLayout.f45489c1;
                Drawable drawable = tabLayout.I0;
                aVar.getClass();
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.f45502p0 = i10;
            }
        }

        public final void b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.I0.getBounds();
            tabLayout.I0.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f6) {
            if (view == null || view.getWidth() <= 0) {
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.I0;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.I0.getBounds().bottom);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                tabLayout2.f45489c1.b(tabLayout2, view, view2, f6, tabLayout2.I0);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        public final void d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f45502p0 == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f45502p0 = i10;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (!z10) {
                this.f45538p0.removeAllUpdateListeners();
                this.f45538p0.addUpdateListener(bVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f45538p0 = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f45490d1);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(bVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.I0.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.I0.getIntrinsicHeight();
            }
            int i10 = tabLayout.V0;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.I0.getBounds().width() > 0) {
                Rect bounds = tabLayout.I0.getBounds();
                tabLayout.I0.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.I0.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f45538p0;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f45502p0 == -1) {
                tabLayout.f45502p0 = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f45502p0);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.T0 == 1 || tabLayout.W0 == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z10 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        return;
                    }
                } else {
                    tabLayout.T0 = 0;
                    tabLayout.l(false);
                }
                super.onMeasure(i10, i11);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public static ColorStateList e(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        ArrayList<Tab> arrayList = this.f45504q0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Tab tab = arrayList.get(i10);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                if (!this.X0) {
                    return 72;
                }
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.P0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.W0;
        if (i11 == 0 || i11 == 2) {
            return this.R0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f45506s0.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        d dVar = this.f45506s0;
        int childCount = dVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).h();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        Tab tabNewTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            tabNewTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            tabNewTab.setIcon(drawable);
        }
        int i10 = tabItem.customLayout;
        if (i10 != 0) {
            tabNewTab.setCustomView(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(tabNewTab);
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.f45504q0.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        a(view);
    }

    public final void b(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            d dVar = this.f45506s0;
            int childCount = dVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (dVar.getChildAt(i11).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iD = d(0.0f, i10);
            if (scrollX != iD) {
                f();
                this.f45494h1.setIntValues(scrollX, iD);
                this.f45494h1.start();
            }
            ValueAnimator valueAnimator = dVar.f45538p0;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f45502p0 != i10) {
                dVar.f45538p0.cancel();
            }
            dVar.d(i10, this.U0, true);
            return;
        }
        setScrollPosition(i10, 0.0f, true);
    }

    public final void c() {
        int i10 = this.W0;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.S0 - this.f45507t0) : 0;
        d dVar = this.f45506s0;
        ViewCompat.setPaddingRelative(dVar, iMax, 0, 0, 0);
        int i11 = this.W0;
        if (i11 == 0) {
            int i12 = this.T0;
            if (i12 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                dVar.setGravity(1);
            } else if (i12 == 2) {
            }
            dVar.setGravity(GravityCompat.START);
        } else if (i11 == 1 || i11 == 2) {
            if (this.T0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            dVar.setGravity(1);
        }
        l(true);
    }

    public void clearOnTabSelectedListeners() {
        this.f45492f1.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Tab createTabFromPool() {
        Tab tab = (Tab) r1.acquire();
        return tab == null ? new Tab() : tab;
    }

    public final int d(float f6, int i10) {
        d dVar;
        View childAt;
        int i11 = this.W0;
        if ((i11 != 0 && i11 != 2) || (childAt = (dVar = this.f45506s0).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < dVar.getChildCount() ? dVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f6);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i13 : left - i13;
    }

    public final void f() {
        if (this.f45494h1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f45494h1 = valueAnimator;
            valueAnimator.setInterpolator(this.f45490d1);
            this.f45494h1.setDuration(this.U0);
            this.f45494h1.addUpdateListener(new a());
        }
    }

    public final void g() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.f45496j1;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                addTab(newTab().setText(this.f45496j1.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.f45495i1;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f45505r0;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f45504q0.get(i10);
    }

    public int getTabCount() {
        return this.f45504q0.size();
    }

    public int getTabGravity() {
        return this.T0;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.G0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f45487a1;
    }

    public int getTabIndicatorGravity() {
        return this.V0;
    }

    public int getTabMaxWidth() {
        return this.O0;
    }

    public int getTabMode() {
        return this.W0;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.H0;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.I0;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.F0;
    }

    public final void h(int i10) {
        d dVar = this.f45506s0;
        TabView tabView = (TabView) dVar.getChildAt(i10);
        dVar.removeViewAt(i10);
        if (tabView != null) {
            tabView.setTab(null);
            tabView.setSelected(false);
            this.f45503p1.release(tabView);
        }
        requestLayout();
    }

    public boolean hasUnboundedRipple() {
        return this.f45488b1;
    }

    public final void i(@Nullable PagerAdapter pagerAdapter, boolean z10) {
        c cVar;
        PagerAdapter pagerAdapter2 = this.f45496j1;
        if (pagerAdapter2 != null && (cVar = this.f45497k1) != null) {
            pagerAdapter2.unregisterDataSetObserver(cVar);
        }
        this.f45496j1 = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.f45497k1 == null) {
                this.f45497k1 = new c();
            }
            pagerAdapter.registerDataSetObserver(this.f45497k1);
        }
        g();
    }

    public boolean isInlineLabel() {
        return this.X0;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.Y0;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    public final void j(int i10, float f6, boolean z10, boolean z11, boolean z12) {
        float f10 = i10 + f6;
        int iRound = Math.round(f10);
        if (iRound >= 0) {
            d dVar = this.f45506s0;
            if (iRound >= dVar.getChildCount()) {
                return;
            }
            if (z11) {
                dVar.getClass();
                TabLayout.this.f45502p0 = Math.round(f10);
                ValueAnimator valueAnimator = dVar.f45538p0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    dVar.f45538p0.cancel();
                }
                dVar.c(dVar.getChildAt(i10), dVar.getChildAt(i10 + 1), f6);
            }
            ValueAnimator valueAnimator2 = this.f45494h1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f45494h1.cancel();
            }
            int iD = d(f6, i10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iD >= scrollX) || (i10 > getSelectedTabPosition() && iD <= scrollX) || i10 == getSelectedTabPosition();
            if (ViewCompat.getLayoutDirection(this) != 1 ? z13 : (i10 < getSelectedTabPosition() && iD <= scrollX) || ((i10 > getSelectedTabPosition() && iD >= scrollX) || i10 == getSelectedTabPosition())) {
                if (i10 < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            } else if (this.f45501o1 == 1 || z12) {
                if (i10 < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void k(@Nullable ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f45495i1;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f45498l1;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            b bVar = this.f45499m1;
            if (bVar != null) {
                this.f45495i1.removeOnAdapterChangeListener(bVar);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.f45493g1;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.f45493g1 = null;
        }
        if (viewPager != null) {
            this.f45495i1 = viewPager;
            if (this.f45498l1 == null) {
                this.f45498l1 = new TabLayoutOnPageChangeListener(this);
            }
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.f45498l1;
            tabLayoutOnPageChangeListener2.f45522c = 0;
            tabLayoutOnPageChangeListener2.f45521b = 0;
            viewPager.addOnPageChangeListener(tabLayoutOnPageChangeListener2);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.f45493g1 = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                i(adapter, z10);
            }
            if (this.f45499m1 == null) {
                this.f45499m1 = new b();
            }
            b bVar2 = this.f45499m1;
            bVar2.f45534a = z10;
            viewPager.addOnAdapterChangeListener(bVar2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f45495i1 = null;
            i(null, false);
        }
        this.f45500n1 = z11;
    }

    public final void l(boolean z10) {
        int i10 = 0;
        while (true) {
            d dVar = this.f45506s0;
            if (i10 >= dVar.getChildCount()) {
                return;
            }
            View childAt = dVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.W0 == 1 && this.T0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Tab newTab() {
        Tab tabCreateTabFromPool = createTabFromPool();
        tabCreateTabFromPool.parent = this;
        Pools.SimplePool simplePool = this.f45503p1;
        TabView tabView = simplePool != null ? (TabView) simplePool.acquire() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tabCreateTabFromPool);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tabCreateTabFromPool.f45515d)) {
            tabView.setContentDescription(tabCreateTabFromPool.f45514c);
        } else {
            tabView.setContentDescription(tabCreateTabFromPool.f45515d);
        }
        tabCreateTabFromPool.view = tabView;
        int i10 = tabCreateTabFromPool.f45519h;
        if (i10 != -1) {
            tabView.setId(i10);
        }
        return tabCreateTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f45495i1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                k((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f45500n1) {
            setupWithViewPager(null);
            this.f45500n1 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            d dVar = this.f45506s0;
            if (i10 >= dVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = dVar.getChildAt(i10);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f45530x0) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f45530x0.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iRound = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iDpToPx = this.Q0;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.O0 = iDpToPx;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.W0;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean releaseFromTabPool(Tab tab) {
        return r1.release(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.f45506s0.getChildCount() - 1; childCount >= 0; childCount--) {
            h(childCount);
        }
        Iterator<Tab> it = this.f45504q0.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.parent = null;
            next.view = null;
            next.f45512a = null;
            next.f45513b = null;
            next.f45519h = -1;
            next.f45514c = null;
            next.f45515d = null;
            next.f45516e = -1;
            next.f45517f = null;
            releaseFromTabPool(next);
        }
        this.f45505r0 = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i10) {
        Tab tab = this.f45505r0;
        int position = tab != null ? tab.getPosition() : 0;
        h(i10);
        ArrayList<Tab> arrayList = this.f45504q0;
        Tab tabRemove = arrayList.remove(i10);
        int i11 = -1;
        if (tabRemove != null) {
            tabRemove.parent = null;
            tabRemove.view = null;
            tabRemove.f45512a = null;
            tabRemove.f45513b = null;
            tabRemove.f45519h = -1;
            tabRemove.f45514c = null;
            tabRemove.f45515d = null;
            tabRemove.f45516e = -1;
            tabRemove.f45517f = null;
            releaseFromTabPool(tabRemove);
        }
        int size = arrayList.size();
        for (int i12 = i10; i12 < size; i12++) {
            if (arrayList.get(i12).getPosition() == this.f45502p0) {
                i11 = i12;
            }
            arrayList.get(i12).f45516e = i12;
        }
        this.f45502p0 = i11;
        if (position == i10) {
            selectTab(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i10 - 1)));
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    public void setInlineLabel(boolean z10) {
        if (this.X0 == z10) {
            return;
        }
        this.X0 = z10;
        int i10 = 0;
        while (true) {
            d dVar = this.f45506s0;
            if (i10 >= dVar.getChildCount()) {
                c();
                return;
            }
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.X0 ? 1 : 0);
                TextView textView = tabView.v0;
                if (textView == null && tabView.f45529w0 == null) {
                    tabView.i(tabView.f45524q0, tabView.f45525r0, true);
                } else {
                    tabView.i(textView, tabView.f45529w0, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(@BoolRes int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f45494h1.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f6, boolean z10) {
        setScrollPosition(i10, f6, z10, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        this.I0 = drawableMutate;
        DrawableUtils.setTint(drawableMutate, this.J0);
        int intrinsicHeight = this.Z0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.I0.getIntrinsicHeight();
        }
        this.f45506s0.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i10) {
        this.J0 = i10;
        DrawableUtils.setTint(this.I0, i10);
        l(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            ViewCompat.postInvalidateOnAnimation(this.f45506s0);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.Z0 = i10;
        this.f45506s0.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.T0 != i10) {
            this.T0 = i10;
            c();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            ArrayList<Tab> arrayList = this.f45504q0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int i10) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f45487a1 = i10;
        if (i10 == 0) {
            this.f45489c1 = new com.google.android.material.tabs.a();
            return;
        }
        if (i10 == 1) {
            this.f45489c1 = new oe.a();
        } else {
            if (i10 == 2) {
                this.f45489c1 = new oe.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.Y0 = z10;
        int i10 = d.f45537r0;
        d dVar = this.f45506s0;
        dVar.a(TabLayout.this.getSelectedTabPosition());
        ViewCompat.postInvalidateOnAnimation(dVar);
    }

    public void setTabMode(int i10) {
        if (i10 != this.W0) {
            this.W0 = i10;
            c();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.H0 == colorStateList) {
            return;
        }
        this.H0 = colorStateList;
        int i10 = 0;
        while (true) {
            d dVar = this.f45506s0;
            if (i10 >= dVar.getChildCount()) {
                return;
            }
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i11 = TabView.F0;
                ((TabView) childAt).g(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(@ColorRes int i10) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            ArrayList<Tab> arrayList = this.f45504q0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        i(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f45488b1 == z10) {
            return;
        }
        this.f45488b1 = z10;
        int i10 = 0;
        while (true) {
            d dVar = this.f45506s0;
            if (i10 >= dVar.getChildCount()) {
                return;
            }
            View childAt = dVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i11 = TabView.F0;
                ((TabView) childAt).g(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f45512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Drawable f45513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f45514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public CharSequence f45515d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public View f45517f;

        @Nullable
        public TabLayout parent;

        @NonNull
        public TabView view;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45516e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @LabelVisibility
        public int f45518g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45519h = -1;

        public final void a() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.h();
                Tab tab = tabView.f45523p0;
                tabView.setSelected(tab != null && tab.isSelected());
            }
        }

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.f45517f;
        }

        @Nullable
        public Drawable getIcon() {
            return this.f45513b;
        }

        public int getId() {
            return this.f45519h;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f45516e;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.f45518g;
        }

        @Nullable
        public Object getTag() {
            return this.f45512a;
        }

        @Nullable
        public CharSequence getText() {
            return this.f45514c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f45516e;
        }

        public void removeBadge() {
            TabView tabView = this.view;
            if (tabView.f45526s0 != null) {
                tabView.d();
            }
            tabView.f45527t0 = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@StringRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@Nullable View view) {
            this.f45517f = view;
            a();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@Nullable Drawable drawable) {
            this.f45513b = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.T0 == 1 || tabLayout.W0 == 2) {
                tabLayout.l(true);
            }
            a();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                TabView tabView = this.view;
                int i10 = TabView.F0;
                if (tabView.c() && this.view.f45527t0.isVisible()) {
                    this.view.invalidate();
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setId(int i10) {
            this.f45519h = i10;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i10);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(@LabelVisibility int i10) {
            this.f45518g = i10;
            TabLayout tabLayout = this.parent;
            if (tabLayout.T0 == 1 || tabLayout.W0 == 2) {
                tabLayout.l(true);
            }
            a();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                TabView tabView = this.view;
                int i11 = TabView.F0;
                if (tabView.c() && this.view.f45527t0.isVisible()) {
                    this.view.invalidate();
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTag(@Nullable Object obj) {
            this.f45512a = obj;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f45515d) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.f45514c = charSequence;
            a();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@LayoutRes int i10) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i10, (ViewGroup) this.view, false));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.f45515d = charSequence;
            a();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@StringRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@DrawableRes int i10) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        ArrayList<BaseOnTabSelectedListener> arrayList = this.f45492f1;
        if (arrayList.contains(baseOnTabSelectedListener)) {
            return;
        }
        arrayList.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i10) {
        addTab(tab, i10, this.f45504q0.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        a(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.f45492f1.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z10) {
        Tab tab2 = this.f45505r0;
        ArrayList<BaseOnTabSelectedListener> arrayList = this.f45492f1;
        if (tab2 == tab) {
            if (tab2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).onTabReselected(tab);
                }
                b(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z10) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                b(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f45505r0 = tab;
        if (tab2 != null && tab2.parent != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).onTabUnselected(tab2);
            }
        }
        if (tab != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).onTabSelected(tab);
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f45491e1;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.f45491e1 = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i10, float f6, boolean z10, boolean z11) {
        j(i10, f6, z10, z11, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z10) {
        k(viewPager, z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f45486q1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f45502p0 = -1;
        this.f45504q0 = new ArrayList<>();
        this.E0 = -1;
        this.J0 = 0;
        this.O0 = Integer.MAX_VALUE;
        this.Z0 = -1;
        this.f45492f1 = new ArrayList<>();
        this.f45503p1 = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        d dVar = new d(context2);
        this.f45506s0 = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = R.styleable.TabLayout;
        int i12 = R.styleable.TabLayout_tabTextAppearance;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        dVar.b(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f45509w0 = dimensionPixelSize;
        this.v0 = dimensionPixelSize;
        this.f45508u0 = dimensionPixelSize;
        this.f45507t0 = dimensionPixelSize;
        this.f45507t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f45508u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.f45509w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (ThemeEnforcement.isMaterial3Theme(context2)) {
            this.f45510x0 = R.attr.textAppearanceTitleSmall;
        } else {
            this.f45510x0 = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, R.style.TextAppearance_Design_Tab);
        this.f45511y0 = resourceId;
        int[] iArr2 = androidx.appcompat.R.styleable.TextAppearance;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = androidx.appcompat.R.styleable.TextAppearance_android_textSize;
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, 0);
            this.L0 = dimensionPixelSize2;
            int i14 = androidx.appcompat.R.styleable.TextAppearance_android_textColor;
            this.F0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, i14);
            typedArrayObtainStyledAttributes2.recycle();
            int i15 = R.styleable.TabLayout_tabSelectedTextAppearance;
            if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                this.E0 = typedArrayObtainStyledAttributes.getResourceId(i15, resourceId);
            }
            int i16 = this.E0;
            if (i16 != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    typedArrayObtainStyledAttributes3.getDimensionPixelSize(i13, (int) dimensionPixelSize2);
                    ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes3, i14);
                    if (colorStateList != null) {
                        this.F0 = e(this.F0.getDefaultColor(), colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes3.recycle();
                    throw th2;
                }
            }
            int i17 = R.styleable.TabLayout_tabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                this.F0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i17);
            }
            int i18 = R.styleable.TabLayout_tabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i18)) {
                this.F0 = e(this.F0.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(i18, 0));
            }
            this.G0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIconTint);
            this.K0 = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.H0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabRippleColor);
            this.U0 = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f45490d1 = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.N0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.W0 = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.T0 = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.X0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.f45488b1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.M0 = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.R0 = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void addTab(@NonNull Tab tab, boolean z10) {
        addTab(tab, this.f45504q0.size(), z10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void addTab(@NonNull Tab tab, int i10, boolean z10) {
        if (tab.parent == this) {
            tab.f45516e = i10;
            ArrayList<Tab> arrayList = this.f45504q0;
            arrayList.add(i10, tab);
            int size = arrayList.size();
            int i11 = -1;
            for (int i12 = i10 + 1; i12 < size; i12++) {
                if (arrayList.get(i12).getPosition() == this.f45502p0) {
                    i11 = i12;
                }
                arrayList.get(i12).f45516e = i12;
            }
            this.f45502p0 = i11;
            TabView tabView = tab.view;
            tabView.setSelected(false);
            tabView.setActivated(false);
            int position = tab.getPosition();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.W0 == 1 && this.T0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f45506s0.addView(tabView, position, layoutParams);
            if (z10) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(e(i10, i11));
    }

    public void setSelectedTabIndicator(@DrawableRes int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f45532a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f45532a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.f45532a.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }
}
