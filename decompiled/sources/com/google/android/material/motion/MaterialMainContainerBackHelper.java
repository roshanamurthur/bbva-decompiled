package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.h0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Rect f44952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Rect f44953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Integer f44954h;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f44955a;

        public a(View view) {
            this.f44955a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f44955a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public MaterialMainContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f44949c = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f44950d = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    @NonNull
    public final AnimatorSet a(@Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    public void cancelBackProgress(@Nullable View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSetA = a(view);
        V v3 = this.view;
        if (v3 instanceof ClippableRoundedCornerLayout) {
            final ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) v3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), getExpandedCornerSize());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    clippableRoundedCornerLayout.updateCornerRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSetA.playTogether(valueAnimatorOfFloat);
        }
        animatorSetA.setDuration(this.cancelDuration);
        animatorSetA.start();
        this.f44951e = 0.0f;
        this.f44952f = null;
        this.f44953g = null;
    }

    public void finishBackProgress(long j10, @Nullable View view) {
        AnimatorSet animatorSetA = a(view);
        animatorSetA.setDuration(j10);
        animatorSetA.start();
        this.f44951e = 0.0f;
        this.f44952f = null;
        this.f44953g = null;
    }

    public int getExpandedCornerSize() {
        WindowInsets rootWindowInsets;
        if (this.f44954h == null) {
            int[] iArr = new int[2];
            this.view.getLocationOnScreen(iArr);
            int iMax = 0;
            if (iArr[1] == 0 && Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = this.view.getRootWindowInsets()) != null) {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                int iMax2 = Math.max(radius, roundedCorner2 != null ? roundedCorner2.getRadius() : 0);
                RoundedCorner roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
                int radius2 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
                RoundedCorner roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
                iMax = Math.max(iMax2, Math.max(radius2, roundedCorner4 != null ? roundedCorner4.getRadius() : 0));
            }
            this.f44954h = Integer.valueOf(iMax);
        }
        return this.f44954h.intValue();
    }

    @Nullable
    public Rect getInitialHideFromClipBounds() {
        return this.f44953g;
    }

    @Nullable
    public Rect getInitialHideToClipBounds() {
        return this.f44952f;
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view) {
        super.onStartBackProgress(backEventCompat);
        startBackProgress(backEventCompat.getTouchY(), view);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view, float f6) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f6);
    }

    @VisibleForTesting
    public void startBackProgress(float f6, @Nullable View view) {
        this.f44952f = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.f44953g = ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.f44951e = f6;
    }

    @VisibleForTesting
    public void updateBackProgress(float f6, boolean z10, float f10, float f11) {
        float fInterpolateProgress = interpolateProgress(f6);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = AnimationUtils.lerp(1.0f, 0.9f, fInterpolateProgress);
        float fA = h0.a(width, 0.9f, width, 2.0f);
        float f12 = this.f44949c;
        float fLerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, fA - f12), fInterpolateProgress) * (z10 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fLerp * height)) / 2.0f) - f12), this.f44950d);
        float f13 = f10 - this.f44951e;
        float fLerp3 = AnimationUtils.lerp(0.0f, fMin, Math.abs(f13) / height) * Math.signum(f13);
        this.view.setScaleX(fLerp);
        this.view.setScaleY(fLerp);
        this.view.setTranslationX(fLerp2);
        this.view.setTranslationY(fLerp3);
        V v3 = this.view;
        if (v3 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v3).updateCornerRadius(AnimationUtils.lerp(getExpandedCornerSize(), f11, fInterpolateProgress));
        }
    }
}
