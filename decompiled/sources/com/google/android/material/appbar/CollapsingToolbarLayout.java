package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zd.c;
import zd.g;

/* JADX INFO: loaded from: classes10.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    public static final int Z0 = R.style.Widget_Design_CollapsingToolbar;

    @NonNull
    public final CollapsingTextHelper E0;

    @NonNull
    public final ElevationOverlayProvider F0;
    public boolean G0;
    public boolean H0;

    @Nullable
    public Drawable I0;

    @Nullable
    public Drawable J0;
    public int K0;
    public boolean L0;
    public ValueAnimator M0;
    public long N0;
    public final TimeInterpolator O0;
    public final TimeInterpolator P0;
    public int Q0;
    public b R0;
    public int S0;
    public int T0;

    @Nullable
    public WindowInsetsCompat U0;
    public int V0;
    public boolean W0;
    public int X0;
    public boolean Y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f43931p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f43932q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public ViewGroup f43933r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public View f43934s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public View f43935t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f43936u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f43937w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f43938x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Rect f43939y0;

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(collapsingToolbarLayout) ? windowInsetsCompat : null;
            if (!ObjectsCompat.equals(collapsingToolbarLayout.U0, windowInsetsCompat2)) {
                collapsingToolbarLayout.U0 = windowInsetsCompat2;
                collapsingToolbarLayout.requestLayout();
            }
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    public class b implements AppBarLayout.OnOffsetChangedListener {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.S0 = i10;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.U0;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = collapsingToolbarLayout.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                g gVarB = CollapsingToolbarLayout.b(childAt);
                int i12 = layoutParams.f43940a;
                if (i12 == 1) {
                    gVarB.b(MathUtils.clamp(-i10, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f95053b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).bottomMargin));
                } else if (i12 == 2) {
                    gVarB.b(Math.round((-i10) * layoutParams.f43941b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.J0 != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout);
            }
            int height = collapsingToolbarLayout.getHeight();
            int minimumHeight = (height - ViewCompat.getMinimumHeight(collapsingToolbarLayout)) - systemWindowInsetTop;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f6 = minimumHeight;
            float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f6);
            CollapsingTextHelper collapsingTextHelper = collapsingToolbarLayout.E0;
            collapsingTextHelper.setFadeModeStartFraction(fMin);
            collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout.S0 + minimumHeight);
            collapsingTextHelper.setExpansionFraction(Math.abs(i10) / f6);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public static g b(@NonNull View view) {
        int i10 = R.id.view_offset_helper;
        g gVar = (g) view.getTag(i10);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(i10, gVar2);
        return gVar2;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.F0.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation));
    }

    public final void a() {
        View view;
        if (this.f43931p0) {
            ViewGroup viewGroup = null;
            this.f43933r0 = null;
            this.f43934s0 = null;
            int i10 = this.f43932q0;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f43933r0 = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f43934s0 = view;
                }
            }
            if (this.f43933r0 == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f43933r0 = viewGroup;
            }
            c();
            this.f43931p0 = false;
        }
    }

    public final void c() {
        View view;
        if (!this.G0 && (view = this.f43935t0) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f43935t0);
            }
        }
        if (!this.G0 || this.f43933r0 == null) {
            return;
        }
        if (this.f43935t0 == null) {
            this.f43935t0 = new View(getContext());
        }
        if (this.f43935t0.getParent() == null) {
            this.f43933r0.addView(this.f43935t0, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        if (this.I0 == null && this.J0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.S0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f43933r0 == null && (drawable = this.I0) != null && this.K0 > 0) {
            drawable.mutate().setAlpha(this.K0);
            this.I0.draw(canvas);
        }
        if (this.G0 && this.H0) {
            ViewGroup viewGroup = this.f43933r0;
            CollapsingTextHelper collapsingTextHelper = this.E0;
            if (viewGroup == null || this.I0 == null || this.K0 <= 0 || this.T0 != 1 || collapsingTextHelper.getExpansionFraction() >= collapsingTextHelper.getFadeModeThresholdFraction()) {
                collapsingTextHelper.draw(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.I0.getBounds(), Region.Op.DIFFERENCE);
                collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.J0 == null || this.K0 <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.U0;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.J0.setBounds(0, -this.S0, getWidth(), systemWindowInsetTop - this.S0);
            this.J0.mutate().setAlpha(this.K0);
            this.J0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2;
        Drawable drawable = this.I0;
        if (drawable == null || this.K0 <= 0 || ((view2 = this.f43934s0) == null || view2 == this ? view != this.f43933r0 : view != view2)) {
            z10 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.T0 == 1 && view != null && this.G0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.I0.mutate().setAlpha(this.K0);
            this.I0.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J0;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.I0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.E0;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.G0 || (view = this.f43935t0) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z11 = ViewCompat.isAttachedToWindow(view) && this.f43935t0.getVisibility() == 0;
        this.H0 = z11;
        if (z11 || z10) {
            boolean z12 = ViewCompat.getLayoutDirection(this) == 1;
            View view2 = this.f43934s0;
            if (view2 == null) {
                view2 = this.f43933r0;
            }
            int height = ((getHeight() - b(view2).f95053b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f43935t0;
            Rect rect = this.f43939y0;
            DescendantOffsetUtils.getDescendantRect(this, view3, rect);
            ViewGroup viewGroup = this.f43933r0;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            int i14 = rect.left + (z12 ? titleMarginEnd : titleMarginStart);
            int i15 = rect.top + height + titleMarginTop;
            int i16 = rect.right;
            if (!z12) {
                titleMarginStart = titleMarginEnd;
            }
            int i17 = i16 - titleMarginStart;
            int i18 = (rect.bottom + height) - titleMarginBottom;
            CollapsingTextHelper collapsingTextHelper = this.E0;
            collapsingTextHelper.setCollapsedBounds(i14, i15, i17, i18);
            collapsingTextHelper.setExpandedBounds(z12 ? this.f43937w0 : this.f43936u0, rect.top + this.v0, (i12 - i10) - (z12 ? this.f43936u0 : this.f43937w0), (i13 - i11) - this.f43938x0);
            collapsingTextHelper.recalculate(z10);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.f43933r0 != null && this.G0 && TextUtils.isEmpty(this.E0.getText())) {
            ViewGroup viewGroup = this.f43933r0;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    public int getCollapsedTitleGravity() {
        return this.E0.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.E0.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.E0.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.I0;
    }

    public int getExpandedTitleGravity() {
        return this.E0.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f43938x0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f43937w0;
    }

    public int getExpandedTitleMarginStart() {
        return this.f43936u0;
    }

    public int getExpandedTitleMarginTop() {
        return this.v0;
    }

    public float getExpandedTitleTextSize() {
        return this.E0.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.E0.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.E0.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.E0.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.E0.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.E0.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.E0.getMaxLines();
    }

    public int getScrimAlpha() {
        return this.K0;
    }

    public long getScrimAnimationDuration() {
        return this.N0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.Q0;
        if (i10 >= 0) {
            return i10 + this.V0 + this.X0;
        }
        WindowInsetsCompat windowInsetsCompat = this.U0;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.J0;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.G0) {
            return this.E0.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.T0;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.E0.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.E0.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.Y0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.W0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.E0.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.G0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.T0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.R0 == null) {
                this.R0 = new b();
            }
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.R0);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E0.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        b bVar = this.R0;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        WindowInsetsCompat windowInsetsCompat = this.U0;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            g gVarB = b(getChildAt(i15));
            View view = gVarB.f95052a;
            gVarB.f95053b = view.getTop();
            gVarB.f95054c = view.getLeft();
        }
        e(i10, i11, i12, i13, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        WindowInsetsCompat windowInsetsCompat = this.U0;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.W0) && systemWindowInsetTop > 0) {
            this.V0 = systemWindowInsetTop;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        if (this.Y0) {
            CollapsingTextHelper collapsingTextHelper = this.E0;
            if (collapsingTextHelper.getMaxLines() > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int expandedLineCount = collapsingTextHelper.getExpandedLineCount();
                if (expandedLineCount > 1) {
                    this.X0 = (expandedLineCount - 1) * Math.round(collapsingTextHelper.getExpandedTextFullHeight());
                    super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.X0, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f43933r0;
        if (viewGroup != null) {
            View view = this.f43934s0;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.I0;
        if (drawable != null) {
            ViewGroup viewGroup = this.f43933r0;
            if (this.T0 == 1 && viewGroup != null && this.G0) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.E0.setCollapsedTextGravity(i10);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i10) {
        this.E0.setCollapsedTextAppearance(i10);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f6) {
        this.E0.setCollapsedTextSize(f6);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.E0.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.I0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.I0 = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f43933r0;
                if (this.T0 == 1 && viewGroup != null && this.G0) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.I0.setCallback(this);
                this.I0.setAlpha(this.K0);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@DrawableRes int i10) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setExpandedTitleColor(@ColorInt int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.E0.setExpandedTextGravity(i10);
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.f43936u0 = i10;
        this.v0 = i11;
        this.f43937w0 = i12;
        this.f43938x0 = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f43938x0 = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f43937w0 = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f43936u0 = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.v0 = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i10) {
        this.E0.setExpandedTextAppearance(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.E0.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f6) {
        this.E0.setExpandedTextSize(f6);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.E0.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.Y0 = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.W0 = z10;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i10) {
        this.E0.setHyphenationFrequency(i10);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f6) {
        this.E0.setLineSpacingAdd(f6);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f6) {
        this.E0.setLineSpacingMultiplier(f6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.E0.setMaxLines(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.E0.setRtlTextDirectionHeuristicsEnabled(z10);
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.K0) {
            if (this.I0 != null && (viewGroup = this.f43933r0) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.K0 = i10;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j10) {
        this.N0 = j10;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i10) {
        if (this.Q0 != i10) {
            this.Q0 = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        setScrimsShown(z10, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.E0.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.J0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.J0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.J0.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.J0, ViewCompat.getLayoutDirection(this));
                this.J0.setVisible(getVisibility() == 0, false);
                this.J0.setCallback(this);
                this.J0.setAlpha(this.K0);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@DrawableRes int i10) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.E0.setText(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        this.T0 = i10;
        boolean z10 = i10 == 1;
        this.E0.setFadeModeEnabled(z10);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.T0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.I0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.E0.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.G0) {
            this.G0 = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.E0.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.J0;
        if (drawable != null && drawable.isVisible() != z10) {
            this.J0.setVisible(z10, false);
        }
        Drawable drawable2 = this.I0;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.I0.setVisible(z10, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I0 || drawable == this.J0;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.E0.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        if (this.L0 != z10) {
            if (z11) {
                int i10 = z10 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.M0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.M0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i10 > this.K0 ? this.O0 : this.P0);
                    this.M0.addUpdateListener(new c(this));
                } else if (valueAnimator.isRunning()) {
                    this.M0.cancel();
                }
                this.M0.setDuration(this.N0);
                this.M0.setIntValues(this.K0, i10);
                this.M0.start();
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.L0 = z10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        TextUtils.TruncateAt truncateAt;
        int i11 = Z0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f43931p0 = true;
        this.f43939y0 = new Rect();
        this.Q0 = -1;
        this.V0 = 0;
        this.X0 = 0;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.E0 = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.F0 = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.CollapsingToolbarLayout, i10, i11, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f43938x0 = dimensionPixelSize;
        this.f43937w0 = dimensionPixelSize;
        this.v0 = dimensionPixelSize;
        this.f43936u0 = dimensionPixelSize;
        int i12 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f43936u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, 0);
        }
        int i13 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f43937w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
        }
        int i14 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, 0);
        }
        int i15 = R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f43938x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0);
        }
        this.G0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i16 = R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i16, 0));
        }
        int i17 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i17, 0));
        }
        int i18 = R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            int i19 = typedArrayObtainStyledAttributes.getInt(i18, -1);
            if (i19 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i19 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i19 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        int i20 = R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i20));
        }
        int i21 = R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i21));
        }
        this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i22 = R.styleable.CollapsingToolbarLayout_maxLines;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            collapsingTextHelper.setMaxLines(typedArrayObtainStyledAttributes.getInt(i22, 1));
        }
        int i23 = R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(i23, 0)));
        }
        this.N0 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i24 = R.attr.motionEasingStandardInterpolator;
        this.O0 = MotionUtils.resolveThemeInterpolator(context2, i24, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.P0 = MotionUtils.resolveThemeInterpolator(context2, i24, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f43932q0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.W0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.Y0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f43941b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f43940a = 0;
            this.f43941b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f43940a = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.f43940a;
        }

        public float getParallaxMultiplier() {
            return this.f43941b;
        }

        public void setCollapseMode(int i10) {
            this.f43940a = i10;
        }

        public void setParallaxMultiplier(float f6) {
            this.f43941b = f6;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f43940a = 0;
            this.f43941b = 0.5f;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.f43940a = 0;
            this.f43941b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f43940a = 0;
            this.f43941b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f43940a = 0;
            this.f43941b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f43940a = 0;
            this.f43941b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.f43940a = 0;
            this.f43941b = 0.5f;
            this.f43940a = layoutParams.f43940a;
            this.f43941b = layoutParams.f43941b;
        }
    }
}
