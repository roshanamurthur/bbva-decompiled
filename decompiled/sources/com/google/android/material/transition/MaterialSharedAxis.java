package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.view.GravityCompat;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import pe.k;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialSharedAxis extends k<VisibilityAnimatorProvider> {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @AttrRes
    public static final int f45901q1 = R.attr.motionDurationLong1;

    @AttrRes
    public static final int r1 = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final int f45902o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final boolean f45903p1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    public MaterialSharedAxis(int i10, boolean z10) {
        VisibilityAnimatorProvider slideDistanceProvider;
        if (i10 == 0) {
            slideDistanceProvider = new SlideDistanceProvider(z10 ? GravityCompat.END : GravityCompat.START);
        } else if (i10 == 1) {
            slideDistanceProvider = new SlideDistanceProvider(z10 ? 80 : 48);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(g0.c("Invalid axis: ", i10));
            }
            slideDistanceProvider = new ScaleProvider(z10);
        }
        super(slideDistanceProvider, new FadeThroughProvider());
        this.f45902o1 = i10;
        this.f45903p1 = z10;
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // pe.k
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.f45902o1;
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

    public boolean isForward() {
        return this.f45903p1;
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
    @AttrRes
    public final int v(boolean z10) {
        return f45901q1;
    }

    @Override // pe.k
    @AttrRes
    public final int w(boolean z10) {
        return r1;
    }
}
