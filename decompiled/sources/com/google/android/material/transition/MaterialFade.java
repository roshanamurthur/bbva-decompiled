package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import pe.k;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialFade extends k<FadeProvider> {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @AttrRes
    public static final int f45896o1 = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @AttrRes
    public static final int f45897p1 = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @AttrRes
    public static final int f45898q1 = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    @AttrRes
    public static final int r1 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        super(fadeProvider, scaleProvider);
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // pe.k
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // pe.k
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // pe.k, androidx.transition.Transition
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // pe.k, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // pe.k, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // pe.k
    @NonNull
    public final TimeInterpolator u() {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // pe.k
    @AttrRes
    public final int v(boolean z10) {
        return z10 ? f45896o1 : f45897p1;
    }

    @Override // pe.k
    @AttrRes
    public final int w(boolean z10) {
        return z10 ? f45898q1 : r1;
    }
}
