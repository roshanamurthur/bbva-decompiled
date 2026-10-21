package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: compiled from: SearchViewAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchView f45187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f45188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f45189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f45190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f45191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f45192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Toolbar f45193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f45194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EditText f45195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageButton f45196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f45197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TouchObserverFrameLayout f45198l;
    public final MaterialMainContainerBackHelper m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public AnimatorSet f45199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchBar f45200o;

    /* JADX INFO: compiled from: SearchViewAnimationHelper.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f45201a;

        public a(boolean z10) {
            this.f45201a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f6 = this.f45201a ? 1.0f : 0.0f;
            w wVar = w.this;
            w.a(wVar, f6);
            wVar.f45189c.resetClipBoundsAndCornerRadius();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            w.a(w.this, this.f45201a ? 0.0f : 1.0f);
        }
    }

    public w(SearchView searchView) {
        this.f45187a = searchView;
        this.f45188b = searchView.f45134p0;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f45135q0;
        this.f45189c = clippableRoundedCornerLayout;
        this.f45190d = searchView.f45138t0;
        this.f45191e = searchView.f45139u0;
        this.f45192f = searchView.v0;
        this.f45193g = searchView.f45140w0;
        this.f45194h = searchView.f45141x0;
        this.f45195i = searchView.f45142y0;
        this.f45196j = searchView.E0;
        this.f45197k = searchView.F0;
        this.f45198l = searchView.G0;
        this.m = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    public static void a(w wVar, float f6) {
        ActionMenuView actionMenuView;
        wVar.f45196j.setAlpha(f6);
        wVar.f45197k.setAlpha(f6);
        wVar.f45198l.setAlpha(f6);
        if (!wVar.f45187a.isMenuItemsAnimated() || (actionMenuView = ToolbarUtils.getActionMenuView(wVar.f45192f)) == null) {
            return;
        }
        actionMenuView.setAlpha(f6);
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f45192f);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (!this.f45187a.isAnimatedNavigationIcon()) {
            if (drawableUnwrap instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) drawableUnwrap).setProgress(1.0f);
            }
            if (drawableUnwrap instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) drawableUnwrap).setProgress(1.0f);
                return;
            }
            return;
        }
        if (drawableUnwrap instanceof DrawerArrowDrawable) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new com.bbva.qr.scanner.views.a((DrawerArrowDrawable) drawableUnwrap, 2));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableUnwrap instanceof FadeThroughDrawable) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new q((FadeThroughDrawable) drawableUnwrap, 0));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public final AnimatorSet c(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f45192f;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(materialToolbar);
        if (navigationIconButton != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f(navigationIconButton), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(materialToolbar);
        if (actionMenuView != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(e(actionMenuView), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(g(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f45199n == null) {
            Animator[] animatorArr = new Animator[2];
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z10 ? 300L : 250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            animatorArr[0] = animatorSet2;
            animatorArr[1] = c(z10);
            animatorSet.playTogether(animatorArr);
        }
        Animator[] animatorArr2 = new Animator[9];
        TimeInterpolator timeInterpolator = z10 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f45188b));
        animatorArr2[0] = valueAnimatorOfFloat;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.m;
        Rect initialHideToClipBounds = materialMainContainerBackHelper.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = materialMainContainerBackHelper.getInitialHideFromClipBounds();
        SearchView searchView = this.f45187a;
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(searchView);
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f45189c;
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(clippableRoundedCornerLayout, this.f45200o);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.f45200o.getCornerSize();
        final float fMax = Math.max(clippableRoundedCornerLayout.getCornerRadius(), materialMainContainerBackHelper.getExpandedCornerSize());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w wVar = this.f45179a;
                wVar.getClass();
                wVar.f45189c.updateClipBoundsAndCornerRadius(rect, AnimationUtils.lerp(cornerSize, fMax, valueAnimator.getAnimatedFraction()));
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        TimeInterpolator timeInterpolator2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator2));
        animatorArr2[1] = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z10 ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z10 ? 250L : 0L);
        TimeInterpolator timeInterpolator3 = AnimationUtils.LINEAR_INTERPOLATOR;
        valueAnimatorOfFloat2.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator3));
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f45196j));
        animatorArr2[2] = valueAnimatorOfFloat2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] animatorArr3 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z10 ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator3));
        View view = this.f45197k;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f45198l;
        valueAnimatorOfFloat3.addUpdateListener(MultiViewUpdateListener.alphaListener(view, touchObserverFrameLayout));
        animatorArr3[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator2));
        valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        animatorArr3[1] = valueAnimatorOfFloat4;
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator2));
        valueAnimatorOfFloat5.addUpdateListener(MultiViewUpdateListener.scaleListener(touchObserverFrameLayout));
        animatorArr3[2] = valueAnimatorOfFloat5;
        animatorSet3.playTogether(animatorArr3);
        animatorArr2[3] = animatorSet3;
        animatorArr2[4] = i(this.f45190d, z10, false);
        Toolbar toolbar = this.f45193g;
        animatorArr2[5] = i(toolbar, z10, false);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator2));
        if (searchView.isMenuItemsAnimated()) {
            valueAnimatorOfFloat6.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(toolbar), ToolbarUtils.getActionMenuView(this.f45192f)));
        }
        animatorArr2[6] = valueAnimatorOfFloat6;
        animatorArr2[7] = i(this.f45195i, z10, true);
        animatorArr2[8] = i(this.f45194h, z10, true);
        animatorSet.playTogether(animatorArr2);
        animatorSet.addListener(new a(z10));
        return animatorSet;
    }

    public final int e(View view) {
        int marginEnd = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return ViewUtils.isLayoutRtl(this.f45200o) ? this.f45200o.getLeft() - marginEnd : (this.f45200o.getRight() - this.f45187a.getWidth()) + marginEnd;
    }

    public final int f(View view) {
        int marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int paddingStart = ViewCompat.getPaddingStart(this.f45200o);
        return ViewUtils.isLayoutRtl(this.f45200o) ? ((this.f45200o.getWidth() - this.f45200o.getRight()) + marginStart) - paddingStart : (this.f45200o.getLeft() - marginStart) + paddingStart;
    }

    public final int g() {
        FrameLayout frameLayout = this.f45191e;
        return ((this.f45200o.getBottom() + this.f45200o.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final AnimatorSet h(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f45189c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet i(View view, boolean z10, boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z11 ? f(view) : e(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    @CanIgnoreReturnValue
    public final AnimatorSet j() {
        SearchBar searchBar = this.f45200o;
        SearchView searchView = this.f45187a;
        if (searchBar != null) {
            if (searchView.b()) {
                searchView.clearFocusAndHideKeyboard();
            }
            AnimatorSet animatorSetD = d(false);
            animatorSetD.addListener(new t(this));
            animatorSetD.start();
            return animatorSetD;
        }
        if (searchView.b()) {
            searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetH = h(false);
        animatorSetH.addListener(new v(this));
        animatorSetH.start();
        return animatorSetH;
    }

    public final void k(SearchBar searchBar) {
        this.f45200o = searchBar;
    }
}
