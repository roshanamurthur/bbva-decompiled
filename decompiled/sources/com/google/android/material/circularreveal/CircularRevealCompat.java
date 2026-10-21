package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CircularRevealCompat {

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CircularRevealWidget f44294a;

        public a(CircularRevealWidget circularRevealWidget) {
            this.f44294a = circularRevealWidget;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44294a.destroyCircularRevealCache();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f44294a.buildCircularRevealCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Animator createCircularReveal(@NonNull CircularRevealWidget circularRevealWidget, float f6, float f10, float f11) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(circularRevealWidget, (Property<CircularRevealWidget, V>) CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, (TypeEvaluator) CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, (Object[]) new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f6, f10, f11)});
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f6, (int) f10, revealInfo.radius, f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @NonNull
    public static Animator.AnimatorListener createCircularRevealListener(@NonNull CircularRevealWidget circularRevealWidget) {
        return new a(circularRevealWidget);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Animator createCircularReveal(CircularRevealWidget circularRevealWidget, float f6, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(circularRevealWidget, (Property<CircularRevealWidget, V>) CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, (TypeEvaluator) CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, (Object[]) new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f6, f10, f11), new CircularRevealWidget.RevealInfo(f6, f10, f12)});
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f6, (int) f10, f11, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
