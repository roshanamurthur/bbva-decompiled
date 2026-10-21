package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zd.d;
import zd.e;
import zd.h;

/* JADX INFO: loaded from: classes10.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final int T0 = R.style.Widget_Design_AppBarLayout;
    public boolean E0;
    public boolean F0;

    @IdRes
    public int G0;

    @Nullable
    public WeakReference<View> H0;
    public final boolean I0;

    @Nullable
    public ValueAnimator J0;

    @Nullable
    public final ValueAnimator.AnimatorUpdateListener K0;
    public final ArrayList L0;
    public final long M0;
    public final TimeInterpolator N0;
    public int[] O0;

    @Nullable
    public Drawable P0;

    @Nullable
    public Integer Q0;
    public final float R0;
    public Behavior S0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f43911p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f43912q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f43913r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f43914s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f43915t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f43916u0;

    @Nullable
    public WindowInsetsCompat v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f43917w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f43918x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f43919y0;

    public static class BaseBehavior<T extends AppBarLayout> extends d<T> {
        public int E0;
        public int F0;
        public ValueAnimator G0;
        public SavedState H0;

        @Nullable
        public WeakReference<View> I0;
        public BaseDragCallback J0;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t10);
        }

        public BaseBehavior() {
        }

        public static View h(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        public static View j(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        public static void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View childAt;
            boolean zD;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int scrollFlags = ((LayoutParams) childAt.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    if (i11 <= 0 || (scrollFlags & 12) == 0 ? (scrollFlags & 2) == 0 || (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
            if (appBarLayout.isLiftOnScroll()) {
                zD = appBarLayout.d(j(coordinatorLayout));
            }
            boolean zC = appBarLayout.c(zD, !appBarLayout.f43918x0);
            if (!z10) {
                if (zC) {
                    List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                    int size = dependents.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i13).getLayoutParams()).getBehavior();
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).getOverlayTop() == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // zd.f
        public final int a() {
            return getTopAndBottomOffset() + this.E0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.d
        public final boolean b(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            BaseDragCallback baseDragCallback = this.J0;
            if (baseDragCallback != 0) {
                return baseDragCallback.canDrag(appBarLayout);
            }
            WeakReference<View> weakReference = this.I0;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // zd.d
        public final int c(@NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // zd.d
        public final int d(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // zd.d
        public final void e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            l(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.c(appBarLayout.d(j(coordinatorLayout)), !appBarLayout.f43918x0);
            }
        }

        @Override // zd.d
        public final int f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iA = a();
            int i13 = 0;
            if (i11 == 0 || iA < i11 || iA > i12) {
                this.E0 = 0;
            } else {
                int iClamp = MathUtils.clamp(i10, i11, i12);
                if (iA != iClamp) {
                    if (!appBarLayout.f43915t0) {
                        top = iClamp;
                        break;
                    }
                    int iAbs = Math.abs(iClamp);
                    int childCount = appBarLayout.getChildCount();
                    int i14 = 0;
                    while (true) {
                        if (i14 < childCount) {
                            View childAt = appBarLayout.getChildAt(i14);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i14++;
                            } else if (scrollInterpolator != null) {
                                int scrollFlags = layoutParams.getScrollFlags();
                                if ((scrollFlags & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((scrollFlags & 2) != 0) {
                                        topInset -= ViewCompat.getMinimumHeight(childAt);
                                    }
                                } else {
                                    topInset = 0;
                                }
                                if (ViewCompat.getFitsSystemWindows(childAt)) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f6 = topInset;
                                    top = (childAt.getTop() + Math.round(scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f6) * f6)) * Integer.signum(iClamp);
                                    break;
                                }
                            }
                        }
                        top = iClamp;
                        break;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(top);
                    int i15 = iA - iClamp;
                    this.E0 = iClamp - top;
                    if (topAndBottomOffset) {
                        for (int i16 = 0; i16 < appBarLayout.getChildCount(); i16++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i16).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams2.getScrollEffect();
                            if (scrollEffect != null && (layoutParams2.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(appBarLayout, appBarLayout.getChildAt(i16), getTopAndBottomOffset());
                            }
                        }
                    }
                    if (!topAndBottomOffset && appBarLayout.f43915t0) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.b(getTopAndBottomOffset());
                    m(coordinatorLayout, appBarLayout, iClamp, iClamp < iA ? -1 : 1, false);
                    i13 = i15;
                }
            }
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            }
            return i13;
        }

        public final void i(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(a() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iA = a();
            if (iA == i10) {
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.G0.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.G0;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.G0 = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.G0.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.G0.setDuration(Math.min(iRound, 600));
            this.G0.setIntValues(iA, i10);
            this.G0.start();
        }

        @Nullable
        public final SavedState k(@Nullable Parcelable parcelable, @NonNull T t10) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = topAndBottomOffset == 0;
                    savedState.f43921r0 = z10;
                    savedState.f43920q0 = !z10 && (-topAndBottomOffset) >= t10.getTotalScrollRange();
                    savedState.f43922s0 = i10;
                    savedState.f43924u0 = bottom == t10.getTopInset() + ViewCompat.getMinimumHeight(childAt);
                    savedState.f43923t0 = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void l(CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int iA = a() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.getScrollFlags() & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i11 = -iA;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int scrollFlags = layoutParams2.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0 && ViewCompat.getFitsSystemWindows(t10) && ViewCompat.getFitsSystemWindows(childAt2)) {
                        topInset -= t10.getTopInset();
                    }
                    if ((scrollFlags & 2) == 2) {
                        minimumHeight += ViewCompat.getMinimumHeight(childAt2);
                    } else if ((scrollFlags & 5) == 5) {
                        int minimumHeight2 = ViewCompat.getMinimumHeight(childAt2) + minimumHeight;
                        if (iA < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((scrollFlags & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iA < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    i(coordinatorLayout, t10, MathUtils.clamp(topInset + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.J0 = baseDragCallback;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // zd.f, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10) {
            int iRound;
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.H0;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            i(coordinatorLayout, t10, i11);
                        } else {
                            g(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            i(coordinatorLayout, t10, 0);
                        } else {
                            g(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f43920q0) {
                g(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f43921r0) {
                g(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f43922s0);
                int i12 = -childAt.getBottom();
                if (this.H0.f43924u0) {
                    iRound = t10.getTopInset() + ViewCompat.getMinimumHeight(childAt) + i12;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.H0.f43923t0) + i12;
                }
                g(coordinatorLayout, t10, iRound);
            }
            t10.f43916u0 = 0;
            this.H0 = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t10.getTotalScrollRange(), 0));
            m(coordinatorLayout, t10, getTopAndBottomOffset(), 0, true);
            t10.b(getTopAndBottomOffset());
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new b(coordinatorLayout, this, t10));
            }
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t10.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.onMeasureChild(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int downNestedPreScrollRange;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    downNestedPreScrollRange = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    iArr[1] = f(coordinatorLayout, t10, a() - i11, i14, i15);
                }
            }
            if (t10.isLiftOnScroll()) {
                t10.c(t10.d(view), !t10.f43918x0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = f(coordinatorLayout, t10, a() - i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 != 0 || ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, new b(coordinatorLayout, this, t10));
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(coordinatorLayout, t10, parcelable);
                this.H0 = null;
            } else {
                SavedState savedState = (SavedState) parcelable;
                this.H0 = savedState;
                super.onRestoreInstanceState(coordinatorLayout, t10, savedState.getSuperState());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t10);
            SavedState savedStateK = k(parcelableOnSaveInstanceState, t10);
            return savedStateK == null ? parcelableOnSaveInstanceState : savedStateK;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.isLiftOnScroll() || (t10.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight()));
            if (z10 && (valueAnimator = this.G0) != null) {
                valueAnimator.cancel();
            }
            this.I0 = null;
            this.F0 = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10) {
            if (this.F0 == 0 || i10 == 1) {
                l(coordinatorLayout, t10);
                if (t10.isLiftOnScroll()) {
                    t10.c(t10.d(view), !t10.f43918x0);
                }
            }
            this.I0 = new WeakReference<>(view);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public boolean f43920q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public boolean f43921r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f43922s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public float f43923t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public boolean f43924u0;

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
                this.f43920q0 = parcel.readByte() != 0;
                this.f43921r0 = parcel.readByte() != 0;
                this.f43922s0 = parcel.readInt();
                this.f43923t0 = parcel.readFloat();
                this.f43924u0 = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f43920q0 ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f43921r0 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f43922s0);
                parcel.writeFloat(this.f43923t0);
                parcel.writeByte(this.f43924u0 ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t10, int i10);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // zd.d, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // zd.d, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f6);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f43925a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f43926b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f6) {
            Rect rect = this.f43925a;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
            float fAbs = rect.top - Math.abs(f6);
            if (fAbs > 0.0f) {
                ViewCompat.setClipBounds(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fClamp = 1.0f - MathUtils.clamp(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fClamp * fClamp)));
            view.setTranslationY(fHeight);
            Rect rect2 = this.f43926b;
            view.getDrawingRect(rect2);
            rect2.offset(0, (int) (-fHeight));
            if (fHeight >= rect2.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            ViewCompat.setClipBounds(view, rect2);
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f6, @ColorInt int i10);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i10);
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        @Override // zd.e
        @Nullable
        public final AppBarLayout b(@NonNull List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // zd.e
        public final float c(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                int iA = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).a() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iA > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iA / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // zd.e
        public final int d(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            int iClamp;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).E0 + this.f95048u0;
                if (this.v0 == 0) {
                    iClamp = 0;
                } else {
                    float fC = c(view2);
                    int i10 = this.v0;
                    iClamp = MathUtils.clamp((int) (fC * i10), 0, i10);
                }
                ViewCompat.offsetTopAndBottom(view, bottom - iClamp);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.c(appBarLayout.d(view), !appBarLayout.f43918x0);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // zd.f, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.onLayoutChild(coordinatorLayout, view, i10);
        }

        @Override // zd.e, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f95046s0;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // zd.f
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(appBarLayout) ? windowInsetsCompat : null;
            if (!ObjectsCompat.equals(appBarLayout.v0, windowInsetsCompat2)) {
                appBarLayout.v0 = windowInsetsCompat2;
                appBarLayout.setWillNotDraw(!(appBarLayout.P0 != null && appBarLayout.getTopInset() > 0));
                appBarLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        Behavior behavior = this.S0;
        BaseBehavior.SavedState savedStateK = (behavior == null || this.f43912q0 == -1 || this.f43916u0 != 0) ? null : behavior.k(AbsSavedState.EMPTY_STATE, this);
        this.f43912q0 = -1;
        this.f43913r0 = -1;
        this.f43914s0 = -1;
        if (savedStateK != null) {
            Behavior behavior2 = this.S0;
            if (behavior2.H0 != null) {
                return;
            }
            behavior2.H0 = savedStateK;
        }
    }

    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.L0.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.f43917w0 == null) {
            this.f43917w0 = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.f43917w0.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.f43917w0.add(baseOnOffsetChangedListener);
    }

    public final void b(int i10) {
        this.f43911p0 = i10;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        ArrayList arrayList = this.f43917w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.f43917w0.get(i11);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i10);
                }
            }
        }
    }

    public final boolean c(boolean z10, boolean z11) {
        if (!z11 || this.E0 == z10) {
            return false;
        }
        this.E0 = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        if (this.I0) {
            e(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.F0) {
            return true;
        }
        float f6 = this.R0;
        e(z10 ? 0.0f : f6, z10 ? f6 : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.L0.clear();
    }

    public final boolean d(@Nullable View view) {
        int i10;
        if (this.H0 == null && (i10 = this.G0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.G0);
            }
            if (viewFindViewById != null) {
                this.H0 = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.H0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.P0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f43911p0);
        this.P0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(float f6, float f10) {
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, f10);
        this.J0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.M0);
        this.J0.setInterpolator(this.N0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.K0;
        if (animatorUpdateListener != null) {
            this.J0.addUpdateListener(animatorUpdateListener);
        }
        this.J0.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.S0 = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f43913r0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f43927a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f43913r0 = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f43914s0;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i12 = layoutParams.f43927a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f43914s0 = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.G0;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f43916u0;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.P0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.v0;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f43912q0;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f43927a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i11 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    minimumHeight -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f43912q0 = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean isLiftOnScroll() {
        return this.F0;
    }

    public boolean isLifted() {
        return this.E0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.O0 == null) {
            this.O0 = new int[4];
        }
        int[] iArr = this.O0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f43919y0;
        int i11 = R.attr.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.E0) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i12 = R.attr.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.E0) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.H0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = false;
        if (ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
                }
            }
        }
        a();
        this.f43915t0 = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((LayoutParams) getChildAt(i14).getLayoutParams()).getScrollInterpolator() != null) {
                this.f43915t0 = true;
                break;
            }
        }
        Drawable drawable = this.P0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f43918x0) {
            return;
        }
        if (this.F0) {
            z11 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i15 = 0; i15 < childCount3; i15++) {
            int i16 = ((LayoutParams) getChildAt(i15).getLayoutParams()).f43927a;
            if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                z11 = true;
                break;
            }
        }
        if (this.f43919y0 != z11) {
            this.f43919y0 = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = MathUtils.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        a();
    }

    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.L0.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        ArrayList arrayList = this.f43917w0;
        if (arrayList == null || baseOnOffsetChangedListener == null) {
            return;
        }
        arrayList.remove(baseOnOffsetChangedListener);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    public void setExpanded(boolean z10) {
        setExpanded(z10, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.F0 = z10;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.G0 = -1;
        if (view != null) {
            this.H0 = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.H0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H0 = null;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i10) {
        this.G0 = i10;
        WeakReference<View> weakReference = this.H0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H0 = null;
    }

    public boolean setLiftable(boolean z10) {
        this.f43918x0 = true;
        if (this.f43919y0 == z10) {
            return false;
        }
        this.f43919y0 = z10;
        refreshDrawableState();
        return true;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f43918x0 = z10;
    }

    public boolean setLifted(boolean z10) {
        return c(z10, true);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.P0;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.P0 = drawableMutate;
            if (drawableMutate instanceof MaterialShapeDrawable) {
                numValueOf = Integer.valueOf(((MaterialShapeDrawable) drawableMutate).getResolvedTintColor());
            } else {
                ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawableMutate);
                if (colorStateListOrNull != null) {
                    numValueOf = Integer.valueOf(colorStateListOrNull.getDefaultColor());
                }
            }
            this.Q0 = numValueOf;
            Drawable drawable3 = this.P0;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.P0.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.P0, ViewCompat.getLayoutDirection(this));
                this.P0.setVisible(getVisibility() == 0, false);
                this.P0.setCallback(this);
            }
            if (this.P0 != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i10) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f6) {
        h.a(f6, this);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.P0;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P0;
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ChildScrollEffect f43928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f43929c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f43927a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.f43927a = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i10 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f43929c = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.f43928b;
        }

        public int getScrollFlags() {
            return this.f43927a;
        }

        public Interpolator getScrollInterpolator() {
            return this.f43929c;
        }

        public void setScrollEffect(int i10) {
            this.f43928b = i10 != 1 ? null : new CompressChildScrollEffect();
        }

        public void setScrollFlags(int i10) {
            this.f43927a = i10;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.f43929c = interpolator;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.f43928b = childScrollEffect;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f43927a = 1;
        }

        public LayoutParams(int i10, int i11, float f6) {
            super(i10, i11, f6);
            this.f43927a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f43927a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f43927a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f43927a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f43927a = 1;
            this.f43927a = layoutParams.f43927a;
            this.f43928b = layoutParams.f43928b;
            this.f43929c = layoutParams.f43929c;
        }
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z10, boolean z11) {
        this.f43916u0 = (z10 ? 1 : 2) | (z11 ? 4 : 0) | 8;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = T0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f43912q0 = -1;
        this.f43913r0 = -1;
        this.f43914s0 = -1;
        this.f43916u0 = 0;
        this.L0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context3, attributeSet, h.f95059a, i10, i11, new int[0]);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.AppBarLayout, i10, i11, new int[0]);
            ViewCompat.setBackground(this, typedArrayObtainStyledAttributes2.getDrawable(R.styleable.AppBarLayout_android_background));
            final ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, R.styleable.AppBarLayout_liftOnScrollColor);
            this.I0 = colorStateList != null;
            final ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
            if (colorStateListOrNull != null) {
                final MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.setFillColor(colorStateListOrNull);
                if (colorStateList != null) {
                    final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
                    this.K0 = new ValueAnimator.AnimatorUpdateListener() { // from class: zd.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            int i13 = AppBarLayout.T0;
                            AppBarLayout appBarLayout = this.f95029a;
                            appBarLayout.getClass();
                            int iLayer = MaterialColors.layer(colorStateListOrNull.getDefaultColor(), colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iLayer);
                            MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                            materialShapeDrawable2.setFillColor(colorStateListValueOf);
                            if (appBarLayout.P0 != null && (num = appBarLayout.Q0) != null && num.equals(colorOrNull)) {
                                DrawableCompat.setTint(appBarLayout.P0, iLayer);
                            }
                            ArrayList<AppBarLayout.LiftOnScrollListener> arrayList = appBarLayout.L0;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            for (AppBarLayout.LiftOnScrollListener liftOnScrollListener : arrayList) {
                                if (materialShapeDrawable2.getFillColor() != null) {
                                    liftOnScrollListener.onUpdate(0.0f, iLayer);
                                }
                            }
                        }
                    };
                    ViewCompat.setBackground(this, materialShapeDrawable);
                } else {
                    materialShapeDrawable.initializeElevationOverlay(context2);
                    this.K0 = new ValueAnimator.AnimatorUpdateListener() { // from class: zd.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i13 = AppBarLayout.T0;
                            AppBarLayout appBarLayout = this.f95034a;
                            appBarLayout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                            materialShapeDrawable2.setElevation(fFloatValue);
                            Drawable drawable = appBarLayout.P0;
                            if (drawable instanceof MaterialShapeDrawable) {
                                ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
                            }
                            Iterator it = appBarLayout.L0.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.LiftOnScrollListener) it.next()).onUpdate(fFloatValue, materialShapeDrawable2.getResolvedTintColor());
                            }
                        }
                    };
                    ViewCompat.setBackground(this, materialShapeDrawable);
                }
            }
            this.M0 = MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.N0 = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
            int i13 = R.styleable.AppBarLayout_expanded;
            if (typedArrayObtainStyledAttributes2.hasValue(i13)) {
                this.f43916u0 = typedArrayObtainStyledAttributes2.getBoolean(i13, false) ? 1 : 2;
                requestLayout();
            }
            int i14 = R.styleable.AppBarLayout_elevation;
            if (typedArrayObtainStyledAttributes2.hasValue(i14)) {
                h.a(typedArrayObtainStyledAttributes2.getDimensionPixelSize(i14, 0), this);
            }
            if (i12 >= 26) {
                int i15 = R.styleable.AppBarLayout_android_keyboardNavigationCluster;
                if (typedArrayObtainStyledAttributes2.hasValue(i15)) {
                    setKeyboardNavigationCluster(typedArrayObtainStyledAttributes2.getBoolean(i15, false));
                }
                int i16 = R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
                if (typedArrayObtainStyledAttributes2.hasValue(i16)) {
                    setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes2.getBoolean(i16, false));
                }
            }
            this.R0 = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.F0 = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
            this.G0 = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayObtainStyledAttributes2.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
            typedArrayObtainStyledAttributes2.recycle();
            ViewCompat.setOnApplyWindowInsetsListener(this, new a());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
