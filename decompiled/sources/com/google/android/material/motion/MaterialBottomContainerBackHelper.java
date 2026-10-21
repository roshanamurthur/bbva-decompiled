package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44947d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            MaterialBottomContainerBackHelper materialBottomContainerBackHelper = MaterialBottomContainerBackHelper.this;
            materialBottomContainerBackHelper.view.setTranslationY(0.0f);
            materialBottomContainerBackHelper.updateBackProgress(0.0f);
        }
    }

    public MaterialBottomContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f44946c = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f44947d = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSetA = a();
        animatorSetA.setDuration(this.cancelDuration);
        animatorSetA.start();
    }

    public void finishBackProgressNotPersistent(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, this.view.getScaleY() * this.view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(@NonNull BackEventCompat backEventCompat, @Nullable Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSetA = a();
        animatorSetA.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        if (animatorListener != null) {
            animatorSetA.addListener(animatorListener);
        }
        animatorSetA.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress());
    }

    @VisibleForTesting
    public void updateBackProgress(float f6) {
        float fInterpolateProgress = interpolateProgress(f6);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f10 = this.f44946c / width;
        float f11 = this.f44947d / height;
        float fLerp = 1.0f - AnimationUtils.lerp(0.0f, f10, fInterpolateProgress);
        float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f11, fInterpolateProgress);
        this.view.setScaleX(fLerp);
        this.view.setPivotY(height);
        this.view.setScaleY(fLerp2);
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }
}
