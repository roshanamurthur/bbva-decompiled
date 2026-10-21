package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.n1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    public final boolean A1;
    public final boolean B1;
    public final boolean C1;

    @MenuRes
    public int D1;
    public boolean E1;
    public boolean F1;
    public Behavior G1;
    public int H1;
    public int I1;
    public int J1;

    @NonNull
    public final a K1;

    @NonNull
    public final b L1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public Integer f44014o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final MaterialShapeDrawable f44015p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Nullable
    public Animator f44016q1;

    @Nullable
    public Animator r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f44017s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f44018t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f44019u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final int f44020v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @Px
    public int f44021w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f44022x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final boolean f44023y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public boolean f44024z1;
    public static final int M1 = R.style.Widget_MaterialComponents_BottomAppBar;
    public static final int N1 = R.attr.motionDurationLong2;
    public static final int O1 = R.attr.motionEasingEmphasizedInterpolator;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        public final Rect G0;
        public WeakReference<BottomAppBar> H0;
        public int I0;
        public final a J0;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.H0.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = behavior.G0;
                    floatingActionButton.getMeasuredContentRect(rect);
                    int iHeight = rect.height();
                    bottomAppBar.D(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (behavior.I0 == 0) {
                    if (bottomAppBar.f44019u1 == 1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
                    int i18 = bottomAppBar.f44020v1;
                    if (zIsLayoutRtl) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i18;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i18;
                    }
                }
                int i19 = BottomAppBar.M1;
                bottomAppBar.C();
            }
        }

        public Behavior() {
            this.J0 = new a();
            this.G0 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i10) {
            this.H0 = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.M1;
            View viewX = bottomAppBar.x();
            if (viewX != null && !ViewCompat.isLaidOut(viewX)) {
                BottomAppBar.F(bottomAppBar, viewX);
                this.I0 = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewX.getLayoutParams())).bottomMargin;
                if (viewX instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewX;
                    if (bottomAppBar.f44019u1 == 0 && bottomAppBar.f44023y1) {
                        ViewCompat.setElevation(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnHideAnimationListener(bottomAppBar.K1);
                    floatingActionButton.addOnShowAnimationListener(new com.google.android.material.bottomappbar.e(bottomAppBar));
                    floatingActionButton.addTransformationCallback(bottomAppBar.L1);
                }
                viewX.addOnLayoutChangeListener(this.J0);
                bottomAppBar.C();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i10);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.J0 = new a();
            this.G0 = new Rect();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f44026q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f44027r0;

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
            this.f44026q0 = parcel.readInt();
            this.f44027r0 = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f44026q0);
            parcel.writeInt(this.f44027r0 ? 1 : 0);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.E1) {
                return;
            }
            bottomAppBar.A(bottomAppBar.f44017s1, bottomAppBar.F1);
        }
    }

    public class b implements TransformationCallback<FloatingActionButton> {
        public b() {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public final void onScaleChanged(@NonNull View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.f44015p1.setInterpolation((floatingActionButton.getVisibility() == 0 && bottomAppBar.f44019u1 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public final void onTranslationChanged(@NonNull View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f44019u1 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            float horizontalOffset = bottomAppBar.getTopEdgeTreatment().getHorizontalOffset();
            MaterialShapeDrawable materialShapeDrawable = bottomAppBar.f44015p1;
            if (horizontalOffset != translationX) {
                bottomAppBar.getTopEdgeTreatment().f44043t0 = translationX;
                materialShapeDrawable.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (bottomAppBar.getTopEdgeTreatment().f44042s0 != fMax) {
                bottomAppBar.getTopEdgeTreatment().b(fMax);
                materialShapeDrawable.invalidateSelf();
            }
            materialShapeDrawable.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    public class c implements ViewUtils.OnApplyWindowInsetsListener {
        public c() {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
            boolean z10;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.A1) {
                bottomAppBar.H1 = windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean z11 = false;
            if (bottomAppBar.B1) {
                z10 = bottomAppBar.J1 != windowInsetsCompat.getSystemWindowInsetLeft();
                bottomAppBar.J1 = windowInsetsCompat.getSystemWindowInsetLeft();
            } else {
                z10 = false;
            }
            if (bottomAppBar.C1) {
                boolean z12 = bottomAppBar.I1 != windowInsetsCompat.getSystemWindowInsetRight();
                bottomAppBar.I1 = windowInsetsCompat.getSystemWindowInsetRight();
                z11 = z12;
            }
            if (z10 || z11) {
                Animator animator = bottomAppBar.r1;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar.f44016q1;
                if (animator2 != null) {
                    animator2.cancel();
                }
                bottomAppBar.C();
                bottomAppBar.B();
            }
            return windowInsetsCompat;
        }
    }

    public class d extends FloatingActionButton.OnVisibilityChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f44031a;

        public class a extends FloatingActionButton.OnVisibilityChangedListener {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public final void onShown(FloatingActionButton floatingActionButton) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                int i10 = BottomAppBar.M1;
                bottomAppBar.getClass();
            }
        }

        public d(int i10) {
            this.f44031a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
        public final void onHidden(@NonNull FloatingActionButton floatingActionButton) {
            int i10 = BottomAppBar.M1;
            floatingActionButton.setTranslationX(BottomAppBar.this.y(this.f44031a));
            floatingActionButton.show(new a());
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i10 = BottomAppBar.M1;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.getClass();
            bottomAppBar.E1 = false;
            bottomAppBar.r1 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i10 = BottomAppBar.M1;
            BottomAppBar.this.getClass();
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f44035p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f44036q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f44037r0;

        public f(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f44035p0 = actionMenuView;
            this.f44036q0 = i10;
            this.f44037r0 = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f44036q0;
            boolean z10 = this.f44037r0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f44035p0;
            actionMenuView.setTranslationX(bottomAppBar.getActionMenuViewTranslationX(actionMenuView, i10, z10));
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    public static void F(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i10 = bottomAppBar.f44019u1;
        if (i10 == 1) {
            layoutParams.anchorGravity = 49;
        }
        if (i10 == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.H1;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(getContext(), N1, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return y(this.f44017s1);
    }

    private float getFabTranslationY() {
        if (this.f44019u1 == 1) {
            return -getTopEdgeTreatment().f44042s0;
        }
        View viewX = x();
        return viewX != null ? (-((getMeasuredHeight() + getBottomInset()) - viewX.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.J1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.I1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f44015p1.getShapeAppearanceModel().getTopEdge();
    }

    public final void A(int i10, boolean z10) {
        if (!ViewCompat.isLaidOut(this)) {
            this.E1 = false;
            replaceMenu(this.D1);
            return;
        }
        Animator animator = this.r1;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!z()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new com.google.android.material.bottomappbar.d(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.r1 = animatorSet2;
        animatorSet2.addListener(new e());
        this.r1.start();
    }

    public final void B() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.r1 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (z()) {
            E(actionMenuView, this.f44017s1, this.F1, false);
        } else {
            E(actionMenuView, 0, false, false);
        }
    }

    public final void C() {
        getTopEdgeTreatment().f44043t0 = getFabTranslationX();
        this.f44015p1.setInterpolation((this.F1 && z() && this.f44019u1 == 1) ? 1.0f : 0.0f);
        View viewX = x();
        if (viewX != null) {
            viewX.setTranslationY(getFabTranslationY());
            viewX.setTranslationX(getFabTranslationX());
        }
    }

    public final void D(@Px int i10) {
        float f6 = i10;
        if (f6 != getTopEdgeTreatment().getFabDiameter()) {
            getTopEdgeTreatment().setFabDiameter(f6);
            this.f44015p1.invalidateSelf();
        }
    }

    public final void E(@NonNull ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        f fVar = new f(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(fVar);
        } else {
            fVar.run();
        }
    }

    public void addOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    public void createFabDefaultXAnimation(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonW = w();
        if (floatingActionButtonW == null || floatingActionButtonW.isOrWillBeHidden()) {
            return;
        }
        floatingActionButtonW.hide(new d(i10));
    }

    public int getActionMenuViewTranslationX(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f44022x1 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = zIsLayoutRtl ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zIsLayoutRtl ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zIsLayoutRtl ? this.I1 : -this.J1;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zIsLayoutRtl) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f44015p1.getTintList();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f44042s0;
    }

    public int getFabAlignmentMode() {
        return this.f44017s1;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f44021w1;
    }

    public int getFabAnchorMode() {
        return this.f44019u1;
    }

    public int getFabAnimationMode() {
        return this.f44018t1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f44040q0;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f44039p0;
    }

    public boolean getHideOnScroll() {
        return this.f44024z1;
    }

    public int getMenuAlignmentMode() {
        return this.f44022x1;
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f44015p1);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.r1;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f44016q1;
            if (animator2 != null) {
                animator2.cancel();
            }
            C();
            View viewX = x();
            if (viewX != null && ViewCompat.isLaidOut(viewX)) {
                viewX.post(new n1(viewX, 6));
            }
        }
        B();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44017s1 = savedState.f44026q0;
        this.F1 = savedState.f44027r0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44026q0 = this.f44017s1;
        savedState.f44027r0 = this.F1;
        return savedState;
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    public void removeOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void replaceMenu(@MenuRes int i10) {
        if (i10 != 0) {
            this.D1 = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f44015p1, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f6) {
        if (f6 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().b(f6);
            this.f44015p1.invalidateSelf();
            C();
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        MaterialShapeDrawable materialShapeDrawable = this.f44015p1;
        materialShapeDrawable.setElevation(f6);
        getBehavior().setAdditionalHiddenOffsetY(this, materialShapeDrawable.getShadowRadius() - materialShapeDrawable.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, @MenuRes int i11) {
        this.D1 = i11;
        this.E1 = true;
        A(i10, this.F1);
        if (this.f44017s1 != i10 && ViewCompat.isLaidOut(this)) {
            Animator animator = this.f44016q1;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f44018t1 == 1) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(w(), "translationX", y(i10));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                createFabDefaultXAnimation(i10, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), O1, AnimationUtils.LINEAR_INTERPOLATOR));
            this.f44016q1 = animatorSet;
            animatorSet.addListener(new com.google.android.material.bottomappbar.c(this));
            this.f44016q1.start();
        }
        this.f44017s1 = i10;
    }

    public void setFabAlignmentModeEndMargin(@Px int i10) {
        if (this.f44021w1 != i10) {
            this.f44021w1 = i10;
            C();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f44019u1 = i10;
        C();
        View viewX = x();
        if (viewX != null) {
            F(this, viewX);
            viewX.requestLayout();
            this.f44015p1.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f44018t1 = i10;
    }

    public void setFabCornerSize(@Dimension float f6) {
        if (f6 != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f6);
            this.f44015p1.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f6) {
        if (f6 != getFabCradleMargin()) {
            getTopEdgeTreatment().f44040q0 = f6;
            this.f44015p1.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f6) {
        if (f6 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f44039p0 = f6;
            this.f44015p1.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f44024z1 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f44022x1 != i10) {
            this.f44022x1 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                E(actionMenuView, this.f44017s1, z(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f44014o1 != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f44014o1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.f44014o1 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Nullable
    public final FloatingActionButton w() {
        View viewX = x();
        if (viewX instanceof FloatingActionButton) {
            return (FloatingActionButton) viewX;
        }
        return null;
    }

    @Nullable
    public final View x() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final float y(int i10) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewX = x();
        int i11 = zIsLayoutRtl ? this.J1 : this.I1;
        return ((getMeasuredWidth() / 2) - ((this.f44021w1 == -1 || viewX == null) ? this.f44020v1 + i11 : ((viewX.getMeasuredWidth() / 2) + this.f44021w1) + i11)) * (zIsLayoutRtl ? -1 : 1);
    }

    public final boolean z() {
        FloatingActionButton floatingActionButtonW = w();
        return floatingActionButtonW != null && floatingActionButtonW.isOrWillBeShown();
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.G1 == null) {
            this.G1 = new Behavior();
        }
        return this.G1;
    }

    public void performHide(boolean z10) {
        getBehavior().slideDown(this, z10);
    }

    public void performShow(boolean z10) {
        getBehavior().slideUp(this, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = M1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f44015p1 = materialShapeDrawable;
        this.D1 = 0;
        this.E1 = false;
        this.F1 = true;
        this.K1 = new a();
        this.L1 = new b();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BottomAppBar, i10, i11, new int[0]);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.BottomAppBar_backgroundTint);
        int i12 = R.styleable.BottomAppBar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f44017s1 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.f44018t1 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.f44019u1 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnchorMode, 1);
        this.f44023y1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f44022x1 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomAppBar_menuAlignmentMode, 0);
        this.f44024z1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_hideOnScroll, false);
        this.A1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.B1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.C1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f44021w1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_addElevationShadow, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f44020v1 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopEdge(new BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        if (z10) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        setElevation(dimensionPixelSize);
        DrawableCompat.setTintList(materialShapeDrawable, colorStateList);
        ViewCompat.setBackground(this, materialShapeDrawable);
        ViewUtils.doOnApplyWindowInsets(this, attributeSet, i10, i11, new c());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
