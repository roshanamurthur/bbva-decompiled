package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.activity.o;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ne.d;

/* JADX INFO: loaded from: classes10.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    public static final int S0 = R.string.side_sheet_accessibility_pane_title;
    public static final int T0 = R.style.Widget_Material3_SideSheet;
    public boolean E0;
    public float F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;

    @Nullable
    public WeakReference<V> K0;

    @Nullable
    public WeakReference<View> L0;

    @IdRes
    public int M0;

    @Nullable
    public VelocityTracker N0;

    @Nullable
    public MaterialSideContainerBackHelper O0;
    public int P0;

    @NonNull
    public final LinkedHashSet Q0;
    public final a R0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public d f45343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final MaterialShapeDrawable f45344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final ColorStateList f45345r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ShapeAppearanceModel f45346s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f45347t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final float f45348u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f45349w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f45350x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f45351y0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f45352q0;

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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f45352q0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f45352q0 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f45352q0 = sideSheetBehavior.f45349w0;
        }
    }

    public class a extends ViewDragHelper.Callback {
        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return MathUtils.clamp(i10, sideSheetBehavior.f45343p0.g(), sideSheetBehavior.f45343p0.f());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(@NonNull View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.G0 + sideSheetBehavior.J0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.v0) {
                    sideSheetBehavior.a(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            View coplanarSiblingView = sideSheetBehavior.getCoplanarSiblingView();
            if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                sideSheetBehavior.f45343p0.p(marginLayoutParams, view.getLeft(), view.getRight());
                coplanarSiblingView.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.Q0;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            float fB = sideSheetBehavior.f45343p0.b(i10);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((ne.c) it.next()).onSlide(view, fB);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(@NonNull View view, float f6, float f10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            int i10 = 3;
            if (!sideSheetBehavior.f45343p0.k(f6)) {
                if (sideSheetBehavior.f45343p0.n(f6, view)) {
                    if (sideSheetBehavior.f45343p0.m(f6, f10) || sideSheetBehavior.f45343p0.l(view)) {
                        i10 = 5;
                    }
                } else if (f6 == 0.0f || Math.abs(f6) <= Math.abs(f10)) {
                    int left = view.getLeft();
                    if (Math.abs(left - sideSheetBehavior.getExpandedOffset()) >= Math.abs(left - sideSheetBehavior.f45343p0.e())) {
                        i10 = 5;
                    }
                } else {
                    i10 = 5;
                }
            }
            sideSheetBehavior.c(view, i10, sideSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f45349w0 == 1 || (weakReference = sideSheetBehavior.K0) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.a(5);
            WeakReference<V> weakReference = sideSheetBehavior.K0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.K0.get().requestLayout();
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f45357c = new o(this, 2);

        public c() {
        }

        public final void a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.K0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f45355a = i10;
            if (this.f45356b) {
                return;
            }
            ViewCompat.postOnAnimation(sideSheetBehavior.K0.get(), this.f45357c);
            this.f45356b = true;
        }
    }

    public SideSheetBehavior() {
        this.f45347t0 = new c();
        this.v0 = true;
        this.f45349w0 = 5;
        this.f45350x0 = 5;
        this.F0 = 0.1f;
        this.M0 = -1;
        this.Q0 = new LinkedHashSet();
        this.R0 = new a();
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    public final void a(int i10) {
        V v3;
        if (this.f45349w0 == i10) {
            return;
        }
        this.f45349w0 = i10;
        if (i10 == 3 || i10 == 5) {
            this.f45350x0 = i10;
        }
        WeakReference<V> weakReference = this.K0;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        int i11 = this.f45349w0 == 5 ? 4 : 0;
        if (v3.getVisibility() != i11) {
            v3.setVisibility(i11);
        }
        Iterator it = this.Q0.iterator();
        while (it.hasNext()) {
            ((ne.c) it.next()).onStateChanged(v3, i10);
        }
        d();
    }

    public final boolean b() {
        return this.f45351y0 != null && (this.v0 || this.f45349w0 == 1);
    }

    public final void c(View view, int i10, boolean z10) {
        int expandedOffset;
        if (i10 == 3) {
            expandedOffset = getExpandedOffset();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException(g0.c("Invalid state to get outer edge offset: ", i10));
            }
            expandedOffset = this.f45343p0.e();
        }
        ViewDragHelper viewDragHelper = this.f45351y0;
        if (viewDragHelper == null || (!z10 ? viewDragHelper.smoothSlideViewTo(view, expandedOffset, view.getTop()) : viewDragHelper.settleCapturedViewAt(expandedOffset, view.getTop()))) {
            a(i10);
        } else {
            a(2);
            this.f45347t0.a(i10);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public final void d() {
        V v3;
        WeakReference<V> weakReference = this.K0;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v3, 262144);
        ViewCompat.removeAccessibilityAction(v3, 1048576);
        final int i10 = 5;
        if (this.f45349w0 != 5) {
            ViewCompat.replaceAccessibilityAction(v3, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: ne.h
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    int i11 = SideSheetBehavior.S0;
                    this.f84513p0.setState(i10);
                    return true;
                }
            });
        }
        final int i11 = 3;
        if (this.f45349w0 != 3) {
            ViewCompat.replaceAccessibilityAction(v3, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new AccessibilityViewCommand() { // from class: ne.h
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    int i12 = SideSheetBehavior.S0;
                    this.f84513p0.setState(i11);
                    return true;
                }
            });
        }
    }

    public void expand() {
        setState(3);
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.L0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.f45343p0.d();
    }

    public float getHideFriction() {
        return this.F0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f45350x0;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.f45349w0;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        int i10 = 5;
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
            return;
        }
        MaterialSideContainerBackHelper materialSideContainerBackHelper2 = this.O0;
        d dVar = this.f45343p0;
        if (dVar != null && dVar.j() != 0) {
            i10 = 3;
        }
        b bVar = new b();
        final View coplanarSiblingView = getCoplanarSiblingView();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
            final int iC = this.f45343p0.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ne.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f84507a.f45343p0.o(marginLayoutParams, AnimationUtils.lerp(iC, 0, valueAnimator.getAnimatedFraction()));
                    coplanarSiblingView.requestLayout();
                }
            };
        }
        materialSideContainerBackHelper2.finishBackProgress(backEventCompatOnHandleBackInvoked, i10, bVar, animatorUpdateListener);
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.v0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.K0 = null;
        this.f45351y0 = null;
        this.O0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.K0 = null;
        this.f45351y0 = null;
        this.O0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((!v3.isShown() && ViewCompat.getAccessibilityPaneTitle(v3) == null) || !this.v0) {
            this.E0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.N0) != null) {
            velocityTracker.recycle();
            this.N0 = null;
        }
        if (this.N0 == null) {
            this.N0 = VelocityTracker.obtain();
        }
        this.N0.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.P0 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.E0) {
            this.E0 = false;
            return false;
        }
        return (this.E0 || (viewDragHelper = this.f45351y0) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        V v6;
        V v10;
        int i11;
        View viewFindViewById;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int iH = 0;
        if (this.K0 == null) {
            this.K0 = new WeakReference<>(v3);
            this.O0 = new MaterialSideContainerBackHelper(v3);
            MaterialShapeDrawable materialShapeDrawable = this.f45344q0;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v3, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f45344q0;
                float elevation = this.f45348u0;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(v3);
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.f45345r0;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v3, colorStateList);
                }
            }
            int i12 = this.f45349w0 == 5 ? 4 : 0;
            if (v3.getVisibility() != i12) {
                v3.setVisibility(i12);
            }
            d();
            if (ViewCompat.getImportantForAccessibility(v3) == 0) {
                ViewCompat.setImportantForAccessibility(v3, 1);
            }
            if (ViewCompat.getAccessibilityPaneTitle(v3) == null) {
                ViewCompat.setAccessibilityPaneTitle(v3, v3.getResources().getString(S0));
            }
        }
        int i13 = GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v3.getLayoutParams()).gravity, i10) == 3 ? 1 : 0;
        d dVar = this.f45343p0;
        if (dVar == null || dVar.j() != i13) {
            ShapeAppearanceModel shapeAppearanceModel = this.f45346s0;
            CoordinatorLayout.LayoutParams layoutParams = null;
            if (i13 == 0) {
                this.f45343p0 = new ne.b(this);
                if (shapeAppearanceModel != null) {
                    WeakReference<V> weakReference = this.K0;
                    if (weakReference != null && (v10 = weakReference.get()) != null && (v10.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) v10.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        ShapeAppearanceModel.Builder builder = shapeAppearanceModel.toBuilder();
                        builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                        ShapeAppearanceModel shapeAppearanceModelBuild = builder.build();
                        MaterialShapeDrawable materialShapeDrawable3 = this.f45344q0;
                        if (materialShapeDrawable3 != null) {
                            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModelBuild);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Invalid sheet edge position value: ", i13, ". Must be 0 or 1."));
                }
                this.f45343p0 = new ne.a(this);
                if (shapeAppearanceModel != null) {
                    WeakReference<V> weakReference2 = this.K0;
                    if (weakReference2 != null && (v6 = weakReference2.get()) != null && (v6.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) v6.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        ShapeAppearanceModel.Builder builder2 = shapeAppearanceModel.toBuilder();
                        builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                        ShapeAppearanceModel shapeAppearanceModelBuild2 = builder2.build();
                        MaterialShapeDrawable materialShapeDrawable4 = this.f45344q0;
                        if (materialShapeDrawable4 != null) {
                            materialShapeDrawable4.setShapeAppearanceModel(shapeAppearanceModelBuild2);
                        }
                    }
                }
            }
        }
        if (this.f45351y0 == null) {
            this.f45351y0 = ViewDragHelper.create(coordinatorLayout, this.R0);
        }
        int iH2 = this.f45343p0.h(v3);
        coordinatorLayout.onLayoutChild(v3, i10);
        this.H0 = coordinatorLayout.getWidth();
        this.I0 = this.f45343p0.i(coordinatorLayout);
        this.G0 = v3.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        this.J0 = marginLayoutParams != null ? this.f45343p0.a(marginLayoutParams) : 0;
        int i14 = this.f45349w0;
        if (i14 == 1 || i14 == 2) {
            iH = iH2 - this.f45343p0.h(v3);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f45349w0);
            }
            iH = this.f45343p0.e();
        }
        ViewCompat.offsetLeftAndRight(v3, iH);
        if (this.L0 == null && (i11 = this.M0) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.L0 = new WeakReference<>(viewFindViewById);
        }
        for (ne.c cVar : this.Q0) {
            if (cVar instanceof SideSheetCallback) {
                ((SideSheetCallback) cVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        v3.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        }
        int i10 = savedState.f45352q0;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f45349w0 = i10;
        this.f45350x0 = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v3), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f45349w0 == 1 && actionMasked == 0) {
            return true;
        }
        if (b()) {
            this.f45351y0.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.N0) != null) {
            velocityTracker.recycle();
            this.N0 = null;
        }
        if (this.N0 == null) {
            this.N0 = VelocityTracker.obtain();
        }
        this.N0.addMovement(motionEvent);
        if (b() && actionMasked == 2 && !this.E0 && b() && Math.abs(this.P0 - motionEvent.getX()) > this.f45351y0.getTouchSlop()) {
            this.f45351y0.captureChildView(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.E0;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.M0 = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.L0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.L0 = null;
            return;
        }
        this.L0 = new WeakReference<>(view);
        WeakReference<V> weakReference2 = this.K0;
        if (weakReference2 != null) {
            V v3 = weakReference2.get();
            if (ViewCompat.isLaidOut(v3)) {
                v3.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i10) {
        this.M0 = i10;
        WeakReference<View> weakReference = this.L0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.L0 = null;
        WeakReference<V> weakReference2 = this.K0;
        if (weakReference2 != null) {
            V v3 = weakReference2.get();
            if (i10 == -1 || !ViewCompat.isLaidOut(v3)) {
                return;
            }
            v3.requestLayout();
        }
    }

    public void setDraggable(boolean z10) {
        this.v0 = z10;
    }

    public void setHideFriction(float f6) {
        this.F0 = f6;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(ad.d.f(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null) {
            a(i10);
            return;
        }
        V v3 = this.K0.get();
        Runnable runnable = new Runnable() { // from class: ne.g
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = this.f84511p0;
                View view = (View) sideSheetBehavior.K0.get();
                if (view != null) {
                    sideSheetBehavior.c(view, i10, false);
                }
            }
        };
        ViewParent parent = v3.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v3)) {
            v3.post(runnable);
        } else {
            runnable.run();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.O0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        d dVar = this.f45343p0;
        int i10 = 5;
        if (dVar != null && dVar.j() != 0) {
            i10 = 3;
        }
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, i10);
        WeakReference<V> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v3 = this.K0.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.f45343p0.o(marginLayoutParams, (int) ((v3.getScaleX() * this.G0) + this.J0));
        coplanarSiblingView.requestLayout();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.Q0.add(sideSheetCallback);
    }

    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.Q0.remove(sideSheetCallback);
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45347t0 = new c();
        this.v0 = true;
        this.f45349w0 = 5;
        this.f45350x0 = 5;
        this.F0 = 0.1f;
        this.M0 = -1;
        this.Q0 = new LinkedHashSet();
        this.R0 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i10 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f45345r0 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f45346s0 = ShapeAppearanceModel.builder(context, attributeSet, 0, T0).build();
        }
        int i11 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        ShapeAppearanceModel shapeAppearanceModel = this.f45346s0;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.f45344q0 = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.f45345r0;
            if (colorStateList != null) {
                this.f45344q0.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f45344q0.setTint(typedValue.data);
            }
        }
        this.f45348u0 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
