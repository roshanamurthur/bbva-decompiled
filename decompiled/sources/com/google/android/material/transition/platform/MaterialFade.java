package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import qe.n;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class MaterialFade extends n<FadeProvider> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @AttrRes
    public static final int f45972s0 = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @AttrRes
    public static final int f45973t0 = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @AttrRes
    public static final int f45974u0 = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    @AttrRes
    public static final int v0 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        super(fadeProvider, scaleProvider);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // qe.n
    @NonNull
    public final TimeInterpolator c() {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // qe.n
    @AttrRes
    public final int d(boolean z10) {
        return z10 ? f45972s0 : f45973t0;
    }

    @Override // qe.n
    @AttrRes
    public final int e(boolean z10) {
        return z10 ? f45974u0 : v0;
    }

    @Override // qe.n
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // qe.n
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // qe.n, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // qe.n, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
