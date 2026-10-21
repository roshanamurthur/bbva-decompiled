package com.bbva.cells.component.kit.ui.animation;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatorBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f26694a = ValueAnimator.ofFloat(0.0f, 1.0f);

    public static AnimatorBuilder build() {
        return new AnimatorBuilder();
    }

    @Deprecated
    public AnimatorBuilder UpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f26694a.addUpdateListener(animatorUpdateListener);
        return this;
    }

    public ValueAnimator create() {
        return this.f26694a;
    }

    public AnimatorBuilder delay(long j10) {
        this.f26694a.setStartDelay(j10);
        return this;
    }

    public AnimatorBuilder duration(long j10) {
        this.f26694a.setDuration(j10);
        return this;
    }

    public AnimatorBuilder interpolator(TimeInterpolator timeInterpolator) {
        this.f26694a.setInterpolator(timeInterpolator);
        return this;
    }

    public AnimatorBuilder onEnd(AnimationSingleListener.AnimationExecution animationExecution) {
        this.f26694a.addListener(new AnimationSingleListener(AnimationSingleListener.Type.END, animationExecution));
        return this;
    }

    public AnimatorBuilder onStart(AnimationSingleListener.AnimationExecution animationExecution) {
        this.f26694a.addListener(new AnimationSingleListener(AnimationSingleListener.Type.START, animationExecution));
        return this;
    }

    public AnimatorBuilder updateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f26694a.addUpdateListener(animatorUpdateListener);
        return this;
    }
}
