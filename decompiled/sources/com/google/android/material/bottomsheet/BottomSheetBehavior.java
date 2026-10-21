package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.g0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import de.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    public static final int C1 = R.style.Widget_Design_BottomSheet_Modal;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    @VisibleForTesting
    public final SparseIntArray A1;
    public final c B1;

    @Nullable
    public final ColorStateList E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public final ShapeAppearanceModel T0;
    public boolean U0;
    public final BottomSheetBehavior<V>.d V0;

    @Nullable
    public ValueAnimator W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public float f44058a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f44059b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final float f44060c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f44061d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f44062e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f44063f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f44064g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f44065h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f44066i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f44067j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f44068k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f44069l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public float f44070m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f44071n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f44072o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f44073p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f44074p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f44075q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f44076q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f44077r0;

    @Nullable
    public WeakReference<View> r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f44078s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f44079s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f44080t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @NonNull
    public final ArrayList<BottomSheetCallback> f44081t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f44082u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @Nullable
    public VelocityTracker f44083u1;
    public boolean v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @Nullable
    public MaterialBottomContainerBackHelper f44084v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f44085w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f44086w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f44087x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f44088x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final MaterialShapeDrawable f44089y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f44090y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @Nullable
    public HashMap f44091z1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f44092q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f44093r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f44094s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f44095t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f44096u0;

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
            parcel.writeInt(this.f44092q0);
            parcel.writeInt(this.f44093r0);
            parcel.writeInt(this.f44094s0 ? 1 : 0);
            parcel.writeInt(this.f44095t0 ? 1 : 0);
            parcel.writeInt(this.f44096u0 ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44092q0 = parcel.readInt();
            this.f44093r0 = parcel.readInt();
            this.f44094s0 = parcel.readInt() == 1;
            this.f44095t0 = parcel.readInt() == 1;
            this.f44096u0 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f44092q0 = bottomSheetBehavior.f44064g1;
            this.f44093r0 = bottomSheetBehavior.f44082u0;
            this.f44094s0 = bottomSheetBehavior.f44075q0;
            this.f44095t0 = bottomSheetBehavior.f44061d1;
            this.f44096u0 = bottomSheetBehavior.f44062e1;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f44092q0 = i10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f44097p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f44098q0;

        public a(View view, int i10) {
            this.f44097p0 = view;
            this.f44098q0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BottomSheetBehavior.STATE_DRAGGING;
            BottomSheetBehavior.this.n(this.f44097p0, this.f44098q0, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.l(5);
            WeakReference<V> weakReference = bottomSheetBehavior.f44076q1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.f44076q1.get().requestLayout();
        }
    }

    public class c extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f44101c;

        public c() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return MathUtils.clamp(i10, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(@NonNull View view) {
            int i10 = BottomSheetBehavior.STATE_DRAGGING;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return (bottomSheetBehavior.isHideable() && bottomSheetBehavior.isHideableWhenDragging()) ? bottomSheetBehavior.f44074p1 : bottomSheetBehavior.f44059b1;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f44063f1) {
                    bottomSheetBehavior.l(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.f(i11);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0063  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(@NonNull View view, float f6, float f10) {
            int i10 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f10 < 0.0f) {
                if (bottomSheetBehavior.f44075q0) {
                    i10 = 3;
                } else {
                    int top = view.getTop();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f44101c;
                    if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                        if (!bottomSheetBehavior.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top * 100.0f) / bottomSheetBehavior.f44074p1)) {
                            i10 = 4;
                        }
                    } else if (top <= bottomSheetBehavior.Z0) {
                    }
                    i10 = 3;
                }
            } else if (bottomSheetBehavior.f44061d1 && bottomSheetBehavior.m(f10, view)) {
                if (Math.abs(f6) >= Math.abs(f10) || f10 <= bottomSheetBehavior.f44080t0) {
                    if (view.getTop() > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.f44074p1) / 2) {
                        i10 = 5;
                    } else if (bottomSheetBehavior.f44075q0 || Math.abs(view.getTop() - bottomSheetBehavior.getExpandedOffset()) < Math.abs(view.getTop() - bottomSheetBehavior.Z0)) {
                        i10 = 3;
                    }
                } else {
                    i10 = 5;
                }
            } else if (f10 == 0.0f || Math.abs(f6) > Math.abs(f10)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.f44075q0) {
                    int i11 = bottomSheetBehavior.Z0;
                    if (top2 < i11) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.f44059b1)) {
                            i10 = 3;
                        } else if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top2 - i11) >= Math.abs(top2 - bottomSheetBehavior.f44059b1) || bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                        i10 = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.Y0) < Math.abs(top2 - bottomSheetBehavior.f44059b1)) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (bottomSheetBehavior.f44075q0) {
                i10 = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.Z0) >= Math.abs(top3 - bottomSheetBehavior.f44059b1) || bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    i10 = 4;
                }
            }
            bottomSheetBehavior.n(view, i10, bottomSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f44064g1;
            if (i11 == 1 || bottomSheetBehavior.f44090y1) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f44086w1 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f44079s1;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f44101c = System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f44076q1;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f44105c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                dVar.f44104b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f44066i1;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    dVar.a(dVar.f44103a);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f44064g1 == 2) {
                    bottomSheetBehavior.l(dVar.f44103a);
                }
            }
        }

        public d() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f44076q1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f44103a = i10;
            if (this.f44104b) {
                return;
            }
            ViewCompat.postOnAnimation(bottomSheetBehavior.f44076q1.get(), this.f44105c);
            this.f44104b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f44073p0 = 0;
        this.f44075q0 = true;
        this.f44077r0 = false;
        this.F0 = -1;
        this.G0 = -1;
        this.V0 = new d();
        this.f44058a1 = 0.5f;
        this.f44060c1 = -1.0f;
        this.f44063f1 = true;
        this.f44064g1 = 4;
        this.f44065h1 = 4;
        this.f44070m1 = 0.1f;
        this.f44081t1 = new ArrayList<>();
        this.f44088x1 = -1;
        this.A1 = new SparseIntArray();
        this.B1 = new c();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Nullable
    @VisibleForTesting
    public static View g(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewG = g(viewGroup.getChildAt(i10));
                if (viewG != null) {
                    return viewG;
                }
            }
        }
        return null;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final void a() {
        int iC = c();
        if (this.f44075q0) {
            this.f44059b1 = Math.max(this.f44074p1 - iC, this.Y0);
        } else {
            this.f44059b1 = this.f44074p1 - iC;
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        ArrayList<BottomSheetCallback> arrayList = this.f44081t1;
        if (arrayList.contains(bottomSheetCallback)) {
            return;
        }
        arrayList.add(bottomSheetCallback);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final float b() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f6;
        float f10 = 0.0f;
        if (this.f44089y0 != null && (weakReference = this.f44076q1) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v3 = this.f44076q1.get();
            if (j() && (rootWindowInsets = v3.getRootWindowInsets()) != null) {
                float topLeftCornerResolvedSize = this.f44089y0.getTopLeftCornerResolvedSize();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || topLeftCornerResolvedSize <= 0.0f) {
                        f6 = 0.0f;
                    } else {
                        f6 = radius / topLeftCornerResolvedSize;
                    }
                } else {
                    f6 = 0.0f;
                }
                float topRightCornerResolvedSize = this.f44089y0.getTopRightCornerResolvedSize();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && topRightCornerResolvedSize > 0.0f) {
                        f10 = radius2 / topRightCornerResolvedSize;
                    }
                }
                return Math.max(f6, f10);
            }
        }
        return 0.0f;
    }

    public final int c() {
        int i10;
        if (this.v0) {
            return Math.min(Math.max(this.f44085w0, this.f44074p1 - ((this.f44072o1 * 9) / 16)), this.f44071n1) + this.Q0;
        }
        return (this.I0 || this.J0 || (i10 = this.H0) <= 0) ? this.f44082u0 + this.Q0 : Math.max(this.f44082u0, i10 + this.f44087x0);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return d(this.f44076q1.get().getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f44084v1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public final float d(int i10) {
        float f6;
        float expandedOffset;
        int i11 = this.f44059b1;
        if (i10 > i11 || i11 == getExpandedOffset()) {
            int i12 = this.f44059b1;
            f6 = i12 - i10;
            expandedOffset = this.f44074p1 - i12;
        } else {
            int i13 = this.f44059b1;
            f6 = i13 - i10;
            expandedOffset = i13 - getExpandedOffset();
        }
        return f6 / expandedOffset;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.W0 = null;
    }

    public final void e(int i10, View view) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        SparseIntArray sparseIntArray = this.A1;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 != -1) {
            ViewCompat.removeAccessibilityAction(view, i11);
            sparseIntArray.delete(i10);
        }
    }

    public final void f(int i10) {
        V v3 = this.f44076q1.get();
        if (v3 != null) {
            ArrayList<BottomSheetCallback> arrayList = this.f44081t1;
            if (arrayList.isEmpty()) {
                return;
            }
            float fD = d(i10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).onSlide(v3, fD);
            }
        }
    }

    public int getExpandedOffset() {
        if (this.f44075q0) {
            return this.Y0;
        }
        return Math.max(this.X0, this.M0 ? 0 : this.R0);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.f44058a1;
    }

    public float getHideFriction() {
        return this.f44070m1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f44065h1;
    }

    @Px
    public int getMaxHeight() {
        return this.G0;
    }

    @Px
    public int getMaxWidth() {
        return this.F0;
    }

    public int getPeekHeight() {
        if (this.v0) {
            return -1;
        }
        return this.f44082u0;
    }

    public int getSaveFlags() {
        return this.f44073p0;
    }

    public int getSignificantVelocityThreshold() {
        return this.f44080t0;
    }

    public boolean getSkipCollapsed() {
        return this.f44062e1;
    }

    public int getState() {
        return this.f44064g1;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f44084v1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.f44061d1 ? 5 : 4);
        } else if (this.f44061d1) {
            this.f44084v1.finishBackProgressNotPersistent(backEventCompatOnHandleBackInvoked, new b());
        } else {
            this.f44084v1.finishBackProgressPersistent(backEventCompatOnHandleBackInvoked, null);
            setState(4);
        }
    }

    public final int i(int i10) {
        if (i10 == 3) {
            return getExpandedOffset();
        }
        if (i10 == 4) {
            return this.f44059b1;
        }
        if (i10 == 5) {
            return this.f44074p1;
        }
        if (i10 == 6) {
            return this.Z0;
        }
        throw new IllegalArgumentException(g0.c("Invalid state to get top offset: ", i10));
    }

    public boolean isDraggable() {
        return this.f44063f1;
    }

    public boolean isFitToContents() {
        return this.f44075q0;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.I0;
    }

    public boolean isHideable() {
        return this.f44061d1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.S0;
    }

    public final boolean j() {
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f44076q1.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void k(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.r1) == null) {
            this.r1 = new WeakReference<>(view);
            o(1, view);
        } else {
            e(1, weakReference.get());
            this.r1 = null;
        }
    }

    public final void l(int i10) {
        V v3;
        if (this.f44064g1 == i10) {
            return;
        }
        this.f44064g1 = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f44061d1 && i10 == 5)) {
            this.f44065h1 = i10;
        }
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            r(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            r(false);
        }
        q(i10, true);
        while (true) {
            ArrayList<BottomSheetCallback> arrayList = this.f44081t1;
            if (i11 >= arrayList.size()) {
                p();
                return;
            } else {
                arrayList.get(i11).onStateChanged(v3, i10);
                i11++;
            }
        }
    }

    public final boolean m(float f6, @NonNull View view) {
        if (this.f44062e1) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.f44059b1) {
            return false;
        }
        return Math.abs(((f6 * this.f44070m1) + ((float) view.getTop())) - ((float) this.f44059b1)) / ((float) c()) > 0.5f;
    }

    public final void n(View view, int i10, boolean z10) {
        int i11 = i(i10);
        ViewDragHelper viewDragHelper = this.f44066i1;
        if (viewDragHelper == null || (!z10 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i11) : viewDragHelper.settleCapturedViewAt(view.getLeft(), i11))) {
            l(i10);
            return;
        }
        l(2);
        q(i10, true);
        this.V0.a(i10);
    }

    public final void o(int i10, View view) {
        if (view == null) {
            return;
        }
        e(i10, view);
        if (!this.f44075q0 && this.f44064g1 != 6) {
            this.A1.put(i10, ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new de.c(this, 6)));
        }
        if (this.f44061d1 && isHideableWhenDragging() && this.f44064g1 != 5) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new de.c(this, 5));
        }
        int i11 = this.f44064g1;
        if (i11 == 3) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new de.c(this, this.f44075q0 ? 4 : 6));
            return;
        }
        if (i11 == 4) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new de.c(this, this.f44075q0 ? 3 : 6));
        } else {
            if (i11 != 6) {
                return;
            }
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new de.c(this, 4));
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new de.c(this, 3));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f44076q1 = null;
        this.f44066i1 = null;
        this.f44084v1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f44076q1 = null;
        this.f44066i1 = null;
        this.f44084v1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        int i10;
        ViewDragHelper viewDragHelper;
        if (!v3.isShown() || !this.f44063f1) {
            this.f44067j1 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44086w1 = -1;
            this.f44088x1 = -1;
            VelocityTracker velocityTracker = this.f44083u1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44083u1 = null;
            }
        }
        if (this.f44083u1 == null) {
            this.f44083u1 = VelocityTracker.obtain();
        }
        this.f44083u1.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.f44088x1 = (int) motionEvent.getY();
            if (this.f44064g1 != 2) {
                WeakReference<View> weakReference = this.f44079s1;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x4, this.f44088x1)) {
                    this.f44086w1 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f44090y1 = true;
                }
            }
            this.f44067j1 = this.f44086w1 == -1 && !coordinatorLayout.isPointInChildBounds(v3, x4, this.f44088x1);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f44090y1 = false;
            this.f44086w1 = -1;
            if (this.f44067j1) {
                this.f44067j1 = false;
                return false;
            }
        }
        if (!this.f44067j1 && (viewDragHelper = this.f44066i1) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f44079s1;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f44067j1 || this.f44064g1 == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f44066i1 == null || (i10 = this.f44088x1) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f44066i1.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f44076q1 == null) {
            this.f44085w0 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.v0) ? false : true;
            if (this.J0 || this.K0 || this.L0 || this.N0 || this.O0 || this.P0 || z10) {
                ViewUtils.doOnApplyWindowInsets(v3, new de.b(this, z10));
            }
            ViewCompat.setWindowInsetsAnimationCallback(v3, new g(v3));
            this.f44076q1 = new WeakReference<>(v3);
            this.f44084v1 = new MaterialBottomContainerBackHelper(v3);
            MaterialShapeDrawable materialShapeDrawable = this.f44089y0;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v3, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f44089y0;
                float elevation = this.f44060c1;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(v3);
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.E0;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v3, colorStateList);
                }
            }
            p();
            if (ViewCompat.getImportantForAccessibility(v3) == 0) {
                ViewCompat.setImportantForAccessibility(v3, 1);
            }
        }
        if (this.f44066i1 == null) {
            this.f44066i1 = ViewDragHelper.create(coordinatorLayout, this.B1);
        }
        int top = v3.getTop();
        coordinatorLayout.onLayoutChild(v3, i10);
        this.f44072o1 = coordinatorLayout.getWidth();
        this.f44074p1 = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.f44071n1 = height;
        int iMin = this.f44074p1;
        int i12 = iMin - height;
        int i13 = this.R0;
        if (i12 < i13) {
            if (this.M0) {
                int i14 = this.G0;
                if (i14 != -1) {
                    iMin = Math.min(iMin, i14);
                }
                this.f44071n1 = iMin;
            } else {
                int iMin2 = iMin - i13;
                int i15 = this.G0;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.f44071n1 = iMin2;
            }
        }
        this.Y0 = Math.max(0, this.f44074p1 - this.f44071n1);
        this.Z0 = (int) ((1.0f - this.f44058a1) * this.f44074p1);
        a();
        int i16 = this.f44064g1;
        if (i16 == 3) {
            ViewCompat.offsetTopAndBottom(v3, getExpandedOffset());
        } else if (i16 == 6) {
            ViewCompat.offsetTopAndBottom(v3, this.Z0);
        } else if (this.f44061d1 && i16 == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.f44074p1);
        } else if (i16 == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f44059b1);
        } else if (i16 == 1 || i16 == 2) {
            ViewCompat.offsetTopAndBottom(v3, top - v3.getTop());
        }
        q(this.f44064g1, false);
        this.f44079s1 = new WeakReference<>(g(v3));
        while (true) {
            ArrayList<BottomSheetCallback> arrayList = this.f44081t1;
            if (i11 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i11).a(v3);
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        v3.measure(h(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.F0, marginLayoutParams.width), h(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.G0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, float f6, float f10) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.f44079s1) != null && view == weakReference.get()) {
            return this.f44064g1 != 3 || super.onNestedPreFling(coordinatorLayout, v3, view, f6, f10);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f44079s1;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v3.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    ViewCompat.offsetTopAndBottom(v3, -expandedOffset);
                    l(3);
                } else {
                    if (!this.f44063f1) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.offsetTopAndBottom(v3, -i11);
                    l(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f44059b1 && (!isHideable() || !isHideableWhenDragging())) {
                    int i14 = top - this.f44059b1;
                    iArr[1] = i14;
                    ViewCompat.offsetTopAndBottom(v3, -i14);
                    l(4);
                } else {
                    if (!this.f44063f1) {
                        return;
                    }
                    iArr[1] = i11;
                    ViewCompat.offsetTopAndBottom(v3, -i11);
                    l(1);
                }
            }
            f(v3.getTop());
            this.f44068k1 = i11;
            this.f44069l1 = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        int i10 = this.f44073p0;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f44082u0 = savedState.f44093r0;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f44075q0 = savedState.f44094s0;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f44061d1 = savedState.f44095t0;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f44062e1 = savedState.f44096u0;
            }
        }
        int i11 = savedState.f44092q0;
        if (i11 == 1 || i11 == 2) {
            this.f44064g1 = 4;
            this.f44065h1 = 4;
        } else {
            this.f44064g1 = i11;
            this.f44065h1 = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v3), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f44068k1 = 0;
        this.f44069l1 = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        WeakReference<View> weakReference;
        int i12 = 3;
        if (v3.getTop() == getExpandedOffset()) {
            l(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.f44079s1) != null && view == weakReference.get() && this.f44069l1)) {
            if (this.f44068k1 > 0) {
                if (!this.f44075q0 && v3.getTop() > this.Z0) {
                    i12 = 6;
                }
            } else if (this.f44061d1) {
                VelocityTracker velocityTracker = this.f44083u1;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f44078s0);
                    yVelocity = this.f44083u1.getYVelocity(this.f44086w1);
                }
                if (m(yVelocity, v3)) {
                    i12 = 5;
                } else if (this.f44068k1 == 0) {
                    top2 = v3.getTop();
                    if (this.f44075q0) {
                        i11 = this.Z0;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f44059b1)) {
                                if (shouldSkipHalfExpandedStateWhenDragging()) {
                                    i12 = 4;
                                } else {
                                    i12 = 6;
                                }
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f44059b1)) {
                            i12 = 6;
                        } else {
                            i12 = 4;
                        }
                    } else if (Math.abs(top2 - this.Y0) >= Math.abs(top2 - this.f44059b1)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f44075q0) {
                        top = v3.getTop();
                        if (Math.abs(top - this.Z0) < Math.abs(top - this.f44059b1)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f44068k1 == 0) {
                top2 = v3.getTop();
                if (this.f44075q0) {
                    i11 = this.Z0;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f44059b1)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i12 = 4;
                            } else {
                                i12 = 6;
                            }
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f44059b1)) {
                        i12 = 6;
                    } else {
                        i12 = 4;
                    }
                } else if (Math.abs(top2 - this.Y0) >= Math.abs(top2 - this.f44059b1)) {
                    i12 = 4;
                }
            } else {
                if (!this.f44075q0) {
                    top = v3.getTop();
                    if (Math.abs(top - this.Z0) < Math.abs(top - this.f44059b1)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            n(v3, i12, false);
            this.f44069l1 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f44064g1;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f44066i1;
        if (viewDragHelper != null && (this.f44063f1 || i10 == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.f44086w1 = -1;
            this.f44088x1 = -1;
            VelocityTracker velocityTracker = this.f44083u1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44083u1 = null;
            }
        }
        if (this.f44083u1 == null) {
            this.f44083u1 = VelocityTracker.obtain();
        }
        this.f44083u1.addMovement(motionEvent);
        if (this.f44066i1 != null && ((this.f44063f1 || this.f44064g1 == 1) && actionMasked == 2 && !this.f44067j1 && Math.abs(this.f44088x1 - motionEvent.getY()) > this.f44066i1.getTouchSlop())) {
            this.f44066i1.captureChildView(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f44067j1;
    }

    public final void p() {
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference != null) {
            o(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.r1;
        if (weakReference2 != null) {
            o(1, weakReference2.get());
        }
    }

    public final void q(int i10, boolean z10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.f44064g1 == 3 && (this.S0 || j());
        if (this.U0 == z11 || this.f44089y0 == null) {
            return;
        }
        this.U0 = z11;
        if (!z10 || (valueAnimator = this.W0) == null) {
            ValueAnimator valueAnimator2 = this.W0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.W0.cancel();
            }
            this.f44089y0.setInterpolation(this.U0 ? b() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.W0.reverse();
        } else {
            this.W0.setFloatValues(this.f44089y0.getInterpolation(), z11 ? b() : 1.0f);
            this.W0.start();
        }
    }

    public final void r(boolean z10) {
        HashMap map;
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f44091z1 != null) {
                    return;
                } else {
                    this.f44091z1 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f44076q1.get()) {
                    if (z10) {
                        this.f44091z1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f44077r0) {
                            ViewCompat.setImportantForAccessibility(childAt, 4);
                        }
                    } else if (this.f44077r0 && (map = this.f44091z1) != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.f44091z1.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f44091z1 = null;
            } else if (this.f44077r0) {
                this.f44076q1.get().sendAccessibilityEvent(8);
            }
        }
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.f44081t1.remove(bottomSheetCallback);
    }

    public final void s(boolean z10) {
        V v3;
        if (this.f44076q1 != null) {
            a();
            if (this.f44064g1 != 4 || (v3 = this.f44076q1.get()) == null) {
                return;
            }
            if (z10) {
                setState(4);
            } else {
                v3.requestLayout();
            }
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList<BottomSheetCallback> arrayList = this.f44081t1;
        arrayList.clear();
        if (bottomSheetCallback != null) {
            arrayList.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z10) {
        this.f44063f1 = z10;
    }

    public void setExpandedOffset(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.X0 = i10;
        q(this.f44064g1, true);
    }

    public void setFitToContents(boolean z10) {
        if (this.f44075q0 == z10) {
            return;
        }
        this.f44075q0 = z10;
        if (this.f44076q1 != null) {
            a();
        }
        l((this.f44075q0 && this.f44064g1 == 6) ? 3 : this.f44064g1);
        q(this.f44064g1, true);
        p();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.I0 = z10;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f6) {
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f44058a1 = f6;
        if (this.f44076q1 != null) {
            this.Z0 = (int) ((1.0f - f6) * this.f44074p1);
        }
    }

    public void setHideFriction(float f6) {
        this.f44070m1 = f6;
    }

    public void setHideable(boolean z10) {
        if (this.f44061d1 != z10) {
            this.f44061d1 = z10;
            if (!z10 && this.f44064g1 == 5) {
                setState(4);
            }
            p();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z10) {
        this.f44061d1 = z10;
    }

    public void setMaxHeight(@Px int i10) {
        this.G0 = i10;
    }

    public void setMaxWidth(@Px int i10) {
        this.F0 = i10;
    }

    public void setPeekHeight(int i10) {
        setPeekHeight(i10, false);
    }

    public void setSaveFlags(int i10) {
        this.f44073p0 = i10;
    }

    public void setShouldRemoveExpandedCorners(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            q(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i10) {
        this.f44080t0 = i10;
    }

    public void setSkipCollapsed(boolean z10) {
        this.f44062e1 = z10;
    }

    public void setState(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(ad.d.f(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f44061d1 && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f44075q0 && i(i10) <= this.Y0) ? 3 : i10;
        WeakReference<V> weakReference = this.f44076q1;
        if (weakReference == null || weakReference.get() == null) {
            l(i10);
            return;
        }
        V v3 = this.f44076q1.get();
        a aVar = new a(v3, i11);
        ViewParent parent = v3.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v3)) {
            v3.post(aVar);
        } else {
            aVar.run();
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.f44077r0 = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j10, @FloatRange(from = 0.0d, to = 100.0d) float f6) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f44084v1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.f44084v1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    public final void setPeekHeight(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.v0) {
                return;
            } else {
                this.v0 = true;
            }
        } else {
            if (!this.v0 && this.f44082u0 == i10) {
                return;
            }
            this.v0 = false;
            this.f44082u0 = Math.max(0, i10);
        }
        s(z10);
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f44073p0 = 0;
        this.f44075q0 = true;
        this.f44077r0 = false;
        this.F0 = -1;
        this.G0 = -1;
        this.V0 = new d();
        this.f44058a1 = 0.5f;
        this.f44060c1 = -1.0f;
        this.f44063f1 = true;
        this.f44064g1 = 4;
        this.f44065h1 = 4;
        this.f44070m1 = 0.1f;
        this.f44081t1 = new ArrayList<>();
        this.f44088x1 = -1;
        this.A1 = new SparseIntArray();
        this.B1 = new c();
        this.f44087x0 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i11 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.E0 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.T0 = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, C1).build();
        }
        ShapeAppearanceModel shapeAppearanceModel = this.T0;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.f44089y0 = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.E0;
            if (colorStateList != null) {
                this.f44089y0.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f44089y0.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(b(), 1.0f);
        this.W0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.W0.addUpdateListener(new de.a(this));
        this.f44060c1 = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i10);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i15 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.J0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.K0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.L0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.M0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.N0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.O0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f44078s0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f6);

        public abstract void onStateChanged(@NonNull View view, int i10);

        public void a(@NonNull View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }
}
