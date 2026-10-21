package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OnScrollStateChangedListener> f43990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f43991q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f43992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TimeInterpolator f43993s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TimeInterpolator f43994t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f43995u0;

    @ScrollState
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f43996w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f43997x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f43989y0 = R.attr.motionDurationLong2;
    public static final int E0 = R.attr.motionDurationMedium4;
    public static final int F0 = R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, @ScrollState int i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f43990p0 = new LinkedHashSet<>();
        this.f43995u0 = 0;
        this.v0 = 2;
        this.f43996w0 = 0;
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f43990p0.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f43990p0.clear();
    }

    public boolean isScrolledDown() {
        return this.v0 == 1;
    }

    public boolean isScrolledUp() {
        return this.v0 == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        this.f43995u0 = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        this.f43991q0 = MotionUtils.resolveThemeDuration(v3.getContext(), f43989y0, 225);
        this.f43992r0 = MotionUtils.resolveThemeDuration(v3.getContext(), E0, 175);
        Context context = v3.getContext();
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        int i11 = F0;
        this.f43993s0 = MotionUtils.resolveThemeInterpolator(context, i11, timeInterpolator);
        this.f43994t0 = MotionUtils.resolveThemeInterpolator(v3.getContext(), i11, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v3, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            slideDown(v3);
        } else if (i11 < 0) {
            slideUp(v3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f43990p0.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v3, @Dimension int i10) {
        this.f43996w0 = i10;
        if (this.v0 == 1) {
            v3.setTranslationY(this.f43995u0 + i10);
        }
    }

    public void slideDown(@NonNull V v3) {
        slideDown(v3, true);
    }

    public void slideUp(@NonNull V v3) {
        slideUp(v3, true);
    }

    public void slideDown(@NonNull V v3, boolean z10) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f43997x0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.v0 = 1;
        Iterator<OnScrollStateChangedListener> it = this.f43990p0.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v3, this.v0);
        }
        int i10 = this.f43995u0 + this.f43996w0;
        if (!z10) {
            v3.setTranslationY(i10);
            return;
        }
        this.f43997x0 = v3.animate().translationY(i10).setInterpolator(this.f43994t0).setDuration(this.f43992r0).setListener(new be.a(this));
    }

    public void slideUp(@NonNull V v3, boolean z10) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f43997x0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.v0 = 2;
        Iterator<OnScrollStateChangedListener> it = this.f43990p0.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v3, this.v0);
        }
        if (!z10) {
            v3.setTranslationY(0);
            return;
        }
        this.f43997x0 = v3.animate().translationY(0).setInterpolator(this.f43993s0).setDuration(this.f43991q0).setListener(new be.a(this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43990p0 = new LinkedHashSet<>();
        this.f43995u0 = 0;
        this.v0 = 2;
        this.f43996w0 = 0;
    }
}
