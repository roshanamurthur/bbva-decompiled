package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44958e;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f44959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44960b;

        public a(boolean z10, int i10) {
            this.f44959a = z10;
            this.f44960b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            MaterialSideContainerBackHelper materialSideContainerBackHelper = MaterialSideContainerBackHelper.this;
            materialSideContainerBackHelper.view.setTranslationX(0.0f);
            materialSideContainerBackHelper.updateBackProgress(0.0f, this.f44959a, this.f44960b);
        }
    }

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f44956c = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f44957d = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f44958e = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i10, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11;
        boolean z10 = backEventCompat.getSwipeEdge() == 0;
        boolean z11 = (GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this.view)) & 3) == 3;
        float scaleX = this.view.getScaleX() * this.view.getWidth();
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        float f6 = scaleX + i11;
        V v3 = this.view;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z11) {
            f6 = -f6;
        }
        fArr[0] = f6;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v3, (Property<V, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i10) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }

    @VisibleForTesting
    public void updateBackProgress(float f6, boolean z10, @GravityInt int i10) {
        float fInterpolateProgress = interpolateProgress(f6);
        boolean z11 = (GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this.view)) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f10 = width;
        if (f10 > 0.0f) {
            float f11 = height;
            if (f11 <= 0.0f) {
                return;
            }
            float f12 = this.f44956c / f10;
            float f13 = this.f44957d / f10;
            float f14 = this.f44958e / f11;
            V v3 = this.view;
            if (z11) {
                f10 = 0.0f;
            }
            v3.setPivotX(f10);
            if (!z12) {
                f13 = -f12;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f13, fInterpolateProgress);
            float f15 = fLerp + 1.0f;
            this.view.setScaleX(f15);
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f14, fInterpolateProgress);
            this.view.setScaleY(fLerp2);
            V v6 = this.view;
            if (v6 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v6;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f16 = z12 ? 1.0f - fLerp : 1.0f;
                    float f17 = fLerp2 != 0.0f ? (f15 / fLerp2) * f16 : 1.0f;
                    childAt.setScaleX(f16);
                    childAt.setScaleY(f17);
                }
            }
        }
    }
}
