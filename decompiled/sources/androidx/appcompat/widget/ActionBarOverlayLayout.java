package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {
    public static final int[] W0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final WindowInsetsCompat X0 = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.of(0, 1, 0, 1)).build();
    public static final Rect Y0 = new Rect();
    public int E0;
    public int F0;
    public final Rect G0;
    public final Rect H0;
    public final Rect I0;
    public final Rect J0;

    @NonNull
    public WindowInsetsCompat K0;

    @NonNull
    public WindowInsetsCompat L0;

    @NonNull
    public WindowInsetsCompat M0;

    @NonNull
    public WindowInsetsCompat N0;
    public ActionBarVisibilityCallback O0;
    public OverScroller P0;
    public ViewPropertyAnimator Q0;
    public final a R0;
    public final b S0;
    public final c T0;
    public final NestedScrollingParentHelper U0;
    public final d V0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f1062p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1063q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ContentFrameLayout f1064r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ActionBarContainer f1065s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DecorToolbar f1066t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f1067u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1068w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1069x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1070y0;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z10);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i10);

        void showForSystem();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q0 = null;
            actionBarOverlayLayout.f1070y0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q0 = null;
            actionBarOverlayLayout.f1070y0 = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.b();
            actionBarOverlayLayout.Q0 = actionBarOverlayLayout.f1065s0.animate().translationY(0.0f).setListener(actionBarOverlayLayout.R0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.b();
            actionBarOverlayLayout.Q0 = actionBarOverlayLayout.f1065s0.animate().translationY(-actionBarOverlayLayout.f1065s0.getHeight()).setListener(actionBarOverlayLayout.R0);
        }
    }

    public static final class d extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean a(@NonNull FrameLayout frameLayout, @NonNull Rect rect, boolean z10) {
        boolean z11;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.S0);
        removeCallbacks(this.T0);
        ViewPropertyAnimator viewPropertyAnimator = this.Q0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(W0);
        this.f1062p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1067u0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.P0 = new OverScroller(context);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
        d();
        return this.f1066t0.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        DecorToolbar wrapper;
        if (this.f1064r0 == null) {
            this.f1064r0 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1065s0 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1066t0 = wrapper;
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
        d();
        this.f1066t0.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1067u0 != null) {
            if (this.f1065s0.getVisibility() == 0) {
                translationY = (int) (this.f1065s0.getTranslationY() + this.f1065s0.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1067u0.setBounds(0, translationY, getWidth(), this.f1067u0.getIntrinsicHeight() + translationY);
            this.f1067u0.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1065s0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.U0.getNestedScrollAxes();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        d();
        return this.f1066t0.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
        d();
        return this.f1066t0.hasIcon();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
        d();
        return this.f1066t0.hasLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        d();
        return this.f1066t0.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int i10) {
        d();
        if (i10 == 2) {
            this.f1066t0.initProgress();
        } else if (i10 == 5) {
            this.f1066t0.initIndeterminateProgress();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.f1069x0;
    }

    public boolean isInOverlayMode() {
        return this.v0;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        d();
        return this.f1066t0.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        d();
        return this.f1066t0.isOverflowMenuShowing();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        d();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean zA = a(this.f1065s0, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), false);
        Rect rect = this.G0;
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat, rect);
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.K0 = windowInsetsCompatInset;
        if (!this.L0.equals(windowInsetsCompatInset)) {
            this.L0 = this.K0;
            zA = true;
        }
        Rect rect2 = this.H0;
        if (rect2.equals(rect)) {
            if (zA) {
            }
            return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
        }
        rect2.set(rect);
        requestLayout();
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        d();
        measureChildWithMargins(this.f1065s0, i10, 0, i11, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1065s0.getLayoutParams();
        int iMax = Math.max(0, this.f1065s0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f1065s0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1065s0.getMeasuredState());
        boolean z10 = (ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1062p0;
            if (this.f1068w0 && this.f1065s0.getTabContainer() != null) {
                measuredHeight += this.f1062p0;
            }
        } else {
            measuredHeight = this.f1065s0.getVisibility() != 8 ? this.f1065s0.getMeasuredHeight() : 0;
        }
        Rect rect = this.G0;
        Rect rect2 = this.I0;
        rect2.set(rect);
        this.M0 = this.K0;
        if (this.v0 || z10) {
            this.M0 = new WindowInsetsCompat.Builder(this.M0).setSystemWindowInsets(Insets.of(this.M0.getSystemWindowInsetLeft(), this.M0.getSystemWindowInsetTop() + measuredHeight, this.M0.getSystemWindowInsetRight(), this.M0.getSystemWindowInsetBottom())).build();
        } else {
            d dVar = this.V0;
            WindowInsetsCompat windowInsetsCompat = X0;
            Rect rect3 = this.J0;
            ViewCompat.computeSystemWindowInsets(dVar, windowInsetsCompat, rect3);
            if (!rect3.equals(Y0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.M0 = this.M0.inset(0, measuredHeight, 0, 0);
            } else {
                this.M0 = new WindowInsetsCompat.Builder(this.M0).setSystemWindowInsets(Insets.of(this.M0.getSystemWindowInsetLeft(), this.M0.getSystemWindowInsetTop() + measuredHeight, this.M0.getSystemWindowInsetRight(), this.M0.getSystemWindowInsetBottom())).build();
            }
        }
        a(this.f1064r0, rect2, true);
        if (!this.N0.equals(this.M0)) {
            WindowInsetsCompat windowInsetsCompat2 = this.M0;
            this.N0 = windowInsetsCompat2;
            ViewCompat.dispatchApplyWindowInsets(this.f1064r0, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f1064r0, i10, 0, i11, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1064r0.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1064r0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1064r0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1064r0.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        if (!this.f1069x0 || !z10) {
            return false;
        }
        this.P0.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.P0.getFinalY() > this.f1065s0.getHeight()) {
            b();
            this.T0.run();
        } else {
            b();
            this.S0.run();
        }
        this.f1070y0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f6, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        d();
        int i11 = this.F0 ^ i10;
        this.F0 = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.O0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z11);
            if (z10 || !z11) {
                this.O0.showForSystem();
            } else {
                this.O0.hideForSystem();
            }
        }
        if ((i11 & 256) == 0 || this.O0 == null) {
            return;
        }
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1063q0 = i10;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.O0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i10);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        d();
        this.f1066t0.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        d();
        this.f1066t0.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.f1065s0.setTranslationY(-Math.max(0, Math.min(i10, this.f1065s0.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.O0 = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.O0.onWindowVisibilityChanged(this.f1063q0);
            int i10 = this.F0;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1068w0 = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1069x0) {
            this.f1069x0 = z10;
            if (z10) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int i10) {
        d();
        this.f1066t0.setIcon(i10);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int i10) {
        d();
        this.f1066t0.setLogo(i10);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        d();
        this.f1066t0.setMenu(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        d();
        this.f1066t0.setMenuPrepared();
    }

    public void setOverlayMode(boolean z10) {
        this.v0 = z10;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        d();
        this.f1066t0.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        d();
        this.f1066t0.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
        d();
        return this.f1066t0.showOverflowMenu();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1063q0 = 0;
        this.G0 = new Rect();
        this.H0 = new Rect();
        this.I0 = new Rect();
        this.J0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.K0 = windowInsetsCompat;
        this.L0 = windowInsetsCompat;
        this.M0 = windowInsetsCompat;
        this.N0 = windowInsetsCompat;
        this.R0 = new a();
        this.S0 = new b();
        this.T0 = new c();
        c(context);
        this.U0 = new NestedScrollingParentHelper(this);
        d dVar = new d(context);
        dVar.setWillNotDraw(true);
        this.V0 = dVar;
        addView(dVar);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.U0.onNestedScrollAccepted(view, view2, i10);
        this.E0 = getActionBarHideOffset();
        b();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.O0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1065s0.getVisibility() != 0) {
            return false;
        }
        return this.f1069x0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f1069x0 && !this.f1070y0) {
            if (this.E0 <= this.f1065s0.getHeight()) {
                b();
                postDelayed(this.S0, 600L);
            } else {
                b();
                postDelayed(this.T0, 600L);
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.O0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.E0 + i11;
        this.E0 = i14;
        setActionBarHideOffset(i14);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable) {
        d();
        this.f1066t0.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int i10) {
    }
}
