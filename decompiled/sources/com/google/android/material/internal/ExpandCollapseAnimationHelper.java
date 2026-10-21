package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ExpandCollapseAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f44828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44829c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44830d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ValueAnimator.AnimatorUpdateListener f44831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44834h;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ExpandCollapseAnimationHelper.this.f44828b.setVisibility(0);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ExpandCollapseAnimationHelper.this.f44828b.setVisibility(8);
        }
    }

    public ExpandCollapseAnimationHelper(@NonNull View view, @NonNull View view2) {
        this.f44827a = view;
        this.f44828b = view2;
    }

    public final AnimatorSet a(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[3];
        int i10 = this.f44833g;
        View view = this.f44827a;
        Rect rectCalculateRectFromBounds = ViewUtils.calculateRectFromBounds(view, i10);
        int i11 = this.f44834h;
        View view2 = this.f44828b;
        Rect rectCalculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(view2, i11);
        final Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewUtils.setBoundsFromRect(this.f44906a.f44828b, rect);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f44831e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f44832f);
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator));
        animatorArr[0] = valueAnimatorOfObject;
        List<View> children = ViewUtils.getChildren(view2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.f44832f);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        animatorArr[1] = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((view.getRight() - view2.getRight()) + (view2.getLeft() - view.getLeft()), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationXListener(this.f44830d));
        valueAnimatorOfFloat2.setDuration(this.f44832f);
        valueAnimatorOfFloat2.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator));
        animatorArr[2] = valueAnimatorOfFloat2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull View... viewArr) {
        Collections.addAll(this.f44830d, viewArr);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f44829c.add(animatorListenerAdapter);
        return this;
    }

    @NonNull
    public Animator getCollapseAnimator() {
        AnimatorSet animatorSetA = a(false);
        animatorSetA.addListener(new b());
        Iterator it = this.f44829c.iterator();
        while (it.hasNext()) {
            animatorSetA.addListener((AnimatorListenerAdapter) it.next());
        }
        return animatorSetA;
    }

    @NonNull
    public Animator getExpandAnimator() {
        AnimatorSet animatorSetA = a(true);
        animatorSetA.addListener(new a());
        Iterator it = this.f44829c.iterator();
        while (it.hasNext()) {
            animatorSetA.addListener((AnimatorListenerAdapter) it.next());
        }
        return animatorSetA;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f44831e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i10) {
        this.f44833g = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j10) {
        this.f44832f = j10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i10) {
        this.f44834h = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull Collection<View> collection) {
        this.f44830d.addAll(collection);
        return this;
    }
}
